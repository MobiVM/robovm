package org.robovm.debugger.utils.macho.tools;

/**
 * Utility class that helps with bit manipulations
 */
public class Bits64 {
    public final long raw;

    public Bits64(long raw) {
        this.raw = raw;
    }

    protected long getLongBits(int bitWidth, int bitOffs) {
        return (raw >> bitOffs) & ((1L << bitWidth) - 1);
    }

    protected long getLongBits(int bitWidth) {
        return raw & ((1L << bitWidth) - 1);
    }

    protected int getIntBits(int bitWidth, int bitOffs) {
        return (int) getLongBits(bitWidth, bitOffs);
    }

    protected int getIntBits(int bitWidth) {
        return (int) getLongBits(bitWidth);
    }


    protected boolean getBooleanBit(int bitOffs) {
        return (raw & (1L << bitOffs)) != 0;
    }
}
