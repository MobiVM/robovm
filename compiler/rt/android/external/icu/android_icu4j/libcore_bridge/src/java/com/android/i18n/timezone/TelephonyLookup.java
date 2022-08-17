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

import static com.android.i18n.timezone.XmlUtils.checkOnEndTag;
import static com.android.i18n.timezone.XmlUtils.consumeUntilEndTag;
import static com.android.i18n.timezone.XmlUtils.findNextStartTagOrEndTagNoRecurse;
import static com.android.i18n.timezone.XmlUtils.findNextStartTagOrThrowNoRecurse;
import static com.android.i18n.timezone.XmlUtils.normalizeCountryIso;

import com.android.i18n.timezone.TelephonyNetwork.MccMnc;
import com.android.i18n.timezone.XmlUtils.ReaderSupplier;
import com.android.i18n.util.Log;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that can find time zone-related information about telephony networks by loading data from
 * the telephonylookup.xml file.
 *
 * @hide
 */
@libcore.api.CorePlatformApi
public final class TelephonyLookup {

    // VisibleForTesting
    public static final String TELEPHONYLOOKUP_FILE_NAME = "telephonylookup.xml";

    // Root element. e.g. <telephony_lookup>
    private static final String TELEPHONY_LOOKUP_ELEMENT = "telephony_lookup";

    // Networks section. e.g. <networks>
    private static final String NETWORKS_ELEMENT = "networks";

    // Network data. e.g.
    // <network mcc="310" mnc="370" country="gu">
    private static final String NETWORK_ELEMENT = "network";
    private static final String MOBILE_COUNTRY_CODE_ATTRIBUTE = "mcc";
    private static final String MOBILE_NETWORK_CODE_ATTRIBUTE = "mnc";
    // This is the ISO 3166 alpha-2 code (in lower case).
    private static final String COUNTRY_ISO_CODE_ATTRIBUTE = "country";

    private static TelephonyLookup instance;

    private final ReaderSupplier xmlSource;

    private TelephonyLookup(ReaderSupplier xmlSource) {
        this.xmlSource = xmlSource;
    }

    /**
     * Obtains an instance for use when resolving networks. This method handles using the correct
     * file when there are several to choose from. This method never returns {@code null}. No
     * in-depth validation is performed on the file content, see {@link #validate()}.
     */
    @libcore.api.CorePlatformApi
    public static TelephonyLookup getInstance() {
        synchronized(TelephonyLookup.class) {
            if (instance == null) {
                String[] telephonyLookupFilePaths =
                        TimeZoneDataFiles.getTimeZoneFilePaths(TELEPHONYLOOKUP_FILE_NAME);
                instance = createInstanceWithFallback(telephonyLookupFilePaths);
            }
        }
        return instance;
    }

    // VisibleForTesting
    public static TelephonyLookup createInstanceWithFallback(String... telephonyLookupFilePaths) {
        IOException lastException = null;
        for (String tzLookupFilePath : telephonyLookupFilePaths) {
            try {
                // We assume that any file in /data was validated before install, and the system
                // file was validated before the device shipped. Therefore, we do not pay the
                // validation cost here.
                return createInstance(tzLookupFilePath);
            } catch (IOException e) {
                // There's expected to be two files, and it's normal for the first file not to
                // exist so we don't log, but keep the lastException so we can log it if there
                // are no valid files available.
                if (lastException != null) {
                    e.addSuppressed(lastException);
                }
                lastException = e;
            }
        }

        Log.e("No valid file found in set: " + Arrays.toString(telephonyLookupFilePaths)
                + " Printing exceptions and falling back to empty map.", lastException);
        return createInstanceForTests("<telephony_lookup><networks /></telephony_lookup>");
    }

    /**
     * Obtains an instance using a specific data file, throwing an IOException if the file does not
     * exist or is not readable. This method never returns {@code null}. No in-depth validation is
     * performed on the file content, see {@link #validate()}.
     */
    @libcore.api.CorePlatformApi
    public static TelephonyLookup createInstance(String path) throws IOException {
        ReaderSupplier xmlSupplier = ReaderSupplier.forFile(path, StandardCharsets.UTF_8);
        return new TelephonyLookup(xmlSupplier);
    }

    /** Used to create an instance using an in-memory XML String instead of a file. */
    // VisibleForTesting
    public static TelephonyLookup createInstanceForTests(String xml) {
        return new TelephonyLookup(ReaderSupplier.forString(xml));
    }

    /**
     * Parses the data file, throws an exception if it is invalid or cannot be read.
     */
    @libcore.api.CorePlatformApi
    public void validate() throws IOException {
        try {
            processXml(new TelephonyNetworkValidator());
        } catch (XmlPullParserException e) {
            throw new IOException("Parsing error", e);
        }
    }

    /**
     * Loads all the network &lt;-&gt; country mapping data into memory. This method can return
     * {@code null} in the event of an error while reading the underlying data files.
     */
    @libcore.api.CorePlatformApi
    public TelephonyNetworkFinder getTelephonyNetworkFinder() {
        TelephonyNetworksExtractor extractor = new TelephonyNetworksExtractor();
        try {
            processXml(extractor);

            return extractor.getTelephonyNetworkFinder();
        } catch (XmlPullParserException | IOException e) {
            Log.w("Error reading telephony networks", e);
            return null;
        }
    }

