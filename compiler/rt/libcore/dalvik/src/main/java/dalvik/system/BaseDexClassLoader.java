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

package dalvik.system;

import dalvik.annotation.compat.UnsupportedAppUsage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import sun.misc.CompoundEnumeration;

/**
 * Base class for common functionality between various dex-based
 * {@link ClassLoader} implementations.
 */
public class BaseDexClassLoader extends ClassLoader {

    /**
     * Hook for customizing how dex files loads are reported.
     *
     * This enables the framework to monitor the use of dex files. The
     * goal is to simplify the mechanism for optimizing foreign dex files and
     * enable further optimizations of secondary dex files.
     *
     * The reporting happens only when new instances of BaseDexClassLoader
     * are constructed and will be active only after this field is set with
     * {@link BaseDexClassLoader#setReporter}.
     */
    /* @NonNull */ private static volatile Reporter reporter = null;

    @UnsupportedAppUsage
    private final DexPathList pathList;

    /**
     * Array of ClassLoaders that can be used to load classes and resources that the code in
     * {@code pathList} may depend on. This is used to implement Android's
     * <a href=https://developer.android.com/guide/topics/manifest/uses-library-element>
     * shared libraries</a> feature.
     * <p>The shared library loaders are always checked before the {@code pathList} when looking
     * up classes and resources.
     *
     * <p>{@code null} if the class loader has no shared library.
     *
     * @hide
     */
    protected final ClassLoader[] sharedLibraryLoaders;

    /**
     * Constructs an instance.
     * Note that all the *.jar and *.apk files from {@code dexPath} might be
     * first extracted in-memory before the code is loaded. This can be avoided
     * by passing raw dex files (*.dex) in the {@code dexPath}.
     *
     * @param dexPath the list of jar/apk files containing classes and
     * resources, delimited by {@code File.pathSeparator}, which
     * defaults to {@code ":"} on Android.
     * @param optimizedDirectory this parameter is deprecated and has no effect since API level 26.
     * @param librarySearchPath the list of directories containing native
     * libraries, delimited by {@code File.pathSeparator}; may be
     * {@code null}
     * @param parent the parent class loader
     */
    public BaseDexClassLoader(String dexPath, File optimizedDirectory,
            String librarySearchPath, ClassLoader parent) {
        this(dexPath, librarySearchPath, parent, null, false);
    }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public BaseDexClassLoader(String dexPath, File optimizedDirectory,
            String librarySearchPath, ClassLoader parent, boolean isTrusted) {
        this(dexPath, librarySearchPath, parent, null, isTrusted);
    }

    /**
     * @hide
     */
    public BaseDexClassLoader(String dexPath,
            String librarySearchPath, ClassLoader parent, ClassLoader[] libraries) {
        this(dexPath, librarySearchPath, parent, libraries, false);
    }

    /**
     * BaseDexClassLoader implements the Android
     * <a href=https://developer.android.com/guide/topics/manifest/uses-library-element>
     * shared libraries</a> feature by changing the typical parent delegation mechanism
     * of class loaders.
     * <p> Each shared library is associated with its own class loader, which is added to a list of
     * class loaders this BaseDexClassLoader tries to load from in order, immediately checking
     * after the parent.
     * The shared library loaders are always checked before the {@code pathList} when looking
     * up classes and resources.
     *
     * @hide
     */
    public BaseDexClassLoader(String dexPath,
            String librarySearchPath, ClassLoader parent, ClassLoader[] sharedLibraryLoaders,
            boolean isTrusted) {
        super(parent);
        // Setup shared libraries before creating the path list. ART relies on the class loader
        // hierarchy being finalized before loading dex files.
        this.sharedLibraryLoaders = sharedLibraryLoaders == null
                ? null
                : Arrays.copyOf(sharedLibraryLoaders, sharedLibraryLoaders.length);
        this.pathList = new DexPathList(this, dexPath, librarySearchPath, null, isTrusted);

        if (reporter != null) {
            reportClassLoaderChain();
        }
    }

    /**
     * Reports the current class loader chain to the registered {@code reporter}.
     */
    private void reportClassLoaderChain() {
        ArrayList<ClassLoader> classLoadersChain = new ArrayList<>();
        ArrayList<String> classPaths = new ArrayList<>();

        classLoadersChain.add(this);
        classPaths.add(String.join(File.pathSeparator, pathList.getDexPaths()));

        ClassLoader bootClassLoader = ClassLoader.getSystemClassLoader().getParent();
        ClassLoader current = getParent();

        while (current != null && current != bootClassLoader) {
            classLoadersChain.add(current);
            if (current instanceof BaseDexClassLoader) {
                BaseDexClassLoader bdcCurrent = (BaseDexClassLoader) current;
                classPaths.add(String.join(File.pathSeparator, bdcCurrent.pathList.getDexPaths()));
            } else {
                // We can't determine the classpath for arbitrary class loaders.
                classPaths.add(null);
            }
            current = current.getParent();
        }

        reporter.report(classLoadersChain, classPaths);
    }

