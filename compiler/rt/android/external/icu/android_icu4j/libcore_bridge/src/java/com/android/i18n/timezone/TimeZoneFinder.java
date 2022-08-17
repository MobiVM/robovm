/*
 * Copyright (C) 2017 The Android Open Source Project
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
import static com.android.i18n.timezone.XmlUtils.consumeText;
import static com.android.i18n.timezone.XmlUtils.consumeUntilEndTag;
import static com.android.i18n.timezone.XmlUtils.findNextStartTagOrEndTagNoRecurse;
import static com.android.i18n.timezone.XmlUtils.findNextStartTagOrThrowNoRecurse;
import static com.android.i18n.timezone.XmlUtils.normalizeCountryIso;
import static com.android.i18n.timezone.XmlUtils.parseBooleanAttribute;
import static com.android.i18n.timezone.XmlUtils.parseLongAttribute;
import static com.android.i18n.timezone.XmlUtils.parseStringListAttribute;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.android.i18n.timezone.CountryTimeZones.TimeZoneMapping;
import com.android.i18n.timezone.XmlUtils.ReaderSupplier;
import com.android.i18n.util.Log;

/**
 * A class that can find matching time zones by loading data from the tzlookup.xml file.
 * @hide
 */
@libcore.api.CorePlatformApi
public final class TimeZoneFinder {

    public static final String TZLOOKUP_FILE_NAME = "tzlookup.xml";

    // Root element. e.g. <timezones ianaversion="2017b">
    private static final String TIMEZONES_ELEMENT = "timezones";
    private static final String IANA_VERSION_ATTRIBUTE = "ianaversion";

    // Country zones section. e.g. <countryzones>
    private static final String COUNTRY_ZONES_ELEMENT = "countryzones";

    // Country data. e.g.
    // <country code="gb" default="Europe/London" defaultBoost="y" everutc="y">
    private static final String COUNTRY_ELEMENT = "country";
    private static final String COUNTRY_CODE_ATTRIBUTE = "code";
    private static final String DEFAULT_TIME_ZONE_ID_ATTRIBUTE = "default";
    private static final String DEFAULT_TIME_ZONE_BOOST_ATTRIBUTE = "defaultBoost";
    private static final String EVER_USES_UTC_ATTRIBUTE = "everutc";

    // Country -> Time zone mapping. e.g. <id>ZoneId</id>, <id picker="n">ZoneId</id>,
    // <id notafter={timestamp} alts="{alternative ids}">ZoneId</id>
    // The default for the picker attribute when unspecified is "y".
    // The notafter attribute is optional. It specifies a timestamp (time in milliseconds from Unix
    // epoch start) after which the zone is not (effectively) in use. If unspecified the zone is in
    // use forever.
    // The alts attribute is optional. It contains a comma-separated String of alternative IDs that
    // are exact synonyms for the ZoneId.
    private static final String ZONE_ID_ELEMENT = "id";
    private static final String ZONE_SHOW_IN_PICKER_ATTRIBUTE = "picker";
    private static final String ZONE_NOT_USED_AFTER_ATTRIBUTE = "notafter";
    private static final String ZONE_ALTERNATIVE_IDS_ATTRIBUTE = "alts";

    private static TimeZoneFinder instance;

    private final ReaderSupplier xmlSource;

    // Cached field for the last country looked up.
    private CountryTimeZones lastCountryTimeZones;

    private TimeZoneFinder(ReaderSupplier xmlSource) {
        this.xmlSource = xmlSource;
    }

    /**
     * Obtains an instance for use when resolving time zones. This method handles using the correct
     * file when there are several to choose from. This method never returns {@code null}. No
     * in-depth validation is performed on the file content, see {@link #validate()}.
     */
    @libcore.api.CorePlatformApi
    public static TimeZoneFinder getInstance() {
        synchronized(TimeZoneFinder.class) {
            if (instance == null) {
                String[] tzLookupFilePaths =
                        TimeZoneDataFiles.getTimeZoneFilePaths(TZLOOKUP_FILE_NAME);
                instance = createInstanceWithFallback(tzLookupFilePaths);
            }
        }
        return instance;
    }

