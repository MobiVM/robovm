package org.robovm.debugger.jdwp.handlers.thread;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 */
public class JdwpThreadGetNameHandler extends IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadGetNameHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long threadId = payload.readLong();

        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 11;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ThreadReference(15).Name(1)";
    }
}
