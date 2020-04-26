package org.robovm.debugger.utils.bytebuffer;

import java.nio.BufferUnderflowException;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Reader that returns always Zeroes for specified range
 * used to simulate regions like .bss data sections
 *
 * @author dkimitsa
 */
public class NullDataBufferReader implements DataBufferReader {
    final boolean is64bit;
    final long bottomLimit, limit;
    long position;

    public NullDataBufferReader(long bottomLimit, long size, boolean is64bit) {
        this.bottomLimit = bottomLimit;
        this.limit = bottomLimit + size;
        this.is64bit = is64bit;
    }

    private void expectAndAdvance(int byteCount) {
        expects(byteCount);
        position += byteCount;
    }

    @Override
    public byte readByte() {
        expectAndAdvance(1);
        return 0;
    }

    @Override
    public short readInt16() {
        expectAndAdvance(2);
        return 0;
    }

    @Override
    public int readInt32() {
        expectAndAdvance(4);
        return 0;
    }

    @Override
    public long readLong() {
        expectAndAdvance(8);
        return 0;
    }

    @Override
    public float readFloat() {
        expectAndAdvance(4);
        return 0;
    }

    @Override
    public double readDouble() {
        expectAndAdvance(8);
        return 0;
    }

    @Override
    public NullDataBufferReader sliceAt(long pos, int size, long newBottomLimit, boolean as64bit) {
        if (pos < bottomLimit || position >= limit)
            throw new IndexOutOfBoundsException();
        if (pos + size > limit)
            throw new BufferUnderflowException();

        return new NullDataBufferReader(newBottomLimit, size, as64bit);
    }

    @Override
    public boolean is64bit() {
        return is64bit;
    }

    @Override
    public long position() {
        return position;
    }

    @Override
    public long bottomLimit() {
        return bottomLimit;
    }

    @Override
    public long limit() {
        return limit;
    }

    @Override
    public NullDataBufferReader setPosition(long position) {
        if (position < bottomLimit || position >= limit)
            throw new IndexOutOfBoundsException(Long.toString(position));
        return this;
    }

    @Override
    public NullDataBufferReader setByteOrder(ByteOrder order) {
        return this;
    }

    @Override
    public void readBytes(byte[] dst, int offset, int length) {
        expectAndAdvance(length);
        Arrays.fill(dst, offset, offset + length, (byte) 0);
    }
}
