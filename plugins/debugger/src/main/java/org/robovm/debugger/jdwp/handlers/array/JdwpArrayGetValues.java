package org.robovm.debugger.jdwp.handlers.array;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns a range of array components. The specified range must be within the bounds of the array.
 */
public class JdwpArrayGetValues implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long arrayId = payload.readLong();
        int firstIndex = payload.readInt32();
        int length = payload.readInt32();

        return 0;
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
