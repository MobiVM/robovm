package org.robovm.debugger.hooks.payloads;

import java.util.Arrays;

/**
 * @author Demyan Kimitsa
 */
public class ThreadEventStoppedPayload {
    public final int eventId;
    public final long threadObj;
    public final long thread;
    public final long throwable;
    public final boolean isCaught;
    public final ThreadCallStackPayload[] callStack;

    public ThreadEventStoppedPayload(int eventId, long threadObj, long thread, ThreadCallStackPayload[] callStack) {
        this.eventId = eventId;
        this.threadObj = threadObj;
        this.thread = thread;
        this.throwable = 0;
        this.isCaught = false;
        this.callStack = callStack;
    }

    public ThreadEventStoppedPayload(int eventId, long threadObj, long thread, long throwable, boolean isCaught, ThreadCallStackPayload[] callStack) {
        this.eventId = eventId;
        this.threadObj = threadObj;
        this.thread = thread;
        this.throwable = throwable;
        this.isCaught = isCaught;
        this.callStack = callStack;
    }

    @Override
    public String toString() {
        return "ThreadEventStoppedPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", throwable=" + throwable +
                ", isCaught=" + isCaught +
                ", callStack=" + Arrays.toString(callStack) +
                '}';
    }
}
