package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the modifiers (also known as access flags) for a reference type. The returned bit mask contains information on
 * the declaration of the reference type. If the reference type is an array or a primitive class (for example,
 * java.lang.Integer.TYPE), the value of the returned bit mask is undefined.
 */
public class JdwpRefTypeModifiersHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpRefTypeModifiersHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_OBJECT;

            output.writeInt32(classInfo.modifiers());
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Modifiers(3)";
    }

}
