package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the instance of java.lang.ClassLoader which loaded a given reference type. If the reference type was
 * loaded by the system class loader, the returned object ID is null.
 */
public class JdwpRegTypeClassLoaderHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        // loaded by the system class loader, the returned object ID is null
        output.writeLong(0);
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).ClassLoader(2)";
    }
}
