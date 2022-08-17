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

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import libcore.util.NonNull;
import libcore.util.Nullable;

/**
 * A domain name service that resolves IP addresses for host names.
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@CorePlatformApi(status = CorePlatformApi.Status.STABLE)
public interface Dns extends com.android.okhttp.internalandroidapi.Dns {
    /**
     * Returns the IP addresses of {@code hostname}, in the order they should
     * be attempted. Returns loopback addresses for {@code null} host.
     *
     * @param hostname The host name will be looked up.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @NonNull List<@NonNull InetAddress> lookup(@Nullable String hostname) throws UnknownHostException;
}