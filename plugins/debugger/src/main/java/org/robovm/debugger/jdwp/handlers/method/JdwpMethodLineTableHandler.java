package org.robovm.debugger.jdwp.handlers.method;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.llvm.debuginfo.DebugMethodInfo;

/**
 * @author Demyan Kimitsa
 * Returns line number information for the method, if present. The line table maps source line numbers to the initial
 * code index of the line.
 */
public class JdwpMethodLineTableHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpMethodLineTableHandler(VmDebuggerState state) {
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

            int startLine;
            int finalLine;

            DebugMethodInfo debugInfo = methodInfo.debugInfo();
            if (debugInfo == null) {
                // should not happen
                // TODO: temporal solution just to keep going, FIXME:
                startLine = -1;
                finalLine = 1000;
            } else {
                startLine = debugInfo.startLine();
                finalLine = debugInfo.finalLine();
            }

            // dump line numbers as code index
            output.writeLong(startLine); // start code index
            output.writeLong(finalLine); // end code index

            output.writeInt32(finalLine - startLine + 1); // count map entrie
            for (int lineNo = startLine; lineNo <= finalLine; lineNo++) {
                output.writeLong(startLine); // code index
                output.writeInt32(startLine); // line number
            }

            return JdwpConsts.Error.NONE;
        }
    }

    @Override
    public byte getCommandSet() {
        return 6;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "Method(6).LineTable(1)";
    }

}
