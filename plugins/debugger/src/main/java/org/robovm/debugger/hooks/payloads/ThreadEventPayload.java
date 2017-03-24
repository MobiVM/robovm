package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 */
public class ThreadEventPayload {
    public final int eventId;
    public final long threadObj;
    public final long thread;
    public final long exceptionPrt;

    public ThreadEventPayload(int eventId, long threadObj, long thread, long exceptionPrt) {
        this.eventId = eventId;
        this.threadObj = threadObj;
        this.thread = thread;
        this.exceptionPrt = exceptionPrt;
    }

    public ThreadEventPayload(int eventId, long threadObj, long thread) {
        this.eventId = eventId;
        this.threadObj = threadObj;
        this.thread = thread;
        this.exceptionPrt = 0;
    }

    @Override
    public String toString() {
        return "ThreadEventPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", exceptionPrt=" + exceptionPrt +
                '}';
    }
}
