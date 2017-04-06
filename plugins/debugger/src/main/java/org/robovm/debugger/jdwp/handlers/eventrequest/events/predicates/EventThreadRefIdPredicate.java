package org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.EventData;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against thread ref id
 */
public class EventThreadRefIdPredicate extends EventPredicate {

    private final long threadRefId;

    public EventThreadRefIdPredicate(int modifier, long threadRefId) {
        super(modifier);
        this.threadRefId = threadRefId;
    }

    public long threadRefId() {
        return threadRefId;
    }

    @Override
    public boolean test(EventData eventData) {
        // TODO: this also has to check for subtypes
        return eventData.getThreadRefId() == threadRefId;
    }


}
