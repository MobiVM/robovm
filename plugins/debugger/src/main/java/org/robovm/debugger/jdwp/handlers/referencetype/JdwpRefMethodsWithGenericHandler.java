package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns information, including the generic signature if any, for each method in a reference type. Inherited methodss are not included.
 */
public class JdwpRefMethodsWithGenericHandler implements IJdwpRequestHandler {
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
        return 15;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).MethodsWithGeneric(15)";
    }

}
