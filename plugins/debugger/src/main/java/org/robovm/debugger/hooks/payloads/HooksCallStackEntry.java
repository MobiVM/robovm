package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 * Stack entry as received from target
 */
public class HooksCallStackEntry {
    private final String clazzName;
    private final long impl;
    private final int lineNumber;
    private final long fp;

    public HooksCallStackEntry(String clazzName, long impl, int lineNumber, long fp) {
        this.clazzName = clazzName;
        this.impl = impl;
        this.lineNumber = lineNumber;
        this.fp = fp;
    }

    public String clazzName() {
        return clazzName;
    }

    public long impl() {
        return impl;
    }

    public int lineNumber() {
        return lineNumber;
    }

    public long fp() {
        return fp;
    }

    @Override
    public String toString() {
        return "HooksCallStackEntry{" +
                "clazzName='" + clazzName + '\'' +
                ", impl=" + impl +
                ", lineNumber=" + lineNumber +
                ", fp=" + fp +
                '}';
    }
}
