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
import org.robovm.debugger.state.instances.VmThreadGroup;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Demyan Kimitsa
 * Returns all thread groups that do not have a parent. This command may be used as the first step in building a tree
 * (or trees) of the existing thread groups.
 */
public class JdwpVmTopLevelThreadGroupsHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpVmTopLevelThreadGroupsHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        synchronized (state.centralLock()) {
            // write dummy len to rewrite later as actual amount of items is not known yet
            output.writeInt32(0);
            List<VmThread> threads = state.threads();
            Set<Long> reportedGroups = new HashSet<>();
            for (VmThread thread : threads) {
                VmThreadGroup group = thread.threadGroup();
                if (group.parent() != null)
                    continue;
                if (reportedGroups.contains(group.refId()))
                    continue;

                reportedGroups.add(group.refId());
                output.writeLong(group.refId());
            }

            output.setPosition(0);
            output.writeInt32(reportedGroups.size());
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 5;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).TopLevelThreadGroups(5)";
    }
}
