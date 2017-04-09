package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.state.instances.VmThreadGroup;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Demyan Kimitsa
 * Suspends the execution of the application running in the target VM. All Java threads currently running will be suspended.
 */
public class JdwpVmSuspendHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 8;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).Suspend(8)";
    }

}
