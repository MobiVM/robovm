/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jce.exception;

/**
 * 
 * This is an extended exception. Java before version 1.4 did not offer the
 * possibility the attach a cause to an exception. The cause of an exception is
 * the <code>Throwable</code> object which was thrown and caused the
 * exception. This interface must be implemented by all exceptions to accomplish
 * this additional functionality.
 * @hide This class is not part of the Android public SDK API
 * 
 */
public interface ExtException
{

    /**
     * Returns the cause of the exception.
     * 
     * @return The cause of the exception.
     */
    Throwable getCause();
}
