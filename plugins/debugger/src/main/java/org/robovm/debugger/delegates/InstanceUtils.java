package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.state.classdata.ClassDataConsts;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoArrayImpl;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.state.classdata.ClassInfoLoader;
import org.robovm.debugger.state.classdata.ClassInfoPrimitiveImpl;
import org.robovm.debugger.state.classdata.FieldInfo;
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

    public InstanceUtils(AllDelegates delegates) {
        this.delegates = delegates;
    }



    @SuppressWarnings("unchecked")
    private <T> T getFieldValue(long objectPtr, ClassInfo ci, String fieldName) {
        FieldInfo[] fields = ci.fields(delegates.runtime().classInfoLoader().loader());
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
            fieldTypeInfo = delegates.runtime().classInfoLoader().loader().classInfoBySignature(signature);
        // try to build signature
        if (fieldTypeInfo == null) {
            if (ClassInfoLoader.isArraySignature(signature)) {
                // read data from object itself
            } else if (ClassInfoLoader.isPrimitiveSignature(signature)) {
                // primitive, type data is not loaded yet
                // get primitive clazz pointer from device memory (check class.c)
                long clazzPrt = delegates.state().appFileLoader().resolveSymbol("_prim_" + signature);
                delegates.runtime().deviceMemoryReader().setAddress(delegates.runtime().toRuntimeAddr(clazzPrt));;
                clazzPrt = delegates.runtime().deviceMemoryReader().readPointer();

                fieldTypeInfo = delegates.runtime().classInfoLoader().resolveRuntimeDataTypeInfo(signature, clazzPrt);
            }
        }

        if (fieldTypeInfo == null) {
            throw new DebuggerException("Failed to resolve type info for field " + fieldName + " in " + ci.signature());
        }

        // can read data now
        T result;
        delegates.runtime().deviceMemoryReader().setAddress(objectPtr + fieldInfo.offset());
        if (fieldTypeInfo.isPrimitive()) {
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) fieldTypeInfo;
            result = (T) primitiveInfo.manipulator().readFromDevice(delegates.runtime().deviceMemoryReader());
        } else {
            long fieldObjectPtr = delegates.runtime().deviceMemoryReader().readPointer();
            result = (T)instanceByPointer(fieldObjectPtr, null, true);
        }

        return result;
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
            ClassInfo ci = delegates.runtime().classInfoLoader().resolveObjectRuntimeDataTypeInfo(objectPtr);
            if (ci == null)
                throw new DebuggerException("Cannot resolve type for instance " + Long.toHexString(objectPtr));

            if (ci.isPrimitive()) {
                // shall not happen
                throw new DebuggerException("Invalid case: object can't be primitive type " + Long.toHexString(objectPtr));
            } else if (ci.isArray()) {
                // create an array instance
                instance = createArrayInstance(objectPtr, (ClassInfoArrayImpl) ci, null);
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
                ClassInfoImpl superclass = (ClassInfoImpl) delegates.runtime().classInfoLoader().loader().classInfoBySignature(superclassSignature);
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


    private VmArrayInstance createArrayInstance(long objectPtr, ClassInfoArrayImpl ci, Object unused) {
        // skip object structure and read length
        long dataPtr = objectPtr + delegates.runtime().deviceMemoryReader().pointerSize() * 2;
        int length = delegates.runtime().deviceMemoryReader().readInt32();

        // calculate data pointer
        dataPtr += 4; // length field
        // now align by size of data
        int elementSize;
        if (ci.elementType().isPrimitive())
            elementSize = ((ClassInfoPrimitiveImpl)ci.elementType()).size();
        else
            elementSize = delegates.runtime().deviceMemoryReader().pointerSize();
        dataPtr = (dataPtr + elementSize - 1) & ~(elementSize - 1);

        return new VmArrayInstance(objectPtr, ci, length, dataPtr);
    }

    private VmStringInstance createStringInstance(ClassInfo ci, long objectPtr, Object unused) {
        // check rt.c # rvmRTGetStringChars
        VmArrayInstance value = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_STRING_VALUE);
        int count = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_STRING_VALUE);
        int offset = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_STRING_VALUE);

        // now read
        return null;
    }

    private VmThread createThreadInstance(ClassInfo ci, long objectPtr, Object threadPtr) {
        String name = null;
        VmThreadGroup threadGroup = null;
        return new VmThread(objectPtr, (Long)threadPtr, ci, name, threadGroup);
    }

    private VmThreadGroup createThreadGroupInstance(ClassInfo ci, long objectPtr, Object unused) {
        String name = null;
        VmThreadGroup parent = null;
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
