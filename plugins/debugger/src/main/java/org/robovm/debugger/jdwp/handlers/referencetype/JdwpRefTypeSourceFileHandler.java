package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the name of source file in which a reference type was declared
 */
public class JdwpRefTypeSourceFileHandler implements IJdwpRequestHandler{
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        // TODO: currently there is no such information available
        // revert back once there is variable inforamtion in place
        return JdwpConsts.Error.ABSENT_INFORMATION;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 7;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).SourceFile(7)";
    }

}
