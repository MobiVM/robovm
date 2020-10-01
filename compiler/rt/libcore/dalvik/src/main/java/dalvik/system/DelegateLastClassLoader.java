/*
 * Copyright (C) 2017 The Android Open Source Project
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

package dalvik.system;

import sun.misc.CompoundEnumeration;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import libcore.util.NonNull;
import libcore.util.Nullable;

/**
 * A {@code ClassLoader} implementation that implements a <b>delegate last</b> lookup policy.
 * For every class or resource this loader is requested to load, the following lookup order
 * is employed:
 *
 * <ul>
 *     <li>The boot classpath is always searched first</li>
 *     <li>Then, the list of {@code dex} files associated with this classloaders's
 *     {@code dexPath} is searched.</li>
 *     <li>Finally, this classloader will delegate to the specified {@code parent}.</li>
 * </ul>
 */
public final class DelegateLastClassLoader extends PathClassLoader {

    /**
     * Whether resource loading delegates to the parent class loader. True by default.
     */
    private final boolean delegateResourceLoading;

    /**
     * Equivalent to calling {@link #DelegateLastClassLoader(String, String, ClassLoader, boolean)}
     * with {@code librarySearchPath = null, delegateResourceLoading = true}.
     */
    public DelegateLastClassLoader(String dexPath, ClassLoader parent) {
        this(dexPath, null, parent, true);
    }

    /**
     * Equivalent to calling {@link #DelegateLastClassLoader(String, String, ClassLoader, boolean)}
     * with {@code delegateResourceLoading = true}.
     */
    public DelegateLastClassLoader(String dexPath, String librarySearchPath, ClassLoader parent) {
        this(dexPath, librarySearchPath, parent, true);
    }

    /**
     * Creates a {@code DelegateLastClassLoader} that operates on a given {@code dexPath}
     * and a {@code librarySearchPath}.
     *
     * The {@code dexPath} should consist of one or more of the following, separated by
     * {@code File.pathSeparator}, which is {@code ":"} on Android.
     *
     * <ul>
     * <li>JAR/ZIP/APK files, possibly containing a "classes.dex" file as well as arbitrary
     * resources.
     * <li>Raw ".dex" files (not inside a zip file).
     * </ul>
     *
     * Unlike {@link PathClassLoader}, this classloader will attempt to locate classes
     * (or resources) using the following lookup order.
     * <ul>
     *     <li>The boot classpath is always searched first.</li>
     *     <li>Then, the list of {@code dex} files contained in {@code dexPath} is searched./li>
     *     <li>Lastly, this classloader will delegate to the specified {@code parent}.</li>
     * </ul>
     *
     * Note that this is in contrast to other standard classloaders that follow the delegation
     * model. In those classloaders, the {@code parent} is always searched first.
     *
     * {@code librarySearchPath} specifies one more directories containing native library files,
     * separated by {@code File.pathSeparator}.
     *
     * @param dexPath the list of jar/apk files containing classes and resources, delimited by
     *                {@code File.pathSeparator}, which defaults to {@code ":"} on Android.
     * @param librarySearchPath the list of directories containing native libraries, delimited
     *                          by {@code File.pathSeparator}; may be {@code null}.
     * @param parent the parent class loader. May be {@code null} for the boot classloader.
     * @param delegateResourceLoading whether to delegate resource loading to the parent if
     *                                the resource is not found. This does not affect class
     *                                loading delegation.
     */

    public DelegateLastClassLoader(@NonNull String dexPath, @Nullable String librarySearchPath,
            @Nullable ClassLoader parent, boolean delegateResourceLoading) {
        super(dexPath, librarySearchPath, parent);
        this.delegateResourceLoading = delegateResourceLoading;
    }

    /**
     * @hide
     */
    @libcore.api.CorePlatformApi
    public DelegateLastClassLoader(
            String dexPath, String librarySearchPath, ClassLoader parent,
            ClassLoader[] sharedLibraryLoaders) {
        super(dexPath, librarySearchPath, parent, sharedLibraryLoaders);
        // Delegating is the default behavior.
        this.delegateResourceLoading = true;
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        // First, check whether the class has already been loaded. Return it if that's the
        // case.
        Class<?> cl = findLoadedClass(name);
        if (cl != null) {
            return cl;
        }

        // Next, check whether the class in question is present in the boot classpath.
        try {
            return Object.class.getClassLoader().loadClass(name);
        } catch (ClassNotFoundException ignored) {
        }

        // Next, check whether the class in question is present in the dexPath that this classloader
        // operates on, or its shared libraries.
        ClassNotFoundException fromSuper = null;
        try {
            return findClass(name);
        } catch (ClassNotFoundException ex) {
            fromSuper = ex;
        }

        // Finally, check whether the class in question is present in the parent classloader.
        try {
            return getParent().loadClass(name);
        } catch (ClassNotFoundException cnfe) {
            // The exception we're catching here is the CNFE thrown by the parent of this
            // classloader. However, we would like to throw a CNFE that provides details about
            // the class path / list of dex files associated with *this* classloader, so we choose
            // to throw the exception thrown from that lookup.
            throw fromSuper;
        }
    }

    @Override
    public URL getResource(String name) {
        // The lookup order we use here is the same as for classes.

        URL resource = Object.class.getClassLoader().getResource(name);
        if (resource != null) {
            return resource;
        }

        resource = findResource(name);
        if (resource != null) {
            return resource;
        }

        if (delegateResourceLoading) {
            final ClassLoader cl = getParent();
            return (cl == null) ? null : cl.getResource(name);
        }
        return null;
    }

    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        @SuppressWarnings("unchecked")
        final Enumeration<URL>[] resources = (Enumeration<URL>[]) new Enumeration<?>[] {
                Object.class.getClassLoader().getResources(name),
                findResources(name),
                (getParent() == null || !delegateResourceLoading)
                        ? null : getParent().getResources(name) };

        return new CompoundEnumeration<>(resources);
    }
}
