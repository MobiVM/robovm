/*
 * Copyright (C) 2007 The Android Open Source Project
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
import dalvik.annotation.compat.UnsupportedAppUsage;
import dalvik.annotation.optimization.ReachabilitySensitive;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import libcore.io.Libcore;

/**
 * Loads DEX files. This class is meant for internal use and should not be used
 * by applications.
 *
 * @deprecated This class should not be used directly by applications. It will hurt
 *     performance in most cases and will lead to incorrect execution of bytecode in
 *     the worst case. Applications should use one of the standard classloaders such
 *     as {@link dalvik.system.PathClassLoader} instead. <b>This API will be removed
 *     in a future Android release</b>.
 */
@libcore.api.CorePlatformApi
@Deprecated
public final class DexFile {
  /**
   * If close is called, mCookie becomes null but the internal cookie is preserved if the close
   * failed so that we can free resources in the finalizer.
   */
    @UnsupportedAppUsage
    @ReachabilitySensitive
    private Object mCookie;

    @UnsupportedAppUsage
    private Object mInternalCookie;
    @UnsupportedAppUsage
    private final String mFileName;

    /**
     * Opens a DEX file from a given File object.
     *
     * @deprecated Applications should use one of the standard classloaders such
     *     as {@link dalvik.system.PathClassLoader} instead. <b>This API will be removed
     *     in a future Android release</b>.
     */
    @Deprecated
    public DexFile(File file) throws IOException {
        this(file.getPath());
    }
    /*
     * Private version with class loader argument.
     *
     * @param file
     *            the File object referencing the actual DEX file
     * @param loader
     *            the class loader object creating the DEX file object
     * @param elements
     *            the temporary dex path list elements from DexPathList.makeElements
     */
    DexFile(File file, ClassLoader loader, DexPathList.Element[] elements)
            throws IOException {
        this(file.getPath(), loader, elements);
    }

    /**
     * Opens a DEX file from a given filename.
     *
     * @deprecated Applications should use one of the standard classloaders such
     *     as {@link dalvik.system.PathClassLoader} instead. <b>This API will be removed
     *     in a future Android release</b>.
     */
    @Deprecated
    public DexFile(String fileName) throws IOException {
        this(fileName, null, null);
    }

    /*
     * Private version with class loader argument.
     *
     * @param fileName
     *            the filename of the DEX file
     * @param loader
     *            the class loader creating the DEX file object
     * @param elements
     *            the temporary dex path list elements from DexPathList.makeElements
     */
    DexFile(String fileName, ClassLoader loader, DexPathList.Element[] elements)
            throws IOException {
        mCookie = openDexFile(fileName, null, 0, loader, elements);
        mInternalCookie = mCookie;
        mFileName = fileName;
        //System.out.println("DEX FILE cookie is " + mCookie + " fileName=" + fileName);
    }

    DexFile(ByteBuffer[] bufs, ClassLoader loader, DexPathList.Element[] elements)
            throws IOException {
        mCookie = openInMemoryDexFiles(bufs, loader, elements);
        mInternalCookie = mCookie;
        mFileName = null;
    }

    /**
     * Opens a DEX file from a given filename, using a specified file
     * to hold the optimized data.
     *
     * @param sourceName
     *  Jar or APK file with "classes.dex".
     * @param outputName
     *  File that will hold the optimized form of the DEX data.
     * @param flags
     *  Enable optional features.
     * @param loader
     *  The class loader creating the DEX file object.
     * @param elements
     *  The temporary dex path list elements from DexPathList.makeElements
     */
    private DexFile(String sourceName, String outputName, int flags, ClassLoader loader,
            DexPathList.Element[] elements) throws IOException {
        if (outputName != null) {
            try {
                String parent = new File(outputName).getParent();
                if (Libcore.os.getuid() != Libcore.os.stat(parent).st_uid) {
                    throw new IllegalArgumentException("Optimized data directory " + parent
                            + " is not owned by the current user. Shared storage cannot protect"
                            + " your application from code injection attacks.");
                }
            } catch (ErrnoException ignored) {
                // assume we'll fail with a more contextual error later
            }
        }

        mCookie = openDexFile(sourceName, outputName, flags, loader, elements);
        mInternalCookie = mCookie;
        mFileName = sourceName;
        //System.out.println("DEX FILE cookie is " + mCookie + " sourceName=" + sourceName + " outputName=" + outputName);
    }

