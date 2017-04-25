package org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.EventData;

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

    public int modCount() {
        return modCount;
    }

    @Override
    public boolean test(EventData eventData) {
        if (modCount < 0)
            return false;

        if (modCount == 1) {
            // passed this predicate, this allowed only once, make it never run again
            modCount = -1;
            return true;
        }

        // keep counting
        modCount -= 1;
        return false;
    }

    @Override
    public String toString() {
        return "count=" + modCount;
    }
}
