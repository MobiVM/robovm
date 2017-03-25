package org.robovm.debugger.jdwp.events;

import org.robovm.debugger.execution.EventData;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Base class for JDWP events
 */
public class JdwpEventData extends EventData {
    private final byte eventKind;
    private final long threadId;

    public JdwpEventData(byte eventKind, long threadId) {
        this.eventKind = eventKind;
        this.threadId = threadId;
    }

    public void dump(ByteBufferPacket packet, int requestId) {
        packet.writeByte(eventKind);
        packet.writeInt32(requestId);
        packet.writeLong(threadId);

        dumpCustomData(packet);
    }

    protected void dumpCustomData(ByteBufferPacket packet) {
    }

    @Override
    public long getThreadRefId() {
        return threadId;
    }
}
