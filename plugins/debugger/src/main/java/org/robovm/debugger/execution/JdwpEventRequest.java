package org.robovm.debugger.execution;

import org.robovm.debugger.execution.predicates.EventPredicate;

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

    @Override
    public String toString() {
        return "JdwpEventRequest{" +
                "requestId=" + requestId +
                ", eventKind=" + eventKind +
                ", suspendPolicy=" + suspendPolicy +
                ", predicates=" + predicates +
                '}';
    }
}
