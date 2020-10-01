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

import android.system.ErrnoException;
import android.system.StructStat;
import dalvik.annotation.compat.UnsupportedAppUsage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import libcore.io.ClassPathURLStreamHandler;
import libcore.io.IoUtils;
import libcore.io.Libcore;

import static android.system.OsConstants.S_ISDIR;

/**
 * A pair of lists of entries, associated with a {@code ClassLoader}.
 * One of the lists is a dex/resource path &mdash; typically referred
 * to as a "class path" &mdash; list, and the other names directories
 * containing native code libraries. Class path entries may be any of:
 * a {@code .jar} or {@code .zip} file containing an optional
 * top-level {@code classes.dex} file as well as arbitrary resources,
 * or a plain {@code .dex} file (with no possibility of associated
 * resources).
 *
 * <p>This class also contains methods to use these lists to look up
 * classes and resources.</p>
 *
 * @hide
 */
public final class DexPathList {
    private static final String DEX_SUFFIX = ".dex";
    private static final String zipSeparator = "!/";

    /** class definition context */
    @UnsupportedAppUsage
    private final ClassLoader definingContext;

    /**
     * List of dex/resource (class path) elements.
     * Should be called pathElements, but the Facebook app uses reflection
     * to modify 'dexElements' (http://b/7726934).
     */
    @UnsupportedAppUsage
    private Element[] dexElements;

    /** List of native library path elements. */
    // Some applications rely on this field being an array or we'd use a final list here
    @UnsupportedAppUsage
    /* package visible for testing */ NativeLibraryElement[] nativeLibraryPathElements;

    /** List of application native library directories. */
    @UnsupportedAppUsage
    private final List<File> nativeLibraryDirectories;

    /** List of system native library directories. */
    @UnsupportedAppUsage
    private final List<File> systemNativeLibraryDirectories;

    /**
     * Exceptions thrown during creation of the dexElements list.
     */
    @UnsupportedAppUsage
    private IOException[] dexElementsSuppressedExceptions;

    private List<File> getAllNativeLibraryDirectories() {
        List<File> allNativeLibraryDirectories = new ArrayList<>(nativeLibraryDirectories);
        allNativeLibraryDirectories.addAll(systemNativeLibraryDirectories);
        return allNativeLibraryDirectories;
    }

    /**
     * Construct an instance.
     *
     * @param definingContext the context in which any as-yet unresolved
     * classes should be defined
     *
     * @param dexFiles the bytebuffers containing the dex files that we should load classes from.
     */
    public DexPathList(ClassLoader definingContext, String librarySearchPath) {
        if (definingContext == null) {
            throw new NullPointerException("definingContext == null");
        }

        this.definingContext = definingContext;
        this.nativeLibraryDirectories = splitPaths(librarySearchPath, false);
        this.systemNativeLibraryDirectories =
                splitPaths(System.getProperty("java.library.path"), true);
        this.nativeLibraryPathElements = makePathElements(getAllNativeLibraryDirectories());
    }

    /**
     * Constructs an instance.
     *
     * @param definingContext the context in which any as-yet unresolved
     * classes should be defined
     * @param dexPath list of dex/resource path elements, separated by
     * {@code File.pathSeparator}
     * @param librarySearchPath list of native library directory path elements,
     * separated by {@code File.pathSeparator}
     * @param optimizedDirectory directory where optimized {@code .dex} files
     * should be found and written to, or {@code null} to use the default
     * system directory for same
     */
    @UnsupportedAppUsage
    public DexPathList(ClassLoader definingContext, String dexPath,
            String librarySearchPath, File optimizedDirectory) {
        this(definingContext, dexPath, librarySearchPath, optimizedDirectory, false);
    }