    /**
     * Open a DEX file, specifying the file in which the optimized DEX
     * data should be written.  If the optimized form exists and appears
     * to be current, it will be used; if not, the VM will attempt to
     * regenerate it.
     *
     * @deprecated Applications should use one of the standard classloaders such
     *     as {@link dalvik.system.PathClassLoader} instead. <b>This API will be removed
     *     in a future Android release</b>.
     */
    @Deprecated
    static public DexFile loadDex(String sourcePathName, String outputPathName,
        int flags) throws IOException {

        /*
         * TODO: we may want to cache previously-opened DexFile objects.
         * The cache would be synchronized with close().  This would help
         * us avoid mapping the same DEX more than once when an app
         * decided to open it multiple times.  In practice this may not
         * be a real issue.
         */
        return loadDex(sourcePathName, outputPathName, flags, null, null);
    }

    /*
     * Private version of loadDex that also takes a class loader.
     *
     * @param sourcePathName
     *  Jar or APK file with "classes.dex".  (May expand this to include
     *  "raw DEX" in the future.)
     * @param outputPathName
     *  File that will hold the optimized form of the DEX data.
     * @param flags
     *  Enable optional features.  (Currently none defined.)
     * @param loader
     *  Class loader that is aloading the DEX file.
     * @param elements
     *  The temporary dex path list elements from DexPathList.makeElements
     * @return
     *  A new or previously-opened DexFile.
     * @throws IOException
     *  If unable to open the source or output file.
     */
    @UnsupportedAppUsage
    static DexFile loadDex(String sourcePathName, String outputPathName,
        int flags, ClassLoader loader, DexPathList.Element[] elements) throws IOException {

        /*
         * TODO: we may want to cache previously-opened DexFile objects.
         * The cache would be synchronized with close().  This would help
         * us avoid mapping the same DEX more than once when an app
         * decided to open it multiple times.  In practice this may not
         * be a real issue.
         */
        return new DexFile(sourcePathName, outputPathName, flags, loader, elements);
    }

    /**
     * Gets the name of the (already opened) DEX file.
     *
     * @return the file name
     */
    public String getName() {
        return mFileName;
    }

    @Override public String toString() {
        if (mFileName != null) {
            return getName();
        } else {
            return "InMemoryDexFile[cookie=" + Arrays.toString((long[]) mCookie) + "]";
        }
    }

    /**
     * Closes the DEX file.
     * <p>
     * This may not be able to release all of the resources. If classes from this DEX file are
     * still resident, the DEX file can't be unmapped. In the case where we do not release all
     * the resources, close is called again in the finalizer.
     *
     * @throws IOException
     *             if an I/O error occurs during closing the file, which
     *             normally should not happen
     */
    public void close() throws IOException {
        if (mInternalCookie != null) {
            if (closeDexFile(mInternalCookie)) {
                mInternalCookie = null;
            }
            mCookie = null;
        }
    }

    /**
     * Loads a class. Returns the class on success, or a {@code null} reference
     * on failure.
     * <p>
     * If you are not calling this from a class loader, this is most likely not
     * going to do what you want. Use {@link Class#forName(String)} instead.
     * <p>
     * The method does not throw {@link ClassNotFoundException} if the class
     * isn't found because it isn't reasonable to throw exceptions wildly every
     * time a class is not found in the first DEX file we look at.
     *
     * @param name
     *            the class name, which should look like "java/lang/String"
     *
     * @param loader
     *            the class loader that tries to load the class (in most cases
     *            the caller of the method
     *
     * @return the {@link Class} object representing the class, or {@code null}
     *         if the class cannot be loaded
     */
    public Class loadClass(String name, ClassLoader loader) {
        String slashName = name.replace('.', '/');
        return loadClassBinaryName(slashName, loader, null);
    }

    /**
     * See {@link #loadClass(String, ClassLoader)}.
     *
     * This takes a "binary" class name to better match ClassLoader semantics.
     *
     * @hide
     */
    @UnsupportedAppUsage
    public Class loadClassBinaryName(String name, ClassLoader loader, List<Throwable> suppressed) {
        return defineClass(name, loader, mCookie, this, suppressed);
    }

