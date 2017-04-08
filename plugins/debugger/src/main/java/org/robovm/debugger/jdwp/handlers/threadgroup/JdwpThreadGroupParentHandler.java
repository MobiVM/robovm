package org.robovm.debugger.jdwp.handlers.threadgroup;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the thread group, if any, which contains a given thread group.
 */
public class JdwpThreadGroupParentHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 12;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ThreadGroup(12).Parent(2)";
    }

}
