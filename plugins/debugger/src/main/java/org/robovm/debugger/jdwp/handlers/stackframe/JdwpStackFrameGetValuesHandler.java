package org.robovm.debugger.jdwp.handlers.stackframe;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the value of one or more local variables in a given frame. Each variable must be visible at the frame's code index.
 * Even if local variable information is not available, values can be retrieved if the front-end is able to determine the correct local variable index
 */
public class JdwpStackFrameGetValuesHandler implements IJdwpRequestHandler {

    private final IJdwpStackFrameDelegate delegate;

    public JdwpStackFrameGetValuesHandler(IJdwpStackFrameDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long threadId = payload.readLong();
        long frameId = payload.readLong();
        int slots = payload.readInt32();

        int[] varIndexes = new int[slots];
        byte[] varTags = new byte[slots];
        for (int idx = 0; idx < slots; idx++) {
            varIndexes[idx] = payload.readInt32();
            varTags[idx] = payload.readByte();
        }

        try {
            delegate.getFrameValues(threadId, frameId, varIndexes, varTags, output);
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
        return 1;
    }

    @Override
    public String toString() {
        return "StackFrame(16).GetValues(1)";
    }

}
