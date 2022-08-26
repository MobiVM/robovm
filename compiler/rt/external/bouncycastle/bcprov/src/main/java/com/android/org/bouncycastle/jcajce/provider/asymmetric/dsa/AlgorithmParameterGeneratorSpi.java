/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;

import com.android.org.bouncycastle.crypto.CryptoServicesRegistrar;
import com.android.org.bouncycastle.crypto.digests.SHA256Digest;
import com.android.org.bouncycastle.crypto.generators.DSAParametersGenerator;
import com.android.org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import com.android.org.bouncycastle.crypto.params.DSAParameters;
import com.android.org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import com.android.org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class AlgorithmParameterGeneratorSpi
    extends BaseAlgorithmParameterGeneratorSpi
{
    protected SecureRandom random;
    // Android-changed: Change default strength to 1024
    // In 1.57, the default strength was changed to 2048.  We keep it at 1024 for app
    // compatibility, particularly because the default digest (SHA-1) doesn't have
    // a sufficiently long digest to work with 2048-bit keys.
    protected int strength = 1024;
    protected DSAParameterGenerationParameters params;

    protected void engineInit(
        int strength,
        SecureRandom random)
    {
        if (strength < 512 || strength > 3072)
        {
            throw new InvalidParameterException("strength must be from 512 - 3072");
        }

        if (strength <= 1024 && strength % 64 != 0)
        {
            throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        }

        if (strength > 1024 && strength % 1024 != 0)
        {
            throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }

        this.strength = strength;
        this.random = random;
    }

    protected void engineInit(
        AlgorithmParameterSpec genParamSpec,
        SecureRandom random)
        throws InvalidAlgorithmParameterException
    {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }

    protected AlgorithmParameters engineGenerateParameters()
    {
        DSAParametersGenerator pGen;

        if (strength <= 1024)
        {
            pGen = new DSAParametersGenerator();
        }
        else
        {
            pGen = new DSAParametersGenerator(new SHA256Digest());
        }

        if (random == null)
        {
            random = CryptoServicesRegistrar.getSecureRandom();
        }

        int certainty = PrimeCertaintyCalculator.getDefaultCertainty(strength);

        if (strength == 1024)
        {
            params = new DSAParameterGenerationParameters(1024, 160, certainty, random);
            pGen.init(params);
        }
        else if (strength > 1024)
        {
            params = new DSAParameterGenerationParameters(strength, 256, certainty, random);
            pGen.init(params);
        }
        else
        {
            pGen.init(strength, certainty, random);
        }

        DSAParameters p = pGen.generateParameters();

        AlgorithmParameters params;

        try
        {
            params = createParametersInstance("DSA");
            params.init(new DSAParameterSpec(p.getP(), p.getQ(), p.getG()));
        }
        catch (Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }

        return params;
    }
}
