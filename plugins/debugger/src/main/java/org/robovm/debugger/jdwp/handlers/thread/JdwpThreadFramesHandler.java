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
package org.robovm.debugger.jdwp.handlers.thread;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 */
public class JdwpThreadFramesHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadFramesHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long threadId = payload.readLong();
        int startFrame = payload.readInt32();
        int length = payload.readInt32();

        synchronized (state.centralLock()) {
            VmThread thread;
            try {
                thread = state.referenceRefIdHolder().instanceById(threadId);
            } catch (ClassCastException e){
                return JdwpConsts.Error.INVALID_THREAD;
            }

            if (thread == null)
                return JdwpConsts.Error.INVALID_THREAD;

            if (thread.suspendCount() == 0)
                return JdwpConsts.Error.THREAD_NOT_SUSPENDED;

            VmStackTrace[] stack = thread.stack();
            int lastFrame = -1;
            if (stack != null)
                lastFrame = length < 0 ? stack.length - 1 : startFrame + length - 1;
            if (stack == null || startFrame > stack.length - 1 || lastFrame > stack.length - 1 || startFrame > lastFrame) {
                // wrong indexes or there is no stack, report zero entries
                output.writeInt32(0);
            } else {
                // frames The number of frames retrieved
                output.writeInt32(lastFrame - startFrame + 1);

                // dump each frame location
                for (int i = startFrame; i <= lastFrame; i++) {
                    VmStackTrace frame = stack[i];
                    // frame id
                    output.writeLong(frame.refId());
                    // location
                    output.writeByte(Converter.jdwpTypeTag(frame.classInfo()));
                    output.writeLong(frame.classInfo().refId());
                    output.writeLong(frame.methodInfo().refId());
                    output.writeLong(frame.lineNumber());
                }
            }
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 11;
    }

    @Override
    public byte getCommand() {
        return 6;
    }

    @Override
    public String toString() {
        return "ThreadReference(11).Frames(6)";
    }

}
