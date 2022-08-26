/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;

import javax.security.auth.x500.X500Principal;

import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Encoding;
import com.android.org.bouncycastle.asn1.ASN1Integer;
import com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.android.org.bouncycastle.asn1.DERBitString;
import com.android.org.bouncycastle.asn1.DERSequence;
import com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import com.android.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.android.org.bouncycastle.asn1.x509.TBSCertificate;
import com.android.org.bouncycastle.asn1.x509.Time;
import com.android.org.bouncycastle.asn1.x509.V1TBSCertificateGenerator;
import com.android.org.bouncycastle.asn1.x509.X509Name;
import com.android.org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import com.android.org.bouncycastle.jcajce.util.BCJcaJceHelper;
import com.android.org.bouncycastle.jcajce.util.JcaJceHelper;
import com.android.org.bouncycastle.jce.X509Principal;

/**
 * class to produce an X.509 Version 1 certificate.
 * @deprecated use org.bouncycastle.cert.X509v1CertificateBuilder.
 * @hide This class is not part of the Android public SDK API
 */
@libcore.api.CorePlatformApi
public class X509V1CertificateGenerator
{
    private final JcaJceHelper bcHelper = new BCJcaJceHelper(); // needed to force provider loading
    private final CertificateFactory certificateFactory = new CertificateFactory();

    private V1TBSCertificateGenerator   tbsGen;
    private ASN1ObjectIdentifier         sigOID;
    private AlgorithmIdentifier         sigAlgId;
    private String                      signatureAlgorithm;

    @libcore.api.CorePlatformApi
    public X509V1CertificateGenerator()
    {
        tbsGen = new V1TBSCertificateGenerator();
    }

    /**
     * reset the generator
     */
    public void reset()
    {
        tbsGen = new V1TBSCertificateGenerator();
    }

    /**
     * set the serial number for the certificate.
     */
    @libcore.api.CorePlatformApi
    public void setSerialNumber(
        BigInteger      serialNumber)
    {
        if (serialNumber.compareTo(BigInteger.ZERO) <= 0)
        {
            throw new IllegalArgumentException("serial number must be a positive integer");
        }
        
        tbsGen.setSerialNumber(new ASN1Integer(serialNumber));
    }

