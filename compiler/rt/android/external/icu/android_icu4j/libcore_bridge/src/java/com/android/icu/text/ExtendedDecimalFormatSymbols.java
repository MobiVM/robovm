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

import android.icu.text.DecimalFormatSymbols;
import android.icu.text.NumberingSystem;
import android.icu.util.ULocale;

import libcore.api.IntraCoreApi;

/**
 * Provide extra functionalities on top of {@link DecimalFormatSymbols} public APIs.
 *
 * @hide
 */
@IntraCoreApi
public class ExtendedDecimalFormatSymbols {

    private final ULocale uLocale;
    private final NumberingSystem numberingSystem;

    private ExtendedDecimalFormatSymbols(ULocale uLocale, NumberingSystem ns) {
        this.uLocale = uLocale;
        this.numberingSystem = ns;
    }

    /**
     * Returns an instance of {@link ExtendedDecimalFormatSymbols}.
     *
     * @hide
     */
    @IntraCoreApi
    public static ExtendedDecimalFormatSymbols getInstance(ULocale uLocale, NumberingSystem ns) {
        return new ExtendedDecimalFormatSymbols(uLocale, ns);
    }

    // Note that this class has no method to return an ICU android.icu.text.DecimalFormatSymbols
    // instance because it's not needed by libcore. But we can add the method in the future.
    // public DecimalFormatSymbols getDecimalFormatSymbols() { ... }

    /**
     * Returns the localized pattern separator. Note that the public API
     * {@link DecimalFormatSymbols#getPatternSeparator()} does not localize pattern separator.
     *
     * @hide
     */
    @IntraCoreApi
    public String getLocalizedPatternSeparator() {
        return DecimalFormatSymbols.getLocalizedPatternSeparator(uLocale, numberingSystem);
    }
}
