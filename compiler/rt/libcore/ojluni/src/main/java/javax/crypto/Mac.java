/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1998, 2014, Oracle and/or its affiliates. All rights reserved.
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
import java.security.spec.AlgorithmParameterSpec;

import java.nio.ByteBuffer;

import sun.security.jca.*;
import sun.security.jca.GetInstance.Instance;

/**
 * This class provides the functionality of a "Message Authentication Code"
 * (MAC) algorithm.
 *
 * <p> A MAC provides a way to check
 * the integrity of information transmitted over or stored in an unreliable
 * medium, based on a secret key. Typically, message
 * authentication codes are used between two parties that share a secret
 * key in order to validate information transmitted between these
 * parties.
 *
 * <p> A MAC mechanism that is based on cryptographic hash functions is
 * referred to as HMAC. HMAC can be used with any cryptographic hash function,
 * e.g., MD5 or SHA-1, in combination with a secret shared key. HMAC is
 * specified in RFC 2104.
 *
 * <p> Android provides the following <code>Mac</code> algorithms:
 * <table>
 *   <thead>
 *     <tr>
 *       <th>Algorithm</th>
 *       <th>Supported API Levels</th>
 *     </tr>
 *   </thead>
 *   <tbody>
 *     <tr class="deprecated">
 *       <td>DESMAC</td>
 *       <td>1-8</td>
 *     </tr>
 *     <tr class="deprecated">
 *       <td>DESMAC/CFB8</td>
 *       <td>1-8</td>
 *     </tr>
 *     <tr class="deprecated">
 *       <td>DESedeMAC</td>
 *       <td>1-8</td>
 *     </tr>
 *     <tr class="deprecated">
 *       <td>DESedeMAC/CFB8</td>
 *       <td>1-8</td>
 *     </tr>
 *     <tr class="deprecated">
 *       <td>DESedeMAC64</td>
 *       <td>1-8</td>
 *     </tr>
 *     <tr class="deprecated">
 *       <td>DESwithISO9797</td>
 *       <td>1-8</td>
 *     </tr>
 *     <tr>
 *       <td>HmacMD5</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA1</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA224</td>
 *       <td>1-8,22+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA256</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA384</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>HmacSHA512</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr class="deprecated">
 *       <td>ISO9797ALG3MAC</td>
 *       <td>1-8</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA1</td>
 *       <td>1+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA224</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA256</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA384</td>
 *       <td>26+</td>
 *     </tr>
 *     <tr>
 *       <td>PBEwithHmacSHA512</td>
 *       <td>26+</td>
 *     </tr>
 *   </tbody>
 * </table>
 *
 * These algorithms are described in the
 * <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#Mac">
 * Mac section</a> of the
 * Java Cryptography Architecture Standard Algorithm Name Documentation.
 *
 * @author Jan Luehe
 *
 * @since 1.4
 */

public class Mac implements Cloneable {

    // Android-removed: this debugging mechanism is not used in Android.
    /*
    private static final Debug debug =
                        Debug.getInstance("jca", "Mac");

    private static final Debug pdebug =
                        Debug.getInstance("provider", "Provider");
    private static final boolean skipDebug =
        Debug.isOn("engine=") && !Debug.isOn("mac");
    */

    // The provider
    private Provider provider;

    // The provider implementation (delegate)
    private MacSpi spi;

    // The name of the MAC algorithm.
    private final String algorithm;

    // Has this object been initialized?
    private boolean initialized = false;

    // BEGIN Android-removed: Redo the provider selection logic to allow reselecting provider.
    // When only the algorithm is specified, we want to allow the Mac provider for that
    // algorithm to change if multiple providers exist and they support different subsets of
    // keys.  To that end, we don't hold an iterator and exhaust it when we need to choose
    // a provider like the upstream implementation, we reestablish the list of providers
    // each time.
    /*
    // next service to try in provider selection
    // null once provider is selected
    private Service firstService;

    // remaining services to try in provider selection
    // null once provider is selected
    private Iterator<Service> serviceIterator;
    */
    // END Android-removed: Redo the provider selection logic to allow reselecting provider.

    private final Object lock;

    /**
     * Creates a MAC object.
     *
     * @param macSpi the delegate
     * @param provider the provider
     * @param algorithm the algorithm
     */
    protected Mac(MacSpi macSpi, Provider provider, String algorithm) {
        this.spi = macSpi;
        this.provider = provider;
        this.algorithm = algorithm;
        lock = null;
    }

