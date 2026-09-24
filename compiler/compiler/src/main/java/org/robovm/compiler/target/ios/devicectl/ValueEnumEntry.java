/*
 * Copyright (C) 2025 The MobiVM Contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.target.ios.devicectl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * Base class for "open enum-like types".
 * Entries are being produced only if one with raw value was not produced before
 * Used as alternative to enums when it is useful to get unknown value captured
 */
abstract class ValueEnumEntry<T> {
    public final T rawValue;

    protected ValueEnumEntry(T rawValue) {
        this.rawValue = rawValue;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + (rawValue != null ? rawValue.toString() : "null");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) return false;
        ValueEnumEntry<?> that = (ValueEnumEntry<?>) o;
        return Objects.equals(rawValue, that.rawValue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getClass()) * 31 +  Objects.hashCode(rawValue);
    }

    protected static class Producer<T, R extends ValueEnumEntry<T>> {
        private final Map<T, R> known = new HashMap<>();
        private final Function<T, R> producer;

        public Producer(Function<T, R> producer) {
            this.producer = producer;
        }

        public R of(T id) {
            synchronized (known) {
                return known.computeIfAbsent(id, producer);
            }
        }
    }
}
