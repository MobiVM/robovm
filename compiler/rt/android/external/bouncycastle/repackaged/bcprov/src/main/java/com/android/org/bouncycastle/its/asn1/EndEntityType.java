/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1BitString;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.DERBitString;

/**
 * <pre>
 *     EndEntityType ::= BIT STRING { app(0), enrol(1) } (SIZE (8)) (ALL EXCEPT ())
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class EndEntityType
    extends ASN1Object
{
    public static final int        app = (1 << 7);
    public static final int        enrol = (1 << 6);

    private final ASN1BitString type;

    public EndEntityType(int type)
    {
        if (type != app && type != enrol)
        {
            throw new IllegalArgumentException("value out of range");
        }

        this.type = new DERBitString(type);
    }

    private EndEntityType(DERBitString str)
    {
        this.type = str;
    }

    public static EndEntityType getInstance(Object src)
    {
        if (src instanceof EndEntityType)
        {
            return (EndEntityType)src;
        }
        else if (src != null)
        {
            return new EndEntityType(DERBitString.getInstance(src));
        }

        return null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return type;
    }
}
