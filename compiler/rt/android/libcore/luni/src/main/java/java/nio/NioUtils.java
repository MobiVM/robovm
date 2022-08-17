/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package java.nio;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;

import java.io.Closeable;
import java.io.FileDescriptor;
import java.nio.channels.FileChannel;

import sun.nio.ch.FileChannelImpl;

import static android.system.OsConstants.O_ACCMODE;
import static android.system.OsConstants.O_APPEND;
import static android.system.OsConstants.O_RDONLY;
import static android.system.OsConstants.O_WRONLY;

/**
 * @hide internal use only
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class NioUtils {
    private NioUtils() {
    }

    /**
     * Frees {@link DirectByteBuffer} running associated {@link sun.misc.Cleaner Cleaner}.
     *
     * @param buffer to free with associated {@code Cleaner}
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void freeDirectBuffer(ByteBuffer buffer) {
        if (buffer == null) {
            return;
        }

        DirectByteBuffer dbb = (DirectByteBuffer) buffer;
        // Run the cleaner early, if one is defined.
        if (dbb.cleaner != null) {
            dbb.cleaner.clean();
        }

        dbb.memoryRef.free();
    }

    /**
     * Returns the int file descriptor from within the given FileChannel 'fc'.
     *
     * @hide
     */
    public static FileDescriptor getFD(FileChannel fc) {
        return ((FileChannelImpl) fc).fd;
    }

    /**
     * Helps bridge between io and nio.
     *
     * @hide
     */
    public static FileChannel newFileChannel(Closeable ioObject, FileDescriptor fd, int mode) {
        boolean readable = (mode & O_ACCMODE) != O_WRONLY;
        boolean writable = (mode & O_ACCMODE) != O_RDONLY;
        boolean append = (mode & O_APPEND) != 0;
        return FileChannelImpl.open(fd, null, readable, writable, append, ioObject);
    }

    /**
     * Exposes the array backing a non-direct {@link java.nio.ByteBuffer ByteBuffer}, even if
     * the {@link java.nio.ByteBuffer ByteBuffer} is read-only.
     * Normally, attempting to access the array backing a read-only buffer throws.
     *
     * @param b  {@link java.nio.ByteBuffer ByteBuffer} to access its backing array.
     * @return   buffer's underlying array.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static byte[] unsafeArray(ByteBuffer b) {
        return b.array();
    }

    /**
     * Exposes the array offset for the array backing a non-direct {@link java.nio.ByteBuffer ByteBuffer},
     * even if the {@link java.nio.ByteBuffer ByteBuffer} is read-only.
     *
     * @param b  {@link java.nio.ByteBuffer ByteBuffer} to access its backing array offset.
     * @return   buffer's underlying array data offset.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int unsafeArrayOffset(ByteBuffer b) {
        return b.arrayOffset();
    }
}
