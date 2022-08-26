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

import dalvik.annotation.compat.UnsupportedAppUsage;

/** @hide */
@libcore.api.CorePlatformApi
public final class EmptyArray {
    private EmptyArray() {}

    @libcore.api.CorePlatformApi
    public static final boolean[] BOOLEAN = new boolean[0];
    @UnsupportedAppUsage
    @libcore.api.CorePlatformApi
    public static final byte[] BYTE = new byte[0];
    public static final char[] CHAR = new char[0];
    public static final double[] DOUBLE = new double[0];
    @libcore.api.CorePlatformApi
    public static final float[] FLOAT = new float[0];
    @UnsupportedAppUsage
    @libcore.api.CorePlatformApi
    public static final int[] INT = new int[0];
    @UnsupportedAppUsage
    @libcore.api.CorePlatformApi
    public static final long[] LONG = new long[0];

    public static final Class<?>[] CLASS = new Class[0];
    @UnsupportedAppUsage
    @libcore.api.CorePlatformApi
    public static final Object[] OBJECT = new Object[0];
    @libcore.api.CorePlatformApi
    public static final String[] STRING = new String[0];
    public static final Throwable[] THROWABLE = new Throwable[0];
    public static final StackTraceElement[] STACK_TRACE_ELEMENT = new StackTraceElement[0];
    public static final java.lang.reflect.Type[] TYPE = new java.lang.reflect.Type[0];
    public static final java.lang.reflect.TypeVariable[] TYPE_VARIABLE =
        new java.lang.reflect.TypeVariable[0];
}
