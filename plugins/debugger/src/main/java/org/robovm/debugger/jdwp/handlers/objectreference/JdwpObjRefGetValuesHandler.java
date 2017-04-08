package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the value of one or more instance fields. Each field must be member of the object's type or one of its superclasses,
 * superinterfaces, or implemented interfaces.
 */
public class JdwpObjRefGetValuesHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 9;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ObjectReference(9).GetValues(2)";
    }

}
