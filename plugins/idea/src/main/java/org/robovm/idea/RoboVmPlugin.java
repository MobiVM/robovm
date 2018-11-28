/*
 * Copyright (C) 2015 RoboVM AB
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
package org.robovm.idea;

import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.compiler.CompileScope;
import com.intellij.openapi.compiler.CompileTask;
import com.intellij.openapi.compiler.CompilerManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.OrderEntry;
import com.intellij.openapi.roots.OrderEnumerator;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileAdapter;
import com.intellij.openapi.vfs.VirtualFileEvent;
import com.intellij.openapi.vfs.VirtualFileListener;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;
import com.intellij.util.ui.UIUtil;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.robovm.compiler.Version;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Resource;
import org.robovm.compiler.log.Logger;
import org.robovm.idea.compilation.RoboVmCompileTask;
import org.robovm.idea.config.RoboVmGlobalConfig;
import org.robovm.idea.sdk.RoboVmSdkType;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/**
 * Provides util for the other components of the plugin such
 * as logging.
 */
public class RoboVmPlugin {
    public enum OS {
        MacOsX,
        Windows,
        Linux
    }

    static {
        if(System.getProperty("os.name").contains("Mac")) {
            os = OS.MacOsX;
        } else if(System.getProperty("os.name").contains("Windows")) {
            os = OS.Windows;
        } else if(System.getProperty("os.name").contains("Linux")) {
            os = OS.Linux;
        }
    }

    private static final String ROBOVM_TOOLWINDOW_ID = "RoboVM";
    private static OS os;
    static volatile Map<Project, ConsoleView> consoleViews = new ConcurrentHashMap<>();
    static volatile Map<Project, ToolWindow> toolWindows = new ConcurrentHashMap<>();
    static volatile Map<Project, VirtualFileListener> fileListeners = new ConcurrentHashMap<>();
    static final List<UnprintedMessage> unprintedMessages = new ArrayList<UnprintedMessage>();

    /**
     * Formatter for the time stamp printed by the logger
     */
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS ");

    public static OS getOs() {
        return os;
    }

    public static String getBestAndroidSdkVersion() {
        int androidSdkVersion = 0;
        File androidSdkDir = getBestAndroidSdkDir();
        if(androidSdkDir == null) {
            return "23";
        }
        File platformsDir = new File(androidSdkDir, "platforms");
        for(File file: platformsDir.listFiles()) {
            String[] tokens = file.getName().split("-");
            if(tokens.length == 2) {
                try {
                    int version = Integer.parseInt(tokens[1]);
                    if(version > androidSdkVersion) {
                        androidSdkVersion = version;
                    }
                } catch(NumberFormatException e) {
                    // nothing we can do
                }
            }
        }
        if(androidSdkVersion == 0) {
            return "23";
        } else {
            return Integer.toString(androidSdkVersion);
        }
    }

    public static String getBestAndroidBuildToolsVersion() {
        int androidBuildToolsVersion = 0;
        String androidBuildToolsVersionString = "";
        File androidSdkDir = getBestAndroidSdkDir();
        if(androidSdkDir == null) {
            return "23.0.1";
        }
        File platformsDir = new File(androidSdkDir, "build-tools");
        for(File file: platformsDir.listFiles()) {
            String[] tokens = file.getName().split("\\.");
            if(tokens.length == 3) {
                try {
                    int version = Integer.parseInt(tokens[0]) * 1000 * 1000 +
                                  Integer.parseInt(tokens[1]) * 1000 +
                                  Integer.parseInt(tokens[2]);
                    if(version > androidBuildToolsVersion) {
                        androidBuildToolsVersion = version;
                        androidBuildToolsVersionString = file.getName();
                    }
                } catch(NumberFormatException e) {
                    // nothing we can do
                }
            }
        }
        if(androidBuildToolsVersion == 0) {
            return "23.0.1";
        } else {
            return androidBuildToolsVersionString;
        }
    }

    public static File getBestAndroidSdkDir() {
        Sdk bestSdk = null;
        for (Sdk sdk : ProjectJdkTable.getInstance().getAllJdks()) {
            if (sdk.getSdkType().getName().equals("Android SDK")) {
                if(sdk.getHomePath().contains("/Library/RoboVM/")) {
                    return new File(sdk.getHomePath());
                } else {
                    bestSdk = sdk;
                }
            }
        }
        return new File(bestSdk.getHomePath());
    }


    public static boolean isAndroidSdkInstalled(String sdkDir) {
        File sdk = new File(sdkDir, os == OS.Windows? "tools/android.bat": "tools/android");
        return sdk.exists();
    }

