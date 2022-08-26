/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1999, 2012, Oracle and/or its affiliates. All rights reserved.
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

package javax.net.ssl;

import java.net.URL;
import java.net.HttpURLConnection;
import java.security.Principal;
import java.security.cert.X509Certificate;

/**
 * <code>HttpsURLConnection</code> extends <code>HttpURLConnection</code>
 * with support for https-specific features.
 * <P>
 * See <A HREF="http://www.w3.org/pub/WWW/Protocols/">
 * http://www.w3.org/pub/WWW/Protocols/</A> and
 * <A HREF="http://www.ietf.org/"> RFC 2818 </A>
 * for more details on the
 * https specification.
 * <P>
 * This class uses <code>HostnameVerifier</code> and
 * <code>SSLSocketFactory</code>.
 * There are default implementations defined for both classes.
 * However, the implementations can be replaced on a per-class (static) or
 * per-instance basis.  All new <code>HttpsURLConnection</code>s instances
 * will be assigned
 * the "default" static values at instance creation, but they can be overriden
 * by calling the appropriate per-instance set method(s) before
 * <code>connect</code>ing.
 *
 * @since 1.4
 */
abstract public
class HttpsURLConnection extends HttpURLConnection
{
    /**
     * Creates an <code>HttpsURLConnection</code> using the
     * URL specified.
     *
     * @param url the URL
     */
    protected HttpsURLConnection(URL url) {
        super(url);
    }

    /**
     * Returns the cipher suite in use on this connection.
     *
     * @return the cipher suite
     * @throws IllegalStateException if this method is called before
     *          the connection has been established.
     */
    public abstract String getCipherSuite();

    /**
     * Returns the certificate(s) that were sent to the server during
     * handshaking.
     * <P>
     * Note: This method is useful only when using certificate-based
     * cipher suites.
     * <P>
     * When multiple certificates are available for use in a
     * handshake, the implementation chooses what it considers the
     * "best" certificate chain available, and transmits that to
     * the other side.  This method allows the caller to know
     * which certificate chain was actually sent.
     *
     * @return an ordered array of certificates,
     *          with the client's own certificate first followed by any
     *          certificate authorities.  If no certificates were sent,
     *          then null is returned.
     * @throws IllegalStateException if this method is called before
     *          the connection has been established.
     * @see #getLocalPrincipal()
     */
    public abstract java.security.cert.Certificate [] getLocalCertificates();

    /**
     * Returns the server's certificate chain which was established
     * as part of defining the session.
     * <P>
     * Note: This method can be used only when using certificate-based
     * cipher suites; using it with non-certificate-based cipher suites,
     * such as Kerberos, will throw an SSLPeerUnverifiedException.
     *
     * @return an ordered array of server certificates,
     *          with the peer's own certificate first followed by
     *          any certificate authorities.
     * @throws SSLPeerUnverifiedException if the peer is not verified.
     * @throws IllegalStateException if this method is called before
     *          the connection has been established.
     * @see #getPeerPrincipal()
     */
    public abstract java.security.cert.Certificate [] getServerCertificates()
            throws SSLPeerUnverifiedException;

    /**
     * Returns the server's principal which was established as part of
     * defining the session.
     * <P>
     * Note: Subclasses should override this method. If not overridden, it
     * will default to returning the X500Principal of the server's end-entity
     * certificate for certificate-based ciphersuites, or throw an
     * SSLPeerUnverifiedException for non-certificate based ciphersuites,
     * such as Kerberos.
     *
     * @return the server's principal. Returns an X500Principal of the
     * end-entity certiticate for X509-based cipher suites, and
     * KerberosPrincipal for Kerberos cipher suites.
     *
     * @throws SSLPeerUnverifiedException if the peer was not verified
     * @throws IllegalStateException if this method is called before
     *          the connection has been established.
     *
     * @see #getServerCertificates()
     * @see #getLocalPrincipal()
     *
     * @since 1.5
     */
    public Principal getPeerPrincipal()
            throws SSLPeerUnverifiedException {

        java.security.cert.Certificate[] certs = getServerCertificates();
        return ((X509Certificate)certs[0]).getSubjectX500Principal();
    }

    /**
     * Returns the principal that was sent to the server during handshaking.
     * <P>
     * Note: Subclasses should override this method. If not overridden, it
     * will default to returning the X500Principal of the end-entity certificate
     * that was sent to the server for certificate-based ciphersuites or,
     * return null for non-certificate based ciphersuites, such as Kerberos.
     *
     * @return the principal sent to the server. Returns an X500Principal
     * of the end-entity certificate for X509-based cipher suites, and
     * KerberosPrincipal for Kerberos cipher suites. If no principal was
     * sent, then null is returned.
     *
     * @throws IllegalStateException if this method is called before
     *          the connection has been established.
     *
     * @see #getLocalCertificates()
     * @see #getPeerPrincipal()
     *
     * @since 1.5
     */
    public Principal getLocalPrincipal() {

        java.security.cert.Certificate[] certs = getLocalCertificates();
        if (certs != null) {
            return ((X509Certificate)certs[0]).getSubjectX500Principal();
        } else {
            return null;
        }
    }

