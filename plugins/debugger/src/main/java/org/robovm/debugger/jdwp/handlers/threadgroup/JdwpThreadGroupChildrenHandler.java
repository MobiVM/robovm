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
package org.robovm.debugger.jdwp.handlers.threadgroup;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.state.instances.VmThreadGroup;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Demyan Kimitsa
 * Returns the live threads and active thread groups directly contained in this thread group.
 */
public class JdwpThreadGroupChildrenHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpThreadGroupChildrenHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long threadGroupId = payload.readLong();

        synchronized (state.centralLock()) {
            VmThreadGroup threadGroup;
            try {
                threadGroup = state.referenceRefIdHolder().instanceById(threadGroupId);
            } catch (ClassCastException e){
                return JdwpConsts.Error.INVALID_THREAD_GROUP;
            }

            if (threadGroup == null)
                return JdwpConsts.Error.INVALID_THREAD_GROUP;

            // dump child threads
            output.writeInt32(0); // will override later
            int cnt = 0;
            for (VmThread thread : state.threads()) {
                if (thread.threadGroup().refId() == threadGroupId) {
                    output.writeLong(thread.refId());
                    cnt += 1;
                }
            }

            if (cnt != 0) {
                // override count
                output.setPosition(0);
                output.writeInt32(cnt);
                output.setPosition(output.size());
            }

            // collect child thread groups
            Set<Long> threadGroups = new HashSet<>();
            for (VmThread thread : state.threads()) {
                VmThreadGroup parent = thread.threadGroup().parent();
                if (parent != null && parent.refId() == threadGroupId)
                    threadGroups.add(thread.threadGroup().refId());
            }

            // dump child thread groups
            output.writeInt32(threadGroups.size());
            for (Long childGroupId : threadGroups)
                output.writeLong(childGroupId);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 12;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "ThreadGroup(12).Children(3)";
    }

}
