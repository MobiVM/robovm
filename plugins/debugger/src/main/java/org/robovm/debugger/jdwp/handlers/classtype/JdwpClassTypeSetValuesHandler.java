package org.robovm.debugger.jdwp.handlers.classtype;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Sets the value of one or more static fields. Each field must be member of the class type or one of its superclasses,
 * superinterfaces, or implemented interfaces.
 */
public class JdwpClassTypeSetValuesHandler implements IJdwpRequestHandler {
    private final IJdwpInstanceDelegate delegate;

    public JdwpClassTypeSetValuesHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long objectId = payload.readLong();
        int count = payload.readInt32();


        // set values to target
        try {
            // all field ids and values are multiplexed in data flow, so it will be handled in delegate
            delegate.jdwpFieldSetValues(objectId, count, true, payload);
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 3;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ClassType(3).SetValues(2)";
    }

}
