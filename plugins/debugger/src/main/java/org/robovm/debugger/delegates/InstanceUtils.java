package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.ClassDataConsts;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoArrayImpl;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.state.classdata.ClassInfoLoader;
import org.robovm.debugger.state.classdata.ClassInfoPrimitiveImpl;
import org.robovm.debugger.state.classdata.FieldInfo;
import org.robovm.debugger.state.classdata.RuntimeClassInfoLoader;
import org.robovm.debugger.state.instances.VmArrayInstance;
import org.robovm.debugger.state.instances.VmClassInstance;
import org.robovm.debugger.state.instances.VmClassLoaderInstance;
import org.robovm.debugger.state.instances.VmInstance;
import org.robovm.debugger.state.instances.VmStringInstance;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.state.instances.VmThreadGroup;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyna Kimitsa
 * Utility class that allows access to instance fields and creates VM presentation of instance
 */
public class InstanceUtils {
    /**
     * all delegates and logic in one place
     */
    private final AllDelegates delegates;

    /**
     * maps class ref id to resolved instantiator
     */
    private Map<Long, Instantiator> instantiatorForClassRefId = new HashMap<>();


    /**
     * class info loader that resolves class info for classes created in runtime
     */
    private final RuntimeClassInfoLoader runtimeClassInfoLoader;


    public InstanceUtils(AllDelegates delegates) {
        this.delegates = delegates;
        this.runtimeClassInfoLoader = new RuntimeClassInfoLoader(delegates.state().classInfoLoader(),
                delegates.runtime().deviceMemoryReader());
    }

    public RuntimeClassInfoLoader classInfoLoader() {
        return runtimeClassInfoLoader;
    }

