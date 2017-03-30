package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns information for each method in a reference type. Inherited methods are not included.
 * The list of methods will include constructors (identified with the name "<init>"), the initialization method
 * (identified with the name "<clinit>") if present, and any synthetic methods created by the compiler.
 * Methods are returned in the order they occur in the class file.
 */
public class JdwpRegTypeMethodsHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpRegTypeMethodsHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_OBJECT;
            MethodInfo[] fields = state.classInfoLoader().classMethods(classInfo);

            output.writeInt32(fields.length);
            for (MethodInfo methodInfo : fields) {
                output.writeLong(methodInfo.getRefId());
                output.writeStringWithLen(methodInfo.getName());
                output.writeStringWithLen(methodInfo.getDesc());
                output.writeInt32(methodInfo.modifiers());
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
        return 5;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Methods(5)";
    }

}
