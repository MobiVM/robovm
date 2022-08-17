/*
 * Copyright (C) 2007 The Android Open Source Project
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
/*
 * Elements of the WallTime class are a port of Bionic's localtime.c to Java. That code had the
 * following header:
 *
 * This file is in the public domain, so clarified as of
 * 1996-06-05 by Arthur David Olson.
 */
package com.android.i18n.timezone;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * A class that represents a "wall time". This class is modeled on the C tm struct and
 * is used to support android.text.format.Time behavior. Unlike the tm struct the year is
 * represented as the full year, not the years since 1900.
 *
 * <p>This class contains a rewrite of various native functions that android.text.format.Time
 * once relied on such as mktime_tz and localtime_tz. This replacement does not support leap
 * seconds but does try to preserve behavior around ambiguous date/times found in the BSD
 * version of mktime that was previously used.
 *
 * <p>The original native code used a 32-bit value for time_t on 32-bit Android, which
 * was the only variant of Android available at the time. To preserve old behavior this code
 * deliberately uses {@code int} rather than {@code long} for most things and performs
 * calculations in seconds. This creates deliberate truncation issues for date / times before
 * 1901 and after 2038. This is intentional but might be fixed in future if all the knock-ons
 * can be resolved: Application code may have come to rely on the range so previously values
 * like zero for year could indicate an invalid date but if we move to long the year zero would
 * be valid.
 *
 * <p>All offsets are considered to be safe for addition / subtraction / multiplication without
 * worrying about overflow. All absolute time arithmetic is checked for overflow / underflow.
 *
 * @hide
 */
@libcore.api.CorePlatformApi
public class WallTime {

    // We use a GregorianCalendar (set to UTC) to handle all the date/time normalization logic
    // and to convert from a broken-down date/time to a millis value.
    // Unfortunately, it cannot represent an initial state with a zero day and would
    // automatically normalize it, so we must copy values into and out of it as needed.
    private final GregorianCalendar calendar;

    private int year;
    private int month;
    private int monthDay;
    private int hour;
    private int minute;
    private int second;
    private int weekDay;
    private int yearDay;
    private int isDst;
    private int gmtOffsetSeconds;

