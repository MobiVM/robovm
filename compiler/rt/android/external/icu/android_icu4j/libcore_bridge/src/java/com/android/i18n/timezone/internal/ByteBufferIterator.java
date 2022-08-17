/*
 * Copyright (C) 2016 The Android Open Source Project
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

import java.nio.ByteBuffer;

/**
 * A {@link BufferIterator} that wraps a {@link ByteBuffer}.
 */
public class ByteBufferIterator extends BufferIterator {

    private final ByteBuffer buffer;

    public ByteBufferIterator(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void seek(int offset) {
        buffer.position(offset);
    }

    @Override
    public void skip(int byteCount) {
        buffer.position(buffer.position() + byteCount);
    }

    @Override
    public int pos() {
        return buffer.position();
    }

    @Override
    public void readByteArray(byte[] bytes, int arrayOffset, int byteCount) {
        buffer.get(bytes, arrayOffset, byteCount);
    }

    @Override
    public byte readByte() {
        return buffer.get();
    }

    @Override
    public int readInt() {
        int value = buffer.asIntBuffer().get();
        // Using a separate view does not update the position of this buffer so do it
        // explicitly.
        skip(Integer.BYTES);
        return value;
    }

    @Override
    public void readIntArray(int[] ints, int arrayOffset, int intCount) {
        buffer.asIntBuffer().get(ints, arrayOffset, intCount);
        // Using a separate view does not update the position of this buffer so do it
        // explicitly.
        skip(Integer.BYTES * intCount);
    }

    @Override
    public void readLongArray(long[] longs, int arrayOffset, int longCount) {
        buffer.asLongBuffer().get(longs, arrayOffset, longCount);
        // Using a separate view does not update the position of this buffer so do it
        // explicitly.
        skip(Long.BYTES * longCount);
    }

    @Override
    public short readShort() {
        short value = buffer.asShortBuffer().get();
        // Using a separate view does not update the position of this buffer so do it
        // explicitly.
        skip(Short.BYTES);
        return value;
    }
}
