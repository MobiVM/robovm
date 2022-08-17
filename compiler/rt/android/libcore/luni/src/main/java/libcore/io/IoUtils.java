/*
 * Copyright (C) 2010 The Android Open Source Project
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

package libcore.io;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;
import android.system.ErrnoException;
import android.system.StructStat;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import libcore.util.NonNull;
import libcore.util.Nullable;

import static android.system.OsConstants.F_GETFL;
import static android.system.OsConstants.F_SETFL;
import static android.system.OsConstants.O_NONBLOCK;
import static android.system.OsConstants.O_RDONLY;

/** @hide */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class IoUtils {
    private IoUtils() {
    }

    /**
     * Acquires ownership of an integer file descriptor from a {@link FileDescriptor}.
     *
     * This method invalidates the {@link FileDescriptor} passed in.
     *
     * The important part of this function is that you are taking ownership of a resource that you
     * must either clean up yourself, or hand off to some other object that does that for you.
     *
     * See bionic/include/android/fdsan.h for more details.
     *
     * @param fd {@link FileDescriptor} to take ownership from, must be non-{@code null}.
     * @return raw file descriptor
     * @throws NullPointerException if fd is null
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int acquireRawFd(@NonNull FileDescriptor fd) {
        Objects.requireNonNull(fd);

        FileDescriptor copy = fd.release$();
        // Get the numeric Unix file descriptor. -1 means it is invalid; for example if
        // {@link FileDescriptor#release$()} has already been called on the FileDescriptor.
        int rawFd = copy.getInt$();
        long previousOwnerId = copy.getOwnerId$();
        if (rawFd != -1 && previousOwnerId != FileDescriptor.NO_OWNER) {
          // Clear the file descriptor's owner ID, aborting if the previous value isn't as expected.
          Libcore.os.android_fdsan_exchange_owner_tag(copy, previousOwnerId,
                                                      FileDescriptor.NO_OWNER);
        }
        return rawFd;
    }

    private static boolean isParcelFileDescriptor(Object object) {
        // We need to look up ParcelFileDescriptor dynamically, because there are cases where the
        // framework classes will not be found on the classpath such as on-host development.
        try {
            Class<?> pfdClass = Class.forName("android.os.ParcelFileDescriptor");
            if (pfdClass.isInstance(object)) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    private static long generateFdOwnerId(Object owner) {
        if (owner == null) {
            return 0;
        }

        // Type values from bionic's <android/fdsan.h>.
        long tagType;
        if (owner instanceof java.io.FileInputStream) {
            tagType = 5;
        } else if (owner instanceof java.io.FileOutputStream) {
            tagType = 6;
        } else if (owner instanceof java.io.RandomAccessFile) {
            tagType = 7;
        } else if (owner instanceof java.net.DatagramSocketImpl) {
            tagType = 10;
        } else if (owner instanceof java.net.SocketImpl) {
            tagType = 11;
        } else if (isParcelFileDescriptor(owner)) {
            tagType = 8;
        } else {
            // Generic Java type.
            tagType = 255;
        }

        // The owner ID is not required to be unique but should be stable and attempt to avoid
        // collision with identifiers generated both here and in native code (which are simply the
        // address of the owning object). identityHashCode(Object) meets these requirements.
        //
        // If identityHashCode returns a negative int, it'll be sign-extended, so we need to apply
        // a mask. fdsan uses bits 48-56 to distinguish between a generic native pointer and a
        // generic Java type, but since we're only inserting 32-bits of data, we might as well mask
        // off the entire upper 32 bits.
        long mask = (1L << 32) - 1;
        long tagValue = System.identityHashCode(owner) & mask;
        return tagType << 56 | tagValue;
    }

    /**
     * Assigns ownership of an unowned {@link FileDescriptor}.
     *
     * Associates the supplied {@link FileDescriptor} and the underlying Unix file descriptor with an owner
     * ID derived from the supplied {@code owner} object. If the {@link FileDescriptor} already has an
     * associated owner an {@link IllegalStateException} will be thrown. If the underlying Unix
     * file descriptor already has an associated owner, the process will abort.
     *
     * See bionic/include/android/fdsan.h for more details.
     *
     * @param fd    {@link FileDescriptor} to take ownership from, must be non-{@code null}.
     * @param owner owner object
     * @throws NullPointerException if {@code fd} or {@code owner} are {@code null}
     * @throws IllegalStateException if {@code fd} is already owned
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setFdOwner(@NonNull FileDescriptor fd, @NonNull Object owner) {
        Objects.requireNonNull(fd);
        Objects.requireNonNull(owner);

        long previousOwnerId = fd.getOwnerId$();
        if (previousOwnerId != FileDescriptor.NO_OWNER) {
            throw new IllegalStateException("Attempted to take ownership of already-owned " +
                                            "FileDescriptor");
        }

        long ownerId = generateFdOwnerId(owner);
        fd.setOwnerId$(ownerId);

        // Set the file descriptor's owner ID, aborting if the previous value isn't as expected.
        Libcore.os.android_fdsan_exchange_owner_tag(fd, previousOwnerId, ownerId);
    }

    /**
     * Closes a file descriptor, so that it no longer refers to any file and may
     * be reused. Also resets the internal int to -1.
     *
     * @param fd is {@link FileDescriptor} instance, invalid value is ignored.
     * @throws IOException if an I/O error occurred.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void close(@Nullable FileDescriptor fd) throws IOException {
        IoBridge.closeAndSignalBlockedThreads(fd);
    }

    /**
     * Closes {@link AutoClosable} instance, ignoring any checked exceptions.
     *
     * @param close is AutoClosable instance, null value is ignored.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void closeQuietly(@Nullable AutoCloseable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception ignored) {
            }
        }
    }

    /**
     * Calls {@link #close(FileDescriptor)}, ignoring any exceptions.
     *
     * @param fd is {@link FileDescriptor} instance, invalid value is ignored.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void closeQuietly(@Nullable FileDescriptor fd) {
        try {
            IoUtils.close(fd);
        } catch (IOException ignored) {
        }
    }

    /**
     * Closes socket, ignoring any exceptions.
     *
     * @param socket is {@link Socket} instance, {@code null} value is ignored.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void closeQuietly(@Nullable Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception ignored) {
            }
        }
    }

    /**
     * Sets file descriptor to be blocking or non-blocking.
     *
     * @param fd is {@link FileDescriptor} instance
     * @param blocking is a boolean that defines whether fd should be blocking or non-blocking
     * @throws IOException if system API call fails
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setBlocking(@NonNull FileDescriptor fd, boolean blocking) throws IOException {
        try {
            int flags = Libcore.os.fcntlVoid(fd, F_GETFL);
            if (!blocking) {
                flags |= O_NONBLOCK;
            } else {
                flags &= ~O_NONBLOCK;
            }
            Libcore.os.fcntlInt(fd, F_SETFL, flags);
        } catch (ErrnoException errnoException) {
            throw errnoException.rethrowAsIOException();
        }
    }

    /**
     * Returns the contents of {@code absolutePath} as a byte array.
     *
     * @param absolutePath path to a file to read
     * @return contents of the file at {@code absolutePath} as byte array
     * @throws IOException if there was I/O error
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @NonNull byte[] readFileAsByteArray(@NonNull String absolutePath) throws IOException {
        return new FileReader(absolutePath).readFully().toByteArray();
    }

    /**
     * Returns the contents of {@code absolutePath} as a {@link String}. The contents are assumed to be UTF-8.
     *
     * @param absolutePath path to a file to read
     * @return contents of the file at {@code absolutePath} as {@link String}
     * @throws IOException if there was I/O error
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @NonNull String readFileAsString(@NonNull String absolutePath) throws IOException {
        return new FileReader(absolutePath).readFully().toString(StandardCharsets.UTF_8);
    }

    /**
     * Do not use. Use createTemporaryDirectory instead.
     *
     * Used by frameworks/base unit tests to clean up a temporary directory.
     * Deliberately ignores errors, on the assumption that test cleanup is only
     * supposed to be best-effort.
     *
     * @deprecated Use {@link TestIoUtils#createTemporaryDirectory} instead.
     *
     * @hide
     */
    public static void deleteContents(@NonNull File dir) throws IOException {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteContents(file);
                }
                file.delete();
            }
        }
    }

    /**
     * Do not use. This is for System.loadLibrary use only.
     *
     * Checks whether {@code path} can be opened read-only. Similar to File.exists, but doesn't
     * require read permission on the parent, so it'll work in more cases, and allow you to
     * remove read permission from more directories. Everyone else should just open(2) and then
     * use the fd, but the loadLibrary API is broken by its need to ask ClassLoaders where to
     * find a .so rather than just calling dlopen(3).
     *
     * @hide
     */
    public static boolean canOpenReadOnly(String path) {
        try {
            // Use open(2) rather than stat(2) so we require fewer permissions. http://b/6485312.
            FileDescriptor fd = Libcore.os.open(path, O_RDONLY, 0);
            Libcore.os.close(fd);
            return true;
        } catch (ErrnoException errnoException) {
            return false;
        }
    }

    /**
     * @hide
     */
    public static void throwInterruptedIoException() throws InterruptedIOException {
        // This is typically thrown in response to an
        // InterruptedException which does not leave the thread in an
        // interrupted state, so explicitly interrupt here.
        Thread.currentThread().interrupt();
        // TODO: set InterruptedIOException.bytesTransferred
        throw new InterruptedIOException();
    }

    /**
     * A convenience class for reading the contents of a file into a {@code String}
     * or a {@code byte[]}. This class attempts to minimize the number of allocations
     * and copies required to read this data.
     *
     * For the case where we know the "true" length of a file (most ordinary files)
     * we allocate exactly one byte[] and copy data into that. Calls to
     * {@link #toByteArray} will then return the internal array and <b>not</b> a copy.
     *
     * <b>Note that an absolute path must be supplied. Expect your reads to fail
     * if one isn't.</b>
     */
    private static class FileReader {
        private FileDescriptor fd;
        private boolean unknownLength;

        private byte[] bytes;
        private int count;

        public FileReader(String absolutePath) throws IOException {
            // We use IoBridge.open because callers might differentiate
            // between a FileNotFoundException and a general IOException.
            //
            // NOTE: This costs us an additional call to fstat(2) to test whether
            // "absolutePath" is a directory or not. We can eliminate it
            // at the cost of copying some code from IoBridge.open.
            try {
                fd = IoBridge.open(absolutePath, O_RDONLY);
            } catch (FileNotFoundException fnfe) {
                throw fnfe;
            }

            int capacity;
            try {
                final StructStat stat = Libcore.os.fstat(fd);
                // Like RAF & other APIs, we assume that the file size fits
                // into a 32 bit integer.
                capacity = (int) stat.st_size;
                if (capacity == 0) {
                    unknownLength = true;
                    capacity = 8192;
                }
            } catch (ErrnoException exception) {
                closeQuietly(fd);
                throw exception.rethrowAsIOException();
            }

            bytes = new byte[capacity];
        }

        public FileReader readFully() throws IOException {
            int read;
            int capacity = bytes.length;
            try {
                while ((read = Libcore.os.read(fd, bytes, count, capacity - count)) != 0) {
                    count += read;
                    if (count == capacity) {
                        if (unknownLength) {
                            // If we don't know the length of this file, we need to continue
                            // reading until we reach EOF. Double the capacity in preparation.
                            final int newCapacity = capacity * 2;
                            byte[] newBytes = new byte[newCapacity];
                            System.arraycopy(bytes, 0, newBytes, 0, capacity);
                            bytes = newBytes;
                            capacity = newCapacity;
                        } else {
                            // We know the length of this file and we've read the right number
                            // of bytes from it, return.
                            break;
                        }
                    }
                }

                return this;
            } catch (ErrnoException e) {
                throw e.rethrowAsIOException();
            } finally {
                closeQuietly(fd);
            }
        }

        @FindBugsSuppressWarnings("EI_EXPOSE_REP")
        public byte[] toByteArray() {
            if (count == bytes.length) {
                return bytes;
            }
            byte[] result = new byte[count];
            System.arraycopy(bytes, 0, result, 0, count);
            return result;
        }

        public String toString(Charset cs) {
            return new String(bytes, 0, count, cs);
        }
    }
}
