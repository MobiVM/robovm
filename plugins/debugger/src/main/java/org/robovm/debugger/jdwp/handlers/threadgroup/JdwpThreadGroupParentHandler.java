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
import org.robovm.debugger.state.instances.VmThreadGroup;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the thread group, if any, which contains a given thread group.
 */
public class JdwpThreadGroupParentHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpThreadGroupParentHandler(VmDebuggerState state) {
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

            VmThreadGroup parent = threadGroup.parent();
            output.writeLong(parent != null ? parent.refId() : 0);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 12;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ThreadGroup(12).Parent(2)";
    }

}
