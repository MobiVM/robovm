package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.instances.VmStringInstance;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Creates a new string object in the target VM and returns its id.
 */
public class JdwpVmCreateStringHandler implements IJdwpRequestHandler {
    private final IJdwpInstanceDelegate delegate;

    public JdwpVmCreateStringHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        String value = payload.readStringWithLen();

        try {
            VmStringInstance res = delegate.jdwpCreateStringInstance(value);
            output.writeLong(res.refId());
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw  e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 11;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).CreateString(11)";
    }

}
