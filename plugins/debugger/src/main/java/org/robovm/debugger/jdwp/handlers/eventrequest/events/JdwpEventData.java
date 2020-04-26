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
package org.robovm.debugger.jdwp.handlers.eventrequest.events;

import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Base class for JDWP events
 */
public class JdwpEventData extends EventData {
    private final byte eventKind;
    private final VmThread thread;

    public JdwpEventData(byte eventKind, VmThread thread) {
        this.eventKind = eventKind;
        this.thread = thread;
    }

    public void dump(DataBufferWriter packet, int requestId) {
        packet.writeByte(eventKind);
        packet.writeInt32(requestId);
        packet.writeLong(getThreadRefId());

        dumpCustomData(packet);
    }

    protected void dumpCustomData(DataBufferWriter packet) {
    }

    public byte eventKind() {
        return eventKind;
    }

    public VmThread thread() {
        return thread;
    }

    @Override
    public long getThreadRefId() {
        return thread != null ? thread.refId() : 0;
    }

    /**
     * tells if specific action shall be canceled if not handled
     * for example some thread suspend shallbe reverted with thread resume if it was not handled
     * (for example exception one)
     * @return true to revert event actions
     */
    public boolean cancelIfNotHandled() {
        return false;
    }

    protected String makeClassName(ClassInfo classInfo) {
        if (classInfo instanceof ClassInfoImpl)
            return ((ClassInfoImpl)classInfo).className().replace('/','.');
        return null;
    }
}
