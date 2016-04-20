/*
 * Copyright (C) 2012 RoboVM AB
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
package org.robovm.eclipse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.NullOutputStream;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.robovm.compiler.Version;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.config.Resource;
import org.robovm.compiler.log.Logger;
import org.robovm.eclipse.internal.RoboVMCocoaTouchClasspathContainer;
import org.robovm.eclipse.internal.RoboVMNature;
import org.robovm.eclipse.internal.RoboVMProjectObserver;
import org.robovm.eclipse.internal.ib.IBIntegratorManager;

/**
 *
 * @version $Id$
 */
public class RoboVMPlugin extends AbstractUIPlugin implements IStartup {

    public static final String PLUGIN_ID = "org.robovm.eclipse";
    public static final String LAUNCH_ARCH = PLUGIN_ID + ".launch.arch";
    public static final String LAUNCH_OS = PLUGIN_ID + ".launch.os";
    public static final String ARCH_AUTO = "auto";
    public static final String OS_AUTO = "auto";
    public static final String IMAGE_NEW_CONSOLE_PROJECT_BANNER = PLUGIN_ID + ".image.newConsoleProjectBanner";
    public static final String IMAGE_NEW_IOS_PROJECT_BANNER = PLUGIN_ID + ".image.newIOSProjectBanner";
    public static final String IMAGE_NEW_IOS_STORYBOARD_BANNER = PLUGIN_ID + ".image.newIOSStoryboardBanner";
    public static final String IMAGE_NEW_IOS_VIEW_CONTROLLER_BANNER = PLUGIN_ID + ".image.newIOSViewControllerBanner";
    public static final String IMAGE_NEW_IOS_VIEW_BANNER = PLUGIN_ID + ".image.newIOSViewBanner";

    public static final Arch[] ALL_ARCH_VALUES = new Arch[] { Arch.thumbv7, Arch.arm64, Arch.x86, Arch.x86_64 };
    public static final String[] ALL_ARCH_NAMES =
            new String[] {
                "32-bit ARM (" + Arch.thumbv7 + ")",
                "64-bit ARM (" + Arch.arm64 + ")",
                "32-bit x86 (" + Arch.x86 + ")",
                "64-bit x86 (" + Arch.x86_64 + ")" };
    public static final Arch[] IOS_DEVICE_ARCH_VALUES = new Arch[] { Arch.thumbv7, Arch.arm64 };
    public static final String[] IOS_DEVICE_ARCH_NAMES =
            new String[] {
                "32-bit (" + Arch.thumbv7 + ")",
                "64-bit (" + Arch.arm64 + ")" };
    public static final Arch[] IOS_SIM_ARCH_VALUES = new Arch[] { Arch.x86, Arch.x86_64 };
    public static final String[] IOS_SIM_ARCH_NAMES =
            new String[] {
                "32-bit (" + Arch.x86 + ")",
                "64-bit (" + Arch.x86_64 + ")" };

    private static RoboVMPlugin plugin;
    private static IPreferenceStore pluginPreferencesStore;
    private static Config.Home roboVMHome = null;

    private boolean showConsoleOnWrite = true;
    private MessageConsole console;
    private MessageConsoleStream debugStream;
    private MessageConsoleStream infoStream;
    private MessageConsoleStream warnStream;
    private MessageConsoleStream errorStream;

    private static Logger consoleLogger = new Logger() {
        @Override
        public void info(String format, Object... args) {
            RoboVMPlugin.consoleInfo(format, args);
        }

        @Override
        public void error(String format, Object... args) {
            RoboVMPlugin.consoleError(format, args);
        }

        @Override
        public void warn(String format, Object... args) {
            RoboVMPlugin.consoleWarn(format, args);
        }

        @Override
        public void debug(String format, Object... args) {
            RoboVMPlugin.consoleDebug(format, args);
        }
    };

    public static void log(IStatus status) {
        getDefault().getLog().log(status);
    }

