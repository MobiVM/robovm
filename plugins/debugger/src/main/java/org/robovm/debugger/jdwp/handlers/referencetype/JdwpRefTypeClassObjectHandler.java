package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the class object corresponding to this type.
 */
public class JdwpRefTypeClassObjectHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 11;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).ClassObject(11)";
    }

}
