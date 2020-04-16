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

import java.nio.ByteOrder;

/**
 * Wrapper around several mapped reader (regions) that simulates memory block access
 * @author Demyan Kimitsa
 */
public class CompositeDataBufferReader implements DataBufferReader {
    private final DataBufferReader[] regions;
    private DataBufferReader activeRegion;

    public CompositeDataBufferReader(DataBufferReader[] regions) {
        this.regions = regions;
    }

    @Override
    public CompositeDataBufferReader setPosition(long addr) {
        // check if address within the region
        activeRegion = findRegion(addr);
        if (activeRegion == null)
            throw new IllegalArgumentException("there is no region to read addr @" + Long.toHexString(addr));

        activeRegion.setPosition(addr);
        return this;
    }

    private DataBufferReader findRegion(long addr) {
        if (activeRegion != null && addr >= activeRegion.bottomLimit() && addr < activeRegion.limit())
            return activeRegion;

        // use binary search
        int left = 0;
        int right = regions.length - 1;
        while (right >= left) {
            int middle = (left + right) / 2;
            DataBufferReader r = regions[middle];
            if (addr < r.bottomLimit()) {
                right = middle - 1;
            } else if (addr >= r.limit()) {
                left = middle + 1;
            } else {
                return r;
            }
        }

        return null;
    }

    /**
     * sanity checks that there is enough data
     * also checks against sections
     */
    @Override
    public void expects(int bytes) {
        // sanity
        if (activeRegion == null)
            throw new IllegalArgumentException("Address has not been set but read is performed!");
        activeRegion.expects(bytes);
    }

    @Override
    public long position() {
        if (activeRegion == null)
            throw new IllegalStateException("Address has not been set!");
        return activeRegion.position();
    }

    /**
     * it has no practical value as its expected to have gaps between regions
     */
    @Override
    public long bottomLimit() {
        return regions[0].bottomLimit();
    }

    /**
     * it has no practical value as its expected to have gaps between regions
     */
    @Override
    public long limit() {
        return regions[regions.length - 1].limit();
    }

    @Override
    public CompositeDataBufferReader reset() {
        activeRegion = regions[0];
        activeRegion.reset();
        return this;
    }

    @Override
    public CompositeDataBufferReader setByteOrder(ByteOrder order) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void skip(int bytesToSkip) {
        activeRegion.skip(bytesToSkip);
    }

    @Override
    public long readPointer(boolean aligned) {
        return activeRegion.readPointer(aligned);
    }

    @Override
    public boolean is64bit() {
        return regions[0].is64bit();
    }

    @Override
    public int pointerSize() {
        return is64bit() ? 8 : 4;
    }

    @Override
    public byte readByte() {
        return activeRegion.readByte();
    }

    @Override
    public short readInt16() {
        return activeRegion.readInt16();
    }

    @Override
    public int readInt32() {
        return activeRegion.readInt32();
    }

    @Override
    public long readLong() {
        return activeRegion.readInt32();
    }

    @Override
    public float readFloat() {
        return activeRegion.readFloat();
    }

    @Override
    public double readDouble() {
        return activeRegion.readDouble();
    }

    @Override
    public void readBytes(byte[] dst, int offset, int length) {
        activeRegion.readBytes(dst, offset, length);
    }

    @Override
    public int remaining() {
        return activeRegion.remaining();
    }

    @Override
    public DataBufferReader sliceAt(long pos, int size, long newBottomLimit, boolean as64bit) {
        return activeRegion.sliceAt(pos, size, newBottomLimit, as64bit);
    }
}
