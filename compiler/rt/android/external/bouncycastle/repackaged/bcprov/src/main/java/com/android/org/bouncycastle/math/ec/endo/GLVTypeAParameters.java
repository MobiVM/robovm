/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class GLVTypeAParameters
{
    protected final BigInteger i, lambda;
    protected final ScalarSplitParameters splitParams;

    public GLVTypeAParameters(BigInteger i, BigInteger lambda, ScalarSplitParameters splitParams)
    {
        this.i = i;
        this.lambda = lambda;
        this.splitParams = splitParams;
    }

    public BigInteger getI()
    {
        return i;
    }

    public BigInteger getLambda()
    {
        return lambda;
    }

    public ScalarSplitParameters getSplitParams()
    {
        return splitParams;
    }
}
