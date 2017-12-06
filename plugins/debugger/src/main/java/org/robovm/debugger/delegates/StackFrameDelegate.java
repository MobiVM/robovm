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
package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.stackframe.IJdwpStackFrameDelegate;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoLoader;
import org.robovm.debugger.state.classdata.RuntimeClassInfoLoader;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.llvm.debuginfo.DebugMethodInfo;
import org.robovm.llvm.debuginfo.DebugVariableInfo;

/**
 * @author Demyan Kimitsa
 * Groups operations around stack frame -- like getting variable name/values etc
 */
public class StackFrameDelegate implements IJdwpStackFrameDelegate {
    /**
     * all delegates and logic in one place
     */
    private final AllDelegates delegates;

    public StackFrameDelegate(AllDelegates delegates) {
        this.delegates = delegates;
    }

    /**
     * reads frame local variables
     */
    @Override
    public void getFrameValues(long threadId, long frameId, int[] varIndexes, byte[] varTags, ByteBufferPacket output) {
        VmDebuggerState state = delegates.state();
        // get variables just to validate that these are there and cast is working
        VmThread thread = state.referenceRefIdHolder().instanceById(threadId);
        if (thread == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
        VmStackTrace frame = state.frameRefIdHolder().objectById(frameId);
        if (frame == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_FRAMEID);

        // check if method has debug information
        DebugMethodInfo debugInfo = frame.methodInfo().debugInfo();
        if (debugInfo == null)
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);

        // move through variables and validate them
        DebugVariableInfo[] variables = debugInfo.localvariables();
        // will pick class info for variables during validation check
        ClassInfo[] classinfos = new ClassInfo[variables.length];
        int stackLineNumber = frame.lineNumber();
        RuntimeClassInfoLoader loader = delegates.instances().classInfoLoader();
        for (int idx : varIndexes) {
            // check if index in range and
            if (idx >= variables.length || stackLineNumber < variables[idx].startLine() || stackLineNumber > variables[idx].finalLine() ) {
                throw new DebuggerException(JdwpConsts.Error.INVALID_SLOT);
            }

            // check if type is loaded, dont bother about array signatures as these class infos will be resolved runtime
            classinfos[idx] = loader.loader().classInfoBySignature(variables[idx].typeSignature());
            if (classinfos[idx] == null && !ClassInfoLoader.isArraySignature(variables[idx].typeSignature())) {
                if (ClassInfoLoader.isPrimitiveSignature(variables[idx].typeSignature())) {
                    // if it is primitive -- build primitive type info
                    classinfos[idx] = loader.buildPrimitiveClassInfo(variables[idx].typeSignature());
                }

                if (classinfos[idx] == null || classinfos[idx].clazzPtr() == 0) {
                    // should not happen
                    throw new DebuggerException(JdwpConsts.Error.CLASS_NOT_PREPARED);
                }
            }
        }

        // tell JDWP number of variables about to be written
        output.writeInt32(varIndexes.length);

        // now can fetch data
        for (int idx : varIndexes) {
            // read variable right to JDPW output
            long addr = getVariableAddress(frame, variables[idx]);
            delegates.instances().getMemoryValue(addr, classinfos[idx], output);
        }
    }

    /**
     * gets frame local variable by its name (actually to get this value only)
     */
    @Override
    public void getFrameVariable(long threadId, long frameId, String variableName, ByteBufferPacket output) {
        VmDebuggerState state = delegates.state();
        // get variables just to validate that these are there and cast is working
        VmThread thread = state.referenceRefIdHolder().instanceById(threadId);
        if (thread == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
        VmStackTrace frame = state.frameRefIdHolder().objectById(frameId);
        if (frame == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_FRAMEID);

        // check if method has debug information
        DebugMethodInfo debugInfo = frame.methodInfo().debugInfo();
        if (debugInfo == null)
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);

        // move through variables and validate them
        DebugVariableInfo[] variables = debugInfo.localvariables();
        DebugVariableInfo variable = null;
        int stackLineNumber = frame.lineNumber();
        for (DebugVariableInfo v : variables) {
            if (stackLineNumber >= v.startLine() && stackLineNumber <= v.finalLine() && v.name().equals(variableName)) {
                variable = v;
                break;
            }
        }

        if (variable != null) {
            // read variable right to JDPW output
            // check if variable is loaded
            ClassInfo ci = state.classInfoLoader().classInfoBySignature(variable.typeSignature());
            if (ci == null || ci.clazzPtr() == 0) {
                // should not happen
                throw new DebuggerException(JdwpConsts.Error.CLASS_NOT_PREPARED);
            }


            long addr = getVariableAddress(frame, variable);
            delegates.instances().getMemoryValue(addr, ci, output);
        } else {
            output.writeByte(JdwpConsts.Tag.OBJECT);
            output.writeLong(0);
        }
    }

