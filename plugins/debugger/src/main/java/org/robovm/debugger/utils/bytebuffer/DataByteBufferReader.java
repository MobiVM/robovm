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
import java.nio.ByteOrder;

/**
 * Reader implementation that wraps byte-buffer
 * @author Demyan Kimitsa
 */
public class DataByteBufferReader implements DataBufferReader {
    /**
     * real byte buffer we are working with
     */
    protected ByteBuffer byteBuffer;

    /**
     * bottom limit (virtual offset) of position that corresponds to start of buffer
     */
    protected final long bottomLimit;

    /**
     * for pointers operation -- specifies it width
     */
    protected final boolean is64bit;

    public DataByteBufferReader(ByteBuffer byteBuffer, long bottomLimit, boolean is64bit) {
        this.byteBuffer = byteBuffer;
        this.bottomLimit = bottomLimit;
        this.is64bit = is64bit;
    }

    public DataByteBufferReader(ByteBuffer byteBuffer,  boolean is64bit) {
        this(byteBuffer, 0, is64bit);
    }

    public DataByteBufferReader(byte[] bytes, boolean is64bit) {
        this(ByteBuffer.wrap(bytes), is64bit);
    }

    public DataByteBufferReader(ByteBuffer bb) {
        this(bb, false);
    }

    public DataByteBufferReader(byte[] bytes) {
        this(ByteBuffer.wrap(bytes), false);
    }

    @Override
    public boolean is64bit() {
        return is64bit;
    }

    @Override
    public long position() {
        return bottomLimit + byteBuffer.position();
    }

    @Override
    public long bottomLimit() {
        return bottomLimit;
    }

    @Override
    public long limit() {
        return bottomLimit + byteBuffer.limit();
    }

    @Override
    public DataByteBufferReader setPosition(long position) {
        byteBuffer.position((int) (position - bottomLimit));
        return this;
    }

    @Override
    public DataByteBufferReader reset() {
        byteBuffer.reset();
        return this;
    }

    @Override
    public boolean hasArray() {
        return byteBuffer.hasArray();
    }

    @Override
    public byte[] array() {
        return byteBuffer.array();
    }

    @Override
    public int arrayOffset() {
        return byteBuffer.arrayOffset();
    }

    @Override
    public int remaining() {
        return byteBuffer.remaining();
    }

    @Override
    public byte readByte() {
        return byteBuffer.get();
    }

    @Override
    public short readInt16() {
        return byteBuffer.getShort();
    }

    @Override
    public int readInt32() {
        return byteBuffer.getInt();
    }

    @Override
    public long readLong() {
        return byteBuffer.getLong();
    }

    @Override
    public float readFloat() {
        return byteBuffer.getFloat();
    }

    @Override
    public double readDouble() {
        return byteBuffer.getDouble();
    }

    @Override
    public void readBytes(byte[] dst, int offset, int length) {
        byteBuffer.get(dst, offset, length);
    }

    @Override
    public DataByteBufferReader sliceAt(long pos, int size, long newBottomLimit, boolean as64bit) {
        long savedPosition = position();
        setPosition(pos);
        expects(size);
        ByteBuffer sliced = byteBuffer.slice();
        sliced.limit(size);
        sliced.order(byteBuffer.order());
        setPosition(savedPosition);

        return new DataByteBufferReader(sliced, newBottomLimit, as64bit);
    }

    @Override
    public DataByteBufferReader setByteOrder(ByteOrder order) {
        byteBuffer.order(order);
        return this;
    }
}