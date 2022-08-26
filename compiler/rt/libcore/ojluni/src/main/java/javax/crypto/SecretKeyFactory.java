/*
 * Copyright (c) 1997, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javax.crypto;

import java.util.*;

import java.security.*;
import java.security.Provider.Service;
import java.security.spec.*;

import sun.security.jca.*;
import sun.security.jca.GetInstance.Instance;

/**
 * This class represents a factory for secret keys.
 *
 * <P> Key factories are used to convert <I>keys</I> (opaque
 * cryptographic keys of type <code>Key</code>) into <I>key specifications</I>
 * (transparent representations of the underlying key material), and vice
 * versa.
 * Secret key factories operate only on secret (symmetric) keys.
 *
 * <P> Key factories are bi-directional, i.e., they allow to build an opaque
 * key object from a given key specification (key material), or to retrieve
 * the underlying key material of a key object in a suitable format.
 *
 * <P> Application developers should refer to their provider's documentation
 * to find out which key specifications are supported by the
 * {@link #generateSecret(java.security.spec.KeySpec) generateSecret} and
 * {@link #getKeySpec(javax.crypto.SecretKey, java.lang.Class) getKeySpec}
 * methods.
 * For example, the DES secret-key factory supplied by the "SunJCE" provider
 * supports <code>DESKeySpec</code> as a transparent representation of DES
 * keys, and that provider's secret-key factory for Triple DES keys supports
 * <code>DESedeKeySpec</code> as a transparent representation of Triple DES
 * keys.
 *
 * <p> Android provides the following <code>SecretKeyFactory</code> algorithms:
 * <table>
 *   <thead>
 *     <tr>
 *       <th>Algorithm</th>
 *       <th>Supported API Levels</th>
 *     </tr>
 *   </thead>
 *   <tbody>
 *     <tr>
 *       <td>AES</td>
 *       <td>23+</td>
 *     </tr>
 *     <tr>
 *       <td>DES</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>DESede</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA1</td>
 *       <td>23+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA224</td>
 *       <td>23+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA256</td>
 *       <td>23+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA384</td>
 *       <td>23+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA512</td>
 *       <td>23+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA1</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA1AndAES_128</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA1AndAES_256</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA224AndAES_128</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA224AndAES_256</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA256AndAES_128</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA256AndAES_256</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA384AndAES_128</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA384AndAES_256</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA512AndAES_128</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA512AndAES_256</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithMD5AND128BITAES-CBC-OPENSSL</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithMD5AND192BITAES-CBC-OPENSSL</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithMD5AND256BITAES-CBC-OPENSSL</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithMD5ANDDES</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithMD5ANDRC2</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHA1ANDDES</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHA1ANDRC2</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHA256AND128BITAES-CBC-BC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHA256AND192BITAES-CBC-BC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHA256AND256BITAES-CBC-BC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND128BITAES-CBC-BC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND128BITRC2-CBC</td>
 *       <td>10+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND128BITRC4</td>
 *       <td>10+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND192BITAES-CBC-BC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND2-KEYTRIPLEDES-CBC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND256BITAES-CBC-BC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND3-KEYTRIPLEDES-CBC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND40BITRC2-CBC</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAAND40BITRC4</td>
 *       <td>10+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithSHAANDTWOFISH-CBC</td>
 *       <td>10+</td>
 *     </tr>
 *     <tr>
 *       <td>PBKDF2withHmacSHA1</td>
 *       <td>10+</td>
 *     </tr>
 *     <tr>
 *       <td>PBKDF2withHmacSHA1And8BIT</td>
 *       <td>19+</td>
 *     </tr>
 *     <tr>
 *       <td>PBKDF2withHmacSHA224</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBKDF2withHmacSHA256</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBKDF2withHmacSHA384</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBKDF2withHmacSHA512</td>
 *       <td>26+</td>
 *     </tr>
 *   </tbody>
 * </table>
 *
 * These algorithms are described in the <a href=
 * "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#SecretKeyFactory">
 * SecretKeyFactory section</a> of the
 * Java Cryptography Architecture Standard Algorithm Name Documentation.
 *
 * @author Jan Luehe
 *
 * @see SecretKey
 * @see javax.crypto.spec.DESKeySpec
 * @see javax.crypto.spec.DESedeKeySpec
 * @see javax.crypto.spec.PBEKeySpec
 * @since 1.4
 */

public class SecretKeyFactory {

    // The provider
    private Provider provider;

    // The algorithm associated with this factory
    private final String algorithm;

    // The provider implementation (delegate)
    private volatile SecretKeyFactorySpi spi;

    // lock for mutex during provider selection
    private final Object lock = new Object();

    // remaining services to try in provider selection
    // null once provider is selected
    private Iterator<Service> serviceIterator;

    /**
     * Creates a SecretKeyFactory object.
     *
     * @param keyFacSpi the delegate
     * @param provider the provider
     * @param algorithm the secret-key algorithm
     */
    protected SecretKeyFactory(SecretKeyFactorySpi keyFacSpi,
                               Provider provider, String algorithm) {
        this.spi = keyFacSpi;
        this.provider = provider;
        this.algorithm = algorithm;
    }

