/*
 * Copyright (C) 2007 The Android Open Source Project
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

package org.apache.harmony.dalvik.ddmc;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;

/**
 * Declarations for some VM-internal DDM stuff.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class DdmVmInternal {

    /* do not instantiate */
    private DdmVmInternal() {}

    /**
     * Enable thread notification.
     *
     * This is built into the VM, since that's where threads get managed.
     *
     * @param enabled {@code true} to enable thread notification; {@code false} to disable
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    native public static void setThreadNotifyEnabled(boolean enabled);

    /**
     * Get status info for all threads.  This is for the THST chunk.
     *
     * Returns a byte array with the THST data, or null if something
     * went wrong.
     *
     * @hide
     */
    @UnsupportedAppUsage
    native public static byte[] getThreadStats();

    /**
     * Get a stack trace for the specified thread ID.  The ID can be found
     * in the data from getThreadStats.
     * *
     * @hide
     */
    @UnsupportedAppUsage
    native public static StackTraceElement[] getStackTraceById(int threadId);

    /**
     * Enable or disable "recent allocation" tracking.
     *
     * @param enabled {@code true} to enable recent allocation tracking; {@code false} to disable
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    native public static void setRecentAllocationsTrackingEnabled(boolean enabled);
}
