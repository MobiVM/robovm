package org.robovm.debugger.jdwp.handlers.string;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 */
public class JdwpStringGetValueHandler implements IJdwpRequestHandler {

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {

        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 10;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "StringReference(10).Value(1)";
    }
}
