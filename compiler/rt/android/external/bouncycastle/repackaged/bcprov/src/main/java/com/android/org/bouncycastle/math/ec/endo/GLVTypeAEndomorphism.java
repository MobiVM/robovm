/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

import com.android.org.bouncycastle.math.ec.ECCurve;
import com.android.org.bouncycastle.math.ec.ECPointMap;
import com.android.org.bouncycastle.math.ec.ScaleYNegateXPointMap;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class GLVTypeAEndomorphism implements GLVEndomorphism
{
    protected final GLVTypeAParameters parameters;
    protected final ECPointMap pointMap;

    public GLVTypeAEndomorphism(ECCurve curve, GLVTypeAParameters parameters)
    {
        /*
         * NOTE: 'curve' MUST only be used to create a suitable ECFieldElement. Due to the way
         * ECCurve configuration works, 'curve' will not be the actual instance of ECCurve that the
         * endomorphism is being used with.
         */

        this.parameters = parameters;
        this.pointMap = new ScaleYNegateXPointMap(curve.fromBigInteger(parameters.getI()));
    }

    public BigInteger[] decomposeScalar(BigInteger k)
    {
        return EndoUtil.decomposeScalar(parameters.getSplitParams(), k);
    }

    public ECPointMap getPointMap()
    {
        return pointMap;
    }

    public boolean hasEfficientPointMap()
    {
        return true;
    }
}