    /**
     * Set the issuer distinguished name - the issuer is the entity whose private key is used to sign the
     * certificate.
     */
    @libcore.api.CorePlatformApi
    public void setIssuerDN(
        X500Principal   issuer)
    {
        try
        {
            tbsGen.setIssuer(new X509Principal(issuer.getEncoded()));
        }
        catch (IOException e)
        {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
    }
    
    /**
     * Set the issuer distinguished name - the issuer is the entity whose private key is used to sign the
     * certificate.
     */
    public void setIssuerDN(
        X509Name   issuer)
    {
        tbsGen.setIssuer(issuer);
    }

    @libcore.api.CorePlatformApi
    public void setNotBefore(
        Date    date)
    {
        tbsGen.setStartDate(new Time(date));
    }

    @libcore.api.CorePlatformApi
    public void setNotAfter(
        Date    date)
    {
        tbsGen.setEndDate(new Time(date));
    }

    /**
     * Set the subject distinguished name. The subject describes the entity associated with the public key.
     */
    @libcore.api.CorePlatformApi
    public void setSubjectDN(
        X500Principal   subject)
    {
        try
        {
            tbsGen.setSubject(new X509Principal(subject.getEncoded()));
        }
        catch (IOException e)
        {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
    }
    
    /**
     * Set the subject distinguished name. The subject describes the entity associated with the public key.
     */
    public void setSubjectDN(
        X509Name   subject)
    {
        tbsGen.setSubject(subject);
    }

    @libcore.api.CorePlatformApi
    public void setPublicKey(
        PublicKey       key)
    {
        try
        {
            tbsGen.setSubjectPublicKeyInfo(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("unable to process key - " + e.toString());
        }
    }

    /**
     * Set the signature algorithm. This can be either a name or an OID, names
     * are treated as case insensitive.
     * 
     * @param signatureAlgorithm string representation of the algorithm name.
     */
    @libcore.api.CorePlatformApi
    public void setSignatureAlgorithm(
        String  signatureAlgorithm)
    {
        this.signatureAlgorithm = signatureAlgorithm;

        try
        {
            sigOID = X509Util.getAlgorithmOID(signatureAlgorithm);
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("Unknown signature type requested");
        }

        sigAlgId = X509Util.getSigAlgID(sigOID, signatureAlgorithm);

        tbsGen.setSignature(sigAlgId);
    }

    /**
     * generate an X509 certificate, based on the current issuer and subject
     * using the default provider "BC".
     * @deprecated use generate(key, "BC")
     */
    public X509Certificate generateX509Certificate(
        PrivateKey      key)
        throws SecurityException, SignatureException, InvalidKeyException
    {
        try
        {
            return generateX509Certificate(key, "BC", null);
        }
        catch (NoSuchProviderException e)
        {
            throw new SecurityException("BC provider not installed!");
        }
    }

    /**
     * generate an X509 certificate, based on the current issuer and subject
     * using the default provider "BC" and the passed in source of randomness
     * @deprecated use generate(key, random, "BC")
     */
    public X509Certificate generateX509Certificate(
        PrivateKey      key,
        SecureRandom    random)
        throws SecurityException, SignatureException, InvalidKeyException
    {
        try
        {
            return generateX509Certificate(key, "BC", random);
        }
        catch (NoSuchProviderException e)
        {
            throw new SecurityException("BC provider not installed!");
        }
    }

    /**
     * generate an X509 certificate, based on the current issuer and subject,
     * using the passed in provider for the signing, and the passed in source
     * of randomness (if required).
     * @deprecated use generate()
     */
    public X509Certificate generateX509Certificate(
        PrivateKey      key,
        String          provider)
        throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException
    {
        return generateX509Certificate(key, provider, null);
    }

    /**
     * generate an X509 certificate, based on the current issuer and subject,
     * using the passed in provider for the signing, and the passed in source
     * of randomness (if required).
     * @deprecated use generate()
     */
    public X509Certificate generateX509Certificate(
        PrivateKey      key,
        String          provider,
        SecureRandom    random)
        throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException
    {
        try
        {
            return generate(key, provider, random);
        }
        catch (NoSuchProviderException e)
        {
            throw e;
        }
        catch (SignatureException e)
        {
            throw e;
        }
        catch (InvalidKeyException e)
        {
            throw e;
        }
        catch (GeneralSecurityException e)
        {
            throw new SecurityException("exception: " + e);
        }
    }

    /**
     * generate an X509 certificate, based on the current issuer and subject
     * using the default provider.
     * <p>
     * <b>Note:</b> this differs from the deprecated method in that the default provider is
     * used - not "BC".
     * </p>
     */
    public X509Certificate generate(
        PrivateKey      key)
        throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        return generate(key, (SecureRandom)null);
    }

    /**
     * generate an X509 certificate, based on the current issuer and subject
     * using the default provider and the passed in source of randomness
     * <p>
     * <b>Note:</b> this differs from the deprecated method in that the default provider is
     * used - not "BC".
     * </p>
     */
    public X509Certificate generate(
        PrivateKey      key,
        SecureRandom    random)
        throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        TBSCertificate tbsCert = tbsGen.generateTBSCertificate();
        byte[] signature;

        try
        {
            signature = X509Util.calculateSignature(sigOID, signatureAlgorithm, key, random, tbsCert);
        }
        catch (IOException e)
        {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e);
        }

        return generateJcaObject(tbsCert, signature);
    }

    /**
     * generate an X509 certificate, based on the current issuer and subject,
     * using the passed in provider for the signing, and the passed in source
     * of randomness (if required).
     */
    @libcore.api.CorePlatformApi
    public X509Certificate generate(
        PrivateKey      key,
        String          provider)
        throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        return generate(key, provider, null);
    }

    /**
     * generate an X509 certificate, based on the current issuer and subject,
     * using the passed in provider for the signing, and the passed in source
     * of randomness (if required).
     */
    public X509Certificate generate(
        PrivateKey      key,
        String          provider,
        SecureRandom    random)
        throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        TBSCertificate tbsCert = tbsGen.generateTBSCertificate();
        byte[] signature;

        try
        {
            signature = X509Util.calculateSignature(sigOID, signatureAlgorithm, provider, key, random, tbsCert);
        }
        catch (IOException e)
        {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e);
        }

        return generateJcaObject(tbsCert, signature);
    }

    private X509Certificate generateJcaObject(TBSCertificate tbsCert, byte[] signature)
        throws CertificateEncodingException
    {
        ASN1EncodableVector v = new ASN1EncodableVector();

        v.add(tbsCert);
        v.add(sigAlgId);
        v.add(new DERBitString(signature));

        try
        {
            return (X509Certificate)certificateFactory.engineGenerateCertificate(
                new ByteArrayInputStream(new DERSequence(v).getEncoded(ASN1Encoding.DER)));
        }
        catch (Exception e)
        {
            throw new ExtCertificateEncodingException("exception producing certificate object", e);
        }
    }

    /**
     * Return an iterator of the signature names supported by the generator.
     * 
     * @return an iterator containing recognised names.
     */
    public Iterator getSignatureAlgNames()
    {
        return X509Util.getAlgNames();
    }
}
