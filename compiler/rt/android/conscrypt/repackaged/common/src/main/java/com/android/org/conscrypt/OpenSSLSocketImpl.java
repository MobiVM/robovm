/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.org.conscrypt;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.PrivateKey;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/**
 * Public shim allowing us to stay backward-compatible with legacy applications which were using
 * Conscrypt's extended socket API before the introduction of the {@link Conscrypt} class.
 * @hide This class is not part of the Android public SDK API
 */
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
@Internal
public abstract class OpenSSLSocketImpl extends AbstractConscryptSocket {
    OpenSSLSocketImpl() throws IOException {
    }

    OpenSSLSocketImpl(String hostname, int port) throws IOException {
        super(hostname, port);
    }

    OpenSSLSocketImpl(InetAddress address, int port) throws IOException {
        super(address, port);
    }

    OpenSSLSocketImpl(String hostname, int port, InetAddress clientAddress, int clientPort)
        throws IOException {
        super(hostname, port, clientAddress, clientPort);
    }

    OpenSSLSocketImpl(InetAddress address, int port, InetAddress clientAddress,
        int clientPort)
        throws IOException {
        super(address, port, clientAddress, clientPort);
    }

    OpenSSLSocketImpl(Socket socket, String hostname, int port, boolean autoClose)
        throws IOException {
        super(socket, hostname, port, autoClose);
    }

    @android.compat.annotation.UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    @Override
    public String getHostname() {
        return super.getHostname();
    }

    @android.compat.annotation
            .UnsupportedAppUsage(maxTargetSdk = dalvik.annotation.compat.VersionCodes.Q,
                    publicAlternatives = "Use {@code javax.net.ssl.SSLParameters#setServerNames}.")
            @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
            @Override
            public void
            setHostname(String hostname) {
        super.setHostname(hostname);
    }

    @android.compat.annotation.UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    @Override
    public String getHostnameOrIP() {
        return super.getHostnameOrIP();
    }

    @Override
    public FileDescriptor getFileDescriptor$() {
        return super.getFileDescriptor$();
    }

    @android.compat.annotation
            .UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
            @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
            @Override
            public void setSoWriteTimeout(int writeTimeoutMilliseconds) throws SocketException {
        super.setSoWriteTimeout(writeTimeoutMilliseconds);
    }

    @android.compat.annotation.UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    @Override
    public int getSoWriteTimeout() throws SocketException {
        return super.getSoWriteTimeout();
    }

    @android.compat.annotation
            .UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
            @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
            @Override
            public void setHandshakeTimeout(int handshakeTimeoutMilliseconds)
            throws SocketException {
        super.setHandshakeTimeout(handshakeTimeoutMilliseconds);
    }

    @Override
    public abstract SSLSession getHandshakeSession();

    @android.compat.annotation
            .UnsupportedAppUsage(maxTargetSdk = dalvik.annotation.compat.VersionCodes.Q,
                    publicAlternatives =
                            "Use {@link android.net.ssl.SSLSockets#setUseSessionTickets}.")
            @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
            @Override
            public abstract void
            setUseSessionTickets(boolean useSessionTickets);

    @android.compat.annotation.UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    @Override
    public abstract void setChannelIdEnabled(boolean enabled);

    @android.compat.annotation.UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    @Override
    public abstract byte[] getChannelId() throws SSLException;

    @android.compat.
    annotation.UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @Override
    public abstract void setChannelIdPrivateKey(PrivateKey privateKey);

    /**
     * @deprecated NPN is not supported
     */
    @android.compat.annotation
            .UnsupportedAppUsage
            @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
            @Override
            @Deprecated
            public final byte[] getNpnSelectedProtocol() {
        return super.getNpnSelectedProtocol();
    }

    /**
     * @deprecated NPN is not supported
     */
    @android.compat.annotation
            .UnsupportedAppUsage
            @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
            @Override
            @Deprecated
            public final void setNpnProtocols(byte[] npnProtocols) {
        super.setNpnProtocols(npnProtocols);
    }

    /**
     * @deprecated use {@link #setApplicationProtocols(String[])} instead.
     */
    @android.compat.annotation.
    UnsupportedAppUsage(maxTargetSdk = dalvik.annotation.compat.VersionCodes.Q,
            publicAlternatives =
                    "Use {@code javax.net.ssl.SSLParameters#setApplicationProtocols(java.lang.String[])}.")
    @Override
    @Deprecated
    public final void
    setAlpnProtocols(String[] alpnProtocols) {
        setApplicationProtocols(alpnProtocols == null ? EmptyArray.STRING : alpnProtocols);
    }

    /**
     * @deprecated use {@link #getApplicationProtocol()} instead.
     */
    @android.compat.annotation
            .UnsupportedAppUsage(maxTargetSdk = dalvik.annotation.compat.VersionCodes.Q,
                    publicAlternatives =
                            "Use {@code javax.net.ssl.SSLSocket#getApplicationProtocol()}.")
            @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
            @Override
            @Deprecated
            public final byte[] getAlpnSelectedProtocol() {
        return SSLUtils.toProtocolBytes(getApplicationProtocol());
    }

    /**
     * @deprecated Use {@link #setAlpnProtocols(String[])} instead.
     */
    @android.compat.annotation
            .UnsupportedAppUsage(maxTargetSdk = dalvik.annotation.compat.VersionCodes.Q,
                    publicAlternatives =
                            "Use {@code javax.net.ssl.SSLParameters#setApplicationProtocols(java.lang.String[])}.")
            @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
            @Override
            @Deprecated
            public final void
            setAlpnProtocols(byte[] protocols) {
        setApplicationProtocols(SSLUtils.decodeProtocols(protocols == null ? EmptyArray.BYTE : protocols));
    }
}
