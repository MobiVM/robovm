/*
 * Copyright (C) 2011 The Android Open Source Project
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

package com.android.i18n.timezone.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A minimal least-recently-used cache for libcore. Prefer {@code
 * android.util.LruCache} where that is available.
 * @hide
 */
public class BasicLruCache<K, V> {
    private static class CacheMap<K, V> extends LinkedHashMap<K, V> {

        private final int maxSize;

        private CacheMap(int maxSize) {
            super(0, 0.75f, true);
            this.maxSize = maxSize;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return this.size() > maxSize;
        }
    }

    private final CacheMap<K, V> map;

    public BasicLruCache(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new CacheMap<K, V>(maxSize);
    }

    /**
     * Returns the value for {@code key} if it exists in the cache or can be
     * created by {@code #create}. If a value was returned, it is moved to the
     * head of the queue. This returns null if a value is not cached and cannot
     * be created.
     */
    public final V get(K key) {
        if (key == null) {
            throw new NullPointerException("key == null");
        }

        V result;
        synchronized (this) {
            result = map.get(key);
            if (result != null) {
                return result;
            }
        }

        // Don't hold any locks while calling create.
        result = create(key);

        synchronized (this) {
            // NOTE: Another thread might have already inserted a value for |key| into the map.
            // This shouldn't be an observable change as long as create creates equal values for
            // equal keys. We will however attempt to trim the map twice, but that shouldn't be
            // a big deal since uses of this class aren't heavily contended (and this class
            // isn't design for such usage anyway).
            if (result != null) {
                map.put(key, result);
            }
        }

        return result;
    }

    /**
     * Caches {@code value} for {@code key}. The value is moved to the head of
     * the queue.
     *
     * @return the previous value mapped by {@code key}. Although that entry is
     *     no longer cached, it has not been evicted.
     */
    public synchronized final V put(K key, V value) {
        if (key == null) {
            throw new NullPointerException("key == null");
        } else if (value == null) {
            throw new NullPointerException("value == null");
        }

        V previous = map.put(key, value);
        return previous;
    }

    /**
     * Called after a cache miss to compute a value for the corresponding key.
     * Returns the computed value or null if no value can be computed. The
     * default implementation returns null.
     */
    protected V create(K key) {
        return null;
    }

    /**
     * Clear the cache, calling {@link #entryEvicted} on each removed entry.
     */
    public synchronized final void evictAll() {
        map.clear();
    }
}
