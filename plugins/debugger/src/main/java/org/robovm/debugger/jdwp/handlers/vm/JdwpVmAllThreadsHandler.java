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
package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

import java.util.List;

/**
 * @author Demyan Kimitsa
 * Returns all threads currently running in the target VM . The returned list contains threads created through java.lang.Thread,
 * all native threads attached to the target VM through JNI, and system threads created by the target VM.
 */
public class JdwpVmAllThreadsHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpVmAllThreadsHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        synchronized (state.centralLock()) {
            List<VmThread> threads = state.threads();
            output.writeInt32(threads.size());
            for (VmThread thread : threads)
                output.writeLong(thread.refId());
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 4;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).AllThreads(4)";
    }
}