    // Android-changed: Remove Service and Iterator from constructor args.
    private Mac(String algorithm) {
        this.algorithm = algorithm;
        lock = new Object();
    }

    /**
     * Returns the algorithm name of this <code>Mac</code> object.
     *
     * <p>This is the same name that was specified in one of the
     * <code>getInstance</code> calls that created this
     * <code>Mac</code> object.
     *
     * @return the algorithm name of this <code>Mac</code> object.
     */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Returns a <code>Mac</code> object that implements the
     * specified MAC algorithm.
     *
     * <p> This method traverses the list of registered security Providers,
     * starting with the most preferred Provider.
     * A new Mac object encapsulating the
     * MacSpi implementation from the first
     * Provider that supports the specified algorithm is returned.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param algorithm the standard name of the requested MAC algorithm.
     * See the Mac section in the <a href=
     *   "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#Mac">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @return the new <code>Mac</code> object.
     *
     * @exception NoSuchAlgorithmException if no Provider supports a
     *          MacSpi implementation for the
     *          specified algorithm.
     *
     * @see java.security.Provider
     */
    public static final Mac getInstance(String algorithm)
            throws NoSuchAlgorithmException {
        List<Service> services = GetInstance.getServices("Mac", algorithm);
        // make sure there is at least one service from a signed provider
        Iterator<Service> t = services.iterator();
        while (t.hasNext()) {
            Service s = t.next();
            if (JceSecurity.canUseProvider(s.getProvider()) == false) {
                continue;
            }
            // Android-changed: Remove Service and Iterator from constructor args.
            // return new Mac(s, t, algorithm);
            return new Mac(algorithm);
        }
        throw new NoSuchAlgorithmException
                                ("Algorithm " + algorithm + " not available");
    }

    /**
     * Returns a <code>Mac</code> object that implements the
     * specified MAC algorithm.
     *
     * <p> A new Mac object encapsulating the
     * MacSpi implementation from the specified provider
     * is returned.  The specified provider must be registered
     * in the security provider list.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param algorithm the standard name of the requested MAC algorithm.
     * See the Mac section in the <a href=
     *   "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#Mac">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @param provider the name of the provider.
     *
     * @return the new <code>Mac</code> object.
     *
     * @exception NoSuchAlgorithmException if a MacSpi
     *          implementation for the specified algorithm is not
     *          available from the specified provider.
     *
     * @exception NoSuchProviderException if the specified provider is not
     *          registered in the security provider list.
     *
     * @exception IllegalArgumentException if the <code>provider</code>
     *          is null or empty.
     *
     * @see java.security.Provider
     */
    public static final Mac getInstance(String algorithm, String provider)
            throws NoSuchAlgorithmException, NoSuchProviderException {
        // Android-added: Check for Bouncy Castle deprecation
        Providers.checkBouncyCastleDeprecation(provider, "Mac", algorithm);
        Instance instance = JceSecurity.getInstance
                ("Mac", MacSpi.class, algorithm, provider);
        return new Mac((MacSpi)instance.impl, instance.provider, algorithm);
    }

    /**
     * Returns a <code>Mac</code> object that implements the
     * specified MAC algorithm.
     *
     * <p> A new Mac object encapsulating the
     * MacSpi implementation from the specified Provider
     * object is returned.  Note that the specified Provider object
     * does not have to be registered in the provider list.
     *
     * @param algorithm the standard name of the requested MAC algorithm.
     * See the Mac section in the <a href=
     *   "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#Mac">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard algorithm names.
     *
     * @param provider the provider.
     *
     * @return the new <code>Mac</code> object.
     *
     * @exception NoSuchAlgorithmException if a MacSpi
     *          implementation for the specified algorithm is not available
     *          from the specified Provider object.
     *
     * @exception IllegalArgumentException if the <code>provider</code>
     *          is null.
     *
     * @see java.security.Provider
     */
    public static final Mac getInstance(String algorithm, Provider provider)
            throws NoSuchAlgorithmException {
        // Android-added: Check for Bouncy Castle deprecation
        Providers.checkBouncyCastleDeprecation(provider, "Mac", algorithm);
        Instance instance = JceSecurity.getInstance
                ("Mac", MacSpi.class, algorithm, provider);
        return new Mac((MacSpi)instance.impl, instance.provider, algorithm);
    }

    // max number of debug warnings to print from chooseFirstProvider()
    private static int warnCount = 10;

