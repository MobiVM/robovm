package org.robovm.debugger.utils.macho;

/**
 * @author Demyan Kimitsa
 */
public class MachOException extends Throwable {
    public MachOException() {
    }

    public MachOException(String message) {
        super(message);
    }

    public MachOException(String message, Throwable cause) {
        super(message, cause);
    }
}
