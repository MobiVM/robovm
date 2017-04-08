package org.robovm.debugger.jdwp.handlers.stackframe;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the value of the 'this' reference for this frame. If the frame's method is static or native, the reply will
 * contain the null object reference
 */
public class JdwpStackFrameThisObjectHandler implements IJdwpRequestHandler {
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
        return 3;
    }

    @Override
    public String toString() {
        return "StackFrame(16).ThisObject(3)";
    }

}
