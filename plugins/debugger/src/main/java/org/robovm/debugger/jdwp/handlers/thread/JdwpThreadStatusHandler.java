package org.robovm.debugger.jdwp.handlers.thread;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the current status of a thread. The thread status reply indicates the thread status the last time it was running.
 * the suspend status provides information on the thread's suspension, if any.
 */
public class JdwpThreadStatusHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadStatusHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long threadId = payload.readLong();

        synchronized (state.centralLock()) {
            VmThread thread;
            try {
                thread = state.referenceRefIdHolder().instanceById(threadId);
            } catch (ClassCastException e){
                return JdwpConsts.Error.INVALID_THREAD;
            }

            if (thread == null)
                return JdwpConsts.Error.INVALID_THREAD;

            // TODO: check about statuses
            output.writeInt32(thread.suspendCount() > 0 ? JdwpConsts.ThreadStatus.WAIT : JdwpConsts.ThreadStatus.RUNNING);
            output.writeInt32(thread.suspendCount() > 0 ? JdwpConsts.SuspendStatus.SUSPEND_STATUS_SUSPENDED : 0);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 11;
    }

    @Override
    public byte getCommand() {
        return 4;
    }

    @Override
    public String toString() {
        return "ThreadReference(11).Status(4)";
    }

}
