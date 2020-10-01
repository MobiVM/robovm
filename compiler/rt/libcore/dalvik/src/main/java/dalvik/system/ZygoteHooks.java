/*
 * Copyright (C) 2006 The Android Open Source Project
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

import android.icu.impl.CacheValue;
import android.icu.text.DecimalFormatSymbols;
import android.icu.util.ULocale;

import java.io.File;

/**
 * Provides hooks for the zygote to call back into the runtime to perform
 * parent or child specific initialization..
 *
 * @hide
 */
@libcore.api.CorePlatformApi
public final class ZygoteHooks {
    private static long token;

    /** All methods are static, no need to instantiate. */
    private ZygoteHooks() {
    }

    /**
     * Called by the zygote when starting up. It marks the point when any thread
     * start should be an error, as only internal daemon threads are allowed there.
     */
    @libcore.api.CorePlatformApi
    public static native void startZygoteNoThreadCreation();

    /**
     * Called when the zygote begins preloading classes and data.
     */
    @libcore.api.CorePlatformApi
    public static void onBeginPreload() {
        // Pin ICU data in memory from this point that would normally be held by soft references.
        // Without this, any references created immediately below or during class preloading
        // would be collected when the Zygote GC runs in gcAndFinalize().
        CacheValue.setStrength(CacheValue.Strength.STRONG);

        // Explicitly exercise code to cache data apps are likely to need.
        ULocale[] localesToPin = { ULocale.ROOT, ULocale.US, ULocale.getDefault() };
        for (ULocale uLocale : localesToPin) {
            new DecimalFormatSymbols(uLocale);
        }
    }

    /**
     * Called when the zygote has completed preloading classes and data.
     */
    @libcore.api.CorePlatformApi
    public static void onEndPreload() {
        // All cache references created by ICU from this point will be soft.
        CacheValue.setStrength(CacheValue.Strength.SOFT);
    }

    /**
     * Runs several special GCs to try to clean up a few generations of
     * softly- and final-reachable objects, along with any other garbage.
     * This is only useful just before a fork().
     */
    @libcore.api.CorePlatformApi
    public static void gcAndFinalize() {
        final VMRuntime runtime = VMRuntime.getRuntime();

        /* runFinalizationSync() lets finalizers be called in Zygote,
         * which doesn't have a HeapWorker thread.
         */
        System.gc();
        runtime.runFinalizationSync();
        System.gc();
    }

    /**
     * Called by the zygote when startup is finished. It marks the point when it is
     * conceivable that threads would be started again, e.g., restarting daemons.
     */
    @libcore.api.CorePlatformApi
    public static native void stopZygoteNoThreadCreation();

    /**
     * Called by the zygote prior to every fork. Each call to {@code preFork}
     * is followed by a matching call to {@link #postForkChild(int, boolean, boolean, String)} on
     * the child process and {@link #postForkCommon()} on both the parent and the child
     * process. {@code postForkCommon} is called after {@code postForkChild} in
     * the child process.
     */
    @libcore.api.CorePlatformApi
    public static void preFork() {
        Daemons.stop();
        token = nativePreFork();
        waitUntilAllThreadsStopped();
    }

    /**
     * Called by the zygote in the system server process after forking. This method is is called
     * before {@code postForkChild} for system server.
     */
    @libcore.api.CorePlatformApi
    public static void postForkSystemServer() {
        nativePostForkSystemServer();
    }

    /**
     * Called by the zygote in the child process after every fork. The runtime
     * flags from {@code runtimeFlags} are applied to the child process. The string
     * {@code instructionSet} determines whether to use a native bridge.
     */
    @libcore.api.CorePlatformApi
    public static void postForkChild(int runtimeFlags, boolean isSystemServer, boolean isZygote,
            String instructionSet) {
        nativePostForkChild(token, runtimeFlags, isSystemServer, isZygote, instructionSet);

        Math.setRandomSeedInternal(System.currentTimeMillis());
    }

    /**
     * Called by the zygote in both the parent and child processes after
     * every fork. In the child process, this method is called after
     * {@code postForkChild}.
     */
    @libcore.api.CorePlatformApi
    public static void postForkCommon() {
        Daemons.startPostZygoteFork();
        nativePostZygoteFork();
    }


    // Hook for SystemServer specific early initialization post-forking.
    private static native void nativePostForkSystemServer();

    private static native long nativePreFork();
    private static native void nativePostZygoteFork();

    // Hook for all child processes post forking.
    private static native void nativePostForkChild(long token, int runtimeFlags,
                                                   boolean isSystemServer, boolean isZygote,
                                                   String instructionSet);

    /**
     * We must not fork until we're single-threaded again. Wait until /proc shows we're
     * down to just one thread.
     */
    private static void waitUntilAllThreadsStopped() {
        File tasks = new File("/proc/self/task");
        // All Java daemons are stopped already. We're just waiting for their OS counterparts to
        // finish as well. This shouldn't take much time so spinning is ok here.
        while (tasks.list().length > 1) {
          Thread.yield();
        }
    }
}
