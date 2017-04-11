package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.instances.VmClassInstance;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the class object corresponding to this type.
 */
public class JdwpRefTypeClassObjectHandler implements IJdwpRequestHandler {
    private final IJdwpInstanceDelegate delegate;

    public JdwpRefTypeClassObjectHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long instanceId = payload.readLong();

        // get values from target
        try {
            VmClassInstance clazzInstance = delegate.jdwpGetClazzObject(instanceId);
            output.writeLong(clazzInstance.refId());
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 11;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).ClassObject(11)";
    }

}
