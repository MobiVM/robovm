package org.robovm.debugger.jdwp.handlers.array;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the number of components in a given array.
 */
public class JdwpArrayGetLength implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long arrayId = payload.readLong();

        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 13;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ArrayReference(13).Length(1)";
    }
}
