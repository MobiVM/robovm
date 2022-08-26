/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.android.org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.android.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.android.org.bouncycastle.crypto.CipherParameters;
import com.android.org.bouncycastle.crypto.params.DSAParameters;
import com.android.org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import com.android.org.bouncycastle.crypto.params.DSAPublicKeyParameters;
// Android-removed: Unsupported algorithms
// import org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil;
// import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import com.android.org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
// Android-removed: Unsupported algorithms
// import org.bouncycastle.jce.spec.OpenSSHPrivateKeySpec;
// import org.bouncycastle.jce.spec.OpenSSHPublicKeySpec;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class KeyFactorySpi
    extends BaseKeyFactorySpi
{
    public KeyFactorySpi()
    {
    }

    protected KeySpec engineGetKeySpec(
        Key key,
        Class spec)
        throws InvalidKeySpecException
    {
        if (spec.isAssignableFrom(DSAPublicKeySpec.class) && key instanceof DSAPublicKey)
        {
            DSAPublicKey k = (DSAPublicKey)key;

            return new DSAPublicKeySpec(k.getY(), k.getParams().getP(), k.getParams().getQ(), k.getParams().getG());
        }
        else if (spec.isAssignableFrom(DSAPrivateKeySpec.class) && key instanceof java.security.interfaces.DSAPrivateKey)
        {
            java.security.interfaces.DSAPrivateKey k = (java.security.interfaces.DSAPrivateKey)key;

            return new DSAPrivateKeySpec(k.getX(), k.getParams().getP(), k.getParams().getQ(), k.getParams().getG());
        }
        // BEGIN Android-removed: Unsupported algorithms
        /*
        else if (spec.isAssignableFrom(OpenSSHPublicKeySpec.class) && key instanceof java.security.interfaces.DSAPublicKey)
        {
            DSAPublicKey k = (DSAPublicKey)key;
            try
            {
                return new OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new DSAPublicKeyParameters(k.getY(), new DSAParameters(k.getParams().getP(), k.getParams().getQ(), k.getParams().getG()))));
            }
            catch (IOException e)
            {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        }
        else if (spec.isAssignableFrom(OpenSSHPrivateKeySpec.class) && key instanceof java.security.interfaces.DSAPrivateKey)
        {
            DSAPrivateKey k = (DSAPrivateKey)key;
            try
            {
                return new OpenSSHPrivateKeySpec(OpenSSHPrivateKeyUtil.encodePrivateKey(new DSAPrivateKeyParameters(k.getX(), new DSAParameters(k.getParams().getP(), k.getParams().getQ(), k.getParams().getG()))));
            }
            catch (IOException e)
            {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        }
        */
        // END Android-removed: Unsupported algorithms

        return super.engineGetKeySpec(key, spec);
    }

    protected Key engineTranslateKey(
        Key key)
        throws InvalidKeyException
    {
        if (key instanceof DSAPublicKey)
        {
            return new BCDSAPublicKey((DSAPublicKey)key);
        }
        else if (key instanceof DSAPrivateKey)
        {
            return new BCDSAPrivateKey((DSAPrivateKey)key);
        }

        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(PrivateKeyInfo keyInfo)
        throws IOException
    {
        ASN1ObjectIdentifier algOid = keyInfo.getPrivateKeyAlgorithm().getAlgorithm();

        if (DSAUtil.isDsaOid(algOid))
        {
            return new BCDSAPrivateKey(keyInfo);
        }
        else
        {
            throw new IOException("algorithm identifier " + algOid + " in key not recognised");
        }
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo keyInfo)
        throws IOException
    {
        ASN1ObjectIdentifier algOid = keyInfo.getAlgorithm().getAlgorithm();

        if (DSAUtil.isDsaOid(algOid))
        {
            return new BCDSAPublicKey(keyInfo);
        }
        else
        {
            throw new IOException("algorithm identifier " + algOid + " in key not recognised");
        }
    }

    protected PrivateKey engineGeneratePrivate(
        KeySpec keySpec)
        throws InvalidKeySpecException
    {
        if (keySpec instanceof DSAPrivateKeySpec)
        {
            return new BCDSAPrivateKey((DSAPrivateKeySpec)keySpec);
        }
        // BEGIN Android-removed: Unsupported algorithms
        /*
        else if (keySpec instanceof OpenSSHPrivateKeySpec)
        {
            CipherParameters params = OpenSSHPrivateKeyUtil.parsePrivateKeyBlob(((OpenSSHPrivateKeySpec)keySpec).getEncoded());
            if (params instanceof DSAPrivateKeyParameters)
            {
                return engineGeneratePrivate(
                    new DSAPrivateKeySpec(
                        ((DSAPrivateKeyParameters)params).getX(),
                        ((DSAPrivateKeyParameters)params).getParameters().getP(),
                        ((DSAPrivateKeyParameters)params).getParameters().getQ(),
                        ((DSAPrivateKeyParameters)params).getParameters().getG()));
            }
            else
            {
                throw new IllegalArgumentException("openssh private key is not dsa privare key");
            }

        }
        */
        // END Android-removed: Unsupported algorithms

        return super.engineGeneratePrivate(keySpec);
    }

    protected PublicKey engineGeneratePublic(
        KeySpec keySpec)
        throws InvalidKeySpecException
    {
        if (keySpec instanceof DSAPublicKeySpec)
        {
            try
            {
                return new BCDSAPublicKey((DSAPublicKeySpec)keySpec);
            }
            catch (final Exception e)
            {
                throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage())
                {
                    public Throwable getCause()
                    {
                        return e;
                    }
                };
            }
        }
        // BEGIN Android-removed: Unsupported algorithms
        /*
        else if (keySpec instanceof OpenSSHPublicKeySpec)
        {
            CipherParameters parameters = OpenSSHPublicKeyUtil.parsePublicKey(((OpenSSHPublicKeySpec)keySpec).getEncoded());

            if (parameters instanceof DSAPublicKeyParameters)
            {
                return engineGeneratePublic(
                    new DSAPublicKeySpec(((DSAPublicKeyParameters)parameters).getY(),
                        ((DSAPublicKeyParameters)parameters).getParameters().getP(),
                        ((DSAPublicKeyParameters)parameters).getParameters().getQ(),
                        ((DSAPublicKeyParameters)parameters).getParameters().getG()));
            }

            throw new IllegalArgumentException("openssh public key is not dsa public key");

        }
        */
        // END Android-removed: Unsupported algorithms

        return super.engineGeneratePublic(keySpec);
    }
}
