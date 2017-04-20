package org.robovm.debugger.jdwp.handlers.threadgroup;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.state.instances.VmThreadGroup;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Demyan Kimitsa
 * Returns the live threads and active thread groups directly contained in this thread group.
 */
public class JdwpThreadGroupChildrenHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpThreadGroupChildrenHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long threadGroupId = payload.readLong();

        synchronized (state.centralLock()) {
            VmThreadGroup threadGroup;
            try {
                threadGroup = state.referenceRefIdHolder().instanceById(threadGroupId);
            } catch (ClassCastException e){
                return JdwpConsts.Error.INVALID_THREAD_GROUP;
            }

            if (threadGroup == null)
                return JdwpConsts.Error.INVALID_THREAD_GROUP;

            // dump child threads
            output.writeInt32(0); // will override later
            int cnt = 0;
            for (VmThread thread : state.threads()) {
                if (thread.threadGroup().refId() == threadGroupId) {
                    output.writeLong(thread.refId());
                    cnt += 1;
                }
            }

            if (cnt != 0) {
                // override count
                output.setPosition(0);
                output.writeInt32(cnt);
                output.setPosition(output.size());
            }

            // collect child thread groups
            Set<Long> threadGroups = new HashSet<>();
            for (VmThread thread : state.threads()) {
                VmThreadGroup parent = thread.threadGroup().parent();
                if (parent != null && parent.refId() == threadGroupId)
                    threadGroups.add(thread.threadGroup().refId());
            }

            // dump child thread groups
            output.writeInt32(threadGroups.size());
            for (Long childGroupId : threadGroups)
                output.writeLong(childGroupId);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 12;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "ThreadGroup(12).Children(3)";
    }

}
