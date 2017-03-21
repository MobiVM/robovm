package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 */
public class InvokeCmdPayload {
    public final long resultPtr;
    public final long exceptionPrt;

    public InvokeCmdPayload(long resultPtr, long exceptionPrt) {
        this.resultPtr = resultPtr;
        this.exceptionPrt = exceptionPrt;
    }

    @Override
    public String toString() {
        return "InvokeCmdPayload{" +
                "resultPtr=" + resultPtr +
                ", exceptionPrt=" + exceptionPrt +
                '}';
    }
}