    DexPathList(ClassLoader definingContext, String dexPath,
            String librarySearchPath, File optimizedDirectory, boolean isTrusted) {
        if (definingContext == null) {
            throw new NullPointerException("definingContext == null");
        }

        if (dexPath == null) {
            throw new NullPointerException("dexPath == null");
        }

        if (optimizedDirectory != null) {
            if (!optimizedDirectory.exists())  {
                throw new IllegalArgumentException(
                        "optimizedDirectory doesn't exist: "
                        + optimizedDirectory);
            }

            if (!(optimizedDirectory.canRead()
                            && optimizedDirectory.canWrite())) {
                throw new IllegalArgumentException(
                        "optimizedDirectory not readable/writable: "
                        + optimizedDirectory);
            }
        }

        this.definingContext = definingContext;

        ArrayList<IOException> suppressedExceptions = new ArrayList<IOException>();
        // save dexPath for BaseDexClassLoader
        this.dexElements = makeDexElements(splitDexPath(dexPath), optimizedDirectory,
                                           suppressedExceptions, definingContext, isTrusted);

        // Native libraries may exist in both the system and
        // application library paths, and we use this search order:
        //
        //   1. This class loader's library path for application libraries (librarySearchPath):
        //   1.1. Native library directories
        //   1.2. Path to libraries in apk-files
        //   2. The VM's library path from the system property for system libraries
        //      also known as java.library.path
        //
        // This order was reversed prior to Gingerbread; see http://b/2933456.
        this.nativeLibraryDirectories = splitPaths(librarySearchPath, false);
        this.systemNativeLibraryDirectories =
                splitPaths(System.getProperty("java.library.path"), true);
        this.nativeLibraryPathElements = makePathElements(getAllNativeLibraryDirectories());

        if (suppressedExceptions.size() > 0) {
            this.dexElementsSuppressedExceptions =
                suppressedExceptions.toArray(new IOException[suppressedExceptions.size()]);
        } else {
            dexElementsSuppressedExceptions = null;
        }
    }

    @Override public String toString() {
        return "DexPathList[" + Arrays.toString(dexElements) +
            ",nativeLibraryDirectories=" +
            Arrays.toString(getAllNativeLibraryDirectories().toArray()) + "]";
    }

    /**
     * For BaseDexClassLoader.getLdLibraryPath.
     */
    public List<File> getNativeLibraryDirectories() {
        return nativeLibraryDirectories;
    }

    /**
     * Adds a new path to this instance
     * @param dexPath list of dex/resource path element, separated by
     * {@code File.pathSeparator}
     * @param optimizedDirectory directory where optimized {@code .dex} files
     * should be found and written to, or {@code null} to use the default
     * system directory for same
     */
    @UnsupportedAppUsage
    public void addDexPath(String dexPath, File optimizedDirectory) {
      addDexPath(dexPath, optimizedDirectory, false);
    }

    public void addDexPath(String dexPath, File optimizedDirectory, boolean isTrusted) {
        final List<IOException> suppressedExceptionList = new ArrayList<IOException>();
        final Element[] newElements = makeDexElements(splitDexPath(dexPath), optimizedDirectory,
                suppressedExceptionList, definingContext, isTrusted);

        if (newElements != null && newElements.length > 0) {
            final Element[] oldElements = dexElements;
            dexElements = new Element[oldElements.length + newElements.length];
            System.arraycopy(
                    oldElements, 0, dexElements, 0, oldElements.length);
            System.arraycopy(
                    newElements, 0, dexElements, oldElements.length, newElements.length);
        }

        if (suppressedExceptionList.size() > 0) {
            final IOException[] newSuppressedExceptions = suppressedExceptionList.toArray(
                    new IOException[suppressedExceptionList.size()]);
            if (dexElementsSuppressedExceptions != null) {
                final IOException[] oldSuppressedExceptions = dexElementsSuppressedExceptions;
                final int suppressedExceptionsLength = oldSuppressedExceptions.length +
                        newSuppressedExceptions.length;
                dexElementsSuppressedExceptions = new IOException[suppressedExceptionsLength];
                System.arraycopy(oldSuppressedExceptions, 0, dexElementsSuppressedExceptions,
                        0, oldSuppressedExceptions.length);
                System.arraycopy(newSuppressedExceptions, 0, dexElementsSuppressedExceptions,
                        oldSuppressedExceptions.length, newSuppressedExceptions.length);
            } else {
                dexElementsSuppressedExceptions = newSuppressedExceptions;
            }
        }
    }

