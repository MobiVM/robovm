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

import org.robovm.debugger.DebuggerException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * @author Demyan Kimitsa
 */
public abstract class ByteBufferReader {
    /** real byte buffer we are working with */
    protected ByteBuffer byteBuffer;

    /** for pointers operation -- specifies it width */
    protected final boolean is64bit;

    /** pre-calculated pointer size  */
    protected final int pointerSize;


    public ByteBufferReader(ByteBuffer byteBuffer, boolean is64bit) {
        this.byteBuffer = byteBuffer;
        this.is64bit = is64bit;
        pointerSize = is64bit ? 8 : 4;
    }

    protected ByteBufferReader(ByteBuffer bb) {
        this(bb, false);
    }


    public static ByteBufferReader wrap(ByteBuffer bb) {
        return new RangeByteBufferReader(bb);
    }

    public static ByteBufferReader wrap(byte[] bytes) {
        return new RangeByteBufferReader(ByteBuffer.wrap(bytes));
    }

    public static ByteBufferReader wrap(byte[] bytes, boolean is64bit) {
        return new RangeByteBufferReader(ByteBuffer.wrap(bytes), is64bit);
    }

    public boolean is64bit() {
        return is64bit;
    }

    public abstract int position();

    public abstract int size();

    public abstract void setPosition(int position);

    protected abstract int byteBufferDataStart();

    public abstract void reset();

    public abstract ByteBuffer getByteBuffer();

    /** returns absolute position in bottom byte buffer */
    public int absolutePosition() {
        return byteBufferDataStart() + position();
    }

    /** helper just to reduce amount to casting */
    public void setPosition(long position) {
        setPosition((int)position);
    }

    public boolean hasRemaining() {
        return position() < size();
    }

    public int bytesRemaining() {
        return size() - position();
    }

    /**
     * sanity checks that there is enough data
     */
    protected void expects(int bytes) {
        if (this.position() + bytes > this.size())
            throw new BufferUnderflowException();
    }

    public byte readByte() {
        expects(1);
        return byteBuffer.get();
    }

    public boolean readBoolean() {
        expects(1);
        return byteBuffer.get() != 0;
    }

    public int readInt32() {
        expects(4);
        return byteBuffer.getInt();
    }

    public long readUnsignedInt32() {
        expects(4);
        long res = byteBuffer.getInt();
        res += 0x100000000L;
        res &= 0xFFFFFFFFL;
        return res;
    }

    public short readInt16() {
        expects(2);
        return byteBuffer.getShort();
    }

    public int readUnsignedInt16() {
        expects(2);
        int res = byteBuffer.getShort();
        res += 0x10000L;
        res &= 0xFFFF;
        return res;
    }

    public char readChar16() {
        return (char) readUnsignedInt16();
    }

    public long readLong() {
        expects(8);
        return byteBuffer.getLong();
    }

    public float readFloat() {
        expects(4);
        return byteBuffer.getFloat();
    }

    public double readDouble() {
        expects(8);
        return byteBuffer.getDouble();
    }

    public String readStringZ() {
        // at least one byte is needed
        expects(1);

        // reads null terminated string
        StringBuilder sb = new StringBuilder();
        for (byte b = readByte(); b != 0; b = byteBuffer.get())
            sb.append((char) b);
        return sb.toString();
    }

    /**
     * peeks string at position, doesn't change current pos
     * @param at offset to read string at
     * @return string read at specified offset
     */
    public String readStringZ(int at) {
        int oldPos = position();
        setPosition(at);
        String s = readStringZ();
        setPosition(oldPos);
        return s;
    }

    public String readString(int size) {
        expects(size);

        try {
            String res;
            int byteBufPos = byteBuffer.position();
            byte[] byteArray;
            int byteArrayOffs;
            if (byteBuffer.hasArray()) {
                byteArray = byteBuffer.array();
                byteArrayOffs = byteBuffer.position();
            } else {
                byteArray = new byte[size];
                byteArrayOffs = 0;
                byteBuffer.get(byteArray);
            }
            // get the string len
            int strLen = size;
            for (int i = 0; i < size; i++) {
                if (byteArray[byteArrayOffs + i] == 0) {
                    strLen = i;
                    break;
                }
            }
            res = new String(byteArray, byteArrayOffs, strLen, "UTF-8");
            byteBuffer.position(byteBufPos + size);
            return res;
        } catch (UnsupportedEncodingException e) {
            throw new DebuggerException(e);
        }
    }

    public String readString() {
        if (!byteBuffer.hasRemaining())
            return "";
        return readString(byteBuffer.remaining());
    }

    public String readStringWithLen() {
        expects(4);
        int stringLen = byteBuffer.getInt();
        if (stringLen == 0)
            return "";
        return readString(stringLen);
    }

    public long readPointer() {
        return readPointer(false);
    }

    public long readPointer(boolean alligned) {
        if (alligned) {
            long oldAddr = position();
            long allignedAddr = (oldAddr + pointerSize - 1) & ~(pointerSize - 1);
            if (oldAddr != allignedAddr)
                setPosition(allignedAddr);
        }
        return is64bit ? readLong() : readUnsignedInt32();
    }

    public int pointerSize() {
        return pointerSize;
    }

    public void skip(int bytesToSkip) {
        setPosition(position() + bytesToSkip);
    }

    public byte[] readBytes() {
        return readBytes(byteBuffer.remaining());
    }

    public byte[] readBytes(int numBytes) {
        if (numBytes == 0)
            throw new DebuggerException("Cant read zero number of bytes!");

        expects(numBytes);
        return Arrays.copyOfRange(byteBuffer.array(), byteBuffer.position(),  byteBuffer.position() + numBytes);
    }


    public void dumpToOutputStream(OutputStream os) throws IOException {
        os.write(byteBuffer.array(), byteBufferDataStart(), size());
    }

    public void setByteOrder(ByteOrder order) {
        byteBuffer.order(order);
    }

    public ByteBufferReader sliceAt(int pos, int size) {
        return new RangeByteBufferReader(this, pos, size, is64bit);
    }

    public ByteBufferReader slice(int offest, int size) {
        return new RangeByteBufferReader(this, position() + offest, size, is64bit);
    }

    public ByteBufferReader slice(int size) {
        return new RangeByteBufferReader(this, position(), size, is64bit);
    }

    public ByteBufferReader slice() {
        return new RangeByteBufferReader(this, position(), bytesRemaining(), is64bit);
    }

    /**
     * WARNING: will not be able to slize to remaining bytes limited by reader, will slice to end of byte-buffer
     */
    public ByteBuffer sliceToByteBuffer() {
        return byteBuffer.slice();
    }
}