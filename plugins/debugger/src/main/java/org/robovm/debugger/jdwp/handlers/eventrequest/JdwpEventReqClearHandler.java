package org.robovm.debugger.jdwp.handlers.eventrequest;

import org.robovm.debugger.execution.ExecutionControlCenter;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Clear an event request.
 */
public class JdwpEventReqClearHandler implements IJdwpRequestHandler {

    private final ExecutionControlCenter center;

    public JdwpEventReqClearHandler(ExecutionControlCenter center) {
        this.center = center;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        byte eventKind = payload.readByte();
        int requestID = payload.readInt32();
        return center.jdwpClearEventRequest(eventKind, requestID);
    }

    @Override
    public byte getCommandSet() {
        return 15;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "EventRequest(15).Clear(2)";
    }
}
