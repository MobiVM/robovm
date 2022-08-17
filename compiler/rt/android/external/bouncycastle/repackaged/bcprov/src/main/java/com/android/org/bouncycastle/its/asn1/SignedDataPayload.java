/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.DERSequence;

/**
 * <pre>
 *     SignedDataPayload ::= SEQUENCE {
 *         data Ieee1609Dot2Data OPTIONAL,
 *         extDataHash HashedData OPTIONAL,
 *         ...
 *     }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class SignedDataPayload
    extends ASN1Object
{
    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector v = new ASN1EncodableVector();

        return new DERSequence(v);
    }
}
