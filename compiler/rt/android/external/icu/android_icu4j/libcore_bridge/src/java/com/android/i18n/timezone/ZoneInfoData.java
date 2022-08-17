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
package com.android.i18n.timezone;

import com.android.i18n.timezone.internal.BufferIterator;
import com.android.i18n.timezone.internal.ByteBufferIterator;

import libcore.util.NonNull;
import libcore.util.Nullable;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream.PutField;
import java.io.ObjectStreamField;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * This class holds the data of a time zone backed by the tzfiles. An instance is immutable.
 *
 * <p>This reads time zone information from a binary file stored on the platform. The binary file
 * is essentially a single file containing compacted versions of all the tzfiles produced by the
 * zone info compiler (zic) tool (see {@code man 5 tzfile} for details of the format and
 * {@code man 8 zic}) and an index by long name, e.g. Europe/London.
 *
 * <p>The compacted form is created by
 * {@code system/timezone/input_tools/android/zone_compactor/main/java/ZoneCompactor.java} and is
 * used by both this and Bionic. {@link ZoneInfoDb} is responsible for mapping the binary file, and
 * reading the index and creating a {@link BufferIterator} that provides access to an entry for a
 * specific file. This class is responsible for reading the data from that {@link BufferIterator}
 * and storing it a representation to support the {@link java.util.TimeZone} and
 * {@link java.util.GregorianCalendar} implementations. See
 * {@link ZoneInfoData#readTimeZone(String, BufferIterator)}.
 *
 * <p>This class does not use all the information from the {@code tzfile}; it uses:
 * {@code tzh_timecnt} and the associated transition times and type information. For each type
 * (described by {@code struct ttinfo}) it uses {@code tt_gmtoff} and {@code tt_isdst}.
 *
 * @hide
 */
@libcore.api.IntraCoreApi
@libcore.api.CorePlatformApi
public final class ZoneInfoData {
    /**
     * The serialized fields in {@link libcore.util.ZoneInfo} kept for backward app compatibility.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public static final @NonNull ObjectStreamField @NonNull [] ZONEINFO_SERIALIZED_FIELDS =
            new ObjectStreamField[] {
                    new ObjectStreamField("mRawOffset", int.class),
                    new ObjectStreamField("mEarliestRawOffset", int.class),
                    new ObjectStreamField("mTransitions", long[].class),
                    new ObjectStreamField("mTypes", byte[].class),
                    new ObjectStreamField("mOffsets", int[].class),
                    new ObjectStreamField("mIsDsts", byte[].class),
            };

    private final String mId;

    /**
     * The (best guess) non-DST offset used "today". It is stored in milliseconds.
     * See also {@link #mOffsets} which holds values relative to this value, albeit in seconds.
     */
    private final int mRawOffset;

    /**
     * The earliest non-DST offset for the zone. It is stored in milliseconds and is absolute, i.e.
     * it is not relative to mRawOffset.
     */
    private final int mEarliestRawOffset;

    /**
     * The times (in seconds) at which the offsets changes for any reason, whether that is a change
     * in the offset from UTC or a change in the DST.
     *
     * <p>These times are pre-calculated externally from a set of rules (both historical and
     * future) and stored in a file from which {@link ZoneInfoData#readTimeZone(String,
     * BufferIterator)} reads the data. That is quite different to {@link java.util.SimpleTimeZone},
     * which has essentially human readable rules (e.g. DST starts at 01:00 on the first Sunday in
     * March and ends at 01:00 on the last Sunday in October) that can be used to determine the
     * DST transition times across a number of years
     *
     * <p>In terms of {@link ZoneInfoData tzfile} structure this array is of length
     * {@code tzh_timecnt} and contains the times in seconds converted to long to make them safer
     * to use.
     *
     * <p>They are stored in order from earliest (lowest) time to latest (highest). A transition is
     * identified by its index within this array. A transition {@code T} is active at a specific
     * time {@code X} if {@code T} is the highest transition whose time is less than or equal to
     * {@code X}.
     *
     * @see #mTypes
     */
    final long[] mTransitions;

    /**
     * The type of the transition, where type is a pair consisting of the offset and whether the
     * offset includes DST or not.
     *
     * <p>Each transition in {@link #mTransitions} has an associated type in this array at the same
     * index. The type is an index into the arrays {@link #mOffsets} and {@link #mIsDsts} that each
     * contain one part of the pair.
     *
     * <p>In the {@link ZoneInfoData tzfile} structure the type array only contains unique instances
     * of the {@code struct ttinfo} to save space and each type may be referenced by multiple
     * transitions. However, the type pairs stored in this class are not guaranteed unique because
     * they do not include the {@code tt_abbrind}, which is the abbreviated identifier to use for
     * the time zone after the transition.
     *
     * @see #mTransitions
     * @see #mOffsets
     * @see #mIsDsts
     */
    final byte[] mTypes;

    /**
     * The offset parts of the transition types, in seconds.
     *
     * <p>These are actually a delta to the {@link #mRawOffset}. So, if the offset is say +7200
     * seconds and {@link #mRawOffset} is say +3600 then this will have a value of +3600.
     *
     * <p>The offset in milliseconds can be computed using:
     * {@code mRawOffset + mOffsets[type] * 1000}
     *
     * @see #mTypes
     * @see #mIsDsts
     */
    final int[] mOffsets;

    /**
     * Specifies whether an associated offset includes DST or not.
     *
     * <p>Each entry in here is 1 if the offset at the same index in {@link #mOffsets} includes DST
     * and 0 otherwise.
     *
     * @see #mTypes
     * @see #mOffsets
     */
    final byte[] mIsDsts;

    private ZoneInfoData(String id, int rawOffset, int earliestRawOffset,
            long[] transitions, byte[] types, int[] offsets, byte[] isDsts) {
        mId = id;
        mRawOffset = rawOffset;
        mEarliestRawOffset = earliestRawOffset;
        mTransitions = transitions;
        mTypes = types;
        mOffsets = offsets;
        mIsDsts = isDsts;
    }

    /**
     * Copy constructor
     */
    private ZoneInfoData(ZoneInfoData that) {
        this(that, that.mRawOffset);
    }

    /**
     * Copy constructor with a new raw offset.
     */
    private ZoneInfoData(ZoneInfoData that, int newRawOffset) {
        mRawOffset = newRawOffset;
        mId = that.mId;
        mEarliestRawOffset = that.mEarliestRawOffset;
        mTransitions = that.mTransitions == null ? null : that.mTransitions.clone();
        mTypes = that.mTypes == null ? null : that.mTypes.clone();
        mOffsets = that.mOffsets == null ? null : that.mOffsets.clone();
        mIsDsts = that.mIsDsts == null ? null : that.mIsDsts.clone();
    }

    // VisibleForTesting
    public static ZoneInfoData readTimeZone(String id, BufferIterator it)
            throws IOException {

        // Skip over the superseded 32-bit header and data.
        skipOver32BitData(id, it);

        // Read the v2+ 64-bit header and data.
        return read64BitData(id, it);
    }

    /**
     * Skip over the 32-bit data with some minimal validation to make sure sure we reading a valid
     * and supported file.
     */
    private static void skipOver32BitData(String id, BufferIterator it) throws IOException {
        // Variable names beginning tzh_ correspond to those in "tzfile.h".

        // Check tzh_magic.
        int tzh_magic = it.readInt();
        if (tzh_magic != 0x545a6966) { // "TZif"
            throw new IOException("Timezone id=" + id + " has an invalid header=" + tzh_magic);
        }

        byte tzh_version = it.readByte();
        checkTzifVersionAcceptable(id, tzh_version);

        // Skip the unused bytes.
        it.skip(15);

        // Read the header values necessary to read through all the 32-bit data.
        int tzh_ttisgmtcnt = it.readInt();
        int tzh_ttisstdcnt = it.readInt();
        int tzh_leapcnt = it.readInt();
        int tzh_timecnt = it.readInt();
        int tzh_typecnt = it.readInt();
        int tzh_charcnt = it.readInt();

        // Skip transitions data, 4 bytes for each 32-bit time + 1 byte for isDst.
        final int transitionInfoSize = 4 + 1;
        it.skip(tzh_timecnt * transitionInfoSize);

        // Skip ttinfos.
        // struct ttinfo {
        //     int32_t       tt_gmtoff;
        //     unsigned char tt_isdst;
        //     unsigned char tt_abbrind;
        // };
        final int ttinfoSize = 4 + 1 + 1;
        it.skip(tzh_typecnt * ttinfoSize);

        // Skip tzh_charcnt time zone abbreviations.
        it.skip(tzh_charcnt);

        // Skip tzh_leapcnt repetitions of a 32-bit time + a 32-bit correction.
        int leapInfoSize = 4 + 4;
        it.skip(tzh_leapcnt * leapInfoSize);

        // Skip ttisstds and ttisgmts information. These can be ignored for our usecases as per
        // https://mm.icann.org/pipermail/tz/2006-February/013359.html
        it.skip(tzh_ttisstdcnt + tzh_ttisgmtcnt);
    }

    /**
     * Read the 64-bit header and data for {@code id} from the current position of {@code it} and
     * return a ZoneInfo.
     */
    private static ZoneInfoData read64BitData(String id, BufferIterator it)
            throws IOException {
        // Variable names beginning tzh_ correspond to those in "tzfile.h".

        // Check tzh_magic.
        int tzh_magic = it.readInt();
        if (tzh_magic != 0x545a6966) { // "TZif"
            throw new IOException("Timezone id=" + id + " has an invalid header=" + tzh_magic);
        }

        byte tzh_version = it.readByte();
        checkTzifVersionAcceptable(id, tzh_version);

        // Skip the uninteresting parts of the header.
        it.skip(27);

        // Read the sizes of the arrays we're about to read.
        int tzh_timecnt = it.readInt();

        // Arbitrary ceiling to prevent allocating memory for corrupt data.
        final int MAX_TRANSITIONS = 2000;
        if (tzh_timecnt < 0 || tzh_timecnt > MAX_TRANSITIONS) {
            throw new IOException(
                    "Timezone id=" + id + " has an invalid number of transitions="
                            + tzh_timecnt);
        }

        int tzh_typecnt = it.readInt();
        final int MAX_TYPES = 256;
        if (tzh_typecnt < 1) {
            throw new IOException("ZoneInfo requires at least one type "
                    + "to be provided for each timezone but could not find one for '" + id
                    + "'");
        } else if (tzh_typecnt > MAX_TYPES) {
            throw new IOException(
                    "Timezone with id " + id + " has too many types=" + tzh_typecnt);
        }

        it.skip(4); // Skip tzh_charcnt.

        long[] transitions64 = new long[tzh_timecnt];
        it.readLongArray(transitions64, 0, transitions64.length);
        for (int i = 0; i < tzh_timecnt; ++i) {
            if (i > 0 && transitions64[i] <= transitions64[i - 1]) {
                throw new IOException(
                        id + " transition at " + i + " is not sorted correctly, is "
                                + transitions64[i] + ", previous is " + transitions64[i - 1]);
            }
        }

        byte[] types = new byte[tzh_timecnt];
        it.readByteArray(types, 0, types.length);
        for (int i = 0; i < types.length; i++) {
            int typeIndex = types[i] & 0xff;
            if (typeIndex >= tzh_typecnt) {
                throw new IOException(
                        id + " type at " + i + " is not < " + tzh_typecnt + ", is "
                                + typeIndex);
            }
        }

        int[] gmtOffsets = new int[tzh_typecnt];
        byte[] isDsts = new byte[tzh_typecnt];
        for (int i = 0; i < tzh_typecnt; ++i) {
            gmtOffsets[i] = it.readInt();
            byte isDst = it.readByte();
            if (isDst != 0 && isDst != 1) {
                throw new IOException(id + " dst at " + i + " is not 0 or 1, is " + isDst);
            }
            isDsts[i] = isDst;
            // We skip the abbreviation index. This would let us provide historically-accurate
            // time zone abbreviations (such as "AHST", "YST", and "AKST" for standard time in
            // America/Anchorage in 1982, 1983, and 1984 respectively). ICU only knows the current
            // names, though, so even if we did use this data to provide the correct abbreviations
            // for en_US, we wouldn't be able to provide correct abbreviations for other locales,
            // nor would we be able to provide correct long forms (such as "Yukon Standard Time")
            // for any locale. (The RI doesn't do any better than us here either.)
            it.skip(1);
        }
        return new ZoneInfoData(id, transitions64, types, gmtOffsets, isDsts);
    }

    private static void checkTzifVersionAcceptable(String id, byte tzh_version) throws IOException {
        char tzh_version_char = (char) tzh_version;
        // Version >= 2 is required because the 64-bit time section is required. v3 is the latest
        // version known at the time of writing and is identical to v2 in the parts used by this
        // class.
        if (tzh_version_char != '2' && tzh_version_char != '3') {
            throw new IOException(
                    "Timezone id=" + id + " has an invalid format version=\'" + tzh_version_char
                            + "\' (" + tzh_version + ")");
        }
    }

    private ZoneInfoData(String name, long[] transitions, byte[] types, int[] gmtOffsets,
            byte[] isDsts) {
        if (gmtOffsets.length == 0) {
            throw new IllegalArgumentException("ZoneInfo requires at least one offset "
                    + "to be provided for each timezone but could not find one for '" + name + "'");
        }
        mTransitions = transitions;
        mTypes = types;
        mIsDsts = isDsts;
        mId = name;

        // Find the latest standard offsets (if any).
        int lastStdTransitionIndex = -1;
        for (int i = mTransitions.length - 1; lastStdTransitionIndex == -1 && i >= 0; --i) {
            int typeIndex = mTypes[i] & 0xff;
            if (lastStdTransitionIndex == -1 && mIsDsts[typeIndex] == 0) {
                lastStdTransitionIndex = i;
            }
        }

        final int rawOffsetInSeconds;
        // Use the latest non-daylight offset (if any) as the raw offset.
        if (mTransitions.length == 0) {
            // This case is no longer expected to occur in the data used on Android after changes
            // made in zic version 2014c. It is kept as a fallback.
            // If there are no transitions then use the first GMT offset.
            rawOffsetInSeconds = gmtOffsets[0];
        } else {
            if (lastStdTransitionIndex == -1) {
                throw new IllegalStateException( "ZoneInfo requires at least one non-DST "
                        + "transition to be provided for each timezone that has at least one "
                        + "transition but could not find one for '" + name + "'");
            }
            rawOffsetInSeconds = gmtOffsets[mTypes[lastStdTransitionIndex] & 0xff];
        }

        // From the tzfile docs (Jan 2019):
        // The localtime(3) function uses the first standard-time ttinfo structure
        // in the file (or simply the first ttinfo structure in the absence of a
        // standard-time structure) if either tzh_timecnt is zero or the time
        // argument is less than the first transition time recorded in the file.
        //
        // Cache the raw offset associated with the first nonDst type, in case we're asked about
        // times that predate our transition data. Android falls back to mRawOffset if there are
        // only DST ttinfo structures (assumed rare).
        int firstStdTypeIndex = -1;
        for (int i = 0; i < mIsDsts.length; ++i) {
            if (mIsDsts[i] == 0) {
                firstStdTypeIndex = i;
                break;
            }
        }

        int earliestRawOffset = (firstStdTypeIndex != -1)
                ? gmtOffsets[firstStdTypeIndex] : rawOffsetInSeconds;

        // Rather than keep offsets from UTC, we use offsets from local time, so the raw offset
        // can be changed in the new instance and automatically affects all the offsets.
        mOffsets = gmtOffsets;
        for (int i = 0; i < mOffsets.length; i++) {
            mOffsets[i] -= rawOffsetInSeconds;
        }

        // tzdata uses seconds, but Java uses milliseconds.
        mRawOffset = rawOffsetInSeconds * 1000;
        mEarliestRawOffset = earliestRawOffset * 1000;
    }

    /**
     * Create an instance from the serialized fields from {@link libcore.util.ZoneInfo}
     * for backward app compatibility.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public static @NonNull ZoneInfoData createFromSerializationFields(@NonNull String id,
            @NonNull GetField getField)
            throws IOException {
        int rawOffset = getField.get("mRawOffset", 0);
        int earliestRawOffset = getField.get("mEarliestRawOffset", 0);
        long[] transitions = (long[]) getField.get("mTransitions", null);
        byte[] types = (byte[]) getField.get("mTypes", null);
        int[] offsets = (int[]) getField.get("mOffsets", null);
        byte[] isDsts = (byte[]) getField.get("mIsDsts", null);

        return new ZoneInfoData(id, rawOffset, earliestRawOffset, transitions, types, offsets,
                isDsts);
    }

    /**
     * Serialize {@link libcore.util.ZoneInfo} into backward app compatible form.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public void writeToSerializationFields(@NonNull PutField putField) {
        putField.put("mRawOffset", mRawOffset);
        putField.put("mEarliestRawOffset", mEarliestRawOffset);
        putField.put("mTransitions", mTransitions);
        putField.put("mTypes", mTypes);
        putField.put("mOffsets", mOffsets);
        putField.put("mIsDsts", mIsDsts);
    }

    /**
     * Find the transition in the {@code timezone} in effect at {@code seconds}.
     *
     * <p>Returns an index in the range -1..timeZone.mTransitions.length - 1. -1 is used to
     * indicate the time is before the first transition. Other values are an index into
     * timeZone.mTransitions.
     */
    public int findTransitionIndex(long seconds) {
        int transition = Arrays.binarySearch(mTransitions, seconds);
        if (transition < 0) {
            transition = ~transition - 1;
            if (transition < 0) {
                return -1;
            }
        }

        return transition;
    }

    /**
     * Finds the index within the {@link #mOffsets}/{@link #mIsDsts} arrays for the specified time
     * in seconds, since 1st Jan 1970 00:00:00.
     * @param seconds the time in seconds.
     * @return -1 if the time is before the first transition, or [0..{@code mOffsets}-1] for the
     * active offset.
     */
    int findOffsetIndexForTimeInSeconds(long seconds) {
        int transition = findTransitionIndex(seconds);
        if (transition < 0) {
            return -1;
        }

        return mTypes[transition] & 0xff;
    }

    /**
     * Finds the index within the {@link #mOffsets}/{@link #mIsDsts} arrays for the specified time
     * in milliseconds, since 1st Jan 1970 00:00:00.000.
     * @param millis the time in milliseconds.
     * @return -1 if the time is before the first transition, or [0..{@code mOffsets}-1] for the
     * active offset.
     */
    int findOffsetIndexForTimeInMilliseconds(long millis) {
        // This rounds the time in milliseconds down to the time in seconds.
        //
        // It can't just divide a timestamp in millis by 1000 to obtain a transition time in
        // seconds because / (div) in Java rounds towards zero. Times before 1970 are negative and
        // if they have a millisecond component then div would result in obtaining a time that is
        // one second after what we need.
        //
        // e.g. dividing -12,001 milliseconds by 1000 would result in -12 seconds. If there was a
        //      transition at -12 seconds then that would be incorrectly treated as being active
        //      for a time of -12,001 milliseconds even though that time is before the transition
        //      should occur.

        return findOffsetIndexForTimeInSeconds(roundDownMillisToSeconds(millis));
    }

    /**
     * Converts time in milliseconds into a time in seconds, rounding down to the closest time
     * in seconds before the time in milliseconds.
     *
     * <p>It's not sufficient to simply divide by 1000 because that rounds towards 0 and so while
     * for positive numbers it produces a time in seconds that precedes the time in milliseconds
     * for negative numbers it can produce a time in seconds that follows the time in milliseconds.
     *
     * <p>This basically does the same as {@code (long) Math.floor(millis / 1000.0)} but should be
     * faster.
     *
     * @param millis the time in milliseconds, may be negative.
     * @return the time in seconds.
     */
    static long roundDownMillisToSeconds(long millis) {
        if (millis < 0) {
            // If the time is less than zero then subtract 999 and then divide by 1000 rounding
            // towards 0 as usual, e.g.
            // -12345 -> -13344 / 1000 = -13
            // -12000 -> -12999 / 1000 = -12
            // -12001 -> -13000 / 1000 = -13
            return (millis - 999) / 1000;
        } else {
            return millis / 1000;
        }
    }

    /**
     * Converts time in milliseconds into a time in seconds, rounding up to the closest time
     * in seconds before the time in milliseconds.
     *
     * <p>It's not sufficient to simply divide by 1000 because that rounds towards 0 and so while
     * for negative numbers it produces a time in seconds that follows the time in milliseconds
     * for positive numbers it can produce a time in seconds that precedes the time in milliseconds.
     *
     * <p>This basically does the same as {@code (long) Math.ceil(millis / 1000.0)} but should be
     * faster.
     *
     * @param millis the time in milliseconds, may be negative.
     * @return the time in seconds.
     */
    static long roundUpMillisToSeconds(long millis) {
        if (millis > 0) {
            // If the time is greater than zero then add 999 and then divide by 1000 rounding
            // towards 0 as usual, e.g.
            // 12345 -> 13344 / 1000 = 13
            // 12000 -> 12999 / 1000 = 12
            // 12001 -> 13000 / 1000 = 13
            return (millis + 999) / 1000;
        } else {
            return millis / 1000;
        }
    }

    /**
     * Get the raw and DST offsets for the specified time in milliseconds since
     * 1st Jan 1970 00:00:00.000 UTC.
     *
     * <p>The raw offset, i.e. that part of the total offset which is not due to DST, is stored at
     * index 0 of the {@code offsets} array and the DST offset, i.e. that part of the offset which
     * is due to DST is stored at index 1.
     *
     * @param utcTimeInMillis the UTC time in milliseconds.
     * @param offsets the array whose length must be greater than or equal to 2.
     * @return the total offset which is the sum of the raw and DST offsets.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public int getOffsetsByUtcTime(long utcTimeInMillis, @NonNull int[] offsets) {
        int transitionIndex = findTransitionIndex(roundDownMillisToSeconds(utcTimeInMillis));
        int totalOffset;
        int rawOffset;
        int dstOffset;
        if (transitionIndex == -1) {
            // See getOffset(long) and inDaylightTime(Date) for an explanation as to why these
            // values are used for times before the first transition.
            rawOffset = mEarliestRawOffset;
            dstOffset = 0;
            totalOffset = rawOffset;
        } else {
            int type = mTypes[transitionIndex] & 0xff;

            // Get the total offset used for the transition.
            totalOffset = mRawOffset + mOffsets[type] * 1000;
            if (mIsDsts[type] == 0) {
                // Offset does not include DST so DST is 0 and the raw offset is the total offset.
                rawOffset = totalOffset;
                dstOffset = 0;
            } else {
                // Offset does include DST, we need to find the preceding transition that did not
                // include the DST offset so that we can calculate the DST offset.
                rawOffset = -1;
                for (transitionIndex -= 1; transitionIndex >= 0; --transitionIndex) {
                    type = mTypes[transitionIndex] & 0xff;
                    if (mIsDsts[type] == 0) {
                        rawOffset = mRawOffset + mOffsets[type] * 1000;
                        break;
                    }
                }
                // If no previous transition was found then use the earliest raw offset.
                if (rawOffset == -1) {
                    rawOffset = mEarliestRawOffset;
                }

                // The DST offset is the difference between the total and the raw offset.
                dstOffset = totalOffset - rawOffset;
            }
        }

        offsets[0] = rawOffset;
        offsets[1] = dstOffset;

        return totalOffset;
    }

    /**
     * Returns the offset from UTC in milliseconds at the specified time {@when}.
     *
     * @param when the number of milliseconds since January 1, 1970, 00:00:00 GMT
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public int getOffset(long when) {
        int offsetIndex = findOffsetIndexForTimeInMilliseconds(when);
        if (offsetIndex == -1) {
            // Assume that all times before our first transition correspond to the
            // oldest-known non-daylight offset. The obvious alternative would be to
            // use the current raw offset, but that seems like a greater leap of faith.
            return mEarliestRawOffset;
        }
        return mRawOffset + mOffsets[offsetIndex] * 1000;
    }

    /**
     * Returns whether the given {@code when} is in daylight saving time in this time zone.
     *
     * @param when the number of milliseconds since January 1, 1970, 00:00:00 GMT
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public boolean isInDaylightTime(long when) {
        int offsetIndex = findOffsetIndexForTimeInMilliseconds(when);
        if (offsetIndex == -1) {
            // Assume that all times before our first transition are non-daylight.
            // Transition data tends to start with a transition to daylight, so just
            // copying the first transition would assume the opposite.
            // http://code.google.com/p/android/issues/detail?id=14395
            return false;
        }
        return mIsDsts[offsetIndex] == 1;
    }

    /**
     * Returns the raw offset in milliseconds. The value is not affected by daylight saving.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public int getRawOffset() {
        return mRawOffset;
    }

    /**
     * Returns the offset of daylight saving in milliseconds in the latest Daylight Savings Time
     * after the time {@code when}. If no known DST occurs after {@code when}, it returns
     * {@code null}.
     *
     * @param when the number of milliseconds since January 1, 1970, 00:00:00 GMT
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public @Nullable Integer getLatestDstSavingsMillis(long when) {
        // Find the latest daylight and standard offsets (if any).
        int lastStdTransitionIndex = -1;
        int lastDstTransitionIndex = -1;
        for (int i = mTransitions.length - 1;
                (lastStdTransitionIndex == -1 || lastDstTransitionIndex == -1) && i >= 0; --i) {
            int typeIndex = mTypes[i] & 0xff;
            if (lastStdTransitionIndex == -1 && mIsDsts[typeIndex] == 0) {
                lastStdTransitionIndex = i;
            }
            if (lastDstTransitionIndex == -1 && mIsDsts[typeIndex] != 0) {
                lastDstTransitionIndex = i;
            }
        }

        if (lastDstTransitionIndex != -1) {
            // Check to see if the last DST transition is in the future or the past. If it is in
            // the past then we treat it as if it doesn't exist, at least for the purposes of
            // TimeZone#useDaylightTime() and #getDSTSavings()
            long lastDSTTransitionTime = mTransitions[lastDstTransitionIndex];

            // Convert the current time in millis into seconds. Unlike other places that convert
            // time in milliseconds into seconds in order to compare with transition time this
            // rounds up rather than down. It does that because this is interested in what
            // transitions apply in future
            long currentUnixTimeSeconds = roundUpMillisToSeconds(when);

            // Is this zone observing DST currently or in the future?
            // We don't care if they've historically used it: most places have at least once.
            // See http://b/36905574.
            // This test means that for somewhere like Morocco, which tried DST in 2009 but has
            // no future plans (and thus no future schedule info) will report "true" from
            // useDaylightTime at the start of 2009 but "false" at the end. This seems appropriate.
            if (lastDSTTransitionTime < currentUnixTimeSeconds) {
                // The last DST transition is before now so treat it as if it doesn't exist.
                lastDstTransitionIndex = -1;
            }
        }

        final Integer dstSavings;
        if (lastDstTransitionIndex == -1) {
            // There were no DST transitions or at least no future DST transitions so DST is not
            // used.
            dstSavings = null;
        } else {
            // Use the latest transition's pair of offsets to compute the DST savings.
            // This isn't generally useful, but it's exposed by TimeZone.getDSTSavings.
            int lastGmtOffset = mOffsets[mTypes[lastStdTransitionIndex] & 0xff];
            int lastDstOffset = mOffsets[mTypes[lastDstTransitionIndex] & 0xff];
            dstSavings = (lastDstOffset - lastGmtOffset) * 1000;
        }
        return dstSavings;
    }

    int getEarliestRawOffset() {
        return mEarliestRawOffset;
    }

    /**
     * Returns {@code true} if 2 time zones have the same time zone rule.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public boolean hasSameRules(@NonNull ZoneInfoData other) {
        return mRawOffset == other.mRawOffset
                // Arrays.equals returns true if both arrays are null
                && Arrays.equals(mOffsets, other.mOffsets)
                && Arrays.equals(mIsDsts, other.mIsDsts)
                && Arrays.equals(mTypes, other.mTypes)
                && Arrays.equals(mTransitions, other.mTransitions);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ZoneInfoData)) {
            return false;
        }
        ZoneInfoData other = (ZoneInfoData) obj;
        return getID().equals(other.getID()) && hasSameRules(other);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getID().hashCode();
        result = prime * result + Arrays.hashCode(mOffsets);
        result = prime * result + Arrays.hashCode(mIsDsts);
        result = prime * result + mRawOffset;
        result = prime * result + Arrays.hashCode(mTransitions);
        result = prime * result + Arrays.hashCode(mTypes);
        return result;
    }

    /**
     * Returns a string containing the internal states for debug purpose.
     */
    @Override
    public String toString() {
        return "[id=\"" + getID() + "\"" +
            ",mRawOffset=" + mRawOffset +
            ",mEarliestRawOffset=" + mEarliestRawOffset +
            ",transitions=" + mTransitions.length +
            "]";
    }

    /**
     * Returns the time zone id.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    @libcore.api.IntraCoreApi
    public @NonNull String getID() {
        return mId;
    }

    /**
     * Create a deep copy of this object with a new raw offset.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public @NonNull ZoneInfoData createCopyWithRawOffset(int newRawOffset) {
        return new ZoneInfoData(this, newRawOffset);
    }

    /**
     * Returns the times (in seconds) at which the offsets changes for any reason, whether that is a
     * change in the offset from UTC or a change in the DST.
     *
     * WARNING: This API is exposed only for app compat usage in @link libcore.util.ZoneInfo}.
     *
     * @hide
     */
    @libcore.api.IntraCoreApi
    public @Nullable long[] getTransitions() {
        return mTransitions == null ? null : mTransitions.clone();
    }

    /**
     * Creates an instance. This method is only for testing purposes.
     *
     * @param transitions The times (in seconds) since beginning of the Unix epoch at which
     *                    the offsets changes
     * @param types the type of the transition. The offsets and standard/daylight states are
     *              represented in the corresponding entry in <code>offsets</code> and
     *              <code>isDsts</code> respectively
     * @param offsets the total offsets of each type. The max allowed size of this array is 256.
     * @param isDsts an entry is {@code true} if the type is daylight saving time. The max allowed
     *               size of this array is 256.
     * @hide
     */
    @libcore.api.IntraCoreApi
    public static @NonNull ZoneInfoData createInstance(@NonNull String id,
            @NonNull long[] transitions, @NonNull byte[] types, @NonNull int[] offsets,
            @NonNull boolean[] isDsts) {
        return new ZoneInfoData(id, transitions, types, offsets, toByteArray(isDsts));
    }

    private static byte[] toByteArray(boolean[] isDsts) {
        byte[] result = new byte[isDsts.length];
        for (int i = 0; i < isDsts.length; i++) {
            result[i] = (byte) (isDsts[i] ? 1 : 0);
        }
        return result;
    }
}
