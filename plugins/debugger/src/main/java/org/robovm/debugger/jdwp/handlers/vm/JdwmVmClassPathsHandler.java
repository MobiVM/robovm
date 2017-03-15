package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Retrieve the classpath and bootclasspath of the target VM. If the classpath is not defined, returns an empty list.
 * If the bootclasspath is not defined returns an empty list.
 */
public class JdwmVmClassPathsHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        // base dir
        output.writeStringWithLen(".");
        // there is no class path
        output.writeInt32(0);
        // there is no boot class path
        output.writeInt32(0);

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 13;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).ClassPaths(13)";
    }
}
