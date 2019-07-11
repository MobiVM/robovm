/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.jdwp.handlers.method;

import org.robovm.compiler.plugin.debug.DebuggerDebugMethodInfo;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.llvm.debuginfo.DwarfDebugMethodInfo;

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

            DebuggerDebugMethodInfo debugInfo = methodInfo.debugInfo();
            if (debugInfo == null) {
                // should not happen
                return JdwpConsts.Error.ABSENT_INFORMATION;
            }

            // dump line numbers as code index
            int startLine = debugInfo.startLine();
            int finalLine = debugInfo.finalLine();
            output.writeLong(startLine); // start code index
            output.writeLong(finalLine); // end code index

            output.writeInt32(finalLine - startLine + 1); // count map entrie
            for (int lineNo = startLine; lineNo <= finalLine; lineNo++) {
                output.writeLong(lineNo); // code index
                output.writeInt32(lineNo); // line number
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
