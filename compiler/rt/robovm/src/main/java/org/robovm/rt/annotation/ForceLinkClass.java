/*
 * Copyright (C) 2012 RoboVM AB
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
package org.robovm.rt.annotation;

import java.lang.annotation.*;

/**
 * Adds a dependency from the annotated class {@code A} to another class
 * {@code B} forcing the compiler to link in {@code B} if {@code A} is
 * referenced in some way by other classes in an app.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@Repeatable(ForceLinkClasses.class)
public @interface ForceLinkClass {
    /**
     * Specifies the class which the annotated class depends on.
     */
    Class<?> value();
}
