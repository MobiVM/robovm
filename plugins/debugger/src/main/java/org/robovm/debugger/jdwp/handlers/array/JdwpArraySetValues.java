package org.robovm.debugger.jdwp.handlers.array;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Sets a range of array components. The specified range must be within the bounds of the array. For primitive values,
 * each value's type must match the array component type exactly. For object values, there must be a widening
 * reference conversion from the value's type to the array component type and the array component type must be loaded.
 */
public class JdwpArraySetValues implements IJdwpRequestHandler {

    private final IJdwpArrayDelegate delegate;

    public JdwpArraySetValues(IJdwpArrayDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long arrayId = payload.readLong();
        int firstIndex = payload.readInt32();
        int length = payload.readInt32();

        try {
            delegate.jdwpArraySetValue(arrayId, firstIndex, length, payload);
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw  e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 13;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "ArrayReference(13).SetValues(3)";
    }
}
