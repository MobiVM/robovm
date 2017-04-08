package org.robovm.debugger.jdwp.handlers.classobjectreference;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 *  Returns the reference type reflected by this class object.
 */
public class JdwpClassObjRefReflectedTypeHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 17;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "Method(17).ReflectedType(1)";
    }

}
