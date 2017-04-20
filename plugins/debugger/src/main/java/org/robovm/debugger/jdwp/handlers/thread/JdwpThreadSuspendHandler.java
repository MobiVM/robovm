package org.robovm.debugger.jdwp.handlers.thread;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 */
public class JdwpThreadSuspendHandler implements IJdwpRequestHandler {

    private final IJdwpThreadDelegate delegate;

    public JdwpThreadSuspendHandler(IJdwpThreadDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long threadId = payload.readLong();
        try {
            delegate.jdwpSuspendThread(threadId);
        } catch (ClassCastException e) {
            return JdwpConsts.Error.INVALID_OBJECT;
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 11;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ThreadReference(11).Suspend(2)";
    }

}