    private static Class defineClass(String name, ClassLoader loader, Object cookie,
                                     DexFile dexFile, List<Throwable> suppressed) {
        Class result = null;
        try {
            result = defineClassNative(name, loader, cookie, dexFile);
        } catch (NoClassDefFoundError e) {
            if (suppressed != null) {
                suppressed.add(e);
            }
        } catch (ClassNotFoundException e) {
            if (suppressed != null) {
                suppressed.add(e);
            }
        }
        return result;
    }

    /**
     * Enumerate the names of the classes in this DEX file.
     *
     * @return an enumeration of names of classes contained in the DEX file, in
     *         the usual internal form (like "java/lang/String").
     */
    public Enumeration<String> entries() {
        return new DFEnum(this);
    }

    /*
     * Helper class.
     */
    private static class DFEnum implements Enumeration<String> {
        private int mIndex;
        @UnsupportedAppUsage
        private String[] mNameList;

        DFEnum(DexFile df) {
            mIndex = 0;
            mNameList = getClassNameList(df.mCookie);
        }

        public boolean hasMoreElements() {
            return (mIndex < mNameList.length);
        }

        public String nextElement() {
            return mNameList[mIndex++];
        }
    }

    /**
     * Called when the class is finalized. Makes sure the DEX file is closed.
     *
     * @throws IOException
     *             if an I/O error occurs during closing the file, which
     *             normally should not happen
     */
    @Override protected void finalize() throws Throwable {
        try {
            if (mInternalCookie != null && !closeDexFile(mInternalCookie)) {
                throw new AssertionError("Failed to close dex file in finalizer.");
            }
            mInternalCookie = null;
            mCookie = null;
        } finally {
            super.finalize();
        }
    }


    /*
     * Open a DEX file.  The value returned is a magic VM cookie.  On
     * failure, an IOException is thrown.
     */
    @UnsupportedAppUsage
    private static Object openDexFile(String sourceName, String outputName, int flags,
            ClassLoader loader, DexPathList.Element[] elements) throws IOException {
        // Use absolute paths to enable the use of relative paths when testing on host.
        return openDexFileNative(new File(sourceName).getAbsolutePath(),
                                 (outputName == null)
                                     ? null
                                     : new File(outputName).getAbsolutePath(),
                                 flags,
                                 loader,
                                 elements);
    }

    private static Object openInMemoryDexFiles(ByteBuffer[] bufs, ClassLoader loader,
            DexPathList.Element[] elements) throws IOException {
        // Preprocess the ByteBuffers for openInMemoryDexFilesNative. We extract
        // the backing array (non-direct buffers only) and start/end positions
        // so that the native method does not have to call Java methods anymore.
        byte[][] arrays = new byte[bufs.length][];
        int[] starts = new int[bufs.length];
        int[] ends = new int[bufs.length];
        for (int i = 0; i < bufs.length; ++i) {
            arrays[i] = bufs[i].isDirect() ? null : bufs[i].array();
            starts[i] = bufs[i].position();
            ends[i] = bufs[i].limit();
        }
        return openInMemoryDexFilesNative(bufs, arrays, starts, ends, loader, elements);
    }

    private static native Object openInMemoryDexFilesNative(ByteBuffer[] bufs, byte[][] arrays,
            int[] starts, int[] ends, ClassLoader loader, DexPathList.Element[] elements);

    /*
     * Initiates background verification of this DexFile. This is a sepearate down-call
     * from openDexFile and openInMemoryDexFiles because it requires the class loader's
     * DexPathList to have been initialized for its classes to be resolvable by ART.
     * DexPathList will open the dex files first, finalize `dexElements` and then call this.
     */
    /*package*/ void verifyInBackground(ClassLoader classLoader, String classLoaderContext) {
        verifyInBackgroundNative(mCookie, classLoader, classLoaderContext);
    }

    private static native void verifyInBackgroundNative(Object mCookie, ClassLoader classLoader,
            String classLoaderContext);

    /*package*/ static native String getClassLoaderContext(ClassLoader classLoader,
            DexPathList.Element[] elements);

    /*
     * Returns true if the dex file is backed by a valid oat file.
     */
    @UnsupportedAppUsage
    /*package*/ boolean isBackedByOatFile() {
        return isBackedByOatFile(mCookie);
    }

