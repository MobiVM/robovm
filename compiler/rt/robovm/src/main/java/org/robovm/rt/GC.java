package org.robovm.rt;

/**
 * Interfaces with the garbage collector
 */
public class GC {

    /**
     * @return whether this is enabled
     */
    public static native boolean getDontExpand();

    /**
     * Do not expand the heap unless explicitly requested or forced to
     * @param value whether this is enabled
     */
    public static native void setDontExpand(boolean value);

    /**
     * @return Get the GC library version.
     * The returned value is a constant in the form: ((version_major<<16) | (version_minor<<8) | version_micro).
     */
    public static native int getVersion();

    /**
     * @return Counter incremented per collection. Includes empty GCs at startup.
     */
    public static native long getCount();

    /**
     * Disable garbage collection.  Even GC_gcollect calls will be ineffective.
     */
    public static native void disable();

    /**
     * Try to re-enable garbage collection.  GC_disable() and GC_enable() calls nest.
     * Garbage collection is enabled if the number of calls to both functions is equal.
     */
    public static native void enable();

    /**
     * @return non-zero (TRUE) if and only if garbage collection is disabled (i.e., GC_dont_gc value is non-zero).
     * Does not acquire the lock.
     */
    public static native boolean isDisabled();

    /**
     * @return the number of bytes in the heap.
     * Excludes collector private  data structures.
     * Excludes the unmapped memory (returned to the OS).
     * Includes empty blocks and fragmentation loss.
     * Includes some pages that were allocated but never written.
     */
    public static native long getHeapSize();

    /**
     * @return Return a lower bound on the number of free bytes in the heap (excluding the unmapped memory space).
     */
    public static native long getFreeBytes();

    /**
     * @return Return the size (in bytes) of the unmapped memory (which is returned to the OS but could be remapped
     * back by the collector later unless the OS runs out of system/virtual memory).
     */
    public static native long getUnmappedBytes();

    /**
     * @return Return the number of bytes allocated since the last collection.
     */
    public static native long getBytesSinceGC();

    /**
     * @return Return the total number of bytes allocated in this process. Never decreases, except due to wrapping.
     */
    public static native long getTotalBytes();

    /**
     * Perform some garbage collection work, if appropriate. Return 0 if there is no more work to be done.
     * Typically performs an amount of work corresponding roughly
     * to marking from one page.  May do more work if further
     * progress requires it, e.g. if incremental collection is
     * disabled.  It is reasonable to call this in a wait loop
     * until it returns 0.
     */
    public static native void collectALittle();

    /**
     * @return the current free space divisor
     */
    public static native long getFreeSpaceDivisor();

    /**
     * We try to make sure that we allocate at least N/GC_free_space_divisor bytes between
     * collections, where N is twice the number of traced bytes, plus the number of untraced
     * bytes (bytes in "atomic" objects), plus a rough estimate of the root set size.
     * N approximates GC tracing work per GC. Initially, GC_free_space_divisor = 3. Increasing its value will use less space
     * but more collection time.  Decreasing it will appreciably decrease collection time at the expense of space.
     */
    public static native void setFreeSpaceDivisor(long value);

    /**
     * @return The maximum number of GCs attempted before reporting out of memory after heap expansion fails. Initially 0.
     */
    public static native long getMaxRetries();

    /**
     * @param value  The maximum number of GCs attempted before reporting out of memory after heap expansion fails. Initially 0.
     */
    public static native void setMaxRetries(long value);

    public static native long getTimeLimit();

    /**
     * If incremental collection is enabled, We try to terminate collections after this many milliseconds.
     * Not a hard time bound.
     * @param value
     */
    public static native void setTimeLimit(long value);

}
