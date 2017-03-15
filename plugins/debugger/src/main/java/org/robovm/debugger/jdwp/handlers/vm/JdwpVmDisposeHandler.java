package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitds
 */
public class JdwpVmDisposeHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        // TODO:
        // All event requests are cancelled.
        // All threads suspended by the thread-level resume command or the VM-level resume command are resumed as many
        // times as necessary for them to run.

        // TODO: stub for now
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 6;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).Dispose(6)";
    }
}
