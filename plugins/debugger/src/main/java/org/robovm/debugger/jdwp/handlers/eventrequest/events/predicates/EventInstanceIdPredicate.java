package org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.EventData;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against specified instance id
 */
public class EventInstanceIdPredicate extends EventPredicate {
    private final long instanceId;

    public EventInstanceIdPredicate(int modifier, long instanceId) {
        super(modifier);
        this.instanceId = instanceId;
    }

    public long instaceId() {
        return instanceId;
    }

    @Override
    public boolean test(EventData eventData) {
        return instanceId == eventData.getInstanceId();
    }

    @Override
    public String toString() {
        return "instanceId=" + instanceId;
    }
}
