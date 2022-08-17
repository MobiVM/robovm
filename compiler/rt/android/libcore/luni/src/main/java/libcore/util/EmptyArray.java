/*
 * Copyright (C) 2010 The Android Open Source Project
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

package libcore.util;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;
import dalvik.annotation.compat.VersionCodes;

/**
 * Empty array is immutable. Use a shared empty array to avoid allocation.
 *
 * @hide
 */
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
@SystemApi(client = MODULE_LIBRARIES)
public final class EmptyArray {
    private EmptyArray() {}

    /** @hide */
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static final @NonNull boolean[] BOOLEAN = new boolean[0];

    /** @hide */
    @UnsupportedAppUsage(maxTargetSdk=VersionCodes.Q,
            publicAlternatives="Use {@code new byte[0]} instead.")
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static final @NonNull byte[] BYTE = new byte[0];

    /** @hide */
    public static final char[] CHAR = new char[0];

    /** @hide */
    public static final double[] DOUBLE = new double[0];

    /** @hide */
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static final @NonNull float[] FLOAT = new float[0];

    /** @hide */
    @UnsupportedAppUsage(maxTargetSdk=VersionCodes.Q,
            publicAlternatives="Use {@code new int[0]} instead.")
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static final @NonNull int[] INT = new int[0];

    /** @hide */
    @UnsupportedAppUsage(maxTargetSdk=VersionCodes.Q,
            publicAlternatives="Use {@code new long[0]} instead.")
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static final @NonNull long[] LONG = new long[0];

    /** @hide */
    public static final Class<?>[] CLASS = new Class[0];

    /** @hide */
    @UnsupportedAppUsage(maxTargetSdk=VersionCodes.Q,
            publicAlternatives="Use {@code new Object[0]} instead.")
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static final @NonNull Object[] OBJECT = new Object[0];

    /** @hide */
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @SystemApi(client = MODULE_LIBRARIES)
    public static final @NonNull String[] STRING = new String[0];

    /** @hide */
    public static final Throwable[] THROWABLE = new Throwable[0];

    /** @hide */
    public static final StackTraceElement[] STACK_TRACE_ELEMENT = new StackTraceElement[0];

    /** @hide */
    public static final java.lang.reflect.Type[] TYPE = new java.lang.reflect.Type[0];

    /** @hide */
    public static final java.lang.reflect.TypeVariable[] TYPE_VARIABLE =
        new java.lang.reflect.TypeVariable[0];
}
