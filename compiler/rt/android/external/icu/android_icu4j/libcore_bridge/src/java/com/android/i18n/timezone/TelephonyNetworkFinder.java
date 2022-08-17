/*
 * Copyright (C) 2019 The Android Open Source Project
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

import com.android.i18n.timezone.TelephonyNetwork.MccMnc;
import com.android.i18n.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * A class that can find telephony network information loaded via {@link TelephonyLookup}.
 *
 * @hide
 */
@libcore.api.CorePlatformApi
public final class TelephonyNetworkFinder {

    private final Map<MccMnc, TelephonyNetwork> networksMap;
    private final List<TelephonyNetwork> networksList;

    public static TelephonyNetworkFinder create(List<TelephonyNetwork> networksList) {
        Set<String> validCountryIsoCodes = new HashSet<>();
        for (String validCountryIsoCode : Locale.getISOCountries()) {
            validCountryIsoCodes.add(normalizeCountryIso(validCountryIsoCode));
        }

        Map<MccMnc, TelephonyNetwork> networksMap = new HashMap<>();
        for (TelephonyNetwork network : networksList) {
            if (!validCountryIsoCodes.contains(network.getCountryIsoCode())) {
                Log.w("Unrecognized country code: " + network.getCountryIsoCode()
                        + " for telephony network=" + network);
            }

            MccMnc mccMnc = network.getMccMnc();
            TelephonyNetwork existingEntry = networksMap.put(mccMnc, network);
            if (existingEntry != null) {
                Log.w("Duplicate MccMnc detected for " + mccMnc
                        + ". New entry=" + network + " replacing previous entry.");
            }
        }
        return new TelephonyNetworkFinder(
                Collections.unmodifiableList(new ArrayList<>(networksList)),
                networksMap);
    }

    private TelephonyNetworkFinder(List<TelephonyNetwork> networksList,
            Map<MccMnc, TelephonyNetwork> networksMap) {
        this.networksList = networksList;
        this.networksMap = networksMap;
    }

    /**
     * Returns information held about a specific MCC + MNC combination. It is expected for this
     * method to return {@code null}. Only known, unusual networks will typically have information
     * returned, e.g. if they operate in countries other than the one suggested by their MCC.
     */
    @libcore.api.CorePlatformApi
    public TelephonyNetwork findNetworkByMccMnc(String mcc, String mnc) {
        return networksMap.get(new MccMnc(mcc, mnc));
    }

    // @VisibleForTesting
    public List<TelephonyNetwork> getAll() {
        return networksList;
    }
}
