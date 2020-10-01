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

package dalvik.system;

import libcore.util.NonNull;
import libcore.util.Nullable;
import java.nio.ByteBuffer;

/**
 * A {@link ClassLoader} implementation that loads classes from a
 * buffer containing a DEX file. This can be used to execute code that
 * has not been written to the local file system.
 */
public final class InMemoryDexClassLoader extends BaseDexClassLoader {
    /**
     * Create an in-memory DEX class loader with the given dex buffers.
     *
     * @param dexBuffers array of buffers containing DEX files between
     *                       <tt>buffer.position()</tt> and <tt>buffer.limit()</tt>.
     * @param librarySearchPath the list of directories containing native
     *   libraries, delimited by {@code File.pathSeparator}; may be {@code null}
     * @param parent the parent class loader for delegation.
     */
    public InMemoryDexClassLoader(@NonNull ByteBuffer @NonNull [] dexBuffers,
            @Nullable String librarySearchPath, @Nullable ClassLoader parent) {
        super(dexBuffers, librarySearchPath, parent);
    }

    /**
     * Create an in-memory DEX class loader with the given dex buffers.
     *
     * @param dexBuffers array of buffers containing DEX files between
     *                       <tt>buffer.position()</tt> and <tt>buffer.limit()</tt>.
     * @param parent the parent class loader for delegation.
     */
    public InMemoryDexClassLoader(@NonNull ByteBuffer @NonNull [] dexBuffers,
            @Nullable ClassLoader parent) {
        this(dexBuffers, null, parent);
    }

    /**
     * Creates a new in-memory DEX class loader.
     *
     * @param dexBuffer buffer containing DEX file contents between
     *                       <tt>buffer.position()</tt> and <tt>buffer.limit()</tt>.
     * @param parent the parent class loader for delegation.
     */
    public InMemoryDexClassLoader(@NonNull ByteBuffer dexBuffer, @Nullable ClassLoader parent) {
        this(new ByteBuffer[] { dexBuffer }, parent);
    }
}
