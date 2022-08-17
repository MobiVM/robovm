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

package libcore.icu;

import android.compat.annotation.ChangeId;
import android.compat.annotation.EnabledAfter;
import android.compat.annotation.UnsupportedAppUsage;
import android.compat.Compatibility;
import android.icu.text.DateFormatSymbols;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.icu.util.ULocale;

import com.android.icu.text.ExtendedDecimalFormatSymbols;
import com.android.icu.util.ExtendedCalendar;

import dalvik.system.VMRuntime;

import java.text.DateFormat;
import java.util.HashMap;
import java.util.Locale;
import libcore.util.Objects;

/**
 * Passes locale-specific from ICU native code to Java.
 * <p>
 * Note that you share these; you must not alter any of the fields, nor their array elements
 * in the case of arrays. If you ever expose any of these things to user code, you must give
 * them a clone rather than the original.
 * @hide
 */
public final class LocaleData {

    /**
     * @see #USE_REAL_ROOT_LOCALE
     */
    private static final Locale LOCALE_EN_US_POSIX = new Locale("en", "US", "POSIX");


    // In Android Q or before, when this class tries to load {@link Locale#ROOT} data, en_US_POSIX
    // locale data is incorrectly loaded due to a bug b/159514442 (public bug b/159047832).
    //
    // This class used to pass "und" string as BCP47 language tag to our jni code, which then
    // passes the string as as ICU Locale ID to ICU4C. ICU4C 63 or older version doesn't recognize
    // "und" as a valid locale id, and fallback the default locale. The default locale is
    // normally selected in the Locale picker in the Settings app by the user and set via
    // frameworks. But this class statically cached the ROOT locale data before the
    // default locale being set by framework, and without initialization, ICU4C uses en_US_POSIX
    // as default locale. Thus, in Q or before, en_US_POSIX data is loaded.
    //
    // ICU version 64.1 resolved inconsistent behavior of
    // "root", "und" and "" (empty) Locale ID which libcore previously relied on, and they are
    // recognized correctly as {@link Locale#ROOT} since Android R. This ChangeId gated the change,
    // and fallback to the old behavior by checking targetSdkVersion version.
    //
    // The below javadoc is shown in http://developer.android.com for consumption by app developers.
    /**
     * Since Android 11, formatter classes, e.g. java.text.SimpleDateFormat, no longer
     * provide English data when Locale.ROOT format is requested. Please use
     * Locale.ENGLISH to format in English.
     *
     * Note that Locale.ROOT is used as language/country neutral locale or fallback locale,
     * and does not guarantee to represent English locale.
     *
     * This flag is only for documentation and can't be overridden by app. Please use
     * {@code targetSdkVersion} to enable the new behavior.
     */
    @ChangeId
    @EnabledAfter(targetSdkVersion=29 /* Android Q */)
    public static final long USE_REAL_ROOT_LOCALE = 159047832L;

    // A cache for the locale-specific data.
    private static final HashMap<String, LocaleData> localeDataCache = new HashMap<String, LocaleData>();
    static {
        // Ensure that we pull in the locale data for the root locale, en_US, and the
        // user's default locale. (All devices must support the root locale and en_US,
        // and they're used for various system things like HTTP headers.) Pre-populating
        // the cache is especially useful on Android because we'll share this via the Zygote.
        get(Locale.ROOT);
        get(Locale.US);
        get(Locale.getDefault());
    }

    // Used by Calendar.
    @UnsupportedAppUsage
    public Integer firstDayOfWeek;
    @UnsupportedAppUsage
    public Integer minimalDaysInFirstWeek;

    // Used by DateFormatSymbols.
    public String[] amPm; // "AM", "PM".
    public String[] eras; // "BC", "AD".

    public String[] longMonthNames; // "January", ...
    @UnsupportedAppUsage
    public String[] shortMonthNames; // "Jan", ...
    public String[] tinyMonthNames; // "J", ...
    public String[] longStandAloneMonthNames; // "January", ...
    @UnsupportedAppUsage
    public String[] shortStandAloneMonthNames; // "Jan", ...
    public String[] tinyStandAloneMonthNames; // "J", ...

    public String[] longWeekdayNames; // "Sunday", ...
    public String[] shortWeekdayNames; // "Sun", ...
    public String[] tinyWeekdayNames; // "S", ...
    @UnsupportedAppUsage
    public String[] longStandAloneWeekdayNames; // "Sunday", ...
    @UnsupportedAppUsage
    public String[] shortStandAloneWeekdayNames; // "Sun", ...
    public String[] tinyStandAloneWeekdayNames; // "S", ...

