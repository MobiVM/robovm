package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 */
public class ThreadEventPayload {
    public final long threadObj;
    public final long thread;
    public final long exceptionPrt;

    public ThreadEventPayload(long threadObj, long thread, long exceptionPrt) {
        this.threadObj = threadObj;
        this.thread = thread;
        this.exceptionPrt = exceptionPrt;
    }

    public ThreadEventPayload(long threadObj, long thread) {
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
