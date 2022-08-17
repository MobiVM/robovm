/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jce.provider;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class PKIXNameConstraintValidatorException
    extends Exception
{
    private Throwable cause;

    public PKIXNameConstraintValidatorException(String msg)
    {
        super(msg);
    }

    public PKIXNameConstraintValidatorException(String msg, Throwable e)
    {
        super(msg);

        this.cause = e;
    }

    public Throwable getCause()
    {
        return cause;
    }
}
