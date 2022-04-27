/*
 * Copyright (C) 2012 RoboVM AB
 * Copyright (C) 2018 Daniel Thommes, NeverNull GmbH, <daniel.thommes@nevernull.io>
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
package org.robovm.compiler;

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.robovm.compiler.clazz.*;
import org.robovm.compiler.config.*;
import org.robovm.compiler.config.Config.TreeShakerMode;
import org.robovm.compiler.config.StripArchivesConfig.StripArchivesBuilder;
import org.robovm.compiler.log.ConsoleLogger;
import org.robovm.compiler.plugin.LaunchPlugin;
import org.robovm.compiler.plugin.Plugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.TargetPlugin;
import org.robovm.compiler.target.ConsoleTarget;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.ios.*;
import org.robovm.compiler.util.AntPathMatcher;
import org.simpleframework.xml.Serializer;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @version $Id$
 */
public class AppCompiler {

    /**
     * Name of the file that contains the dependencies between classpath and Main binary
     */
    public static final String CLASSPATHS_FILENAME = "classpath_dependencies.txt";

    /**
     * Names of root classes. These classes will always be linked in. These are
     * here because they are either required by the RoboVM specific native VM
     * libraries or by the Android's libcore native code.
     */
    private static final String[] ROOT_CLASSES = {
        "java/io/FileDescriptor",
        "java/io/PrintWriter",
        "java/io/Serializable",
        "java/io/StringWriter",
        "java/lang/AbstractMethodError",
        "java/lang/annotation/Annotation",
        "java/lang/annotation/AnnotationFormatError",
        "java/lang/ArithmeticException",
        "java/lang/ArrayIndexOutOfBoundsException",
        "java/lang/ArrayStoreException",
        "java/lang/Boolean",
        "java/lang/Byte",
        "java/lang/Character",
        "java/lang/Class",
        "java/lang/ClassCastException",
        "java/lang/ClassLoader",
        "java/lang/ClassLoader$SystemClassLoader",
        "java/lang/ClassNotFoundException",
        "java/lang/Cloneable",
        "java/lang/Daemons",
        "java/lang/Double",
        "java/lang/Enum",
        "java/lang/Error",
        "java/lang/ExceptionInInitializerError",
        "java/lang/Float",
        "java/lang/IllegalAccessError",
        "java/lang/IllegalArgumentException",
        "java/lang/IllegalMonitorStateException",
        "java/lang/IllegalStateException",
        "java/lang/IncompatibleClassChangeError",
        "java/lang/IndexOutOfBoundsException",
        "java/lang/InstantiationError",
        "java/lang/InstantiationException",
        "java/lang/Integer",
        "java/lang/InternalError",
        "java/lang/InterruptedException",
        "java/lang/LinkageError",
        "java/lang/Long",
        "java/lang/NegativeArraySizeException",
        "java/lang/NoClassDefFoundError",
        "java/lang/NoSuchFieldError",
        "java/lang/NoSuchMethodError",
        "java/lang/NullPointerException",
        "java/lang/Object",
        "java/lang/OutOfMemoryError",
        "java/lang/ref/FinalizerReference",
        "java/lang/ref/PhantomReference",
        "java/lang/ref/Reference",
        "java/lang/ref/ReferenceQueue",
        "java/lang/ref/SoftReference",
        "java/lang/ref/WeakReference",
        "java/lang/reflect/AccessibleObject",
        "java/lang/reflect/Constructor",
        "java/lang/reflect/Field",
        "java/lang/reflect/InvocationHandler",
        "java/lang/reflect/InvocationTargetException",
        "java/lang/reflect/Method",
        "java/lang/reflect/Proxy",
        "java/lang/reflect/UndeclaredThrowableException",
        "java/lang/Runtime",
        "java/lang/RuntimeException",
        "java/lang/Short",
        "java/lang/StackOverflowError",
        "java/lang/StackTraceElement",
        "java/lang/String",
        "java/lang/System",
        "java/lang/Thread",
        "java/lang/Thread$UncaughtExceptionHandler",
        "java/lang/ThreadGroup",
        "java/lang/Throwable",
        "java/lang/TypeNotPresentException",
        "java/lang/UnsatisfiedLinkError",
        "java/lang/UnsupportedOperationException",
        "java/lang/VerifyError",
        "java/lang/VMClassLoader",
        "java/math/BigDecimal",
        "java/net/Inet6Address",
        "java/net/Inet6Address$Inet6AddressHolder",
        "java/net/InetAddress",
        "java/net/InetAddress$InetAddressHolder",
        "java/net/InetSocketAddress",
        "java/net/Socket",
        "java/net/InetSocketAddress$InetSocketAddressHolder",
        "java/net/SocketImpl",
        "java/nio/charset/CharsetICU",
        "java/nio/DirectByteBuffer",
        "java/text/ParsePosition",
        "java/util/Calendar",
        "java/util/regex/PatternSyntaxException",
        "java/util/zip/Deflater",
        "java/util/zip/Inflater",
        "libcore/icu/LocaleData",
        "java/nio/NIOAccess",
        "java/nio/Buffer",
        "android/system/ErrnoException",
        "android/system/GaiException",
        "android/system/NetlinkSocketAddress",
        "android/system/PacketSocketAddress",
        "android/system/StructAddrinfo",
        "android/system/StructFlock",
        "android/system/StructGroupReq",
        "android/system/StructIfaddrs",
        "android/system/StructLinger",
        "android/system/StructPasswd",
        "android/system/StructPollfd",
        "android/system/StructStat",
        "android/system/StructStatVfs",
        "android/system/StructTimeval",
        "android/system/StructTimespec",
        "android/system/StructUcred",
        "android/system/StructUtsname",
        "android/system/UnixSocketAddress",
        "dalvik/system/SocketTagger",
        "org/apache/harmony/xml/ExpatParser",
        "java/util/zip/ZipFile",
        "java/util/zip/CRC32",
        "java/util/zip/Adler32",
        "sun/nio/ch/DatagramChannelImpl",
        "sun/nio/ch/DatagramDispatcher",
        "java/io/Console",
        "sun/nio/ch/IOUtil",
        "sun/nio/ch/SocketChannelImpl",
        "sun/nio/ch/FileChannelImpl",
        "sun/nio/ch/FileDispatcherImpl",
        "java/io/FileOutputStream",
        "java/io/FileInputStream",
        "java/util/prefs/FileSystemPreferences",
        "sun/nio/ch/NativeThread",
        "sun/nio/ch/FileKey",
        "java/io/UnixFileSystem",
        "java/io/ObjectStreamClass",
        "java/io/ObjectOutputStream",
        "java/io/ObjectInputStream",
        "sun/nio/ch/Net",
        "java/nio/MappedByteBuffer",
        "java/net/Inet4Address",
        "sun/nio/ch/ServerSocketChannelImpl",
        "java/net/SocketInputStream",
        "java/net/SocketOutputStream",
        "java/lang/StrictMath",
        "java/lang/Math",
        "java/lang/ProcessEnvironment",
        "org/robovm/rt/bro/Struct"
    };

