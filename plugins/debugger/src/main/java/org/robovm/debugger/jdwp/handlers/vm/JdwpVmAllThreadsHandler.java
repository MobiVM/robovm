package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

import java.util.List;

/**
 * @author Demyan Kimitsa
 * Returns all threads currently running in the target VM . The returned list contains threads created through java.lang.Thread,
 * all native threads attached to the target VM through JNI, and system threads created by the target VM.
 */
public class JdwpVmAllThreadsHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpVmAllThreadsHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        synchronized (state.centralLock()) {
            List<VmThread> threads = state.threads();
            output.writeInt32(threads.size());
            for (VmThread thread : threads)
                output.writeLong(thread.refId());
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 4;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).AllThreads(4)";
    }
}
