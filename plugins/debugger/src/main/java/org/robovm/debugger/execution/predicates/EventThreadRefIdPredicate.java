package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;

import java.util.function.Predicate;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against thread ref id
 */
public class EventThreadRefIdPredicate implements Predicate<EventData> {

    private final long threadRefId;

    public EventThreadRefIdPredicate(long threadRefId) {
        this.threadRefId = threadRefId;
    }

    @Override
    public boolean test(EventData eventData) {
        return eventData.getThreadRefId() == threadRefId;
    }


}
