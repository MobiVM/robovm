/*
 * Copyright (C) 2015 The Android Open Source Project
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

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * A UNIX-domain (AF_UNIX / AF_LOCAL) socket address.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/unix.7.html">unix(7)</a>.
 *
 * @see OsConstants#AF_UNIX
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class UnixSocketAddress extends SocketAddress {

    private static final int NAMED_PATH_LENGTH = OsConstants.UNIX_PATH_MAX;
    private static final byte[] UNNAMED_PATH = new byte[0];

    // See unix(7): Three types of UnixSocketAddress:
    // 1) pathname: 0 < sun_path.length <= NAMED_PATH_LENGTH, sun_path[0] != 0.
    // 2) unnamed: sun_path = [].
    // 3) abstract: 0 < sun_path.length <= NAMED_PATH_LENGTH, sun_path[0] == 0.
    // Note that the array referenced by this field can be modified from JNI (libcore_io_Linux.cpp).
    private final byte[] sun_path;

    /** This constructor is also used from JNI. */
    private UnixSocketAddress(byte[] sun_path) {
        if (sun_path == null) {
            throw new IllegalArgumentException("sun_path must not be null");
        }
        if (sun_path.length > NAMED_PATH_LENGTH) {
            throw new IllegalArgumentException("sun_path exceeds the maximum length");
        }

        if (sun_path.length == 0) {
            this.sun_path = UNNAMED_PATH;
        } else {
            this.sun_path = new byte[sun_path.length];
            System.arraycopy(sun_path, 0, this.sun_path, 0, sun_path.length);
        }
    }

    /**
     * Creates a named, abstract AF_UNIX socket address.
     *
     * @throws NullPointerException if {@code name} is null
     * @throws IllegalArgumentException if {@code name} is invalid, e.g. too long
     *
     * @hide
     */
    public static UnixSocketAddress createAbstract(String name) {
        byte[] nameBytes = name.getBytes(StandardCharsets.UTF_8);
        // Abstract sockets have a path that starts with (byte) 0.
        byte[] path = new byte[nameBytes.length + 1];
        System.arraycopy(nameBytes, 0, path, 1, nameBytes.length);
        return new UnixSocketAddress(path);
    }

    /**
     * Creates a named, filesystem {@link OsConstants#AF_UNIX} socket address.
     *
     * See <a href="https://man7.org/linux/man-pages/man7/unix.7.html">unix(7)</a>.
     *
     * @param pathname filename for named unix socket
     * @throws NullPointerException if {@code name} is {@code null}
     * @throws IllegalArgumentException if {@code name} is invalid, e.g. too long
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static UnixSocketAddress createFileSystem(String pathName) {
        byte[] pathNameBytes = pathName.getBytes(StandardCharsets.UTF_8);
        // File system sockets have a path that ends with (byte) 0.
        byte[] path = new byte[pathNameBytes.length + 1];
        System.arraycopy(pathNameBytes, 0, path, 0, pathNameBytes.length);
        return new UnixSocketAddress(path);
    }

    /**
     * Creates an unnamed, filesystem AF_UNIX socket address.
     *
     * @hide
     */
    public static UnixSocketAddress createUnnamed() {
        return new UnixSocketAddress(UNNAMED_PATH);
    }

    /**
     * Used for testing.
     *
     * @hide
     */
    public byte[] getSunPath() {
        if (sun_path.length == 0) {
            return sun_path;
        }
        byte[] sunPathCopy = new byte[sun_path.length];
        System.arraycopy(sun_path, 0, sunPathCopy, 0, sun_path.length);
        return sunPathCopy;
    }

    /**
     * @hide
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UnixSocketAddress that = (UnixSocketAddress) o;
        return Arrays.equals(sun_path, that.sun_path);
    }

    /**
     * @hide
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(sun_path);
    }

    /**
     * @hide
     */
    @Override
    public String toString() {
        return "UnixSocketAddress[" +
                "sun_path=" + Arrays.toString(sun_path) +
                ']';
    }
}
