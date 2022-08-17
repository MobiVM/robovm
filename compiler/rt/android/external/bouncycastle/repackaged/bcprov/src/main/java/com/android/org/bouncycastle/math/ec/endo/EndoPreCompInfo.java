/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.math.ec.endo;

import com.android.org.bouncycastle.math.ec.ECPoint;
import com.android.org.bouncycastle.math.ec.PreCompInfo;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class EndoPreCompInfo implements PreCompInfo
{
    protected ECEndomorphism endomorphism;

    protected ECPoint mappedPoint;

    public ECEndomorphism getEndomorphism()
    {
        return endomorphism;
    }

    public void setEndomorphism(ECEndomorphism endomorphism)
    {
        this.endomorphism = endomorphism;
    }

    public ECPoint getMappedPoint()
    {
        return mappedPoint;
    }

    public void setMappedPoint(ECPoint mappedPoint)
    {
        this.mappedPoint = mappedPoint;
    }
}
