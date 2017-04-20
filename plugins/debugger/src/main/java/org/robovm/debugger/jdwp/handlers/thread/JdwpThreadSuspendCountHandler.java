package org.robovm.debugger.jdwp.handlers.thread;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Get the suspend count for this thread. The suspend count is the number of times the thread has been suspended
 * through the thread-level or VM-level suspend commands without a corresponding resume
 */
public class JdwpThreadSuspendCountHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadSuspendCountHandler(VmDebuggerState state) {
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

            if (thread.suspendCount() == 0)
                return JdwpConsts.Error.THREAD_NOT_SUSPENDED;

            output.writeInt32(thread.suspendCount());
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 11;
    }

    @Override
    public byte getCommand() {
        return 12;
    }

    @Override
    public String toString() {
        return "ThreadReference(11).SuspendCount(12)";
    }

}
