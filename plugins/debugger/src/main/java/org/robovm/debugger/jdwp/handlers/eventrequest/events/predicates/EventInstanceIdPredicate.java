package org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.EventData;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against specified instance id
 */
public class EventInstanceIdPredicate extends EventPredicate {
    private final long instaceId;

    public EventInstanceIdPredicate(int modifier, long instaceId) {
        super(modifier);
        this.instaceId = instaceId;
    }

    public long instaceId() {
        return instaceId;
    }

    @Override
    public boolean test(EventData eventData) {
        return instaceId == eventData.getInstanceId();
    }
}