    /**
     * For InMemoryDexClassLoader. Initializes {@code dexElements} with dex files
     * loaded from {@code dexFiles} buffers.
     *
     * @param dexFiles ByteBuffers containing raw dex data. Apks are not supported.
     */
    /* package */ void initByteBufferDexPath(ByteBuffer[] dexFiles) {
        if (dexFiles == null) {
            throw new NullPointerException("dexFiles == null");
        }
        if (Arrays.stream(dexFiles).anyMatch(v -> v == null)) {
            throw new NullPointerException("dexFiles contains a null Buffer!");
        }
        if (dexElements != null || dexElementsSuppressedExceptions != null) {
            throw new IllegalStateException("Should only be called once");
        }

        final List<IOException> suppressedExceptions = new ArrayList<IOException>();

        try {
            Element[] null_elements = null;
            DexFile dex = new DexFile(dexFiles, definingContext, null_elements);
            // Capture class loader context from *before* `dexElements` is set (see comment below).
            String classLoaderContext = dex.isBackedByOatFile()
                    ? null : DexFile.getClassLoaderContext(definingContext, null_elements);
            dexElements = new Element[] { new Element(dex) };
            // Spawn background thread to verify all classes and cache verification results.
            // Must be called *after* `dexElements` has been initialized for ART to find
            // its classes (the field is hardcoded in ART and dex files iterated over in
            // the order of the array), but with class loader context from *before*
            // `dexElements` was set because that is what it will be compared against next
            // time the same bytecode is loaded.
            // We only spawn the background thread if the bytecode is not backed by an oat
            // file, i.e. this is the first time this bytecode is being loaded and/or
            // verification results have not been cached yet. Skip spawning the thread on
            // all subsequent loads of the same bytecode in the same class loader context.
            if (classLoaderContext != null) {
                dex.verifyInBackground(definingContext, classLoaderContext);
            }
        } catch (IOException suppressed) {
            System.logE("Unable to load dex files", suppressed);
            suppressedExceptions.add(suppressed);
            dexElements = new Element[0];
        }

        if (suppressedExceptions.size() > 0) {
            dexElementsSuppressedExceptions = suppressedExceptions.toArray(
                    new IOException[suppressedExceptions.size()]);
        }
    }

    /**
     * Splits the given dex path string into elements using the path
     * separator, pruning out any elements that do not refer to existing
     * and readable files.
     */
    private static List<File> splitDexPath(String path) {
        return splitPaths(path, false);
    }

    /**
     * Splits the given path strings into file elements using the path
     * separator, combining the results and filtering out elements
     * that don't exist, aren't readable, or aren't either a regular
     * file or a directory (as specified). Either string may be empty
     * or {@code null}, in which case it is ignored. If both strings
     * are empty or {@code null}, or all elements get pruned out, then
     * this returns a zero-element list.
     */
    @UnsupportedAppUsage
    private static List<File> splitPaths(String searchPath, boolean directoriesOnly) {
        List<File> result = new ArrayList<>();

        if (searchPath != null) {
            for (String path : searchPath.split(File.pathSeparator)) {
                if (directoriesOnly) {
                    try {
                        StructStat sb = Libcore.os.stat(path);
                        if (!S_ISDIR(sb.st_mode)) {
                            continue;
                        }
                    } catch (ErrnoException ignored) {
                        continue;
                    }
                }
                result.add(new File(path));
            }
        }

        return result;
    }

    // This method is not used anymore. Kept around only because there are many legacy users of it.
    @SuppressWarnings("unused")
    @UnsupportedAppUsage
    public static Element[] makeInMemoryDexElements(ByteBuffer[] dexFiles,
            List<IOException> suppressedExceptions) {
        Element[] elements = new Element[dexFiles.length];
        int elementPos = 0;
        for (ByteBuffer buf : dexFiles) {
            try {
                DexFile dex = new DexFile(new ByteBuffer[] { buf }, /* classLoader */ null,
                        /* dexElements */ null);
                elements[elementPos++] = new Element(dex);
            } catch (IOException suppressed) {
                System.logE("Unable to load dex file: " + buf, suppressed);
                suppressedExceptions.add(suppressed);
            }
        }
        if (elementPos != elements.length) {
            elements = Arrays.copyOf(elements, elementPos);
        }
        return elements;
    }

