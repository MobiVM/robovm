/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce.interfaces;

import com.android.org.bouncycastle.asn1.x500.X500Name;
import com.android.org.bouncycastle.asn1.x509.TBSCertificate;

/**
 * Interface exposing some additional methods on a BC native certificate object.
 * @hide This class is not part of the Android public SDK API
 */
public interface BCX509Certificate
{
    /**
     * Return the certificate issuer as an X500Name.
     *
     * @return the issuer.
     */
    X500Name getIssuerX500Name();

    /**
     * Return the ASN.1 class representing the TBSCertificate for this certificate.
     *
     * @return the issuer.
     */
    TBSCertificate getTBSCertificateNative();

    /**
     * Return the certificate subject as an X500Name.
     *
     * @return the issuer.
     */
    X500Name getSubjectX500Name();
}
