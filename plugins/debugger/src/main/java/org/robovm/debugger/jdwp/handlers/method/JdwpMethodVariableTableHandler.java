package org.robovm.debugger.jdwp.handlers.method;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.llvm.debuginfo.DebugMethodInfo;
import org.robovm.llvm.debuginfo.DebugVariableInfo;

/**
 * @author Demyan Kimitsa
 * Returns variable information for the method. The variable table includes arguments and locals declared within the method.
 */
public class JdwpMethodVariableTableHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpMethodVariableTableHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long refTypeId = payload.readLong();
        long methodId = payload.readLong();
        synchronized (state.centralLock()) {
            MethodInfo methodInfo = state.methodsRefIdHolder().objectById(methodId);
            if (methodInfo == null)
                return JdwpConsts.Error.INVALID_METHODID;
            DebugMethodInfo debugInfo = methodInfo.debugInfo();
            if (debugInfo == null) {
                // should not happen
                // TODO: log
                return JdwpConsts.Error.ABSENT_INFORMATION;
            }

            //argCnt The number of words in the frame used by arguments. Eight-byte arguments use two words; all others use one.
            // todo: probably wrong
            output.writeInt32(0);
            //slots The number of variables.
            output.writeInt32(debugInfo.localvariables().length);

            DebugVariableInfo[] variables = debugInfo.localvariables();
            for (int idx = 0; idx < variables.length; idx++) {
                DebugVariableInfo variable = variables[idx];

                //codeIndex First code index at which the variable is visible (unsigned). Used in conjunction with length.
                // The variable can be get or set only when the current codeIndex <= current frame code index < codeIndex + length
                output.writeLong(variable.startLine());
                // name The variable's name.
                output.writeStringWithLen(variable.name());
                // signature The variable type's JNI signature.
                output.writeStringWithLen(variable.typeSignature());
                if (shallWriteEmptyGeneric()) {
                    // genericSignature The variable type's generic signature or an empty string if there is none.
                    output.writeStringWithLen("");
                }
                // length Unsigned value used in conjunction with codeIndex. The variable can be get or set only when the
                // current codeIndex <= current frame code index < code index + length
                output.writeInt32(variable.finalLine() - variable.startLine() + 1);
                // slot The local variable's index in its frame
                output.writeInt32(idx);
            }

            return JdwpConsts.Error.NONE;
        }
    }

    protected boolean shallWriteEmptyGeneric() {
        // subclasses to overload
        return false;
    }


    @Override
    public byte getCommandSet() {
        return 6;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "Method(6).VariableTable(2)";
    }

}
