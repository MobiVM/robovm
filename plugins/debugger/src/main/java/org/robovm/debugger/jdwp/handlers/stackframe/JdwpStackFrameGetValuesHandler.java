package org.robovm.debugger.jdwp.handlers.stackframe;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the value of one or more local variables in a given frame. Each variable must be visible at the frame's code index.
 * Even if local variable information is not available, values can be retrieved if the front-end is able to determine the correct local variable index
 */
public class JdwpStackFrameGetValuesHandler implements IJdwpRequestHandler {
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
        return 1;
    }

    @Override
    public String toString() {
        return "StackFrame(16).GetValues(1)";
    }

}
