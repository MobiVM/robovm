package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns reference types for all classes currently loaded by the target VM. Both the JNI signature and the generic
 * signature are returned for each class
 */
public class JdwpVmAllClassesWithGenericsHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {


        output.writeInt32(0); // TODO: implement

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 20;
    }
}
