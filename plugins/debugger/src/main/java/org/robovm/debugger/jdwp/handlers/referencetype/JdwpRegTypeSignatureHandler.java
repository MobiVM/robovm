package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the JNI signature of a reference type.
 */
public class JdwpRegTypeSignatureHandler implements IJdwpRequestHandler {
    private final VmDebuggerState vmDebuggerState;

    public JdwpRegTypeSignatureHandler(VmDebuggerState vmDebuggerState) {
        this.vmDebuggerState = vmDebuggerState;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long referenceTypeID = payload.readLong();
        ClassInfo classInfo = vmDebuggerState.classInfoLoader().classRefId(referenceTypeID);
        if (classInfo == null)
            return JdwpConsts.Error.INVALID_OBJECT;

        output.writeStringWithLen(classInfo.getSignature());
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Signature(1)";
    }

}
