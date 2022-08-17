/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1Enumerated;
import com.android.org.bouncycastle.asn1.ASN1Primitive;

/**
 * CertificateType ::= ENUMERATED {
 * explicit,
 * implicit,
 * ...
 * }
 * @hide This class is not part of the Android public SDK API
 */
public class HashAlgorithm
{

    public static final HashAlgorithm sha256 = new HashAlgorithm(0);
    public static final HashAlgorithm sha384 = new HashAlgorithm(1);
    private final ASN1Enumerated enumerated;

    protected HashAlgorithm(int ordinal)
    {
        enumerated = new ASN1Enumerated(ordinal);
    }

    private HashAlgorithm(ASN1Enumerated enumerated)
    {
        this.enumerated = enumerated;
    }

    public HashAlgorithm getInstance(Object src)
    {
        if (src == null)
        {
            return null;
        }
        else if (src instanceof HashAlgorithm)
        {
            return (HashAlgorithm)src;
        }
        else
        {
            return new HashAlgorithm(ASN1Enumerated.getInstance(src));
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return enumerated;
    }
}
