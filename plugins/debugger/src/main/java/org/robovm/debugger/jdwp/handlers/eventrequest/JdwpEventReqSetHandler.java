package org.robovm.debugger.jdwp.handlers.eventrequest;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Set an event request. When the event described by this request occurs, an event is sent from the target VM.
 * If an event occurs that has not been requested then it is not sent from the target VM. The two exceptions to this
 * are the VM Start Event and the VM Death Event which are automatically generated events
 */
public class JdwpEventReqSetHandler implements IJdwpRequestHandler {
    private int requestCounter = 100;

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        // parse input
        byte eventKind = payload.readByte();
        byte suspendPolicy = payload.readByte();
        int modifierCount = payload.readInt32();
        for (int i = 0; i < modifierCount; i++) {
            byte modKind = payload.readByte();
            if (modKind == 1) {
                int count = payload.readInt32();
            } else if (modKind == 2) {
                int exprID = payload.readInt32();
            } else if (modKind == 3) {
                long threadID = payload.readLong();
            } else if (modKind == 4) {
                long referenceTypeID = payload.readLong();
            } else if (modKind == 5) {
                String classPattern = payload.readStringWithLen();
            } else if (modKind == 6) {
                String classPattern = payload.readStringWithLen();
            } else if (modKind == 7) {
                byte tag = payload.readByte();
                long classID = payload.readLong();
                long methodID = payload.readLong();
                long index = payload.readLong();
            } else if (modKind == 8) {
                long referenceTypeID = payload.readLong();
                boolean caught = payload.readByte() != 0;
                boolean uncaught = payload.readByte() != 0;
            } else if (modKind == 9) {
                long referenceTypeID = payload.readLong();
                long fieldID = payload.readLong();
            } else if (modKind == 10) {
                long thread = payload.readLong();
                int size = payload.readInt32();
                int depth = payload.readInt32();
            } else if (modKind == 11) {
                long instance = payload.readLong();
            } else {
                throw new DebuggerException("unsupported modifier kind " + modKind);
            }
        }

        output.writeInt32(requestCounter++);// TODO: requestID
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 15;
    }

    @Override
    public byte getCommand() {
        return 1;
    }
}
