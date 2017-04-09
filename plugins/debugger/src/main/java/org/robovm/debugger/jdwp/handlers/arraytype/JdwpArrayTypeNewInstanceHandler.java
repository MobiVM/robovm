package org.robovm.debugger.jdwp.handlers.arraytype;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.array.IJdwpArrayDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Creates a new array object of this type with a given length.
 */
public class JdwpArrayTypeNewInstanceHandler implements IJdwpRequestHandler {
    private final IJdwpArrayDelegate delegate;

    public JdwpArrayTypeNewInstanceHandler(IJdwpArrayDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long arrayTypeId = payload.readLong();
        int length = payload.readInt32();

        try {
            long instanceId = delegate.jdwpArrayCreateInstance(arrayTypeId, length);

            output.writeByte(JdwpConsts.Tag.ARRAY);
            output.writeLong(instanceId);
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 4;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ArrayType(4).NewInstance(1)";
    }

}