    /**
     * Makes an array of dex/resource path elements, one per element of
     * the given array.
     */
    @UnsupportedAppUsage
    private static Element[] makeDexElements(List<File> files, File optimizedDirectory,
            List<IOException> suppressedExceptions, ClassLoader loader) {
        return makeDexElements(files, optimizedDirectory, suppressedExceptions, loader, false);
    }


    private static Element[] makeDexElements(List<File> files, File optimizedDirectory,
            List<IOException> suppressedExceptions, ClassLoader loader, boolean isTrusted) {
      Element[] elements = new Element[files.size()];
      int elementsPos = 0;
      /*
       * Open all files and load the (direct or contained) dex files up front.
       */
      for (File file : files) {
          if (file.isDirectory()) {
              // We support directories for looking up resources. Looking up resources in
              // directories is useful for running libcore tests.
              elements[elementsPos++] = new Element(file);
          } else if (file.isFile()) {
              String name = file.getName();

              DexFile dex = null;
              if (name.endsWith(DEX_SUFFIX)) {
                  // Raw dex file (not inside a zip/jar).
                  try {
                      dex = loadDexFile(file, optimizedDirectory, loader, elements);
                      if (dex != null) {
                          elements[elementsPos++] = new Element(dex, null);
                      }
                  } catch (IOException suppressed) {
                      System.logE("Unable to load dex file: " + file, suppressed);
                      suppressedExceptions.add(suppressed);
                  }
              } else {
                  try {
                      dex = loadDexFile(file, optimizedDirectory, loader, elements);
                  } catch (IOException suppressed) {
                      /*
                       * IOException might get thrown "legitimately" by the DexFile constructor if
                       * the zip file turns out to be resource-only (that is, no classes.dex file
                       * in it).
                       * Let dex == null and hang on to the exception to add to the tea-leaves for
                       * when findClass returns null.
                       */
                      suppressedExceptions.add(suppressed);
                  }

                  if (dex == null) {
                      elements[elementsPos++] = new Element(file);
                  } else {
                      elements[elementsPos++] = new Element(dex, file);
                  }
              }
              if (dex != null && isTrusted) {
                dex.setTrusted();
              }
          } else {
              System.logW("ClassLoader referenced unknown path: " + file);
          }
      }
      if (elementsPos != elements.length) {
          elements = Arrays.copyOf(elements, elementsPos);
      }
      return elements;
    }

    /**
     * Constructs a {@code DexFile} instance, as appropriate depending on whether
     * {@code optimizedDirectory} is {@code null}. An application image file may be associated with
     * the {@code loader} if it is not null.
     */
    @UnsupportedAppUsage
    private static DexFile loadDexFile(File file, File optimizedDirectory, ClassLoader loader,
                                       Element[] elements)
            throws IOException {
        if (optimizedDirectory == null) {
            return new DexFile(file, loader, elements);
        } else {
            String optimizedPath = optimizedPathFor(file, optimizedDirectory);
            return DexFile.loadDex(file.getPath(), optimizedPath, 0, loader, elements);
        }
    }

    /**
     * Converts a dex/jar file path and an output directory to an
     * output file path for an associated optimized dex file.
     */
    private static String optimizedPathFor(File path,
            File optimizedDirectory) {
        /*
         * Get the filename component of the path, and replace the
         * suffix with ".dex" if that's not already the suffix.
         *
         * We don't want to use ".odex", because the build system uses
         * that for files that are paired with resource-only jar
         * files. If the VM can assume that there's no classes.dex in
         * the matching jar, it doesn't need to open the jar to check
         * for updated dependencies, providing a slight performance
         * boost at startup. The use of ".dex" here matches the use on
         * files in /data/dalvik-cache.
         */
        String fileName = path.getName();
        if (!fileName.endsWith(DEX_SUFFIX)) {
            int lastDot = fileName.lastIndexOf(".");
            if (lastDot < 0) {
                fileName += DEX_SUFFIX;
            } else {
                StringBuilder sb = new StringBuilder(lastDot + 4);
                sb.append(fileName, 0, lastDot);
                sb.append(DEX_SUFFIX);
                fileName = sb.toString();
            }
        }

        File result = new File(optimizedDirectory, fileName);
        return result.getPath();
    }