    /**
     * Choose the Spi from the first provider available. Used if
     * delayed provider selection is not possible because init()
     * is not the first method called.
     */
    void chooseFirstProvider() {
        // Android-changed: Check if lock is null rather than removed serviceIterator field.
        // if ((spi != null) || (serviceIterator == null)) {
        if (spi != null || lock == null) {
            return;
        }
        synchronized (lock) {
            if (spi != null) {
                return;
            }
            // Android-removed: this debugging mechanism is not used in Android.
            /*
            if (debug != null) {
                int w = --warnCount;
                if (w >= 0) {
                    debug.println("Mac.init() not first method "
                        + "called, disabling delayed provider selection");
                    if (w == 0) {
                        debug.println("Further warnings of this type will "
                            + "be suppressed");
                    }
                    new Exception("Call trace").printStackTrace();
                }
            }
            */
            Exception lastException = null;
            // Android-changed: Provider selection; loop over a new list each time.
            for (Service s : GetInstance.getServices("Mac", algorithm)) {
                if (JceSecurity.canUseProvider(s.getProvider()) == false) {
                    continue;
                }
                try {
                    Object obj = s.newInstance(null);
                    if (obj instanceof MacSpi == false) {
                        continue;
                    }
                    spi = (MacSpi)obj;
                    provider = s.getProvider();
                    // Android-removed: Provider selection; loop over a new list each time.
                    /*
                    // not needed any more
                    firstService = null;
                    serviceIterator = null;
                    */
                    return;
                } catch (NoSuchAlgorithmException e) {
                    lastException = e;
                }
            }
            ProviderException e = new ProviderException
                    ("Could not construct MacSpi instance");
            if (lastException != null) {
                e.initCause(lastException);
            }
            throw e;
        }
    }

    private void chooseProvider(Key key, AlgorithmParameterSpec params)
            throws InvalidKeyException, InvalidAlgorithmParameterException {
        synchronized (lock) {
            // Android-changed: Use the currently-selected provider only if no key was provided.
            // if (spi != null) {
            if (spi != null && (key == null || lock == null)) {
                spi.engineInit(key, params);
                return;
            }
            Exception lastException = null;
            // Android-changed: Provider selection; loop over a new list each time.
            for (Service s : GetInstance.getServices("Mac", algorithm)) {
                // if provider says it does not support this key, ignore it
                if (s.supportsParameter(key) == false) {
                    continue;
                }
                if (JceSecurity.canUseProvider(s.getProvider()) == false) {
                    continue;
                }
                try {
                    MacSpi spi = (MacSpi)s.newInstance(null);
                    spi.engineInit(key, params);
                    provider = s.getProvider();
                    this.spi = spi;
                    // Android-removed: Provider selection; loop over a new list each time.
                    /*
                    firstService = null;
                    serviceIterator = null;
                    */
                    return;
                } catch (Exception e) {
                    // NoSuchAlgorithmException from newInstance()
                    // InvalidKeyException from init()
                    // RuntimeException (ProviderException) from init()
                    if (lastException == null) {
                        lastException = e;
                    }
                }
            }
            // no working provider found, fail
            if (lastException instanceof InvalidKeyException) {
                throw (InvalidKeyException)lastException;
            }
            if (lastException instanceof InvalidAlgorithmParameterException) {
                throw (InvalidAlgorithmParameterException)lastException;
            }
            if (lastException instanceof RuntimeException) {
                throw (RuntimeException)lastException;
            }
            String kName = (key != null) ? key.getClass().getName() : "(null)";
            throw new InvalidKeyException
                ("No installed provider supports this key: "
                + kName, lastException);
        }
    }

    /**
     * Returns the provider of this <code>Mac</code> object.
     *
     * @return the provider of this <code>Mac</code> object.
     */
    public final Provider getProvider() {
        chooseFirstProvider();
        return this.provider;
    }

    /**
     * Returns the length of the MAC in bytes.
     *
     * @return the MAC length in bytes.
     */
    public final int getMacLength() {
        chooseFirstProvider();
        return spi.engineGetMacLength();
    }

    /**
     * Initializes this <code>Mac</code> object with the given key.
     *
     * @param key the key.
     *
     * @exception InvalidKeyException if the given key is inappropriate for
     * initializing this MAC.
     */
    public final void init(Key key) throws InvalidKeyException {
        try {
            // Android-changed: Use the currently-selected provider only if no key was provided.
            // if (spi != null) {
            if (spi != null && (key == null || lock == null)) {
                spi.engineInit(key, null);
            } else {
                chooseProvider(key, null);
            }
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("init() failed", e);
        }
        initialized = true;

        // Android-removed: this debugging mechanism is not used in Android.
        /*
        if (!skipDebug && pdebug != null) {
            pdebug.println("Mac." + algorithm + " algorithm from: " +
                this.provider.getName());
        }
        */
    }

