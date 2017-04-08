package org.robovm.debugger.jdwp.handlers.stackframe;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Sets the value of one or more local variables. Each variable must be visible at the current frame code index.
 */
public class JdwpStackFrameSetValuesHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 16;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "StackFrame(16).SetValues(2)";
    }

}
