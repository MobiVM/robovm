package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the interfaces declared as implemented by this class
 */
public class JdwpRefTypeInterfacesHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpRefTypeInterfacesHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classInfoByRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_OBJECT;
            if (!classInfo.isClass() || !classInfo.isArray())
                return JdwpConsts.Error.INVALID_CLASS;

            ClassInfo[] interfaces = classInfo.interfaces(state.classInfoLoader());
            output.writeInt32(interfaces.length);
            for (ClassInfo intf : interfaces) {
                output.writeLong(intf.refId());
            }
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 10;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Interfaces(10)";
    }

}
