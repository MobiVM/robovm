package org.robovm.debugger.jdwp.handlers.string;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the characters contained in the string.
 */
public class JdwpStringGetValueHandler implements IJdwpRequestHandler {

    private final IJdwpInstanceDelegate delegate;

    public JdwpStringGetValueHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long refId = payload.readLong();

        try {
            String stringValue = delegate.jdwpGetStringValue(refId);
            output.writeStringWithLen(stringValue);
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw  e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 10;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "StringReference(10).Value(1)";
    }
}
