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
package org.robovm.debugger.hooks.unitls;

import org.robovm.debugger.hooks.IHooksApi;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;

import java.io.OutputStream;
import java.nio.ByteOrder;

/**
 * @author Demyan Kimitsa
 */
public class TargetByteBufferReader implements DataBufferReader {
    private final IHooksApi hooksApi;
    private final boolean is64bit;
    private long address;

    public TargetByteBufferReader(IHooksApi api, boolean is64bit) {
        this.is64bit = is64bit;
        hooksApi = api;
    }


    @Override
    public void expects(int bytes) {
    }

    @Override
    public byte readByte() {
        byte[] bytes = hooksApi.readMemory(address, 1);
        address += 1;
        return bytes[0];
    }

    @Override
    public short readInt16() {
        byte[] bytes = hooksApi.readMemory(address, 2);
        address += 2;
        return (short) ((bytes[0] & 0xFF) | (bytes[1] & 0xFF) << 8);
    }

    @Override
    public int readInt32() {
        byte[] bytes = hooksApi.readMemory(address, 4);
        address += 4;
        return  (bytes[0] & 0xFF) |
                (bytes[1] & 0xFF) << 8 |
                (bytes[2] & 0xFF) << 16 |
                (bytes[3] & 0xFF) << 24;
    }

    @Override
    public long readLong() {
        byte[] bytes = hooksApi.readMemory(address, 8);
        address += 8;
        return  (long)(bytes[0] & 0xFF) |
                (long)(bytes[1] & 0xFF) << 8 |
                (long)(bytes[2] & 0xFF) << 16 |
                (long)(bytes[3] & 0xFF) << 24 |
                (long)(bytes[4] & 0xFF) << 32 |
                (long)(bytes[5] & 0xFF) << 40 |
                (long)(bytes[6] & 0xFF) << 48 |
                (long)(bytes[7] & 0xFF) << 56;
    }

    @Override
    public float readFloat() {
        return Float.intBitsToFloat(readInt32());
    }

    @Override
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override
    public boolean is64bit() {
        return is64bit;
    }

    public String readStringZAtPtr(long addr) {
        // read zero terminated string right from device
        return hooksApi.readCString(addr);
    }

    @Override
    public byte[] readBytes(int numBytes) {
        if (numBytes <= 0)
            throw new IllegalArgumentException("invalid number of bytes to read " + numBytes);
        byte[] bytes = hooksApi.readMemory(address, numBytes);
        address += numBytes;
        return bytes;
    }

    @Override
    public void readBytes(byte[] dst, int offset, int numBytes) {
        if (numBytes <= 0)
            throw new IllegalArgumentException("invalid number of bytes to read " + numBytes);
        byte[] bytes = hooksApi.readMemory(address, numBytes);
        address += numBytes;
        System.arraycopy(bytes, 0, dst, offset, bytes.length);
    }

    @Override
    public void skip(int bytesToSkip) {
        address += bytesToSkip;
    }

    @Override
    public long position() {
        return address;
    }

    @Override
    public TargetByteBufferReader setPosition(long position) {
        address = position;
        return this;
    }

    //
    // API listed bellow is not supported
    //

    @Override
    public long limit() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasArray() {
        return false;
    }

    @Override
    public int arrayOffset() {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] array() {
        throw new UnsupportedOperationException();
    }

    @Override
    public TargetByteBufferReader reset() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasRemaining() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int remaining() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String readStringZ() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String readStringZ(long at) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String readString(int size) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String readString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String readStringWithLen() {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] readBytes() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void readToStream(OutputStream os, long position, int count) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TargetByteBufferReader setByteOrder(ByteOrder order) {
        // working in device little endian
        throw new UnsupportedOperationException();
    }

    @Override
    public TargetByteBufferReader sliceAt(long pos, int size, long newBottomLimit, boolean as64bit) {
        throw new UnsupportedOperationException();
    }
}
