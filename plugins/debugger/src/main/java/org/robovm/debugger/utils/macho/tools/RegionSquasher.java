package org.robovm.debugger.utils.macho.tools;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

/**
 * Squashes list of memory regions if these goes in sequence
 */
final public class RegionSquasher {
    public static <T> void squash(List<T> items, BiPredicate<T, T> isSequence, BiConsumer<T, T> squash) {
        T first = null;
        T last = null;
        for (T s : items) {
            if (last != null) {
                if (isSequence.test(last, s)) {
                    // sequence continue to be uninterruptible
                    last = s;
                } else {
                    // there is a gap, squash and start new region
                    squash.accept(first, last);
                    first = last = s;
                }
            } else {
                first = last = s;
            }
        }
        // squash last ones
        if (first != null)
            squash.accept(first, last);
    }
}
