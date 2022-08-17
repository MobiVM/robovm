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

import android.icu.text.TimeZoneNames;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;

import libcore.api.IntraCoreApi;
import libcore.util.NonNull;
import libcore.util.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/**
 * Provide extra functionalities on top of {@link TimeZoneNames} public APIs.
 *
 * @hide
 */
@IntraCoreApi
public class ExtendedTimeZoneNames {

    private static final Set<TimeZoneNames.NameType> DST_NAME_TYPES =
            Collections.unmodifiableSet(
                    EnumSet.of(
                            TimeZoneNames.NameType.LONG_DAYLIGHT,
                            TimeZoneNames.NameType.SHORT_DAYLIGHT));

    private static final EnumSet<TimeZoneNames.NameType> STANDARD_AND_DST_TYPES =
            EnumSet.of(
                    TimeZoneNames.NameType.SHORT_STANDARD,
                    TimeZoneNames.NameType.LONG_STANDARD,
                    TimeZoneNames.NameType.SHORT_DAYLIGHT,
                    TimeZoneNames.NameType.LONG_DAYLIGHT);

    private final ULocale locale;
    private final TimeZoneNames timeZoneNames;
/**
     * A class representing the return result of {@link #matchName(CharSequence, int, String)}
     *
     * @hide
     */
    @IntraCoreApi
    public static final class Match {

        private final int matchLength;
        private final @NonNull String tzId;
        private final boolean isDst;

        private Match(int matchLength, @NonNull String tzId, boolean isDst) {
            this.matchLength = matchLength;
            this.tzId = tzId;
            this.isDst = isDst;
        }

        /**
         * Returns the number of chars in the matched name.
         *
         * @hide
         */
        @IntraCoreApi
        public int getMatchLength() {
            return matchLength;
        }

        /**
         * Returns the time zone id associated with the matched name.
         *
         * @hide
         */
        @IntraCoreApi
        public @NonNull String getTzId() {
            return tzId;
        }

        /**
         * Returns true if the matched name is a display name for daylight saving time. For example,
         * returns true for "Pacific Daylight Time", but false for "Pacific Standard Time".
         *
         * @hide
         */
        @IntraCoreApi
        public boolean isDst() {
            return isDst;
        }
    }

    private ExtendedTimeZoneNames(ULocale locale) {
        this.locale = locale;
        this.timeZoneNames = TimeZoneNames.getInstance(locale);
    }

    /**
     * Returns an instance of {@link ExtendedTimeZoneNames}.
     *
     * @hide
     */
    @IntraCoreApi
    public static @NonNull ExtendedTimeZoneNames getInstance(@NonNull ULocale locale) {
        return new ExtendedTimeZoneNames(locale);
    }

    /**
     * Returns the underlying {@link TimeZoneNames} instance.
     *
     * @hide
     */
    @IntraCoreApi
    public @NonNull TimeZoneNames getTimeZoneNames() {
        return timeZoneNames;
    }

    /**
     * Returns {@link Match} if a time zone name in ICU can be matched against the input
     * CharSequence {@code s}.
     * The best match is found by the following principles:
     * <ul>
     * <li>Length of the matched name. Longest name matched to the given {@code s} has the
     * highest priority.</li>
     * <li>The current time zone and meta zones possible in the current country have higher
     * priority than other zones.</li>
     * <li>If only meta zones are matched, the country/region in the locale is used to select
     * a reference time zone. For example, if the name is "Pacific Standard Time" and the country
     * is US, America/Los_Angeles is returned.</li>
     * </ul>
     *
     * @param text input string to be matched against time zone names in ICU
     * @param start the begin index in the CharSequence {@code s}
     * @param currentTzId the time zone ID prioritized to be matched if multiple time zone IDs can
     *                    be matched and this is one of the matched IDs.
     * @return null if no match is found
     *
     * @hide
     */
    @IntraCoreApi
    public @Nullable Match matchName(@NonNull CharSequence text, int start,
            @NonNull String currentTzId) {
        currentTzId = TimeZone.getCanonicalID(currentTzId);

        Collection<TimeZoneNames.MatchInfo> matchedInfos =
                timeZoneNames.find(text, start, STANDARD_AND_DST_TYPES);

        if (matchedInfos.isEmpty()) {
            return null;
        }

        List<TimeZoneNames.MatchInfo> maxLengthMatchInfos = new ArrayList<>();
        int maxMatchedInfoLength = 0;

        for (TimeZoneNames.MatchInfo matchInfo : matchedInfos) {
            if (matchInfo.matchLength() > maxMatchedInfoLength) {
                maxMatchedInfoLength = matchInfo.matchLength();
                maxLengthMatchInfos.clear();
            }

            if (matchInfo.matchLength() >= maxMatchedInfoLength) {
                maxLengthMatchInfos.add(matchInfo);
            }
        }

        Set<String> metaZonesInCurrentZone = timeZoneNames.getAvailableMetaZoneIDs(currentTzId);

        TimeZoneNames.MatchInfo tzMatchInfo = null;

        for (TimeZoneNames.MatchInfo matchInfo : maxLengthMatchInfos) {
            if (matchInfo.tzID() != null && matchInfo.tzID().equals(currentTzId)) {
                return matchedTimeZone(matchInfo.tzID(), matchInfo);
            }
            if (matchInfo.mzID() != null && metaZonesInCurrentZone.contains(matchInfo.mzID())) {
                return matchedTimeZone(currentTzId, matchInfo);
            }

            if (matchInfo.tzID() != null) {
                tzMatchInfo = matchInfo;
            }
        }

        if (tzMatchInfo != null) {
            return matchedTimeZone(tzMatchInfo.tzID(), tzMatchInfo);
        }

        String region = locale.getCountry();
        if (region == null || region.isEmpty()) {
            // An UN M49 code to represent the world. See TimeZoneNames#getReferenceZoneID().
            region = "001";
        }

        for (TimeZoneNames.MatchInfo matchInfo : maxLengthMatchInfos) {
            if (matchInfo.mzID() != null) {
                String timeZoneId = timeZoneNames.getReferenceZoneID(matchInfo.mzID(), region);
                if (timeZoneId != null) {
                    return matchedTimeZone(timeZoneId, matchInfo);
                }
            }
        }

        return null;
    }

    private static Match matchedTimeZone(
            String timeZoneId, TimeZoneNames.MatchInfo matchInfo) {
        return new Match(
                matchInfo.matchLength(),
                timeZoneId,
                DST_NAME_TYPES.contains(matchInfo.nameType()));

    }

}
