/*
 * Copyright (C) 2018 The Android Open Source Project
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

package com.android.i18n.timezone;

import static com.android.i18n.timezone.XmlUtils.normalizeCountryIso;

import com.android.i18n.timezone.CountryTimeZones.TimeZoneMapping;
import libcore.util.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An in-memory representation of country &lt;-&gt; time zone mapping data.
 * @hide
 */
@libcore.api.CorePlatformApi
public final class CountryZonesFinder {

    private final List<CountryTimeZones> countryTimeZonesList;

    CountryZonesFinder(List<CountryTimeZones> countryTimeZonesList) {
        this.countryTimeZonesList = new ArrayList<>(countryTimeZonesList);
    }

    // VisibleForTesting
    public static CountryZonesFinder createForTests(List<CountryTimeZones> countryTimeZonesList) {
        return new CountryZonesFinder(countryTimeZonesList);
    }

    /**
     * Returns an immutable list of country ISO codes with time zones. The codes can be passed to
     * {@link #lookupCountryTimeZones(String)} and similar methods.
     */
    @libcore.api.CorePlatformApi
    public List<String> lookupAllCountryIsoCodes() {
        List<String> isoCodes = new ArrayList<>(countryTimeZonesList.size());
        for (CountryTimeZones countryTimeZones : countryTimeZonesList) {
            isoCodes.add(countryTimeZones.getCountryIso());
        }
        return Collections.unmodifiableList(isoCodes);
    }

    /**
     * Returns an immutable list of {@link CountryTimeZones} for countries that use the specified
     * time zone. An exact, case-sensitive match is performed on the zone ID. Search is done
     * over currently used time zone IDs and also over no longer used deprecated(alternative) IDs.
     * This method never returns null and will usually return a list containing a single element.
     * It can return an empty list if the zone ID is not recognized or it is not associated with a
     * country.
     */
    @libcore.api.CorePlatformApi
    public List<CountryTimeZones> lookupCountryTimeZonesForZoneId(String zoneId) {
        List<CountryTimeZones> matches = new ArrayList<>(2);

        // This implementation is deliberately flexible about supporting alternative (newer or
        // legacy) IDs, e.g. zoneId might have come from the device's persist.sys.timezone setting,
        // which may have been set before a tzdb upgrade, so we look at alternative IDs and accept
        // them too. Most of the ~250 countries have a small number of zones (most have 1-2, the max
        // is ~30), and most zones do not have an alternative ID, those that do have 1-2.
        for (CountryTimeZones countryTimeZones : countryTimeZonesList) {
            boolean match = false;
            // We get all time zone mappings, even those with a notafter= value to ensure the most
            // complete search.
            List<TimeZoneMapping> countryTimeZoneMappings = countryTimeZones.getTimeZoneMappings();
            for (TimeZoneMapping timeZoneMapping : countryTimeZoneMappings) {
                if (timeZoneMapping.getTimeZoneId().equals(zoneId)
                        || timeZoneMapping.getAlternativeIds().contains(zoneId)) {
                    match = true;
                    break;
                }
            }
            if (match) {
                matches.add(countryTimeZones);
            }
        }
        return Collections.unmodifiableList(matches);
    }

    /**
     * Returns a {@link CountryTimeZones} object associated with the specified country code. If one
     * cannot be found this method returns {@code null}.
     */
    @libcore.api.CorePlatformApi
    public CountryTimeZones lookupCountryTimeZones(String countryIso) {
        String normalizedCountryIso = normalizeCountryIso(countryIso);
        for (CountryTimeZones countryTimeZones : countryTimeZonesList) {
            if (countryTimeZones.getCountryIso().equals(normalizedCountryIso)) {
                return countryTimeZones;
            }
        }
        return null;
    }

    /**
     * Returns a canonical time zone ID for the {@code timeZoneId} specified. It is intended for use
     * when behavioral equivalence of time zones needs to be determined.
     *
     * <p>When a time zone ID is returned, it is guaranteed to have the same offset / daylight
     * savings behavior as the argument, but it might be used in a different country and could
     * have different I18N properties like display name. The original {@code timeZoneId} will
     * often be returned.
     *
     * <p>If {@code timeZoneId} is unknown or not associated with a country, {@code null} is
     * returned. e.g. time zones such as Etc/GMT+-XX.
     *
     * This method behavior is based on tzlookup.xml file and works with Olson IDs attached to
     * countries, unlike {@link android.icu.util.TimeZone} which works with wider set of arguments.
     */
    @libcore.api.CorePlatformApi
    @Nullable
    public String findCanonicalTimeZoneId(String timeZoneId) {
        for (CountryTimeZones countryTimeZones : countryTimeZonesList) {

            // notafter is ignored as timeZoneId might be deprecated a while ago
            List<TimeZoneMapping> countryTimeZoneMappings = countryTimeZones.getTimeZoneMappings();
            for (TimeZoneMapping timeZoneMapping : countryTimeZoneMappings) {
                if (timeZoneMapping.getTimeZoneId().equals(timeZoneId)
                        || timeZoneMapping.getAlternativeIds().contains(timeZoneId)) {
                    return timeZoneMapping.getTimeZoneId();
                }
            }
        }

        return null;
    }
}
