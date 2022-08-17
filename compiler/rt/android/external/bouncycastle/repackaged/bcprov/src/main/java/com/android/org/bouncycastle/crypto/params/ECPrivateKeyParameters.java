/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.crypto.params;

import java.math.BigInteger;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class ECPrivateKeyParameters
    extends ECKeyParameters
{
    private final BigInteger d;

    public ECPrivateKeyParameters(
        BigInteger          d,
        ECDomainParameters  parameters)
    {
        super(true, parameters);

        this.d = parameters.validatePrivateScalar(d);
    }

    public BigInteger getD()
    {
        return d;
    }
}
