/*
 * Copyright (C) 2011 The Android Open Source Project
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

package android.system;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;

import libcore.util.Objects;

/**
 * Corresponds to C's {@code struct linger} from
 * <a href="http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/sys_socket.h.html">&lt;sys/socket.h&gt;</a>
 *
 * When enabled, a {@link Os.close(java.io.FileDescriptor) or
 * {@link Os.shutdown(java.io.FileDescriptor, int)} will
 * not return until all queued messages for the socket have been successfully sent or the
 * linger timeout has been reached. Otherwise, the call returns immediately and the closing is
 * done in the background.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/socket.7.html">socket(7)</a>
 * for linger struct description.
 *
 * @see Os#getsockoptLinger(java.io.FileDescriptor, int, int).
 * @see OsConstants#SO_LINGER
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class StructLinger {
    /**
     * Whether or not linger is enabled. Non-zero is on.
     *
     * @hide
     */
    public final int l_onoff;

    /**
     * Linger time in seconds.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public final int l_linger;

    /**
     * Constructs linger structure.
     *
     * @param l_onoff  whether or not linger is enabled, non-zero is on
     * @param l_linger linger time, in seconds
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public StructLinger(int l_onoff, int l_linger) {
        this.l_onoff = l_onoff;
        this.l_linger = l_linger;
    }

    /**
     * Returns whether linger is on or not.
     *
     * @return {@code true} if linger is enabled, and {@code false} otherwise
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public boolean isOn() {
        return l_onoff != 0;
    }

    /**
     * @hide
     */
    @Override
    public String toString() {
        return Objects.toString(this);
    }
}