    public static void log(Throwable e) {
        if (e instanceof CoreException) {
            log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR, e.getMessage(), e.getCause()));
        } else {
            log(new Status(IStatus.ERROR, PLUGIN_ID, 999, "Internal Error", e));
        }
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        pluginPreferencesStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);

        // Set up the console
        console = new MessageConsole("RoboVM Console", null);
        console.setWaterMarks(40000, 80000);
        ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { console });
        Display display = getDisplay();
        debugStream = console.newMessageStream();
        final Color debugColor = new Color(display, 0x99, 0x99, 0x99);
        infoStream = console.newMessageStream();
        final Color infoColor = new Color(display, 0x00, 0x99, 0x00);
        warnStream = console.newMessageStream();
        final Color warnColor = new Color(display, 0xFF, 0x00, 0xFF);
        errorStream = console.newMessageStream();
        final Color errorColor = new Color(display, 0xFF, 0x00, 0x00);
        display.asyncExec(new Runnable() {
            @Override
            public void run() {
                debugStream.setColor(debugColor);
                infoStream.setColor(infoColor);
                warnStream.setColor(warnColor);
                errorStream.setColor(errorColor);
            }
        });

        Job job = new Job("RoboVM Interface Builder Integrator launcher") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    RoboVMProjectObserver.getInstance().start(monitor);
                    IBIntegratorManager.getInstance().start(monitor);
                } catch (CoreException e) {
                    log(e);
                }
                return Status.OK_STATUS;
            }
        };
        job.schedule();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        super.stop(context);

        synchronized (RoboVMPlugin.class) {
            plugin = null;
        }
    }

    public static Logger getConsoleLogger() {
        return consoleLogger;
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static RoboVMPlugin getDefault() {
        return plugin;
    }

    public static IPreferenceStore getPluginPreferenceStore() {
        return pluginPreferencesStore;
    }

    public static synchronized Display getDisplay() {
        if (plugin != null) {
            IWorkbench workbench = plugin.getWorkbench();
            if (workbench != null) {
                return workbench.getDisplay();
            }
        }
        return null;
    }

    public static synchronized Shell getShell() {
        Display display = getDisplay();
        if (display != null) {
            return display.getActiveShell();
        }
        return null;
    }

    public static File getMetadataDir() {
        return plugin.getStateLocation().toFile();
    }

    public static File getBuildDir(String projectName) {
        return new File(new File(getMetadataDir(), "build"), projectName);
    }

    public static synchronized Config.Home getRoboVMHome() throws IOException {
        if (roboVMHome == null) {
            if (System.getenv("ROBOVM_DEV_ROOT") != null) {
                roboVMHome = Config.Home.find();
            } else {
                String version = Version.getVersion();
                File homeDir = new File(getMetadataDir(), "robovm-" + version);
                File distFile = new File(getMetadataDir(), "robovm-dist-" + version + ".tar.gz");
                URL distUrl = RoboVMPlugin.class.getResource("/lib/robovm-dist.tar.gz");
                if (homeDir.exists() && version.contains("SNAPSHOT")) {
                    byte[] oldMd5 = new byte[0];
                    if (distFile.exists()) {
                        oldMd5 = md5(distFile);
                    }
                    byte[] newMd5 = md5(distUrl);
                    if (!Arrays.equals(oldMd5, newMd5)) {
                        FileUtils.deleteDirectory(homeDir);
                    }
                }

                if (!homeDir.exists()) {
                    // Copy the tar.gz to distFile and extract.
                    distFile.delete();
                    FileUtils.copyURLToFile(distUrl, distFile);
                    extractTarGz(distFile, distFile.getParentFile());
                }
                roboVMHome = new Config.Home(homeDir);
            }
        }
        return roboVMHome;
    }

    private static void extractTarGz(File archive, File destDir) throws IOException {
        TarArchiveInputStream in = null;
        try {
            in = new TarArchiveInputStream(new GZIPInputStream(new FileInputStream(archive)));
            ArchiveEntry entry = null;
            while ((entry = in.getNextEntry()) != null) {
                File f = new File(destDir, entry.getName());
                if (entry.isDirectory()) {
                    f.mkdirs();
                } else {
                    f.getParentFile().mkdirs();
                    OutputStream out = null;
                    try {
                        out = new FileOutputStream(f);
                        IOUtils.copy(in, out);
                    } finally {
                        IOUtils.closeQuietly(out);
                    }
                }
                if (entry instanceof TarArchiveEntry) {
                    int mode = ((TarArchiveEntry) entry).getMode();
                    if ((mode & 00100) > 0) {
                        // Preserve execute permissions
                        f.setExecutable(true, (mode & 00001) == 0);
                    }
                }
            }
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    public static boolean isRoboVMProject(IProject project) throws CoreException {
        if (project.getNature(RoboVMNature.ID) == null) {
            return false;
        }
        return true;
    }

    public static boolean isRoboVMIOSProject(IProject project) throws CoreException {
        if (!isRoboVMProject(project)) {
            return false;
        }
        IJavaProject javaProject = JavaCore.create(project);
        for (IClasspathEntry entry : javaProject.getRawClasspath()) {
            if (entry.getEntryKind() == IClasspathEntry.CPE_CONTAINER
                    && entry.getPath().toString().equals(RoboVMCocoaTouchClasspathContainer.ID)) {
                return true;
            }
            if (entry.getPath().lastSegment().startsWith("robovm-cocoatouch")) {
                return true;
            }
        }
        return false;
    }

    public static Set<File> getRoboVMProjectResourcePaths(IProject project) {
        try {
            File projectRoot = project.getLocation().toFile();
            Config.Builder configBuilder = new Config.Builder();
            configBuilder.home(RoboVMPlugin.getRoboVMHome());
            // Fake a classpath to make Config happy
            configBuilder.addClasspathEntry(Files.createTempDirectory("empty").toFile());
            configBuilder.skipLinking(true);
            RoboVMPlugin.loadConfig(configBuilder, projectRoot, false);
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

    public static File getRoboVMProjectInfoPlist(IProject project) {
        try {
            File projectRoot = project.getLocation().toFile();
            Config.Builder configBuilder = new Config.Builder();
            configBuilder.home(RoboVMPlugin.getRoboVMHome());
            // Fake a classpath to make Config happy
            configBuilder.addClasspathEntry(Files.createTempDirectory("empty").toFile());
            configBuilder.skipLinking(true);
            RoboVMPlugin.loadConfig(configBuilder, projectRoot, false);
            Config config = configBuilder.build();
            if (config.getIosInfoPList() != null) {
                return config.getIosInfoPList().getFile();
            }
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getSourcePaths(Set<String> paths, IJavaProject javaProject) throws CoreException {
        try {
            // add the source jars of rt/objc/cocoatouch etc.
            File libDir = new File(RoboVMPlugin.getRoboVMHome().getBinDir().getParentFile(), "lib");
            paths.add(new File(libDir, "robovm-cocoatouch-sources.jar").getAbsolutePath());
            paths.add(new File(libDir, "robovm-objc-sources.jar").getAbsolutePath());
            paths.add(new File(libDir, "robovm-rt-sources.jar").getAbsolutePath());
        } catch (IOException e) {
            RoboVMPlugin.consoleError("Couldn't retrieve lib/ directory");
        }
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        for (IClasspathEntry entry : javaProject.getResolvedClasspath(true)) {
            IPath path = null;
            if (entry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
                IResource resource = root.findMember(entry.getPath());
                if (resource != null) {
                    path = resource.getLocation();
                }
            } else if (entry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
                if (entry.getSourceAttachmentPath() != null) {
                    path = entry.getSourceAttachmentPath();
                }
            } else if (entry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
                IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(entry.getPath().toString());
                if (project.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
                    getSourcePaths(paths, JavaCore.create(project));
                }
            }
            if (path != null) {
                paths.add(path.toOSString());
            }
        }
    }

    public static String getSourcePaths(IJavaProject javaProject) throws CoreException {
        Set<String> paths = new LinkedHashSet<String>();
        getSourcePaths(paths, javaProject);
        StringBuilder builder = new StringBuilder();
        for (String path : paths) {
            builder.append(path);
            builder.append(":");
        }
        return builder.toString();
    }

    private static byte[] md5(File file) throws IOException {
        InputStream in = new FileInputStream(file);
        try {
            return md5(in);
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    private static byte[] md5(URL url) throws IOException {
        InputStream in = url.openStream();
        try {
            return md5(in);
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    private static byte[] md5(InputStream in) throws IOException {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            throw new Error(e);
        }
        DigestInputStream dis = new DigestInputStream(in, digest);
        IOUtils.copy(dis, new NullOutputStream());
        return digest.digest();
    }

    public static Arch getDefaultArch() {
        return Arch.getDefaultArch();
    }

    public static Arch getArch(String s) {
        if (ARCH_AUTO.equals(s)) {
            return getDefaultArch();
        }
        return Arch.valueOf(s);
    }

    public static OS getDefaultOS() {
        return OS.getDefaultOS();
    }

    public static OS getOS(String s) {
        if (OS_AUTO.equals(s)) {
            return getDefaultOS();
        }
        return OS.valueOf(s);
    }

    public static Config.Builder loadConfig(Config.Builder configBuilder,
            File projectRoot, boolean isTest) {

        try {
            configBuilder.readProjectProperties(projectRoot, isTest);
            configBuilder.readProjectConfig(projectRoot, isTest);
        } catch (IOException e) {
            log(e);
            throw new RuntimeException(e);
        }

        // Ignore classpath entries in config XML file.
        configBuilder.clearBootClasspathEntries();
        configBuilder.clearClasspathEntries();

        return configBuilder;
    }

    private static String now() {
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM);
        return df.format(new Date());
    }

    public static synchronized void consoleDebug(String format, Object... args) {
        if (plugin != null) {
            String msg = String.format(format, args);
            plugin.debugStream.println(now() + ": [DEBUG] " + msg);
            showConsoleIfFirstWrite();
        }
    }

    public static synchronized void consoleInfo(String format, Object... args) {
        if (plugin != null) {
            String msg = String.format(format, args);
            plugin.infoStream.println(now() + ": [ INFO] " + msg);
            showConsoleIfFirstWrite();
        }
    }

    public static synchronized void consoleWarn(String format, Object... args) {
        if (plugin != null) {
            String msg = String.format(format, args);
            plugin.warnStream.println(now() + ": [ WARN] " + msg);
            showConsole();
        }
    }

    public static synchronized void consoleError(String format, Object... args) {
        if (plugin != null) {
            String msg = String.format(format, args);
            plugin.errorStream.println(now() + ": [ERROR] " + msg);
            showConsole();
        }
    }

    private static void showConsoleIfFirstWrite() {
        if (plugin.showConsoleOnWrite) {
            showConsole();
        }
    }

    private static void showConsole() {
        plugin.showConsoleOnWrite = false;
        try {
            IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            if (activeWorkbenchWindow != null) {
                IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
                if (activePage != null) {
                    activePage.showView(IConsoleConstants.ID_CONSOLE_VIEW, null, IWorkbenchPage.VIEW_VISIBLE);
                }
            }
        } catch (PartInitException partEx) {
        }
        ConsolePlugin.getDefault().getConsoleManager().showConsoleView(plugin.console);
    }

    @Override
    protected void initializeImageRegistry(ImageRegistry reg) {
        super.initializeImageRegistry(reg);

        Bundle bundle = plugin.getBundle();

        reg.put(IMAGE_NEW_CONSOLE_PROJECT_BANNER,
                getImageDescriptorFromPath(bundle, "icons/new_robovm_console_project_banner.png"));
        reg.put(IMAGE_NEW_IOS_PROJECT_BANNER,
                getImageDescriptorFromPath(bundle, "icons/new_robovm_ios_project_banner.png"));
        reg.put(IMAGE_NEW_IOS_STORYBOARD_BANNER,
                getImageDescriptorFromPath(bundle, "icons/new_robovm_ios_storyboard_banner.png"));
        reg.put(IMAGE_NEW_IOS_VIEW_CONTROLLER_BANNER,
                getImageDescriptorFromPath(bundle, "icons/new_robovm_ios_view_controller_banner.png"));
        reg.put(IMAGE_NEW_IOS_VIEW_BANNER,
                getImageDescriptorFromPath(bundle, "icons/new_robovm_ios_view_banner.png"));
    }

    private static ImageDescriptor getImageDescriptorFromPath(Bundle bundle, String pathString) {
        IPath path = new Path(pathString);
        URL url = FileLocator.find(bundle, path, null);
        return ImageDescriptor.createFromURL(url);
    }

    @Override
    public void earlyStartup() {
        // nothing to-do here, startup will be called as well.
    }
}
