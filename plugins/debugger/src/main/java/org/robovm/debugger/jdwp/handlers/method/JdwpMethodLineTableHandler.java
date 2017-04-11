package org.robovm.debugger.jdwp.handlers.method;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns line number information for the method, if present. The line table maps source line numbers to the initial
 * code index of the line.
 */
public class JdwpMethodLineTableHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return JdwpConsts.Error.ABSENT_INFORMATION;
    }

    @Override
    public byte getCommandSet() {
        return 6;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "Method(6).LineTable(1)";
    }

}
