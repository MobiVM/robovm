package org.robovm.debugger.jdwp.handlers.classtype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Invokes a static method. The method must be member of the class type or one of its superclasses, superinterfaces, or implemented interfaces
 */
public class JdwpClassTypeInvokeMethodHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return JdwpConsts.Error.NOT_IMPLEMENTED;
    }

    @Override
    public byte getCommandSet() {
        return 3;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "ClassType(3).InvokeMethod(3)";
    }

}
