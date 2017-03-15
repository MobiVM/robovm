package org.robovm.debugger;

/**
 * @author Demyan Kimitsa
 */
public class DebuggerException extends RuntimeException {
    /** helper code for cases need to pass it along exception */
    private int code = -1;

    public DebuggerException() {
    }

    public DebuggerException(int code) {
        this.code = code;
    }

    public DebuggerException(String message) {
        super(message);
    }

    public DebuggerException(String message, int code) {
        super(message);
        this.code = code;
    }

    public DebuggerException(String message, Throwable cause) {
        super(message, cause);
    }

    public DebuggerException(Throwable cause) {
        super(cause);
    }

    public int getCode() {
        return code;
    }
}

