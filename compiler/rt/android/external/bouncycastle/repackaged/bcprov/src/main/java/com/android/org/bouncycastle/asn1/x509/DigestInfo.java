/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.asn1.x509;

import java.util.Enumeration;

import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1OctetString;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Sequence;
import com.android.org.bouncycastle.asn1.ASN1TaggedObject;
import com.android.org.bouncycastle.asn1.DEROctetString;
import com.android.org.bouncycastle.asn1.DERSequence;
import com.android.org.bouncycastle.util.Arrays;

/**
 * The DigestInfo object.
 * <pre>
 * DigestInfo::=SEQUENCE{
 *          digestAlgorithm  AlgorithmIdentifier,
 *          digest OCTET STRING }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class DigestInfo
    extends ASN1Object
{
    private byte[]                  digest;
    private AlgorithmIdentifier     algId;

    public static DigestInfo getInstance(
        ASN1TaggedObject obj,
        boolean          explicit)
    {
        return getInstance(ASN1Sequence.getInstance(obj, explicit));
    }

    public static DigestInfo getInstance(
        Object  obj)
    {
        if (obj instanceof DigestInfo)
        {
            return (DigestInfo)obj;
        }
        else if (obj != null)
        {
            return new DigestInfo(ASN1Sequence.getInstance(obj));
        }

        return null;
    }

    @android.compat.annotation.UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    public DigestInfo(
        AlgorithmIdentifier  algId,
        byte[]               digest)
    {
        this.digest = Arrays.clone(digest);
        this.algId = algId;
    }

    public DigestInfo(
        ASN1Sequence  obj)
    {
        Enumeration             e = obj.getObjects();

        algId = AlgorithmIdentifier.getInstance(e.nextElement());
        digest = ASN1OctetString.getInstance(e.nextElement()).getOctets();
    }

    public AlgorithmIdentifier getAlgorithmId()
    {
        return algId;
    }

    public byte[] getDigest()
    {
        return Arrays.clone(digest);
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector v = new ASN1EncodableVector(2);

        v.add(algId);
        v.add(new DEROctetString(digest));

        return new DERSequence(v);
    }
}
