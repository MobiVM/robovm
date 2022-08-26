/*
 * Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.
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

package sun.security.util;

import java.io.File;
import java.io.FileInputStream;
import java.security.AccessController;
import java.security.KeyStore;
import java.security.PrivilegedAction;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashSet;

import sun.security.x509.X509CertImpl;

/**
 * The purpose of this class is to determine the trust anchor certificates is in
 * the cacerts file.  This is used for PKIX CertPath checking.
 */
public class AnchorCertificates {

    private static final Debug debug = Debug.getInstance("certpath");
    private static final String HASH = "SHA-256";
    private static HashSet<String> certs;

    static  {
        AccessController.doPrivileged(new PrivilegedAction<Void>() {
            @Override
            public Void run() {
                File f = new File(System.getProperty("java.home"),
                        "lib/security/cacerts");
                KeyStore cacerts;
                try {
                    cacerts = KeyStore.getInstance("JKS");
                    try (FileInputStream fis = new FileInputStream(f)) {
                        cacerts.load(fis, null);
                        certs = new HashSet<>();
                        Enumeration<String> list = cacerts.aliases();
                        String alias;
                        while (list.hasMoreElements()) {
                            alias = list.nextElement();
                            // Check if this cert is labeled a trust anchor.
                            if (alias.contains(" [jdk")) {
                                X509Certificate cert = (X509Certificate) cacerts
                                        .getCertificate(alias);
                                certs.add(X509CertImpl.getFingerprint(HASH, cert));
                            }
                        }
                    }
                } catch (Exception e) {
                    if (debug != null) {
                        debug.println("Error parsing cacerts");
                    }
                    e.printStackTrace();
                }
                return null;
            }
        });
    }

    /**
     * Checks if a certificate is a trust anchor.
     *
     * @param cert the certificate to check
     * @return true if the certificate is trusted.
     */
    public static boolean contains(X509Certificate cert) {
        String key = X509CertImpl.getFingerprint(HASH, cert);
        boolean result = certs.contains(key);
        if (result && debug != null) {
            debug.println("AnchorCertificate.contains: matched " +
                    cert.getSubjectDN());
        }
        return result;
    }

    private AnchorCertificates() {}
}
