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

import org.robovm.debugger.debuginfo.DebuggerDebugMethodInfo;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

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
    public short handle(DataBufferReader payload, DataBufferWriter output) {
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

            // read bptable from mach-o executable, it contains bits set where lines are not available
            int arraySize = ((finalLine - startLine + 1) + 7) / 8;
            state.appFileDataMemoryReader().setPosition(methodInfo.bpTableAddr());
            byte[] bpTable = state.appFileDataMemoryReader().readBytes(arraySize);

            long savedCntPos = output.position();
            output.writeInt32(0); // count map entries -- will be set once calculated
            int cnt = 0;
            int idx = 0;
            byte mask = 0;
            for (int lineNo = startLine; lineNo <= finalLine; lineNo++) {
                // pick mask from bp table each 8 bits
                if ((idx & 7) == 0)
                    mask = bpTable[idx >> 3];

                if ((mask & 1) == 0) {
                    // line is available
                    output.writeLong(lineNo); // code index
                    output.writeInt32(lineNo); // line number
                    cnt += 1;
                }

                idx += 1;
                mask >>= 1;
            }

            // update cnt
            output.setPosition(savedCntPos);
            output.writeInt32(cnt);
            output.setPosition(output.size());

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
