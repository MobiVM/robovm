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

import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.facet.FacetManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.openapi.wm.ex.ToolWindowManagerListener;
import com.intellij.ui.content.Content;
import com.intellij.util.PlatformUtils;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;
import org.robovm.compiler.Version;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Resource;
import org.robovm.compiler.log.Logger;
import org.robovm.idea.compilation.RoboVmCompileTask;
import org.robovm.idea.components.RoboVmToolWindowFactory;
import org.robovm.idea.facet.RoboVmFacet;
import org.robovm.idea.facet.RoboVmFacetConfiguration;
import org.robovm.idea.facet.RoboVmFacetType;
import org.robovm.idea.utils.RoboFileUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;

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
        if (System.getProperty("os.name").contains("Mac")) {
            os = OS.MacOsX;
        } else if (System.getProperty("os.name").contains("Windows")) {
            os = OS.Windows;
        } else if (System.getProperty("os.name").contains("Linux")) {
            os = OS.Linux;
        }
    }

    private static OS os;
    static final List<UnprintedMessage> unprintedMessages = new ArrayList<>();

    /**
     * Formatter for the time stamp printed by the logger
     */
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS ");

    public static OS getOs() {
        return os;
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
        UIUtil.invokeLaterIfNeeded(() -> {
            if (project != null) {
                // this may throw an exception, see #88. It appears to be a timing
                // issue
                try {
                    ToolWindowManager.getInstance(project).notifyByBalloon(RoboVmToolWindowFactory.ID, messageType, message);
                } catch (Throwable t) {
                    logError(project, message, t);
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
        if (showBalloon)
            logBalloon(project, MessageType.ERROR, s);
    }

    public static void logWarn(Project project, String format, Object... args) {
        log(project, ConsoleViewContentType.ERROR_OUTPUT, "[WARNING] " + getFormattedTimeStamp() + format, args);
    }

    public static void logDebug(Project project, String format, Object... args) {
        log(project, ConsoleViewContentType.NORMAL_OUTPUT, "[DEBUG] " + getFormattedTimeStamp() + format, args);
    }

    private static ConsoleView getConsoleView(final ToolWindow toolWindow) {
        if (toolWindow != null) {
            Content content = toolWindow.getContentManager().findContent(RoboVmToolWindowFactory.Title);
            if (content instanceof RoboVmToolWindowFactory.MyContent)
                return ((RoboVmToolWindowFactory.MyContent)content).consoleView;
        }
        return null;
    }

    private static ConsoleView getConsoleView(final Project project) {
        if (project != null) {
            ToolWindow toolWindow = ToolWindowManager.getInstance(project).getToolWindow(RoboVmToolWindowFactory.ID);
            return getConsoleView(toolWindow);
        }
        return null;
    }

    private static void dumpUnprintedMessages(ConsoleView consoleView) {
        for (UnprintedMessage unprinted : unprintedMessages) {
            consoleView.print(unprinted.string, unprinted.type);
        }
        unprintedMessages.clear();
    }

    private static void log(final Project project, final ConsoleViewContentType type, String format, Object... args) {
        final String s = String.format(format, args) + "\n";
        UIUtil.invokeLaterIfNeeded(() -> {
            ConsoleView consoleView = getConsoleView(project);
            if (consoleView != null) {
                dumpUnprintedMessages(consoleView);
                consoleView.print(s, type);
            } else {
                unprintedMessages.add(new UnprintedMessage(s, type));
                if (type == ConsoleViewContentType.ERROR_OUTPUT) {
                    System.err.print(s);
                } else {
                    System.out.print(s);
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
        // initialize our tool window to which we
        // log all messages
        UIUtil.invokeLaterIfNeeded(() -> {
            if (project.isDisposed()) {
                return;
            }
            logInfo(project, "RoboVM plugin initialized");
        });

        // also dump unprinted messages once tool window is registered
        project.getMessageBus().connect().subscribe(ToolWindowManagerListener.TOPIC, new ToolWindowManagerListener() {
            @Override
            public void toolWindowsRegistered(@NotNull List<String> ids, @NotNull ToolWindowManager toolWindowManager) {
                if (ids.contains(RoboVmToolWindowFactory.ID)) {
                    UIUtil.invokeLaterIfNeeded(() -> {
                        ConsoleView consoleView = getConsoleView(project);
                        if (consoleView != null)
                            dumpUnprintedMessages(consoleView);
                    });
                }
            }
        });
    }

    /**
     * @return all sdk runtime libraries and their source jars
     */
    public static List<File> getSdkLibraries() {
        List<File> libs = new ArrayList<>();

        Config.Home home = RoboVmLocations.getRoboVmHome();
        if (home.isDev()) {
            // ROBOVM_DEV_ROOT has been set (rtPath points to $ROBOVM_DEV_ROOT/rt/target/robovm-rt-<version>.jar).
            File rootDir = home.getHomeDir();
            libs.add(new File(rootDir, "objc/target/robovm-objc-" + Version.getCompilerVersion() + ".jar"));
            libs.add(new File(rootDir, "objc/target/robovm-objc-" + Version.getCompilerVersion() + "-sources.jar"));
            libs.add(new File(rootDir, "cocoatouch/target/robovm-cocoatouch-" + Version.getCompilerVersion() + ".jar"));
            libs.add(new File(rootDir, "cocoatouch/target/robovm-cocoatouch-" + Version.getCompilerVersion() + "-sources.jar"));
            libs.add(new File(rootDir, "rt/target/robovm-rt-" + Version.getCompilerVersion() + ".jar"));
            libs.add(new File(rootDir, "rt/target/robovm-rt-" + Version.getCompilerVersion() + "-sources.jar"));
            libs.add(new File(rootDir, "cacerts/full/target/robovm-cacerts-full-" + Version.getCompilerVersion() + ".jar"));
        } else {
            // normal run
            File libsDir = new File(RoboVmLocations.getSdkHome(), "lib");
            try {
                libs.addAll(Arrays.asList(RoboFileUtils.listFiles(libsDir, (dir, name) -> name.endsWith(".jar") && !name.contains("cacerts"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return libs;
    }

    /**
     * @return the source jars of all runtime libraries
     */
    public static List<File> getSdkLibrariesWithoutSources() {
        List<File> libs = getSdkLibraries();
        libs.removeIf(file -> file.getName().endsWith("-sources.jar") || file.getName().endsWith("-javadoc.jar"));
        return libs;
    }

    /**
     * @return the source jars of all runtime libraries
     */
    public static List<File> getSdkLibrarySources() {
        List<File> libs = getSdkLibraries();
        libs.removeIf(file -> !file.getName().endsWith("-sources.jar"));
        return libs;
    }


    public static List<Module> getRoboVmModules(Project project) {
        return getRoboVmModules(project, (Predicate<String>)null);
    }

    public static List<Module> getRoboVmModules(Project project, String targetType) {
        return getRoboVmModules(project, t -> t.equals(targetType));
    }

    public static List<Module> getRoboVmModules(Project project, Predicate<String> predicate) {
        List<Module> validModules = new ArrayList<>();
        for (Module module : ModuleManager.getInstance(project).getModules()) {
            if (!isRoboVmModule(module))
                continue;

            // dkimitsa: if target type is specified return only matching modules. E.g. don't allow to run Framework
            // target in Console runner
            if (predicate != null) {
                Config config = loadRawModuleConfig(module);
                if (config == null)
                    continue;
                if (!predicate.test(config.getTargetType()))
                    continue;
            }
            validModules.add(module);
        }
        return validModules;
    }


    /**
     * Only if RoboVM facet is attached
     */
    public static boolean isRoboVmModule(Module module) {
        return FacetManager.getInstance(module).getFacetByType(RoboVmFacetType.TYPE_ID) != null;
    }

    public static Config loadRawModuleConfig(Module module) {
        for (VirtualFile file : ModuleRootManager.getInstance(module).getContentRoots()) {
            if (file.findChild("robovm.xml") != null) {
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
        UIUtil.invokeLaterIfNeeded(() -> {
            ToolWindow toolWindow = ToolWindowManager.getInstance(project).getToolWindow(RoboVmToolWindowFactory.ID);
            if (toolWindow != null) {
                toolWindow.show(() -> {
                });
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
        if (!classesDir.exists()) {
            if (!classesDir.mkdirs()) {
                throw new RuntimeException("Couldn't create classes dir '" + classesDir.getAbsolutePath() + "'");
            }
        }
        return classesDir;
    }

    /**
     * get module content root from facet
     */
    public static File getModuleBaseDir(Module module) {
        RoboVmFacet facet = FacetManager.getInstance(module).getFacetByType(RoboVmFacetType.TYPE_ID);
        RoboVmFacetConfiguration.Settings configuration = facet != null ? facet.getConfiguration().getSettings() : null;
        if (configuration == null) {
            throw new IllegalStateException("Modules has no RoboVM facet configured!");
        }
        if (configuration.getContentRoot() == null) {
            throw new IllegalStateException("RoboVM facet has no content root configured!");
        }
        return new File(configuration.getContentRoot());
    }

    public static Set<File> getModuleResourcePaths(Module module) {
        try {
            File moduleBaseDir = getModuleBaseDir(module);
            Config.Builder configBuilder = new Config.Builder();
            configBuilder.home(RoboVmLocations.getRoboVmHome());
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

    /**
     * finds out if plugin is running in android studio
     */
    public static boolean isAndroidStudio() {
        return "AndroidStudio".equals(PlatformUtils.getPlatformPrefix());
    }
}
