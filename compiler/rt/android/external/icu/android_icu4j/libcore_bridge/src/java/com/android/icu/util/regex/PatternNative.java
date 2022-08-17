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

import libcore.util.NativeAllocationRegistry;

/**
 * Provide an entry point to use ICU4C icu::RegexPattern.
 *
 * @hide
 */
@libcore.api.IntraCoreApi
public class PatternNative {

    private static final NativeAllocationRegistry REGISTRY = NativeAllocationRegistry
        .createMalloced(PatternNative.class.getClassLoader(), getNativeFinalizer());

    @dalvik.annotation.optimization.ReachabilitySensitive
    private final long address;

    /**
     * Create an {@link PatternNative} with a regular expression string.
     *
     * @param pattern the regular expression to be compiled
     * @param flags a bit set of {@link java.util.regex.Pattern#UNIX_LINES},
     *              {@link java.util.regex.Pattern#CASE_INSENSITIVE},
     *              {@link java.util.regex.Pattern#COMMENTS},
     *              {@link java.util.regex.Pattern#MULTILINE} and
     *              {@link java.util.regex.Pattern#DOTALL}.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public static PatternNative create(String pattern, int flags) {
        return new PatternNative(pattern, flags);
    }

    private PatternNative(String pattern, int flags) {
        address = compileImpl(pattern, flags);
        REGISTRY.registerNativeAllocation(this, address);
    }

    /* package */ int getMatchedGroupIndex(String groupName) {
        return getMatchedGroupIndexImpl(address, groupName);
    }

    /* package */ long openMatcher() {
        return openMatcherImpl(address);
    }

    /**
     * @return native address of the native allocation.
     */
    private static native long compileImpl(String pattern, int flags);

    /**
     * @return address of a native function of type <code>void f(void* nativePtr)</code>
     *         used to free this kind of native allocation
     */
    private static native long getNativeFinalizer();

    /**
     * @param addr the NativePattern.address
     * @return native address of matcher implementation
     */
    private static native long openMatcherImpl(long addr);

    /**
     * @param groupName The name of a named-capturing group
     * @return the index of the named-capturing group
     */
    private static native int getMatchedGroupIndexImpl(long addr, String groupName);

}
