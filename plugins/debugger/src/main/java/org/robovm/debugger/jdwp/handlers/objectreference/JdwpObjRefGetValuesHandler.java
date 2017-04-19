package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the value of one or more instance fields. Each field must be member of the object's type or one of its superclasses,
 * superinterfaces, or implemented interfaces.
 */
public class JdwpObjRefGetValuesHandler implements IJdwpRequestHandler {
    private final IJdwpInstanceDelegate delegate;

    public JdwpObjRefGetValuesHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long objectId = payload.readLong();
        int count = payload.readInt32();
        long[] fields = new long[count];
        for (int idx = 0; idx < count; idx++) {
            fields[idx] = payload.readLong();
        }

        // get values from target
        try {
            output.writeInt32(fields.length);
            delegate.jdwpFieldGetValues(objectId, fields, isStatic(), output);
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    /**
     * implementation wise it will be very similar to get static field ReferenceType(2).getValues
     * so it will reuse same class but will override is static (and identifiers)
     * @return true if handle for static fields
     */
    protected boolean isStatic() {
        return false;
    }

    @Override
    public byte getCommandSet() {
        return 9;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ObjectReference(9).GetValues(2)";
    }

}