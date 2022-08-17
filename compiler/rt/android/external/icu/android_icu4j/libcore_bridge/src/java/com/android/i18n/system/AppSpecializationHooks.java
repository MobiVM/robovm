/*
 * Copyright (C) 2020 The Android Open Source Project
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

package com.android.i18n.system;

import libcore.api.IntraCoreApi;

/**
 * Provides hooks for {@link dalvik.system.AppSpecializationHooks} to call into this class to
 * specialize ICU in an app process.
 *
 * @hide
 */
@IntraCoreApi
public class AppSpecializationHooks {

    /** All methods are static, no need to instantiate. */
    private AppSpecializationHooks() {}

    /**
     * This is a good place to change system properties / clear cache due to an app compat change
     * before an app starts. It's called by
     * {@link dalvik.system.AppSpecializationHooks#handleCompatChangesBeforeBindingApplication()}.
     *
     * @hide
     */
    @IntraCoreApi
    public static void handleCompatChangesBeforeBindingApplication() {
        ZygoteHooks.handleCompatChangesBeforeBindingApplication();
    }
}
