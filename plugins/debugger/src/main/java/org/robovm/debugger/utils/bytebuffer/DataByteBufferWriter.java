/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.utils.bytebuffer;

import java.nio.ByteBuffer;

/**
 * Data Buffer Writer implementation that wraps ByteBuffer
 * @author Demyan Kimitsa
 */
public class DataByteBufferWriter extends DataByteBufferReader implements DataBufferReaderWriter {
    private static final int DEFAULT_CAPACITY = 1024;

    public DataByteBufferWriter() {
        this(DEFAULT_CAPACITY, false);
    }

    public DataByteBufferWriter(boolean is64Bit) {
        this(DEFAULT_CAPACITY, is64Bit);
    }

    public DataByteBufferWriter(int capacity, boolean is64Bit) {
        super(ByteBuffer.allocate(capacity), is64Bit);
        reset();
    }

    @Override
    public DataByteBufferWriter reset() {
        byteBuffer.position(0);
        byteBuffer.limit(0);
        return this;
    }

    @Override
    public DataByteBufferWriter resetReader() {
        // just reset the position
        byteBuffer.position(0);
        return this;
    }

    @Override
    public void wants(int bytes) {
        // sanity checks that there is enough capacity
        long afterWritePos = byteBuffer.position() + bytes;
        long capacity = byteBuffer.capacity();
        if (afterWritePos > capacity) {
            // make capacity twice bigger that required
            // (make it aligned to 1024 block boundary)
            long blocksCount = (afterWritePos + 1024 - 1) / 1024;
            capacity = 2 * blocksCount * 1024;
            ByteBuffer buffer = ByteBuffer.allocate((int) capacity);
            // copy old buffer
            int oldPosition = byteBuffer.position();
            byteBuffer.position(0);
            buffer.put(byteBuffer);
            buffer.position(oldPosition);
            buffer.limit(byteBuffer.limit());
            // replace with new
            byteBuffer = buffer;
        }

        // check limit
        if (afterWritePos > byteBuffer.limit())
            byteBuffer.limit((int) afterWritePos);
    }

    @Override
    public DataByteBufferWriter writeByte(byte b) {
        wants(1);
        byteBuffer.put(b);
        return this;
    }

    @Override
    public DataByteBufferWriter writeInt32(int i) {
        wants(4);
        byteBuffer.putInt(i);
        return this;
    }

    @Override
    public DataByteBufferWriter writeInt16(short i) {
        wants(2);
        byteBuffer.putShort(i);
        return this;
    }

    @Override
    public DataByteBufferWriter writeLong(long l) {
        wants(8);
        byteBuffer.putLong(l);
        return this;
    }

    @Override
    public DataByteBufferWriter writeFloat(float f) {
        wants(4);
        byteBuffer.putFloat(f);
        return this;
    }

    @Override
    public DataByteBufferWriter writeDouble(double d) {
        wants(8);
        byteBuffer.putDouble(d);
        return this;
    }

    @Override
    public DataByteBufferWriter writeBytes(byte[] bytes, int offset, int length) {
        wants(length);
        byteBuffer.put(bytes, offset, length);
        return this;
    }
}
