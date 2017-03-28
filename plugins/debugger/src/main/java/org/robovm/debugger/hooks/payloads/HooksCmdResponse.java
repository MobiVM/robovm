package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 * single repsponse payload for command that receive result from target
 */
public class HooksCmdResponse  {
    private final Object result;
    private final long exceptionPrt;

    public HooksCmdResponse(Object result) {
        this.result = result;
        exceptionPrt = -1;
    }

    public HooksCmdResponse(Object result, long exceptionPrt) {
        this.result = result;
        this.exceptionPrt = exceptionPrt;
    }

    public <T> T result() {
        //noinspection unchecked
        return (T) result;
    }

    public long exceptionPrt() {
        return exceptionPrt;
    }

    @Override
    public String toString() {
        return "HooksCmdResponse{" +
                "result=" + result +
                ", exceptionPrt=" + exceptionPrt +
                '}';
    }
}
