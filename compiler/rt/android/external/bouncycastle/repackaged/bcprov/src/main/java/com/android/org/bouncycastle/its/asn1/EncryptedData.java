/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1Sequence;

/**
 * <pre>
 *     EncryptedData ::= SEQUENCE {
 *         recipients SequenceOfRecipientInfo,
 *         ciphertext SymmetricCiphertext
 *     }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class EncryptedData
{
    private EncryptedData(ASN1Sequence seq)
    {

    }

    public static EncryptedData getInstance(Object o)
    {
        if (o instanceof EncryptedData)
        {
            return (EncryptedData)o;
        }
        else if (o != null)
        {
            return new EncryptedData(ASN1Sequence.getInstance(o));
        }

        return null;
    }
}
