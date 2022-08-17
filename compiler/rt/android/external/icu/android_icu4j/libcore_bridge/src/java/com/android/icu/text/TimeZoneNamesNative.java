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

package com.android.icu.text;

import java.util.Locale;
import libcore.api.IntraCoreApi;
import libcore.util.NonNull;

/**
 * Provide functionalities implemented by ICU4C for {@link libcore.icu.TimeZoneNames} and
 * the implementation should be faster than the public APIs provided by
 * {@link android.icu.text.TimeZoneNames}.
 *
 * @hide
 */
@IntraCoreApi
public final class TimeZoneNamesNative {

    private TimeZoneNamesNative() {}

    /**
     * For each tzId passed returns a list of arrays of five elements: Olson name, long name,
     * short name, long DST name and short DST name.
     *
     * @param locale Locale object
     * @param tzIds  List of timezone ids
     * @see libcore.icu.TimeZoneNames.ZoneStringsCache#create(java.util.Locale)
     * @return List of [Time zone id, long, short, long DST, short DST] for each id from
     * {@code tzIds}. Any of these value except Olson name can be null.
     *
     * @hide
     */
    @IntraCoreApi
    public static String[][] getFilledZoneStrings(@NonNull Locale locale, @NonNull String[] tzIds) {
        String[][] result = new String[tzIds.length][5];
        for (int i = 0; i < tzIds.length; ++i) {
            result[i][0] = tzIds[i];
        }
        fillZoneStringsNative(locale.toLanguageTag(), result);
        return result;
    }

    private static native void fillZoneStringsNative(String locale, String[][] result);
}
