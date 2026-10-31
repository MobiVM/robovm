/*
 * Copyright (C) 2026 The MobiVM Contributors
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
package org.robovm.compiler.util;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.stream.Stream;

public final class JsonUtils {
    private JsonUtils() {
    }

    // Source-only annotations documenting whether an input may be null.
    @Retention(RetentionPolicy.SOURCE)
    public @interface Required {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Optional {
    }

    public static Stream<JsonObject> toObjectStream(@Required JsonArray arr) {
        return ((List<?>) arr).stream()
            .filter(o -> o instanceof JsonObject)
            .map(o -> (JsonObject)o);
    }

    public static Stream<JsonObject> asObjectStream(@Optional JsonObject json, String key, Stream<JsonObject> defaultValue) {
        if (json == null) return defaultValue;
        Object o = json.get(key);
        if (o instanceof JsonArray) return toObjectStream((JsonArray) o);
        return defaultValue;
    }

    public static Stream<String> asStringStream(@Optional JsonObject json, String key, Stream<String> defaultValue) {
        if (json == null) return defaultValue;
        Object o = json.get(key);
        if (o instanceof JsonArray)
            return ((JsonArray) o).stream().filter(e -> e instanceof String).map(e -> (String) e);
        return defaultValue;
    }

    public static String asString(@Optional JsonObject json, String key, String defaultValue) {
        if (json == null) return defaultValue;
        Object o = json.get(key);
        if (o instanceof String) return (String) o;
        return defaultValue;
    }

    public static String asString(@Optional JsonObject json, String key) {
        return asString(json, key, null);
    }

    public static JsonObject asJson(@Optional JsonObject json, String key) {
        if (json == null) return null;
        Object o = json.get(key);
        if (o instanceof JsonObject) return (JsonObject) o;
        return null;
    }

    public static long asLong(@Optional JsonObject json, String key, long defaultValue) {
        if (json == null) return defaultValue;
        Object o = json.get(key);
        if (o instanceof Number) return ((Number) o).longValue();
        return defaultValue;
    }

    public static boolean asBoolean(@Optional JsonObject json, String key, boolean defaultValue) {
        if (json == null) return defaultValue;
        Object o = json.get(key);
        if (o instanceof Boolean) return (Boolean) o;
        // Some tool output represents booleans as strings.
        if ("true".equals(o)) return true;
        if ("false".equals(o)) return false;
        return defaultValue;
    }
}
