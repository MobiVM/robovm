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

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.util.concurrent.atomic.AtomicReference;
import libcore.util.ArrayUtils;
import libcore.util.NonNull;
import libcore.util.Nullable;

/**
 * Convenience class for reading and writing streams of bytes.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class Streams {
    private static AtomicReference<byte[]> skipBuffer = new AtomicReference<byte[]>();

    private Streams() {}

    /**
     * Implements {@link InputStream#read(int)} in terms of {@link InputStream#read(byte[], int, int)}.
     * {@link InputStream} assumes that you implement {@link InputStream#read(int)} and provides default
     * implementations of the others, but often the opposite is more efficient.
     *
     * @param in {@link InputStream} to read byte from
     * @return singlge byte read from {@code in}
     * @throws IOException in case of I/O error
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int readSingleByte(@NonNull InputStream in) throws IOException {
        byte[] buffer = new byte[1];
        int result = in.read(buffer, 0, 1);
        return (result != -1) ? buffer[0] & 0xff : -1;
    }

    /**
     * Implements {@link OutputStream#write(int)} in terms of {@link OutputStream#write(byte[], int, int)}.
     * {@link OutputStream} assumes that you implement {@link OutputStream#write(int)} and provides default
     * implementations of the others, but often the opposite is more efficient.
     *
     * @param out {@link OutputStream} to write byte to
     * @param b byte to write to stream {@code out}
     * @throws IOException in case of I/O error
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void writeSingleByte(@NonNull OutputStream out, int b) throws IOException {
        byte[] buffer = new byte[1];
        buffer[0] = (byte) (b & 0xff);
        out.write(buffer);
    }

    /**
     * Fills byte buffer {@code dst} with bytes from {@link InputStream} {@code in}, throwing
     * {@link EOFException} if insufficient bytes are available.
     *
     * @param in {@link InputStream} to read data from
     * @param dst byte buffer to write data to
     * @throws IOException in case of I/O error
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void readFully(@NonNull InputStream in, @NonNull byte[] dst) throws IOException {
        readFully(in, dst, 0, dst.length);
    }

    /**
     * Reads exactly 'byteCount' bytes from 'in' (into 'dst' at offset 'offset'), and throws
     * EOFException if insufficient bytes are available.
     *
     * Used to implement {@link java.io.DataInputStream#readFully(byte[], int, int)}.
     *
     * @hide
     */
    public static void readFully(InputStream in, byte[] dst, int offset, int byteCount) throws IOException {
        if (byteCount == 0) {
            return;
        }
        if (in == null) {
            throw new NullPointerException("in == null");
        }
        if (dst == null) {
            throw new NullPointerException("dst == null");
        }
        ArrayUtils.throwsIfOutOfBounds(dst.length, offset, byteCount);
        while (byteCount > 0) {
            int bytesRead = in.read(dst, offset, byteCount);
            if (bytesRead < 0) {
                throw new EOFException();
            }
            offset += bytesRead;
            byteCount -= bytesRead;
        }
    }

    /**
     * Returns a {@code byte[]} containing the remainder of {@code in} stream and
     * closes it. Also see {@link #readFullyNoClose(InputStream)}.
     *
     * @param in {@link InputStream} to read data from
     * @return remaining bytes in {@code in} stream.
     * @throws IOException thrown by {@link InputStream#read(byte[])}.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @NonNull byte[] readFully(@NonNull InputStream in) throws IOException {
        try {
            return readFullyNoClose(in);
        } finally {
            in.close();
        }
    }

    /**
     * Returns a {@code byte[]} containing the remainder of {@code in} stream, without
     * closing it.
     *
     * @param in {@link InputStream} to read data from
     * @return remaining bytes in {@code in} stream.
     * @throws IOException thrown by {@link InputStream#read(byte[])}.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @NonNull byte[] readFullyNoClose(@NonNull InputStream in) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int count;
        while ((count = in.read(buffer)) != -1) {
            bytes.write(buffer, 0, count);
        }
        return bytes.toByteArray();
    }

    /**
     * Reads the remainder of {@code reader} as a string, closing it when done.
     *
     * @param reader {@link Reader} instance.
     * @return remainder of {@code reader} as {@link String}.
     * @throws IOException thrown by {@link Reader#read(java.nio.CharBuffer)}.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @NonNull String readFully(@NonNull Reader reader) throws IOException {
        try {
            StringWriter writer = new StringWriter();
            char[] buffer = new char[1024];
            int count;
            while ((count = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, count);
            }
            return writer.toString();
        } finally {
            reader.close();
        }
    }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public static void skipAll(InputStream in) throws IOException {
        do {
            in.skip(Long.MAX_VALUE);
        } while (in.read() != -1);
    }

    /**
     * Skip <b>at most</b> {@code byteCount} bytes from {@code in} by calling read
     * repeatedly until either the stream is exhausted or we read fewer bytes than
     * we ask for.
     *
     * <p>This method reuses the skip buffer but is careful to never use it at
     * the same time that another stream is using it. Otherwise streams that use
     * the caller's buffer for consistency checks like CRC could be clobbered by
     * other threads. A thread-local buffer is also insufficient because some
     * streams may call other streams in their skip() method, also clobbering the
     * buffer.
     *
     * @param in {@link InputStream} to skip data from
     * @param byteCount number of bytes to skip from {@code in}
     * @return number of bytes skipped from {@code in}
     * @throws IOException in case of I/O error
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static long skipByReading(@NonNull InputStream in, long byteCount) throws IOException {
        // acquire the shared skip buffer.
        byte[] buffer = skipBuffer.getAndSet(null);
        if (buffer == null) {
            buffer = new byte[4096];
        }

        long skipped = 0;
        while (skipped < byteCount) {
            int toRead = (int) Math.min(byteCount - skipped, buffer.length);
            int read = in.read(buffer, 0, toRead);
            if (read == -1) {
                break;
            }
            skipped += read;
            if (read < toRead) {
                break;
            }
        }

        // release the shared skip buffer.
        skipBuffer.set(buffer);

        return skipped;
    }

    /**
     * Copies all of the bytes from {@code in} to {@code out}. Neither stream is
     * closed.
     *
     * @param in {@link InputStream} to copy data from
     * @param out {@link InputStream} to write copied data to
     * @return the total number of bytes transferred.
     * @throws IOException reading from {@link InputStream} or writing to {@link OutputStream}.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int copy(@NonNull InputStream in, @NonNull OutputStream out) throws IOException {
        int total = 0;
        byte[] buffer = new byte[8192];
        int c;
        while ((c = in.read(buffer)) != -1) {
            total += c;
            out.write(buffer, 0, c);
        }
        return total;
    }

    /**
     * Returns the ASCII characters up to but not including the next "\r\n", or
     * "\n".
     *
     * @throws java.io.EOFException if the stream is exhausted before the next newline
     *     character.
     *
     * @hide
     */
    @UnsupportedAppUsage
    public static String readAsciiLine(InputStream in) throws IOException {
        // TODO: support UTF-8 here instead

        StringBuilder result = new StringBuilder(80);
        while (true) {
            int c = in.read();
            if (c == -1) {
                throw new EOFException();
            } else if (c == '\n') {
                break;
            }

            result.append((char) c);
        }
        int length = result.length();
        if (length > 0 && result.charAt(length - 1) == '\r') {
            result.setLength(length - 1);
        }
        return result.toString();
    }
}
