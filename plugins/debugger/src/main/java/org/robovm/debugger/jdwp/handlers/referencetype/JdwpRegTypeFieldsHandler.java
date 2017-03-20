package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.FieldInfo;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns information for each field in a reference type. Inherited fields are not included. The field list will
 * include any synthetic fields created by the compiler. Fields are returned in the order they occur in the class file.
 */
public class JdwpRegTypeFieldsHandler implements IJdwpRequestHandler {

    private final VmDebuggerState vmDebuggerState;

    public JdwpRegTypeFieldsHandler(VmDebuggerState vmDebuggerState) {
        this.vmDebuggerState = vmDebuggerState;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long referenceTypeID = payload.readLong();
        ClassInfo classInfo = vmDebuggerState.classInfoLoader().classRefId(referenceTypeID);
        if (classInfo == null)
            return JdwpConsts.Error.INVALID_OBJECT;
        FieldInfo[] fields = vmDebuggerState.classInfoLoader().classFields(classInfo);

        output.writeInt32(fields.length);
        for (FieldInfo fieldInfo : fields) {
            output.writeLong(fieldInfo.getRefId());
            output.writeStringWithLen(fieldInfo.name);
            output.writeStringWithLen(fieldInfo.desc);
            output.writeInt32(Converter.jdwpModifierBits(fieldInfo));
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 4;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Fields(4)";
    }

}
