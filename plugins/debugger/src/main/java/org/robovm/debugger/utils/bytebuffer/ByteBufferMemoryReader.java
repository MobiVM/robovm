package org.robovm.debugger.utils.bytebuffer;

/**
 * @author Demyan Kimitsa
 * Wrapper around byte buffer reader that simulates memory block access
 * Also it 32/64 size of pointers
 */
public class ByteBufferMemoryReader extends RangeByteBufferReader {
    private final MemoryRegion[] regions;
    private MemoryRegion activeRegion;

    public ByteBufferMemoryReader(ByteBufferReader other, int offs, int size, boolean is64bit, MemoryRegion[] regions) {
        super(other, offs, size, is64bit);
        this.regions = regions;
    }

    public ByteBufferMemoryReader setAddress(long addr) {
        // check if address within the region
        activeRegion = findRegion(addr);
        if (activeRegion == null)
            throw new IllegalArgumentException("there is no region to read addr @" + Long.toHexString(addr));

        super.setPosition(activeRegion.offset + (addr - activeRegion.startAddr));
        return this;
    }

    private MemoryRegion findRegion(long addr) {
        if (activeRegion != null && addr >= activeRegion.startAddr && addr <= activeRegion.endAddr)
            return activeRegion;

        // use binary search
        int left = 0;
        int right = regions.length - 1;
        while (right >= left) {
            int middle = (left + right) / 2;
            MemoryRegion r = regions[middle];
            if (addr < r.startAddr) {
                right = middle - 1;
            } else if (addr > r.endAddr) {
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
    protected void expects(int bytes) {
        // sanity
        if (activeRegion == null)
            throw new IllegalArgumentException("Address has not been set but read is performed!");
        int currentPos = position();
        if (currentPos > activeRegion.endAddr || currentPos + bytes > activeRegion.endAddr)
            throw new IllegalArgumentException("Cross memory region read is not allowed !");

        super.expects(bytes);
    }

    public long address() {
        if (activeRegion == null)
            throw new IllegalArgumentException("Address has not been set!");
        return activeRegion.startAddr + activeRegion.offset - position();
    }


    public String readStringZAtPtr(long addr) {
        MemoryRegion r = findRegion(addr);
        if (r == null)
            throw new IllegalArgumentException("there is no region to read string @" + Long.toHexString(addr));
        return readStringZ((int) (r.offset + (addr - r.startAddr)));
    }


    /**
     * Memory region that is mapped on file, as there is bunch of sections and only particular sections is allowed to
     * be read
     */
    public static class MemoryRegion {
        private final long startAddr;
        private final long endAddr;
        private final int offset;

        public MemoryRegion(long startAddr, long endAddr, int offset) {
            this.startAddr = startAddr;
            this.endAddr = endAddr;
            this.offset = offset;
        }
    }
}
