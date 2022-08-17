/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.math.ec;

import java.math.BigInteger;

import com.android.org.bouncycastle.math.ec.endo.EndoUtil;
import com.android.org.bouncycastle.math.ec.endo.GLVEndomorphism;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class GLVMultiplier extends AbstractECMultiplier
{
    protected final ECCurve curve;
    protected final GLVEndomorphism glvEndomorphism;

    public GLVMultiplier(ECCurve curve, GLVEndomorphism glvEndomorphism)
    {
        if (curve == null || curve.getOrder() == null)
        {
            throw new IllegalArgumentException("Need curve with known group order");
        }

        this.curve = curve;
        this.glvEndomorphism = glvEndomorphism;
    }

    protected ECPoint multiplyPositive(ECPoint p, BigInteger k)
    {
        if (!curve.equals(p.getCurve()))
        {
            throw new IllegalStateException();
        }

        BigInteger n = p.getCurve().getOrder();
        BigInteger[] ab = glvEndomorphism.decomposeScalar(k.mod(n));
        BigInteger a = ab[0], b = ab[1];

        if (glvEndomorphism.hasEfficientPointMap())
        {
            return ECAlgorithms.implShamirsTrickWNaf(glvEndomorphism, p, a, b);
        }

        ECPoint q = EndoUtil.mapPoint(glvEndomorphism, p);

        return ECAlgorithms.implShamirsTrickWNaf(p, a, q, b);
    }
}
