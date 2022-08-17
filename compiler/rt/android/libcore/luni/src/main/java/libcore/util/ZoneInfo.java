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
package libcore.util;

import android.compat.annotation.UnsupportedAppUsage;

import com.android.i18n.timezone.ZoneInfoData;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.ObjectStreamField;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

/**
 *  Our concrete TimeZone implementation, backed by a {@link ZoneInfoData}. This class is not
 *  thread-safe.
 *
 * This class exists in this package and has certain fields / a defined serialization footprint for
 * app compatibility reasons. The knowledge of the underlying file format has been split out into
 * {@link ZoneInfoData} which is intended to be updated independently of the classes in
 * libcore.util.
 *
 * @hide - used to implement TimeZone
 */
public final class ZoneInfo extends TimeZone {
    private static final long MILLISECONDS_PER_DAY = 24 * 60 * 60 * 1000;
    private static final long MILLISECONDS_PER_400_YEARS =
            MILLISECONDS_PER_DAY * (400 * 365 + 100 - 3);

    private static final long UNIX_OFFSET = 62167219200000L;

    private static final int[] NORMAL = new int[] {
            0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334,
    };

    private static final int[] LEAP = new int[] {
            0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335,
    };

    // Proclaim serialization compatibility with pre-OpenJDK AOSP
    static final long serialVersionUID = -4598738130123921552L;

    /**
     * Keep the serialization compatibility even though most of the fields have been moved to
     * {@link ZoneInfoData}. Originally, Android just had the Serializable subclass of TimeZone,
     * ZoneInfo. This has been split into two: ZoneInfoData is now responsible for the immutable
     * data fields, and this class holds the rest.
     */
    private static final ObjectStreamField[] serialPersistentFields;

    static {
        int srcLen = ZoneInfoData.ZONEINFO_SERIALIZED_FIELDS.length;
        serialPersistentFields = new ObjectStreamField[2 + srcLen];
        // Serialize mDstSavings and mUseDst fields, but not mTransitions because the
        // ZoneInfoData delegate should handle it.
        serialPersistentFields[0] = new ObjectStreamField("mDstSavings", int.class);
        serialPersistentFields[1] = new ObjectStreamField("mUseDst", boolean.class);
        System.arraycopy(ZoneInfoData.ZONEINFO_SERIALIZED_FIELDS, 0 /* srcPos */,
                serialPersistentFields, 2 /* destPos */, srcLen /* length */);
    }

    /**
     * Implements {@link #useDaylightTime()}
     *
     * <p>True if the transition active at the time this instance was created, or future
     * transitions support DST. It is possible that caching this value at construction time and
     * using it for the lifetime of the instance does not match the contract of the
     * {@link java.util.TimeZone#useDaylightTime()} method but it appears to be what the RI does
     * and that method is not particularly useful when it comes to historical or future times as it
     * does not allow the time to be specified.
     *
     * <p>When this is false then {@link #mDstSavings} will be 0.
     *
     * @see #mDstSavings
     */
    private final boolean mUseDst;

    /**
     * Implements {@link #getDSTSavings()}
     *
     * @see #mUseDst
     */
    private final int mDstSavings;

    /**
     * This field is kept only for app compatibility indicated by @UnsupportedAppUsage. Do not
     * modify the content of this array as it is a reference to an internal data structure used by
     * mDelegate.
     */
    @UnsupportedAppUsage
    private final long[] mTransitions;

    /**
     * Despite being transient, mDelegate is still serialized as part of this object. Please
     * see {@link #readObject(ObjectInputStream)} and {@link #writeObject(ObjectOutputStream)}
     */
    private transient ZoneInfoData mDelegate;

    /**
     * Creates an instance using the current system clock time to calculate the {@link #mDstSavings}
     * and {@link #mUseDst} fields. See also {@link #createZoneInfo(ZoneInfoData, long)}.
     */
    public static ZoneInfo createZoneInfo(ZoneInfoData delegate) {
        return createZoneInfo(delegate, System.currentTimeMillis());
    }

    /**
     * Creates an instance and recalculate the fields {@link #mDstSavings} and {@link #mUseDst} from
     * the {@code timeInMillis}.
     */
    // VisibleForTesting
    public static ZoneInfo createZoneInfo(ZoneInfoData delegate, long timeInMillis) {
        Integer latestDstSavings = delegate.getLatestDstSavingsMillis(timeInMillis);
        boolean useDst = latestDstSavings != null;
        int dstSavings = latestDstSavings == null ? 0 : latestDstSavings;
        return new ZoneInfo(delegate, dstSavings, useDst);
    }

