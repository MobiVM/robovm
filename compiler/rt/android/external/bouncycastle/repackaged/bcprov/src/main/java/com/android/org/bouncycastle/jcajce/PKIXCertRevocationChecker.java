/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;

/**
 * @hide This class is not part of the Android public SDK API
 */
public interface PKIXCertRevocationChecker
{
    void setParameter(String name, Object value);

    void initialize(PKIXCertRevocationCheckerParameters params)
        throws CertPathValidatorException;

    void check(Certificate cert)
        throws CertPathValidatorException;
}
