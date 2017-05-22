package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 */
public class JdwpObjRefIsCollectedHandler  implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpObjRefIsCollectedHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long objectId = payload.readLong();
        synchronized (state.centralLock()) {
            output.writeBoolean(state.referenceRefIdHolder().instanceById(objectId) == null);
        }
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 9;
    }

    @Override
    public byte getCommand() {
        return 9;
    }

    @Override
    public String toString() {
        return "ObjectReference(9).IsCollected(9)";
    }

}
