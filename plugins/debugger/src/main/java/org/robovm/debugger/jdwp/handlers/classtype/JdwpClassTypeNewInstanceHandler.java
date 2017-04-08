package org.robovm.debugger.jdwp.handlers.classtype;

import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Creates a new object of this type, invoking the specified constructor. The constructor method ID must be a member of the class type.
 */
public class JdwpClassTypeNewInstanceHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 3;
    }

    @Override
    public byte getCommand() {
        return 4;
    }

    @Override
    public String toString() {
        return "ClassType(3).NewInstance(4)";
    }

}
