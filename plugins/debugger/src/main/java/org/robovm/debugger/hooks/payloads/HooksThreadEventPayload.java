package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 * Common payload for set of thread events
 */
public class HooksThreadEventPayload extends HooksEventPayload {
    private final long threadObj;
    private final long thread;
    private final long exceptionPrt;

    public HooksThreadEventPayload(int eventId, long threadObj, long thread, long exceptionPrt) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.exceptionPrt = exceptionPrt;
    }

    public HooksThreadEventPayload(int eventId, long threadObj, long thread) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.exceptionPrt = 0;
    }

    public long threadObj() {
        return threadObj;
    }

    public long thread() {
        return thread;
    }

    public long exceptionPrt() {
        return exceptionPrt;
    }

    @Override
    public String toString() {
        return "HooksThreadEventPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", exceptionPrt=" + exceptionPrt +
                '}';
    }
}
