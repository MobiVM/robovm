package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the class file major and minor version numbers, as defined in the class file format of the Java Virtual Machine specification.
 */
public class JdwpRefClassFileVersionHandler implements IJdwpRequestHandler {
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
        return 17;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).ClassFileVersion(17)";
    }

}
