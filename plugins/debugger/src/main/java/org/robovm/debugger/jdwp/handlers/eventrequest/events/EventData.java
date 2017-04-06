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
