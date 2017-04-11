package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Invokes a instance method. The method must be member of the object's type or one of its superclasses, superinterfaces, or implemented interfaces.
 */
public class JdwpObjRefInvokeMethodHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        return JdwpConsts.Error.NOT_IMPLEMENTED;
    }

    @Override
    public byte getCommandSet() {
        return 9;
    }

    @Override
    public byte getCommand() {
        return 6;
    }

    @Override
    public String toString() {
        return "ObjectReference(9).InvokeMethod(6)";
    }

}