    // today and tomorrow is only kept for @UnsupportedAppUsage.
    // Their value is hard-coded, not localized.
    @UnsupportedAppUsage
    public String today; // "Today".
    @UnsupportedAppUsage
    public String tomorrow; // "Tomorrow".

    public String fullTimeFormat;
    public String longTimeFormat;
    public String mediumTimeFormat;
    public String shortTimeFormat;

    public String fullDateFormat;
    public String longDateFormat;
    public String mediumDateFormat;
    public String shortDateFormat;

    // timeFormat_hm and timeFormat_Hm are only kept for @UnsupportedAppUsage.
    // Their value is hard-coded, not localized.
    @UnsupportedAppUsage
    public String timeFormat_hm;
    @UnsupportedAppUsage
    public String timeFormat_Hm;

    // Used by DecimalFormatSymbols.
    @UnsupportedAppUsage
    public char zeroDigit;
    public char decimalSeparator;
    public char groupingSeparator;
    public char patternSeparator;
    public String percent;
    public String perMill;
    public char monetarySeparator;
    public String minusSign;
    public String exponentSeparator;
    public String infinity;
    public String NaN;

    // Used by DecimalFormat and NumberFormat.
    public String numberPattern;
    public String integerPattern;
    public String currencyPattern;
    public String percentPattern;

    private final Locale mLocale;

    private LocaleData(Locale locale) {
        mLocale = locale;
        today = "Today";
        tomorrow = "Tomorrow";
        timeFormat_hm = "h:mm a";
        timeFormat_Hm = "HH:mm";
    }

    @UnsupportedAppUsage
    public static Locale mapInvalidAndNullLocales(Locale locale) {
        if (locale == null) {
            return Locale.getDefault();
        }

        if ("und".equals(locale.toLanguageTag())) {
            return Locale.ROOT;
        }

        return locale;
    }

    /**
     * Normally, this utility function is used by secondary cache above {@link LocaleData},
     * because the cache needs a correct key.
     * @see #USE_REAL_ROOT_LOCALE
     * @return a compatible locale for the bug b/159514442
     */
    public static Locale getCompatibleLocaleForBug159514442(Locale locale) {
        if (Locale.ROOT.equals(locale)) {
            int targetSdkVersion = VMRuntime.getRuntime().getTargetSdkVersion();
            // Don't use Compatibility.isChangeEnabled(USE_REAL_ROOT_LOCALE) because the app compat
            // framework lives in libcore and can depend on this class via various format methods,
            // e.g. String.format(). See b/160912695.
            if (targetSdkVersion <= 29 /* Android Q */) {
                locale = LOCALE_EN_US_POSIX;
            }
        }
        return locale;
    }

    /**
     * Returns a shared LocaleData for the given locale.
     */
    @UnsupportedAppUsage
    public static LocaleData get(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("locale == null");
        }

        locale = getCompatibleLocaleForBug159514442(locale);

