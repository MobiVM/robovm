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

import org.robovm.debugger.utils.DataUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferUnderflowException;
import java.nio.charset.StandardCharsets;

/**
 * Interface defines buffer reader API
 *
 * @author Demyan Kimitsa
 */
public interface DataBufferReader extends DataBuffer {

    static DataBufferReader wrap(byte[] readBytes) {
        return new DataByteBufferReader(readBytes);
    }

    static DataBufferReader wrap(byte[] readBytes, boolean is64Bit) {
        return new DataByteBufferReader(readBytes, is64Bit);
    }

    /**
     * sanity checks: checks if there is still enough bytes
     */
    default void expects(int bytes) {
        if (this.remaining() < bytes)
            throw new BufferUnderflowException();
    }

    // redeclare for proper return type
    DataBufferReader setPosition(long position);

    byte readByte();

    default boolean readBoolean() {
        return readByte() != 0;
    }

    short readInt16();

    default int readUnsignedInt16() {
        return Short.toUnsignedInt(readInt16());
    }

    default char readChar16() {
        return (char) readInt16();
    }

    int readInt32();

    default long readUnsignedInt32() {
        return Integer.toUnsignedLong(readInt32());
    }

    long readLong();

    float readFloat();

    double readDouble();

    default void readBytes(byte[] dst, int offset, int length) {
        if (hasArray()) {
            expects(length);
            System.arraycopy(array(), arrayPositionOffset(), dst, offset, length);
        } else {
            while (length-- > 0)
                dst[offset++] = readByte();
        }
    }

    /**
     * reads bytes into array, length of array specifies amount of bytes to read
     */
    default void readBytes(byte[] array) {
        readBytes(array, 0, array.length);
    }

    /**
     * reads all remaining bytes to byte array
     */
    default byte[] readBytes() {
        return readBytes(remaining());
    }

    /**
     * reads specified amount of bytes to by array
     */
    default byte[] readBytes(int numBytes) {
        if (numBytes == 0)
            throw new IllegalArgumentException("Cant read zero number of bytes!");

        byte[] res = new byte[numBytes];
        readBytes(res);
        return res;
    }

    /**
     * reads zero-terminated string
     */
    default String readStringZ() {
        // at least one byte is needed
        expects(1);

        if (hasArray()) {
            int remaining = remaining();
            int pos = arrayPositionOffset();
            byte[] array = array();
            while (remaining > 0 && array[pos] != 0) {
                pos++;
                remaining--;
            }
            return new String(array, arrayPositionOffset(), pos - arrayPositionOffset(), StandardCharsets.US_ASCII);
        } else {
            // reads null terminated string
            StringBuilder sb = new StringBuilder();
            for (byte b = readByte(); b != 0; b = readByte())
                sb.append((char) b);
            return sb.toString();
        }
    }

    /**
     * peeks string at position, doesn't change current pos
     *
     * @param at offset to read string at
     * @return string read at specified offset
     */
    default String readStringZ(long at) {
        long savedPosition = position();
        setPosition(at);
        String s = readStringZ();
        setPosition(savedPosition);
        return s;
    }

    default String readString(int size) {
        String res;
        long savedPosition = position();
        byte[] stringBytes;
        int stringStartOffset;
        if (hasArray()) {
            expects(size);
            stringBytes = array();
            stringStartOffset = arrayPositionOffset();
        } else {
            stringBytes = new byte[size];
            stringStartOffset = 0;
            readBytes(stringBytes);
        }

        // find where string is zero terminated
        int strLen = size;
        for (int i = 0, offset = stringStartOffset; i < size; i++, offset++) {
            if (stringBytes[offset] == 0) {
                strLen = i;
                break;
            }
        }
        res = new String(stringBytes, stringStartOffset, strLen, StandardCharsets.UTF_8);
        setPosition(savedPosition + size);
        return res;
    }

    /**
     * reads string located from current position till end of buffer
     */
    default String readString() {
        if (!hasRemaining())
            return "";
        return readString(remaining());
    }

    /**
     * reads pascal like string: 4 byte integer size specified and followed string bytes
     */
    default String readStringWithLen() {
        int stringLen = readInt32();
        if (stringLen == 0)
            return "";
        return readString(stringLen);
    }

    /**
     * reads un-aligned pointer
     */
    default long readPointer() {
        return readPointer(false);
    }

    /**
     * reads optionally aligned pointer to pointer size boundary (
     *
     * @param aligned true if pointer has to be alligned
     */
    default long readPointer(boolean aligned) {
        if (aligned) {
            long savedPosition = position();
            long alignedPosition = DataUtils.align(savedPosition, pointerSize());
            if (savedPosition != alignedPosition)
                setPosition(alignedPosition);
        }
        return is64bit() ? readLong() : readUnsignedInt32();
    }

    /**
     * advanced position to specified number of bytes
     */
    default void skip(int bytesToSkip) {
        setPosition(position() + bytesToSkip);
    }

    /**
     * read all remaining bytes (from current position) to output stream
     */
    default void readToStream(OutputStream os) throws IOException {
        readToStream(os, remaining());
    }

    /**
     * dump all data to output stream
     */
    default void dumpToOutputStream(OutputStream os) throws IOException {
        readToStream(os, bottomLimit(), size());
    }

    /**
     * read specified amount of bytes (from current position) to output stream
     */
    default void readToStream(OutputStream os, int count) throws IOException {
        readToStream(os, position(), count);
    }

    /**
     * read specified amount of bytes from given position
     * (position is updated after operation is complete)
     */
    default void readToStream(OutputStream os, long position, int count) throws IOException {
        setPosition(position);
        expects(count);
        if (hasArray()) {
            os.write(array(), arrayPositionOffset(), count);
            setPosition(position + count);
        } else {
            byte[] buffer = new byte[Math.min(1024, count)];
            int remaining = count;
            while (remaining > 0) {
                int read = Math.min(remaining, buffer.length);
                readBytes(read);
                os.write(buffer, 0, read);
                remaining -= read;
            }
        }
    }

    /**
     * makes a slice at specific position and specific size,
     * new slices receives new bottom limit
     */
    DataBufferReader sliceAt(long pos, int size, long newBottomLimit, boolean as64bit);

    default DataBufferReader sliceAt(long pos, int size, boolean as64bit) {
        return sliceAt(pos, size, 0L, as64bit);
    }

    default DataBufferReader sliceAt(long pos, int size) {
        return sliceAt(pos, size, is64bit());
    }

    /**
     * makes a slice from current position and specific size
     */
    default DataBufferReader slice(int size) {
        return sliceAt(position(), size);
    }

    /**
     * slices all remain bytes
     */
    default DataBufferReader slice() {
        return sliceAt(position(), remaining());
    }

    /**
     * resets reader part (in case class implements both reader and writer)
     */
    default DataBufferReader resetReader() {
        reset();
        return this;
    }
}