package org.robovm.debugger.jdwp.handlers.threadgroup;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThreadGroup;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the thread group, if any, which contains a given thread group.
 */
public class JdwpThreadGroupParentHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadGroupParentHandler(VmDebuggerState state) {
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

            VmThreadGroup parent = threadGroup.parent();
            output.writeLong(parent != null ? parent.refId() : 0);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 12;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ThreadGroup(12).Parent(2)";
    }

}
