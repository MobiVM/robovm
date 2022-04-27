/*
 * Copyright (C) 2013-2015 RoboVM AB
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

package org.robovm.apple.foundation;

import org.robovm.rt.bro.GlobalValueSupplier;
import org.robovm.rt.bro.LazyGlobalValue;

import java.util.Objects;

public class GlobalValueEnumeration<T> extends GlobalValueSupplier<T> {
    private final GlobalValueSupplier<T> globalValueSupplier;

    protected GlobalValueEnumeration (Class<?> clazz, String getterName) {
        globalValueSupplier = new LazyGlobalValue<>(clazz, getterName);
    }

    protected GlobalValueEnumeration (T value) {
        globalValueSupplier = new Constant<>(value);
    }

    @Override
    public boolean isAvailable() {
        return globalValueSupplier.isAvailable();
    }

    @Override
    public T value () {
        return globalValueSupplier.value();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlobalValueEnumeration<?> that = (GlobalValueEnumeration<?>) o;
        if (!globalValueSupplier.isAvailable() || !that.globalValueSupplier.isAvailable())
            return false;
        return Objects.equals(globalValueSupplier.value(), that.globalValueSupplier.value());
    }

    @Override
    public String toString () {
        return value().toString();
    }

    /**
     * Constant supplier
     */
    private static class Constant<T> extends GlobalValueSupplier<T> {
        private final T constValue;

        private Constant(T value) {
            this.constValue = value;
        }

        @Override
        public boolean isAvailable() {
            return true;
        }

        @Override
        public T value() {
            return constValue;
        }
    }
}
