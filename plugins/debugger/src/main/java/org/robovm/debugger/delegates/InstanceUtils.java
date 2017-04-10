package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.hooks.payloads.HooksCmdResponse;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.runtime.ValueManipulator;
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
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

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
        this.runtimeClassInfoLoader = new RuntimeClassInfoLoader(delegates);
    }

    public RuntimeClassInfoLoader classInfoLoader() {
        return runtimeClassInfoLoader;
    }

    /**
     * creates a java sting in Vm and returns instance ref id to it
     * @param value of string to create
     * @return string instance ref id
     */
    public VmStringInstance createVmStringInstance(String value) {
        // there is a need of thread to perform this operation in context of
        // find any stopped thread
        VmThread thread = delegates.threads().anySuspendedThread();
        if (thread == null) {
            // TODO: hooks api requires to give a thread for this API
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);
        }

        HooksCmdResponse res = delegates.hooksApi().newString(thread.threadPtr(), value);
        if (res.exceptionPrt() != 0 || res.result() == null) {
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);
        }

        ClassInfo classInfo = delegates.state().classInfoLoader().classInfoBySignature(ClassDataConsts.signatures.JAVA_LANG_STRING);
        VmStringInstance stringInstance = delegates.instances().instanceByPointer(res.result(), classInfo, null, true);
        return stringInstance;
    }

    /**
     * returns string value from VmStringInstance
     * reads from device if required or returns value previously read
     * @param stringInstance which keep object pointer
     * @return java string
     */
    public String readStringValue(VmStringInstance stringInstance) {
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

    /** wrapper that takes object reference as param */
    public String readStringValue(long stringRefId) {
        VmStringInstance stringInstance = delegates.state().referenceRefIdHolder().instanceById(stringRefId);
        if (stringInstance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);

        return readStringValue(stringInstance);
    }

    /**
     * reads class instance field value
     * @param objectPtr pointer to object
     * @param ci class info
     * @param fieldName field name to set
     * @param <T> type to cast result to
     * @throws DebuggerException if something wrong
     * @return fields value
     */
    public <T> T getFieldValue(long objectPtr, ClassInfo ci, String fieldName) throws DebuggerException {
        FieldInfo[] fields = ci.fields(runtimeClassInfoLoader.loader());
        FieldInfo fi = null;
        if (fields != null) {
            for (FieldInfo fieldInfo : fields) {
                if (fieldName.equals(fieldInfo.name())) {
                    fi = fieldInfo;
                    break;
                }
            }
        }

        if (fi == null)
            throw new DebuggerException("Field " + fieldName + " not found in " + ci.signature());

        return getFieldValue(objectPtr, ci, fi);
    }

    /**
     * reads class instance field value
     * @param objectPtr pointer to object
     * @param ci class info
     * @param fi field info structure
     * @param <T> type to cast result to
     * @throws DebuggerException if something wrong
     * @return fields value
     */
    @SuppressWarnings("unchecked")
    public <T> T getFieldValue(long objectPtr, ClassInfo ci, FieldInfo fi) throws DebuggerException {
        String signature = fi.signature();
        // is resolved already ?
        ClassInfo fieldTypeInfo = fi.typeInfo();
        // check from known signatures
        if (fieldTypeInfo == null)
            fieldTypeInfo = runtimeClassInfoLoader.loader().classInfoBySignature(signature);
        // try to build signature
        if (fieldTypeInfo == null) {
            if (ClassInfoLoader.isArraySignature(signature)) {
                // read data from object itself, keep it null
            } else if (ClassInfoLoader.isPrimitiveSignature(signature)) {
                // primitive, type data is not loaded yet
                fieldTypeInfo = runtimeClassInfoLoader.buildPrimitiveClassInfo(signature.charAt(0));
            } else {
                throw new DebuggerException("Failed to resolve type info for field " + fi.name() + " in " + ci.signature());
            }
        }

        // can read data now
        T result;
        ValueManipulator valueManipulator;
        delegates.runtime().deviceMemoryReader().setAddress(objectPtr + fi.offset());
        if (fieldTypeInfo != null && fieldTypeInfo.isPrimitive()) {
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) fieldTypeInfo;
            valueManipulator = primitiveInfo.manipulator();
        } else {
            valueManipulator = manipulator;
        }

        result = (T) valueManipulator.readFromDevice(delegates.runtime().deviceMemoryReader());
        return result;
    }

    /**
     * writes class instance field value
     * @param objectPtr pointer to object
     * @param ci class info
     * @param fi field info structure
     * @throws DebuggerException if something wrong
     * @return fields value
     */
    @SuppressWarnings("unchecked")
    public void setFieldValue(long objectPtr, ClassInfo ci, FieldInfo fi, Object value) throws DebuggerException {
        String signature = fi.signature();
        // is resolved already ?
        ClassInfo fieldTypeInfo = fi.typeInfo();
        // check from known signatures
        if (fieldTypeInfo == null)
            fieldTypeInfo = runtimeClassInfoLoader.loader().classInfoBySignature(signature);
        // try to build signature
        if (fieldTypeInfo == null) {
            if (ClassInfoLoader.isArraySignature(signature)) {
                // read data from object itself, keep it null
            } else if (ClassInfoLoader.isPrimitiveSignature(signature)) {
                // primitive, type data is not loaded yet
                fieldTypeInfo = runtimeClassInfoLoader.buildPrimitiveClassInfo(signature.charAt(0));
            } else {
                throw new DebuggerException("Failed to resolve type info for field " + fi.name() + " in " + ci.signature());
            }
        }

        // can write data now
        ByteBufferPacket packet = delegates.sharedTargetPacket();
        packet.reset();
        ValueManipulator valueManipulator;
        delegates.runtime().deviceMemoryReader().setAddress(objectPtr + fi.offset());
        if (fieldTypeInfo != null && fieldTypeInfo.isPrimitive()) {
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) fieldTypeInfo;
            valueManipulator = primitiveInfo.manipulator();
        } else {
            valueManipulator = manipulator;
        }
        valueManipulator.writeToDevice(packet, value);

        // now put values to device
        delegates.hooksApi().writeMemory(objectPtr + fi.offset(), packet);
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
     * @param ci class info if known
     * @param param optional param to give it to instantiator (like thread ptr)
     * @param allocate to create an VM instance from pointer
     * @param <T> type to case result to
     * @return created object or null
     * @throws ClassCastException if result cast to <T> fails
     */
    @SuppressWarnings("unchecked")
    public <T extends VmInstance> T instanceByPointer(long objectPtr, ClassInfo ci, Object param, boolean allocate) throws ClassCastException {
        // get it from map first
        VmInstance instance = delegates.state().referenceRefIdHolder().instanceByAddr(objectPtr);
        if (instance == null && allocate) {
            // trying to allocate new one, fetch class info if not specified
            if (ci == null)
                ci = runtimeClassInfoLoader.resolveObjectRuntimeDataTypeInfo(objectPtr);
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

    public <T extends VmInstance> T instanceByPointer(long objectPtr, Object param, boolean allocate) throws ClassCastException {
        return instanceByPointer(objectPtr, null, param, allocate);
    }

    public <T extends VmInstance> T instanceByPointer(long objectPtr) throws ClassCastException {
        return instanceByPointer(objectPtr, null, null, true);
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

    /**
     * @return object manipulator that works with object/arrays
     */
    public ValueManipulator objectManipulator() {
        return manipulator;
    }

    /**
     * interface that create instance wrapper for pointer
     */
    private interface Instantiator {
        VmInstance instance(ClassInfo ci, long objectPtr, Object optional);
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
     * Special subclass for object manipulations
     */
    private class Manipulator extends ValueManipulator {
        private Manipulator() {
            super(
                    fromDevice -> {
                        long ptr = fromDevice.readLong();
                        return ptr != 0 ? instanceByPointer(ptr) : null;
                    },
                    fromJdwp -> {
                        long refId = fromJdwp.readLong();
                        return refId != 0 ? delegates.state().referenceRefIdHolder().objectById(refId) : null;
                    },
                    (writer, o) -> {
                        VmInstance instance = (VmInstance) o;
                        writer.writeLong(instance != null ? instance.objectPtr() : 0);
                    },
                    (jdwpWriter, o) -> {
                        VmInstance instance = (VmInstance) o;
                        jdwpWriter.writeByte(instance != null ? Converter.jdwpInstanceTag(instance.classInfo()) : JdwpConsts.Tag.OBJECT);
                        jdwpWriter.writeLong(instance != null ? instance.refId() : 0);
                    },
                    (reader, length) -> {
                        VmInstance[] arr = new VmInstance[length];
                        for (int idx = 0; idx < length; idx ++)
                            arr[idx] = instanceByPointer(reader.readPointer());
                        return arr;
                    });
        }
    }
    private Manipulator manipulator = new Manipulator();
}