    private SecretKeyFactory(String algorithm) throws NoSuchAlgorithmException {
        this.algorithm = algorithm;
        List<Service> list =
                GetInstance.getServices("SecretKeyFactory", algorithm);
        serviceIterator = list.iterator();
        // fetch and instantiate initial spi
        if (nextSpi(null) == null) {
            throw new NoSuchAlgorithmException
                (algorithm + " SecretKeyFactory not available");
        }
    }

    /**
     * Returns a <code>SecretKeyFactory</code> object that converts
     * secret keys of the specified algorithm.
     *
     * <p> This method traverses the list of registered security Providers,
     * starting with the most preferred Provider.
     * A new SecretKeyFactory object encapsulating the
     * SecretKeyFactorySpi implementation from the first
     * Provider that supports the specified algorithm is returned.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param algorithm the standard name of the requested secret-key
     * algorithm.
     * See the SecretKeyFactory section in the <a href=
     * "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#SecretKeyFactory">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @return the new <code>SecretKeyFactory</code> object.
     *
     * @exception NullPointerException if the specified algorithm
     *          is null.
     *
     * @exception NoSuchAlgorithmException if no Provider supports a
     *          SecretKeyFactorySpi implementation for the
     *          specified algorithm.
     *
     * @see java.security.Provider
     */
    public static final SecretKeyFactory getInstance(String algorithm)
            throws NoSuchAlgorithmException {
        return new SecretKeyFactory(algorithm);
    }

    /**
     * Returns a <code>SecretKeyFactory</code> object that converts
     * secret keys of the specified algorithm.
     *
     * <p> A new SecretKeyFactory object encapsulating the
     * SecretKeyFactorySpi implementation from the specified provider
     * is returned.  The specified provider must be registered
     * in the security provider list.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param algorithm the standard name of the requested secret-key
     * algorithm.
     * See the SecretKeyFactory section in the <a href=
     * "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#SecretKeyFactory">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @param provider the name of the provider.
     *
     * @return the new <code>SecretKeyFactory</code> object.
     *
     * @exception NoSuchAlgorithmException if a SecretKeyFactorySpi
     *          implementation for the specified algorithm is not
     *          available from the specified provider.
     *
     * @exception NullPointerException if the specified algorithm
     *          is null.
     *
     * @throws NoSuchProviderException if the specified provider is not
     *          registered in the security provider list.
     *
     * @exception IllegalArgumentException if the <code>provider</code>
     *          is null or empty.
     *
     * @see java.security.Provider
     */
    public static final SecretKeyFactory getInstance(String algorithm,
            String provider) throws NoSuchAlgorithmException,
            NoSuchProviderException {
        // Android-added: Check for Bouncy Castle deprecation
        Providers.checkBouncyCastleDeprecation(provider, "SecretKeyFactory", algorithm);
        Instance instance = JceSecurity.getInstance("SecretKeyFactory",
                SecretKeyFactorySpi.class, algorithm, provider);
        return new SecretKeyFactory((SecretKeyFactorySpi)instance.impl,
                instance.provider, algorithm);
    }

    /**
     * Returns a <code>SecretKeyFactory</code> object that converts
     * secret keys of the specified algorithm.
     *
     * <p> A new SecretKeyFactory object encapsulating the
     * SecretKeyFactorySpi implementation from the specified Provider
     * object is returned.  Note that the specified Provider object
     * does not have to be registered in the provider list.
     *
     * @param algorithm the standard name of the requested secret-key
     * algorithm.
     * See the SecretKeyFactory section in the <a href=
     * "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#SecretKeyFactory">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @param provider the provider.
     *
     * @return the new <code>SecretKeyFactory</code> object.
     *
     * @exception NullPointerException if the specified algorithm
     * is null.
     *
     * @exception NoSuchAlgorithmException if a SecretKeyFactorySpi
     *          implementation for the specified algorithm is not available
     *          from the specified Provider object.
     *
     * @exception IllegalArgumentException if the <code>provider</code>
     *          is null.
     *
     * @see java.security.Provider
     */
    public static final SecretKeyFactory getInstance(String algorithm,
            Provider provider) throws NoSuchAlgorithmException {
        // Android-added: Check for Bouncy Castle deprecation
        Providers.checkBouncyCastleDeprecation(provider, "SecretKeyFactory", algorithm);
        Instance instance = JceSecurity.getInstance("SecretKeyFactory",
                SecretKeyFactorySpi.class, algorithm, provider);
        return new SecretKeyFactory((SecretKeyFactorySpi)instance.impl,
                instance.provider, algorithm);
    }

    /**
     * Returns the provider of this <code>SecretKeyFactory</code> object.
     *
     * @return the provider of this <code>SecretKeyFactory</code> object
     */
    public final Provider getProvider() {
        synchronized (lock) {
            // disable further failover after this call
            serviceIterator = null;
            return provider;
        }
    }

