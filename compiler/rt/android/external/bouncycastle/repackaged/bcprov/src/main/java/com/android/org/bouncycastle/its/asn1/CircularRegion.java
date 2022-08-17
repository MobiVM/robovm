/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Sequence;

/**
 * <pre>
 *     CircularRegion ::= SEQUENCE {
 *         center TwoDLocation,
 *         radius Uint16
 *     }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class CircularRegion
    extends ASN1Object
{
    private CircularRegion(ASN1Sequence seq)
    {

    }

    public static CircularRegion getInstance(Object o)
    {
        if (o instanceof CircularRegion)
        {
            return (CircularRegion)o;
        }
        else if (o != null)
        {
            return new CircularRegion(ASN1Sequence.getInstance(o));
        }

        return null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return null;
    }
}