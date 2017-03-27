package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;

/**
 * @author Demyan Kimitsa
 * Predicate for stepping condition
 */
public class EventStepModPredicate extends EventPredicate {
    private final long threadId;
    private final int size;
    private final int depth;

    public EventStepModPredicate(int modifier, long threadId, int size, int depth) {
        super(modifier);
        this.threadId = threadId;
        this.size = size;
        this.depth = depth;
    }

    public long threadId() {
        return threadId;
    }

    @Override
    public boolean test(EventData eventData) {
        return false;
    }
}