    /**
     * sets frame local variables to values
     *
     * @param threadId of thread
     * @param frameId  stack frame to check variables in
     * @param fromJdpw  JDWP byte packet with data to pick
     * @param count    number of frame values to set
     */
    @Override
    public void setFrameValues(long threadId, long frameId, ByteBufferPacket fromJdpw, int count) {
        VmDebuggerState state = delegates.state();
        // get variables just to validate that these are there and cast is working
        VmThread thread = state.referenceRefIdHolder().instanceById(threadId);
        if (thread == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
        VmStackTrace frame = state.frameRefIdHolder().objectById(frameId);
        if (frame == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_FRAMEID);

        // check if method has debug information
        DebugMethodInfo debugInfo = frame.methodInfo().debugInfo();
        if (debugInfo == null)
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);

        // move through variables and validate them
        DebugVariableInfo[] variables = debugInfo.localvariables();


        // it is hard to do this operation atomic without making duplicate runs of finding classes etc, so
        // skip packet validation and check each variable during processing it
        int stackLineNumber = frame.lineNumber();
        RuntimeClassInfoLoader loader = delegates.instances().classInfoLoader();
        while (count > 0) {
            count -= 1;

            // slot The slot ID.
            int idx = fromJdpw.readInt32();

            // check if index in range and
            if (idx >= variables.length || stackLineNumber < variables[idx].startLine() || stackLineNumber > variables[idx].finalLine() ) {
                throw new DebuggerException(JdwpConsts.Error.INVALID_SLOT);
            }

            // check if type is loaded, dont bother about array signatures as these class infos will be resolved runtime
            ClassInfo ci  = loader.loader().classInfoBySignature(variables[idx].typeSignature());
            if (ci == null && !ClassInfoLoader.isArraySignature(variables[idx].typeSignature())) {
                if (ClassInfoLoader.isPrimitiveSignature(variables[idx].typeSignature())) {
                    // if it is primitive -- build primitive type info
                    ci = loader.buildPrimitiveClassInfo(variables[idx].typeSignature());
                }

                if (ci == null || ci.clazzPtr() == 0) {
                    // should not happen
                    throw new DebuggerException(JdwpConsts.Error.CLASS_NOT_PREPARED);
                }
            }

            // write variable value right from jdpw payload
            long addr = getVariableAddress(frame, variables[idx]);
            // the value is tagger, so just skip tag
            int tag = fromJdpw.readByte();
            delegates.instances().setMemoryValue(addr, ci, null, fromJdpw);
        }
    }

    /**
     * Finds out the variable address by looking into debug information
     * @param frame stack frame this variable to be read from
     * @param variableInfo information of variable location within stack
     * @return variable address
     */
    private long getVariableAddress(VmStackTrace frame, DebugVariableInfo variableInfo) {
        // get the memory address to read from based on debug information
        long addr;
        if (variableInfo.register() == DebugVariableInfo.OP_fbreg) {
            // FP register on x86 and ARM64
            addr = frame.fp() + variableInfo.offset();
        } else  if (variableInfo.register() == DebugVariableInfo.OP_breg31 || variableInfo.register() == DebugVariableInfo.OP_breg13){
            // SP on thumb7(R13)
            // RSP register on ARM64
            // align using SpFpOffset data
            addr = (frame.fp() - frame.methodInfo().spFpOffset()) & ~(frame.methodInfo().spFpAlign() - 1);
            addr += variableInfo.offset();
        } else {
            // TODO:
            throw new DebuggerException("Unexpected register for stack trace variable " + DebugVariableInfo.registerName(variableInfo.register()));
        }

        return addr;
    }
}
