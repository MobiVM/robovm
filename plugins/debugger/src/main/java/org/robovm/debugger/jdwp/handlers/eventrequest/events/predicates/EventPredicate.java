package org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.EventData;

/**
 * @author Demyan Kimitsa
 * base predicate all event predicates to follow
 */
public abstract class EventPredicate {
    private final int modifier;

    public EventPredicate(int modifier) {
        this.modifier = modifier;
    }

    public abstract boolean test(EventData eventData);

    public int modifierKind() {
        return modifier;
    }
}
