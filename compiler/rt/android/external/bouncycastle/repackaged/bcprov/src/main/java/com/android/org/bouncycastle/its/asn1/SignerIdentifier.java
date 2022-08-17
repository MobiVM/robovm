/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1Choice;
import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.DERSequence;

/**
 * <pre>
 *     SignerIdentifier ::= CHOICE {
 *         digest HashedId8,
 *         certificate SequenceOfCertificate,
 *         self NULL,
 *         ...
 *     }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class SignerIdentifier
    extends ASN1Object
    implements ASN1Choice
{
    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector v = new ASN1EncodableVector();

        return new DERSequence(v);
    }
}