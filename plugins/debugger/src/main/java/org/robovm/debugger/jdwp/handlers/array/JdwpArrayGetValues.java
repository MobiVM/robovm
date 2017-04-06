package org.robovm.debugger.jdwp.handlers.array;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns a range of array components. The specified range must be within the bounds of the array.
 */
public class JdwpArrayGetValues implements IJdwpRequestHandler {

    private final IJdwpArrayDelegate delegate;

    public JdwpArrayGetValues(IJdwpArrayDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long arrayId = payload.readLong();
        int firstIndex = payload.readInt32();
        int length = payload.readInt32();
        output.reset();

        try {
            delegate.jdwpArrayGetValue(arrayId, firstIndex, length, output);
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
        return 2;
    }

    @Override
    public String toString() {
        return "ArrayReference(13).GetValues(2)";
    }
}
