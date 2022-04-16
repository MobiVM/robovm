package org.robovm.debugger.utils.bytebuffer;

/**
 * Wrapper around several mapped writers (regions) that simulates memory block access
 * @author Demyan Kimitsa
 */
public class CompositeDataBufferWriter extends CompositeDataBuffer<DataBufferReaderWriter> implements DataBufferReaderWriter{

    public CompositeDataBufferWriter(DataBufferReaderWriter[] regions) {
        super(regions);
    }

    public CompositeDataBufferWriter setPosition(long position) {
        super.setPosition(position);
        return this;
    }

    @Override
    public CompositeDataBufferWriter sliceAt(long pos, int size, long newBottomLimit, boolean as64bit) {
        throw new IllegalArgumentException();
    }

    @Override
    public void wants(int size) {
        activeRegion.wants(size);
    }

    @Override
    public DataBufferReaderWriter writeByte(byte b) {
        activeRegion.writeByte(b);
        return this;
    }

    @Override
    public DataBufferReaderWriter writeInt32(int i) {
        activeRegion.writeInt32(i);
        return this;
    }

    @Override
    public DataBufferReaderWriter writeInt16(short i) {
        activeRegion.writeInt16(i);
        return this;
    }

    @Override
    public DataBufferReaderWriter writeLong(long l) {
        activeRegion.writeLong(l);
        return this;
    }

    @Override
    public DataBufferReaderWriter writeFloat(float f) {
        activeRegion.writeFloat(f);
        return this;
    }

    @Override
    public DataBufferReaderWriter writeDouble(double d) {
        activeRegion.writeDouble(d);
        return this;
    }

    @Override
    public DataBufferReaderWriter writeBytes(byte[] bytes, int offset, int count) {
        activeRegion.writeBytes(bytes, offset, count);
        return this;
    }
}
