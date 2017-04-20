package org.robovm.debugger.jdwp.handlers.stackframe;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Sets the value of one or more local variables. Each variable must be visible at the current frame code index.
 */
public class JdwpStackFrameSetValuesHandler implements IJdwpRequestHandler {
    private final IJdwpStackFrameDelegate delegate;

    public JdwpStackFrameSetValuesHandler(IJdwpStackFrameDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long threadId = payload.readLong();
        long frameId = payload.readLong();
        int count = payload.readInt32();

        // it is not clear about variable size so just pass payload to delegate to pick the values with
        // manipulator
        try {
            delegate.setFrameValues(threadId, frameId, payload, count);
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
        return 2;
    }

    @Override
    public String toString() {
        return "StackFrame(16).SetValues(2)";
    }

}
