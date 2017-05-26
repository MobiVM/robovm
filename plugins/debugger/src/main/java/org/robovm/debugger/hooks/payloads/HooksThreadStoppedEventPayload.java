package org.robovm.debugger.hooks.payloads;

import java.util.Arrays;

/**
 * @author Demyan Kimitsa
 * Event for breakpoint/step/exception case
 */
public class HooksThreadStoppedEventPayload extends HooksEventPayload{
    private final long threadObj;
    private final long thread;
    private final long throwable;
    private final boolean isCaught;
    private final HooksCallStackEntry[] callStack;

    public HooksThreadStoppedEventPayload(int eventId, long threadObj, long thread, HooksCallStackEntry[] callStack) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.throwable = 0;
        this.isCaught = false;
        this.callStack = callStack;
    }

    public HooksThreadStoppedEventPayload(int eventId, long threadObj, long thread, long throwable, boolean isCaught, HooksCallStackEntry[] callStack) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.throwable = throwable;
        this.isCaught = isCaught;
        this.callStack = callStack;
    }

    public long threadObj() {
        return threadObj;
    }

    public long thread() {
        return thread;
    }

    public long throwable() {
        return throwable;
    }

    public boolean isCaught() {
        return isCaught;
    }

    public HooksCallStackEntry[] callStack() {
        return callStack;
    }

    @Override
    public String toString() {
        return "HooksThreadStoppedEventPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", throwable=" + throwable +
                ", isCaught=" + isCaught +
                ", callStack=" + Arrays.toString(callStack) +
                '}';
    }
}