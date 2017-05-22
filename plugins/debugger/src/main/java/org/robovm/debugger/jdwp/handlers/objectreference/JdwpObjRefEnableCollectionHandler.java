package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 */
public class JdwpObjRefEnableCollectionHandler implements IJdwpRequestHandler{
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        // this handler does nothing just makes debuggers happy
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 9;
    }

    @Override
    public byte getCommand() {
        return 8;
    }

    @Override
    public String toString() {
        return "ObjectReference(9).EnableCollection(8)";
    }
}
