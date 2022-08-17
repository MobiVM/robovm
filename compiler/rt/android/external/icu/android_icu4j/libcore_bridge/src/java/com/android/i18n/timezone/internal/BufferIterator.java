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

package com.android.i18n.timezone.internal;

/**
 * Iterates over big- or little-endian bytes. See {@link MemoryMappedFile#bigEndianIterator} and
 * {@link MemoryMappedFile#littleEndianIterator}.
 *
 * @hide
 */
public abstract class BufferIterator {
    /**
     * Seeks to the absolute position {@code offset}, measured in bytes from the start of the
     * buffer.
     */
    public abstract void seek(int offset);

    /**
     * Skips forwards or backwards {@code byteCount} bytes from the current position.
     */
    public abstract void skip(int byteCount);

    /**
     * Returns the current position of the iterator within the buffer.
     */
    public abstract int pos();

    /**
     * Copies {@code byteCount} bytes from the current position into {@code bytes}, starting at
     * {@code arrayOffset}, and advances the current position {@code byteCount} bytes.
     *
     * @throws IndexOutOfBoundsException if the read / write would be outside of the buffer / array
     */
    public abstract void readByteArray(byte[] bytes, int arrayOffset, int byteCount);

    /**
     * Returns the byte at the current position, and advances the current position one byte.
     *
     * @throws IndexOutOfBoundsException if the read would be outside of the buffer
     */
    public abstract byte readByte();

    /**
     * Returns the 32-bit int at the current position, and advances the current position four bytes.
     *
     * @throws IndexOutOfBoundsException if the read would be outside of the buffer
     */
    public abstract int readInt();

    /**
     * Copies {@code intCount} 32-bit ints from the current position into {@code ints}, starting at
     * {@code arrayOffset}, and advances the current position {@code 4 * intCount} bytes.
     *
     * @throws IndexOutOfBoundsException if the read / write would be outside of the buffer / array
     */
    public abstract void readIntArray(int[] ints, int arrayOffset, int intCount);

    /**
     * Copies {@code longCount} 64-bit ints from the current position into {@code longs}, starting
     * at {@code arrayOffset}, and advances the current position {@code 8 * longCount} bytes.
     *
     * @throws IndexOutOfBoundsException if the read / write would be outside of the buffer / array
     */
    public abstract void readLongArray(long[] longs, int arrayOffset, int longCount);

    /**
     * Returns the 16-bit short at the current position, and advances the current position two bytes.
     *
     * @throws IndexOutOfBoundsException if the read would be outside of the buffer
     */
    public abstract short readShort();
}
