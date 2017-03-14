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


    public ByteBufferReader(ByteBuffer bb) {
        byteBuffer = bb;
    }

    public abstract int position();

    public abstract int size();

    public abstract void setPosition(int position);

    protected abstract int byteBufferDataStart();

    public abstract boolean hasRemaining();

    public abstract void reset();

    public abstract ByteBuffer getByteBuffer();

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

    public int readInt16() {
        expects(2);
        return (int) byteBuffer.getShort();
    }

    public int readUnsignedInt16() {
        expects(2);
        int res = byteBuffer.getShort();
        res += 0x10000L;
        res &= 0xFFFF;
        return res;
    }

    public long readLong() {
        expects(4);
        return byteBuffer.getLong();
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

    public String readStringZ(int at) {
        setPosition(at);
        return readStringZ();
    }

    public String readString(int size) {
        expects(size);

        try {
            String res = new String(byteBuffer.array(), byteBuffer.position(), size, "UTF-8");
            byteBuffer.position(byteBuffer.position() + size);
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

    public void skip(int bytesToSkip) {
        setPosition(byteBuffer.position() + bytesToSkip);
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

}