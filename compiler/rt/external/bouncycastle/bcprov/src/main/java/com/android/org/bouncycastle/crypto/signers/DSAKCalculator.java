/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Interface define calculators of K values for DSA/ECDSA.
 * @hide This class is not part of the Android public SDK API
 */
public interface DSAKCalculator
{
    /**
     * Return true if this calculator is deterministic, false otherwise.
     *
     * @return true if deterministic, otherwise false.
     */
    boolean isDeterministic();

    /**
     * Non-deterministic initialiser.
     *
     * @param n the order of the DSA group.
     * @param random a source of randomness.
     */
    void init(BigInteger n, SecureRandom random);

    /**
     * Deterministic initialiser.
     *
     * @param n the order of the DSA group.
     * @param d the DSA private value.
     * @param message the message being signed.
     */
    void init(BigInteger n, BigInteger d, byte[] message);

    /**
     * Return the next valid value of K.
     *
     * @return a K value.
     */
    BigInteger nextK();
}
