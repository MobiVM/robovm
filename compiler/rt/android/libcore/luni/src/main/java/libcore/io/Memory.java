/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package libcore.io;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.compat.annotation.UnsupportedAppUsage;
import android.annotation.SystemApi;

import java.nio.ByteOrder;

import dalvik.annotation.optimization.FastNative;

import libcore.api.CorePlatformApi;
import libcore.util.NonNull;

/**
 * Unsafe access to memory.
 *
 * @hide
 */
@CorePlatformApi(status = CorePlatformApi.Status.STABLE)
@SystemApi(client = MODULE_LIBRARIES)
public final class Memory {
    private Memory() { }

    /**
     * Used to optimize nio heap buffer bulk get operations. 'dst' must be a primitive array.
     * 'dstOffset' is measured in units of 'sizeofElements' bytes.
     *
     * @hide
     */
    public static native void unsafeBulkGet(Object dst, int dstOffset, int byteCount,
            byte[] src, int srcOffset, int sizeofElements, boolean swap);

    /**
     * Used to optimize nio heap buffer bulk put operations. 'src' must be a primitive array.
     * 'srcOffset' is measured in units of 'sizeofElements' bytes.
     * @hide
     */
    public static native void unsafeBulkPut(byte[] dst, int dstOffset, int byteCount,
            Object src, int srcOffset, int sizeofElements, boolean swap);

