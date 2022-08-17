/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce.spec;

import java.math.BigInteger;

import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

/**
 * A DHPrivateKeySpec that also carries a set of DH domain parameters.
 * @hide This class is not part of the Android public SDK API
 */
public class DHExtendedPrivateKeySpec
    extends DHPrivateKeySpec
{
    private final DHParameterSpec params;

    /**
     * Base constructor.
     *
     * @param x the private value.
     * @param params the domain parameter set.
     */
    public DHExtendedPrivateKeySpec(BigInteger x, DHParameterSpec params)
    {
        super(x, params.getP(), params.getG());
        this.params = params;
    }

    /**
     * Return the domain parameters associated with this key spec.
     *
     * @return the Diffie-Hellman domain parameters.
     */
    public DHParameterSpec getParams()
    {
        return params;
    }
}
