package org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.EventData;

import java.util.function.Predicate;

/**
 * @author Demyan Kimitsa
 * base predicate all event predicates to follow
 */
public abstract class EventPredicate implements Predicate<EventData> {
    private final int modifier;

    public EventPredicate(int modifier) {
        this.modifier = modifier;
    }

    public int modifierKind() {
        return modifier;
    }
}