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

package sun.misc;

import dalvik.system.VMStack;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * A collection of methods for performing low-level, unsafe operations.
 * Although the class and all methods are public, use of this class is
 * limited because only trusted code can obtain instances of it.
 *
 * @author John R. Rose
 * @see #getUnsafe
 */
public final class Unsafe {
    /** Traditional dalvik name. */
    private static final Unsafe THE_ONE = new Unsafe();
    /** Traditional RI name. */
    private static final Unsafe theUnsafe = THE_ONE;
    public static final int INVALID_FIELD_OFFSET   = -1;

    /**
     * This class is only privately instantiable.
     */
    private Unsafe() {}

    /**
     * Gets the unique instance of this class. This is only allowed in
     * very limited situations.
     */
    public static Unsafe getUnsafe() {
        /*
         * Only code on the bootclasspath is allowed to get at the
         * Unsafe instance.
         */
        // RoboVm Note: TODO: FIXME: getCallingClassLoader() causes force-loading of BootClassLoaded, System and VMRuntime as
        // result VMRuntime/System got referenced while their CLinit is not finished yet
//        ClassLoader calling = VMStack.getCallingClassLoader();
//        if ((calling != null) && (calling != Unsafe.class.getClassLoader())) {
//            throw new SecurityException("Unsafe access denied");
//        }

        return THE_ONE;
    }

    /**
     * Gets the raw byte offset from the start of an object's memory to
     * the memory used to store the indicated instance field.
     *
     * @param field non-null; the field in question, which must be an
     * instance field
     * @return the offset to the field
     */
    public long objectFieldOffset(Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            throw new IllegalArgumentException(
                    "valid for instance fields only");
        }

