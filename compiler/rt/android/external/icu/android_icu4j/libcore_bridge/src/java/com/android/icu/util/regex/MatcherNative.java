/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.icu.util.regex;

import libcore.api.IntraCoreApi;
import libcore.util.NativeAllocationRegistry;

/**
 * Stores the states when matching an input text with a regular expression pattern
 * {@link PatternNative}.
 *
 * @hide
 */
@IntraCoreApi
public class MatcherNative {

    private static final NativeAllocationRegistry REGISTRY = NativeAllocationRegistry
        .createMalloced(MatcherNative.class.getClassLoader(), getNativeFinalizer());

    private final PatternNative nativePattern;
    @dalvik.annotation.optimization.ReachabilitySensitive
    private final long address;

    /**
     * Create a {@link MatcherNative} instance from {@link PatternNative}.
     *
     * @hide
     */
    @IntraCoreApi
    public static MatcherNative create(PatternNative pattern) {
        return new MatcherNative(pattern);
    }

    private MatcherNative(PatternNative pattern) {
        nativePattern = pattern;
        address = pattern.openMatcher();
        REGISTRY.registerNativeAllocation(this, address);
    }

    /**
     * Returns the index of the named group.
     *
     * @param groupName the group name
     *
     * @hide
     */
    @IntraCoreApi
    public int getMatchedGroupIndex(String groupName) {
        return nativePattern.getMatchedGroupIndex(groupName);
    }

    /**
     * Attempts to match the input string starting from {@code startIndex}.
     *
     * @param offsets an output argument storing the starting and ending indices of the matched
     *                groups. This has to be pre-allocated with the size of
     *                ({@link #groupCount()} + 1) * 2. The elements at index 0 and 1 are the
     *                starting and ending indices of the 0th group and 0th group is the entire
     *                match. The index can be -1 when a match is found, but the group is not found.
     * @return true if a match is found.
     *
     *
     * @hide
     */
    @IntraCoreApi
    public boolean find(int startIndex, int[] offsets) {
        return findImpl(address, startIndex, offsets);
    }

    /**
     * Attempts to find the next match.
     *
     * @param offsets an output argument storing the starting and ending indices of the matched
     *                groups. This has to be pre-allocated with the size of
     *                ({@link #groupCount()} + 1) * 2. The elements at index 0 and 1 are the
     *                starting and ending indices of the 0th group and 0th group is the entire
     *                match. The index can be -1 when a match is found, but the group is not found.
     * @return true if a match is found.
     *
     *
     * @hide
     */
    @IntraCoreApi
    public boolean findNext(int[] offsets) {
        return findNextImpl(address, offsets);
    }

    /**
     * Returns the number of named-capturing groups provided in the pattern.
     *
     * @hide
     */
    @IntraCoreApi
    public int groupCount() {
        return groupCountImpl(address);
    }

    /**
     * Returns true if the matcher has hit the end of the input string in the last match.
     *
     * @hide
     */
    @IntraCoreApi
    public boolean hitEnd() {
        return hitEndImpl(address);
    }

    /**
     * Attempts to match the prefix of the input string.
     *
     * @param offsets an output argument storing the starting and ending indices of the matched
     *                groups. This has to be pre-allocated with the size of
     *                ({@link #groupCount()} + 1) * 2. The elements at index 0 and 1 are the
     *                starting and ending indices of the 0th group and 0th group is the entire
     *                match. The index can be -1 when a match is found, but the group is not found.
     * @return true if it matches the prefix of the input string.
     *
     * @hide
     */
    @IntraCoreApi
    public boolean lookingAt(int[] offsets) {
        return lookingAtImpl(address, offsets);
    }

    /**
     * Attempts to match the entire input string.
     *
     *
     * @param offsets an output argument storing the starting and ending indices of the matched
     *                groups. This has to be pre-allocated with the size of
     *                ({@link #groupCount()} + 1) * 2. The elements at index 0 and 1 are the
     *                starting and ending indices of the 0th group and 0th group is the entire
     *                match. The index can be -1 when a match is found, but the group is not found.
     * @return true if it matches the entire input string.
     *
     * @hide
     */
    @IntraCoreApi
    public boolean matches(int[] offsets) {
        return matchesImpl(address, offsets);
    }

    /**
     * Returns true if the most recent match succeeded and additional input could cause it to fail.
     *
     * @hide
     */
    @IntraCoreApi
    public boolean requireEnd() {
        return requireEndImpl(address);
    }

    /**
     * Set the input string.
     *
     * @param start the starting index at which to begin matching
     * @param end the ending index at which to end matching
     *
     * @hide
     */
    @IntraCoreApi
    public void setInput(String input, int start, int end) {
        setInputImpl(address, input, start, end);
    }

    /**
     * Set whether using the anchoring bounds.
     *
     * Anchoring bounds allow the input string boundary to be matched by constructs ^ and $.
     *
     * @hide
     */
    @IntraCoreApi
    public void useAnchoringBounds(boolean value) {
        useAnchoringBoundsImpl(address, value);
    }

    /**
     * Set whether using transparent bounds.
     *
     * Transparent bounds makes the boundary of the input string transparent to the lookahead,
     * lookbehind, and boundary constructs.
     *
     * @hide
     */
    @IntraCoreApi
    public void useTransparentBounds(boolean value) {
        useTransparentBoundsImpl(address, value);
    }

    private static native boolean findImpl(long addr, int startIndex, int[] offsets);
    private static native boolean findNextImpl(long addr, int[] offsets);
    private static native int groupCountImpl(long addr);
    private static native boolean hitEndImpl(long addr);
    private static native boolean lookingAtImpl(long addr, int[] offsets);
    private static native boolean matchesImpl(long addr, int[] offsets);
    private static native boolean requireEndImpl(long addr);
    private static native void setInputImpl(long addr, String input, int start, int end);
    private static native void useAnchoringBoundsImpl(long addr, boolean value);
    private static native void useTransparentBoundsImpl(long addr, boolean value);

    /**
     * @return address of a native function of type <code>void f(void* nativePtr)</code>
     *         used to free this kind of native allocation
     */
    private static native long getNativeFinalizer();

}
