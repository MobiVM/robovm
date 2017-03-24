package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;
import org.robovm.debugger.execution.JdwpEventRequest;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Demyan Kimitsa
 * Predicate that matches exception
 */
public class EventExceptionPredicate implements Predicate<EventData> {
    private final List<JdwpEventRequest.ExceptionMod> modifiers;

    public EventExceptionPredicate(List<JdwpEventRequest.ExceptionMod> modifiers) {
        this.modifiers = modifiers;
    }

    @Override
    public boolean test(EventData eventData) {
        for (JdwpEventRequest.ExceptionMod modifier : modifiers) {
            if (modifier.refTypeID != eventData.getExceptionTypeId())
                continue;
            if  (modifier.caught && eventData.isExceptionCaught() || modifier.uncaught && !eventData.isExceptionCaught())
                return true;
        }

        // doesn't match
        return false;
    }

}
