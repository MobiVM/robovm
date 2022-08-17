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

package dalvik.system;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;
import java.io.FileDescriptor;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * Callbacks for socket assignment and reassignment.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public abstract class SocketTagger {

    private static SocketTagger tagger = new SocketTagger() {
        @Override public void tag(FileDescriptor socketDescriptor) throws SocketException {}
        @Override public void untag(FileDescriptor socketDescriptor) throws SocketException {}
    };

    /**
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public SocketTagger() {
    }

    /**
     * Notified when {@code socketDescriptor} is assigned to the current
     * thread. The socket is either newly connected or reused from a connection
     * pool. Implementations of this method should be thread-safe.
     *
     * @param socketDescriptor to be assigned to the current thread
     * @throws SocketException when {@link SocketException} occurs
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public abstract void tag(FileDescriptor socketDescriptor) throws SocketException;

    /**
     * Notified when {@code socketDescriptor} is released from the current
     * thread to a connection pool. Implementations of this method should be
     * thread-safe.
     *
     * <p><strong>Note:</strong> this method will not be invoked when the socket
     * is closed.
     *
     * @param socketDescriptor to be released from the current thread to a connection pool
     * @throws SocketException when {@link SocketException} occurs
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public abstract void untag(FileDescriptor socketDescriptor) throws SocketException;

    /**
     * Notified when {@code socket} is assigned to the current
     * thread. The socket is either newly connected or reused from a connection
     * pool. Implementations of this method should be thread-safe.
     *
     * @param socket to be assigned to the current thread
     * @throws SocketException when {@link SocketException} occurs
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public final void tag(Socket socket) throws SocketException {
        if (!socket.isClosed()) {
            tag(socket.getFileDescriptor$());
        }
    }

    /**
     * Notified when {@code socket} is released from the current
     * thread to a connection pool. Implementations of this method should be
     * thread-safe.
     *
     * <p><strong>Note:</strong> this method will not be invoked when the socket
     * is closed.
     *
     * @param socket           to be released from the current thread
     *                         to a connection pool
     * @throws SocketException when {@link SocketException} occurs
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public final void untag(Socket socket) throws SocketException {
        if (!socket.isClosed()) {
            untag(socket.getFileDescriptor$());
        }
    }

    /**
     * Notified when {@code socket} is assigned to the current thread.
     * The socket is either newly connected or reused from a connection
     * pool. Implementations of this method should be thread-safe.
     *
     * @param socket           to be assigned to the current thread
     * @throws SocketException when {@link SocketException} occurs
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public final void tag(DatagramSocket socket) throws SocketException {
        if (!socket.isClosed()) {
            tag(socket.getFileDescriptor$());
        }
    }

    /**
     * Notified when {@code socket} is released from the current
     * thread to a connection pool. Implementations of this method should be
     * thread-safe.
     *
     * <p><strong>Note:</strong> this method will not be invoked when the socket
     * is closed.
     *
     * @param socket           to be released from the current thread
     *                         to a connection pool
     * @throws SocketException when {@link SocketException} occurs
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public final void untag(DatagramSocket socket) throws SocketException {
        if (!socket.isClosed()) {
            untag(socket.getFileDescriptor$());
        }
    }

    /**
     * Sets this process' socket tagger to {@code tagger}.
     *
     * @param tagger socket tagger to be assigned to this process
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static synchronized void set(SocketTagger tagger) {
        if (tagger == null) {
            throw new NullPointerException("tagger == null");
        }
        SocketTagger.tagger = tagger;
    }

    /**
     * Returns this process socket tagger.
     *
     * @return {@link SocketTagger} assigned to this process
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static synchronized SocketTagger get() {
        return tagger;
    }
}
