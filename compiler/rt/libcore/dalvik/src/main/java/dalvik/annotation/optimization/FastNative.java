/*
 * Copyright (C) 2016 The Android Open Source Project
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

package dalvik.annotation.optimization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An ART runtime built-in optimization for "native" methods to speed up JNI transitions.
 *
 * <p>
 * This has the side-effect of disabling all garbage collections while executing a fast native
 * method. Use with extreme caution. Any long-running methods must not be marked with
 * {@code @FastNative} (including usually-fast but generally unbounded methods)!</p>
 *
 * <p><b>Deadlock Warning:</b>As a rule of thumb, do not acquire any locks during a fast native
 * call if they aren't also locally released [before returning to managed code].</p>
 *
 * <p>
 * Say some code does:
 *
 * <code>
 * fast_jni_call_to_grab_a_lock();
 * does_some_java_work();
 * fast_jni_call_to_release_a_lock();
 * </code>
 *
 * <p>
 * This code can lead to deadlocks. Say thread 1 just finishes
 * {@code fast_jni_call_to_grab_a_lock()} and is in {@code does_some_java_work()}.
 * GC kicks in and suspends thread 1. Thread 2 now is in {@code fast_jni_call_to_grab_a_lock()}
 * but is blocked on grabbing the native lock since it's held by thread 1.
 * Now thread suspension can't finish since thread 2 can't be suspended since it's doing
 * FastNative JNI.
 * </p>
 *
 * <p>
 * Normal JNI doesn't have the issue since once it's in native code,
 * it is considered suspended from java's point of view.
 * FastNative JNI however doesn't do the state transition done by JNI.
 * </p>
 *
 * <p>
 * Has no effect when used with non-native methods.
 * </p>
 *
 * @hide
 */
@libcore.api.CorePlatformApi
@Retention(RetentionPolicy.CLASS)  // Save memory, don't instantiate as an object at runtime.
@Target(ElementType.METHOD)
public @interface FastNative {}
