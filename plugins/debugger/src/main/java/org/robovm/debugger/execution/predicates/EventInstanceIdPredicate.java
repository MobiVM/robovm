package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;

import java.util.Set;
import java.util.function.Predicate;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against specified instance ids
 */
public class EventInstanceIdPredicate implements Predicate<EventData> {
    private final Set<Long> instaceIds;

    public EventInstanceIdPredicate(Set<Long> instaceIds) {
        this.instaceIds = instaceIds;
    }

    @Override
    public boolean test(EventData eventData) {
        return instaceIds.contains(eventData.getInstanceId());
    }
}