        final String languageTag = locale.toLanguageTag();
        synchronized (localeDataCache) {
            LocaleData localeData = localeDataCache.get(languageTag);
            if (localeData != null) {
                return localeData;
            }
        }
        LocaleData newLocaleData = initLocaleData(locale);
        synchronized (localeDataCache) {
            LocaleData localeData = localeDataCache.get(languageTag);
            if (localeData != null) {
                return localeData;
            }
            localeDataCache.put(languageTag, newLocaleData);
            return newLocaleData;
        }
    }

    @Override public String toString() {
        return Objects.toString(this);
    }

    public String getDateFormat(int style) {
        switch (style) {
        case DateFormat.SHORT:
            return shortDateFormat;
        case DateFormat.MEDIUM:
            return mediumDateFormat;
        case DateFormat.LONG:
            return longDateFormat;
        case DateFormat.FULL:
            return fullDateFormat;
        }
        throw new AssertionError();
    }

    public String getTimeFormat(int style) {
        // Do not cache ICU.getTimePattern() return value in the LocaleData instance
        // because most users do not enable this setting, hurts performance in critical path,
        // e.g. b/161846393, and ICU.getBestDateTimePattern will cache it in  ICU.CACHED_PATTERNS
        // on demand.
        switch (style) {
        case DateFormat.SHORT:
            if (DateFormat.is24Hour == null) {
                return shortTimeFormat;
            } else {
                return ICU.getTimePattern(mLocale, DateFormat.is24Hour, false);
            }
        case DateFormat.MEDIUM:
            if (DateFormat.is24Hour == null) {
                return mediumTimeFormat;
            } else {
                return ICU.getTimePattern(mLocale, DateFormat.is24Hour, true);
            }
        case DateFormat.LONG:
            // CLDR doesn't really have anything we can use to obey the 12-/24-hour preference.
            return longTimeFormat;
        case DateFormat.FULL:
            // CLDR doesn't really have anything we can use to obey the 12-/24-hour preference.
            return fullTimeFormat;
        }
        throw new AssertionError();
    }

    /*
     * This method is made public for testing
     */
    public static LocaleData initLocaleData(Locale locale) {
        LocaleData localeData = new LocaleData(locale);

        localeData.initializeDateTimePatterns(locale);
        localeData.initializeDateFormatData(locale);
        localeData.initializeDecimalFormatData(locale);
        localeData.initializeCalendarData(locale);

        // Libcore localizes pattern separator while ICU doesn't. http://b/112080617
        initializePatternSeparator(localeData, locale);

        // Fix up a couple of patterns.
        if (localeData.fullTimeFormat != null) {
            // There are some full time format patterns in ICU that use the pattern character 'v'.
            // Java doesn't accept this, so we replace it with 'z' which has about the same result
            // as 'v', the timezone name.
            // 'v' -> "PT", 'z' -> "PST", v is the generic timezone and z the standard tz
            // "vvvv" -> "Pacific Time", "zzzz" -> "Pacific Standard Time"
            localeData.fullTimeFormat = localeData.fullTimeFormat.replace('v', 'z');
        }
        if (localeData.numberPattern != null) {
            // The number pattern might contain positive and negative subpatterns. Arabic, for
            // example, might look like "#,##0.###;#,##0.###-" because the minus sign should be
            // written last. Macedonian supposedly looks something like "#,##0.###;(#,##0.###)".
            // (The negative subpattern is optional, though, and not present in most locales.)
            // By only swallowing '#'es and ','s after the '.', we ensure that we don't
            // accidentally eat too much.
            localeData.integerPattern = localeData.numberPattern.replaceAll("\\.[#,]*", "");
        }
        return localeData;
    }

    // Libcore localizes pattern separator while ICU doesn't. http://b/112080617
    private static void initializePatternSeparator(LocaleData localeData, Locale locale) {
        ULocale uLocale = ULocale.forLocale(locale);
        NumberingSystem ns = NumberingSystem.getInstance(uLocale);
        // A numbering system could be numeric or algorithmic. DecimalFormat can only use
        // a numeric and decimal-based (radix == 10) system. Fallback to a Latin, a known numeric
        // and decimal-based if the default numbering system isn't. All locales should have data
        // for Latin numbering system after locale data fallback. See Numbering system section
        // in Unicode Technical Standard #35 for more details.
        if (ns == null || ns.getRadix() != 10 || ns.isAlgorithmic()) {
            ns = NumberingSystem.LATIN;
        }
        String patternSeparator = ExtendedDecimalFormatSymbols.getInstance(uLocale, ns)
                .getLocalizedPatternSeparator();

        if (patternSeparator == null || patternSeparator.isEmpty()) {
            patternSeparator = ";";
        }

        // Pattern separator in libcore supports single java character only.
        localeData.patternSeparator = patternSeparator.charAt(0);
    }

    private void initializeDateFormatData(Locale locale) {
        DateFormatSymbols dfs = new DateFormatSymbols(GregorianCalendar.class, locale);

        longMonthNames = dfs.getMonths(DateFormatSymbols.FORMAT, DateFormatSymbols.WIDE);
        shortMonthNames = dfs.getMonths(DateFormatSymbols.FORMAT, DateFormatSymbols.ABBREVIATED);
        tinyMonthNames = dfs.getMonths(DateFormatSymbols.FORMAT, DateFormatSymbols.NARROW);
        longWeekdayNames = dfs.getWeekdays(DateFormatSymbols.FORMAT, DateFormatSymbols.WIDE);
        shortWeekdayNames = dfs
            .getWeekdays(DateFormatSymbols.FORMAT, DateFormatSymbols.ABBREVIATED);
        tinyWeekdayNames = dfs.getWeekdays(DateFormatSymbols.FORMAT, DateFormatSymbols.NARROW);

        longStandAloneMonthNames = dfs
            .getMonths(DateFormatSymbols.STANDALONE, DateFormatSymbols.WIDE);
        shortStandAloneMonthNames = dfs
            .getMonths(DateFormatSymbols.STANDALONE, DateFormatSymbols.ABBREVIATED);
        tinyStandAloneMonthNames = dfs
            .getMonths(DateFormatSymbols.STANDALONE, DateFormatSymbols.NARROW);
        longStandAloneWeekdayNames = dfs
            .getWeekdays(DateFormatSymbols.STANDALONE, DateFormatSymbols.WIDE);
        shortStandAloneWeekdayNames = dfs
            .getWeekdays(DateFormatSymbols.STANDALONE, DateFormatSymbols.ABBREVIATED);
        tinyStandAloneWeekdayNames = dfs
            .getWeekdays(DateFormatSymbols.STANDALONE, DateFormatSymbols.NARROW);

        amPm = dfs.getAmPmStrings();
        eras = dfs.getEras();

    }

    private void initializeDecimalFormatData(Locale locale) {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(locale);

        decimalSeparator = dfs.getDecimalSeparator();
        groupingSeparator = dfs.getGroupingSeparator();
        patternSeparator = dfs.getPatternSeparator();
        percent = dfs.getPercentString();
        perMill = dfs.getPerMillString();
        monetarySeparator = dfs.getMonetaryDecimalSeparator();
        minusSign = dfs.getMinusSignString();
        exponentSeparator = dfs.getExponentSeparator();
        infinity = dfs.getInfinity();
        NaN = dfs.getNaN();
        zeroDigit = dfs.getZeroDigit();

        DecimalFormat df = (DecimalFormat) NumberFormat
            .getInstance(locale, NumberFormat.NUMBERSTYLE);
        numberPattern = df.toPattern();

        df = (DecimalFormat) NumberFormat.getInstance(locale, NumberFormat.CURRENCYSTYLE);
        currencyPattern = df.toPattern();

        df = (DecimalFormat) NumberFormat.getInstance(locale, NumberFormat.PERCENTSTYLE);
        percentPattern = df.toPattern();

    }

    private void initializeCalendarData(Locale locale) {
        Calendar calendar = Calendar.getInstance(locale);

        firstDayOfWeek = calendar.getFirstDayOfWeek();
        minimalDaysInFirstWeek = calendar.getMinimalDaysInFirstWeek();
    }

    private void initializeDateTimePatterns(Locale locale) {
        // libcore's java.text supports Gregorian calendar only.
        ExtendedCalendar extendedCalendar = ICU.getExtendedCalendar(locale, "gregorian");

        fullTimeFormat = getDateTimeFormatString(extendedCalendar,
            android.icu.text.DateFormat.NONE, android.icu.text.DateFormat.FULL);
        longTimeFormat = getDateTimeFormatString(extendedCalendar,
            android.icu.text.DateFormat.NONE, android.icu.text.DateFormat.LONG);
        mediumTimeFormat = getDateTimeFormatString(extendedCalendar,
            android.icu.text.DateFormat.NONE, android.icu.text.DateFormat. MEDIUM);
        shortTimeFormat = getDateTimeFormatString(extendedCalendar,
            android.icu.text.DateFormat.NONE, android.icu.text.DateFormat.SHORT);
        fullDateFormat = getDateTimeFormatString(extendedCalendar,
            android.icu.text.DateFormat.FULL, android.icu.text.DateFormat.NONE);
        longDateFormat = getDateTimeFormatString(extendedCalendar,
            android.icu.text.DateFormat.LONG, android.icu.text.DateFormat.NONE);
        mediumDateFormat = getDateTimeFormatString(extendedCalendar,
            android.icu.text.DateFormat.MEDIUM, android.icu.text.DateFormat.NONE);
        shortDateFormat = getDateTimeFormatString(extendedCalendar,
            android.icu.text.DateFormat.SHORT, android.icu.text.DateFormat.NONE);
    }

    private static String getDateTimeFormatString(ExtendedCalendar extendedCalendar,
            int dateStyle, int timeStyle) {
        return ICU.transformIcuDateTimePattern_forJavaText(
                extendedCalendar.getDateTimePattern(dateStyle, timeStyle));
    }
}
