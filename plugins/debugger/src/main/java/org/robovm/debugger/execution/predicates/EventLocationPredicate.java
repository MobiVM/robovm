package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;
import org.robovm.debugger.state.instances.VmStackTrace;

/**
 * @author Demyan Kimitsa
 */
public class EventLocationPredicate extends EventPredicate {
    private final byte tag;
    private final long classId;
    private final long methodId;
    private final long index;

    public EventLocationPredicate(int modifier, byte tag, long classId, long methodId, long index) {
        super(modifier);
        this.tag = tag;
        this.classId = classId;
        this.methodId = methodId;
        this.index = index;
    }

    public long classId() {
        return classId;
    }

    public long methodId() {
        return methodId;
    }

    public long index() {
        return index;
    }

    @Override
    public boolean test(EventData eventData) {
        VmStackTrace location = eventData.getStoppeedLocation();
        if (location == null)
            return false;
        return classId == location.classInfo().getRefId() && methodId == location.methodInfo().getRefId() &&
                index == location.lineNumber();
    }
}
