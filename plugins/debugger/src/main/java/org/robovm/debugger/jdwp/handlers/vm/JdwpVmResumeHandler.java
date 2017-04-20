package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.thread.IJdwpThreadDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Resumes execution of the application after the suspend command or an event has stopped it
 */
public class JdwpVmResumeHandler implements IJdwpRequestHandler {

    IJdwpThreadDelegate delegate;

    public JdwpVmResumeHandler(IJdwpThreadDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        delegate.jdwpResumeAllThreads();
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 9;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).Suspend(9)";
    }

}
