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
 * limitations under the License
 */

package android.compat.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates that a field is a compatibility change ID.
 *
 * <p>A compatibility change is a change to the Android platform that may impact app behavior,
 * relative to previous releases of Android. A change ID is a unique {@code long} identifying one
 * such change. Compatibility change IDs should be defined as a {@code static final long}:
 *
 * <pre>{@code
 *     @ChangeId
 *     public static final long MY_CHANGE_ID = 123456789l;
 * }</pre>
 *
 * <p>The value of the constant is the ID of an issue in <a href="https://issuetracker.google.com/">
 * buganizer</a>.
 *
 * @hide
 */
@Retention(SOURCE)
@Target({FIELD, PARAMETER})
public @interface ChangeId {
}