    /**
     * Constructs an instance.
     *
     * dexFile must be an in-memory representation of a full dexFile.
     *
     * @param dexFiles the array of in-memory dex files containing classes.
     * @param librarySearchPath the list of directories containing native
     *   libraries, delimited by {@code File.pathSeparator}; may be {@code null}
     * @param parent the parent class loader
     *
     * @hide
     */
    public BaseDexClassLoader(ByteBuffer[] dexFiles, String librarySearchPath, ClassLoader parent) {
        super(parent);
        this.sharedLibraryLoaders = null;
        this.pathList = new DexPathList(this, librarySearchPath);
        this.pathList.initByteBufferDexPath(dexFiles);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // First, check whether the class is present in our shared libraries.
        if (sharedLibraryLoaders != null) {
            for (ClassLoader loader : sharedLibraryLoaders) {
                try {
                    return loader.loadClass(name);
                } catch (ClassNotFoundException ignored) {
                }
            }
        }
        // Check whether the class in question is present in the dexPath that
        // this classloader operates on.
        List<Throwable> suppressedExceptions = new ArrayList<Throwable>();
        Class c = pathList.findClass(name, suppressedExceptions);
        if (c == null) {
            ClassNotFoundException cnfe = new ClassNotFoundException(
                    "Didn't find class \"" + name + "\" on path: " + pathList);
            for (Throwable t : suppressedExceptions) {
                cnfe.addSuppressed(t);
            }
            throw cnfe;
        }
        return c;
    }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    @libcore.api.CorePlatformApi
    public void addDexPath(String dexPath) {
        addDexPath(dexPath, false /*isTrusted*/);
    }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void addDexPath(String dexPath, boolean isTrusted) {
        pathList.addDexPath(dexPath, null /*optimizedDirectory*/, isTrusted);
    }

    /**
     * Adds additional native paths for consideration in subsequent calls to
     * {@link #findLibrary(String)}
     * @hide
     */
    @libcore.api.CorePlatformApi
    public void addNativePath(Collection<String> libPaths) {
        pathList.addNativePath(libPaths);
    }

    @Override
    protected URL findResource(String name) {
        if (sharedLibraryLoaders != null) {
            for (ClassLoader loader : sharedLibraryLoaders) {
                URL url = loader.getResource(name);
                if (url != null) {
                    return url;
                }
            }
        }
        return pathList.findResource(name);
    }

    @Override
    protected Enumeration<URL> findResources(String name) {
        Enumeration<URL> myResources = pathList.findResources(name);
        if (sharedLibraryLoaders == null) {
          return myResources;
        }

        Enumeration<URL>[] tmp =
            (Enumeration<URL>[]) new Enumeration<?>[sharedLibraryLoaders.length + 1];
        // This will add duplicate resources if a shared library is loaded twice, but that's ok
        // as we don't guarantee uniqueness.
        for (int i = 0; i < sharedLibraryLoaders.length; i++) {
            try {
                tmp[i] = sharedLibraryLoaders[i].getResources(name);
            } catch (IOException e) {
                // Ignore.
            }
        }
        tmp[sharedLibraryLoaders.length] = myResources;
        return new CompoundEnumeration<>(tmp);
    }

    @Override
    public String findLibrary(String name) {
        return pathList.findLibrary(name);
    }

    /**
     * Returns package information for the given package.
     * Unfortunately, instances of this class don't really have this
     * information, and as a non-secure {@code ClassLoader}, it isn't
     * even required to, according to the spec. Yet, we want to
     * provide it, in order to make all those hopeful callers of
     * {@code myClass.getPackage().getName()} happy. Thus we construct
     * a {@code Package} object the first time it is being requested
     * and fill most of the fields with dummy values. The {@code
     * Package} object is then put into the {@code ClassLoader}'s
     * package cache, so we see the same one next time. We don't
     * create {@code Package} objects for {@code null} arguments or
     * for the default package.
     *
     * <p>There is a limited chance that we end up with multiple
     * {@code Package} objects representing the same package: It can
     * happen when when a package is scattered across different JAR
     * files which were loaded by different {@code ClassLoader}
     * instances. This is rather unlikely, and given that this whole
     * thing is more or less a workaround, probably not worth the
     * effort to address.
     *
     * @param name the name of the class
     * @return the package information for the class, or {@code null}
     * if there is no package information available for it
     */
    @Override
    protected synchronized Package getPackage(String name) {
        if (name != null && !name.isEmpty()) {
            Package pack = super.getPackage(name);

            if (pack == null) {
                pack = definePackage(name, "Unknown", "0.0", "Unknown",
                        "Unknown", "0.0", "Unknown", null);
            }

            return pack;
        }

        return null;
    }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    @libcore.api.CorePlatformApi
    public String getLdLibraryPath() {
        StringBuilder result = new StringBuilder();
        for (File directory : pathList.getNativeLibraryDirectories()) {
            if (result.length() > 0) {
                result.append(':');
            }
            result.append(directory);
        }

        return result.toString();
    }

    @Override public String toString() {
        return getClass().getName() + "[" + pathList + "]";
    }

    /**
     * Sets the reporter for dex load notifications.
     * Once set, all new instances of BaseDexClassLoader will report upon
     * constructions the loaded dex files.
     *
     * @param newReporter the new Reporter. Setting null will cancel reporting.
     * @hide
     */
    @libcore.api.CorePlatformApi
    public static void setReporter(Reporter newReporter) {
        reporter = newReporter;
    }

    /**
     * @hide
     */
    public static Reporter getReporter() {
        return reporter;
    }

    /**
     * @hide
     */
    @libcore.api.CorePlatformApi
    public interface Reporter {
        /**
         * Reports the construction of a BaseDexClassLoader and provides information about the
         * class loader chain.
         *
         * @param classLoadersChain the chain of class loaders used during the construction of the
         *     class loader. The first element is the BaseDexClassLoader being constructed,
         *     the second element is its parent, and so on.
         * @param classPaths the class paths of the class loaders present in
         *     {@param classLoadersChain}. The first element corresponds to the first class
         *     loader and so on. A classpath is represented as a list of dex files separated by
         *     {@code File.pathSeparator}. If the class loader is not a BaseDexClassLoader the
         *     classpath will be null.
         */
        @libcore.api.CorePlatformApi
        void report(List<ClassLoader> classLoadersChain, List<String> classPaths);
    }
}