    /**
     * Gets int value from a byte buffer {@code src} at offset {@code offset} using
     * {@code order} byte order.
     *
     * @param src    source byte buffer
     * @param offset offset in {@code src} to get bytes from
     * @param order  byte order
     * @return int value
     *
     * @hide
     */
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static int peekInt(@NonNull byte[] src, int offset, @NonNull ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            return (((src[offset++] & 0xff) << 24) |
                    ((src[offset++] & 0xff) << 16) |
                    ((src[offset++] & 0xff) <<  8) |
                    ((src[offset  ] & 0xff) <<  0));
        } else {
            return (((src[offset++] & 0xff) <<  0) |
                    ((src[offset++] & 0xff) <<  8) |
                    ((src[offset++] & 0xff) << 16) |
                    ((src[offset  ] & 0xff) << 24));
        }
    }

    /**
     * @hide
     */
    public static long peekLong(byte[] src, int offset, ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            int h = ((src[offset++] & 0xff) << 24) |
                    ((src[offset++] & 0xff) << 16) |
                    ((src[offset++] & 0xff) <<  8) |
                    ((src[offset++] & 0xff) <<  0);
            int l = ((src[offset++] & 0xff) << 24) |
                    ((src[offset++] & 0xff) << 16) |
                    ((src[offset++] & 0xff) <<  8) |
                    ((src[offset  ] & 0xff) <<  0);
            return (((long) h) << 32L) | ((long) l) & 0xffffffffL;
        } else {
            int l = ((src[offset++] & 0xff) <<  0) |
                    ((src[offset++] & 0xff) <<  8) |
                    ((src[offset++] & 0xff) << 16) |
                    ((src[offset++] & 0xff) << 24);
            int h = ((src[offset++] & 0xff) <<  0) |
                    ((src[offset++] & 0xff) <<  8) |
                    ((src[offset++] & 0xff) << 16) |
                    ((src[offset  ] & 0xff) << 24);
            return (((long) h) << 32L) | ((long) l) & 0xffffffffL;
        }
    }

    /**
     * Gets short value from a byte buffer {@code src} at offset {@code offset} using
     * {@code order} byte order.
     *
     * @param src    source byte buffer
     * @param offset offset in {@code src} to get bytes from
     * @param order  byte order
     * @return short value
     *
     * @hide
     */
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static short peekShort(@NonNull byte[] src, int offset, @NonNull ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            return (short) ((src[offset] << 8) | (src[offset + 1] & 0xff));
        } else {
            return (short) ((src[offset + 1] << 8) | (src[offset] & 0xff));
        }
    }

    /**
     * Writes given int value {@code value} to a byte buffer {@code dst} using
     * {@code order} byte order.
     *
     * @param dst    byte buffer where to write {@code value}
     * @param offset offset in {@code dst} to put value to
     * @param value  int value to write
     * @param order  byte order
     *
     * @hide
     */
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static void pokeInt(@NonNull byte[] dst, int offset, int value, @NonNull ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            dst[offset++] = (byte) ((value >> 24) & 0xff);
            dst[offset++] = (byte) ((value >> 16) & 0xff);
            dst[offset++] = (byte) ((value >>  8) & 0xff);
            dst[offset  ] = (byte) ((value >>  0) & 0xff);
        } else {
            dst[offset++] = (byte) ((value >>  0) & 0xff);
            dst[offset++] = (byte) ((value >>  8) & 0xff);
            dst[offset++] = (byte) ((value >> 16) & 0xff);
            dst[offset  ] = (byte) ((value >> 24) & 0xff);
        }
    }

    /**
     * Writes given long value {@code value} to a byte buffer {@code dst} using
     * {@code order} byte order.
     *
     * @param dst    byte buffer where to write {@code value}
     * @param offset offset in {@code dst} to put value to
     * @param value  long value to write
     * @param order  byte order
     *
     * @hide
     */
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static void pokeLong(@NonNull byte[] dst, int offset, long value, @NonNull ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            int i = (int) (value >> 32);
            dst[offset++] = (byte) ((i >> 24) & 0xff);
            dst[offset++] = (byte) ((i >> 16) & 0xff);
            dst[offset++] = (byte) ((i >>  8) & 0xff);
            dst[offset++] = (byte) ((i >>  0) & 0xff);
            i = (int) value;
            dst[offset++] = (byte) ((i >> 24) & 0xff);
            dst[offset++] = (byte) ((i >> 16) & 0xff);
            dst[offset++] = (byte) ((i >>  8) & 0xff);
            dst[offset  ] = (byte) ((i >>  0) & 0xff);
        } else {
            int i = (int) value;
            dst[offset++] = (byte) ((i >>  0) & 0xff);
            dst[offset++] = (byte) ((i >>  8) & 0xff);
            dst[offset++] = (byte) ((i >> 16) & 0xff);
            dst[offset++] = (byte) ((i >> 24) & 0xff);
            i = (int) (value >> 32);
            dst[offset++] = (byte) ((i >>  0) & 0xff);
            dst[offset++] = (byte) ((i >>  8) & 0xff);
            dst[offset++] = (byte) ((i >> 16) & 0xff);
            dst[offset  ] = (byte) ((i >> 24) & 0xff);
        }
    }

    /**
     * Writes given short value {@code value} to a byte buffer {@code dst} using
     * {@code order} byte order.
     *
     * @param dst    byte buffer where to write {@code value}
     * @param offset offset in {@code dst} to put value to
     * @param value  short value to write
     * @param order  byte order
     *
     * @hide
     */
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static void pokeShort(@NonNull byte[] dst, int offset, short value, @NonNull ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            dst[offset++] = (byte) ((value >> 8) & 0xff);
            dst[offset  ] = (byte) ((value >> 0) & 0xff);
        } else {
            dst[offset++] = (byte) ((value >> 0) & 0xff);
            dst[offset  ] = (byte) ((value >> 8) & 0xff);
        }
    }

    /**
     * Copies {@code byteCount} bytes from the source {@code srcObject} to the
     * destination {@code dstObject}. The objects are either instances of
     * {@code DirectByteBuffer} or {@code byte[]}. The offsets in the {@code byte[]}
     * case must include the {@link Buffer#arrayOffset()} if the array came from a
     * {@link Buffer#array()} call.
     *
     * <p>We could make this private and provide the four type-safe variants, but then
     * {@link ByteBuffer#put(ByteBuffer)} would need to work out which to call based on
     * whether the source and destination buffers are direct or not.
     *
     * @param dstObject destination buffer
     * @param dstOffset offset in the destination buffer
     * @param srcObject source buffer
     * @param srcOffset offset in the source buffer
     * @param byteCount number of bytes to copy
     *
     * @hide make type-safe before making public?
     */
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static native void memmove(@NonNull Object dstObject, int dstOffset, @NonNull Object srcObject, int srcOffset, long byteCount);

    /**
     * @hide
     */
    @UnsupportedAppUsage
    @FastNative
    public static native byte peekByte(long address);

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public static int peekInt(long address, boolean swap) {
        int result = peekIntNative(address);
        if (swap) {
            result = Integer.reverseBytes(result);
        }
        return result;
    }
    @FastNative
    private static native int peekIntNative(long address);

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public static long peekLong(long address, boolean swap) {
        long result = peekLongNative(address);
        if (swap) {
            result = Long.reverseBytes(result);
        }
        return result;
    }
    @FastNative
    private static native long peekLongNative(long address);

    /**
     * @hide
     */
    public static short peekShort(long address, boolean swap) {
        short result = peekShortNative(address);
        if (swap) {
            result = Short.reverseBytes(result);
        }
        return result;
    }
    @FastNative
    private static native short peekShortNative(long address);

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public static native void peekByteArray(long address, byte[] dst, int dstOffset, int byteCount);

    /**
     * @hide
     */
    public static native void peekCharArray(long address, char[] dst, int dstOffset, int charCount, boolean swap);

    /**
     * @hide
     */
    public static native void peekDoubleArray(long address, double[] dst, int dstOffset, int doubleCount, boolean swap);

    /**
     * @hide
     */
    public static native void peekFloatArray(long address, float[] dst, int dstOffset, int floatCount, boolean swap);

    /**
     * @hide
     */
    public static native void peekIntArray(long address, int[] dst, int dstOffset, int intCount, boolean swap);

    /**
     * @hide
     */
    public static native void peekLongArray(long address, long[] dst, int dstOffset, int longCount, boolean swap);

    /**
     * @hide
     */
    public static native void peekShortArray(long address, short[] dst, int dstOffset, int shortCount, boolean swap);

    /**
     * @hide
     */
    @UnsupportedAppUsage
    @FastNative
    public static native void pokeByte(long address, byte value);

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public static void pokeInt(long address, int value, boolean swap) {
        if (swap) {
            value = Integer.reverseBytes(value);
        }
        pokeIntNative(address, value);
    }
    @FastNative
    private static native void pokeIntNative(long address, int value);

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public static void pokeLong(long address, long value, boolean swap) {
        if (swap) {
            value = Long.reverseBytes(value);
        }
        pokeLongNative(address, value);
    }
    @FastNative
    private static native void pokeLongNative(long address, long value);

    /**
     * @hide
     */
    public static void pokeShort(long address, short value, boolean swap) {
        if (swap) {
            value = Short.reverseBytes(value);
        }
        pokeShortNative(address, value);
    }
    @FastNative
    private static native void pokeShortNative(long address, short value);

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public static native void pokeByteArray(long address, byte[] src, int offset, int count);

    /**
     * @hide
     */
    public static native void pokeCharArray(long address, char[] src, int offset, int count, boolean swap);

    /**
     * @hide
     */
    public static native void pokeDoubleArray(long address, double[] src, int offset, int count, boolean swap);

    /**
     * @hide
     */
    public static native void pokeFloatArray(long address, float[] src, int offset, int count, boolean swap);

    /**
     * @hide
     */
    public static native void pokeIntArray(long address, int[] src, int offset, int count, boolean swap);

    /**
     * @hide
     */
    public static native void pokeLongArray(long address, long[] src, int offset, int count, boolean swap);

    /**
     * @hide
     */
    public static native void pokeShortArray(long address, short[] src, int offset, int count, boolean swap);
}
