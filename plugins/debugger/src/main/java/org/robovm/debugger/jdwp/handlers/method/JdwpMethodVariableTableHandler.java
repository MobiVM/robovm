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
import org.robovm.compiler.plugin.debug.DebuggerDebugVariableInfo;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.llvm.debuginfo.DwarfDebugMethodInfo;
import org.robovm.llvm.debuginfo.DwarfDebugVariableInfo;

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
            DebuggerDebugMethodInfo debugInfo = methodInfo.debugInfo();
            if (debugInfo == null) {
                // should not happen
                return JdwpConsts.Error.ABSENT_INFORMATION;
            }

            //argCnt The number of words in the frame used by arguments. Eight-byte arguments use two words; all others use one.
            int argCount = 0;
            output.writeInt32(argCount); // will write value later
            //slots The number of variables.
            output.writeInt32(debugInfo.localvariables().length);

            DebuggerDebugVariableInfo[] variables = debugInfo.localvariables();
            for (int idx = 0; idx < variables.length; idx++) {
                DebuggerDebugVariableInfo variable = variables[idx];

                if (variable.isArgument())
                    argCount += 1;

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

            // update argument count value
            output.setPosition(0);
            output.writeInt32(argCount);

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
