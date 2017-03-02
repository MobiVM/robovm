package org.robovm.ibxcode;

/**
 * own flavour exception
 */
public class IBException extends RuntimeException{
    public IBException(String message) {
        super(message);
    }
    public IBException(String message, Throwable cause) {
        super(message, cause);
    }
}
