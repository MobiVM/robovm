/*
 * Copyright (C) 2017 The Android Open Source Project
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

package dalvik.system;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import libcore.util.NonNull;
import libcore.util.Nullable;

/**
 * A class encapsulating a StackTraceElement and lock state. This adds
 * critical thread state to the standard stack trace information, which
 * can be used to detect deadlocks at the Java level.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class AnnotatedStackTraceElement {
    /**
     * The traditional StackTraceElement describing the Java stack frame.
     */
    private StackTraceElement stackTraceElement;

    /**
     * An array containing objects that are locked in this frame. May be null.
     */
    private Object[] heldLocks;

    /**
     * If this frame denotes the top of stack, {@code blockedOn} will hold
     * the object this thread is waiting to lock, or waiting on, if any. May be
     * null.
     */
    private Object blockedOn;

    // Internal allocation, only.
    private AnnotatedStackTraceElement() {
    }

    /**
     * Returns the {@link StackTraceElement} describing the Java stack frame.
     *
     * @return {@link StackTraceElement} describing the Java stack frame.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @NonNull public StackTraceElement getStackTraceElement() {
        return stackTraceElement;
    }

    /**
     * Returns the objects this stack frame is synchronized on.
     * May be {@code null}.
     *
     * @return array of objects current frame is syncronized on.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @Nullable public Object[] getHeldLocks() {
        return heldLocks;
    }

    /**
     * Returns the object this stack frame is waiting on for synchronization.
     * May be {@code null}.
     *
     * @return object this thread is waiting to lock, or waiting on, if any,
     *         or {@code null}, if none.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @Nullable public Object getBlockedOn() {
        return blockedOn;
    }
}
