package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.hooks.payloads.HooksCmdResponse;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.array.IJdwpArrayDelegate;
import org.robovm.debugger.runtime.ValueManipulator;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoArrayImpl;
import org.robovm.debugger.state.classdata.ClassInfoPrimitiveImpl;
import org.robovm.debugger.state.instances.VmArrayInstance;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

import java.nio.charset.Charset;

/**
 * @author Demyan Kimitsa
 * all runtime actions with arrays are happening here
 */
public class JdwpArrayDelegate implements IJdwpArrayDelegate {

    // all delegates and logic parts
    private final AllDelegates delegates;


    public JdwpArrayDelegate(AllDelegates delegates) {
        this.delegates = delegates;
    }

    @Override
    public int jdwpArrayLength(long arrayId) throws DebuggerException {
        VmArrayInstance instance;
        try {
            instance = delegates.state().referenceRefIdHolder().instanceById(arrayId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);
        }

        if (instance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);

        return instance.length();
    }

    @Override
    public void jdwpArrayGetValue(long arrayId, int index, int length, ByteBufferPacket writer) throws DebuggerException {
        VmArrayInstance instance;
        try {
            instance = delegates.instances().existingInstanceByPointer(arrayId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);
        }

        // check if index and length is withing bounds
        if (index < 0 || length <= 0 || index + length >= instance.length())
            throw new DebuggerException(JdwpConsts.Error.INVALID_LENGTH);

        // read a memory block from device
        ByteBufferReader reader;
        ValueManipulator manipulator;
        ClassInfo elementType = instance.elementType();
        if (elementType.isPrimitive()) {
            ClassInfoPrimitiveImpl primType = (ClassInfoPrimitiveImpl) elementType;
            manipulator = primType.manipulator();
            delegates.runtime().deviceMemoryReader().setAddress(instance.dataPtr() + primType.size() * index);
            reader = ByteBufferReader.wrap(delegates.runtime().deviceMemoryReader().readBytes(primType.size() * length));
        } else {
            // class or array, read pointers
            int pointerSize = delegates.runtime().deviceMemoryReader().pointerSize();
            delegates.runtime().deviceMemoryReader().setAddress(instance.dataPtr() + pointerSize * index);
            reader = ByteBufferReader.wrap(delegates.runtime().deviceMemoryReader().readBytes(pointerSize * length));
            manipulator = delegates.instances().objectManipulator();
        }

        // write JDPW array region header
        writer.writeByte(Converter.jdwpTypeTag(instance.classInfo()));
        writer.writeInt32(length);

        // now dump elements one by one
        for (int idx = 0; idx < length; idx++) {
            Object element = manipulator.readFromDevice(reader);
            manipulator.writeToJdwp(writer, element);
        }
    }

    @Override
    public void jdwpArraySetValue(long arrayId, int index, int length, ByteBufferReader reader) throws DebuggerException {
        VmArrayInstance instance;
        try {
            instance = delegates.state().referenceRefIdHolder().instanceById(arrayId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);
        }

        if (instance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);

        // check if index and length is withing bounds
        if (index < 0 || length <= 0 || index + length >= instance.length())
            throw new DebuggerException(JdwpConsts.Error.INVALID_LENGTH);

        // read a memory block from device
        ByteBufferPacket packet = delegates.sharedTargetPacket();
        packet.reset();
        long destAddr;
        ValueManipulator manipulator;
        ClassInfo elementType = instance.elementType();
        if (elementType.isPrimitive()) {
            ClassInfoPrimitiveImpl primType = (ClassInfoPrimitiveImpl) elementType;
            manipulator = primType.manipulator();
            destAddr = instance.dataPtr() + primType.size() * index;
        } else {
            // class or array, read pointers
            destAddr = instance.dataPtr() + packet.pointerSize() * index;
            manipulator = delegates.instances().objectManipulator();
        }


        // now dump elements one by one
        for (int idx = 0; idx < length; idx++) {
            Object element = manipulator.readFromJdwp(reader);
            manipulator.writeToDevice(packet, element);
        }

        // put to device
        delegates.hooksApi().writeMemory(destAddr, packet);
    }

    public VmArrayInstance createArrayInstance(long objectPtr, ClassInfoArrayImpl ci) {
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

    public String readArrayString(VmArrayInstance instance, int index, int length) {
        if (!instance.elementType().isPrimitive() || "C".equals(instance.elementType().signature())) {
            throw new DebuggerException("Wrong array element type while trying to get string from array: " +
                    instance.elementType().signature());
        }

        if (index < 0 || index <= 0 || index + length >= instance.length())
            throw new DebuggerException(JdwpConsts.Error.INVALID_LENGTH);

        ClassInfoPrimitiveImpl primType = (ClassInfoPrimitiveImpl) instance.elementType();
        delegates.runtime().deviceMemoryReader().setAddress(instance.dataPtr() + primType.size() * index);
        byte[] bytes = delegates.runtime().deviceMemoryReader().readBytes(primType.size() * length);
        return new String(bytes, Charset.forName("UTF-16"));
    }

    @Override
    public long jdwpArrayCreateInstance(long arrayTypeId, int length) {
        ClassInfoArrayImpl classInfoArray = (ClassInfoArrayImpl) delegates.state().classInfoLoader().classInfoByRefId(arrayTypeId);
        if (classInfoArray == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);

        // there is a need of thread to perform this operation in context of
        // find any stopped thread
        VmThread thread = delegates.threads().anySuspendedThread();
        if (thread == null) {
            // TODO: hooks api requires to give a thread for this API
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);
        }

        HooksCmdResponse res = delegates.hooksApi().newArray(thread.threadPtr(), length, classInfoArray.elementType().signature());
        if (res.exceptionPrt() != 0 || res.result() == null) {
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);
        }
        VmArrayInstance arrayInstance = delegates.instances().instanceByPointer(res.result(), classInfoArray, null, true);
        return arrayInstance.refId();
    }
}
