package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmInstance;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

import javax.naming.CompositeName;

/**
 * @author Demyan Kimitsa
 * Returns the runtime type of the object. The runtime type will be a class or an array.
 */
public class JdwpObjRefReferenceTypeHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpObjRefReferenceTypeHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long objectId = payload.readLong();

        synchronized (state.centralLock()) {
            VmInstance instance = state.referenceRefIdHolder().instanceById(objectId);
            if (instance == null)
                return JdwpConsts.Error.INVALID_OBJECT;


            output.writeByte(Converter.jdwpTypeTag(instance.classInfo()));
            output.writeLong(instance.classInfo().refId());
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 9;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ObjectReference(9).ReferenceType(1)";
    }

}
