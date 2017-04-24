package org.robovm.debugger.jdwp.handlers.eventrequest.events;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventPredicate;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Demyan Kimitsa
 * Event container as received from JDWP Event Set command
 */
public class JdwpEventRequest {
    private final int requestId;
    private final byte eventKind;
    private final byte suspendPolicy;
    private final List<EventPredicate> predicates;

    public JdwpEventRequest(int requestId, byte eventKind, byte suspendPolicy, List<EventPredicate> predicates) {
        this.requestId = requestId;
        this.eventKind = eventKind;
        this.suspendPolicy = suspendPolicy;
        this.predicates = predicates;
    }

    public boolean test(EventData data) {
        // test through all predicates
        for (Predicate<EventData> predicate : predicates)
            if (!predicate.test(data))
                return false;
        return true;
    }

    public int requestId() {
        return requestId;
    }

    public byte eventKind() {
        return eventKind;
    }

    public byte suspendPolicy() {
        return suspendPolicy;
    }

    public List<EventPredicate> predicates() {
        return predicates;
    }

    public <T> T predicateByKind(byte modifierKind) {
        for (EventPredicate predicate : predicates)
            if (predicate.modifierKind() == modifierKind)
                //noinspection unchecked
                return (T)predicate;
        return null;
    }

    @Override
    public String toString() {
        return "JdwpEventRequest{" +
                "requestId=" + requestId +
                ", eventKind=" + JdwpConsts.stringEventKind(eventKind) +
                ", suspendPolicy=" + JdwpConsts.stringSuspendPolicy(suspendPolicy) +
                ", predicates=" + predicates +
                '}';
    }
}