    public static boolean isAndroidSdkSetup() {
        for (Sdk sdk : ProjectJdkTable.getInstance().getAllJdks()) {
            if (sdk.getSdkType().getName().equals("Android SDK")) {
                return true;
            }
        }
        return false;
    }

    public static boolean areAndroidComponentsInstalled(String sdkDir) {
        return new File(sdkDir, "platforms").list().length > 0;
    }

    static class UnprintedMessage {
        final String string;
        final ConsoleViewContentType type;

        public UnprintedMessage(String string, ConsoleViewContentType type) {
            this.string = string;
            this.type = type;
        }
    }

    public static void logBalloon(final Project project, final MessageType messageType, final String message) {
        UIUtil.invokeLaterIfNeeded(new Runnable() {
            @Override
            public void run() {
                if (project != null) {
                    // this may throw an exception, see #88. It appears to be a timing
                    // issue
                    try {
                        ToolWindowManager.getInstance(project).notifyByBalloon(ROBOVM_TOOLWINDOW_ID, MessageType.ERROR, message);
                    } catch (Throwable t) {
                        logError(project, message, t);
                    }
                }
            }
        });
    }

    private static String getFormattedTimeStamp() {
        return LocalDateTime.now().format(formatter);
    }

    public static void logInfo(Project project, String format, Object... args) {
        log(project, ConsoleViewContentType.SYSTEM_OUTPUT, "[INFO] " + getFormattedTimeStamp() + format, args);
    }

    public static void logError(Project project, String format, Object... args) {
        log(project, ConsoleViewContentType.ERROR_OUTPUT, "[ERROR] " + getFormattedTimeStamp() + format, args);
    }

