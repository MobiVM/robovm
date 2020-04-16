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

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.instances.VmInstance;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Event data of stopped thread (step/breakpoint)
 */
public class JdwpThreadStoppedEventData extends JdwpEventData {

    private final VmStackTrace location;
    private final VmInstance exception;
    private final boolean caught;
    private final String className;

    public JdwpThreadStoppedEventData(byte eventKind, VmThread thread, VmStackTrace location) {
        super(eventKind, thread);
        this.location = location;
        this.exception = null;
        this.caught = false;
        this.className = makeClassName(location.classInfo());
    }

    public JdwpThreadStoppedEventData(byte eventKind, VmThread thread, VmStackTrace location, VmInstance exception, boolean caught) {
        super(eventKind, thread);
        this.location = location;
        this.exception = exception;
        this.caught = caught;
        this.className = makeClassName(location.classInfo());
    }

    @Override
    public long getExceptionTypeId() {
        return exception.classInfo().refId();
    }

    @Override
    public boolean isExceptionCaught() {
        return caught;
    }

    @Override
    public VmStackTrace getStoppeedLocation() {
        return location;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    protected void dumpCustomData(DataBufferWriter packet) {
        // write location
        packet.writeByte(JdwpConsts.TypeTag.CLASS);
        packet.writeLong(location.classInfo().refId());
        packet.writeLong(location.methodInfo().refId());
        packet.writeLong(location.lineNumber());

        // exception
        if (exception != null) {
            packet.writeByte(JdwpConsts.Tag.OBJECT);
            packet.writeLong(exception.refId());

            // exception location
            packet.writeLong(location.classInfo().refId());
            packet.writeLong(location.methodInfo().refId());
            packet.writeLong(location.lineNumber());
        }
    }

    @Override
    public boolean cancelIfNotHandled() {
        // don't stop application if there is no interested instance in it
        return true;
    }

}
