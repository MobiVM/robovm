package org.robovm.debugger.jdwp.events;

import org.robovm.debugger.execution.EventData;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Base class for JDWP events
 */
public class JdwpEventData extends EventData {
    private final byte eventKind;
    private final VmThread thread;

    public JdwpEventData(byte eventKind, VmThread thread) {
        this.eventKind = eventKind;
        this.thread = thread;
    }

    public void dump(ByteBufferPacket packet, int requestId) {
        packet.writeByte(eventKind);
        packet.writeInt32(requestId);
        packet.writeLong(getThreadRefId());

        dumpCustomData(packet);
    }

    protected void dumpCustomData(ByteBufferPacket packet) {
    }

    public byte eventKind() {
        return eventKind;
    }

    public VmThread thread() {
        return thread;
    }

    @Override
    public long getThreadRefId() {
        return thread != null ? thread.getRefId() : 0;
    }

    /**
     * tells if specific action shall be canceled if not handled
     * for example some thread suspend shallbe reverted with thread resume if it was not handled
     * (for example exception one)
     * @return true to revert event actions
     */
    public boolean cancelIfNotHandled() {
        return false;
    }
}
