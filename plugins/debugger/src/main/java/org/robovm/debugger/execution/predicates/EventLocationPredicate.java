package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;

/**
 * @author Demyan Kimitsa
 */
public class EventLocationPredicate extends EventPredicate {
    private final byte tag;
    private final long classId;
    private final long methodID;
    private final long index;

    public EventLocationPredicate(int modifier, byte tag, long classId, long methodID, long index) {
        super(modifier);
        this.tag = tag;
        this.classId = classId;
        this.methodID = methodID;
        this.index = index;
    }

    @Override
    public boolean test(EventData eventData) {
        return false;
    }
}
