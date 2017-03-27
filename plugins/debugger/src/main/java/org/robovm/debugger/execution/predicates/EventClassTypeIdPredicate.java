package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against class type id
 */
public class EventClassTypeIdPredicate extends EventPredicate {
    private final long classTypeId;

    public EventClassTypeIdPredicate(int modifier, long classTypeId) {
        super(modifier);
        this.classTypeId = classTypeId;
    }

    @Override
    public boolean test(EventData eventData) {
        return classTypeId == eventData.getClassTypeId();
    }

    public long classTypeId() {
        return classTypeId;
    }
}
