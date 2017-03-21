package org.robovm.debugger.hooks.payloads;

import java.util.Arrays;

/**
 * @author Demyan Kimitsa
 */
public class ThreadStoppedPayload {
    public final long threadObj;
    public final long thread;
    public final long throwable;
    public final boolean isCaught;
    public final ThreadCallStackPayload[] callStack;

    public ThreadStoppedPayload(long threadObj, long thread, ThreadCallStackPayload[] callStack) {
        this.threadObj = threadObj;
        this.thread = thread;
        this.throwable = 0;
        this.isCaught = false;
        this.callStack = callStack;
    }

    public ThreadStoppedPayload(long threadObj, long thread, long throwable, boolean isCaught, ThreadCallStackPayload[] callStack) {
        this.threadObj = threadObj;
        this.thread = thread;
        this.throwable = throwable;
        this.isCaught = isCaught;
        this.callStack = callStack;
    }

    @Override
    public String toString() {
        return "ThreadStoppedPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", throwable=" + throwable +
                ", isCaught=" + isCaught +
                ", callStack=" + Arrays.toString(callStack) +
                '}';
    }
}
