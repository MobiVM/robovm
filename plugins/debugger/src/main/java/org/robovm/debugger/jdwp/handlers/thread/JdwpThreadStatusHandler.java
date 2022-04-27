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

import org.robovm.debugger.hooks.HookConsts;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the current status of a thread. The thread status reply indicates the thread status the last time it was running.
 * the suspend status provides information on the thread's suspension, if any.
 */
public class JdwpThreadStatusHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadStatusHandler(VmDebuggerState state) {
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

            // return running all time as for now, as status (wait/sleeping) is not available on object level 
            output.writeInt32(Converter.jdwpThreadStatus(thread));
            // suspended -- only if thread is running suspend cycle that can execute invoke command
            output.writeInt32(thread.getHookSuspendStatus() == HookConsts.threadSuspendStatus.SUSPENDED_SOFT ||
                    thread.getHookSuspendStatus() == HookConsts.threadSuspendStatus.SUSPENDED_HARD
                    ? JdwpConsts.SuspendStatus.SUSPEND_STATUS_SUSPENDED 
                    : JdwpConsts.SuspendStatus.SUSPEND_STATUS_NOT_SUSPENDED);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 11;
    }

    @Override
    public byte getCommand() {
        return 4;
    }

    @Override
    public String toString() {
        return "ThreadReference(11).Status(4)";
    }

}
