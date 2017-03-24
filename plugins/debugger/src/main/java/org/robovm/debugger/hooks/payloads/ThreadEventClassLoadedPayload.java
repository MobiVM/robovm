package org.robovm.debugger.hooks.payloads;

import java.util.Arrays;

/**
 * @author Demyan Kimitsa
 */
public class ThreadEventClassLoadedPayload {
    public final long threadObj;
    public final long thread;
    public final long clazz;
    public final long classInfo;
    public final ThreadCallStackPayload[] callStack;

    public ThreadEventClassLoadedPayload(long threadObj, long thread, long clazz, long classInfo, ThreadCallStackPayload[] callStack) {
        this.threadObj = threadObj;
        this.thread = thread;
        this.clazz = clazz;
        this.classInfo = classInfo;
        this.callStack = callStack;
    }

    @Override
    public String toString() {
        return "ThreadEventClassLoadedPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", clazz=" + clazz +
                ", classInfo=" + classInfo +
                ", callStack=" + (callStack != null ? Arrays.toString(callStack) : null) +
                '}';
    }
}
