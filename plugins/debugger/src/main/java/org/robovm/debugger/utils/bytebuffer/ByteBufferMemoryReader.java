package org.robovm.debugger.utils.bytebuffer;

/**
 * @author Demyan Kimitsa
 * Wrapper around byte buffer reader that simulates memory block access
 * Also it 32/64 size of pointers
 */
public class ByteBufferMemoryReader extends RangeByteBufferReader {
    private final long startAddr;

    public ByteBufferMemoryReader(ByteBufferReader other, int offs, int size, long startAddr, boolean is64bit) {
        super(other, offs, size, is64bit);
        this.startAddr = startAddr;
    }

    public ByteBufferMemoryReader setAddress(long address) {
        setPosition(address - startAddr);
        return this;
    }

    public long address() {
        return startAddr + position();
    }


    public String readStringZAtPtr(long addr) {
        return readStringZ((int) (addr - startAddr));
    }
}
