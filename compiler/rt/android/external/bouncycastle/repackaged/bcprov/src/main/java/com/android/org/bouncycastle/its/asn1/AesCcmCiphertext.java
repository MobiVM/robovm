/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1OctetString;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Sequence;
import com.android.org.bouncycastle.asn1.DEROctetString;
import com.android.org.bouncycastle.asn1.DERSequence;

/**
 * <pre>
 *     AesCcmCiphertext ::= SEQUENCE {
 *         nonce OCTET STRING (SIZE (12))
 *         ccmCiphertext Opaque -- 16 bytes longer than plaintext
 *     }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class AesCcmCiphertext
    extends ASN1Object
{
    private final byte[] nonce;
    private final SequenceOfOctetString opaque;

    private AesCcmCiphertext(ASN1Sequence seq)
    {
        if (seq.size() != 2)
        {
            throw new IllegalArgumentException("sequence not length 2");
        }

        nonce = Utils.octetStringFixed(ASN1OctetString.getInstance(seq.getObjectAt(0)).getOctets(), 12);
        opaque = SequenceOfOctetString.getInstance(seq.getObjectAt(1));
    }

    public static AesCcmCiphertext getInstance(Object o)
    {
        if (o instanceof AesCcmCiphertext)
        {
            return (AesCcmCiphertext)o;
        }
        else if (o != null)
        {
            return new AesCcmCiphertext(ASN1Sequence.getInstance(o));
        }

        return null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector v = new ASN1EncodableVector();

        v.add(new DEROctetString(nonce));
        v.add(opaque);

        return new DERSequence(v);
    }
}