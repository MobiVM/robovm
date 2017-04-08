package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the current status of the reference type.
 */
public class JdwpRefTypeStatusHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 9;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Status(9)";
    }

}
