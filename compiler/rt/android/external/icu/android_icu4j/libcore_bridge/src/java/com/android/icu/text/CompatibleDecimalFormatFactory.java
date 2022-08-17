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

import android.icu.impl.number.DecimalFormatProperties;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;

import libcore.api.IntraCoreApi;

/**
 * Factory class to create {@link DecimalFormat} instances compatible with
 * {@link java.text.DecimalFormat}.
 *
 * @hide
 */
@IntraCoreApi
public class CompatibleDecimalFormatFactory {

    /** All methods are static, no need to instantiate. */
    private CompatibleDecimalFormatFactory() {}

    /**
     * Creates an instance compatible with {@link java.text.DecimalFormat}.
     *
     * WARNING: Do not call the following methods, and otherwise the internal states for the
     * compatibility could be disrupted.
     *   - {@link DecimalFormat#setParseStrict(boolean)}
     *
     * @hide
     */
    @IntraCoreApi
    public static DecimalFormat create(String pattern, DecimalFormatSymbols dfs) {
        DecimalFormat df = new DecimalFormat(pattern, dfs);
        df.setParseStrictMode(DecimalFormatProperties.ParseMode.JAVA_COMPATIBILITY);
        return df;
    }
}
