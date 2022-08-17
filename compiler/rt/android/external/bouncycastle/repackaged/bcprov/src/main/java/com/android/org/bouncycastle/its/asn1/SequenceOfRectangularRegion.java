/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Sequence;
import com.android.org.bouncycastle.asn1.DERSequence;

/**
 * <pre>
 *     SequenceOfRectangularRegion ::= SEQUENCE OF RectangularRegion
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class SequenceOfRectangularRegion
    extends ASN1Object
{
    private final RectangularRegion[] sequence;

    private SequenceOfRectangularRegion(ASN1Sequence seq)
    {
        this.sequence = new RectangularRegion[seq.size()];

        for (int i = 0; i != seq.size(); i++)
        {
            sequence[i] = RectangularRegion.getInstance(seq.getObjectAt(i));
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERSequence(sequence);
    }
}