    // VisibleForTesting
    public static TimeZoneFinder createInstanceWithFallback(String... tzLookupFilePaths) {
        IOException lastException = null;
        for (String tzLookupFilePath : tzLookupFilePaths) {
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

        Log.e("No valid file found in set: " + Arrays.toString(tzLookupFilePaths)
                + " Printing exceptions and falling back to empty map.", lastException);
        return createInstanceForTests("<timezones><countryzones /></timezones>");
    }

    /**
     * Obtains an instance using a specific data file, throwing an IOException if the file does not
     * exist or is not readable. This method never returns {@code null}. No in-depth validation is
     * performed on the file content, see {@link #validate()}.
     */
    @libcore.api.CorePlatformApi
    public static TimeZoneFinder createInstance(String path) throws IOException {
        ReaderSupplier xmlSupplier = ReaderSupplier.forFile(path, StandardCharsets.UTF_8);
        return new TimeZoneFinder(xmlSupplier);
    }

    /** Used to create an instance using an in-memory XML String instead of a file. */
    // VisibleForTesting
    public static TimeZoneFinder createInstanceForTests(String xml) {
        return new TimeZoneFinder(ReaderSupplier.forString(xml));
    }

    /**
     * Parses the data file, throws an exception if it is invalid or cannot be read.
     */
    @libcore.api.CorePlatformApi
    public void validate() throws IOException {
        try {
            processXml(new TimeZonesValidator());
        } catch (XmlPullParserException e) {
            throw new IOException("Parsing error", e);
        }
    }

    /**
     * Returns the IANA rules version associated with the data. If there is no version information
     * or there is a problem reading the file then {@code null} is returned.
     */
    @libcore.api.CorePlatformApi
    public String getIanaVersion() {
        IanaVersionExtractor ianaVersionExtractor = new IanaVersionExtractor();
        try {
            processXml(ianaVersionExtractor);
            return ianaVersionExtractor.getIanaVersion();
        } catch (XmlPullParserException | IOException e) {
            return null;
        }
    }

    /**
     * Loads all the country &lt;-&gt; time zone mapping data into memory. This method can return
     * {@code null} in the event of an error while reading the underlying data files.
     */
    @libcore.api.CorePlatformApi
    public CountryZonesFinder getCountryZonesFinder() {
        CountryZonesLookupExtractor extractor = new CountryZonesLookupExtractor();
        try {
            processXml(extractor);

            return extractor.getCountryZonesLookup();
        } catch (XmlPullParserException | IOException e) {
            Log.w("Error reading country zones ", e);
            return null;
        }
    }

    /**
     * Returns a {@link CountryTimeZones} object associated with the specified country code.
     * Caching is handled as needed. If the country code is not recognized or there is an error
     * during lookup this method can return null.
     */
    @libcore.api.CorePlatformApi
    public CountryTimeZones lookupCountryTimeZones(String countryIso) {
        synchronized (this) {
            if (lastCountryTimeZones != null
                    && lastCountryTimeZones.matchesCountryCode(countryIso)) {
                return lastCountryTimeZones;
            }
        }

        SelectiveCountryTimeZonesExtractor extractor =
                new SelectiveCountryTimeZonesExtractor(countryIso);
        try {
            processXml(extractor);

            CountryTimeZones countryTimeZones = extractor.getValidatedCountryTimeZones();
            if (countryTimeZones == null) {
                // None matched. Return the null but don't change the cached value.
                return null;
            }

            // Update the cached value.
            synchronized (this) {
                lastCountryTimeZones = countryTimeZones;
            }
            return countryTimeZones;
        } catch (XmlPullParserException | IOException e) {
            Log.w("Error reading country zones ", e);

            // Error - don't change the cached value.
            return null;
        }
    }

    /**
     * Processes the XML, applying the {@link TimeZonesProcessor} to the &lt;countryzones&gt;
     * element. Processing can terminate early if the {@link TimeZonesProcessor#processCountryZones(
     * String, String, boolean, boolean, List, String)} returns {@link TimeZonesProcessor#HALT} or
     * it throws an exception.
     */
    private void processXml(TimeZonesProcessor processor)
            throws XmlPullParserException, IOException {
        try (Reader reader = xmlSource.get()) {
            XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
            xmlPullParserFactory.setNamespaceAware(false);

            XmlPullParser parser = xmlPullParserFactory.newPullParser();
            parser.setInput(reader);

            /*
             * The expected XML structure is:
             * <timezones ianaversion="2017b">
             *   <countryzones>
             *     <country code="us" default="America/New_York">
             *       <id>America/New_York"</id>
             *       ...
             *       <id picker="n">America/Indiana/Vincennes</id>
             *       ...
             *       <id>America/Los_Angeles</id>
             *     </country>
             *     <country code="gb" default="Europe/London" defaultBoost="y">
             *       <id>Europe/London</id>
             *     </country>
             *   </countryzones>
             * </timezones>
             */

            findNextStartTagOrThrowNoRecurse(parser, TIMEZONES_ELEMENT);

            // We do not require the ianaversion attribute be present. It is metadata that helps
            // with versioning but is not required.
            String ianaVersion = parser.getAttributeValue(
                    null /* namespace */, IANA_VERSION_ATTRIBUTE);
            if (processor.processHeader(ianaVersion) == TimeZonesProcessor.HALT) {
                return;
            }

            // There is only one expected sub-element <countryzones> in the format currently, skip
            // over anything before it.
            findNextStartTagOrThrowNoRecurse(parser, COUNTRY_ZONES_ELEMENT);

            if (processCountryZones(parser, processor) == TimeZonesProcessor.HALT) {
                return;
            }

            // Make sure we are on the </countryzones> tag.
            checkOnEndTag(parser, COUNTRY_ZONES_ELEMENT);

            // Advance to the next tag.
            parser.next();

            // Skip anything until </timezones>, and make sure the file is not truncated and we can
            // find the end.
            consumeUntilEndTag(parser, TIMEZONES_ELEMENT);

            // Make sure we are on the </timezones> tag.
            checkOnEndTag(parser, TIMEZONES_ELEMENT);
        }
    }

    private static boolean processCountryZones(XmlPullParser parser,
            TimeZonesProcessor processor) throws IOException, XmlPullParserException {

        // Skip over any unexpected elements and process <country> elements.
        while (findNextStartTagOrEndTagNoRecurse(parser, COUNTRY_ELEMENT)) {
            String code = parser.getAttributeValue(
                    null /* namespace */, COUNTRY_CODE_ATTRIBUTE);
            if (code == null || code.isEmpty()) {
                throw new XmlPullParserException(
                        "Unable to find country code: " + parser.getPositionDescription());
            }

            String defaultTimeZoneId = parser.getAttributeValue(
                    null /* namespace */, DEFAULT_TIME_ZONE_ID_ATTRIBUTE);
            if (defaultTimeZoneId == null || defaultTimeZoneId.isEmpty()) {
                throw new XmlPullParserException("Unable to find default time zone ID: "
                        + parser.getPositionDescription());
            }

            boolean defaultTimeZoneBoost = parseBooleanAttribute(parser,
                    DEFAULT_TIME_ZONE_BOOST_ATTRIBUTE, false);

            Boolean everUsesUtc = parseBooleanAttribute(
                    parser, EVER_USES_UTC_ATTRIBUTE, null /* defaultValue */);
            if (everUsesUtc == null) {
                // There is no valid default: we require this to be specified.
                throw new XmlPullParserException(
                        "Unable to find UTC hint attribute (" + EVER_USES_UTC_ATTRIBUTE + "): "
                        + parser.getPositionDescription());
            }

            String debugInfo = parser.getPositionDescription();
            List<TimeZoneMapping> timeZoneMappings = parseTimeZoneMappings(parser);
            boolean result = processor.processCountryZones(code, defaultTimeZoneId,
                    defaultTimeZoneBoost, everUsesUtc, timeZoneMappings, debugInfo);
            if (result == TimeZonesProcessor.HALT) {
                return TimeZonesProcessor.HALT;
            }

            // Make sure we are on the </country> element.
            checkOnEndTag(parser, COUNTRY_ELEMENT);
        }

        return TimeZonesProcessor.CONTINUE;
    }

    private static List<TimeZoneMapping> parseTimeZoneMappings(XmlPullParser parser)
            throws IOException, XmlPullParserException {
        List<TimeZoneMapping> timeZoneMappings = new ArrayList<>();

        // Skip over any unexpected elements and process <id> elements.
        while (findNextStartTagOrEndTagNoRecurse(parser, ZONE_ID_ELEMENT)) {
            // The picker attribute is optional and defaulted to true.
            boolean showInPicker = parseBooleanAttribute(
                    parser, ZONE_SHOW_IN_PICKER_ATTRIBUTE, true /* defaultValue */);
            Long notUsedAfter = parseLongAttribute(
                    parser, ZONE_NOT_USED_AFTER_ATTRIBUTE, null /* defaultValue */);
            List<String> alternativeIds = parseStringListAttribute(
                    parser, ZONE_ALTERNATIVE_IDS_ATTRIBUTE, Collections.emptyList());
            String zoneIdString = consumeText(parser);

            // Make sure we are on the </id> element.
            checkOnEndTag(parser, ZONE_ID_ELEMENT);

            // Process the TimeZoneMapping.
            if (zoneIdString == null || zoneIdString.length() == 0) {
                throw new XmlPullParserException("Missing text for " + ZONE_ID_ELEMENT + "): "
                        + parser.getPositionDescription());
            }

            // intern() zone Ids because they are a fixed set of well-known strings that are used in
            // other low-level library calls.
            String internedZoneIdString = zoneIdString.intern();
            List<String> internedAlternativeIds = internStrings(alternativeIds);

            TimeZoneMapping timeZoneMapping = new TimeZoneMapping(
                    internedZoneIdString, showInPicker, notUsedAfter, internedAlternativeIds);
            timeZoneMappings.add(timeZoneMapping);
        }

        // The list is made unmodifiable to avoid callers changing it.
        return Collections.unmodifiableList(timeZoneMappings);
    }

    private static List<String> internStrings(List<String> stringsToIntern) {
        if (stringsToIntern.isEmpty()) {
            return stringsToIntern;
        }

        List<String> internedStrings = new ArrayList<>(stringsToIntern.size());
        for (String stringToIntern : stringsToIntern) {
            internedStrings.add(stringToIntern.intern());
        }
        return internedStrings;
    }

    /**
     * Processes &lt;timezones&gt; data.
     */
    private interface TimeZonesProcessor {

        boolean CONTINUE = true;
        boolean HALT = false;

        /**
         * Return {@link #CONTINUE} if processing of the XML should continue, {@link #HALT} if it
         * should stop (but without considering this an error). Problems with the data are
         * reported as an exception.
         *
         * <p>The default implementation returns {@link #CONTINUE}.
         */
        default boolean processHeader(String ianaVersion) throws XmlPullParserException {
            return CONTINUE;
        }

        /**
         * Returns {@link #CONTINUE} if processing of the XML should continue, {@link #HALT} if it
         * should stop (but without considering this an error). Problems with the data are
         * reported as an exception.
         *
         * <p>The default implementation returns {@link #CONTINUE}.
         */
        default boolean processCountryZones(String countryIso, String defaultTimeZoneId,
                boolean defaultTimeZoneBoost, boolean everUsesUtc,
                List<TimeZoneMapping> timeZoneMappings, String debugInfo)
                throws XmlPullParserException {
            return CONTINUE;
        }
    }

    /**
     * Validates &lt;countryzones&gt; elements. Intended to be used before a proposed installation
     * of new data. To be valid the country ISO code must be normalized, unique, the default time
     * zone ID must be one of the time zones IDs and the time zone IDs list must not be empty. The
     * IDs themselves are not checked against other data to see if they are recognized because other
     * classes will not have been updated with the associated new time zone data yet and so will not
     * be aware of newly added IDs.
     */
    private static class TimeZonesValidator implements TimeZonesProcessor {

        private final Set<String> knownCountryCodes = new HashSet<>();

        @Override
        public boolean processCountryZones(String countryIso, String defaultTimeZoneId,
                boolean defaultTimeZoneBoost, boolean everUsesUtc,
                List<TimeZoneMapping> timeZoneMappings, String debugInfo)
                throws XmlPullParserException {
            if (!normalizeCountryIso(countryIso).equals(countryIso)) {
                throw new XmlPullParserException("Country code: " + countryIso
                        + " is not normalized at " + debugInfo);
            }
            if (knownCountryCodes.contains(countryIso)) {
                throw new XmlPullParserException("Second entry for country code: " + countryIso
                        + " at " + debugInfo);
            }
            if (timeZoneMappings.isEmpty()) {
                throw new XmlPullParserException("No time zone IDs for country code: " + countryIso
                        + " at " + debugInfo);
            }
            if (!TimeZoneMapping.containsTimeZoneId(timeZoneMappings, defaultTimeZoneId)) {
                throw new XmlPullParserException("defaultTimeZoneId for country code: "
                        + countryIso + " is not one of the zones " + timeZoneMappings + " at "
                        + debugInfo);
            }
            knownCountryCodes.add(countryIso);

            return CONTINUE;
        }
    }

    /**
     * Reads just the IANA version from the file header. The version is then available via
     * {@link #getIanaVersion()}.
     */
    private static class IanaVersionExtractor implements TimeZonesProcessor {

        private String ianaVersion;

        @Override
        public boolean processHeader(String ianaVersion) throws XmlPullParserException {
            this.ianaVersion = ianaVersion;
            return HALT;
        }

        public String getIanaVersion() {
            return ianaVersion;
        }
    }

    /**
     * Reads all country time zone information into memory and makes it available as a
     * {@link CountryZonesFinder}.
     */
    private static class CountryZonesLookupExtractor implements TimeZonesProcessor {
        private List<CountryTimeZones> countryTimeZonesList = new ArrayList<>(250 /* default */);

        @Override
        public boolean processCountryZones(String countryIso, String defaultTimeZoneId,
                boolean defaultTimeZoneBoost, boolean everUsesUtc,
                List<TimeZoneMapping> timeZoneMappings, String debugInfo)
                throws XmlPullParserException {

            CountryTimeZones countryTimeZones = CountryTimeZones
                .createValidated(
                    countryIso, defaultTimeZoneId, defaultTimeZoneBoost, everUsesUtc,
                    timeZoneMappings, debugInfo);
            countryTimeZonesList.add(countryTimeZones);
            return CONTINUE;
        }

        CountryZonesFinder getCountryZonesLookup() {
            return new CountryZonesFinder(countryTimeZonesList);
        }
    }

    /**
     * Extracts <em>validated</em> time zones information associated with a specific country code.
     * Processing is halted when the country code is matched and the validated result is also made
     * available via {@link #getValidatedCountryTimeZones()}.
     */
    private static class SelectiveCountryTimeZonesExtractor implements TimeZonesProcessor {

        private final String countryCodeToMatch;
        private CountryTimeZones validatedCountryTimeZones;

        private SelectiveCountryTimeZonesExtractor(String countryCodeToMatch) {
            this.countryCodeToMatch = normalizeCountryIso(countryCodeToMatch);
        }

        @Override
        public boolean processCountryZones(String countryIso, String defaultTimeZoneId,
                boolean defaultTimeZoneBoost, boolean everUsesUtc,
                List<TimeZoneMapping> timeZoneMappings, String debugInfo) {
            countryIso = normalizeCountryIso(countryIso);
            if (!countryCodeToMatch.equals(countryIso)) {
                return CONTINUE;
            }
            validatedCountryTimeZones = CountryTimeZones.createValidated(countryIso,
                    defaultTimeZoneId, defaultTimeZoneBoost, everUsesUtc, timeZoneMappings,
                    debugInfo);

            return HALT;
        }

        /**
         * Returns the CountryTimeZones that matched, or {@code null} if there were no matches.
         */
        CountryTimeZones getValidatedCountryTimeZones() {
            return validatedCountryTimeZones;
        }
    }
}