    /**
     * Initializes this <code>Mac</code> object with the given key and
     * algorithm parameters.
     *
     * @param key the key.
     * @param params the algorithm parameters.
     *
     * @exception InvalidKeyException if the given key is inappropriate for
     * initializing this MAC.
     * @exception InvalidAlgorithmParameterException if the given algorithm
     * parameters are inappropriate for this MAC.
     */
    public final void init(Key key, AlgorithmParameterSpec params)
            throws InvalidKeyException, InvalidAlgorithmParameterException {
        // Android-changed: Use the currently-selected provider only if no key was provided.
        // if (spi != null) {
        if (spi != null && (key == null || lock == null)) {
            spi.engineInit(key, params);
        } else {
            chooseProvider(key, params);
        }
        initialized = true;

        // Android-removed: this debugging mechanism is not used in Android.
        /*
        if (!skipDebug && pdebug != null) {
            pdebug.println("Mac." + algorithm + " algorithm from: " +
                this.provider.getName());
        }
        */
    }

    /**
     * Processes the given byte.
     *
     * @param input the input byte to be processed.
     *
     * @exception IllegalStateException if this <code>Mac</code> has not been
     * initialized.
     */
    public final void update(byte input) throws IllegalStateException {
        chooseFirstProvider();
        if (initialized == false) {
            throw new IllegalStateException("MAC not initialized");
        }
        spi.engineUpdate(input);
    }

    /**
     * Processes the given array of bytes.
     *
     * @param input the array of bytes to be processed.
     *
     * @exception IllegalStateException if this <code>Mac</code> has not been
     * initialized.
     */
    public final void update(byte[] input) throws IllegalStateException {
        chooseFirstProvider();
        if (initialized == false) {
            throw new IllegalStateException("MAC not initialized");
        }
        if (input != null) {
            spi.engineUpdate(input, 0, input.length);
        }
    }

    /**
     * Processes the first <code>len</code> bytes in <code>input</code>,
     * starting at <code>offset</code> inclusive.
     *
     * @param input the input buffer.
     * @param offset the offset in <code>input</code> where the input starts.
     * @param len the number of bytes to process.
     *
     * @exception IllegalStateException if this <code>Mac</code> has not been
     * initialized.
     */
    public final void update(byte[] input, int offset, int len)
            throws IllegalStateException {
        chooseFirstProvider();
        if (initialized == false) {
            throw new IllegalStateException("MAC not initialized");
        }

        if (input != null) {
            if ((offset < 0) || (len > (input.length - offset)) || (len < 0))
                throw new IllegalArgumentException("Bad arguments");
            spi.engineUpdate(input, offset, len);
        }
    }

    /**
     * Processes <code>input.remaining()</code> bytes in the ByteBuffer
     * <code>input</code>, starting at <code>input.position()</code>.
     * Upon return, the buffer's position will be equal to its limit;
     * its limit will not have changed.
     *
     * @param input the ByteBuffer
     *
     * @exception IllegalStateException if this <code>Mac</code> has not been
     * initialized.
     * @since 1.5
     */
    public final void update(ByteBuffer input) {
        chooseFirstProvider();
        if (initialized == false) {
            throw new IllegalStateException("MAC not initialized");
        }
        if (input == null) {
            throw new IllegalArgumentException("Buffer must not be null");
        }
        spi.engineUpdate(input);
    }

    /**
     * Finishes the MAC operation.
     *
     * <p>A call to this method resets this <code>Mac</code> object to the
     * state it was in when previously initialized via a call to
     * <code>init(Key)</code> or
     * <code>init(Key, AlgorithmParameterSpec)</code>.
     * That is, the object is reset and available to generate another MAC from
     * the same key, if desired, via new calls to <code>update</code> and
     * <code>doFinal</code>.
     * (In order to reuse this <code>Mac</code> object with a different key,
     * it must be reinitialized via a call to <code>init(Key)</code> or
     * <code>init(Key, AlgorithmParameterSpec)</code>.
     *
     * @return the MAC result.
     *
     * @exception IllegalStateException if this <code>Mac</code> has not been
     * initialized.
     */
    public final byte[] doFinal() throws IllegalStateException {
        chooseFirstProvider();
        if (initialized == false) {
            throw new IllegalStateException("MAC not initialized");
        }
        byte[] mac = spi.engineDoFinal();
        spi.engineReset();
        return mac;
    }

