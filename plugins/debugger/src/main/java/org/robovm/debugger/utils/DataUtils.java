package org.robovm.debugger.utils;

/**
 * Data manipulation utilities
 */
public final class DataUtils {
    /**
     * Aligns address to specific boundary
     * @param boundary expected to be power of 2
     */
    public static long align(long addr, long boundary) {
        //noinspection PointlessBitwiseExpression
        return (addr + boundary - 1) & ~(boundary - 1);
    }

    public static long alignFloor(long addr, long boundary) {
        //noinspection PointlessBitwiseExpression
        return addr & ~(boundary - 1);
    }

}
