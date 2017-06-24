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

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.state.instances.VmStackTrace;

/**
 * @author Demyan Kimitsa
 * Base abstract class that is being used as subject for event filtering in predicates
 */
public abstract class EventData {
    private final static String EXCEPTION_MSG = "Unexpected fields are accessed, check if filter is build properly";

    public long getThreadRefId() {
        throw new DebuggerException(EXCEPTION_MSG);
    }

    public String getClassName() {
        throw new DebuggerException(EXCEPTION_MSG);
    }

    public long getClassTypeId() {
        throw new DebuggerException(EXCEPTION_MSG);
    }

    public long getInstanceId() {
        throw new DebuggerException(EXCEPTION_MSG);
    }

    public long getExceptionTypeId() {
        throw new DebuggerException(EXCEPTION_MSG);
    }

    public boolean isExceptionCaught() {
        throw new DebuggerException(EXCEPTION_MSG);
    }

    public VmStackTrace getStoppeedLocation() {
        throw new DebuggerException(EXCEPTION_MSG);
    }
}