    /**
     * Returns the algorithm name of this <code>SecretKeyFactory</code> object.
     *
     * <p>This is the same name that was specified in one of the
     * <code>getInstance</code> calls that created this
     * <code>SecretKeyFactory</code> object.
     *
     * @return the algorithm name of this <code>SecretKeyFactory</code>
     * object.
     */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Update the active spi of this class and return the next
     * implementation for failover. If no more implemenations are
     * available, this method returns null. However, the active spi of
     * this class is never set to null.
     */
    private SecretKeyFactorySpi nextSpi(SecretKeyFactorySpi oldSpi) {
        synchronized (lock) {
            // somebody else did a failover concurrently
            // try that spi now
            if ((oldSpi != null) && (oldSpi != spi)) {
                return spi;
            }
            if (serviceIterator == null) {
                return null;
            }
            while (serviceIterator.hasNext()) {
                Service s = serviceIterator.next();
                if (JceSecurity.canUseProvider(s.getProvider()) == false) {
                    continue;
                }
                try {
                    Object obj = s.newInstance(null);
                    if (obj instanceof SecretKeyFactorySpi == false) {
                        continue;
                    }
                    SecretKeyFactorySpi spi = (SecretKeyFactorySpi)obj;
                    provider = s.getProvider();
                    this.spi = spi;
                    return spi;
                } catch (NoSuchAlgorithmException e) {
                    // ignore
                }
            }
            serviceIterator = null;
            return null;
        }
    }

    /**
     * Generates a <code>SecretKey</code> object from the provided key
     * specification (key material).
     *
     * @param keySpec the specification (key material) of the secret key
     *
     * @return the secret key
     *
     * @exception InvalidKeySpecException if the given key specification
     * is inappropriate for this secret-key factory to produce a secret key.
     */
    public final SecretKey generateSecret(KeySpec keySpec)
            throws InvalidKeySpecException {
        if (serviceIterator == null) {
            return spi.engineGenerateSecret(keySpec);
        }
        Exception failure = null;
        SecretKeyFactorySpi mySpi = spi;
        do {
            try {
                return mySpi.engineGenerateSecret(keySpec);
            } catch (Exception e) {
                if (failure == null) {
                    failure = e;
                }
                mySpi = nextSpi(mySpi);
            }
        } while (mySpi != null);
        if (failure instanceof InvalidKeySpecException) {
            throw (InvalidKeySpecException)failure;
        }
        throw new InvalidKeySpecException
                ("Could not generate secret key", failure);
    }

    /**
     * Returns a specification (key material) of the given key object
     * in the requested format.
     *
     * @param key the key
     * @param keySpec the requested format in which the key material shall be
     * returned
     *
     * @return the underlying key specification (key material) in the
     * requested format
     *
     * @exception InvalidKeySpecException if the requested key specification is
     * inappropriate for the given key (e.g., the algorithms associated with
     * <code>key</code> and <code>keySpec</code> do not match, or
     * <code>key</code> references a key on a cryptographic hardware device
     * whereas <code>keySpec</code> is the specification of a software-based
     * key), or the given key cannot be dealt with
     * (e.g., the given key has an algorithm or format not supported by this
     * secret-key factory).
     */
    public final KeySpec getKeySpec(SecretKey key, Class<?> keySpec)
            throws InvalidKeySpecException {
        if (serviceIterator == null) {
            return spi.engineGetKeySpec(key, keySpec);
        }
        Exception failure = null;
        SecretKeyFactorySpi mySpi = spi;
        do {
            try {
                return mySpi.engineGetKeySpec(key, keySpec);
            } catch (Exception e) {
                if (failure == null) {
                    failure = e;
                }
                mySpi = nextSpi(mySpi);
            }
        } while (mySpi != null);
        if (failure instanceof InvalidKeySpecException) {
            throw (InvalidKeySpecException)failure;
        }
        throw new InvalidKeySpecException
                ("Could not get key spec", failure);
    }

    /**
     * Translates a key object, whose provider may be unknown or potentially
     * untrusted, into a corresponding key object of this secret-key factory.
     *
     * @param key the key whose provider is unknown or untrusted
     *
     * @return the translated key
     *
     * @exception InvalidKeyException if the given key cannot be processed
     * by this secret-key factory.
     */
    public final SecretKey translateKey(SecretKey key)
            throws InvalidKeyException {
        if (serviceIterator == null) {
            return spi.engineTranslateKey(key);
        }
        Exception failure = null;
        SecretKeyFactorySpi mySpi = spi;
        do {
            try {
                return mySpi.engineTranslateKey(key);
            } catch (Exception e) {
                if (failure == null) {
                    failure = e;
                }
                mySpi = nextSpi(mySpi);
            }
        } while (mySpi != null);
        if (failure instanceof InvalidKeyException) {
            throw (InvalidKeyException)failure;
        }
        throw new InvalidKeyException
                ("Could not translate key", failure);
    }
}
