/*
 * Copyright (C) 2008 The Android Open Source Project
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

package com.android.icu.util;

public class Icu4cMetadata {

    /** Returns the TZData version as reported by ICU4C. */
    public static native String getTzdbVersion();

    /**
     * Returns the version of the CLDR data in use, such as "22.1.1".
     */
    public static native String getCldrVersion();

    /**
     * Returns the icu4c version in use, such as "50.1.1".
     */
    public static native String getIcuVersion();

    /**
     * Returns the Unicode version our ICU supports, such as "6.2".
     */
    public static native String getUnicodeVersion();

}
