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
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

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
    public <T> T getFieldValue(long objectPtr, ClassInfo ci, FieldInfo fi) throws DebuggerException {
        return getFieldValue(objectPtr, ci, fi, null);
    }


    /**
     * reads class instance field value
     * @param objectPtr pointer to object
     * @param ci class info
     * @param fi field info structure
     * @param <T> type to cast result to
     * @param jdwpOutput used to optionally save result to JDPW output buffer
     * @throws DebuggerException if something wrong
     * @return fields value
     */
    @SuppressWarnings("unchecked")
    private <T> T getFieldValue(long objectPtr, ClassInfo ci, FieldInfo fi, ByteBufferPacket jdwpOutput) throws DebuggerException {
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

        // dump to JDPW if asked
        if (jdwpOutput != null)
            valueManipulator.writeToJdwp(jdwpOutput, result);

        return result;
    }


    /**
     * Reads a list of instance field values
     * @param objectOrClassId identifier of object or type
     * @param fields list of field ids to read data from
     * @param isStatic tells that static fields has to be read
     * @param packet JDPW packet buffer to put JDPW data
     */
    public void jdwpFieldGetValues(long objectOrClassId, long[] fields, boolean isStatic, ByteBufferPacket packet) {
        ClassInfo ci;
        long baseDataPointer;
        if (isStatic) {
            ci = delegates.state().classRefIdHolder().objectById(objectOrClassId);
            if (ci == null)
                throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
            // check if class is loaded
            if (ci.clazzPtr() == 0)
                throw new DebuggerException(JdwpConsts.Error.CLASS_NOT_PREPARED);
            baseDataPointer = ci.clazzPtr();
        } else {
            VmInstance instance = delegates.state().referenceRefIdHolder().instanceById(objectOrClassId);
            if (instance == null)
                throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);
            baseDataPointer = instance.objectPtr();
            ci = instance.classInfo();
        }

        // fields has to be loaded so no need to parse them just make a run to check if these exists
        for (long fieldId : fields) {
            FieldInfo fieldInfo = delegates.state().fieldRefIdHolder().objectById(fieldId);
            if (fieldInfo == null)
                throw new DebuggerException(JdwpConsts.Error.INVALID_FIELDID);
            if (fieldInfo.isStatic() != isStatic)
                throw new DebuggerException(JdwpConsts.Error.INVALID_FIELDID);
        }

        // perform read
        for (long fieldId : fields) {
            FieldInfo fieldInfo = delegates.state().fieldRefIdHolder().objectById(fieldId);
            getFieldValue(baseDataPointer, ci, fieldInfo, packet);

        }
    }

    /**
     * writes class instance field value
     * @param objectPtr pointer to object
     * @param ci class info
     * @param fi field info structure
     * @param fromJdpw if not null value shall be picked here using manipulator
     * @throws DebuggerException if something wrong
     * @return fields value
     */
    @SuppressWarnings("unchecked")
    private void setFieldValue(long objectPtr, ClassInfo ci, FieldInfo fi, Object value, ByteBufferReader fromJdpw) throws DebuggerException {
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
        ValueManipulator valueManipulator;
        delegates.runtime().deviceMemoryReader().setAddress(objectPtr + fi.offset());
        if (fieldTypeInfo != null && fieldTypeInfo.isPrimitive()) {
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) fieldTypeInfo;
            valueManipulator = primitiveInfo.manipulator();
        } else {
            valueManipulator = manipulator;
        }

        ByteBufferPacket packet = delegates.sharedTargetPacket();
        packet.reset();

        // if specified -- pick value from jdpw payload
        if (fromJdpw != null)
            value = valueManipulator.readFromJdwp(fromJdpw);

        valueManipulator.writeToDevice(packet, value);

        // now put values to device
        delegates.hooksApi().writeMemory(objectPtr + fi.offset(), packet);
    }


    public void jdwpFieldSetValues(long objectOrClassId, int fieldsCount, boolean isStatic, ByteBufferPacket payload) {
        ClassInfo ci;
        long baseDataPointer;
        if (isStatic) {
            ci = delegates.state().classRefIdHolder().objectById(objectOrClassId);
            if (ci == null)
                throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
            // check if class is loaded
            if (ci.clazzPtr() == 0)
                throw new DebuggerException(JdwpConsts.Error.CLASS_NOT_PREPARED);
            baseDataPointer = ci.clazzPtr();
        } else {
            VmInstance instance = delegates.state().referenceRefIdHolder().instanceById(objectOrClassId);
            if (instance == null)
                throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);
            baseDataPointer = instance.objectPtr();
            ci = instance.classInfo();
        }

        // there is no way to get fields only as these are multiplexed with data, so let start working
        // if there is something wrong it will be interrupted in the middle, e.g. operation is not atomic
        while (fieldsCount-- > 0) {
            long fieldId = payload.readLong();
            FieldInfo fieldInfo = delegates.state().fieldRefIdHolder().objectById(fieldId);
            setFieldValue(baseDataPointer, ci, fieldInfo, null, payload);
        }
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


    public VmClassInstance getClazzObject(long objectId) {
        VmInstance instance = delegates.state().referenceRefIdHolder().instanceById(objectId);
        if (instance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);
        if (instance.classInfo().clazzPtr() == 0)
            throw new DebuggerException(JdwpConsts.Error.CLASS_NOT_PREPARED);

        ClassInfo ci = delegates.state().classInfoLoader().classInfoBySignature(ClassDataConsts.signatures.JAVA_LANG_CLASS);
        VmClassInstance clazzInstance = instanceByPointer(instance.classInfo().clazzPtr(), ci, null, true);

        return clazzInstance;
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