/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jce.provider;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;

import com.android.org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import com.android.org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;

class WrappedRevocationChecker
    implements PKIXCertRevocationChecker
{
    private final PKIXCertPathChecker checker;

    public WrappedRevocationChecker(PKIXCertPathChecker checker)
    {
        this.checker = checker;
    }

    public void setParameter(String name, Object value)
    {
         // ignore.
    }

    public void initialize(PKIXCertRevocationCheckerParameters params)
        throws CertPathValidatorException
    {
        checker.init(false);
    }

    public void check(Certificate cert)
        throws CertPathValidatorException
    {
        checker.check(cert);
    }
}