    public static void logErrorThrowable(Project project, String s, Throwable t, boolean showBalloon) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        t.printStackTrace(writer);
        log(project, ConsoleViewContentType.ERROR_OUTPUT, "[ERROR] %s\n%s", s, stringWriter.toString());
        logBalloon(project, MessageType.ERROR, s);
    }

    public static void logWarn(Project project, String format, Object... args) {
        log(project, ConsoleViewContentType.ERROR_OUTPUT, "[WARNING] " + getFormattedTimeStamp() + format, args);
    }

    public static void logDebug(Project project, String format, Object... args) {
        log(project, ConsoleViewContentType.NORMAL_OUTPUT, "[DEBUG] " + getFormattedTimeStamp() + format, args);
    }

    private static void log(final Project project, final ConsoleViewContentType type, String format, Object... args) {
        final String s = String.format(format, args) + "\n";
        UIUtil.invokeLaterIfNeeded(new Runnable() {
            @Override
            public void run() {
                ConsoleView consoleView = project == null ? null : consoleViews.get(project);
                if (consoleView != null) {
                    for (UnprintedMessage unprinted : unprintedMessages) {
                        consoleView.print(unprinted.string, unprinted.type);
                    }
                    unprintedMessages.clear();
                    consoleView.print(s, type);
                } else {
                    unprintedMessages.add(new UnprintedMessage(s, type));
                    if (type == ConsoleViewContentType.ERROR_OUTPUT) {
                        System.err.print(s);
                    } else {
                        System.out.print(s);
                    }
                }
            }
        });
    }

    public static Logger getLogger(final Project project) {
        return new Logger() {
            @Override
            public void debug(String s, Object... objects) {
                logDebug(project, s, objects);
            }

            @Override
            public void info(String s, Object... objects) {
                logInfo(project, s, objects);
            }

            @Override
            public void warn(String s, Object... objects) {
                logWarn(project, s, objects);
            }

            @Override
            public void error(String s, Object... objects) {
                logError(project, s, objects);
            }
        };
    }

    public static void initializeProject(final Project project) {
        // setup a compile task if there isn't one yet
        boolean found = false;
        for (CompileTask task : CompilerManager.getInstance(project).getAfterTasks()) {
            if (task instanceof RoboVmCompileTask) {
                found = true;
                break;
            }
        }
        if (!found) {
            CompilerManager.getInstance(project).addAfterTask(new RoboVmCompileTask());
        }

        // initialize our tool window to which we
        // log all messages
        UIUtil.invokeLaterIfNeeded(new Runnable() {
            @Override
            public void run() {
                if (project.isDisposed()) {
                    return;
                }
                ToolWindow toolWindow = ToolWindowManager.getInstance(project).registerToolWindow(ROBOVM_TOOLWINDOW_ID, false, ToolWindowAnchor.BOTTOM, project, true);
                ConsoleView consoleView = TextConsoleBuilderFactory.getInstance().createBuilder(project).getConsole();
                Content content = toolWindow.getContentManager().getFactory().createContent(consoleView.getComponent(), "Console", true);
                toolWindow.getContentManager().addContent(content);
                toolWindow.setIcon(RoboVmIcons.ROBOVM_SMALL);
                consoleViews.put(project, consoleView);
                toolWindows.put(project, toolWindow);
                logInfo(project, "RoboVM plugin initialized");
            }
        });

        // initialize virtual file change listener so we can
        // trigger recompiles on file saves
        VirtualFileListener listener = new VirtualFileAdapter() {
            @Override
            public void contentsChanged(@NotNull VirtualFileEvent event) {
                compileIfChanged(event, project);
            }
        };
        VirtualFileManager.getInstance().addVirtualFileListener(listener);
        fileListeners.put(project, listener);
    }

    private static void compileIfChanged(VirtualFileEvent event, final Project project) {
        if(!RoboVmGlobalConfig.isCompileOnSave()) {
            return;
        }
        VirtualFile file = event.getFile();
        Module module = null;
        for(Module m: ModuleManager.getInstance(project).getModules()) {
            if(ModuleRootManager.getInstance(m).getFileIndex().isInContent(file)) {
                module = m;
                break;
            }
        }

        if(module != null) {
            if(isRoboVmModule(module)) {
                final Module foundModule = module;
                OrderEntry orderEntry = ModuleRootManager.getInstance(module).getFileIndex().getOrderEntryForFile(file);
                if(orderEntry != null && orderEntry.getFiles(OrderRootType.SOURCES).length != 0) {
                    ApplicationManager.getApplication().invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            if(!CompilerManager.getInstance(project).isCompilationActive()) {
                                CompileScope scope = CompilerManager.getInstance(project).createModuleCompileScope(foundModule, true);
                                CompilerManager.getInstance(project).compile(scope, null);
                            }
                        }
                    });
                }
            }
        }
    }

    public static void unregisterProject(Project project) {
        ConsoleView consoleView = consoleViews.remove(project);
        if (consoleView != null) {
            consoleView.dispose();
        }
        toolWindows.remove(project);
        ToolWindowManager.getInstance(project).unregisterToolWindow(ROBOVM_TOOLWINDOW_ID);
        VirtualFileManager.getInstance().removeVirtualFileListener(fileListeners.remove(project));
    }

    public static void extractSdk() {
        File sdkHome = getSdkHomeBase();
        if (!sdkHome.exists()) {
            if (!sdkHome.mkdirs()) {
                logError(null, "Couldn't create sdk dir in %s", sdkHome.getAbsolutePath());
                throw new RuntimeException("Couldn't create sdk dir in " + sdkHome.getAbsolutePath());
            }
        }
        extractArchive("robovm-dist", sdkHome);

        // create an SDK if it doesn't exist yet
        RoboVmSdkType.createSdkIfNotExists();
    }

    public static File getSdkHome() {
        File sdkHome = new File(getSdkHomeBase(), "robovm-" + Version.getVersion());
        return sdkHome;
    }

    public static File getSdkHomeBase() {
        return new File(System.getProperty("user.home"), ".robovm-sdks");
    }

    public static Sdk getSdk() {
        RoboVmSdkType sdkType = new RoboVmSdkType();
        for(Sdk sdk: ProjectJdkTable.getInstance().getAllJdks()) {
            if(sdkType.suggestSdkName(null, null).equals(sdk.getName())) {
                return sdk;
            }
        }
        return null;
    }

    private static void extractArchive(String archive, File dest) {
        archive = "/" + archive;
        TarArchiveInputStream in = null;
        try {
            boolean filesWereUpdated = false;
            in = new TarArchiveInputStream(new GZIPInputStream(RoboVmPlugin.class.getResourceAsStream(archive)));
            ArchiveEntry entry = null;
            while ((entry = in.getNextEntry()) != null) {
                File f = new File(dest, entry.getName());
                if (entry.isDirectory()) {
                    f.mkdirs();
                } else {
                    // skip extracting if file looks to be same as in archive (ts and size matches)
                    if (f.exists() && f.lastModified() == entry.getLastModifiedDate().getTime() && f.length() == entry.getSize()) {
                        continue;
                    }
                    f.getParentFile().mkdirs();
                    OutputStream out = null;
                    try {
                        out = new FileOutputStream(f);
                        IOUtils.copy(in, out);
                        IOUtils.closeQuietly(out);
                        out = null;
                        // set last modification time stamp as it was inside tar otherwise
                        // robovm will see new time stamp and will rebuild all classes that were inside jar
                        f.setLastModified(entry.getLastModifiedDate().getTime());
                    } finally {
                        if (out != null)
                            IOUtils.closeQuietly(out);
                    }

                    // mark that there was a change to SDK files
                    filesWereUpdated = true;
                }
            }
            logInfo(null, "Installed RoboVM SDK %s to %s", Version.getVersion(), dest.getAbsolutePath());

            if (filesWereUpdated) {
                File cacheLog = new File(System.getProperty("user.home"), ".robovm/cache");
                logInfo(null, "Clearing ~/.robovm/cache folder due SDK files changed.");
                try {
                    FileUtils.deleteDirectory(cacheLog);
                } catch (IOException ignored) {
                }
            }

            for (File file : new File(getSdkHome(), "bin").listFiles()) {
                file.setExecutable(true);
            }
        } catch (Throwable t) {
            logError(null, "Couldn't extract SDK to %s", dest.getAbsolutePath());
            throw new RuntimeException("Couldn't extract SDK to " + dest.getAbsolutePath(), t);
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    /**
     * @return all sdk runtime libraries and their source jars
     */
    public static List<File> getSdkLibraries() {
        List<File> libs = new ArrayList<File>();

        Config.Home home = getRoboVmHome();
        if (home.isDev()) {
            // ROBOVM_DEV_ROOT has been set (rtPath points to $ROBOVM_DEV_ROOT/rt/target/robovm-rt-<version>.jar).
            File rootDir = home.getRtPath().getParentFile().getParentFile().getParentFile();
            libs.add(new File(rootDir, "objc/target/robovm-objc-" + Version.getVersion() +  ".jar"));
            libs.add(new File(rootDir, "objc/target/robovm-objc-" + Version.getVersion() +  "-sources.jar"));
            libs.add(new File(rootDir, "cocoatouch/target/robovm-cocoatouch-" + Version.getVersion() +  ".jar"));
            libs.add(new File(rootDir, "cocoatouch/target/robovm-cocoatouch-" + Version.getVersion() +  "-sources.jar"));
            libs.add(new File(rootDir, "rt/target/robovm-rt-" + Version.getVersion() +  ".jar"));
            libs.add(new File(rootDir, "rt/target/robovm-rt-" + Version.getVersion() +  "-sources.jar"));
            libs.add(new File(rootDir, "cacerts/full/target/robovm-cacerts-full-" + Version.getVersion() +  ".jar"));
        } else {
            // normal run
            File libsDir = new File(getSdkHome(), "lib");
            for (File file : libsDir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".jar") && !name.contains("cacerts");
                }
            })) {
                libs.add(file);
            }
        }
        return libs;
    }

    /**
     * @return the source jars of all runtime libraries
     */
    public static List<File> getSdkLibrariesWithoutSources() {
        List<File> libs = getSdkLibraries();
        Iterator<File> iter = libs.iterator();
        while(iter.hasNext()) {
            File file = iter.next();
            if(file.getName().endsWith("-sources.jar") || file.getName().endsWith("-javadoc.jar")) {
                iter.remove();
            }
        }
        return libs;
    }

    /**
     * @return the source jars of all runtime libraries
     */
    public static List<File> getSdkLibrarySources() {
        List<File> libs = getSdkLibraries();
        Iterator<File> iter = libs.iterator();
        while(iter.hasNext()) {
            File file = iter.next();
            if(!file.getName().endsWith("-sources.jar")) {
                iter.remove();
            }
        }
        return libs;
    }

    public static Config.Home getRoboVmHome() {
        try {
            return Config.Home.find();
        } catch(Throwable t) {
            return new Config.Home(getSdkHome());
        }
    }

    public static List<Module> getRoboVmModules(Project project) {
        return getRoboVmModules(project, null);
    }

    public static List<Module> getRoboVmModules(Project project, String targetType) {
        List<Module> validModules = new ArrayList<Module>();
        for (Module module : ModuleManager.getInstance(project).getModules()) {
            if (!isRoboVmModule(module))
                continue;

            // dkimitsa: if target type is specified return only matching modules. E.g. don't allow to run Framework
            // target in Console runner
            if (targetType != null) {
                Config config = loadRawModuleConfig(module);
                if (config == null)
                    continue;
                if (!targetType.equals(config.getTargetType()))
                    continue;;
            }
            validModules.add(module);
        }
        return validModules;
    }

    public static boolean isRoboVmModule(Module module) {
        // HACK! to identify if the module uses a robovm sdk
        if (ModuleRootManager.getInstance(module).getSdk() != null) {
            if (ModuleRootManager.getInstance(module).getSdk().getSdkType().getName().toLowerCase().contains("robovm")) {
                return true;
            }
        }

        // check if there's any RoboVM RT libs in the classpath
        OrderEnumerator classes = ModuleRootManager.getInstance(module).orderEntries().recursively().withoutSdk().compileOnly();
        for (String path : classes.getPathsList().getPathList()) {
            if (isSdkLibrary(path)) {
                return true;
            }
        }

        // check if there's a robovm.xml file in the root of the module
        for(VirtualFile file: ModuleRootManager.getInstance(module).getContentRoots()) {
            if(file.findChild("robovm.xml") != null) {
                return true;
            }
        }

        return false;
    }

    public static Config loadRawModuleConfig(Module module) {
        for(VirtualFile file: ModuleRootManager.getInstance(module).getContentRoots()) {
            if(file.findChild("robovm.xml") != null) {
                try {
                    File contentRoot = new File(file.getPath());
                    return Config.loadRawConfig(contentRoot);
                } catch (IOException ignored) {
                }
            }
        }

        return null;
    }


    public static void focusToolWindow(final Project project) {
        UIUtil.invokeLaterIfNeeded(new Runnable() {
            @Override
            public void run() {
                ToolWindow toolWindow = toolWindows.get(project);
                if(toolWindow != null) {
                    toolWindow.show(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });
                }
            }
        });
    }

    public static File getModuleLogDir(Module module) {
        File logDir = new File(getModuleBaseDir(module), "robovm-build/logs/");
        if (!logDir.exists()) {
            if (!logDir.mkdirs()) {
                throw new RuntimeException("Couldn't create log dir '" + logDir.getAbsolutePath() + "'");
            }
        }
        return logDir;
    }

    public static File getModuleXcodeDir(Module module) {
        File buildDir = new File(getModuleBaseDir(module), "robovm-build/xcode/");
        if (!buildDir.exists()) {
            if (!buildDir.mkdirs()) {
                throw new RuntimeException("Couldn't create build dir '" + buildDir.getAbsolutePath() + "'");
            }
        }
        return buildDir;
    }

    public static File getModuleBuildDir(Module module, String runConfigName, org.robovm.compiler.config.OS os, Arch arch) {
        File buildDir = new File(getModuleBaseDir(module), "robovm-build/tmp/" + runConfigName + "/" + os + "/" + arch);
        if (!buildDir.exists()) {
            if (!buildDir.mkdirs()) {
                throw new RuntimeException("Couldn't create build dir '" + buildDir.getAbsolutePath() + "'");
            }
        }
        return buildDir;
    }

    public static File getModuleClassesDir(String moduleBaseDir) {
        File classesDir = new File(moduleBaseDir, "robovm-build/classes/");
        if(!classesDir.exists()) {
            if (!classesDir.mkdirs()) {
                throw new RuntimeException("Couldn't create classes dir '" + classesDir.getAbsolutePath() + "'");
            }
        }
        return classesDir;
    }

    public static File getModuleBaseDir(Module module) {
        File root = new File(ModuleRootManager.getInstance(module).getContentRoots()[0].getPath());
        while (root.exists()) {
            File robovmXml = new File(root, "robovm.xml");
            if (robovmXml.exists()) break;
            if (root.getParent() != null) root = root.getParentFile();
            else break;
        }
        return root;
    }

    public static Set<File> getModuleResourcePaths(Module module) {
        try {
            File moduleBaseDir = getModuleBaseDir(module);
            Config.Builder configBuilder = new Config.Builder();
            configBuilder.home(RoboVmPlugin.getRoboVmHome());
            configBuilder.addClasspathEntry(new File(".")); // Fake a classpath to make Config happy
            configBuilder.skipLinking(true);
            RoboVmCompileTask.loadConfig(module.getProject(), configBuilder, moduleBaseDir, false);
            Config config = configBuilder.build();
            Set<File> paths = new HashSet<>();
            for (Resource r : config.getResources()) {
                if (r.getPath() != null) {
                    if (r.getPath().exists() && r.getPath().isDirectory()) {
                        paths.add(r.getPath());
                    }
                } else if (r.getDirectory() != null) {
                    if (r.getDirectory().exists() && r.getDirectory().isDirectory()) {
                        paths.add(r.getDirectory());
                    }
                }
            }
            return paths;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isSdkLibrary(String path) {
        String name = new File(path).getName();

        return name.startsWith("robovm-rt") ||
                name.startsWith("robovm-objc") ||
                name.startsWith("robovm-cocoatouch");
    }

    public static boolean isBootClasspathLibrary(File path) {
        return path.getName().startsWith("robovm-rt");
    }
}
