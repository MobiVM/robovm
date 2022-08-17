/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateEncodingException;

import com.android.org.bouncycastle.asn1.x509.BasicConstraints;
import com.android.org.bouncycastle.jcajce.util.JcaJceHelper;

class X509CertificateInternal extends X509CertificateImpl
{
    private final byte[] encoding;

    X509CertificateInternal(JcaJceHelper bcHelper, com.android.org.bouncycastle.asn1.x509.Certificate c,
        BasicConstraints basicConstraints, boolean[] keyUsage, String sigAlgName, byte[] sigAlgParams, byte[] encoding)
    {
        super(bcHelper, c, basicConstraints, keyUsage, sigAlgName, sigAlgParams);

        this.encoding = encoding;
    }

    public byte[] getEncoded() throws CertificateEncodingException
    {
        if (null == encoding)
        {
            throw new CertificateEncodingException();
        }

        return encoding;
    }
}
