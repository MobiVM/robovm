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
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the count of frames on this thread's stack. The thread must be suspended, and the returned count is valid only
 * while the thread is suspended. Returns JDWP.Error.errorThreadNotSuspended if not suspended.
 */
public class JdwpThreadFramesCountHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadFramesCountHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long threadId = payload.readLong();

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

            // there are possibility that thread suspend request is sent but thread itself is not suspended yet
            // as suspend event is being sent only when thread is stopped on hookInstrumented
            VmStackTrace[] stack = thread.stack();
            output.writeInt32(stack != null ? stack.length : 0);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 11;
    }

    @Override
    public byte getCommand() {
        return 7;
    }

    @Override
    public String toString() {
        return "ThreadReference(11).FramesCount(7)";
    }
}
