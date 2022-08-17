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

package dalvik.system;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import android.compat.annotation.ChangeId;
import android.compat.annotation.EnabledSince;
import android.compat.annotation.Disabled;
import android.compat.annotation.UnsupportedAppUsage;

import dalvik.annotation.compat.VersionCodes;
import dalvik.annotation.optimization.FastNative;

import libcore.api.CorePlatformApi;

import java.lang.ref.FinalizerReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * Provides an interface to VM-global, Dalvik-specific features.
 * An application cannot create its own Runtime instance, and must obtain
 * one from the getRuntime method.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
@libcore.api.IntraCoreApi
public final class VMRuntime {

    /**
     * Holds the VMRuntime singleton.
     */
    private static final VMRuntime THE_ONE = new VMRuntime();

    // Note: Instruction set names are used to construct the names of some
    // system properties. To be sure that the properties stay valid the
    // instruction set name should not exceed 7 characters. See installd
    // and the package manager for the actual propeties.
    private static final Map<String, String> ABI_TO_INSTRUCTION_SET_MAP
            = new HashMap<String, String>(16);
    static {
        ABI_TO_INSTRUCTION_SET_MAP.put("armeabi", "arm");
        ABI_TO_INSTRUCTION_SET_MAP.put("armeabi-v7a", "arm");
        ABI_TO_INSTRUCTION_SET_MAP.put("mips", "mips");
        ABI_TO_INSTRUCTION_SET_MAP.put("mips64", "mips64");
        ABI_TO_INSTRUCTION_SET_MAP.put("x86", "x86");
        ABI_TO_INSTRUCTION_SET_MAP.put("x86_64", "x86_64");
        ABI_TO_INSTRUCTION_SET_MAP.put("arm64-v8a", "arm64");
        ABI_TO_INSTRUCTION_SET_MAP.put("arm64-v8a-hwasan", "arm64");
    }

    /**
     * Remove meta-reflection workaround for hidden api usage for apps targeting R+. This allowed
     * apps to obtain references to blocklist fields and methods through an extra layer of
     * reflection.
     */
    @ChangeId
    @EnabledSince(targetSdkVersion = VersionCodes.R)
    private static final long
        PREVENT_META_REFLECTION_BLOCKLIST_ACCESS = 142365358; // This is a bug id.

    /**
     * Gating access to greylist-max-p APIs.
     */
    @ChangeId
    @EnabledSince(targetSdkVersion = VersionCodes.Q)
    private static final long HIDE_MAXTARGETSDK_P_HIDDEN_APIS = 149997251; // This is a bug id.

    /**
     * Gating access to greylist-max-q APIs.
     */
    @ChangeId
    @EnabledSince(targetSdkVersion = VersionCodes.R)
    private static final long HIDE_MAXTARGETSDK_Q_HIDDEN_APIS = 149994052; // This is a bug id.

    /**
     * Allow apps accessing @TestApi APIs.
     *
     * <p>This will always be disabled by default and should only be used by platform test code.
     */
    @ChangeId
    @Disabled
    private static final long ALLOW_TEST_API_ACCESS = 166236554; // This is a bug id.

    /**
     * Interface for logging hidden API usage events.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public interface HiddenApiUsageLogger {

        // The following ACCESS_METHOD_ constants must match the values in
        // art/runtime/hidden_api.h
        /**
         * Internal test value that does not correspond to an actual access by the
         * application. Never logged, added for completeness.
         *
         * @hide
         */
        @SystemApi(client = MODULE_LIBRARIES)
        @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
        public static final int ACCESS_METHOD_NONE = 0;

        /**
         *  Used when a method has been accessed via reflection.
         *
         * @hide
         */
        @SystemApi(client = MODULE_LIBRARIES)
        @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
        public static final int ACCESS_METHOD_REFLECTION = 1;

        /**
         *  Used when a method has been accessed via JNI.
         *
         * @hide
         */
        @SystemApi(client = MODULE_LIBRARIES)
        @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
        public static final int ACCESS_METHOD_JNI = 2;

        /**
         * Used when a method is accessed at link time. Never logged, added only
         * for completeness.
         *
         * @hide
         */
        @SystemApi(client = MODULE_LIBRARIES)
        @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
        public static final int ACCESS_METHOD_LINKING = 3;