        return objectFieldOffset0(field);
    }

    /**
     * Helper for {@link #objectFieldOffset}, which does all the work,
     * assuming the parameter is deemed valid.
     *
     * @param field non-null; the instance field
     * @return the offset to the field
     */
    private static native long objectFieldOffset0(Field field);

    /**
     * Gets the offset from the start of an array object's memory to
     * the memory used to store its initial (zeroeth) element.
     *
     * @param clazz non-null; class in question; must be an array class
     * @return the offset to the initial element
     */
    public int arrayBaseOffset(Class clazz) {
        if (! clazz.isArray()) {
            throw new IllegalArgumentException(
                    "valid for array classes only");
        }

        return arrayBaseOffset0(clazz);
    }

    /**
     * Helper for {@link #arrayBaseOffset}, which does all the work,
     * assuming the parameter is deemed valid.
     *
     * @return the offset to the field
     */
    private static native int arrayBaseOffset0(Class clazz);

    /**
     * Gets the size of each element of the given array class.
     *
     * @param clazz non-null; class in question; must be an array class
     * @return &gt; 0; the size of each element of the array
     */
    public int arrayIndexScale(Class clazz) {
        if (! clazz.isArray()) {
            throw new IllegalArgumentException(
                    "valid for array classes only");
        }

        return arrayIndexScale0(clazz);
    }

    /**
     * Helper for {@link #arrayIndexScale}, which does all the work,
     * assuming the parameter is deemed valid.
     *
     * @return the offset to the field
     */
    private static native int arrayIndexScale0(Class clazz);

    /**
     * Performs a compare-and-set operation on an <code>int</code>
     * field within the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param expectedValue expected value of the field
     * @param newValue new value to store in the field if the contents are
     * as expected
     * @return <code>true</code> if the new value was in fact stored, and
     * <code>false</code> if not
     */
    public native boolean compareAndSwapInt(Object obj, long offset,
            int expectedValue, int newValue);

    /**
     * Performs a compare-and-set operation on a <code>long</code>
     * field within the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param expectedValue expected value of the field
     * @param newValue new value to store in the field if the contents are
     * as expected
     * @return <code>true</code> if the new value was in fact stored, and
     * <code>false</code> if not
     */
    public native boolean compareAndSwapLong(Object obj, long offset,
            long expectedValue, long newValue);

    /**
     * Performs a compare-and-set operation on an <code>Object</code>
     * field (that is, a reference field) within the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param expectedValue expected value of the field
     * @param newValue new value to store in the field if the contents are
     * as expected
     * @return <code>true</code> if the new value was in fact stored, and
     * <code>false</code> if not
     */
    public native boolean compareAndSwapObject(Object obj, long offset,
            Object expectedValue, Object newValue);

    /**
     * Gets an <code>int</code> field from the given object,
     * using <code>volatile</code> semantics.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native int getIntVolatile(Object obj, long offset);

    /**
     * Stores an <code>int</code> field into the given object,
     * using <code>volatile</code> semantics.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putIntVolatile(Object obj, long offset, int newValue);

    /**
     * Gets a <code>long</code> field from the given object,
     * using <code>volatile</code> semantics.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native long getLongVolatile(Object obj, long offset);

    /**
     * Stores a <code>long</code> field into the given object,
     * using <code>volatile</code> semantics.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putLongVolatile(Object obj, long offset, long newValue);

    /**
     * Gets an <code>Object</code> field from the given object,
     * using <code>volatile</code> semantics.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native Object getObjectVolatile(Object obj, long offset);

    /**
     * Stores an <code>Object</code> field into the given object,
     * using <code>volatile</code> semantics.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putObjectVolatile(Object obj, long offset,
            Object newValue);

    /**
     * Gets an <code>int</code> field from the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native int getInt(Object obj, long offset);

    /**
     * Gets a <code>boolean</code> field from the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native boolean getBoolean(Object obj, long offset);

    /**
     * Gets a <code>byte</code> field from the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native byte getByte(Object obj, long offset);

    /**
     * Stores an <code>int</code> field into the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putInt(Object obj, long offset, int newValue);

    /**
     * Stores a <code>boolean</code> field into the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putBoolean(Object obj, long offset, boolean newValue);

    /**
     * Stores a <code>byte</code> field into the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putByte(Object obj, long offset, byte newValue);

    /**
     * Gets an <code>float</code> field from the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native float getFloat(Object obj, long offset);
    
    /**
     * Stores an <code>float</code> field into the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putFloat(Object obj, long offset, float newValue);
    
    /**
     * Lazy set an int field.
     */
    public native void putOrderedInt(Object obj, long offset, int newValue);

    /**
     * Gets a <code>long</code> field from the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native long getLong(Object obj, long offset);

    /**
     * Stores a <code>long</code> field into the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putLong(Object obj, long offset, long newValue);

    /**
     * Lazy set a long field.
     */
    public native void putOrderedLong(Object obj, long offset, long newValue);

    /**
     * Gets an <code>Object</code> field from the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @return the retrieved value
     */
    public native Object getObject(Object obj, long offset);

    /**
     * Stores an <code>Object</code> field into the given object.
     *
     * @param obj non-null; object containing the field
     * @param offset offset to the field within <code>obj</code>
     * @param newValue the value to store
     */
    public native void putObject(Object obj, long offset, Object newValue);

    /**
     * Lazy set an object field.
     */
    public native void putOrderedObject(Object obj, long offset,
            Object newValue);

    /**
     * Parks the calling thread for the specified amount of time,
     * unless the "permit" for the thread is already available (due to
     * a previous call to {@link #unpark}. This method may also return
     * spuriously (that is, without the thread being told to unpark
     * and without the indicated amount of time elapsing).
     *
     * <p>See {@link java.util.concurrent.locks.LockSupport} for more
     * in-depth information of the behavior of this method.</p>
     *
     * @param absolute whether the given time value is absolute
     * milliseconds-since-the-epoch (<code>true</code>) or relative
     * nanoseconds-from-now (<code>false</code>)
     * @param time the (absolute millis or relative nanos) time value
     */
    public void park(boolean absolute, long time) {
        if (absolute) {
            Thread.currentThread().parkUntil(time);
        } else {
            Thread.currentThread().parkFor(time);
        }
    }

    /**
     * Unparks the given object, which must be a {@link Thread}.
     *
     * <p>See {@link java.util.concurrent.locks.LockSupport} for more
     * in-depth information of the behavior of this method.</p>
     *
     * @param obj non-null; the object to unpark
     */
    public void unpark(Object obj) {
        if (obj instanceof Thread) {
            ((Thread) obj).unpark();
        } else {
            throw new IllegalArgumentException("valid for Threads only");
        }
    }

    /**
     * Allocates an instance of the given class without running the constructor.
     * The class' <clinit> will be run, if necessary.
     */
    public native Object allocateInstance(Class<?> c);

    public native int addressSize();

    public native int pageSize();

    public native long allocateMemory(long bytes);

    public native void freeMemory(long address);

    public native void setMemory(long address, long bytes, byte value);

    public native void copyMemory(long srcAddr, long dstAddr, long bytes);

    public native byte getByte(long address);

    public native void putByte(long address, byte x);

    public native short getShort(long address);

    public native void putShort(long address, short x);

    public native char getChar(long address);

    public native void putChar(long address, char x);

    public native int getInt(long address);

    public native void putInt(long address, int x);

    public native long getLong(long address);

    public native void putLong(long address, long x);

    public native float getFloat(long address);

    public native void putFloat(long address, float x);

    public native double getDouble(long address);

    public native void putDouble(long address, double x);

    public native char getChar(Object obj, long offset);

    public native void putChar(Object obj, long offset, char newValue);

    public native short getShort(Object obj, long offset);

    public native void putShort(Object obj, long offset, short newValue);

    public native double getDouble(Object obj, long offset);

    public native void putDouble(Object obj, long offset, double newValue);

    // The following contain CAS-based Java implementations used on
    // platforms not supporting native instructions

    /**
     * Atomically adds the given value to the current value of a field
     * or array element within the given object {@code o}
     * at the given {@code offset}.
     *
     * @param o object/array to update the field/element in
     * @param offset field/element offset
     * @param delta the value to add
     * @return the previous value
     * @since 1.8
     */
    // @HotSpotIntrinsicCandidate
    public final int getAndAddInt(Object o, long offset, int delta) {
        int v;
        do {
            v = getIntVolatile(o, offset);
        } while (!compareAndSwapInt(o, offset, v, v + delta));
        return v;
    }

    /**
     * Atomically adds the given value to the current value of a field
     * or array element within the given object {@code o}
     * at the given {@code offset}.
     *
     * @param o object/array to update the field/element in
     * @param offset field/element offset
     * @param delta the value to add
     * @return the previous value
     * @since 1.8
     */
    // @HotSpotIntrinsicCandidate
    public final long getAndAddLong(Object o, long offset, long delta) {
        long v;
        do {
            v = getLongVolatile(o, offset);
        } while (!compareAndSwapLong(o, offset, v, v + delta));
        return v;
    }

    /**
     * Atomically exchanges the given value with the current value of
     * a field or array element within the given object {@code o}
     * at the given {@code offset}.
     *
     * @param o object/array to update the field/element in
     * @param offset field/element offset
     * @param newValue new value
     * @return the previous value
     * @since 1.8
     */
    // @HotSpotIntrinsicCandidate
    public final int getAndSetInt(Object o, long offset, int newValue) {
        int v;
        do {
            v = getIntVolatile(o, offset);
        } while (!compareAndSwapInt(o, offset, v, newValue));
        return v;
    }

    /**
     * Atomically exchanges the given value with the current value of
     * a field or array element within the given object {@code o}
     * at the given {@code offset}.
     *
     * @param o object/array to update the field/element in
     * @param offset field/element offset
     * @param newValue new value
     * @return the previous value
     * @since 1.8
     */
    // @HotSpotIntrinsicCandidate
    public final long getAndSetLong(Object o, long offset, long newValue) {
        long v;
        do {
            v = getLongVolatile(o, offset);
        } while (!compareAndSwapLong(o, offset, v, newValue));
        return v;
    }

    /**
     * Atomically exchanges the given reference value with the current
     * reference value of a field or array element within the given
     * object {@code o} at the given {@code offset}.
     *
     * @param o object/array to update the field/element in
     * @param offset field/element offset
     * @param newValue new value
     * @return the previous value
     * @since 1.8
     */
    public final Object getAndSetObject(Object o, long offset, Object newValue) {
        Object v;
        do {
            v = getObjectVolatile(o, offset);
        } while (!compareAndSwapObject(o, offset, v, newValue));
        return v;
    }


    /**
     * Ensures that loads before the fence will not be reordered with loads and
     * stores after the fence; a "LoadLoad plus LoadStore barrier".
     *
     * Corresponds to C11 atomic_thread_fence(memory_order_acquire)
     * (an "acquire fence").
     *
     * A pure LoadLoad fence is not provided, since the addition of LoadStore
     * is almost always desired, and most current hardware instructions that
     * provide a LoadLoad barrier also provide a LoadStore barrier for free.
     * @since 1.8
     */
    public native void loadFence();

    /**
     * Ensures that loads and stores before the fence will not be reordered with
     * stores after the fence; a "StoreStore plus LoadStore barrier".
     *
     * Corresponds to C11 atomic_thread_fence(memory_order_release)
     * (a "release fence").
     *
     * A pure StoreStore fence is not provided, since the addition of LoadStore
     * is almost always desired, and most current hardware instructions that
     * provide a StoreStore barrier also provide a LoadStore barrier for free.
     * @since 1.8
     */
    public native void storeFence();

    /**
     * Ensures that loads and stores before the fence will not be reordered
     * with loads and stores after the fence.  Implies the effects of both
     * loadFence() and storeFence(), and in addition, the effect of a StoreLoad
     * barrier.
     *
     * Corresponds to C11 atomic_thread_fence(memory_order_seq_cst).
     * @since 1.8
     */
    public native void fullFence();
}