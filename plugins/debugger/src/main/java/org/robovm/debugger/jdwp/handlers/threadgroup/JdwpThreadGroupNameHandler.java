package org.robovm.debugger.jdwp.handlers.threadgroup;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThreadGroup;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the thread group name.
 */
public class JdwpThreadGroupNameHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadGroupNameHandler(VmDebuggerState state) {
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

            output.writeStringWithLen(threadGroup.name());
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 12;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ThreadGroup(12).Name(1)";
    }

}
