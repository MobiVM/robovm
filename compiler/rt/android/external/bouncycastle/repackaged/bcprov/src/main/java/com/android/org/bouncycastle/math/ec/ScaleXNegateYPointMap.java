/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.math.ec;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class ScaleXNegateYPointMap implements ECPointMap
{
    protected final ECFieldElement scale;

    public ScaleXNegateYPointMap(ECFieldElement scale)
    {
        this.scale = scale;
    }

    public ECPoint map(ECPoint p)
    {
        return p.scaleXNegateY(scale);
    }
}
