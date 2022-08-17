/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Sequence;
import com.android.org.bouncycastle.asn1.DERSequence;

/**
 * <pre>
 *     HeaderInfo ::= SEQUENCE {
 *         psid Psid,
 *         generationTime Time64 OPTIONAL,
 *         expiryTime Time64 OPTIONAL,
 *         generationLocation ThreeDLocation OPTIONAL,
 *         p2pcdLearningRequest HashedId3 OPTIONAL,
 *         missingCrlIdentifier MissingCrlIdentifier OPTIONAL,
 *         ...,
 *         inlineP2pcdRequest SequenceOfHashedId3 OPTIONAL,
 *         requestedCertificate Certificate OPTIONAL
 *     }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class HeaderInfo
    extends ASN1Object
{
    private HeaderInfo(ASN1Sequence seq)
    {

    }

    public static HeaderInfo getInstance(Object o)
    {
        if (o instanceof HeaderInfo)
        {
            return (HeaderInfo)o;
        }
        else if (o != null)
        {
            return new HeaderInfo(ASN1Sequence.getInstance(o));
        }

        return null;
    }
    
    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector v = new ASN1EncodableVector();

        return new DERSequence(v);
    }
}