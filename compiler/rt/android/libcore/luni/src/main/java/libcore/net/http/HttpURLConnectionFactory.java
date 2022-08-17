/*
 * Copyright (C) 2021 The Android Open Source Project
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

package libcore.net.http;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;

import libcore.api.CorePlatformApi;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

import javax.net.SocketFactory;
import libcore.util.NonNull;

/**
 * A HttpURLConnectionFactory that supports some configuration on a per-factory or per-connection
 * basis. The per-factory configuration is <b>optional</b>; if not set, global configuration or
 * default behavior is used.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@CorePlatformApi(status = CorePlatformApi.Status.STABLE)
public class HttpURLConnectionFactory {
    private final com.android.okhttp.internalandroidapi.HttpURLConnectionFactory mFactory;

    /**
     * Create a new {@link HttpURLConnectionFactory} instance.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @NonNull public static HttpURLConnectionFactory createInstance() {
        return new HttpURLConnectionFactory();
    }

    HttpURLConnectionFactory() {
        mFactory = new com.android.okhttp.internalandroidapi.HttpURLConnectionFactory();
    }

    /**
     * Sets a new ConnectionPool, specific to this HttpURLConnectionFactory and for all future
     * connections created by {@link #openConnection}, with the given configuration.
     *
     * @param maxIdleConnections The maximum number of idle connections to each to keep in the pool.
     * @param keepAliveDuration Time to keep the connection alive in the pool before closing it.
     * @param timeUnit The time unit of keep alive duration.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public void setNewConnectionPool(int maxIdleConnections, long keepAliveDuration,
            @NonNull TimeUnit timeUnit) {
        mFactory.setNewConnectionPool(maxIdleConnections, keepAliveDuration, timeUnit);
    }

    /**
     * Sets a new dns resolver.
     *
     * @param dns the dns resolver for looking up.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public void setDns(@NonNull Dns dns) {
        mFactory.setDns(dns);
    }

    /**
     * Opens a connection using the specified SocketFactory and the specified proxy
     * settings, overriding any system wide configuration.
     *
     * @param url The target URL that connection opens on.
     * @param socketFactory The socket factory used to create connections.
     * @param proxy The proxy settings used to create connections.
     *
     * @return An {@link java.net.URLConnection} using given SocketFactory, proxy settings and
     *         configuration.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public URLConnection openConnection(@NonNull URL url, @NonNull SocketFactory socketFactory,
            @NonNull Proxy proxy) throws IOException {
        return mFactory.openConnection(url, socketFactory, proxy);
    }
}