    /**
     * Finishes the MAC operation.
     *
     * <p>A call to this method resets this <code>Mac</code> object to the
     * state it was in when previously initialized via a call to
     * <code>init(Key)</code> or
     * <code>init(Key, AlgorithmParameterSpec)</code>.
     * That is, the object is reset and available to generate another MAC from
     * the same key, if desired, via new calls to <code>update</code> and
     * <code>doFinal</code>.
     * (In order to reuse this <code>Mac</code> object with a different key,
     * it must be reinitialized via a call to <code>init(Key)</code> or
     * <code>init(Key, AlgorithmParameterSpec)</code>.
     *
     * <p>The MAC result is stored in <code>output</code>, starting at
     * <code>outOffset</code> inclusive.
     *
     * @param output the buffer where the MAC result is stored
     * @param outOffset the offset in <code>output</code> where the MAC is
     * stored
     *
     * @exception ShortBufferException if the given output buffer is too small
     * to hold the result
     * @exception IllegalStateException if this <code>Mac</code> has not been
     * initialized.
     */
    public final void doFinal(byte[] output, int outOffset)
        throws ShortBufferException, IllegalStateException
    {
        chooseFirstProvider();
        if (initialized == false) {
            throw new IllegalStateException("MAC not initialized");
        }
        int macLen = getMacLength();
        if (output == null || output.length-outOffset < macLen) {
            throw new ShortBufferException
                ("Cannot store MAC in output buffer");
        }
        byte[] mac = doFinal();
        System.arraycopy(mac, 0, output, outOffset, macLen);
        return;
    }

    /**
     * Processes the given array of bytes and finishes the MAC operation.
     *
     * <p>A call to this method resets this <code>Mac</code> object to the
     * state it was in when previously initialized via a call to
     * <code>init(Key)</code> or
     * <code>init(Key, AlgorithmParameterSpec)</code>.
     * That is, the object is reset and available to generate another MAC from
     * the same key, if desired, via new calls to <code>update</code> and
     * <code>doFinal</code>.
     * (In order to reuse this <code>Mac</code> object with a different key,
     * it must be reinitialized via a call to <code>init(Key)</code> or
     * <code>init(Key, AlgorithmParameterSpec)</code>.
     *
     * @param input data in bytes
     * @return the MAC result.
     *
     * @exception IllegalStateException if this <code>Mac</code> has not been
     * initialized.
     */
    public final byte[] doFinal(byte[] input) throws IllegalStateException
    {
        chooseFirstProvider();
        if (initialized == false) {
            throw new IllegalStateException("MAC not initialized");
        }
        update(input);
        return doFinal();
    }

    /**
     * Resets this <code>Mac</code> object.
     *
     * <p>A call to this method resets this <code>Mac</code> object to the
     * state it was in when previously initialized via a call to
     * <code>init(Key)</code> or
     * <code>init(Key, AlgorithmParameterSpec)</code>.
     * That is, the object is reset and available to generate another MAC from
     * the same key, if desired, via new calls to <code>update</code> and
     * <code>doFinal</code>.
     * (In order to reuse this <code>Mac</code> object with a different key,
     * it must be reinitialized via a call to <code>init(Key)</code> or
     * <code>init(Key, AlgorithmParameterSpec)</code>.
     */
    public final void reset() {
        chooseFirstProvider();
        spi.engineReset();
    }

    /**
     * Returns a clone if the provider implementation is cloneable.
     *
     * @return a clone if the provider implementation is cloneable.
     *
     * @exception CloneNotSupportedException if this is called on a
     * delegate that does not support <code>Cloneable</code>.
     */
    public final Object clone() throws CloneNotSupportedException {
        chooseFirstProvider();
        Mac that = (Mac)super.clone();
        that.spi = (MacSpi)this.spi.clone();
        return that;
    }

    // BEGIN Android-added: Allow access to the current SPI for testing purposes.
    /**
     * Returns the {@code MacSpi} backing this {@code Mac} or {@code null} if no {@code MacSpi} is
     * backing this {@code Mac}.
     *
     * @hide
     */
    public MacSpi getCurrentSpi() {
        return spi;
    }
    // END Android-added: Allow access to the current SPI for testing purposes.
}