    /**
     * Processes the XML, applying the {@link TelephonyNetworkProcessor} to the &lt;countryzones&gt;
     * element. Processing can terminate early if {@link TelephonyNetworkProcessor
     * #processNetwork(int, int, String, String)} it throws an exception.
     */
    private void processXml(TelephonyNetworkProcessor processor)
            throws XmlPullParserException, IOException {
        try (Reader reader = xmlSource.get()) {
            XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
            xmlPullParserFactory.setNamespaceAware(false);

            XmlPullParser parser = xmlPullParserFactory.newPullParser();
            parser.setInput(reader);

            /*
             * The expected XML structure is:
             * <telephony_lookup>
             *   <networks>
             *     <network mcc="123" mnc="456" country="ab"/>
             *     <network mcc="123" mnc="567" country="cd"/>
             *   </networks>
             * </telephony_lookup>
             */

            findNextStartTagOrThrowNoRecurse(parser, TELEPHONY_LOOKUP_ELEMENT);

            // There is only one expected sub-element <telephony_lookup> in the format currently,
            // skip over anything before it.
            findNextStartTagOrThrowNoRecurse(parser, NETWORKS_ELEMENT);

            processNetworks(parser, processor);

            // Make sure we are on the </networks> tag.
            checkOnEndTag(parser, NETWORKS_ELEMENT);

            // Advance to the next event.
            parser.next();

            // Skip anything until </telephony_lookup>, and make sure the file is not truncated and
            // we can find the end.
            consumeUntilEndTag(parser, TELEPHONY_LOOKUP_ELEMENT);

            // Make sure we are on the </telephony_lookup> tag.
            checkOnEndTag(parser, TELEPHONY_LOOKUP_ELEMENT);
        }
    }

    private static void processNetworks(XmlPullParser parser,
            TelephonyNetworkProcessor processor) throws IOException, XmlPullParserException {

        // Skip over any unexpected elements and process <network> elements.
        while (findNextStartTagOrEndTagNoRecurse(parser, NETWORK_ELEMENT)) {
            String mcc = parser.getAttributeValue(
                    null /* namespace */, MOBILE_COUNTRY_CODE_ATTRIBUTE);
            if (mcc == null) {
                throw new XmlPullParserException(
                        "Unable to find mcc: " + parser.getPositionDescription());
            }

            String mnc = parser.getAttributeValue(
                    null /* namespace */, MOBILE_NETWORK_CODE_ATTRIBUTE);
            if (mnc == null) {
                throw new XmlPullParserException(
                        "Unable to find mnc: " + parser.getPositionDescription());
            }

            String countryCode =
                    parser.getAttributeValue(null /* namespace */, COUNTRY_ISO_CODE_ATTRIBUTE);
            if (countryCode == null) {
                throw new XmlPullParserException(
                        "Unable to find country: " + parser.getPositionDescription());
            }

            String debugInfo = parser.getPositionDescription();
            processor.processNetwork(mcc, mnc, countryCode, debugInfo);
            // Advance to the next event.
            parser.next();

            // Skip anything until </network>.
            consumeUntilEndTag(parser, NETWORK_ELEMENT);
        }
    }

    /**
     * Processes &lt;network&gt; data.
     */
    private interface TelephonyNetworkProcessor {

        boolean CONTINUE = true;
        boolean HALT = false;

        /**
         * Process network data. Problems with the data are reported as an exception.
         */
        void processNetwork(String mcc, String mnc, String countryIso, String debugInfo)
                throws XmlPullParserException;
    }

    /**
     * Validates &lt;network&gt; elements. Intended to be used before a proposed installation of new
     * data. To be valid the MCC + MNC combination must generate a unique ID, country ISO code must
     * be normalized.
     */
    private static class TelephonyNetworkValidator implements TelephonyNetworkProcessor {

        private final Set<MccMnc> knownMccMncs = new HashSet<>();

        @Override
        public void processNetwork(String mcc, String mnc, String countryIso, String debugInfo)
                throws XmlPullParserException {
            if (mcc == null || mcc.length() != 3 || !isAsciiNumeric(mcc)) {
                throw new XmlPullParserException(
                        "MCC is not valid: mcc=" + mcc + " at " + debugInfo);
            }

            if (mnc == null || !(mnc.length() == 2 || mnc.length() == 3) || !isAsciiNumeric(mnc)) {
                throw new XmlPullParserException(
                        "MNC is not valid: mnc=" + mnc + " at " + debugInfo);
            }

            if (!normalizeCountryIso(countryIso).equals(countryIso)) {
                throw new XmlPullParserException("Country code: " + countryIso
                        + " is not normalized at " + debugInfo);
            }

            MccMnc mccMnc = new MccMnc(mcc, mnc);
            if (knownMccMncs.contains(mccMnc)) {
                throw new XmlPullParserException("Second entry for MCC + MNC: " + mccMnc
                        + " at " + debugInfo);
            }
            knownMccMncs.add(mccMnc);
        }

        private static boolean isAsciiNumeric(String string) {
            for (int i = 0; i < string.length(); i++) {
                char character = string.charAt(i);
                if (character < '0' || character > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Reads all telephony network time zone information into memory and makes it available as a
     * {@link TelephonyNetworkFinder}.
     */
    private static class TelephonyNetworksExtractor implements TelephonyNetworkProcessor {
        private List<TelephonyNetwork> networksList = new ArrayList<>(10 /* default */);

        @Override
        public void processNetwork(String mcc, String mnc, String countryIso, String debugInfo)
                throws XmlPullParserException {
            TelephonyNetwork network = TelephonyNetwork.create(mcc, mnc, countryIso);
            networksList.add(network);
        }

        TelephonyNetworkFinder getTelephonyNetworkFinder() {
            return TelephonyNetworkFinder.create(networksList);
        }
    }
}
