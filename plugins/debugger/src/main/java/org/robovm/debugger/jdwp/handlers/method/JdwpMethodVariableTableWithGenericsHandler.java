package org.robovm.debugger.jdwp.handlers.method;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns variable information for the method, including generic signatures for the variables. The variable table includes arguments and locals declared within the method.
 */
public class JdwpMethodVariableTableWithGenericsHandler implements IJdwpRequestHandler {
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
        return 5;
    }

    @Override
    public String toString() {
        return "Method(6).VariableTableWithGenerics(5)";
    }

}