    /**
     * returns string value from VmStringInstance
     * reads from device if required or returns value previously read
     * @param stringInstance which keep object pointer
     * @return java string
     */
    private String readStringValue(VmStringInstance stringInstance) {
        if (stringInstance.value() != null)
            return stringInstance.value();

        // check rt.c # rvmRTGetStringChars
        long objectPtr = stringInstance.objectPtr();
        ClassInfo ci = stringInstance.classInfo();
        VmArrayInstance value = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_STRING_VALUE);
        int count = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_STRING_COUNT);
        int offset = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_STRING_OFFSET);

        // receive chars from array
        String str = delegates.arrays().readArrayString(value, offset, count);
        stringInstance.setValue(str);

        return str;
    }

    @SuppressWarnings("unchecked")
    private <T> T getFieldValue(long objectPtr, ClassInfo ci, String fieldName) {
        FieldInfo[] fields = ci.fields(runtimeClassInfoLoader.loader());
        FieldInfo fieldInfo = null;
        if (fields != null) {
            for (FieldInfo fi : fields) {
                if (fieldName.equals(fi.name())) {
                    fieldInfo = fi;
                    break;
                }
            }
        }

        if (fieldInfo == null)
            throw new DebuggerException("Field " + fieldName + " not found in " + ci.signature());

        String signature = fieldInfo.signature();
        // is resolved already ?
        ClassInfo fieldTypeInfo = fieldInfo.typeInfo();
        // check from known signatures
        if (fieldTypeInfo == null)
            fieldTypeInfo = runtimeClassInfoLoader.loader().classInfoBySignature(signature);
        // try to build signature
        if (fieldTypeInfo == null) {
            if (ClassInfoLoader.isArraySignature(signature)) {
                // read data from object itself, keep it null
            } else if (ClassInfoLoader.isPrimitiveSignature(signature)) {
                // primitive, type data is not loaded yet
                // get primitive clazz pointer from device memory (check class.c)
                long clazzPrt = delegates.state().appFileLoader().resolveSymbol("_prim_" + signature);
                delegates.runtime().deviceMemoryReader().setAddress(delegates.runtime().toRuntimeAddr(clazzPrt));;
                clazzPrt = delegates.runtime().deviceMemoryReader().readPointer();

                fieldTypeInfo = runtimeClassInfoLoader.resolveRuntimeDataTypeInfo(signature, clazzPrt);
            } else {
                throw new DebuggerException("Failed to resolve type info for field " + fieldName + " in " + ci.signature());
            }
        }

        // can read data now
        T result;
        delegates.runtime().deviceMemoryReader().setAddress(objectPtr + fieldInfo.offset());
        if (fieldTypeInfo != null && fieldTypeInfo.isPrimitive()) {
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) fieldTypeInfo;
            result = (T) primitiveInfo.manipulator().readFromDevice(delegates.runtime().deviceMemoryReader());
        } else {
            long fieldObjectPtr = delegates.runtime().deviceMemoryReader().readPointer();
            result = (T)instanceByPointer(fieldObjectPtr, null, true);
        }

        return result;
    }

    /**
     * Returns existing instance, throws exception if not found
     * @param objectPtr from target
     * @param <T> type to cast to
     * @throws ClassCastException when casting to T fails
     * @return casted value from holder
     */
    public <T extends VmInstance> T existingInstanceByPointer(long objectPtr) throws ClassCastException {
        VmInstance instance = delegates.state().referenceRefIdHolder().instanceByAddr(objectPtr);
        if (instance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);
        //noinspection unchecked
        return (T) instance;
    }

    /**
     * returns instance by pointer by looking into reference id map first and allocates if required
     * @param objectPtr from target
     * @param allocate to create an VM instance from pointer
     * @param <T> type to case result to
     * @return created object or null
     * @throws ClassCastException if result cast to <T> fails
     */
    @SuppressWarnings("unchecked")
    public <T extends VmInstance> T instanceByPointer(long objectPtr, Object param, boolean allocate) throws ClassCastException {
        // get it from map first
        VmInstance instance = delegates.state().referenceRefIdHolder().instanceByAddr(objectPtr);
        if (instance == null && allocate) {
            // trying to allocate one
            ClassInfo ci = runtimeClassInfoLoader.resolveObjectRuntimeDataTypeInfo(objectPtr);
            if (ci == null)
                throw new DebuggerException("Cannot resolve type for instance " + Long.toHexString(objectPtr));

            if (ci.isPrimitive()) {
                // shall not happen
                throw new DebuggerException("Invalid case: object can't be primitive type " + Long.toHexString(objectPtr));
            } else if (ci.isArray()) {
                // create an array instance
                instance = delegates.arrays().createArrayInstance(objectPtr, (ClassInfoArrayImpl) ci);
            } else {
                // depending on class type create corresponding instance
                Instantiator instantiator = instantiatorForClass((ClassInfoImpl) ci);
                instance = instantiator.instance(ci, objectPtr, param);
            }
        }

        return (T) instance;
    }

    private Instantiator instantiatorForClass(ClassInfoImpl ci) {
        Instantiator res = instantiatorForClassRefId.get(ci.refId());
        if (res != null)
            return res;

        switch (ci.signature()) {
            case ClassDataConsts.signatures.JAVA_LANG_STRING:
                res = this::createStringInstance;
                break;

            case ClassDataConsts.signatures.JAVA_LANG_THREAD:
                res = this::createThreadInstance;
                break;

            case ClassDataConsts.signatures.JAVA_LANG_THREADGROUP:
                res = this::createThreadGroupInstance;
                break;

            case ClassDataConsts.signatures.JAVA_LANG_CLASS_LOADER:
                res = this::createClassLoaderInstance;
                break;

            case ClassDataConsts.signatures.JAVA_LANG_CLASS:
                res = this::createClassInstance;
                break;
        }

        if (res == null) {
            // try finding by supers
            String superclassSignature = ci.superclassSignature();
            if (superclassSignature != null) {
                ClassInfoImpl superclass = (ClassInfoImpl) runtimeClassInfoLoader.loader().classInfoBySignature(superclassSignature);
                if (superclass != null)
                    res = instantiatorForClass(superclass);
                else
                    res = this::createGenericInstance;
            }
        }

        // if there is an res -- save it
        if (res != null) {
            instantiatorForClassRefId.put(ci.refId(), res);
        }

        return res;
    }

    private VmStringInstance createStringInstance(ClassInfo ci, long objectPtr, Object readValue) {
        VmStringInstance stringInstance = new VmStringInstance(objectPtr, ci);
        // read string value if required
        if (readValue != null && (Boolean)readValue) {
            readStringValue(stringInstance);
        }

        return stringInstance;
    }

    private VmThread createThreadInstance(ClassInfo ci, long objectPtr, Object threadPtr) {
        VmStringInstance nameInstance = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_THREAD_NAME);
        String name = readStringValue(nameInstance);
        VmThreadGroup threadGroup = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_THREAD_GROUP);

        return new VmThread(objectPtr, (Long)threadPtr, ci, name, threadGroup);
    }

    private VmThreadGroup createThreadGroupInstance(ClassInfo ci, long objectPtr, Object unused) {
        VmStringInstance nameInstance = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_THREADGROUP_NAME);
        String name = readStringValue(nameInstance);
        VmThreadGroup parent = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_THREADGROUP_PARENT);

        return new VmThreadGroup(objectPtr, ci, name, parent );
    }

    private VmClassLoaderInstance createClassLoaderInstance(ClassInfo ci, long objectPtr, Object unused) {
        return new VmClassLoaderInstance(objectPtr, ci);
    }

    private VmClassInstance createClassInstance(ClassInfo ci, long objectPtr, Object unused) {
        return new VmClassInstance(objectPtr, ci);
    }

    private VmInstance createGenericInstance(ClassInfo ci, long objectPtr, Object unused) {
        return new VmInstance(objectPtr, ci);
    }

    /**
     * interface that create instance wrapper for pointer
     */
    private interface Instantiator {
        VmInstance instance(ClassInfo ci, long objectPtr, Object optional);
    }
}
