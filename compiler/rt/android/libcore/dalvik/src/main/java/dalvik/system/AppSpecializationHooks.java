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

package dalvik.system;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;

/**
 * Used by frameworks to specialize libcore in an app process.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public class AppSpecializationHooks {

    private AppSpecializationHooks() {}

    /**
     * Called in {@link android.app.ActivityThread}, but before binding the application. This method
     * should be called only after {@link android.compat.Compatibility#setCallbacks}
     * has been invoked to handle the app compat queries from
     * {@link android.compat.Compatibility#isChangeEnabled(long)}.
     *
     * This is a good place to change system properties / clear cache due to an app compat change
     * before an app starts.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void handleCompatChangesBeforeBindingApplication() {
        com.android.i18n.system.AppSpecializationHooks
                .handleCompatChangesBeforeBindingApplication();
    }
}