    @libcore.api.CorePlatformApi
    public WallTime() {
        this.calendar = new GregorianCalendar(0, 0, 0, 0, 0, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /**
     * Sets the wall time to a point in time using the time zone information provided. This
     * is a replacement for the old native localtime_tz() function.
     *
     * <p>When going from an instant to a wall time it is always unambiguous because there
     * is only one offset rule acting at any given instant. We do not consider leap seconds.
     */
    @libcore.api.CorePlatformApi
    public void localtime(int timeSeconds, ZoneInfoData zoneInfo) {
        try {
            int offsetSeconds = zoneInfo.getRawOffset() / 1000;

            // Find out the timezone DST state and adjustment.
            byte isDst;
            if (zoneInfo.mTransitions.length == 0) {
                isDst = 0;
            } else {
                // offsetIndex can be in the range -1..zoneInfo.mOffsets.length - 1
                int offsetIndex = zoneInfo.findOffsetIndexForTimeInSeconds(timeSeconds);
                if (offsetIndex == -1) {
                    // -1 means timeSeconds is "before the first recorded transition". The first
                    // recorded transition is treated as a transition from non-DST and the
                    // earliest known raw offset.
                    offsetSeconds = zoneInfo.getEarliestRawOffset() / 1000;
                    isDst = 0;
                } else {
                    offsetSeconds += zoneInfo.mOffsets[offsetIndex];
                    isDst = zoneInfo.mIsDsts[offsetIndex];
                }
            }

            // Perform arithmetic that might underflow before setting fields.
            int wallTimeSeconds = checked32BitAdd(timeSeconds, offsetSeconds);

            // Set fields.
            calendar.setTimeInMillis(wallTimeSeconds * 1000L);
            copyFieldsFromCalendar();
            this.isDst = isDst;
            this.gmtOffsetSeconds = offsetSeconds;
        } catch (CheckedArithmeticException e) {
            // Just stop, leaving fields untouched.
        }
    }

    /**
     * Returns the time in seconds since beginning of the Unix epoch for the wall time using the
     * time zone information provided. This is a replacement for an old native mktime_tz() C
     * function.
     *
     * <p>When going from a wall time to an instant the answer can be ambiguous. A wall
     * time can map to zero, one or two instants given rational date/time transitions. Rational
     * in this case means that transitions occur less frequently than the offset
     * differences between them (which could cause all sorts of craziness like the
     * skipping out of transitions).
     *
     * <p>For example, this is not fully supported:
     * <ul>
     *     <li>t1 { time = 1, offset = 0 }
     *     <li>t2 { time = 2, offset = -1 }
     *     <li>t3 { time = 3, offset = -2 }
     * </ul>
     * A wall time in this case might map to t1, t2 or t3.
     *
     * <p>We do not handle leap seconds.
     * <p>We assume that no timezone offset transition has an absolute offset > 24 hours.
     * <p>We do not assume that adjacent transitions modify the DST state; adjustments can
     * occur for other reasons such as when a zone changes its raw offset.
     */
    @libcore.api.CorePlatformApi
    public int mktime(ZoneInfoData zoneInfo) {
        // Normalize isDst to -1, 0 or 1 to simplify isDst equality checks below.
        this.isDst = this.isDst > 0 ? this.isDst = 1 : this.isDst < 0 ? this.isDst = -1 : 0;

        copyFieldsToCalendar();
        final long longWallTimeSeconds = calendar.getTimeInMillis() / 1000;
        if (Integer.MIN_VALUE > longWallTimeSeconds
                || longWallTimeSeconds > Integer.MAX_VALUE) {
            // For compatibility with the old native 32-bit implementation we must treat
            // this as an error. Note: -1 could be confused with a real time.
            return -1;
        }

        try {
            final int wallTimeSeconds =  (int) longWallTimeSeconds;
            final int rawOffsetSeconds = zoneInfo.getRawOffset() / 1000;
            final int rawTimeSeconds = checked32BitSubtract(wallTimeSeconds, rawOffsetSeconds);

            if (zoneInfo.mTransitions.length == 0) {
                // There is no transition information. There is just a raw offset for all time.
                if (this.isDst > 0) {
                    // Caller has asserted DST, but there is no DST information available.
                    return -1;
                }
                copyFieldsFromCalendar();
                this.isDst = 0;
                this.gmtOffsetSeconds = rawOffsetSeconds;
                return rawTimeSeconds;
            }

            // We cannot know for sure what instant the wall time will map to. Unfortunately, in
            // order to know for sure we need the timezone information, but to get the timezone
            // information we need an instant. To resolve this we use the raw offset to find an
            // OffsetInterval; this will get us the OffsetInterval we need or very close.

            // The initialTransition can be between -1 and (zoneInfo.mTransitions - 1). -1
            // indicates the rawTime is before the first transition and is handled gracefully by
            // createOffsetInterval().
            final int initialTransitionIndex = zoneInfo.findTransitionIndex(rawTimeSeconds);

            if (isDst < 0) {
                // This is treated as a special case to get it out of the way:
                // When a caller has set isDst == -1 it means we can return the first match for
                // the wall time we find. If the caller has specified a wall time that cannot
                // exist this always returns -1.

                Integer result = doWallTimeSearch(zoneInfo, initialTransitionIndex,
                        wallTimeSeconds, true /* mustMatchDst */);
                return result == null ? -1 : result;
            }

            // If the wall time asserts a DST (isDst == 0 or 1) the search is performed twice:
            // 1) The first attempts to find a DST offset that matches isDst exactly.
            // 2) If it fails, isDst is assumed to be incorrect and adjustments are made to see
            // if a valid wall time can be created. The result can be somewhat arbitrary.

            Integer result = doWallTimeSearch(zoneInfo, initialTransitionIndex, wallTimeSeconds,
                    true /* mustMatchDst */);
            if (result == null) {
                result = doWallTimeSearch(zoneInfo, initialTransitionIndex, wallTimeSeconds,
                        false /* mustMatchDst */);
            }
            if (result == null) {
                result = -1;
            }
            return result;
        } catch (CheckedArithmeticException e) {
            return -1;
        }
    }

    /**
     * Attempt to apply DST adjustments to {@code oldWallTimeSeconds} to create a wall time in
     * {@code targetInterval}.
     *
     * <p>This is used when a caller has made an assertion about standard time / DST that cannot
     * be matched to any offset interval that exists. We must therefore assume that the isDst
     * assertion is incorrect and the invalid wall time is the result of some modification the
     * caller made to a valid wall time that pushed them outside of the offset interval they
     * were in. We must correct for any DST change that should have been applied when they did
     * so.
     *
     * <p>Unfortunately, we have no information about what adjustment they made and so cannot
     * know which offset interval they were previously in. For example, they may have added a
     * second or a year to a valid time to arrive at what they have.
     *
     * <p>We try all offset types that are not the same as the isDst the caller asserted. For
     * each possible offset we work out the offset difference between that and
     * {@code targetInterval}, apply it, and see if we are still in {@code targetInterval}. If
     * we are, then we have found an adjustment.
     */
    private Integer tryOffsetAdjustments(ZoneInfoData zoneInfo, int oldWallTimeSeconds,
            OffsetInterval targetInterval, int transitionIndex, int isDstToFind)
            throws CheckedArithmeticException {

        int[] offsetsToTry = getOffsetsOfType(zoneInfo, transitionIndex, isDstToFind);
        for (int j = 0; j < offsetsToTry.length; j++) {
            int rawOffsetSeconds = zoneInfo.getRawOffset() / 1000;
            int jOffsetSeconds = rawOffsetSeconds + offsetsToTry[j];
            int targetIntervalOffsetSeconds = targetInterval.getTotalOffsetSeconds();
            int adjustmentSeconds = targetIntervalOffsetSeconds - jOffsetSeconds;
            int adjustedWallTimeSeconds = checked32BitAdd(oldWallTimeSeconds, adjustmentSeconds);
            if (targetInterval.containsWallTime(adjustedWallTimeSeconds)) {
                // Perform any arithmetic that might overflow.
                int returnValue = checked32BitSubtract(adjustedWallTimeSeconds,
                        targetIntervalOffsetSeconds);

                // Modify field state and return the result.
                calendar.setTimeInMillis(adjustedWallTimeSeconds * 1000L);
                copyFieldsFromCalendar();
                this.isDst = targetInterval.getIsDst();
                this.gmtOffsetSeconds = targetIntervalOffsetSeconds;
                return returnValue;
            }
        }
        return null;
    }

    /**
     * Return an array of offsets that have the requested {@code isDst} value.
     * The {@code startIndex} is used as a starting point so transitions nearest
     * to that index are returned first.
     */
    private static int[] getOffsetsOfType(ZoneInfoData zoneInfo, int startIndex, int isDst) {
        // +1 to account for the synthetic transition we invent before the first recorded one.
        int[] offsets = new int[zoneInfo.mOffsets.length + 1];
        boolean[] seen = new boolean[zoneInfo.mOffsets.length];
        int numFound = 0;

        int delta = 0;
        boolean clampTop = false;
        boolean clampBottom = false;
        do {
            // delta = { 1, -1, 2, -2, 3, -3...}
            delta *= -1;
            if (delta >= 0) {
                delta++;
            }

            int transitionIndex = startIndex + delta;
            if (delta < 0 && transitionIndex < -1) {
                clampBottom = true;
                continue;
            } else if (delta > 0 && transitionIndex >=  zoneInfo.mTypes.length) {
                clampTop = true;
                continue;
            }

            if (transitionIndex == -1) {
                if (isDst == 0) {
                    // Synthesize a non-DST transition before the first transition we have
                    // data for.
                    offsets[numFound++] = 0; // offset of 0 from raw offset
                }
                continue;
            }
            int type = zoneInfo.mTypes[transitionIndex] & 0xff;
            if (!seen[type]) {
                if (zoneInfo.mIsDsts[type] == isDst) {
                    offsets[numFound++] = zoneInfo.mOffsets[type];
                }
                seen[type] = true;
            }
        } while (!(clampTop && clampBottom));

        int[] toReturn = new int[numFound];
        System.arraycopy(offsets, 0, toReturn, 0, numFound);
        return toReturn;
    }

    /**
     * Find a time <em>in seconds</em> the same or close to {@code wallTimeSeconds} that
     * satisfies {@code mustMatchDst}. The search begins around the timezone offset transition
     * with {@code initialTransitionIndex}.
     *
     * <p>If {@code mustMatchDst} is {@code true} the method can only return times that
     * use timezone offsets that satisfy the {@code this.isDst} requirements.
     * If {@code this.isDst == -1} it means that any offset can be used.
     *
     * <p>If {@code mustMatchDst} is {@code false} any offset that covers the
     * currently set time is acceptable. That is: if {@code this.isDst} == -1, any offset
     * transition can be used, if it is 0 or 1 the offset used must match {@code this.isDst}.
     *
     * <p>Note: This method both uses and can modify field state. It returns the matching time
     * in seconds if a match has been found and modifies fields, or it returns {@code null} and
     * leaves the field state unmodified.
     */
    private Integer doWallTimeSearch(ZoneInfoData zoneInfo, int initialTransitionIndex,
            int wallTimeSeconds, boolean mustMatchDst) throws CheckedArithmeticException {

        // The loop below starts at the initialTransitionIndex and radiates out from that point
        // up to 24 hours in either direction by applying transitionIndexDelta to inspect
        // adjacent transitions (0, -1, +1, -2, +2). 24 hours is used because we assume that no
        // total offset from UTC is ever > 24 hours. clampTop and clampBottom are used to
        // indicate whether the search has either searched > 24 hours or exhausted the
        // transition data in that direction. The search stops when a match is found or if
        // clampTop and clampBottom are both true.
        // The match logic employed is determined by the mustMatchDst parameter.
        final int MAX_SEARCH_SECONDS = 24 * 60 * 60;
        boolean clampTop = false, clampBottom = false;
        int loop = 0;
        do {
            // transitionIndexDelta = { 0, -1, 1, -2, 2,..}
            int transitionIndexDelta = (loop + 1) / 2;
            if (loop % 2 == 1) {
                transitionIndexDelta *= -1;
            }
            loop++;

            // Only do any work in this iteration if we need to.
            if (transitionIndexDelta > 0 && clampTop
                    || transitionIndexDelta < 0 && clampBottom) {
                continue;
            }

            // Obtain the OffsetInterval to use.
            int currentTransitionIndex = initialTransitionIndex + transitionIndexDelta;
            OffsetInterval offsetInterval =
                    OffsetInterval.create(zoneInfo, currentTransitionIndex);
            if (offsetInterval == null) {
                // No transition exists with the index we tried: Stop searching in the
                // current direction.
                clampTop |= (transitionIndexDelta > 0);
                clampBottom |= (transitionIndexDelta < 0);
                continue;
            }

            // Match the wallTimeSeconds against the OffsetInterval.
            if (mustMatchDst) {
                // Work out if the interval contains the wall time the caller specified and
                // matches their isDst value.
                if (offsetInterval.containsWallTime(wallTimeSeconds)) {
                    if (this.isDst == -1 || offsetInterval.getIsDst() == this.isDst) {
                        // This always returns the first OffsetInterval it finds that matches
                        // the wall time and isDst requirements. If this.isDst == -1 this means
                        // the result might be a DST or a non-DST answer for wall times that can
                        // exist in two OffsetIntervals.
                        int totalOffsetSeconds = offsetInterval.getTotalOffsetSeconds();
                        int returnValue = checked32BitSubtract(wallTimeSeconds, totalOffsetSeconds);

                        copyFieldsFromCalendar();
                        this.isDst = offsetInterval.getIsDst();
                        this.gmtOffsetSeconds = totalOffsetSeconds;
                        return returnValue;
                    }
                }
            } else {
                // To retain similar behavior to the old native implementation: if the caller is
                // asserting the same isDst value as the OffsetInterval we are looking at we do
                // not try to find an adjustment from another OffsetInterval of the same isDst
                // type. If you remove this you get different results in situations like a
                // DST -> DST transition or STD -> STD transition that results in an interval of
                // "skipped" wall time. For example: if 01:30 (DST) is invalid and between two
                // DST intervals, and the caller has passed isDst == 1, this results in a -1
                // being returned.
                if (isDst != offsetInterval.getIsDst()) {
                    final int isDstToFind = isDst;
                    Integer returnValue = tryOffsetAdjustments(zoneInfo, wallTimeSeconds,
                            offsetInterval, currentTransitionIndex, isDstToFind);
                    if (returnValue != null) {
                        return returnValue;
                    }
                }
            }

            // See if we can avoid another loop in the current direction.
            if (transitionIndexDelta > 0) {
                // If we are searching forward and the OffsetInterval we have ends
                // > MAX_SEARCH_SECONDS after the wall time, we don't need to look any further
                // forward.
                boolean endSearch = offsetInterval.getEndWallTimeSeconds() - wallTimeSeconds
                        > MAX_SEARCH_SECONDS;
                if (endSearch) {
                    clampTop = true;
                }
            } else if (transitionIndexDelta < 0) {
                boolean endSearch = wallTimeSeconds - offsetInterval.getStartWallTimeSeconds()
                        >= MAX_SEARCH_SECONDS;
                if (endSearch) {
                    // If we are searching backward and the OffsetInterval starts
                    // > MAX_SEARCH_SECONDS before the wall time, we don't need to look any
                    // further backwards.
                    clampBottom = true;
                }
            }
        } while (!(clampTop && clampBottom));
        return null;
    }

    @libcore.api.CorePlatformApi
    public void setYear(int year) {
        this.year = year;
    }

    @libcore.api.CorePlatformApi
    public void setMonth(int month) {
        this.month = month;
    }

    @libcore.api.CorePlatformApi
    public void setMonthDay(int monthDay) {
        this.monthDay = monthDay;
    }

    @libcore.api.CorePlatformApi
    public void setHour(int hour) {
        this.hour = hour;
    }

    @libcore.api.CorePlatformApi
    public void setMinute(int minute) {
        this.minute = minute;
    }

    @libcore.api.CorePlatformApi
    public void setSecond(int second) {
        this.second = second;
    }

    @libcore.api.CorePlatformApi
    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    @libcore.api.CorePlatformApi
    public void setYearDay(int yearDay) {
        this.yearDay = yearDay;
    }

    @libcore.api.CorePlatformApi
    public void setIsDst(int isDst) {
        this.isDst = isDst;
    }

    @libcore.api.CorePlatformApi
    public void setGmtOffset(int gmtoff) {
        this.gmtOffsetSeconds = gmtoff;
    }

    @libcore.api.CorePlatformApi
    public int getYear() {
        return year;
    }

    @libcore.api.CorePlatformApi
    public int getMonth() {
        return month;
    }

    @libcore.api.CorePlatformApi
    public int getMonthDay() {
        return monthDay;
    }

    @libcore.api.CorePlatformApi
    public int getHour() {
        return hour;
    }

    @libcore.api.CorePlatformApi
    public int getMinute() {
        return minute;
    }

    @libcore.api.CorePlatformApi
    public int getSecond() {
        return second;
    }

    @libcore.api.CorePlatformApi
    public int getWeekDay() {
        return weekDay;
    }

    @libcore.api.CorePlatformApi
    public int getYearDay() {
        return yearDay;
    }

    @libcore.api.CorePlatformApi
    public int getGmtOffset() {
        return gmtOffsetSeconds;
    }

    @libcore.api.CorePlatformApi
    public int getIsDst() {
        return isDst;
    }

    private void copyFieldsToCalendar() {
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, monthDay);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
    }

    private void copyFieldsFromCalendar() {
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        monthDay = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second =  calendar.get(Calendar.SECOND);

        // Calendar uses Sunday == 1. Android Time uses Sunday = 0.
        weekDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        // Calendar enumerates from 1, Android Time enumerates from 0.
        yearDay = calendar.get(Calendar.DAY_OF_YEAR) - 1;
    }

    /**
     * A wall-time representation of a timezone offset interval.
     *
     * <p>Wall-time means "as it would appear locally in the timezone in which it applies".
     * For example in 2007:
     * PST was a -8:00 offset that ran until Mar 11, 2:00 AM.
     * PDT was a -7:00 offset and ran from Mar 11, 3:00 AM to Nov 4, 2:00 AM.
     * PST was a -8:00 offset and ran from Nov 4, 1:00 AM.
     * Crucially this means that there was a "gap" after PST when PDT started, and an overlap when
     * PDT ended and PST began.
     *
     * <p>Although wall-time means "local time", for convenience all wall-time values are stored in
     * the number of seconds since the beginning of the Unix epoch to get that time <em>in UTC</em>.
     * To convert from a wall-time to the actual UTC time it is necessary to <em>subtract</em> the
     * {@code totalOffsetSeconds}.
     * For example: If the offset in PST is -07:00 hours, then:
     * timeInPstSeconds = wallTimeUtcSeconds - offsetSeconds
     * i.e. 13:00 UTC - (-07:00) = 20:00 UTC = 13:00 PST
     */
    static class OffsetInterval {

        /** The time the interval starts in seconds since start of epoch, inclusive. */
        private final int startWallTimeSeconds;
        /** The time the interval ends in seconds since start of epoch, exclusive. */
        private final int endWallTimeSeconds;
        private final int isDst;
        private final int totalOffsetSeconds;

        /**
         * Creates an {@link OffsetInterval}.
         *
         * <p>If {@code transitionIndex} is -1, where possible the transition is synthesized to run
         * from the beginning of 32-bit time until the first transition in {@code zoneInfo} with
         * offset information based on the first type defined. If {@code transitionIndex} is the
         * last transition, that transition is considered to run until the end of 32-bit time.
         * Otherwise, the information is extracted from {@code zoneInfo.mTransitions},
         * {@code zoneInfo.mOffsets} and {@code zoneInfo.mIsDsts}.
         *
         * <p>This method can return null when:
         * <ol>
         * <li>the {@code transitionIndex} is outside the allowed range, i.e.
         *   {@code transitionIndex < -1 || transitionIndex >= [the number of transitions]}.</li>
         * <li>when calculations result in a zero-length interval. This is only expected to occur
         *   when dealing with transitions close to (or exactly at) {@code Integer.MIN_VALUE} and
         *   {@code Integer.MAX_VALUE} and where it's difficult to convert from UTC to local times.
         *   </li>
         * </ol>
         */
        public static OffsetInterval create(ZoneInfoData zoneInfo, int transitionIndex) {
            if (transitionIndex < -1 || transitionIndex >= zoneInfo.mTransitions.length) {
                return null;
            }

            if (transitionIndex == -1) {
                int totalOffsetSeconds = zoneInfo.getEarliestRawOffset() / 1000;
                int isDst = 0;

                int startWallTimeSeconds = Integer.MIN_VALUE;
                int endWallTimeSeconds =
                        saturated32BitAdd(zoneInfo.mTransitions[0], totalOffsetSeconds);
                if (startWallTimeSeconds == endWallTimeSeconds) {
                    // There's no point in returning an OffsetInterval that lasts 0 seconds.
                    return null;
                }
                return new OffsetInterval(startWallTimeSeconds, endWallTimeSeconds, isDst,
                        totalOffsetSeconds);
            }

            int rawOffsetSeconds = zoneInfo.getRawOffset() / 1000;
            int type = zoneInfo.mTypes[transitionIndex] & 0xff;
            int totalOffsetSeconds = zoneInfo.mOffsets[type] + rawOffsetSeconds;
            int endWallTimeSeconds;
            if (transitionIndex == zoneInfo.mTransitions.length - 1) {
                endWallTimeSeconds = Integer.MAX_VALUE;
            } else {
                endWallTimeSeconds = saturated32BitAdd(
                        zoneInfo.mTransitions[transitionIndex + 1], totalOffsetSeconds);
            }
            int isDst = zoneInfo.mIsDsts[type];
            int startWallTimeSeconds =
                    saturated32BitAdd(zoneInfo.mTransitions[transitionIndex], totalOffsetSeconds);
            if (startWallTimeSeconds == endWallTimeSeconds) {
                // There's no point in returning an OffsetInterval that lasts 0 seconds.
                return null;
            }
            return new OffsetInterval(
                    startWallTimeSeconds, endWallTimeSeconds, isDst, totalOffsetSeconds);
        }

        private OffsetInterval(int startWallTimeSeconds, int endWallTimeSeconds, int isDst,
                int totalOffsetSeconds) {
            this.startWallTimeSeconds = startWallTimeSeconds;
            this.endWallTimeSeconds = endWallTimeSeconds;
            this.isDst = isDst;
            this.totalOffsetSeconds = totalOffsetSeconds;
        }

        public boolean containsWallTime(long wallTimeSeconds) {
            return wallTimeSeconds >= startWallTimeSeconds && wallTimeSeconds < endWallTimeSeconds;
        }

        public int getIsDst() {
            return isDst;
        }

        public int getTotalOffsetSeconds() {
            return totalOffsetSeconds;
        }

        public long getEndWallTimeSeconds() {
            return endWallTimeSeconds;
        }

        public long getStartWallTimeSeconds() {
            return startWallTimeSeconds;
        }
    }

    /**
     * An exception used to indicate an arithmetic overflow or underflow.
     */
    private static class CheckedArithmeticException extends Exception {
    }

    /**
     * Calculate (a + b). The result must be in the Integer range otherwise an exception is thrown.
     *
     * @throws CheckedArithmeticException if overflow or underflow occurs
     */
    private static int checked32BitAdd(long a, int b) throws CheckedArithmeticException {
        // Adapted from Guava IntMath.checkedAdd();
        long result = a + b;
        if (result != (int) result) {
            throw new CheckedArithmeticException();
        }
        return (int) result;
    }

    /**
     * Calculate (a - b). The result must be in the Integer range otherwise an exception is thrown.
     *
     * @throws CheckedArithmeticException if overflow or underflow occurs
     */
    private static int checked32BitSubtract(long a, int b) throws CheckedArithmeticException {
        // Adapted from Guava IntMath.checkedSubtract();
        long result = a - b;
        if (result != (int) result) {
            throw new CheckedArithmeticException();
        }
        return (int) result;
    }

    /**
     * Calculate (a + b). If the result would overflow or underflow outside of the Integer range
     * Integer.MAX_VALUE or Integer.MIN_VALUE will be returned, respectively.
     */
    private static int saturated32BitAdd(long a, int b) {
        long result = a + b;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
