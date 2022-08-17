/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 * Copyright (C) 2015 Square, Inc.
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

package com.android.okhttp.internalandroidapi;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;

import com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder;

import libcore.util.NonNull;
import libcore.util.Nullable;

import com.android.okhttp.Cache;
import com.android.okhttp.Request;
import com.android.okhttp.Response;
import com.android.okhttp.internal.huc.JavaApiConverter;

import java.io.IOException;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.URI;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * A modified copy of {@link com.android.okhttp.AndroidShimResponseCache} that exposes a
 * {@link CacheHolder} instead of a {@link Cache}. We want to keep the framework code that interacts
 * with OkHttp at arms length. By delegating to this class the Android HttpResponseCache class has
 * no knowledge of OkHttp internal classes at class resolution time and there are no internal
 * classes appearing on method signatures.
 * @hide
 * @hide This class is not part of the Android public SDK API
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class AndroidResponseCacheAdapter {

    private final CacheHolder cacheHolder;
    private final Cache okHttpCache;

    /**
     * Creates an instance from {@link CacheHolder}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public AndroidResponseCacheAdapter(@NonNull CacheHolder cacheHolder) {
        this.cacheHolder = cacheHolder;
        // Avoid one level of dereferencing by storing the reference to the OkHttp cache for later.
        this.okHttpCache = cacheHolder.getCache();
    }

    /**
     * Returns the {@link CacheHolder} associated with this instance and can be used by OkHttp
     * internal code to obtain the underlying OkHttp Cache object.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public @NonNull CacheHolder getCacheHolder() {
        return cacheHolder;
    }

    /**
     * Used to implement {@link java.net.ResponseCache#get(URI, String, Map)}. See that method for
     * details.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public @Nullable CacheResponse get(@NonNull URI uri, @NonNull String requestMethod,
            @Nullable Map<String, List<String>> requestHeaders) throws IOException {
        Request okRequest = JavaApiConverter.createOkRequest(uri, requestMethod, requestHeaders);
        Response okResponse = okHttpCache.internalCache.get(okRequest);
        if (okResponse == null) {
            return null;
        }
        return JavaApiConverter.createJavaCacheResponse(okResponse);
    }

    /**
     * Used to implement {@link java.net.ResponseCache#put(URI, URLConnection)}. See that method for
     * details.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public @Nullable CacheRequest put(@NonNull URI uri, @NonNull URLConnection urlConnection)
            throws IOException {
        Response okResponse = JavaApiConverter.createOkResponseForCachePut(uri, urlConnection);
        if (okResponse == null) {
            // The URLConnection is not cacheable or could not be converted. Stop.
            return null;
        }
        com.android.okhttp.internal.http.CacheRequest okCacheRequest =
                okHttpCache.internalCache.put(okResponse);
        if (okCacheRequest == null) {
            return null;
        }
        return JavaApiConverter.createJavaCacheRequest(okCacheRequest);
    }

    /**
     * Returns the number of bytes currently being used to store the values in
     * this cache. This may be greater than the {@link #getMaxSize()} if a background
     * deletion is pending. IOException is thrown if the size cannot be determined.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public long getSize() throws IOException {
        return okHttpCache.getSize();
    }

    /**
     * Returns the maximum number of bytes that this cache should use to store
     * its data.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public long getMaxSize() {
        return okHttpCache.getMaxSize();
    }

    /**
     * Force buffered operations to the filesystem. This ensures that responses
     * written to the cache will be available the next time the cache is opened,
     * even if this process is killed. IOException is thrown if the flush fails.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public void flush() throws IOException {
        okHttpCache.flush();
    }

    /**
     * Returns the number of HTTP requests that required the network to either
     * supply a response or validate a locally cached response.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public int getNetworkCount() {
        return okHttpCache.getNetworkCount();
    }

    /**
     * Returns the number of HTTP requests whose response was provided by the
     * cache. This may include conditional {@code GET} requests that were
     * validated over the network.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public int getHitCount() {
        return okHttpCache.getHitCount();
    }

    /**
     * Returns the total number of HTTP requests that were made. This includes
     * both client requests and requests that were made on the client's behalf
     * to handle a redirects and retries.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public int getRequestCount() {
        return okHttpCache.getRequestCount();
    }

    /**
     * Closes this cache. Stored values will remain on the filesystem.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public void close() throws IOException {
        okHttpCache.close();
    }

    /**
     * Closes the cache and deletes all of its stored values. This will delete
     * all files in the cache directory including files that weren't created by
     * the cache.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public void delete() throws IOException {
        okHttpCache.delete();
    }
}
