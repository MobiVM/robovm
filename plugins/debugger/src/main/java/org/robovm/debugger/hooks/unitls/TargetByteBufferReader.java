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
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author Demyan Kimitsa
 */
public class TargetByteBufferReader extends ByteBufferReader {
    private final IHooksApi hooksApi;
    private long address;

    public TargetByteBufferReader(IHooksApi api, boolean is64bit) {
        super(null, is64bit);
        this.hooksApi = api;
    }


    @Override
    protected void expects(int bytes) {
        // when primitive data being read -- it will call expects to validate that there is data in buffer
        // it is proper plate to read out data from device
        if (byteBuffer == null || byteBuffer.limit() < bytes) {
            byteBuffer = ByteBuffer.allocate((int) (bytes * 1.5));
            // x86 and apple arms are little endian
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        }

        byteBuffer.position(0);

        // read number of bytes from device at given address
        byte[] buff = hooksApi.readMemory(address, bytes);
        byteBuffer.put(buff);

        address += bytes;
        byteBuffer.position(0);
    }

    public void setAddress(long addr) {
        address = addr;
    }

    public String readStringZAtPtr(long addr) {
        // read zero terminated string right from device
        return hooksApi.readCString(addr);
    }


    @Override
    public void skip(int bytesToSkip) {
        address += bytesToSkip;
    }

    //
    // API listed bellow is not supported
    //

    @Override
    public int position() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setPosition(int position) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected int byteBufferDataStart() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ByteBuffer getByteBuffer() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int absolutePosition() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasRemaining() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int bytesRemaining() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String readStringZ() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String readStringZ(int at) {
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
    public void dumpToOutputStream(OutputStream os) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setByteOrder(ByteOrder order) {
        super.setByteOrder(order);
    }

    @Override
    public ByteBufferReader sliceAt(int pos, int size) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ByteBufferReader slice(int offest, int size) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ByteBufferReader slice(int size) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ByteBufferReader slice() {
        throw new UnsupportedOperationException();
    }

}
