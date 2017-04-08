package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the value of one or more static fields of the reference type.
 * Each field must be member of the reference type or one of its superclasses,
 * superinterfaces, or implemented interfaces. Access control is not enforced; for example,
 * the values of private fields can be obtained.
 */
public class JdwpRefTypeGetValuesHandler implements IJdwpRequestHandler {

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
        return 6;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).GetValues(6)";
    }
}
