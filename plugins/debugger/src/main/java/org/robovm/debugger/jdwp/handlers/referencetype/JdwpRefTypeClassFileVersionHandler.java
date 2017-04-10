package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the class file major and minor version numbers, as defined in the class file format of the Java Virtual Machine specification.
 */
public class JdwpRefTypeClassFileVersionHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpRefTypeClassFileVersionHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long refTypeId = payload.readLong();

        synchronized (state.centralLock()) {
            if (state.referenceRefIdHolder().objectById(refTypeId) == null)
                return JdwpConsts.Error.INVALID_CLASS;

            // return Java 1.8
            output.writeInt32(1);
            output.writeInt32(8);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 17;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).ClassFileVersion(17)";
    }

}