    /*
     * TODO (dimitry): Revert after apps stops relying on the existence of this
     * method (see http://b/21957414 and http://b/26317852 for details)
     */
    @UnsupportedAppUsage
    @SuppressWarnings("unused")
    private static Element[] makePathElements(List<File> files, File optimizedDirectory,
            List<IOException> suppressedExceptions) {
        return makeDexElements(files, optimizedDirectory, suppressedExceptions, null);
    }

    /**
     * Makes an array of directory/zip path elements for the native library search path, one per
     * element of the given array.
     */
    @UnsupportedAppUsage
    private static NativeLibraryElement[] makePathElements(List<File> files) {
        NativeLibraryElement[] elements = new NativeLibraryElement[files.size()];
        int elementsPos = 0;
        for (File file : files) {
            String path = file.getPath();

            if (path.contains(zipSeparator)) {
                String split[] = path.split(zipSeparator, 2);
                File zip = new File(split[0]);
                String dir = split[1];
                elements[elementsPos++] = new NativeLibraryElement(zip, dir);
            } else if (file.isDirectory()) {
                // We support directories for looking up native libraries.
                elements[elementsPos++] = new NativeLibraryElement(file);
            }
        }
        if (elementsPos != elements.length) {
            elements = Arrays.copyOf(elements, elementsPos);
        }
        return elements;
    }

    /**
     * Finds the named class in one of the dex files pointed at by
     * this instance. This will find the one in the earliest listed
     * path element. If the class is found but has not yet been
     * defined, then this method will define it in the defining
     * context that this instance was constructed with.
     *
     * @param name of class to find
     * @param suppressed exceptions encountered whilst finding the class
     * @return the named class or {@code null} if the class is not
     * found in any of the dex files
     */
    public Class<?> findClass(String name, List<Throwable> suppressed) {
        for (Element element : dexElements) {
            Class<?> clazz = element.findClass(name, definingContext, suppressed);
            if (clazz != null) {
                return clazz;
            }
        }

        if (dexElementsSuppressedExceptions != null) {
            suppressed.addAll(Arrays.asList(dexElementsSuppressedExceptions));
        }
        return null;
    }

    /**
     * Finds the named resource in one of the zip/jar files pointed at
     * by this instance. This will find the one in the earliest listed
     * path element.
     *
     * @return a URL to the named resource or {@code null} if the
     * resource is not found in any of the zip/jar files
     */
    public URL findResource(String name) {
        for (Element element : dexElements) {
            URL url = element.findResource(name);
            if (url != null) {
                return url;
            }
        }

        return null;
    }

    /**
     * Finds all the resources with the given name, returning an
     * enumeration of them. If there are no resources with the given
     * name, then this method returns an empty enumeration.
     */
    public Enumeration<URL> findResources(String name) {
        ArrayList<URL> result = new ArrayList<URL>();

        for (Element element : dexElements) {
            URL url = element.findResource(name);
            if (url != null) {
                result.add(url);
            }
        }

        return Collections.enumeration(result);
    }

    /**
     * Finds the named native code library on any of the library
     * directories pointed at by this instance. This will find the
     * one in the earliest listed directory, ignoring any that are not
     * readable regular files.
     *
     * @return the complete path to the library or {@code null} if no
     * library was found
     */
    public String findLibrary(String libraryName) {
        String fileName = System.mapLibraryName(libraryName);

        for (NativeLibraryElement element : nativeLibraryPathElements) {
            String path = element.findNativeLibrary(fileName);

            if (path != null) {
                return path;
            }
        }

        return null;
    }

    /**
     * Returns the list of all individual dex files paths from the current list.
     * The list will contain only file paths (i.e. no directories).
     */
    /*package*/ List<String> getDexPaths() {
        List<String> dexPaths = new ArrayList<String>();
        for (Element e : dexElements) {
            String dexPath = e.getDexPath();
            if (dexPath != null) {
                // Add the element to the list only if it is a file. A null dex path signals the
                // element is a resource directory or an in-memory dex file.
                dexPaths.add(dexPath);
            }
        }
        return dexPaths;
    }

