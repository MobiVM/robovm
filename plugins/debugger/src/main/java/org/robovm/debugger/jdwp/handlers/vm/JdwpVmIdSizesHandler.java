package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmSpecConsts;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the sizes of variably-sized data types in the target VM.The returned values indicate the number of
 * bytes used by the identifiers in command and reply packets.
 */
public class JdwpVmIdSizesHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        //Reply Data
        //int fieldID size in bytes
        output.writeInt32(VmSpecConsts.ID_SIZE);
        //int methodID size in bytes
        output.writeInt32(VmSpecConsts.ID_SIZE);
        //int objectID size in bytes
        output.writeInt32(VmSpecConsts.ID_SIZE);
        //int referenceTypeID size in bytes
        output.writeInt32(VmSpecConsts.ID_SIZE);
        //int frameID size in bytes
        output.writeInt32(VmSpecConsts.ID_SIZE);

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 7;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).IDSizes(7)";
    }

}
