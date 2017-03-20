package org.robovm.debugger.utils.bytebuffer;

/**
 * @author Demyan Kimitsa
 * Wrapper around byte buffer reader that simulates memory block access
 * Also it 32/64 size of pointers
 */
public class ByteBufferMemoryReader extends RangeByteBufferReader {
    private final long startAddr;
    private final boolean is64bit;
    private final int pointerSize;

    public ByteBufferMemoryReader(ByteBufferReader other, int offs, int size, long startAddr, boolean is64bit) {
        super(other, offs, size);
        this.startAddr = startAddr;
        this.is64bit = is64bit;
        pointerSize = is64bit ? 8 : 4;
    }

    public ByteBufferMemoryReader setAddress(long address) {
        setPosition(address - startAddr);
        return this;
    }

    public long address() {
        return startAddr + position();
    }

    public long readPointer() {
        return readPointer(false);
    }

    public long readPointer(boolean alligned) {
        if (alligned) {
            long oldAddr = address();
            long allignedAddr = (oldAddr + pointerSize - 1) & ~(pointerSize - 1);
            if (oldAddr != allignedAddr)
                setAddress(allignedAddr);
        }
        return is64bit ? readLong() : readUnsignedInt32();
    }

    public int pointerSize() {
        return pointerSize;
    }

    public String readStringZAtPtr(long addr) {
        return readStringZ((int) (addr - startAddr));
    }
}
