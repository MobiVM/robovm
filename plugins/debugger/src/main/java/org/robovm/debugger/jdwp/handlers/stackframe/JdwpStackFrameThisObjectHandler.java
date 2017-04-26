package org.robovm.debugger.jdwp.handlers.stackframe;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the value of the 'this' reference for this frame. If the frame's method is static or native, the reply will
 * contain the null object reference
 */
public class JdwpStackFrameThisObjectHandler implements IJdwpRequestHandler {
    private final IJdwpStackFrameDelegate delegate;

    public JdwpStackFrameThisObjectHandler(IJdwpStackFrameDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long threadId = payload.readLong();
        long frameId = payload.readLong();
        try {
            delegate.getFrameVariable(threadId, frameId, "this", output);
        } catch (ClassCastException e) {
            return JdwpConsts.Error.INVALID_OBJECT;
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
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
