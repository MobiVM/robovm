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
    public static final int DEFAULT_CAPACITY = 1024;


    public ByteBufferPacket() {
        this(DEFAULT_CAPACITY);
    }

    public ByteBufferPacket(int capacity) {
        super(ByteBuffer.allocate(capacity));
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
    public boolean hasRemaining() {
        return byteBuffer.hasRemaining();
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

    public ByteBufferPacket writeInt32(int i) {
        wants(4);
        byteBuffer.putInt(i);
        return this;
    }

    public ByteBufferPacket writeUnsignedInt32(long l) {
        wants(4);
        int i = (short) (l & 0xFFFFFFFF);
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

    public ByteBufferPacket writeLong(long l) {
        wants(4);
        byteBuffer.putLong(l);
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
        int bytesRead = is.read(byteBuffer.array(), byteBuffer.position(), count);
        if (count != bytesRead)
            throw new BufferOverflowException();
    }

    public void writeBytes(byte[] bytes) {
        wants(bytes.length);
        byteBuffer.put(bytes);
    }
}
