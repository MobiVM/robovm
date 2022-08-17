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
 * limitations under the License.
 */

package libcore.content.type;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import libcore.api.CorePlatformApi;
import libcore.util.NonNull;
import libcore.util.Nullable;

/**
 * Maps from MIME types to file extensions and back.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = CorePlatformApi.Status.STABLE)
public final class MimeMap {

    /**
     * Creates a MIME type map builder.
     *
     * @return builder
     *
     * @see MimeMap.Builder
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public static @NonNull Builder builder() {
        return new Builder();
    }

    /**
     * Creates a MIME type map builder with values based on {@code this} instance.
     * This builder will contain all previously added MIMEs and extensions.
     *
     * @return builder
     *
     * @see MimeMap.Builder
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public @NonNull Builder buildUpon() {
        return new Builder(mimeToExt, extToMime);
    }

    // Contain only lowercase, valid keys/values.
    private final Map<String, String> mimeToExt;
    private final Map<String, String> extToMime;

    /**
     * A basic implementation of MimeMap used if a new default isn't explicitly
     * {@link MimeMap#setDefaultSupplier(Supplier) installed}. Hard-codes enough
     * mappings to satisfy libcore tests. Android framework code is expected to
     * replace this implementation during runtime initialization.
     */
    private static volatile MemoizingSupplier<@NonNull MimeMap> instanceSupplier =
            new MemoizingSupplier<>(
                    () -> builder()
                            .addMimeMapping("application/pdf", "pdf")
                            .addMimeMapping("image/jpeg", "jpg")
                            .addMimeMapping("image/x-ms-bmp", "bmp")
                            .addMimeMapping("text/html", Arrays.asList("htm", "html"))
                            .addMimeMapping("text/plain", Arrays.asList("text", "txt"))
                            .addMimeMapping("text/x-java", "java")
                            .build());

    private MimeMap(Map<String, String> mimeToExt, Map<String, String> extToMime) {
        this.mimeToExt = Objects.requireNonNull(mimeToExt);
        this.extToMime = Objects.requireNonNull(extToMime);
        for (Map.Entry<String, String> entry : this.mimeToExt.entrySet()) {
            checkValidMimeType(entry.getKey());
            checkValidExtension(entry.getValue());
        }
        for (Map.Entry<String, String> entry : this.extToMime.entrySet()) {
            checkValidExtension(entry.getKey());
            checkValidMimeType(entry.getValue());
        }
    }

    /**
     * Gets system's current default {@link MimeMap}
     *
     * @return The system's current default {@link MimeMap}.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public static @NonNull MimeMap getDefault() {
        return Objects.requireNonNull(instanceSupplier.get());
    }

    /**
     * Sets the {@link Supplier} of the {@link #getDefault() default MimeMap
     * instance} to be used from now on.
     *
     * {@code mimeMapSupplier.get()} will be invoked only the first time that
     * {@link #getDefault()} is called after this method call; that
     * {@link MimeMap} instance is memoized such that subsequent calls to
     * {@link #getDefault()} without an intervening call to
     * {@link #setDefaultSupplier(Supplier)} will return that same instance
     * without consulting {@code mimeMapSupplier} a second time.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public static void setDefaultSupplier(@NonNull Supplier<@NonNull MimeMap> mimeMapSupplier) {
        instanceSupplier = new MemoizingSupplier<>(Objects.requireNonNull(mimeMapSupplier));
    }

    /**
     * Returns whether the given case insensitive extension has a registered MIME type.
     *
     * @param extension A file extension without the leading '.'
     * @return Whether a MIME type has been registered for the given case insensitive file
     *         extension.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public final boolean hasExtension(@Nullable String extension) {
        return guessMimeTypeFromExtension(extension) != null;
    }

    /**
     * Returns the MIME type for the given case insensitive file extension, or null
     * if the extension isn't mapped to any.
     *
     * @param extension A file extension without the leading '.'
     * @return The lower-case MIME type registered for the given case insensitive file extension,
     *         or null if there is none.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public final @Nullable String guessMimeTypeFromExtension(@Nullable String extension) {
        if (extension == null) {
            return null;
        }
        extension = toLowerCase(extension);
        return extToMime.get(extension);
    }

    /**
     * Returns whether given case insensetive MIME type is mapped to a file extension.
     *
     * @param mimeType A MIME type (i.e. {@code "text/plain")
     * @return Whether the given case insensitive MIME type is
     *         {@link #guessMimeTypeFromExtension(String) mapped} to a file extension.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public final boolean hasMimeType(@Nullable String mimeType) {
        return guessExtensionFromMimeType(mimeType) != null;
    }

    /**
     * Returns the registered extension for the given case insensitive MIME type. Note that some
     * MIME types map to multiple extensions. This call will return the most
     * common extension for the given MIME type.
     * @param mimeType A MIME type (i.e. text/plain)
     * @return The lower-case file extension (without the leading "." that has been registered for
     *         the given case insensitive MIME type, or null if there is none.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public final @Nullable String guessExtensionFromMimeType(@Nullable String mimeType) {
        if (mimeType == null) {
            return null;
        }
        mimeType = toLowerCase(mimeType);
        return mimeToExt.get(mimeType);
    }

    /**
     * Returns the set of MIME types that this {@link MimeMap}
     * {@link #hasMimeType(String) maps to some extension}. Note that the
     * reverse mapping might not exist.
     *
     * @return unmodifiable {@link Set} of MIME types mapped to some extension
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public @NonNull Set<String> mimeTypes() {
        return Collections.unmodifiableSet(mimeToExt.keySet());
    }

    /**
     * Returns the set of extensions that this {@link MimeMap}
     * {@link #hasExtension(String) maps to some MIME type}. Note that the
     * reverse mapping might not exist.
     *
     * @return unmodifiable {@link Set} of extensions that this {@link MimeMap}
     *         maps to some MIME type
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public @NonNull Set<String> extensions() {
        return Collections.unmodifiableSet(extToMime.keySet());
    }

    /**
     * Returns the canonical (lowercase) form of the given extension or MIME type.
     */
    private static @NonNull String toLowerCase(@NonNull String s) {
        return s.toLowerCase(Locale.ROOT);
    }

    private volatile int hashCode = 0;

    /**
     *
     * @hide
     */
    @Override
    public int hashCode() {
        if (hashCode == 0) { // potentially uninitialized
            hashCode = mimeToExt.hashCode() + 31 * extToMime.hashCode();
        }
        return hashCode;
    }

    /**
     *
     * @hide
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MimeMap)) {
            return false;
        }
        MimeMap that = (MimeMap) obj;
        if (hashCode() != that.hashCode()) {
            return false;
        }
        return mimeToExt.equals(that.mimeToExt) && extToMime.equals(that.extToMime);
    }

    /**
     *
     * @hide
     */
    @Override
    public String toString() {
        return "MimeMap[" + mimeToExt + ", " + extToMime + "]";
    }

    /**
     * A builder for mapping of MIME types to extensions and back.
     * Use {@link #addMimeMapping(String, List)} and {@link #addMimeMapping(String, String)} to add
     * mapping entries and build final {@link MimeMap} with {@link #build()}.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public static final class Builder {
        private final Map<String, String> mimeToExt;
        private final Map<String, String> extToMime;

        /**
         * Constructs a Builder that starts with an empty mapping.
         */
        Builder() {
            this.mimeToExt = new HashMap<>();
            this.extToMime = new HashMap<>();
        }

        /**
         * Constructs a Builder that starts with the given mapping.
         * @param mimeToExt
         * @param extToMime
         */
        Builder(Map<String, String> mimeToExt, Map<String, String> extToMime) {
            this.mimeToExt = new HashMap<>(mimeToExt);
            this.extToMime = new HashMap<>(extToMime);
        }

        /**
         * An element of a *mime.types file.
         */
        static class Element {
            final String mimeOrExt;
            final boolean keepExisting;

            /**
             * @param spec A MIME type or an extension, with an optional
             *        prefix of "?" (if not overriding an earlier value).
             * @param isMimeSpec whether this Element denotes a MIME type (as opposed to an
             *        extension).
             */
            private Element(String spec, boolean isMimeSpec) {
                if (spec.startsWith("?")) {
                    this.keepExisting = true;
                    this.mimeOrExt = toLowerCase(spec.substring(1));
                } else {
                    this.keepExisting = false;
                    this.mimeOrExt = toLowerCase(spec);
                }
                if (isMimeSpec) {
                    checkValidMimeType(mimeOrExt);
                } else {
                    checkValidExtension(mimeOrExt);
                }
            }

            public static Element ofMimeSpec(String s) { return new Element(s, true); }
            public static Element ofExtensionSpec(String s) { return new Element(s, false); }
        }

        private static String maybePut(Map<String, String> map, Element keyElement, String value) {
            if (keyElement.keepExisting) {
                return map.putIfAbsent(keyElement.mimeOrExt, value);
            } else {
                return map.put(keyElement.mimeOrExt, value);
            }
        }

        /**
         * Puts the mapping {@quote mimeType -> first extension}, and also the mappings
         * {@quote extension -> mimeType} for each given extension.
         *
         * The values passed to this function are carry an optional  prefix of {@quote "?"}
         * which is stripped off in any case before any such key/value is added to a mapping.
         * The prefix {@quote "?"} controls whether the mapping <i>from></i> the corresponding
         * value is added via {@link Map#putIfAbsent} semantics ({@quote "?"}
         * present) vs. {@link Map#put} semantics ({@quote "?" absent}),
         *
         * For example, {@code put("text/html", "?htm", "html")} would add the following
         * mappings:
         * <ol>
         *   <li>MIME type "text/html" -> extension "htm", overwriting any earlier mapping
         *       from MIME type "text/html" that might already have existed.</li>
         *   <li>extension "htm" -> MIME type "text/html", but only if no earlier mapping
         *       for extension "htm" existed.</li>
         *   <li>extension "html" -> MIME type "text/html", overwriting any earlier mapping
         *       from extension "html" that might already have existed.</li>
         * </ol>
         * {@code put("?text/html", "?htm", "html")} would have the same effect except
         * that an earlier mapping from MIME type {@code "text/html"} would not be
         * overwritten.
         *
         * @param mimeSpec A MIME type carrying an optional prefix of {@code "?"}. If present,
         *                 the {@code "?"} is stripped off and mapping for the resulting MIME
         *                 type is only added to the map if no mapping had yet existed for that
         *                 type.
         * @param extensionSpecs The extensions from which to add mappings back to
         *                 the {@code "?"} is stripped off and mapping for the resulting extension
         *                 is only added to the map if no mapping had yet existed for that
         *                 extension.
         *                 If {@code extensionSpecs} is empty, then calling this method has no
         *                 effect on the mapping that is being constructed.
         * @throws IllegalArgumentException if {@code mimeSpec} or any of the {@code extensionSpecs}
         *                 are invalid (null, empty, contain ' ', or '?' after an initial '?' has
         *                 been stripped off).
         * @return This builder.
         *
         * @hide
         */
        @SystemApi(client = MODULE_LIBRARIES)
        @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
        public @NonNull Builder addMimeMapping(@NonNull String mimeSpec, @NonNull List<@NonNull String> extensionSpecs)
        {
            Element mimeElement = Element.ofMimeSpec(mimeSpec); // validate mimeSpec unconditionally
            if (extensionSpecs.isEmpty()) {
                return this;
            }
            Element firstExtensionElement = Element.ofExtensionSpec(extensionSpecs.get(0));
            maybePut(mimeToExt, mimeElement, firstExtensionElement.mimeOrExt);
            maybePut(extToMime, firstExtensionElement, mimeElement.mimeOrExt);
            for (String spec : extensionSpecs.subList(1, extensionSpecs.size())) {
                Element element = Element.ofExtensionSpec(spec);
                maybePut(extToMime, element, mimeElement.mimeOrExt);
            }
            return this;
        }

        /**
         * Convenience method.
         *
         * @hide
         */
        public @NonNull Builder addMimeMapping(@NonNull String mimeSpec, @NonNull String extensionSpec) {
            return addMimeMapping(mimeSpec, Collections.singletonList(extensionSpec));
        }

        /**
         * Builds {@link MimeMap} containing all added MIME mappings.
         *
         * @return {@link MimeMap} containing previously added MIME mapping entries
         *
         * @hide
         */
        @SystemApi(client = MODULE_LIBRARIES)
        @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
        public @NonNull MimeMap build() {
            return new MimeMap(mimeToExt, extToMime);
        }

        /**
         *
         * @hide
         */
        @Override
        public String toString() {
            return "MimeMap.Builder[" + mimeToExt + ", " + extToMime + "]";
        }
    }

    private static boolean isValidMimeTypeOrExtension(String s) {
        return s != null
                && !s.isEmpty()
                && s.indexOf('?') < 0
                && s.indexOf(' ') < 0
                && s.indexOf('\t') < 0
                && s.equals(toLowerCase(s));
    }

    static void checkValidMimeType(String s) {
        if (!isValidMimeTypeOrExtension(s) || s.indexOf('/') < 0) {
            throw new IllegalArgumentException("Invalid MIME type: " + s);
        }
    }

    static void checkValidExtension(String s) {
        if (!isValidMimeTypeOrExtension(s) || s.indexOf('/') >= 0) {
            throw new IllegalArgumentException("Invalid extension: " + s);
        }
    }

    private static final class MemoizingSupplier<T> implements Supplier<T> {
        private volatile Supplier<T> mDelegate;
        private volatile T mInstance;
        private volatile boolean mInitialized = false;

        public MemoizingSupplier(Supplier<T> delegate) {
            this.mDelegate = delegate;
        }

        @Override
        public T get() {
            if (!mInitialized) {
                synchronized (this) {
                    if (!mInitialized) {
                        mInstance = mDelegate.get();
                        mDelegate = null;
                        mInitialized = true;
                    }
                }
            }
            return mInstance;
        }
    }
}