    private static final String TRUSTED_CERTIFICATE_STORE_CLASS =
            "com/android/org/conscrypt/TrustedCertificateStore";

    /**
     * An {@link Executor} which runs tasks immediately without creating a
     * separate thread.
     */
    static final Executor SAME_THREAD_EXECUTOR = new Executor() {
        public void execute(Runnable r) {
            r.run();
        }
    };

    private final Config config;
    private final ClassCompiler classCompiler;
    private final Linker linker;

    public AppCompiler(Config config) {
        this.config = config;
        this.classCompiler = new ClassCompiler(config);
        this.linker = new Linker(config);
    }

    public Config getConfig() {
        return config;
    }

    /**
     * Returns all {@link Clazz}es in all {@link Path}s matching the specified
     * ANT-style pattern.
     */
    private Collection<Clazz> getMatchingClasses(String pattern) {
        AntPathMatcher matcher = new AntPathMatcher(pattern, ".");
        Map<String, Clazz> matches = new HashMap<String, Clazz>();
        for (Path path : config.getClazzes().getPaths()) {
            for (Clazz clazz : path.listClasses()) {
                if (!matches.containsKey(clazz.getClassName())
                        && matcher.matches(clazz.getClassName())) {

                    matches.put(clazz.getClassName(), clazz);
                }
            }
        }
        return matches.values();
    }


    /**
     * returns list of methods that has to be forced linked in case of aggressive tree shaker
     */
    private Collection<MethodInfo> getMatchingForceLinkMethods(Clazz clazz) {
        List<ForceLinkMethodsConfig> forceLinkMethods = config.getForceLinkMethods();
        ClazzInfo ci = clazz.getClazzInfo();
        if (config.getTreeShakerMode() == TreeShakerMode.aggressive && !ci.getMethods().isEmpty() && !forceLinkMethods.isEmpty()) {

            // prepare list of signatures for all matched entrues
            Set<String> signatures = new HashSet<>();
            for (ForceLinkMethodsConfig entry : forceLinkMethods) {
                if (entry.matchesClass(ci))
                    signatures.addAll(entry.getMethods());
            }

            // class matches one or more patterns check for method signatures
            if (!signatures.isEmpty()) {
                Set<MethodInfo> matches = new HashSet<>();
                for (MethodInfo mi : ci.getMethods()) {
                    if (signatures.contains(mi.getName() + mi.getDesc()))
                        matches.add(mi);
                }

                if (!matches.isEmpty())
                    return matches;
            }
        }

        // no methods has to be forced linked
        return Collections.emptyList();
    }

    /**
     * Returns all root classes. These are the minimum set of classes that needs
     * to be compiled and linked. The compiler will use this set to determine
     * which classes need to be recompiled and linked in through the root
     * classes' dependencies.
     * 
     * The classes matching {@link #ROOT_CLASS_PATTERNS} and
     * {@link #ROOT_CLASSES} will always be included. If a main class has been
     * specified it will also become a root. Any root class pattern specified on
     * the command line (as returned by {@link Config#getRoots()} will also be
     * used to find root classes. If no main class has been specified and
     * {@link Config#getRoots()} returns an empty set all classes available on
     * the bootclasspath and the classpath will become roots.
     */
    private TreeSet<Clazz> getRootClasses() {
        TreeSet<Clazz> classes = new TreeSet<Clazz>();
        for (String rootClassName : ROOT_CLASSES) {
            Clazz clazz = config.getClazzes().load(rootClassName);
            if (clazz == null) {
                throw new CompilerException("Root class " + rootClassName + " not found");
            }
            classes.add(clazz);
        }

        if (config.getMainClass() != null) {
            Clazz clazz = config.getClazzes().load(config.getMainClass().replace('.', '/'));
            if (clazz == null) {
                throw new CompilerException("Main class " + config.getMainClass() + " not found");
            }
            classes.add(clazz);
        }

        if (config.getForceLinkClasses().isEmpty()) {
            if (config.getMainClass() == null) {
                classes.addAll(config.getClazzes().listClasses());
            }
        } else {
            for (String pattern : config.getForceLinkClasses()) {
                if (pattern == null || pattern.trim().isEmpty()) {
                    continue;
                }
                pattern = pattern.trim();
                if (pattern.indexOf('*') == -1) {
                    Clazz clazz = config.getClazzes().load(pattern.replace('.', '/'));
                    if (clazz == null) {
                        throw new CompilerException("Root class " + pattern + " not found");
                    }
                    classes.add(clazz);
                } else {
                    Collection<Clazz> matches = getMatchingClasses(pattern);
                    if (matches.isEmpty()) {
                        config.getLogger().warn("Root pattern %s matches no classes", pattern);
                    } else {
                        classes.addAll(matches);
                    }
                }
            }
        }
        return classes;
    }

    private boolean compile(Executor executor, ClassCompilerListener listener,
            Clazz clazz, Set<Clazz> compileQueue, Set<Clazz> compiled) throws IOException {

        boolean result = false;
        if (config.isClean() || classCompiler.mustCompile(clazz)) {
            classCompiler.compile(clazz, executor, listener);
            result = true;
        }
        return result;
    }