        /**
         * Logs hidden API access
         *
         * @param sampledValue value that was sampled, to be compared against the
         *      sampling rate
         * @param appPackageName package name of the app attempting the access
         * @param signature signature of the method being called, i.e
         *      class_name->member_name:type_signature (e.g.
         *      {@code com.android.app.Activity->mDoReportFullyDrawn:Z}) for fields and
         *      class_name->method_name_and_signature for methods (e.g
         *      {@code com.android.app.Activity->finish(I)V})
         * @param accessType how the accessed was done
         * @param accessDenied whether the access was allowed or not
         *
         * @hide
         */
        @SystemApi(client = MODULE_LIBRARIES)
        @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
        public void hiddenApiUsed(int sampledValue, String appPackageName,
            String signature, int accessType, boolean accessDenied);
    }

    static HiddenApiUsageLogger hiddenApiUsageLogger;

    /**
     * Sets the hidden API usage logger {@link #hiddenApiUsageLogger}.
     * It should only be called if {@link #setHiddenApiAccessLogSamplingRate(int)}
     * is called with a value > 0
     *
     * @param hiddenApiUsageLogger an object implement {@code HiddenApiUsageLogger} that the runtime
     *          will call for logging hidden API checks.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setHiddenApiUsageLogger(HiddenApiUsageLogger hiddenApiUsageLogger) {
        VMRuntime.hiddenApiUsageLogger = hiddenApiUsageLogger;
    }

    /**
     * Records an attempted hidden API access to
     * {@link HiddenApiUsageLogger#hiddenApiUsed(int, String, String, int, boolean}
     * if a logger is registered via {@link #setHiddenApiUsageLogger}.
     */
    private static void hiddenApiUsed(int sampledValue, String appPackageName, String signature,
         int accessType, boolean accessDenied) {
        if (VMRuntime.hiddenApiUsageLogger != null) {
            VMRuntime.hiddenApiUsageLogger.hiddenApiUsed(sampledValue, appPackageName,
                signature, accessType, accessDenied);
        }
    }

    /**
     * Magic version number for a current development build, which has not
     * yet turned into an official release. This number must be larger than
     * any released version in {@code android.os.Build.VERSION_CODES}.
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    // Must match android.os.Build.VERSION_CODES.CUR_DEVELOPMENT.
    public static final int SDK_VERSION_CUR_DEVELOPMENT = 10000;

    private static Consumer<String> nonSdkApiUsageConsumer = null;

    private int targetSdkVersion = SDK_VERSION_CUR_DEVELOPMENT;

    // notifyNativeAllocationsInternal (below) should be called every notifyNativeInterval
    // allocations. Initialized on demand to allow completely static class initialization.
    private int notifyNativeInterval;

    // Allocations since last call to native layer. See notifyNativeAllocation().
    private final AtomicInteger allocationCount = new AtomicInteger(0);

    private long[] disabledCompatChanges = new long[0];

    /**
     * Prevents this class from being instantiated.
     */
    private VMRuntime() {
    }

    /**
     * Returns the object that represents the current runtime.
     * @return the runtime object
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @libcore.api.IntraCoreApi
    public static VMRuntime getRuntime() {
        return THE_ONE;
    }

    /**
     * Returns a copy of the VM's command-line property settings.
     * These are in the form "name=value" rather than "-Dname=value".
     *
     * @hide
     */
    public native String[] properties();

    /**
     * Returns the VM's boot class path.
     *
     * @hide
     */
    public native String bootClassPath();

    /**
     * Returns the VM's class path.
     *
     * @hide
     */
    public native String classPath();

    /**
     * Returns the VM's version.
     *
     * @hide
     */
    public native String vmVersion();

    /**
     * Returns the name of the shared library providing the VM implementation.
     *
     * @return the name of the shared library providing the VM implementation.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native String vmLibrary();

    /**
     * Returns the VM's instruction set.
     *
     * @return the VM's instruction set.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native String vmInstructionSet();

    /**
     * Returns whether the VM is running in 64-bit mode.
     *
     * @return true if VM is running in 64-bit mode, false otherwise.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    @FastNative
    public native boolean is64Bit();

    /**
     * Returns whether the VM is running with JNI checking enabled.
     *
     * @return true if the VM is running with JNI checking enabled,
     *         and false otherwise.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @FastNative
    public native boolean isCheckJniEnabled();

    /**
     * Gets the current ideal heap utilization, represented as a number
     * between zero and one.  After a GC happens, the Dalvik heap may
     * be resized so that (size of live objects) / (size of heap) is
     * equal to this number.
     *
     * @return the current ideal heap utilization
     *
     * @hide
     */
    public native float getTargetHeapUtilization();

    /**
     * Retrieves the finalizer timeout in milliseconds.
     * Finalizers that fail to terminate in this amount of time cause the
     * runtime to abort.
     *
     * @hide
     */
    public native long getFinalizerTimeoutMs();

    /**
     * Sets the current ideal heap utilization, represented as a number
     * between zero and one.  After a GC happens, the Dalvik heap may
     * be resized so that (size of live objects) / (size of heap) is
     * equal to this number.
     *
     * <p>This is only a hint to the garbage collector and may be ignored.
     *
     * @param newTarget the new suggested ideal heap utilization.
     *                  This value may be adjusted internally.
     * @return the previous ideal heap utilization
     * @throws IllegalArgumentException if newTarget is &lt;= 0.0 or &gt;= 1.0
     *
     * @hide
     */
    @UnsupportedAppUsage
    public float setTargetHeapUtilization(float newTarget) {
        if (newTarget <= 0.0f || newTarget >= 1.0f) {
            throw new IllegalArgumentException(newTarget + " out of range (0,1)");
        }
        /* The native code assumes a value >= 0.1. Clamp it to that. */
        if (newTarget < 0.1f) {
            newTarget = 0.1f;
        }
        /* Synchronize to make sure that only one thread gets a given "old" value if both
         * update at the same time.  Allows for reliable save-and-restore semantics.
         */
        synchronized (this) {
            float oldTarget = getTargetHeapUtilization();
            nativeSetTargetHeapUtilization(newTarget);
            return oldTarget;
        }
    }

    /**
     * Sets the target SDK version. Should only be called before the
     * app starts to run, because it may change the VM's behavior in
     * dangerous ways. Defaults to {@link #SDK_VERSION_CUR_DEVELOPMENT}.
     *
     * @param targetSdkVersion the SDK version the app wants to run with.
     *
     * @hide
     */
    @UnsupportedAppUsage(maxTargetSdk=0, publicAlternatives="Use the {@code targetSdkVersion}"
        +" attribute in the {@code uses-sdk} manifest tag instead.")
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public synchronized void setTargetSdkVersion(int targetSdkVersion) {
        this.targetSdkVersion = targetSdkVersion;
        setTargetSdkVersionNative(this.targetSdkVersion);
    }


    /**
     * Sets the disabled compat changes. Should only be called before the
     * app starts to run, because it may change the VM's behavior in
     * dangerous ways. Defaults to empty.
     *
     * @param disabledCompatChanges An array of ChangeIds that we want to disable.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public synchronized void setDisabledCompatChanges(long[] disabledCompatChanges) {
        this.disabledCompatChanges = disabledCompatChanges;
        setDisabledCompatChangesNative(this.disabledCompatChanges);
    }

    /**
     * Gets the target SDK version. See {@link #setTargetSdkVersion} for
     * special values.
     *
     * @return the target SDK version.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public synchronized int getTargetSdkVersion() {
        return targetSdkVersion;
    }

    private native void setTargetSdkVersionNative(int targetSdkVersion);
    private native void setDisabledCompatChangesNative(long[] disabledCompatChanges);

    /**
     * This method exists for binary compatibility.  It was part of a
     * heap sizing API which was removed in Android 3.0 (Honeycomb).
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    public long getMinimumHeapSize() {
        return 0;
    }

    /**
     * This method exists for binary compatibility.  It was part of a
     * heap sizing API which was removed in Android 3.0 (Honeycomb).
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    public long setMinimumHeapSize(long size) {
        return 0;
    }

    /**
     * This method exists for binary compatibility.  It used to
     * perform a garbage collection that cleared SoftReferences.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    public void gcSoftReferences() {}

    /**
     * This method exists for binary compatibility.  It is equivalent
     * to {@link System#runFinalization}.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    public void runFinalizationSync() {
        System.runFinalization();
    }

    /**
     * Implements setTargetHeapUtilization().
     *
     * @param newTarget the new suggested ideal heap utilization.
     *                  This value may be adjusted internally.
     */
    private native void nativeSetTargetHeapUtilization(float newTarget);

    /**
     * This method exists for binary compatibility.  It was part of
     * the external allocation API which was removed in Android 3.0 (Honeycomb).
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    public boolean trackExternalAllocation(long size) {
        return true;
    }

    /**
     * This method exists for binary compatibility.  It was part of
     * the external allocation API which was removed in Android 3.0 (Honeycomb).
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    public void trackExternalFree(long size) {}

    /**
     * This method exists for binary compatibility.  It was part of
     * the external allocation API which was removed in Android 3.0 (Honeycomb).
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    public long getExternalBytesAllocated() {
        return 0;
    }

    /**
     * Sets the list of exemptions from hidden API access enforcement.
     *
     * @param signaturePrefixes
     *         A list of signature prefixes. Each item in the list is a prefix match on the type
     *         signature of a blacklisted API. All matching APIs are treated as if they were on
     *         the whitelist: access permitted, and no logging..
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void setHiddenApiExemptions(String[] signaturePrefixes);

    /**
     * Sets the log sampling rate of hidden API accesses written to the event log.
     *
     * @param rate Proportion of hidden API accesses that will be logged; an integer between
     *                0 and 0x10000 inclusive.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void setHiddenApiAccessLogSamplingRate(int rate);

    /**
     * Returns an array allocated in an area of the Java heap where it will never be moved.
     * This is used to implement native allocations on the Java heap, such as DirectByteBuffers
     * and Bitmaps.
     *
     * @param componentType the component type of the returned array.
     * @param length the length of the returned array.
     * @return array allocated in an area of the heap where it will never be moved.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @libcore.api.IntraCoreApi
    @FastNative
    public native Object newNonMovableArray(Class<?> componentType, int length);

    /**
     * Returns an array of at least {@code minLength}, but potentially larger. The increased size
     * comes from avoiding any padding after the array. The amount of padding varies depending on
     * the componentType and the memory allocator implementation.
     *
     * @param componentType the component type of the returned array.
     * @param minLength     the minimum length of the returned array. The actual length could
     *                      be greater.
     * @return              array of at least of {@code minLength}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @FastNative
    public native Object newUnpaddedArray(Class<?> componentType, int minLength);

    /**
     * Returns the address of {@code array[0]}. This differs from using JNI in that JNI
     * might lie and give you the address of a copy of the array when in forcecopy mode.
     *
     * @param array the object we want the native address of.
     * @return native address of {@code array[0]}.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @libcore.api.IntraCoreApi
    @FastNative
    public native long addressOf(Object array);

    /**
     * Removes any growth limits, allowing the application to allocate
     * up to the maximum heap size.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void clearGrowthLimit();

    /**
     * Make the current growth limit the new non growth limit capacity by releasing pages which
     * are after the growth limit but before the non growth limit capacity.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void clampGrowthLimit();

    /**
     * Returns true if native debugging is on.
     *
     * @return true if native debugging is on, false otherwise.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @FastNative
    public native boolean isNativeDebuggable();

    /**
     * Returns true if Java debugging is enabled.
     *
     * @hide
     */
    public native boolean isJavaDebuggable();

    /**
     * Registers a native allocation so that the heap knows about it and performs GC as required.
     * If the number of native allocated bytes exceeds the native allocation watermark, the
     * function requests a concurrent GC. If the native bytes allocated exceeds a second higher
     * watermark, it is determined that the application is registering native allocations at an
     * unusually high rate and a GC is performed inside of the function to prevent memory usage
     * from excessively increasing. Memory allocated via system malloc() should not be included
     * in this count. The argument must be the same as that later passed to registerNativeFree(),
     * but may otherwise be approximate.
     *
     * @param bytes the number of bytes of the native object.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void registerNativeAllocation(long bytes);

    /**
     * Backward compatibility version of {@link #registerNativeAllocation(long)}. We used to pass
     * an int instead of a long. The RenderScript support library looks it up via reflection.
     * @deprecated Use {@link #registerNativeAllocation(long)} instead.
     *
     * @param bytes the number of bytes of the native object.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public void registerNativeAllocation(int bytes) {
        registerNativeAllocation((long) bytes);
    }

    /**
     * Registers a native free by reducing the number of native bytes accounted for.
     *
     * @param bytes the number of bytes of the freed object.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void registerNativeFree(long bytes);

    /**
     * Backward compatibility version of {@link #registerNativeFree(long)}.
     * @deprecated Use {@link #registerNativeFree(long)} instead.
     *
     * @param bytes the number of bytes of the freed object.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @Deprecated
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public void registerNativeFree(int bytes) {
        registerNativeFree((long) bytes);
    }

    /**
     * Return the number of native objects that are reported by a single call to
     * notifyNativeAllocation().
     */
    private static native int getNotifyNativeInterval();

    /**
     * Report a native malloc()-only allocation to the GC.
     *
     * @hide
     */
    public void notifyNativeAllocation() {
        // Minimize JNI calls by notifying once every notifyNativeInterval allocations.
        // The native code cannot do anything without calling mallinfo(), which is too
        // expensive to perform on every allocation. To avoid the JNI overhead on every
        // allocation, we do the sampling here, rather than in native code.
        // Initialize notifyNativeInterval carefully. Multiple initializations may race.
        int myNotifyNativeInterval = notifyNativeInterval;
        if (myNotifyNativeInterval == 0) {
            // This can race. By Java rules, that's OK.
            myNotifyNativeInterval = notifyNativeInterval = getNotifyNativeInterval();
        }
        // myNotifyNativeInterval is correct here. If another thread won the initial race,
        // notifyNativeInterval may not be.
        if (allocationCount.addAndGet(1) % myNotifyNativeInterval == 0) {
            notifyNativeAllocationsInternal();
        }
    }

    /**
     * Report to the GC that roughly notifyNativeInterval native malloc()-based
     * allocations have occurred since the last call to notifyNativeAllocationsInternal().
     * Hints that we should check whether a GC is required.
     *
     * @hide
     */
    public native void notifyNativeAllocationsInternal();

    /**
     * Wait for objects to be finalized.
     *
     * If finalization takes longer than timeout, then the function returns before all objects are
     * finalized.
     *
     * @param timeout
     *            timeout in nanoseconds of the maximum time to wait until all pending finalizers
     *            are run. If timeout is 0, then there is no timeout. Note that the timeout does
     *            not stop the finalization process, it merely stops the wait.
     *
     * @see #Runtime.runFinalization()
     * @see #wait(long,int)
     *
     * @hide
     */
    @UnsupportedAppUsage
    public static void runFinalization(long timeout) {
        try {
            FinalizerReference.finalizeAllEnqueued(timeout);
        } catch (InterruptedException e) {
            // Interrupt the current thread without actually throwing the InterruptionException
            // for the caller.
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Request that a garbage collection gets started on a different thread.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void requestConcurrentGC();

    /**
     *
     * @hide
     */
    public native void requestHeapTrim();

    /**
     *
     * @hide
     */
    public native void trimHeap();

    /**
     *
     * @hide
     */
    public native void startHeapTaskProcessor();

    /**
     *
     * @hide
     */
    public native void stopHeapTaskProcessor();

    /**
     *
     * @hide
     */
    public native void runHeapTasks();

    /**
     * Let the heap know of the new process state. This can change allocation and garbage collection
     * behavior regarding trimming and compaction.
     *
     * @param state The state of the process, as defined in art/runtime/process_state.h.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void updateProcessState(int state);

    /**
     * Let the runtime know that the application startup is completed. This may affect behavior
     * related to profiling and startup caches.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void notifyStartupCompleted();

    /**
     * Fill in dex caches with classes, fields, and methods that are
     * already loaded. Typically used after Zygote preloading.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public native void preloadDexCaches();

    /**
     * Flag denoting that the code paths passed to
     * {@link #registerAppInfo(String, String, String, String[], int, boolean)}
     * contains the app primary APK.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static final int CODE_PATH_TYPE_PRIMARY_APK = 1 << 0;
    /**
     * Flag denoting that the code paths passed to
     * {@link #registerAppInfo(String, String, String, String[], int, boolean)}
     * contains the a split APK.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static final int CODE_PATH_TYPE_SPLIT_APK = 1 << 1;
    /**
     * Flag denoting that the code paths passed to
     * {@link #registerAppInfo(String, String, String, String[], int, boolean)}
     * contains a secondary dex file (dynamically loaded by the app).
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static final int CODE_PATH_TYPE_SECONDARY_DEX = 1 << 2;

    /**
     * Register application info to ART.
     * This enables ART to support certain low level features (such as profiling) and provide
     * better debug information. The method should be called after the application loads its
     * apks or dex files.
     *
     * @param packageName the name of the package being ran.
     * @param currentProfileFile the path of the file where the profile information for the current
     *        execution should be stored.
     * @param referenceProfileFile the path of the file where the reference profile information
     *        (for past executions) is stored.
     * @param appCodePaths the code paths (apk/dex files) of the applications that were loaded.
     *        These paths will also be profiled.
     * @param codePathsTypes the type of the code paths.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native void registerAppInfo(
            String packageName,
            String currentProfileFile,
            String referenceProfileFile,
            String[] appCodePaths,
            int codePathsType);

    /**
     * Returns the runtime instruction set corresponding to a given ABI. Multiple
     * compatible ABIs might map to the same instruction set. For example
     * {@code armeabi-v7a} and {@code armeabi} might map to the instruction set {@code arm}.
     *
     * This influences the compilation of the applications classes.
     *
     * @param abi The ABI we want the instruction set from.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static String getInstructionSet(String abi) {
        final String instructionSet = ABI_TO_INSTRUCTION_SET_MAP.get(abi);
        if (instructionSet == null) {
            throw new IllegalArgumentException("Unsupported ABI: " + abi);
        }

        return instructionSet;
    }

    /**
     * Returns whether the given {@code instructionSet} is 64 bits.
     *
     * @param instructionSet a string representing an instruction set.
     *
     * @return true if given {@code instructionSet} is 64 bits, false otherwise.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static boolean is64BitInstructionSet(String instructionSet) {
        return "arm64".equals(instructionSet) ||
                "x86_64".equals(instructionSet) ||
                "mips64".equals(instructionSet);
    }

    /**
     * Returns whether the given {@code abi} is 64 bits.
     *
     * @param abi a string representing an ABI.
     *
     * @return true if given {@code abi} is 64 bits, false otherwise.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static boolean is64BitAbi(String abi) {
        return is64BitInstructionSet(getInstructionSet(abi));
    }

    /**
     * Return false if the boot class path for the given instruction
     * set mapped from disk storage, versus being interpretted from
     * dirty pages in memory.
     *
     * @hide
     */
    public static native boolean isBootClassPathOnDisk(String instructionSet);

    /**
     * Used to notify the runtime that boot completed.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native void bootCompleted();

    /**
     * Used to notify the runtime to reset Jit counters. This is done for the boot image
     * profiling configuration to avoid samples during class preloading. This helps avoid
     * the regression from disabling class profiling.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native void resetJitCounters();

    /**
     * Returns the instruction set of the current runtime.
     *
     * @return instruction set of the current runtime.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native String getCurrentInstructionSet();

    /**
     * Register the current execution thread to the runtime as sensitive thread.
     * Should be called just once. Subsequent calls are ignored.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native void registerSensitiveThread();

    /**
     * Sets up the priority of the system daemon thread (caller).
     *
     * @hide
     */
    public static native void setSystemDaemonThreadPriority();

    /**
     * Sets a callback that the runtime can call whenever a usage of a non SDK API is detected.
     *
     * @param consumer an object implementing the {@code java.util.function.Consumer} interface that
     *      the runtime will call whenever a usage of a non SDK API is detected.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setNonSdkApiUsageConsumer(Consumer<String> consumer) {
        nonSdkApiUsageConsumer = consumer;
    }

    /**
     * Sets whether or not the runtime should dedupe detection and warnings for hidden API usage.
     *
     * @param dedupe if set, only the first usage of each API will be detected. The default
     *      behaviour is to dedupe.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native void setDedupeHiddenApiWarnings(boolean dedupe);

    /**
     * Sets the package name of the app running in this process.
     *
     * @param packageName the value being set
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native void setProcessPackageName(String packageName);

    /**
     * Sets the full path to data directory of the app running in this process.
     *
     * @param dataDir the value being set
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native void setProcessDataDirectory(String dataDir);

    /**
     * Returns whether {@code encodedClassLoaderContext} is a valid encoded class loader context.
     * A class loader context is an internal opaque format used by the runtime to encode the
     * class loader hierarchy (including each ClassLoader's classpath) used to load a dex file.
     *
     * @param encodedClassLoaderContext the class loader context to analyze
     * @throws NullPointerException if {@code encodedClassLoaderContext is null.
     * @return {@code true} if {@code encodedClassLoaderContext} is a non-null valid encoded class
     *         loader context.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native boolean isValidClassLoaderContext(String encodedClassLoaderContext);
}
