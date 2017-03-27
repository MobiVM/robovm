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

    @Override
    public long getThreadRefId() {
        return thread != null ? thread.getRefId() : 0;
    }
}
