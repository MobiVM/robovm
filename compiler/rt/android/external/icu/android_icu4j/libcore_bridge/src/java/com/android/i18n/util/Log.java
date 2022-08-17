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

package com.android.i18n.util;

/**
 * Log utility class only used by i18n module.
 *
 * @hide
 */
public class Log {
    /** All methods are static, no need to instantiate. */
    private Log() {}

    // liblog's log priorities from android_LogPriority in log.h.
    private static int VERBOSE = 2;
    private static int DEBUG = 3;
    private static int INFO = 4;
    private static int WARN = 5;
    private static int ERROR = 6;
    private static int FATAL = 7;

    public static void e(String msg, Throwable e) {
        log(ERROR, msg, e);
    }
    public static void w(String msg) {
        w(msg, null);
    }

    public static void w(String msg, Throwable e) {
        log(WARN, msg, e);
    }

    private static native void log(int priority, String msg, Throwable th);
}
