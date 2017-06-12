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

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/**
 * @author Demyan Kimitsa
 * Byte buffer that is boxed
 */
public class ByteBufferPacket extends ByteBufferReader {
    private static final int DEFAULT_CAPACITY = 1024;


    public ByteBufferPacket() {
        this(DEFAULT_CAPACITY, false);
    }

    public ByteBufferPacket(boolean is64Bit) {
        this(DEFAULT_CAPACITY, is64Bit);
    }

    public ByteBufferPacket(int capacity, boolean is64Bit) {
        super(ByteBuffer.allocate(capacity), is64Bit);
        reset();
    }

    @Override
    public int position() {
        return byteBuffer.position();
    }

    @Override
    public int size() {
        return byteBuffer.limit();
    }

    @Override
    public void setPosition(int position) {
        // virtual to real
        byteBuffer.position(position);
    }

    @Override
    protected int byteBufferDataStart() {
        return 0;
    }

    @Override
    public void reset() {
        byteBuffer.position(0);
        byteBuffer.limit(0);
    }

    @Override
    public ByteBuffer getByteBuffer() {
        return byteBuffer;
    }

    private void wants(int bytes) {
        // sanity checks that there is enough capacity
        long afterWritePos = byteBuffer.position() + bytes;
        long capacity = byteBuffer.capacity();
        if (afterWritePos > capacity) {
            // make capacity twice bigger that required
            long requiredCap = (afterWritePos + capacity - 1) / capacity;
            requiredCap *= capacity * 2;
            ByteBuffer buffer = ByteBuffer.allocate((int) requiredCap);
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


    public ByteBufferPacket writeByte(byte b) {
        wants(1);
        byteBuffer.put(b);
        return this;
    }

    public ByteBufferPacket writeBoolean(boolean b) {
        wants(1);
        byteBuffer.put((byte) (b ? 1 : 0));
        return this;
    }

    public ByteBufferPacket writeInt32(int i) {
        wants(4);
        byteBuffer.putInt(i);
        return this;
    }

    public ByteBufferPacket writeUnsignedInt32(long l) {
        wants(4);
        int i = (int) l;
        byteBuffer.putInt(i);
        return this;
    }

    public ByteBufferPacket writeInt16(short i) {
        wants(2);
        byteBuffer.putShort(i);
        return this;
    }

    public ByteBufferPacket writeUnsignedInt16(int i) {
        wants(2);
        short s = (short) (i & 0xFFFF);
        byteBuffer.putShort(s);
        return this;
    }

    public ByteBufferPacket writeChar16(char c) {
        return writeUnsignedInt16(c);
    }

    public ByteBufferPacket writeLong(long l) {
        wants(8);
        byteBuffer.putLong(l);
        return this;
    }

    public ByteBufferPacket writeFloat(float f) {
        wants(4);
        byteBuffer.putFloat(f);
        return this;
    }

    public ByteBufferPacket writeDouble(double d) {
        wants(8);
        byteBuffer.putDouble(d);
        return this;
    }

    public ByteBufferPacket writeString(String s) {
        byte[] bytes = s.getBytes();
        wants(bytes.length);
        byteBuffer.put(bytes);
        return this;
    }

    public ByteBufferPacket writeStringWithLen(String s) {
        byte[] bytes = s.getBytes();
        wants(bytes.length + 4);
        byteBuffer.putInt(bytes.length);
        byteBuffer.put(bytes);
        return this;
    }

    public void fillFromInputStream(InputStream is) throws IOException {
        fillFromInputStream(is, byteBuffer.remaining());
    }

    public void fillFromInputStream(InputStream is, int count) throws IOException {
        // will put to byte buffer
        wants(count);
        int offset = 0;
        while (count > 0) {
            int bytesRead = is.read(byteBuffer.array(), byteBuffer.position() + offset, count);
            if (bytesRead <= 0)
                throw new BufferOverflowException();
            offset += bytesRead;
            count -= bytesRead;
        }
    }

    public void writeBytes(byte[] bytes) {
        wants(bytes.length);
        byteBuffer.put(bytes);
    }

    public void writePacket(ByteBufferPacket packet) {
        wants(packet.bytesRemaining());
        byteBuffer.put(packet.getByteBuffer().array(), packet.byteBufferDataStart(), packet.bytesRemaining());
    }

    public void writePointer(long addr) {
        if(is64bit)
            writeLong(addr);
        else
            writeUnsignedInt32(addr);
    }
}