    // BEGIN Android-changed: Use holder class idiom for a lazily-created OkHttp hostname verifier.
    // The RI default hostname verifier is a static member of the class, which means
    // it's created when the class is initialized.  As well, its default verifier
    // just fails all verification attempts, whereas we use OkHttp's verifier.
    /*
     * Holds the default instance so class preloading doesn't create an instance of
     * it.
     */
    private static class NoPreloadHolder {
        public static HostnameVerifier defaultHostnameVerifier;
        public static final Class<? extends HostnameVerifier> originalDefaultHostnameVerifierClass;
        static {
            try {
                /**
                  * <code>HostnameVerifier</code> provides a callback mechanism so that
                  * implementers of this interface can supply a policy for
                  * handling the case where the host to connect to and
                  * the server name from the certificate mismatch.
                  */
                defaultHostnameVerifier = (HostnameVerifier)
                        Class.forName("com.android.okhttp.internal.tls.OkHostnameVerifier")
                        .getField("INSTANCE").get(null);
                originalDefaultHostnameVerifierClass = defaultHostnameVerifier.getClass();
            } catch (Exception e) {
                throw new AssertionError("Failed to obtain okhttp HostnameVerifier", e);
            }
        }
    }

    /**
     * The <code>hostnameVerifier</code> for this object.
     */
    protected HostnameVerifier hostnameVerifier;
    // END Android-changed: Use holder class idiom for a lazily-created OkHttp hostname verifier.