    private ZoneInfo(ZoneInfoData delegate, int dstSavings, boolean useDst) {
        mDelegate = delegate;
        mDstSavings = dstSavings;
        mUseDst = useDst;
        mTransitions = delegate.getTransitions();
        setID(delegate.getID());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        GetField getField = in.readFields();
        // TimeZone#getID() should return the proper ID because the fields in the superclass should
        // have been deserialized.
        mDelegate = ZoneInfoData.createFromSerializationFields(getID(), getField);

        // Set the final fields by reflection.
        boolean useDst = getField.get("mUseDst", false);
        int dstSavings = getField.get("mDstSavings", 0);
        long[] transitions = mDelegate.getTransitions();
        /** For pre-OpenJDK compatibility, ensure that when deserializing an instance that
         * {@link #mDstSavings} is always 0 when {@link #mUseDst} is false
         */
        if (!useDst && dstSavings != 0) {
            dstSavings = 0;
        }
        int finalDstSavings = dstSavings;
        setFinalField("mDstSavings", (f -> f.setInt(this, finalDstSavings)));
        setFinalField("mUseDst", (f -> f.setBoolean(this, useDst)));
        setFinalField("mTransitions", (f -> f.set(this, transitions)));
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        PutField putField = out.putFields();
        putField.put("mUseDst", mUseDst);
        putField.put("mDstSavings", mDstSavings);
        // mDelegate writes the field mTransitions.
        mDelegate.writeToSerializationFields(putField);
        out.writeFields();
    }

    private static void setFinalField(String field, FieldSetter setter) {
        try {
            Field mTransitionsField = ZoneInfo.class.getDeclaredField(field);
            mTransitionsField.setAccessible(true);
            setter.set(mTransitionsField);
        } catch (ReflectiveOperationException e) {
            // The field should always exist because it's a member field in this class.
        }
    }

    private interface FieldSetter {
        void set(Field field) throws IllegalArgumentException, IllegalAccessException;
    }

    @Override
    public int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis) {
        // XXX This assumes Gregorian always; Calendar switches from
        // Julian to Gregorian in 1582.  What calendar system are the
        // arguments supposed to come from?

        long calc = (year / 400) * MILLISECONDS_PER_400_YEARS;
        year %= 400;

        calc += year * (365 * MILLISECONDS_PER_DAY);
        calc += ((year + 3) / 4) * MILLISECONDS_PER_DAY;

        if (year > 0) {
            calc -= ((year - 1) / 100) * MILLISECONDS_PER_DAY;
        }

        boolean isLeap = (year == 0 || (year % 4 == 0 && year % 100 != 0));
        int[] mlen = isLeap ? LEAP : NORMAL;

        calc += mlen[month] * MILLISECONDS_PER_DAY;
        calc += (day - 1) * MILLISECONDS_PER_DAY;
        calc += millis;

        calc -= mDelegate.getRawOffset();
        calc -= UNIX_OFFSET;

        return mDelegate.getOffset(calc);
    }

    @Override
    public int getOffset(long when) {
        return mDelegate.getOffset(when);
    }

    @Override
    public boolean inDaylightTime(Date time) {
        return mDelegate.isInDaylightTime(time.getTime());
    }

    @Override
    public int getRawOffset() {
        return mDelegate.getRawOffset();
    }

    @Override
    public void setRawOffset(int off) {
        mDelegate = mDelegate.createCopyWithRawOffset(off);
    }

    @Override
    public int getDSTSavings() {
        return mDstSavings;
    }

    @Override
    public boolean useDaylightTime() {
        return mUseDst;
    }

    @Override
    public boolean hasSameRules(TimeZone timeZone) {
        if (!(timeZone instanceof ZoneInfo)) {
            return false;
        }
        ZoneInfo other = (ZoneInfo) timeZone;

        if (mUseDst != other.mUseDst) {
            return false;
        }
        if (!mUseDst) {
            return mDelegate.getRawOffset() == other.getRawOffset();
        }
        return mDelegate.hasSameRules(other.mDelegate);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ZoneInfo)) {
            return false;
        }
        ZoneInfo other = (ZoneInfo) obj;
        return getID().equals(other.getID()) && hasSameRules(other);
    }

    @Override
    public int hashCode() {
        /*
         * TODO(http://b/173499812): Can 2 ZoneInfo objects have different hashCode but equals?
         * mDelegate.hashCode compares more fields than rules and ID.
         */
        return Objects.hash(mUseDst, mDelegate);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "[mDstSavings=" + mDstSavings +
                ",mUseDst=" + mUseDst +
                ",mDelegate=" + mDelegate.toString() + "]";
    }

    @Override
    public Object clone() {
        // Pass the mDstSavings and mUseDst explicitly because they must not be recalculated when
        // cloning. See {@link #create(ZoneInfoData)}.
        return new ZoneInfo(mDelegate, mDstSavings, mUseDst);
    }

    public int getOffsetsByUtcTime(long utcTimeInMillis, int[] offsets) {
        return mDelegate.getOffsetsByUtcTime(utcTimeInMillis, offsets);
    }
}
