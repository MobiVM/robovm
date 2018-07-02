/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
import org.robovm.debugger.state.classdata.MethodInfo;
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

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    /** object data type manipulator */
    private final Manipulator manipulator;

    public InstanceUtils(AllDelegates delegates) {
        this.delegates = delegates;
        this.runtimeClassInfoLoader = new RuntimeClassInfoLoader(delegates);
        this.manipulator = new Manipulator(this);
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
        String str = count == 0 ? "" : delegates.arrays().readArrayString(value, offset, count);
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
        FieldInfo fi = ci.getField(fieldName, runtimeClassInfoLoader.loader());
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
                // array class info is being build dynamically so there is no option to get this value
            } else if (ClassInfoLoader.isPrimitiveSignature(signature)) {
                // primitive, type data is not loaded yet
                fieldTypeInfo = runtimeClassInfoLoader.buildPrimitiveClassInfo(signature.charAt(0));
            } else {
                throw new DebuggerException("Failed to resolve type info for field " + fi.name() + " in " + ci.signature());
            }
        }

        // can read data now
        return (T) getMemoryValue(objectPtr + fi.offset(), fieldTypeInfo, jdwpOutput);
    }

    /**
     * reads value of object of known type from memory
     * @param objectPtr pointer to object/primitive
     * @param ci class info of data (null if it is object)
     * @param jdwpOutput if not null -- also outputs data to buffer packet
     * @return object read
     */
    public Object getMemoryValue(long objectPtr, ClassInfo ci, ByteBufferPacket jdwpOutput) {
        ValueManipulator valueManipulator;
        delegates.runtime().deviceMemoryReader().setAddress(objectPtr);
        if (ci != null && ci.isPrimitive()) {
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) ci;
            valueManipulator = primitiveInfo.manipulator();
        } else {
            valueManipulator = manipulator;
        }

        Object result = valueManipulator.readFromDevice(delegates.runtime().deviceMemoryReader());

        // dump to JDPW if asked
        if (jdwpOutput != null)
            valueManipulator.writeToJdwp(jdwpOutput, result);

        return result;
    }

    /**
     * Writes default Zero/null value for class info
     * @param ci class info of data (null if it is object)
     * @param jdwpOutput if not null -- also outputs data to buffer packet
     */
    public void getDefaultValue(ClassInfo ci, ByteBufferPacket jdwpOutput) {
        ValueManipulator valueManipulator;
        if (ci != null && ci.isPrimitive()) {
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) ci;
            valueManipulator = primitiveInfo.manipulator();
        } else {
            valueManipulator = manipulator;
        }

        valueManipulator.writeDefaultToJdwp(jdwpOutput);
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
        setMemoryValue(objectPtr + fi.offset(), fieldTypeInfo, value, fromJdpw);
    }

    /**
     * Writes value directly to memory
     * @param objectPtr pointer to object/primitive to be put to
     * @param ci class info of data (null if it is object)
     * @param value if there is value itself
     * @param fromJdpw if specified then manipulator will pick value from jdwp payload
     */
    public void setMemoryValue(long objectPtr, ClassInfo ci, Object value, ByteBufferReader fromJdpw) {
        // can write data now
        ValueManipulator valueManipulator;
        if (ci != null && ci.isPrimitive()) {
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) ci;
            valueManipulator = primitiveInfo.manipulator();
        } else {
            valueManipulator = manipulator;
        }

        // if specified -- pick value from jdpw payload
        if (fromJdpw != null)
            value = valueManipulator.readFromJdwp(fromJdpw);

        ByteBufferPacket packet = delegates.sharedTargetPacket();
        packet.reset();
        valueManipulator.writeToDevice(packet, value);

        // now put values to device
        delegates.hooksApi().writeMemory(objectPtr, packet);
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


    public VmClassInstance getClazzObject(long referenceTypeId) {
        ClassInfo referenceType = delegates.state().classRefIdHolder().objectById(referenceTypeId);
        if (referenceType == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
        if (referenceType.clazzPtr() == 0)
            throw new DebuggerException(JdwpConsts.Error.CLASS_NOT_PREPARED);

        return instanceByPointer(referenceType.clazzPtr(), null, true);
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
        // handle null case
        if (objectPtr == 0)
            return null;

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

            delegates.state().referenceRefIdHolder().addObject(instance);
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
            }
            if (res == null)
                res = this::createGenericInstance;
        }

        // if there is an res -- save it
        instantiatorForClassRefId.put(ci.refId(), res);

        return res;
    }

    /**
     * invokes the method of class or instance
     */
    public void jdwpInvokeMethod(long objectOrClassId, long threadId, long methodId, boolean isStatic,
                                 boolean singleThread, Object[] args, ByteBufferPacket output) {

        // get thread
        VmThread thread = delegates.state().referenceRefIdHolder().instanceById(threadId);
        if (thread == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
        if (thread.suspendCount() == 0)
            throw new DebuggerException(JdwpConsts.Error.THREAD_NOT_SUSPENDED);

        // get method
        MethodInfo methodInfo = delegates.state().methodsRefIdHolder().objectById(methodId);
        if (methodInfo == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_METHODID);

        // get class or instance pointer
        long classOrInstancePtr;
        if (isStatic) {
            ClassInfo ci = delegates.state().classRefIdHolder().objectById(objectOrClassId);
            if (ci == null)
                throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
            // check if class is loaded
            if (ci.clazzPtr() == 0)
                throw new DebuggerException(JdwpConsts.Error.CLASS_NOT_PREPARED);
            classOrInstancePtr = ci.clazzPtr();
        } else {
            VmInstance instance = delegates.state().referenceRefIdHolder().instanceById(objectOrClassId);
            if (instance == null)
                throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);
            classOrInstancePtr = instance.objectPtr();
        }

        // get method arguments types and return type
        MethodInfo.CallSpec callspec = methodInfo.callspec();
        if (callspec == null) {
            callspec = buildCallSpec(methodInfo.signature());
            methodInfo.setCallspec(callspec);
        }

        // sanity 1
        if (args.length != callspec.arguments.length)
            throw new DebuggerException(JdwpConsts.Error.INVALID_METHODID);

        ByteBufferPacket argsBuffer = null;
        if (args.length > 0) {
            // write values to special buffer
            // intentionally marked as 64 to save pointers as longs
            // refer to method.c/setArgs for details of how array/object data is fetched
            argsBuffer = new ByteBufferPacket(args.length * 8, true);
            argsBuffer.setByteOrder(ByteOrder.LITTLE_ENDIAN);
            for (int idx = 0; idx < args.length; idx++) {
                // write using class spec
                // if client send wrong data it will fail on class cast during manipulator operations

                ClassInfo valueClassInfo = callspec.arguments[idx];
                ValueManipulator valueManipulator;

                Object value = args[idx];
                if (valueClassInfo.isPrimitive()) {
                    ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) valueClassInfo;
                    valueManipulator = primitiveInfo.manipulator();
                } else {
                    value = delegates.state().referenceRefIdHolder().instanceById((Long)value);
                    valueManipulator = manipulator;
                }

                // there is one trick. data is being written as jvalue which is 8 bytes long
                // so while writing we have to do back in force
                // refer to method.c/setArgs for details
                int pos = argsBuffer.position();
                argsBuffer.writeLong(0);
                argsBuffer.setPosition(pos);
                valueManipulator.writeToDevice(argsBuffer, value);
                // move pos to end of buf
                argsBuffer.setPosition(argsBuffer.size());
            }
        }

        boolean createInstance = isStatic && "<init>".equals(methodInfo.name());
        ClassInfo specReturnType = callspec.returnType;
        // there is workaround as this method is being used to create new instances as well (e.g. calling constructor)
        // it check against <init> method name and replaces void to object type
        if (specReturnType == null && createInstance)
            specReturnType = ClassInfoImpl.EMPTY;

        // find out return code for hooks
        // refer to hooks.c/invokeClassMethod
        byte returnType;
        if (specReturnType == null)
            returnType = (byte) ("<init>".equals(methodInfo.name()) ? 'L' : 'V');
        else if (specReturnType.isPrimitive())
            returnType = (byte) callspec.returnType.signature().charAt(0);
        else
            returnType = 'L'; // array or object

        // resume all threads if not single threaded
        if (!singleThread)
            delegates.threads().resumeAllOtherThreads(thread);

        // invoke now
        HooksCmdResponse res;
        if (createInstance) {
            res = delegates.hooksApi().newInstance(thread.threadPtr(), classOrInstancePtr, methodInfo.name(),
                    methodInfo.signature(), argsBuffer);
        } else {
            res = delegates.hooksApi().threadInvoke(thread.threadPtr(), classOrInstancePtr, methodInfo.name(),
                    methodInfo.signature(), isStatic, returnType, argsBuffer);
        }

        // write received result to output buffer
        if (specReturnType == null) {
            output.writeByte(JdwpConsts.Tag.VOID);
        } else if (specReturnType.isPrimitive()) {
            // now is a trick of how to make different types from long without checking types
            // write it to buffer and then read it back using manipulator
            if (argsBuffer == null) {
                argsBuffer = new ByteBufferPacket(8, true);
                argsBuffer.setByteOrder(ByteOrder.LITTLE_ENDIAN);
            } else {
                argsBuffer.reset();
            }
            argsBuffer.writeLong(res.result());

            // read it back
            ClassInfoPrimitiveImpl primitiveInfo = (ClassInfoPrimitiveImpl) callspec.returnType;
            argsBuffer.setPosition(0);
            Object value = primitiveInfo.manipulator().readFromDevice(argsBuffer);
            primitiveInfo.manipulator().writeToJdwp(output, value);
        } else {
            // array or object
            VmInstance value = instanceByPointer(res.result());
            manipulator.writeToJdwp(output, value);
        }

        // send exception if any
        if (res.exceptionPrt() == 0) {
            output.writeByte(JdwpConsts.Tag.OBJECT);
            output.writeLong(0);
        } else {
            VmInstance value = instanceByPointer(res.exceptionPrt());
            manipulator.writeToJdwp(output, value);
        }
    }

    /**
     * @return object manipulator that works with object/arrays
     */
    ValueManipulator objectManipulator() {
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

    private VmThreadGroup createThreadGroupInstance(ClassInfo ci, long objectPtr, @SuppressWarnings("unused") Object unused) {
        VmStringInstance nameInstance = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_THREADGROUP_NAME);
        String name = readStringValue(nameInstance);
        VmThreadGroup parent = getFieldValue(objectPtr, ci, ClassDataConsts.fields.JAVA_LANG_THREADGROUP_PARENT);

        return new VmThreadGroup(objectPtr, ci, name, parent );
    }

    private VmClassLoaderInstance createClassLoaderInstance(ClassInfo ci, long objectPtr, @SuppressWarnings("unused")Object unused) {
        return new VmClassLoaderInstance(objectPtr, ci);
    }

    private VmClassInstance createClassInstance(ClassInfo ci, long objectPtr, @SuppressWarnings("unused")Object unused) {
        ClassInfo representedClassInfo = runtimeClassInfoLoader.resolveRuntimeDataTypeInfo(objectPtr);
        return new VmClassInstance(objectPtr, ci, representedClassInfo);
    }

    private VmInstance createGenericInstance(ClassInfo ci, long objectPtr, @SuppressWarnings("unused")Object unused) {
        return new VmInstance(objectPtr, ci);
    }

    /**
     * parses method signature into classinfos of arguments and return type
     * @param signature of method
     * @return spec to call this method
     */
    private MethodInfo.CallSpec buildCallSpec(String signature) {
        if (!signature.startsWith("("))
            throw new DebuggerException("wrong method signature " + signature);
        int div = signature.indexOf(')');
        if (div < 0)
            throw new DebuggerException("wrong method signature " + signature);

        // return type and argument signatures
        String returnSignature = signature.substring(div + 1);
        String arguments = signature.substring(1, div);

        // deal with return type
        ClassInfo retType = null;
        char returnSignatureC = returnSignature.charAt(0);
        if (returnSignature.length() == 1) {
            // primitive
            if (returnSignatureC != 'V')
                retType = classInfoLoader().getPrimitiveClassInfo(returnSignatureC);
        } else {
            if (returnSignatureC == 'L')
                retType = ClassInfoImpl.EMPTY;
            else if (returnSignatureC == '[')
                retType = ClassInfoArrayImpl.EMPTY;
            else
                throw new DebuggerException("wrong method signature " + signature);
        }

        // deal with argument type
        List<ClassInfo> argumentTypes = new ArrayList<>();
        if (arguments.length() != 0) {
            int[] pos = {0};
            while (pos[0] < arguments.length()) {
                char c = getNextParameterType(arguments, pos);
                if (c == 'L')
                    argumentTypes.add(ClassInfoImpl.EMPTY);
                else if (c == '[')
                    argumentTypes.add(ClassInfoArrayImpl.EMPTY);
                else {
                    // primitive
                    argumentTypes.add(classInfoLoader().getPrimitiveClassInfo(c));
                }
            }
        }

        return new MethodInfo.CallSpec(retType, argumentTypes.toArray(new ClassInfo[argumentTypes.size()]));
    }

    /**
     * picks next parameter type from signature
     * check method.c/rvmGetNextParameterType
     */
    private char getNextParameterType(String signature, int[] pos) {
        char c = signature.charAt(pos[0]);
        pos[0] += 1;
        switch (c) {
            case 'B':
            case 'Z':
            case 'S':
            case 'C':
            case 'I':
            case 'J':
            case 'F':
            case 'D':
                return c;
            case '[':
                // skip array type as not important
                getNextParameterType(signature, pos);
                return c;
            case 'L':
                while (signature.charAt(pos[0]) != ';')
                    pos[0] += 1;
                pos[0] += 1;
                return c;
        }

        // should not happen
        throw new DebuggerException("wrong method signature " + signature);
    }

    /**
     * Special subclass for object manipulations
     */
    private static class Manipulator extends ValueManipulator {
        private Manipulator(InstanceUtils utils) {
            super(
                    fromDevice -> {
                        long ptr = fromDevice.readPointer();
                        return ptr != 0 ? utils.instanceByPointer(ptr) : null;
                    },
                    fromJdwp -> {
                        long refId = fromJdwp.readLong();
                        return refId != 0 ? utils.delegates.state().referenceRefIdHolder().objectById(refId) : null;
                    },
                    (writer, o) -> {
                        VmInstance instance = (VmInstance) o;
                        writer.writePointer(instance != null ? instance.objectPtr() : 0);
                    },
                    (jdwpWriter, o) -> {
                        VmInstance instance = (VmInstance) o;
                        if (instance != null) {
                            byte typeTag = Converter.jdwpInstanceTag(instance.classInfo(), utils.delegates.state().classInfoLoader());
                            jdwpWriter.writeByte(typeTag);
                            jdwpWriter.writeLong(instance.refId());
                        } else {
                            jdwpWriter.writeByte(JdwpConsts.Tag.OBJECT);
                            jdwpWriter.writeLong(0);
                        }
                    },
                    (jdwpWriter) -> {
                        jdwpWriter.writeByte(JdwpConsts.Tag.OBJECT);
                        jdwpWriter.writeLong(0);
                    },
                    (reader, length) -> {
                        VmInstance[] arr = new VmInstance[length];
                        for (int idx = 0; idx < length; idx ++)
                            arr[idx] = utils.instanceByPointer(reader.readPointer());
                        return arr;
                    }
            );
        }
    }
}
