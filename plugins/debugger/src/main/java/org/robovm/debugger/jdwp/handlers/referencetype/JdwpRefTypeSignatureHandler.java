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
public class JdwpRefTypeSignatureHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpRefTypeSignatureHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classInfoByRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_OBJECT;

            output.writeStringWithLen(classInfo.signature());
            String signatureWithGeneric = getGenericSignature();
            if (signatureWithGeneric != null)
                output.writeStringWithLen(signatureWithGeneric);
        }

        return JdwpConsts.Error.NONE;
    }

    protected String getGenericSignature() {
        // to subclass to override
        return null;
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
