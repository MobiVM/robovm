package org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.EventData;

/**
 * @author Demyan Kimitsa
 *         Predicate that matches exception
 */
public class EventExceptionPredicate extends EventPredicate {
    public final long refTypeId;
    public final boolean caught;
    public final boolean uncaught;

    public EventExceptionPredicate(int modifier, long refTypeId, boolean caught, boolean uncaught) {
        super(modifier);
        this.refTypeId = refTypeId;
        this.caught = caught;
        this.uncaught = uncaught;
    }

    public long refTypeId() {
        return refTypeId;
    }

    @Override
    public boolean test(EventData eventData) {
        // TODO: handle subtypes
        if (refTypeId != 0 && refTypeId != eventData.getExceptionTypeId())
            return false;
        if (caught && eventData.isExceptionCaught() || uncaught && !eventData.isExceptionCaught())
            return true;

        // doesn't match
        return false;
    }

}