    static void addMetaInfImplementations(Clazzes clazzes, Clazz clazz, Set<Clazz> compiled, Set<Clazz> compileQueue)
            throws IOException {
        String metaInfName = "META-INF/services/" + clazz.getClassName();
        IOException throwLater = null;
        for (InputStream is : clazzes.loadResources(metaInfName)) {
            try (BufferedReader r = new BufferedReader(new InputStreamReader(is, "UTF8"))) {
                for (;;) {
                    String line = r.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.startsWith("#")) {
                        continue;
                    }
                    String implClazzName = line.replace('.', '/');
                    Clazz implClazz = clazzes.load(implClazzName);
                    if (implClazz != null && !compiled.contains(implClazz)) {
                        compileQueue.add(implClazz);
                    }
                }
            } catch (IOException ex) {
                throwLater = ex;
            }
        }
        if (throwLater != null) {
            throw throwLater;
        }
    }

    public Set<Clazz> compile(Set<Clazz> rootClasses, boolean compileDependencies,
            final ClassCompilerListener listener) throws IOException {

        config.getLogger().info("Compiling classes using %d threads", config.getThreads());

        final Executor executor = (config.getThreads() <= 1)
                ? SAME_THREAD_EXECUTOR
                : new ThreadPoolExecutor(config.getThreads() - 1, config.getThreads() - 1,
                        0L, TimeUnit.MILLISECONDS,
                        // Use a bounded queue to avoid memory problems if the
                        // worker threads are slower than the enqueuing thread.
                        // The optimal thread pool size and queue size have been
                        // determined by trial and error.
                        new ArrayBlockingQueue<Runnable>((config.getThreads() - 1) * 20));
        class HandleFailureListener implements ClassCompilerListener {
            volatile Throwable t;

            @Override
            public void success(Clazz clazz) {
                if (listener != null) {
                    listener.success(clazz);
                }
            }

            @Override
            public void failure(Clazz clazz, Throwable t) {
                // Compilation failed. Save the error and stop the executor.
                this.t = t;
                if (executor instanceof ExecutorService) {
                    ((ExecutorService) executor).shutdown();
                }
                if (listener != null) {
                    listener.failure(clazz, t);
                }
            }
        };
        HandleFailureListener listenerWrapper = new HandleFailureListener();

        DependencyGraph dependencyGraph = config.getDependencyGraph();

        TreeSet<Clazz> compileQueue = new TreeSet<>(rootClasses);
        long start = System.currentTimeMillis();
        Set<Clazz> linkClasses = new HashSet<Clazz>();
        int compiledCount = 0;
        outer: while (!compileQueue.isEmpty() && !Thread.currentThread().isInterrupted()) {
            while (!compileQueue.isEmpty() ) {
                if (Thread.currentThread().isInterrupted()) {
                    break outer;
                }
                Clazz clazz = compileQueue.pollFirst();
                if (!linkClasses.contains(clazz)) {
                    if (compile(executor, listenerWrapper, clazz, compileQueue, linkClasses)) {
                        compiledCount++;
                        if (listenerWrapper.t != null) {
                            // We have a failed compilation. Stop compiling.
                            break outer;
                        }
                    }

                    Collection<MethodInfo> forceLinkMethods = getMatchingForceLinkMethods(clazz);
                    dependencyGraph.add(clazz, rootClasses.contains(clazz), forceLinkMethods);
                    linkClasses.add(clazz);

                    if (compileDependencies) {
                        addMetaInfImplementations(config.getClazzes(), clazz, linkClasses, compileQueue);
                    }
                }
            }

            if (compileDependencies) {
                for (String className : dependencyGraph.findReachableClasses()) {
                    Clazz depClazz = config.getClazzes().load(className);
                    if (depClazz != null && !linkClasses.contains(depClazz)) {
                        compileQueue.add(depClazz);
                    }
                }
            }
        }

        // Shutdown the executor and wait for running tasks to complete.
        if (executor instanceof ExecutorService) {
            // save interrupted status (also Thread.interrupted() clears it)
            // as if it stays set executorService.awaitTermination will exit with
            // InterruptedException and clear interrupted state
            boolean wasInterrupted = Thread.interrupted();
            ExecutorService executorService = (ExecutorService) executor;
            executorService.shutdown();
            try {
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
            } catch (InterruptedException ignored) {
            }
            if (wasInterrupted)
                Thread.currentThread().interrupt();
        }

        if (listenerWrapper.t != null) {
            // The compilation failed. Rethrow the exception in the callback.
            if (listenerWrapper.t instanceof IOException) {
                throw (IOException) listenerWrapper.t;
            }
            if (listenerWrapper.t instanceof RuntimeException) {
                throw (RuntimeException) listenerWrapper.t;
            }
            if (listenerWrapper.t instanceof Error) {
                throw (Error) listenerWrapper.t;
            }
            throw new CompilerException(listenerWrapper.t);
        }

        if (!Thread.currentThread().isInterrupted()) {
            long duration = System.currentTimeMillis() - start;
            config.getLogger().info("Compiled %d classes in %.2f seconds", compiledCount, duration / 1000.0);
        }

        return linkClasses;
    }

    private void compile() throws IOException {
        updateCheck();

        //Let's look, if we really need to recompile
        if (needsRecompilation(config)) {

            Set<Clazz> linkClasses = compile(getRootClasses(), true, null);

            if (Thread.currentThread().isInterrupted()) {
                return;
            }

            if (linkClasses.contains(config.getClazzes().load(TRUSTED_CERTIFICATE_STORE_CLASS))) {
                if (config.getCacerts() != null) {
                    config.addResourcesPath(config.getClazzes().createResourcesBootclasspathPath(
                            config.getHome().getCacertsPath(config.getCacerts())));
                }
            }

            long start = System.currentTimeMillis();
            linker.link(linkClasses);
            long duration = System.currentTimeMillis() - start;
            config.getLogger().info("Linked %d classes in %.2f seconds", linkClasses.size(), duration / 1000.0);

            storeRecompileInfo(config, linkClasses);

        } else {
            config.getLogger().info("No classes were modified. Skipping compilation and linking.");
        }
    }

    /**
     * Write the classpaths file that contains a list of class and jar files that were input for the Main binary
     *
     * @param classPathsFile
     * @param linkClasses
     * @throws IOException
     */
    private void storeRecompileInfo(Config config, Set<Clazz> linkClasses) throws IOException {
        File classPathsFile = new File(config.getTmpDir(), CLASSPATHS_FILENAME);
        Set<String> paths = new HashSet<>();
        for (Clazz clazz : linkClasses) {
            Path path = clazz.getPath();
            if (path instanceof ZipFilePath) {
                // comes from a jar - let's consider the jar only.
                paths.add(path.toString());
            } else {
                //is a single class file either in the output dir or in robovm's cache, need to access the real file
                paths.add(((DirectoryPath.DirectoryPathClazz) clazz).getClassFile().getAbsolutePath());
            }
        }

        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(classPathsFile), StandardCharsets.UTF_8)) {
            for (String path : paths) {
                writer.write(path);
                writer.write("\n");
            }
        }

        // Persisting the config for later comparison
        File configFile = new File(config.getTmpDir(), "config.xml");
        try (FileOutputStream output = new FileOutputStream(configFile)) {
            try {
                IOUtils.write(configToXml(config), output, StandardCharsets.UTF_8.toString());
            } catch (Exception e) {
                config.getLogger().error("Error when computing config's equality. " +
                        "Forcing recompilation: %s:%s", e.getClass().getSimpleName(), e.getMessage());
            }
        }

    }

    /**
     * Checks, whether recompilation of the Main binary is necessary by looking at the classPathsFile
     *
     * @param classPathsFile
     * @return
     * @throws IOException
     */
    private boolean needsRecompilation(Config config) throws IOException {
        if (!config.isSmartSkipRebuild()) {
            return true;
        }

        //User can force clean via command line
        if (config.isClean()) {
            config.getLogger().info("Config requires clean, rebuilding.");
            return true;
        }

        //Check for newer input files compared to Main binary
        File classPathsFile = new File(config.getTmpDir(), CLASSPATHS_FILENAME);
        File binaryFile = new File(config.getTmpDir(), config.getExecutableName());

        if (!classPathsFile.exists()) {
            config.getLogger().info("Dependency info was not found, compilation is required.");
            return true;
        }
        if(!binaryFile.exists()){
            config.getLogger().info("Main binary was not found, compilation is required.");
            return true;
        }

        //Compare the modification dates of all classes / jars that were linked during the last run with the binary
        long binaryFileModified = binaryFile.lastModified();
        try (BufferedReader b = new BufferedReader(new FileReader(classPathsFile))) {
            String readLine = "";
            while ((readLine = b.readLine()) != null) {
                File classPathFile = new File(readLine);
                // class was removed or is newer?
                if (!classPathFile.exists() || classPathFile.lastModified() > binaryFileModified) {
                    config.getLogger().info("Found modified file, compilation is required: %s", classPathFile);
                    return true;
                }
            }
        }

        //Has the configuration changed between runs (e.g. forcelink)?
        boolean configsEqual;
        try {
            //If there has been a previous run, we have a corresponding file
            File configFile = new File(config.getTmpDir(), "config.xml");
            if (configFile.exists()) {
                String previousConfig = FileUtils.readFileToString(configFile, StandardCharsets.UTF_8.toString());
                //Writing the configuration as XML with SimpleXML
                configsEqual = configToXml(config).equals(previousConfig);
            } else {
                config.getLogger().info("Could not find a config.xml file, compilation is required.");
                configsEqual = false;
            }
        } catch (Exception e) {
            config.getLogger().error("Error when computing config's equality. " +
                    "Forcing recompilation: %s:%s", e.getClass().getSimpleName(), e.getMessage());
            configsEqual = false;
        }

        if (!configsEqual) {
            config.getLogger().info("Configurations differ, compilation is required.");
        }
        //recompile, if configs are not equal
        return !configsEqual;
    }

    private String configToXml(Config config) throws Exception {
        Serializer serializer = Config.Builder.createSerializer(config, config.getTmpDir());
        StringWriter writer = new StringWriter();
        serializer.write(this.config, writer);
        String xml = writer.toString();
        //In debug mode, there is a random port number used - strip this for comparability
        xml = xml.replaceAll("<argument>debug:jdwpport=\\d*?</argument>", "<argument>debug:jdwpport=REMOVED</argument>");
        //Remove smartSkipRebuild info, as switching smartSkipRebuild on will result in differing configs otherwise
        xml = xml.replaceAll("<smartSkipRebuild>.*?</smartSkipRebuild>", "");
        return xml;
    }

    public static void main(String[] args) throws IOException {

        AppCompiler compiler = null;
        Config.Builder builder = null;

        boolean verbose = false;
        boolean run = false;
        boolean archive = false;
        List<Arch> archs = new ArrayList<>();
        StripArchivesBuilder stripArchivesBuilder = new StripArchivesBuilder();
        String dumpConfigFile = null;
        List<String> runArgs = new ArrayList<String>();
        try {
            builder = new Config.Builder();
            Map<String, PluginArgument> pluginArguments = builder.fetchPluginArguments();

            int i = 0;
            while (i < args.length) {
                if ("-cp".equals(args[i]) || "-classpath".equals(args[i])) {
                    for (String p : args[++i].split(File.pathSeparator)) {
                        builder.addClasspathEntry(new File(p));
                    }
                } else if ("-bcp".equals(args[i]) || "-bootcp".equals(args[i]) || "-bootclasspath".equals(args[i])) {
                    for (String p : args[++i].split(File.pathSeparator)) {
                        builder.addBootClasspathEntry(new File(p));
                    }
                } else if ("-jar".equals(args[i])) {
                    builder.mainJar(new File(args[++i]));
                } else if ("-o".equals(args[i])) {
                    builder.executableName(args[++i]);
                } else if ("-d".equals(args[i])) {
                    builder.installDir(new File(args[++i]));
                } else if ("-cache".equals(args[i])) {
                    builder.cacheDir(new File(args[++i]));
                } else if ("-home".equals(args[i])) {
                    builder.home(new Config.Home(new File(args[++i])));
                } else if ("-tmp".equals(args[i])) {
                    builder.tmpDir(new File(args[++i]));
                } else if ("-threads".equals(args[i])) {
                    String s = args[++i];
                    try {
                        int n = Integer.parseInt(s);
                        // Make sure n > 0 and cap at 128 threads.
                        n = Math.max(n, 1);
                        n = Math.min(n, 128);
                        builder.threads(n);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Unparsable thread count: " + s);
                    }
                } else if ("-run".equals(args[i])) {
                    run = true;
                } else if ("-verbose".equals(args[i])) {
                    verbose = true;
                } else if ("-config".equals(args[i])) {
                    builder.read(new File(args[++i]));
                } else if ("-dumpconfig".equals(args[i])) {
                    dumpConfigFile = args[++i];
                } else if ("-properties".equals(args[i])) {
                    builder.addProperties(new File(args[++i]));
                } else if (args[i].startsWith("-P")) {
                    int index = args[i].indexOf('=');
                    if (index <= 0) {
                        throw new IllegalArgumentException("Malformed property: " + args[i]);
                    }
                    String name = args[i].substring(2, index);
                    String value = args[i].substring(index + 1);
                    builder.addProperty(name, value);
                } else if ("-debug".equals(args[i])) {
                    builder.debug(true);
                } else if ("-use-debug-libs".equals(args[i])) {
                    builder.useDebugLibs(true);
                } else if ("-dump-intermediates".equals(args[i])) {
                    builder.dumpIntermediates(true);
                } else if ("-dynamic-jni".equals(args[i])) {
                    // TODO: Old option not used any longer. We still accept it
                    // for now. Delete it in a future release.
                } else if ("-skiprt".equals(args[i])) {
                    builder.skipRuntimeLib(true);
                } else if ("-skipsign".equals(args[i])) {
                    builder.iosSkipSigning(true);
                } else if ("-clean".equals(args[i])) {
                    builder.clean(true);
                } else if ("-help".equals(args[i]) || "-?".equals(args[i])) {
                    printUsageAndExit(null, builder.getPlugins());
                } else if ("-version".equals(args[i])) {
                    printVersionAndExit();
                } else if ("-cc".equals(args[i])) {
                    builder.ccBinPath(new File(args[++i]));
                } else if ("-os".equals(args[i])) {
                    String s = args[++i];
                    builder.os("auto".equals(s) ? null : OS.valueOf(s));
                } else if ("-arch".equals(args[i])) {
                    String s = args[++i];
                    if (!"auto".equals(s)) {
                        archs.add(Arch.parse(s));
                    }
                } else if ("-archs".equals(args[i])) {
                    for (String s : args[++i].split(":")) {
                        if (!"auto".equals(s)) {
                            archs.add(Arch.parse(s));
                        }
                    }
                } else if ("-target".equals(args[i])) {
                    String s = args[++i];
                    builder.targetType("auto".equals(s) ? null : s);
                } else if ("-treeshaker".equals(args[i])) {
                    String s = args[++i];
                    builder.treeShakerMode(TreeShakerMode.valueOf(s));
                } else if ("-forcelinkclasses".equals(args[i])) {
                    for (String p : args[++i].split(":")) {
                        p = p.replace('#', '*');
                        builder.addForceLinkClass(p);
                    }
                } else if ("-libs".equals(args[i])) {
                    for (String p : args[++i].split(":")) {
                        builder.addLib(new Config.Lib(p, true));
                    }
                } else if ("-exportedsymbols".equals(args[i])) {
                    for (String p : args[++i].split(":")) {
                        builder.addExportedSymbol(p);
                    }
                } else if ("-unhidesymbols".equals(args[i])) {
                    for (String p : args[++i].split(":")) {
                        builder.addUnhideSymbol(p);
                    }
                } else if ("-frameworks".equals(args[i])) {
                    for (String p : args[++i].split(":")) {
                        builder.addFramework(p);
                    }
                } else if ("-weakframeworks".equals(args[i])) {
                    for (String p : args[++i].split(":")) {
                        builder.addWeakFramework(p);
                    }
                } else if ("-resources".equals(args[i])) {
                    for (String p : args[++i].split(":")) {
                        if (AntPathMatcher.isPattern(p)) {
                            File dir = new File(AntPathMatcher.rtrimWildcardTokens(p));
                            String pattern = AntPathMatcher.extractPattern(p);
                            builder.addResource(new Resource(dir, null).include(pattern));
                        } else {
                            builder.addResource(new Resource(new File(p)));
                        }
                    }
                } else if ("-strip-archives-include".equals(args[i])) {
                   stripArchivesBuilder.addInclude(args[++i].split(":"));
                } else if ("-strip-archives-exclude".equals(args[i])) {
               	 stripArchivesBuilder.addExclude(args[++i].split(":"));
                } else if ("-cacerts".equals(args[i])) {
                    String name = args[++i];
                    Config.Cacerts cacerts = null;
                    if (!"none".equals(name)) {
                        try {
                            cacerts = Config.Cacerts.valueOf(name);
                        } catch (IllegalArgumentException e) {
                            throw new IllegalArgumentException("Illegal -cacerts value: " + name);
                        }
                    }
                    builder.cacerts(cacerts);
                } else if ("-plist".equals(args[i])) {
                    builder.infoPList(new File(args[++i]));
                } else if ("-entitlements".equals(args[i])) {
                    builder.iosEntitlementsPList(new File(args[++i]));
                } else if ("-signidentity".equals(args[i])) {
                    builder.iosSignIdentity(SigningIdentity.find(SigningIdentity.list(), args[++i]));
                } else if ("-provisioningprofile".equals(args[i])) {
                    builder.iosProvisioningProfile(ProvisioningProfile.find(ProvisioningProfile.list(), args[++i]));
                } else if ("-sdk".equals(args[i])) {
                    builder.iosSdkVersion(args[++i]);
                } else if ("-printdevicetypes".equals(args[i])) {
                    printDeviceTypesAndExit();
                } else if ("-devicetype".equals(args[i])) {
                    builder.iosDeviceType(args[++i]);
                } else if ("-archive".equals(args[i])) {
                    archive = true;
                } else if ("-createipa".equals(args[i])) {
                    archive = true;
                } else if ("-ipaarchs".equals(args[i])) {
                    for (String s : args[++i].split(":")) {
                        if (!"auto".equals(s)) {
                            archs.add(Arch.parse(s));
                        }
                    }
                } else if (args[i].startsWith("-D")) {
                } else if (args[i].startsWith("-X")) {
                } else if (args[i].startsWith("-rvm:")) {
                    runArgs.add(args[i]);
                } else if (args[i].startsWith("-")) {
                    String argName = args[i].substring(1, args[i].length());
                    if (argName.contains("=")) {
                        argName = argName.substring(0, argName.indexOf('='));
                    }
                    PluginArgument arg = pluginArguments.get(argName);
                    if (arg != null) {
                        builder.addPluginArgument(args[i].substring(1));
                    } else {
                        throw new IllegalArgumentException("Unrecognized option: " + args[i]);
                    }
                } else {
                    builder.mainClass(args[i++]);
                    break;
                }
                i++;
            }

            builder.archs(archs.toArray(new Arch[archs.size()]));
            builder.stripArchivesBuilder(stripArchivesBuilder);

            while (i < args.length) {
                runArgs.add(args[i++]);
            }

            if (archive && run) {
                throw new IllegalArgumentException("Specify either -run or -createipa/-archive, not both");
            }

            builder.logger(new ConsoleLogger(verbose));
            builder.skipInstall(run);

            if (dumpConfigFile != null) {
                if (dumpConfigFile.equals("-")) {
                    builder.write(new OutputStreamWriter(System.out), new File("."));
                } else {
                    File file = new File(dumpConfigFile);
                    if (file.exists()) {
                        throw new IllegalArgumentException("Cannot dump config to " + file.getAbsolutePath()
                                + ". The file already exists.");
                    }
                    builder.write(file);
                }
                return;
            }

            compiler = new AppCompiler(builder.build());

        } catch (Throwable t) {
            String message = t.getMessage();
            if (t instanceof ArrayIndexOutOfBoundsException) {
                message = "Missing argument";
            }
            if (t instanceof IndexOutOfBoundsException) {
                message = "Missing argument";
            }
            if (verbose && !(t instanceof StringIndexOutOfBoundsException) && !(t instanceof IllegalArgumentException)) {
                t.printStackTrace();
            }
            printUsageAndExit(message, builder != null ? builder.getPlugins() : null);
        }

        try {
            if (archive) {
                compiler.build();
                compiler.archive();
            } else {
                if (run && !compiler.config.getTarget().canLaunch()) {
                    throw new IllegalArgumentException("Cannot launch when building " 
                            + compiler.config.getTarget().getType() + " binaries");
                }
                if (run) {
                    compiler.compile(); // Just compile the first slice if multiple archs have been specified
                    LaunchParameters launchParameters = compiler.config.getTarget().createLaunchParameters();
                    if (launchParameters instanceof IOSSimulatorLaunchParameters) {
                        IOSSimulatorLaunchParameters simParams = (IOSSimulatorLaunchParameters) launchParameters;
                        String deviceName = null;
                        String sdkVersion = null;
                        if (compiler.config.getIosDeviceType() != null) {
                            String[] parts = compiler.config.getIosDeviceType().split("[:;, ]+");
                            deviceName = parts[0].trim();
                            sdkVersion = parts.length > 1 ? parts[1].trim() : null;
                        }
                        DeviceType type = DeviceType.getBestDeviceType(
                                compiler.config.getArch(), null, deviceName, sdkVersion);
                        simParams.setDeviceType(type);
                    }
                    launchParameters.setArguments(runArgs);
                    compiler.launch(launchParameters);
                } else {
                    compiler.build();
                    compiler.config.getTarget().install();
                }
            }
        } catch (Throwable t) {
            String message = t.getMessage();
            if (verbose && !(t instanceof ExecuteException)) {
                t.printStackTrace();
            }
            printUsageAndExit(message, builder.getPlugins());
        }
    }

    /**
     * Builds the binary (possibly a fat binary with multiple archs).
     */
    public void build() throws IOException {
        List<Arch> archs = this.config.getArchs();
        if (archs.isEmpty()) {
            archs = config.getTarget().getDefaultArchs();
        }
        if (archs.isEmpty()) {
            throw new IllegalArgumentException("No archs specified in config");
        }
        if (archs.size() == 1 && this.config.getArch().equals(archs.get(0))) {
            // No need to clone configs for each slice.
            compile();
        } else {
            Map<Arch, File> slices = new TreeMap<>();
            for (Arch arch : archs) {
                this.config.getLogger().info("Building %s slice", arch);
                Config sliceConfig = this.config.builder()
                        .arch(arch)
                        .tmpDir(new File(this.config.getTmpDir(), arch.toString()))
                        .build();
                new AppCompiler(sliceConfig).compile();
                slices.put(arch, new File(sliceConfig.getTmpDir(), sliceConfig.getExecutableName()));
                for (Path path : sliceConfig.getResourcesPaths()) {
                    if (!this.config.getResourcesPaths().contains(path)) {
                        this.config.addResourcesPath(path);
                    }
                }
            }
            this.config.getTarget().buildFat(slices);
        }
    }

    /**
     * Archives the binary previously built using {@link #build()} along with
     * all resources specified in the {@link Config} and supporting files and
     * stores the archive in the {@link Config#getInstallDir()}.
     */
    public void archive() throws IOException {
        config.getTarget().archive();
    }

    /**
     * Installs the binary previously built using {@link #build()} along with
     * all resources specified in the {@link Config} and supporting files into
     * the {@link Config#getInstallDir()}.
     */
    public void install() throws IOException {
        config.getTarget().install();
    }

    public int launch(LaunchParameters launchParameters) throws Throwable {
        return launch(launchParameters, null);
    }

    public int launch(LaunchParameters launchParameters, InputStream inputStream) throws Throwable {
        try {
            return launchAsync(launchParameters, inputStream).waitFor();
        } finally {
            launchAsyncCleanup();
        }
    }

    public Process launchAsync(LaunchParameters launchParameters) throws Throwable {
        return launchAsync(launchParameters, null);
    }

    public Process launchAsync(LaunchParameters launchParameters, InputStream inputStream) throws Throwable {
        for (LaunchPlugin plugin : config.getLaunchPlugins()) {
            plugin.beforeLaunch(config, launchParameters);
        }
        try {
            Process process = config.getTarget().launch(launchParameters);
            for (LaunchPlugin plugin : config.getLaunchPlugins()) {
                plugin.afterLaunch(config, launchParameters, process);
            }
            return process;
        } catch (Throwable e) {
            for (LaunchPlugin plugin : config.getLaunchPlugins()) {
                plugin.launchFailed(config, launchParameters);
            }
            throw e;
        }
    }

    public void launchAsyncCleanup() {
        for (LaunchPlugin plugin : config.getLaunchPlugins()) {
            plugin.cleanup();
        }
    }

    private static void printDeviceTypesAndExit() throws IOException {
        List<DeviceType> types = DeviceType.listDeviceTypes();
        for (DeviceType type : types) {
            System.out.println(type.getSimpleDeviceTypeId());
        }
        System.exit(0);
    }

    private static void printVersionAndExit() {
        System.err.println(Version.getCompilerVersion());
        System.exit(0);
    }

    private static void printUsageAndExit(String errorMessage, List<Plugin> plugins) {
        if (errorMessage != null) {
            System.err.format("robovm: %s\n", errorMessage);
        }
        List<String> targets = new ArrayList<>();
        targets.add(ConsoleTarget.TYPE);
        targets.add(IOSTarget.TYPE);
        for (Plugin plugin : plugins) {
            if (plugin instanceof TargetPlugin) {
                targets.add(((TargetPlugin) plugin).getTarget().getType());
            }
        }
        // @formatter:off 
        System.err.println("Usage: robovm [-options] class [run-args]");
        System.err.println("   or  robovm [-options] -jar jarfile [run-args]");
        System.err.println("Options:");
        
        System.err.println("  -bootclasspath <list> ");
        System.err.println("  -bootcp <list>        ");
        System.err.println("  -bcp <list>           : separated list of directories, JAR archives, and ZIP \n" 
                         + "                        archives to search for class files. Used to locate the \n" 
                         + "                        java.* and javax.* classes. Default is \n"
                         + "                        <robovm-home>/lib/robovm-rt.jar.");
        System.err.println("  -cp <list>            ");
        System.err.println("  -classpath <list>     : separated list of directories, JAR archives, and ZIP \n" 
                         + "                        archives to search for class files.");
        System.err.println("  -cache <dir>          Directory where cached compiled class files will be placed.\n" 
                         + "                        Default is ~/.robovm/cache");
        System.err.println("  -clean                Compile class files even if a compiled version already \n" 
                         + "                        exists in the cache.");
        System.err.println("  -d <dir>              Install the generated executable and other files in <dir>.\n" 
                         + "                        Default is <wd>/<executableName>. Ignored if -run is specified.");
        System.err.println("  -dump-intermediates   Dump intermediate files like assembler files and LLVM bitcode\n" 
                         + "                        files to disk under ~/.robovm/cache/ or where the cache is.");
        System.err.println("  -cc <path>            Path to the c compiler binary. gcc and clang are supported.");
        System.err.println("  -home <dir>           Directory where RoboVM runtime has been installed.\n"
                         + "                        Default is $ROBOVM_HOME. If not set the following paths\n" 
                         + "                        will be searched: ~/Applications/robovm/, ~/.robovm/home/,\n" 
                         + "                        /usr/local/lib/robovm/, /opt/robovm/, /usr/lib/robovm/.");
        System.err.println("  -tmp <dir>            Directory where temporary files will be placed during\n"
                         + "                        compilation. By default a new dir will be created under\n" 
                         + "                        ${java.io.tmpdir}.");
        System.err.println("  -jar <path>           Use main class as specified by the manifest in this JAR \n" 
                         + "                        archive.");
        System.err.println("  -o <name>             The name of the target binary");
        System.err.println("  -os <name>            The name of the OS to build for. Allowed values are \n" 
                         + "                        'auto', 'linux', 'macosx' and 'ios'. Default is 'auto' which\n" 
                         + "                        means use the LLVM deafult.");
        System.err.println("  -arch <name>          The name of the LLVM arch to compile for. Allowed values\n" 
                         + "                        are 'auto', 'x86', 'x86_64', 'thumbv7', 'arm64'. Default is\n" 
                         + "                        'auto' which means use the LLVM default.");
        System.err.println("  -archs <list>         : separated list of archs. Used to build a fat binary which\n" 
                         + "                        includes all the specified archs. Allowed values\n" 
                         + "                        are 'x86', 'x86_64', 'thumbv7', 'arm64'.");
        System.err.println("  -env <name>           The name platform environment. Allowed values\n"
                         + "                        are 'Native', 'Simulator'. Default is 'Native'");
        System.err.println("  -target <name>        The target to build for. One of:\n"
                         + "                          'auto', '" + StringUtils.join(targets, "', '") + "'\n" 
                         + "                        The default is 'auto' which means use -os to decide.");
        System.err.println("  -forcelinkclasses <list>\n" 
                         + "                        : separated list of class patterns matching\n" 
                         + "                        classes that must be linked in even if not referenced\n" 
                         + "                        (directly or indirectly) from the main class. If no main\n" 
                         + "                        class is specified all classes will be linked in unless this\n" 
                         + "                        option has been given. A pattern is an ANT style path pattern,\n" 
                         + "                        e.g. com.foo.**.bar.*.Main. An alternative syntax using # is\n" 
                         + "                        also supported, e.g. com.##.#.Main.");
        System.err.println("  -treeshaker <mode>    The tree shaking algorithm to use. 'none', 'conservative' or\n" 
                         + "                        'aggressive'. 'aggressive' will remove all unreachable method\n" 
                         + "                        implementations when it's safe to do so. 'conservative' only\n" 
                         + "                        removes unreachable methods marked as @WeaklyLinked. Methods\n" 
                         + "                        in the main class and in force linked classes will never be\n" 
                         + "                        stripped. Default is 'none'.");
        System.err.println("  -threads <n>          The number of threads to use during class compilation. By\n" 
                         + "                        default the number returned by Runtime.availableProcessors()\n" 
                         + "                        will be used (" + Runtime.getRuntime().availableProcessors() + " on this host).");
        System.err.println("  -run                  Run the executable directly without installing it (-d is\n" 
                         + "                        ignored). The executable will be executed from the\n" 
                         + "                        temporary dir specified with -tmp.");
        System.err.println("  -archive              Archives the binary along with resources and supporting\n" 
                         + "                        files in a format suitable for distribution (e.g. an IPA\n" 
                         + "                        file for iOS apps). The archive will be created in the\n" 
                         + "                        install dir specified using -d.");
        System.err.println("  -debug                Generates debug information");
        System.err.println("  -use-debug-libs       Links against debug versions of the RoboVM VM libraries");
        System.err.println("  -libs <list>          : separated list of static library files (.a), object\n"
                         + "                        files (.o) and system libraries that should be included\n" 
                         + "                        when linking the final executable.");
        System.err.println("  -exportedsymbols <list>\n" 
                         + "                        : separated list of symbols that should be exported\n"
                         + "                        when linking the executable. This can be used when\n" 
                         + "                        linking in function which will be called using bro.\n" 
                         + "                        Wildcards can be used. * matches zero or more characters,\n" 
                         + "                        ? matches one character. [abc], [a-z] matches one character\n" 
                         + "                        from the specified set of characters.");
        System.err.println("  -unhidesymbols <list>\n" 
                         + "                        : separated list of global hidden symbols in linked in static\n" 
                         + "                        libraries or frameworks that should be unhidden to be\n" 
                         + "                        accessible to bro @Bridge methods. Wildcards are not\n" 
                         + "                        supported. Unhidden symbols will always be exported.");
        System.err.println("  -frameworks <list>    : separated list of frameworks that should be included\n" 
                         + "                        when linking the final executable.");
        System.err.println("  -weakframeworks <list>\n" 
                         + "                        : separated list of frameworks that should be weakly linked\n" 
                         + "                        into the final executable.");
        System.err.println("  -frameworkpaths <list>\n" 
                         + "                        : separated list of framework search paths used when searching\n" 
                         + "                        for custom frameworks.");
        System.err.println("  -resources <list>     : separated list of files and directories that should be\n"
                         + "                        copied to the install dir. Accepts Ant-style patterns.\n" 
                         + "                        If a pattern is specified the longest non-pattern path before\n" 
                         + "                        the first wildcard will be used as base directory and will\n" 
                         + "                        not be recreated in the install dir.");
        System.err.println("  -strip-archives-include <list>\n" 
                         + "                        : separated list of file patterns. Matching files will always\n"
                         + "                        be included when stripping archives. The default is to include\n"
                         + "                        all non .class files when stripping archives.\n"
                         + "                        -strip-archives-include and -strip-archives-exclude patterns\n"
                         + "                        will be evaluated in order and the first matching pattern will\n"
                         + "                        specify whether a specific file should be included or not.");
        
        System.err.println("  -strip-archives-exclude <list>\n"
                         + "                        : separated list of file patterns. Matching files will always\n"
                         + "                        be excluded when stripping archives. The default is to include\n"
                         + "                        all non .class files when stripping archives.\n"
                         + "                        -strip-archives-include and -strip-archives-exclude patterns\n"
                         + "                        will be evaluated in order and the first matching pattern will\n"
                         + "                        specify whether a specific file should be included or not.");
        System.err.println("  -cacerts <value>      Use the specified cacerts file. Allowed value are 'none',\n" 
                         + "                        'full'. Default is 'full' but no cacerts will be included\n" 
                         + "                        unless the code actually needs them.");
        System.err.println("  -skiprt               Do not add default robovm-rt.jar to bootclasspath");
        System.err.println("  -config <file>        Reads the specified configuration XML file. Values set in\n" 
                         + "                        the file will override values set earlier in the command\n" 
                         + "                        line. Later options will override values set in the XML file.\n" 
                         + "                        Can be specified multiple times to read multiple config files.");
        System.err.println("  -dumpconfig <file>    Dumps a configuration XML file to the specified file. Specify\n" 
                         + "                        '-' to dump the config to stdout.");
        System.err.println("  -properties <file>    Reads a Java properties file which will be used when resolving\n" 
                         + "                        variables (enclosed in ${...}) in config XML files and\n" 
                         + "                        Info.plist files. Can be specified multiple times.");
        System.err.println("  -Pname=value          Sets a property value. See the -properties option.");
        System.err.println("  -verbose              Output messages about what the compiler is doing");
        System.err.println("  -version              Print the version of the compiler and exit");
        System.err.println("  -help, -?             Display this information");
        System.err.println("Target specific options:");
        System.err.println("  -createipa            (iOS) Create a .IPA file from the app bundle and place it in\n"
                         + "                        the install dir specified with -d. Alias for -archive.");
        System.err.println("  -ipaarchs             (iOS) : separated list of architectures to include in the IPA.\n" 
                         + "                        Either thumbv7 or arm64 or both. Alias for -archs.");
        System.err.println("  -plist <file>         (iOS/OSX) Info.plist file to be used by the app. If not specified\n"
                         + "                        a simple Info.plist will be generated with a CFBundleIdentifier\n" 
                         + "                        based on the main class name or executable file name.");
        System.err.println("  -entitlements <file>  (iOS) Property list (.plist) file containing entitlements\n" 
                         + "                        passed to codesign when signing the app.");
        System.err.println("  -resourcerules <file> (iOS) Property list (.plist) file containing resource rules\n" 
                         + "                        passed to codesign when signing the app.");
        System.err.println("  -signidentity <id>    (iOS) Sign using this identity. Default is to look for an\n" 
                         + "                        identity starting with 'iPhone Developer' or 'iOS Development'.\n" 
                         + "                        Enclose in '/' to search by regexp, e.g. '/foo|bar/'");
        System.err.println("  -skipsign             (iOS) Skips signing of the compiled Application. Can be used\n"
                         + "                        to create unsigned packages for testing on a jailbroken device.");
        System.err.println("  -provisioningprofile <file>\n" 
                         + "                        (iOS) Provisioning profile to use when building for a device.\n" 
                         + "                        Either a UUID, an app name or app id prefix. If not specified\n" 
                         + "                        a provisioning profile matching the signing identity and bundle\n" 
                         + "                        id from the Info.plist file will be used.");
        System.err.println("  -sdk <version>        (iOS) Version number of the iOS SDK to build against. If not\n" 
                         + "                        specified the latest SDK that can be found will be used.");
        System.err.println("iOS simulator launch options:");
        System.err.println("  -printdevicetypes     The device type ids that can be used to launch a specific\n"
                         + "                        simulator via the -devicetype flag.");
        System.err.println("  -devicetype <type>    The device type to use to launch the simulator e.g. \"iPhone-6, 8.0\"\n"
                         + "                        (defaults to an iPhone simulator using the latest SDK).");
        
        if(plugins != null) {
            for(Plugin plugin: plugins) {
                if(plugin.getArguments().getArguments().size() > 0) {
                    System.err.println(plugin.getClass().getSimpleName() + " options:");
                    for(PluginArgument arg: plugin.getArguments().getArguments()) {
                        String argString = "  -" + plugin.getArguments().getPrefix() + ":" + arg.getName() + (arg.hasValue()? "=" + arg.getValueName(): "");
                        int whitespace = Math.max(1, 24 - argString.length());
                        System.err.println(argString + repeat(" ", whitespace) + arg.getDescription());
                    }
                }
            }
        }
        System.exit(errorMessage != null ? 1 : 0);
        // @formatter:on
    }

    private static String repeat(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(s);
        }
        return builder.toString();
    }

    private class UpdateChecker extends Thread {
        private final String address;
        private volatile JSONObject result;

        public UpdateChecker(String address) {
            this.address = address;
            setDaemon(true);
        }

        @Override
        public void run() {
            result = fetchJson(address);
        }
    }

    /**
     * Performs an update check. If a newer version of RoboVM is available a
     * message will be printed to the log. The update check is also used to
     * gather some anonymous usage statistics.
     */
    private void updateCheck() {
        try {
            String uuid = getInstallUuid();
            if (uuid == null) {
                return;
            }
            long lastCheckTime = getLastUpdateCheckTime();
            if (System.currentTimeMillis() - lastCheckTime < 6 * 60 * 60 * 1000) {
                // Only check for an update once every 6 hours
                return;
            }
            updateLastUpdateCheckTime();
            String osName = System.getProperty("os.name", "Unknown");
            String osArch = System.getProperty("os.arch", "Unknown");
            String osVersion = System.getProperty("os.version", "Unknown");
            UpdateChecker t = new UpdateChecker("http://robovm.mobidevelop.com/version?"
                    + "uuid=" + URLEncoder.encode(uuid, "UTF-8") + "&"
                    + "version=" + URLEncoder.encode(Version.getCompilerVersion(), "UTF-8") + "&"
                    + "osName=" + URLEncoder.encode(osName, "UTF-8") + "&"
                    + "osArch=" + URLEncoder.encode(osArch, "UTF-8") + "&"
                    + "osVersion=" + URLEncoder.encode(osVersion, "UTF-8"));
            t.start();
            t.join(5 * 1000); // Wait for a maximum of 5 seconds
            JSONObject result = t.result;
            if (result != null) {
                String version = (String) result.get("version");
                if (version != null && Version.isOlderThan(Version.getCompilerVersion(), version)) {
                    config.getLogger().info("A new version of RoboVM is available. "
                            + "Current version: %s. New version: %s.", Version.getCompilerVersion(), version);
                }
            }
        } catch (Throwable t) {
            if (config.getHome().isDev()) {
                t.printStackTrace();
            }
        }
    }

    private String getInstallUuid() throws IOException {
        File uuidFile = new File(new File(System.getProperty("user.home"), ".robovm"), "uuid");
        uuidFile.getParentFile().mkdirs();
        String uuid = uuidFile.exists() ? FileUtils.readFileToString(uuidFile, "UTF-8") : null;
        if (uuid == null) {
            uuid = UUID.randomUUID().toString();
            FileUtils.writeStringToFile(uuidFile, uuid, "UTF-8");
        }
        uuid = uuid.trim();
        if (uuid.matches("[0-9a-fA-F-]{36}")) {
            return uuid;
        }
        return null;
    }

    private long getLastUpdateCheckTime() {
        try {
            File timeFile = new File(new File(System.getProperty("user.home"), ".robovm"), "last-update-check");
            timeFile.getParentFile().mkdirs();
            return timeFile.exists() ? Long.parseLong(FileUtils.readFileToString(timeFile, "UTF-8").trim()) : 0;
        } catch (IOException e) {
            return 0;
        }
    }

    private void updateLastUpdateCheckTime() throws IOException {
        File timeFile = new File(new File(System.getProperty("user.home"), ".robovm"), "last-update-check");
        timeFile.getParentFile().mkdirs();
        FileUtils.writeStringToFile(timeFile, String.valueOf(System.currentTimeMillis()), "UTF-8");
    }

    private JSONObject fetchJson(String address) {
        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(5 * 1000);
            conn.setReadTimeout(5 * 1000);
            try (InputStream in = new BufferedInputStream(conn.getInputStream())) {
                return (JSONObject) JSONValue.parseWithException(IOUtils.toString(in, "UTF-8"));
            }
        } catch (Exception e) {
            if (config.getHome().isDev()) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
