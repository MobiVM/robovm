/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.asn1.pkcs;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;

import com.android.org.bouncycastle.asn1.ASN1BitString;
import com.android.org.bouncycastle.asn1.ASN1Encodable;
import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Integer;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1OctetString;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Sequence;
import com.android.org.bouncycastle.asn1.ASN1Set;
import com.android.org.bouncycastle.asn1.ASN1TaggedObject;
import com.android.org.bouncycastle.asn1.DERBitString;
import com.android.org.bouncycastle.asn1.DEROctetString;
import com.android.org.bouncycastle.asn1.DERSequence;
import com.android.org.bouncycastle.asn1.DERTaggedObject;
import com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import com.android.org.bouncycastle.util.BigIntegers;

/**
 * RFC 5958
 *
 * <pre>
 *  [IMPLICIT TAGS]
 *
 *  OneAsymmetricKey ::= SEQUENCE {
 *      version                   Version,
 *      privateKeyAlgorithm       PrivateKeyAlgorithmIdentifier,
 *      privateKey                PrivateKey,
 *      attributes            [0] Attributes OPTIONAL,
 *      ...,
 *      [[2: publicKey        [1] PublicKey OPTIONAL ]],
 *      ...
 *  }
 *
 *  PrivateKeyInfo ::= OneAsymmetricKey
 *
 *  Version ::= INTEGER { v1(0), v2(1) } (v1, ..., v2)
 *
 *  PrivateKeyAlgorithmIdentifier ::= AlgorithmIdentifier
 *                                     { PUBLIC-KEY,
 *                                       { PrivateKeyAlgorithms } }
 *
 *  PrivateKey ::= OCTET STRING
 *                     -- Content varies based on type of key.  The
 *                     -- algorithm identifier dictates the format of
 *                     -- the key.
 *
 *  PublicKey ::= BIT STRING
 *                     -- Content varies based on type of key.  The
 *                     -- algorithm identifier dictates the format of
 *                     -- the key.
 *
 *  Attributes ::= SET OF Attribute { { OneAsymmetricKeyAttributes } }
 *  </pre>
 * @hide This class is not part of the Android public SDK API
 */
@libcore.api.CorePlatformApi
public class PrivateKeyInfo
    extends ASN1Object
{
    private ASN1Integer version;
    private AlgorithmIdentifier privateKeyAlgorithm;
    private ASN1OctetString privateKey;
    private ASN1Set attributes;
    private ASN1BitString publicKey;

    public static PrivateKeyInfo getInstance(ASN1TaggedObject obj, boolean explicit)
    {
        return getInstance(ASN1Sequence.getInstance(obj, explicit));
    }

    @libcore.api.CorePlatformApi
    public static PrivateKeyInfo getInstance(Object obj)
    {
        if (obj instanceof PrivateKeyInfo)
        {
            return (PrivateKeyInfo)obj;
        }
        else if (obj != null)
        {
            return new PrivateKeyInfo(ASN1Sequence.getInstance(obj));
        }

        return null;
    }

    private static int getVersionValue(ASN1Integer version)
    {
        BigInteger bigValue = version.getValue();
        if (bigValue.compareTo(BigIntegers.ZERO) < 0 || bigValue.compareTo(BigIntegers.ONE) > 0)
        {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return bigValue.intValue();
    }

    public PrivateKeyInfo(
        AlgorithmIdentifier privateKeyAlgorithm,
        ASN1Encodable privateKey)
        throws IOException
    {
        this(privateKeyAlgorithm, privateKey, null, null);
    }

    public PrivateKeyInfo(
        AlgorithmIdentifier privateKeyAlgorithm,
        ASN1Encodable privateKey,
        ASN1Set attributes)
        throws IOException
    {
        this(privateKeyAlgorithm, privateKey, attributes, null);
    }

    public PrivateKeyInfo(
        AlgorithmIdentifier privateKeyAlgorithm,
        ASN1Encodable privateKey,
        ASN1Set attributes,
        byte[] publicKey)
        throws IOException
    {
        this.version = new ASN1Integer(publicKey != null ? BigIntegers.ONE : BigIntegers.ZERO);
        this.privateKeyAlgorithm = privateKeyAlgorithm;
        this.privateKey = new DEROctetString(privateKey);
        this.attributes = attributes;
        this.publicKey = publicKey == null ? null : new DERBitString(publicKey);
    }

    private PrivateKeyInfo(ASN1Sequence seq)
    {
        Enumeration e = seq.getObjects();

        this.version = ASN1Integer.getInstance(e.nextElement());

        int versionValue = getVersionValue(version);

        this.privateKeyAlgorithm = AlgorithmIdentifier.getInstance(e.nextElement());
        this.privateKey = ASN1OctetString.getInstance(e.nextElement());

        int lastTag = -1;
        while (e.hasMoreElements())
        {
            ASN1TaggedObject tagged = (ASN1TaggedObject)e.nextElement();

            int tag = tagged.getTagNo();
            if (tag <= lastTag)
            {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }

            lastTag = tag;

            switch (tag)
            {
            case 0:
            {
                this.attributes = ASN1Set.getInstance(tagged, false);
                break;
            }
            case 1:
            {
                if (versionValue < 1)
                {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }

                this.publicKey = DERBitString.getInstance(tagged, false);
                break;
            }
            default:
            {
                throw new IllegalArgumentException("unknown optional field in private key info");
            }
            }
        }
    }

    public ASN1Set getAttributes()
    {
        return attributes;
    }

    @libcore.api.CorePlatformApi
    public AlgorithmIdentifier getPrivateKeyAlgorithm()
    {
        return privateKeyAlgorithm;
    }

    @libcore.api.CorePlatformApi
    public ASN1Encodable parsePrivateKey()
        throws IOException
    {
        return ASN1Primitive.fromByteArray(privateKey.getOctets());
    }

    /**
     * Return true if a public key is present, false otherwise.
     *
     * @return true if public included, otherwise false.
     */
    public boolean hasPublicKey()
    {
        return publicKey != null;
    }

    /**
     * for when the public key is an encoded object - if the bitstring
     * can't be decoded this routine throws an IOException.
     *
     * @return the public key as an ASN.1 primitive.
     * @throws IOException - if the bit string doesn't represent a DER
     * encoded object.
     */
    public ASN1Encodable parsePublicKey()
        throws IOException
    {
        return publicKey == null ? null : ASN1Primitive.fromByteArray(publicKey.getOctets());
    }

    /**
     * for when the public key is raw bits.
     *
     * @return the public key as the raw bit string...
     */
    public ASN1BitString getPublicKeyData()
    {
        return publicKey;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector v = new ASN1EncodableVector();

        v.add(version);
        v.add(privateKeyAlgorithm);
        v.add(privateKey);

        if (attributes != null)
        {
            v.add(new DERTaggedObject(false, 0, attributes));
        }

        if (publicKey != null)
        {
            v.add(new DERTaggedObject(false, 1, publicKey));
        }

        return new DERSequence(v);
    }
}
