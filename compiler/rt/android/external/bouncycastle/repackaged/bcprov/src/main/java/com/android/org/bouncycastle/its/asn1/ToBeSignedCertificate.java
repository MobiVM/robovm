/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Sequence;

/**
 * <pre>
 *     ToBeSignedCertificate ::= SEQUENCE {
 *         id CertificateId,
 *         cracaId HashedId3,
 *         crlSeries CrlSeries,
 *         validityPeriod ValidityPeriod,
 *         region GeographicRegion OPTIONAL,
 *         assuranceLevel SubjectAssurance OPTIONAL,
 *         appPermissions SequenceOfPsidSep OPTIONAL,
 *         certIssuePermissions SequenceOfPsidGroupPermissions OPTIONAL,
 *         certRequestPermissions NULL OPTIONAL,
 *         encryptionKey PublicEncryptionKey OPTIONAL,
 *         verifyKeyIndicator VerificationKeyIndicator,
 *         ...
 *     }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class ToBeSignedCertificate
    extends ASN1Object
{
//    private final CertificateId certificateId;

    private ToBeSignedCertificate(ASN1Sequence seq)
    {
  //TODO:      this.certificateId = CertificateId.
    }

    public static ToBeSignedCertificate getInstance(Object src)
    {
        if (src instanceof ToBeSignedCertificate)
        {
            return (ToBeSignedCertificate)src;
        }
        else if (src != null)
        {
            // TODO: need choice processing here
            return new ToBeSignedCertificate(ASN1Sequence.getInstance(src));
        }

        return null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return null;
    }
}
