package org.robovm.debugger.jdwp.handlers.classtype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassDataConsts;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the immediate superclass of a class.
 */
public class JdwpClassTypeSuperclassHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpClassTypeSuperclassHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long clazzId = payload.readLong();

        synchronized (state.centralLock()) {

            ClassInfo ci = state.classRefIdHolder().objectById(clazzId);
            if (ci == null)
                return JdwpConsts.Error.INVALID_OBJECT;
            if (!ci.isClass())
                return JdwpConsts.Error.INVALID_CLASS;

            ClassInfoImpl cii = (ClassInfoImpl) ci;
            if (ClassDataConsts.signatures.JAVA_LANG_OBJECT.equals(ci.signature())) {
                output.writeLong(0);
            } else if (cii.superclassSignature() != null){
                ci = state.classInfoLoader().classInfoBySignature(cii.superclassSignature());
                output.writeLong(ci.refId());
            } else {
                // should not happen
                return JdwpConsts.Error.INVALID_CLASS;
            }
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 3;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ClassType(3).Superclass(1)";
    }

}
