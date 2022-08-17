/*
 * Copyright (C) 2009 The Android Open Source Project
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

import android.icu.impl.ICUData;
import android.icu.impl.ICUResourceBundle;
import android.icu.text.BreakIterator;
import android.icu.text.CaseMap;
import android.icu.util.UResourceBundle;
import java.util.Locale;
import java.util.MissingResourceException;

/**
 * This class is used by android.webkit.DateSorter.
 */
@libcore.api.CorePlatformApi
public class DateSorterBridge {
    private final String yesterday; // "Yesterday".
    private final String today; // "Today".

    /**
     * @throws AssertionError for the legacy behavior when the ICU data is missing
     */
    @libcore.api.CorePlatformApi
    public static DateSorterBridge createInstance(Locale locale) throws AssertionError {
        return new DateSorterBridge(locale);
    }

    private DateSorterBridge(Locale locale) throws AssertionError {
        String todayStr;
        String yesterdayStr;
        try {
            ICUResourceBundle rb = (ICUResourceBundle) UResourceBundle.getBundleInstance(
                ICUData.ICU_BASE_NAME, locale);
            rb = rb.getWithFallback("fields/day/relative");
            // Enable fallback because a resource bundle could contain 1 only, not -1.
            yesterdayStr = rb.getStringWithFallback("-1");
            todayStr = rb.getStringWithFallback("0");
        } catch (MissingResourceException e) {
            // Preserve legacy behavior throwing AssertionError for missing resource.
            throw new AssertionError(e);
        }

        BreakIterator breakIterator = BreakIterator.getSentenceInstance(locale);

        CaseMap.Title caseMap = CaseMap.toTitle().noLowercase().noBreakAdjustment();
        yesterday = caseMap.apply(locale, breakIterator, yesterdayStr);
        today = caseMap.apply(locale, breakIterator, todayStr);
    }

    @libcore.api.CorePlatformApi
    public String getYesterday() {
        return yesterday;
    }

    @libcore.api.CorePlatformApi
    public String getToday() {
        return today;
    }
}
