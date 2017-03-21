package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 */
public class ThreadCallStackPayload {
    public final String clazzName;
    public final long impl;
    public final int lineNumber;
    public final long fp;

    public ThreadCallStackPayload(String clazzName, long impl, int lineNumber, long fp) {
        this.clazzName = clazzName;
        this.impl = impl;
        this.lineNumber = lineNumber;
        this.fp = fp;
    }

    @Override
    public String toString() {
        return "ThreadCallStackPayload{" +
                "clazzName='" + clazzName + '\'' +
                ", impl=" + impl +
                ", lineNumber=" + lineNumber +
                ", fp=" + fp +
                '}';
    }
}