    /**
     * Adds a collection of library paths from which to load native libraries. Paths can be absolute
     * native library directories (i.e. /data/app/foo/lib/arm64) or apk references (i.e.
     * /data/app/foo/base.apk!/lib/arm64).
     *
     * Note: This method will attempt to dedupe elements.
     * Note: This method replaces the value of {@link #nativeLibraryPathElements}
     */
    @UnsupportedAppUsage
    public void addNativePath(Collection<String> libPaths) {
        if (libPaths.isEmpty()) {
            return;
        }
        List<File> libFiles = new ArrayList<>(libPaths.size());
        for (String path : libPaths) {
            libFiles.add(new File(path));
        }
        ArrayList<NativeLibraryElement> newPaths =
                new ArrayList<>(nativeLibraryPathElements.length + libPaths.size());
        newPaths.addAll(Arrays.asList(nativeLibraryPathElements));
        for (NativeLibraryElement element : makePathElements(libFiles)) {
            if (!newPaths.contains(element)) {
                newPaths.add(element);
            }
        }
        nativeLibraryPathElements = newPaths.toArray(new NativeLibraryElement[newPaths.size()]);
    }

    /**
     * Element of the dex/resource path. Note: should be called DexElement, but apps reflect on
     * this.
     */
    /*package*/ static class Element {
        /**
         * A file denoting a zip file (in case of a resource jar or a dex jar), or a directory
         * (only when dexFile is null).
         */
        @UnsupportedAppUsage
        private final File path;
        /** Whether {@code path.isDirectory()}, or {@code null} if {@code path == null}. */
        private final Boolean pathIsDirectory;

        @UnsupportedAppUsage
        private final DexFile dexFile;

        private ClassPathURLStreamHandler urlHandler;
        private boolean initialized;

        /**
         * Element encapsulates a dex file. This may be a plain dex file (in which case dexZipPath
         * should be null), or a jar (in which case dexZipPath should denote the zip file).
         */
        @UnsupportedAppUsage
        public Element(DexFile dexFile, File dexZipPath) {
            if (dexFile == null && dexZipPath == null) {
                throw new NullPointerException("Either dexFile or path must be non-null");
            }
            this.dexFile = dexFile;
            this.path = dexZipPath;
            // Do any I/O in the constructor so we don't have to do it elsewhere, eg. toString().
            this.pathIsDirectory = (path == null) ? null : path.isDirectory();
        }

        public Element(DexFile dexFile) {
            this(dexFile, null);
        }

        public Element(File path) {
            this(null, path);
        }

        /**
         * Constructor for a bit of backwards compatibility. Some apps use reflection into
         * internal APIs. Warn, and emulate old behavior if we can. See b/33399341.
         *
         * @deprecated The Element class has been split. Use new Element constructors for
         *             classes and resources, and NativeLibraryElement for the library
         *             search path.
         */
        @UnsupportedAppUsage
        @Deprecated
        public Element(File dir, boolean isDirectory, File zip, DexFile dexFile) {
            this(dir != null ? null : dexFile, dir != null ? dir : zip);
            System.err.println("Warning: Using deprecated Element constructor. Do not use internal"
                    + " APIs, this constructor will be removed in the future.");
            if (dir != null && (zip != null || dexFile != null)) {
                throw new IllegalArgumentException("Using dir and zip|dexFile no longer"
                        + " supported.");
            }
            if (isDirectory && (zip != null || dexFile != null)) {
                throw new IllegalArgumentException("Unsupported argument combination.");
            }
        }

        /*
         * Returns the dex path of this element or null if the element refers to a directory.
         */
        private String getDexPath() {
            if (path != null) {
                return path.isDirectory() ? null : path.getAbsolutePath();
            } else if (dexFile != null) {
                // DexFile.getName() returns the path of the dex file.
                return dexFile.getName();
            }
            return null;
        }

        @Override
        public String toString() {
            if (dexFile == null) {
              return (pathIsDirectory ? "directory \"" : "zip file \"") + path + "\"";
            } else if (path == null) {
              return "dex file \"" + dexFile + "\"";
            } else {
              return "zip file \"" + path + "\"";
            }
        }

        public synchronized void maybeInit() {
            if (initialized) {
                return;
            }

            if (path == null || pathIsDirectory) {
                initialized = true;
                return;
            }

            try {
                urlHandler = new ClassPathURLStreamHandler(path.getPath());
            } catch (IOException ioe) {
                /*
                 * Note: ZipException (a subclass of IOException)
                 * might get thrown by the ZipFile constructor
                 * (e.g. if the file isn't actually a zip/jar
                 * file).
                 */
                System.logE("Unable to open zip file: " + path, ioe);
                urlHandler = null;
            }

            // Mark this element as initialized only after we've successfully created
            // the associated ClassPathURLStreamHandler. That way, we won't leave this
            // element in an inconsistent state if an exception is thrown during initialization.
            //
            // See b/35633614.
            initialized = true;
        }

        public Class<?> findClass(String name, ClassLoader definingContext,
                List<Throwable> suppressed) {
            return dexFile != null ? dexFile.loadClassBinaryName(name, definingContext, suppressed)
                    : null;
        }

        public URL findResource(String name) {
            maybeInit();

            if (urlHandler != null) {
              return urlHandler.getEntryUrlOrNull(name);
            }

            // We support directories so we can run tests and/or legacy code
            // that uses Class.getResource.
            if (path != null && path.isDirectory()) {
                File resourceFile = new File(path, name);
                if (resourceFile.exists()) {
                    try {
                        return resourceFile.toURI().toURL();
                    } catch (MalformedURLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }

            return null;
        }
    }

    /**
     * Element of the native library path
     */
    /*package*/ static class NativeLibraryElement {
        /**
         * A file denoting a directory or zip file.
         */
        @UnsupportedAppUsage
        private final File path;

        /**
         * If path denotes a zip file, this denotes a base path inside the zip.
         */
        private final String zipDir;

        private ClassPathURLStreamHandler urlHandler;
        private boolean initialized;

        @UnsupportedAppUsage
        public NativeLibraryElement(File dir) {
            this.path = dir;
            this.zipDir = null;

            // We should check whether path is a directory, but that is non-eliminatable overhead.
        }

        public NativeLibraryElement(File zip, String zipDir) {
            this.path = zip;
            this.zipDir = zipDir;

            // Simple check that should be able to be eliminated by inlining. We should also
            // check whether path is a file, but that is non-eliminatable overhead.
            if (zipDir == null) {
              throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            if (zipDir == null) {
                return "directory \"" + path + "\"";
            } else {
                return "zip file \"" + path + "\"" +
                  (!zipDir.isEmpty() ? ", dir \"" + zipDir + "\"" : "");
            }
        }

        public synchronized void maybeInit() {
            if (initialized) {
                return;
            }

            if (zipDir == null) {
                initialized = true;
                return;
            }

            try {
                urlHandler = new ClassPathURLStreamHandler(path.getPath());
            } catch (IOException ioe) {
                /*
                 * Note: ZipException (a subclass of IOException)
                 * might get thrown by the ZipFile constructor
                 * (e.g. if the file isn't actually a zip/jar
                 * file).
                 */
                System.logE("Unable to open zip file: " + path, ioe);
                urlHandler = null;
            }

            // Mark this element as initialized only after we've successfully created
            // the associated ClassPathURLStreamHandler. That way, we won't leave this
            // element in an inconsistent state if an exception is thrown during initialization.
            //
            // See b/35633614.
            initialized = true;
        }

        public String findNativeLibrary(String name) {
            maybeInit();

            if (zipDir == null) {
                String entryPath = new File(path, name).getPath();
                if (IoUtils.canOpenReadOnly(entryPath)) {
                    return entryPath;
                }
            } else if (urlHandler != null) {
                // Having a urlHandler means the element has a zip file.
                // In this case Android supports loading the library iff
                // it is stored in the zip uncompressed.
                String entryName = zipDir + '/' + name;
                if (urlHandler.isEntryStored(entryName)) {
                  return path.getPath() + zipSeparator + entryName;
                }
            }

            return null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof NativeLibraryElement)) return false;
            NativeLibraryElement that = (NativeLibraryElement) o;
            return Objects.equals(path, that.path) &&
                    Objects.equals(zipDir, that.zipDir);
        }

        @Override
        public int hashCode() {
            return Objects.hash(path, zipDir);
        }
    }
}