    /*
     * Set the dex file as trusted: it can access hidden APIs of the platform.
     */
    /*package*/ void setTrusted() {
        setTrusted(mCookie);
    }

    /*
     * Returns true if we managed to close the dex file.
     */
    private static native boolean closeDexFile(Object cookie);
    private static native Class defineClassNative(String name, ClassLoader loader, Object cookie,
                                                  DexFile dexFile)
            throws ClassNotFoundException, NoClassDefFoundError;
    @UnsupportedAppUsage
    private static native String[] getClassNameList(Object cookie);
    private static native boolean isBackedByOatFile(Object cookie);
    private static native void setTrusted(Object cookie);
    /*
     * Open a DEX file.  The value returned is a magic VM cookie.  On
     * failure, an IOException is thrown.
     */
    @UnsupportedAppUsage
    private static native Object openDexFileNative(String sourceName, String outputName, int flags,
            ClassLoader loader, DexPathList.Element[] elements);

    /**
     * Returns true if the VM believes that the apk/jar file is out of date
     * and should be passed through "dexopt" again.
     *
     * @param fileName the absolute path to the apk/jar file to examine.
     * @return true if dexopt should be called on the file, false otherwise.
     * @throws java.io.FileNotFoundException if fileName is not readable,
     *         not a file, or not present.
     * @throws java.io.IOException if fileName is not a valid apk/jar file or
     *         if problems occur while parsing it.
     * @throws java.lang.NullPointerException if fileName is null.
     */
    public static native boolean isDexOptNeeded(String fileName)
            throws FileNotFoundException, IOException;

    /**
     * No dexopt should (or can) be done to update the apk/jar.
     *
     * See {@link #getDexOptNeeded(String, String, String, boolean, boolean)}.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    public static final int NO_DEXOPT_NEEDED = 0;

    /**
     * dex2oat should be run to update the apk/jar from scratch.
     *
     * See {@link #getDexOptNeeded(String, String, String, boolean, boolean)}.
     *
     * @hide
     */
    public static final int DEX2OAT_FROM_SCRATCH = 1;

    /**
     * dex2oat should be run to update the apk/jar because the existing code
     * is out of date with respect to the boot image.
     *
     * See {@link #getDexOptNeeded(String, String, String, boolean, boolean)}.
     *
     * @hide
     */
    public static final int DEX2OAT_FOR_BOOT_IMAGE = 2;

    /**
     * dex2oat should be run to update the apk/jar because the existing code
     * is out of date with respect to the target compiler filter.
     *
     * See {@link #getDexOptNeeded(String, String, String, boolean, boolean)}.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    public static final int DEX2OAT_FOR_FILTER = 3;


    /**
     * Calls {@link #getDexOptNeeded(String, String, String, String, String, boolean, boolean)}
     * with a null class loader context.
     *
     * TODO(ngeoffray, calin): deprecate / remove.
     * @hide
     */
    public static int getDexOptNeeded(String fileName,
        String instructionSet, String compilerFilter, boolean newProfile, boolean downgrade)
        throws FileNotFoundException, IOException {
            return getDexOptNeeded(
                fileName, instructionSet, compilerFilter, null, newProfile, downgrade);
    }

    /**
     * Returns the VM's opinion of what kind of dexopt is needed to make the
     * apk/jar file up to date, where {@code targetMode} is used to indicate what
     * type of compilation the caller considers up-to-date, and {@code newProfile}
     * is used to indicate whether profile information has changed recently.
     *
     * @param fileName the absolute path to the apk/jar file to examine.
     * @param compilerFilter a compiler filter to use for what a caller considers up-to-date.
     * @param classLoaderContext a string encoding the class loader context the dex file
     *        is intended to have at runtime.
     * @param newProfile flag that describes whether a profile corresponding
     *        to the dex file has been recently updated and should be considered
     *        in the state of the file.
     * @param downgrade flag that describes if the purpose of dexopt is to downgrade the
     *        compiler filter. If set to false, will be evaluated as an upgrade request.
     * @return NO_DEXOPT_NEEDED, or DEX2OAT_*. See documentation
     *         of the particular status code for more information on its
     *         meaning. Returns a positive status code if the status refers to
     *         the oat file in the oat location. Returns a negative status
     *         code if the status refers to the oat file in the odex location.
     * @throws java.io.FileNotFoundException if fileName is not readable,
     *         not a file, or not present.
     * @throws java.io.IOException if fileName is not a valid apk/jar file or
     *         if problems occur while parsing it.
     * @throws java.lang.NullPointerException if fileName is null.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    public static native int getDexOptNeeded(String fileName,
            String instructionSet, String compilerFilter, String classLoaderContext,
            boolean newProfile, boolean downgrade)
            throws FileNotFoundException, IOException;

    /**
     * Returns the status of the dex file {@code fileName}. The returned string is
     * an opaque, human readable representation of the current status. The output
     * is only meant for debugging and is not guaranteed to be stable across
     * releases and/or devices.
     *
     * @hide
     */
    public static native String getDexFileStatus(String fileName, String instructionSet)
        throws FileNotFoundException;

