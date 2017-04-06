package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.array.IJdwpArrayDelegate;
import org.robovm.debugger.runtime.ValueManipulator;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoPrimitiveImpl;
import org.robovm.debugger.state.instances.VmArrayInstance;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

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
            instance = delegates.state.referenceRefIdHolder().instanceById(arrayId);
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
            instance = delegates.state.referenceRefIdHolder().instanceById(arrayId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);
        }

        if (instance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);

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
            delegates.runtime.deviceMemoryReader.setAddress(instance.dataPtr() + primType.size() * index);
            reader = ByteBufferReader.wrap(delegates.runtime.deviceMemoryReader.readBytes(primType.size() * length));
        } else {
            // class or array, read pointers
            int pointerSize = delegates.runtime.deviceMemoryReader.pointerSize();
            delegates.runtime.deviceMemoryReader.setAddress(instance.dataPtr() + pointerSize * index);
            reader = ByteBufferReader.wrap(delegates.runtime.deviceMemoryReader.readBytes(pointerSize * length));
            manipulator = null;
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
            instance = delegates.state.referenceRefIdHolder().instanceById(arrayId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);
        }

        if (instance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);

        // check if index and length is withing bounds
        if (index < 0 || length <= 0 || index + length >= instance.length())
            throw new DebuggerException(JdwpConsts.Error.INVALID_LENGTH);

        // TODO: write to
    }

}