    // Android-changed: Modified the documentation to explain side effects / discourage method use.
    /**
     * Sets the default <code>HostnameVerifier</code> inherited by a
     * new instance of this class.
     * <p>
     * Developers are <em>strongly</em> discouraged from changing the default
     * {@code HostnameVerifier} as {@link #getDefaultHostnameVerifier()} is used by several
     * classes for hostname verification on Android.
     * <table>
     *     <tr>
     *         <th>User</th>
     *         <th>Effect</th>
     *     </tr>
     *     <tr>
     *         <td>Android's default {@link TrustManager}, as used with Android's default
     *         {@link SSLContext}, {@link SSLSocketFactory} and {@link SSLSocket} implementations.
     *         </td>
     *         <td>The {@code HostnameVerifier} is used to verify the peer's
     *         certificate hostname after connecting if {@code
     *         SSLParameters.setEndpointIdentificationAlgorithm("HTTPS")} has been called.
     *         Instances use the <em>current</em> default {@code HostnameVerifier} at verification
     *         time.</td>
     *     </tr>
     *     <tr>
     *         <td>{@link android.net.SSLCertificateSocketFactory}</td>
     *         <td>The current default {@code HostnameVerifier} is used from various {@code
     *         createSocket} methods. See {@link android.net.SSLCertificateSocketFactory} for
     *         details; for example {@link
     *         android.net.SSLCertificateSocketFactory#createSocket(String, int)}.
     *         </td>
     *     </tr>
     *     <tr>
     *         <td>Android's default {@link HttpsURLConnection} implementation.</td>
     *         <td>The {@code HostnameVerifier} is used after a successful TLS handshake to verify
     *         the URI host against the TLS session server. Instances use the default {@code
     *         HostnameVerifier} set <em>when they were created</em> unless overridden with {@link
     *         #setHostnameVerifier(HostnameVerifier)}.
     *         Android's <code>HttpsURLConnection</code> relies on the {@code HostnameVerifier}
     *         for the <em>entire</em> hostname verification step.</td>
     *     </tr>
     * </table>
     * <p>
     * If this method is not called, the default <code>HostnameVerifier</code> will check the
     * hostname according to RFC 2818.
     *
     * @param v the default host name verifier
     * @throws IllegalArgumentException if the <code>HostnameVerifier</code>
     *          parameter is null.
     * @throws SecurityException if a security manager exists and its
     *         <code>checkPermission</code> method does not allow
     *         <code>SSLPermission("setHostnameVerifier")</code>
     * @see #getDefaultHostnameVerifier()
     */
    public static void setDefaultHostnameVerifier(HostnameVerifier v) {
        if (v == null) {
            throw new IllegalArgumentException(
                "no default HostnameVerifier specified");
        }

        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new SSLPermission("setHostnameVerifier"));
        }
        // Android-changed: Use holder class idiom for a lazily-created OkHttp hostname verifier.
        // defaultHostnameVerifier = v;
        NoPreloadHolder.defaultHostnameVerifier = v;
    }

    /**
     * Gets the default <code>HostnameVerifier</code> that is inherited
     * by new instances of this class.
     *
     * @return the default host name verifier
     * @see #setDefaultHostnameVerifier(HostnameVerifier)
     */
    public static HostnameVerifier getDefaultHostnameVerifier() {
        // Android-changed: Use holder class idiom for a lazily-created OkHttp hostname verifier.
        // return defaultHostnameVerifier;
        return NoPreloadHolder.defaultHostnameVerifier;
    }

    // Android-changed: Modified the documentation to explain Android behavior.
    /**
     * Sets the <code>HostnameVerifier</code> for this instance.
     * <P>
     * New instances of this class inherit the default static hostname
     * verifier set by {@link #setDefaultHostnameVerifier(HostnameVerifier)
     * setDefaultHostnameVerifier}.  Calls to this method replace
     * this object's <code>HostnameVerifier</code>.
     * <p>
     * Android's <code>HttpsURLConnection</code> relies on the {@code HostnameVerifier}
     * for the <em>entire</em> hostname verification step.
     *
     * @param v the host name verifier
     * @throws IllegalArgumentException if the <code>HostnameVerifier</code>
     *  parameter is null.
     * @see #getHostnameVerifier()
     * @see #setDefaultHostnameVerifier(HostnameVerifier)
     */
    public void setHostnameVerifier(HostnameVerifier v) {
        if (v == null) {
            throw new IllegalArgumentException(
                "no HostnameVerifier specified");
        }

        hostnameVerifier = v;
    }

    /**
     * Gets the <code>HostnameVerifier</code> in place on this instance.
     *
     * @return the host name verifier
     * @see #setHostnameVerifier(HostnameVerifier)
     * @see #setDefaultHostnameVerifier(HostnameVerifier)
     */
    public HostnameVerifier getHostnameVerifier() {
        // Android-added: Use the default verifier if none is set.
        // Note that this also has the side effect of *setting* (if unset)
        // hostnameVerifier to be the default one. It's not clear why this
        // was done (commit abd00f0eaa46f71f98e75a631c268c812d1ec7c1) but
        // we're keeping this behavior for lack of a strong reason to do
        // otherwise.
        if (hostnameVerifier == null) {
            hostnameVerifier = NoPreloadHolder.defaultHostnameVerifier;
        }
        return hostnameVerifier;
    }

    private static SSLSocketFactory defaultSSLSocketFactory = null;

    /**
     * The <code>SSLSocketFactory</code> inherited when an instance
     * of this class is created.
     */
    private SSLSocketFactory sslSocketFactory = getDefaultSSLSocketFactory();

    /**
     * Sets the default <code>SSLSocketFactory</code> inherited by new
     * instances of this class.
     * <P>
     * The socket factories are used when creating sockets for secure
     * https URL connections.
     *
     * @param sf the default SSL socket factory
     * @throws IllegalArgumentException if the SSLSocketFactory
     *          parameter is null.
     * @throws SecurityException if a security manager exists and its
     *         <code>checkSetFactory</code> method does not allow
     *         a socket factory to be specified.
     * @see #getDefaultSSLSocketFactory()
     */
    public static void setDefaultSSLSocketFactory(SSLSocketFactory sf) {
        if (sf == null) {
            throw new IllegalArgumentException(
                "no default SSLSocketFactory specified");
        }

        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkSetFactory();
        }
        defaultSSLSocketFactory = sf;
    }

    /**
     * Gets the default static <code>SSLSocketFactory</code> that is
     * inherited by new instances of this class.
     * <P>
     * The socket factories are used when creating sockets for secure
     * https URL connections.
     *
     * @return the default <code>SSLSocketFactory</code>
     * @see #setDefaultSSLSocketFactory(SSLSocketFactory)
     */
    public static SSLSocketFactory getDefaultSSLSocketFactory() {
        if (defaultSSLSocketFactory == null) {
            defaultSSLSocketFactory =
                (SSLSocketFactory)SSLSocketFactory.getDefault();
        }
        return defaultSSLSocketFactory;
    }

    /**
     * Sets the <code>SSLSocketFactory</code> to be used when this instance
     * creates sockets for secure https URL connections.
     * <P>
     * New instances of this class inherit the default static
     * <code>SSLSocketFactory</code> set by
     * {@link #setDefaultSSLSocketFactory(SSLSocketFactory)
     * setDefaultSSLSocketFactory}.  Calls to this method replace
     * this object's <code>SSLSocketFactory</code>.
     *
     * @param sf the SSL socket factory
     * @throws IllegalArgumentException if the <code>SSLSocketFactory</code>
     *          parameter is null.
     * @throws SecurityException if a security manager exists and its
     *         <code>checkSetFactory</code> method does not allow
     *         a socket factory to be specified.
     * @see #getSSLSocketFactory()
     */
    public void setSSLSocketFactory(SSLSocketFactory sf) {
        if (sf == null) {
            throw new IllegalArgumentException(
                "no SSLSocketFactory specified");
        }

        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkSetFactory();
        }
        sslSocketFactory = sf;
    }

    /**
     * Gets the SSL socket factory to be used when creating sockets
     * for secure https URL connections.
     *
     * @return the <code>SSLSocketFactory</code>
     * @see #setSSLSocketFactory(SSLSocketFactory)
     */
    public SSLSocketFactory getSSLSocketFactory() {
        return sslSocketFactory;
    }
}