    /**
     * Encapsulates information about the optimizations performed on a dex file.
     *
     * Note that the info is only meant for debugging and is not guaranteed to be
     * stable across releases and/or devices.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    public static final class OptimizationInfo {
        // The optimization status.
        private final String status;
        // The optimization reason. The reason might be "unknown" if the
        // the compiler artifacts were not annotated during optimizations.
        private final String reason;

        private OptimizationInfo(String status, String reason) {
            this.status = status;
            this.reason = reason;
        }

        @libcore.api.CorePlatformApi
        public String getStatus() {
            return status;
        }

        @libcore.api.CorePlatformApi
        public String getReason() {
            return reason;
        }
    }

    /**
     * Retrieves the optimization info for a dex file.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    public static OptimizationInfo getDexFileOptimizationInfo(
            String fileName, String instructionSet) throws FileNotFoundException {
        String[] status = getDexFileOptimizationStatus(fileName, instructionSet);
        return new OptimizationInfo(status[0], status[1]);
    }

    /**
     * Returns the optimization status of the dex file {@code fileName}. The returned
     * array will have 2 elements which specify:
     *   - index 0: the level of optimizations
     *   - index 1: the optimization reason. The reason might be "unknown" if the
     *              the compiler artifacts were not annotated during optimizations.
     *
     * The output is only meant for debugging and is not guaranteed to be stable across
     * releases and/or devices.
     *
     * @hide
     */
    private static native String[] getDexFileOptimizationStatus(
            String fileName, String instructionSet) throws FileNotFoundException;

    /**
     * Returns the paths of the optimized files generated for {@code fileName}.
     * If no optimized code exists the method returns null.
     * @hide
     */
    @libcore.api.CorePlatformApi
    public static native String[] getDexFileOutputPaths(String fileName, String instructionSet)
        throws FileNotFoundException;

    /**
     * Returns whether the given filter is a valid filter.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    public native static boolean isValidCompilerFilter(String filter);

    /**
     * Returns whether the given filter is based on profiles.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    public native static boolean isProfileGuidedCompilerFilter(String filter);

    /**
     * Returns the version of the compiler filter that is not based on profiles.
     * If the input is not a valid filter, or the filter is already not based on
     * profiles, this returns the input.
     *
     * @hide
     */
    public native static String getNonProfileGuidedCompilerFilter(String filter);

    /**
     * Returns the version of the compiler filter that is suitable for safe mode.
     * If the input is not a valid filter, or the filter is already suitable for
     * safe mode, this returns the input.
     *
     * @hide
     */
    @libcore.api.CorePlatformApi
    public native static String getSafeModeCompilerFilter(String filter);

    /**
     * Returns the static file size of the original dex file.
     * The original size of the uncompressed dex file is returned.
     * On device the dex file may be compressed or embedded in some other
     * file (e.g. oat) in a platform implementation dependent manner. This
     * method abstracts away from those details and provides an efficient
     * implementation given that the dex file in question has already been
     * uncompressed, extracted, and/or loaded by the runtime as appropriate.
     * <p>
     * In the case of multidex, returns the sum of the original uncompressed
     * multidex entry file sizes.
     *
     * @hide
     */
    public long getStaticSizeOfDexFile() {
      return getStaticSizeOfDexFile(mCookie);
    }

    private static native long getStaticSizeOfDexFile(Object cookie);
}
