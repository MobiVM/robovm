package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns reference types for all the classes loaded by the target VM which match the given signature.
 * In RoboVM one instance is possible
 */
public class JdwpVmClassesBySignatureHandler implements IJdwpRequestHandler{

    private final VmDebuggerState state;

    public JdwpVmClassesBySignatureHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        String signature = payload.readStringWithLen();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classBySignature(signature);
            if (classInfo != null) {
                // Number of reference types that follow.
                output.writeInt32(1);
                // refTypeTag
                output.writeByte(Converter.jdwpTypeTag(classInfo));
                // typeID
                output.writeLong(classInfo.getRefId());
                // status
                output.writeInt32(Converter.jdwpClassStatus(classInfo));
            } else {
                // no class found
                // TODO: logging here
                output.writeInt32(0); // Number of reference types that follow.
            }
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).ClassesBySignature(2)";
    }
}
