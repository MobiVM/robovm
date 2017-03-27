package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;

/**
 * @author Demyan Kimitsa
 * Predicate that matches number of events this event request fired
 */
public class EventModCountPredicate extends EventPredicate {
    private int modCount;

    public EventModCountPredicate(int modifier, int modCount) {
        super(modifier);
        this.modCount = modCount;
    }

    @Override
    public boolean test(EventData eventData) {
        if (modCount > 0)
            modCount -= 1;
        return modCount == 0;
    }
}
