package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;

import java.util.Set;
import java.util.function.Predicate;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against class type id
 */
public class EventClassTypeIdPredicate implements Predicate<EventData> {
    private final Set<Long> classTypeIDs;

    public EventClassTypeIdPredicate(Set<Long> classTypeIDs) {
        this.classTypeIDs = classTypeIDs;
    }

    @Override
    public boolean test(EventData eventData) {
        return classTypeIDs.contains(eventData.getClassTypeId());
    }
}
