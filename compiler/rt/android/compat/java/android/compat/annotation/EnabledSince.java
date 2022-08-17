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
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Used to indicate that a compatibility {@link ChangeId change} is enabled only for apps with a
 * {@code targetSdkVersion} <em>greater or equal to</em> the given value.
 *
 * <p>This annotation should only be applied to change ID constants that are also annotated with
 * {@link ChangeId}. In any other context, this annotation will have no effect.
 *
 * @hide
 */
@Retention(SOURCE)
@Target({FIELD})
public @interface EnabledSince {
    /**
     * @return Theminimum  {@code targetSdkVersion} for which this change is enabled. Apps with
     *     a {@code targetSdkVersion} greater or equal to this value will get the change.
     */
    int targetSdkVersion();
}

