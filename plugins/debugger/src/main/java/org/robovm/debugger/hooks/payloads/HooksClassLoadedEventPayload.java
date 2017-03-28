package org.robovm.debugger.hooks.payloads;

import java.util.Arrays;

/**
 * @author Demyan Kimitsa
 * Payload for class loaded event
 */
public class HooksClassLoadedEventPayload extends HooksEventPayload {
    private final long threadObj;
    private final long thread;
    private final long clazz;
    private final long classInfo;
    private final HooksCallStackEntry[] callStack;

    public HooksClassLoadedEventPayload(int eventId, long threadObj, long thread, long clazz, long classInfo, HooksCallStackEntry[] callStack) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.clazz = clazz;
        this.classInfo = classInfo;
        this.callStack = callStack;
    }

    public long threadObj() {
        return threadObj;
    }

    public long thread() {
        return thread;
    }

    public long clazz() {
        return clazz;
    }

    public long classInfo() {
        return classInfo;
    }

    public HooksCallStackEntry[] callStack() {
        return callStack;
    }

    @Override
    public String toString() {
        return "HooksClassLoadedEventPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", clazz=" + clazz +
                ", classInfo=" + classInfo +
                ", callStack=" + (callStack != null ? Arrays.toString(callStack) : null) +
                '}';
    }
}
