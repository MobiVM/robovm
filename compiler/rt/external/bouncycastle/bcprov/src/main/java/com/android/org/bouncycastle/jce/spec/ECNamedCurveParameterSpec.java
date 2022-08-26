/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jce.spec;

import java.math.BigInteger;

import com.android.org.bouncycastle.math.ec.ECCurve;
import com.android.org.bouncycastle.math.ec.ECPoint;

/**
 * specification signifying that the curve parameters can also be
 * referred to by name.
 * <p>
 * If you are using JDK 1.5 you should be looking at {@link ECNamedCurveSpec}.
 * @hide This class is not part of the Android public SDK API
 */
public class ECNamedCurveParameterSpec
    extends ECParameterSpec
{
    private String  name;

    public ECNamedCurveParameterSpec(
        String      name,
        ECCurve     curve,
        ECPoint     G,
        BigInteger  n)
    {
        super(curve, G, n);

        this.name = name;
    }

    public ECNamedCurveParameterSpec(
        String      name,
        ECCurve     curve,
        ECPoint     G,
        BigInteger  n,
        BigInteger  h)
    {
        super(curve, G, n, h);

        this.name = name;
    }

    public ECNamedCurveParameterSpec(
        String      name,
        ECCurve     curve,
        ECPoint     G,
        BigInteger  n,
        BigInteger  h,
        byte[]      seed)
    {
        super(curve, G, n, h, seed);

        this.name = name;
    }

    /**
     * return the name of the curve the EC domain parameters belong to.
     */
    public String getName()
    {
        return name;
    }
}
