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
package org.robovm.eclipse.internal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.ServerSocket;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.jdi.Bootstrap;
import org.eclipse.jdi.internal.VirtualMachineImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IVMConnector;
import org.eclipse.jdt.launching.JavaRuntime;
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.compiler.config.Config.Home;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.launcher.LaunchParameters;
import org.robovm.compiler.launcher.LauncherUtils;
import org.robovm.compiler.plugin.Plugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.eclipse.RoboVMPlugin;


/**
 *
 */
@SuppressWarnings("restriction")
public abstract class AbstractLaunchConfigurationDelegate extends AbstractJavaLaunchConfigurationDelegate {

    /**
     * Timeout in ms used by the debugger when waiting for responses from the debugee.
     */
    private static final int DEBUGGER_REQUEST_TIMEOUT = 15 * 1000;

    protected abstract Arch getArch(ILaunchConfiguration configuration, String mode) throws CoreException;

    protected abstract OS getOS(ILaunchConfiguration configuration, String mode) throws CoreException;

    protected abstract Config.Builder configure(Config.Builder configBuilder, ILaunchConfiguration configuration, String mode)
            throws IOException, CoreException;

    protected void customizeLaunchParameters(Config config, LaunchParameters launchParameters, ILaunchConfiguration configuration,
            String mode) throws IOException, CoreException {
    }

    protected boolean isTestConfiguration() {
        return false;
    }

    @Override
    public void launch(ILaunchConfiguration configuration, String mode,
            ILaunch launch, IProgressMonitor monitor) throws CoreException {

        if (monitor == null) {
            monitor = new NullProgressMonitor();
        }

        monitor.beginTask(configuration.getName() + "...", 6);
        if (monitor.isCanceled()) {
            return;
        }

        try {
            monitor.subTask("Verifying launch attributes");

            String mainTypeName = getMainTypeName(configuration);
            File workingDir = getWorkingDirectory(configuration);
            String[] envp = getEnvironment(configuration);
            List<String> pgmArgs = splitArgs(getProgramArguments(configuration));
            List<String> vmArgs = splitArgs(getVMArguments(configuration));
            String[] classpath = getClasspath(configuration);
            String[] bootclasspath = getBootpath(configuration);
            IJavaProject javaProject = getJavaProject(configuration);
            int debuggerPort = findFreePort();

            if (monitor.isCanceled()) {
                return;
            }

            // Verification done
            monitor.worked(1);

            RoboVMPlugin.consoleInfo("Building executable");

            monitor.subTask("Creating source locator");
            setDefaultSourceLocator(launch, configuration);
            monitor.worked(1);

            monitor.subTask("Creating build configuration");
            Config.Builder configBuilder;
            configBuilder = new Config.Builder();
            configBuilder.logger(RoboVMPlugin.getConsoleLogger());

            File projectRoot = getJavaProject(configuration).getProject().getLocation().toFile();
            RoboVMPlugin.loadConfig(configBuilder, projectRoot, isTestConfiguration());

            Arch arch = getArch(configuration, mode);
            OS os = getOS(configuration, mode);

            configBuilder.os(os);
            configBuilder.arch(arch);

            File tmpDir = RoboVMPlugin.getBuildDir(getJavaProjectName(configuration));
            tmpDir = new File(tmpDir, configuration.getName());
            tmpDir = new File(new File(tmpDir, os.toString()), arch.toString());
            if (mainTypeName != null) {
                tmpDir = new File(tmpDir, mainTypeName);
            }

            if (ILaunchManager.DEBUG_MODE.equals(mode)) {
                configBuilder.debug(true);
                
                File logDir = new File(projectRoot, "robovm-logs");
                logDir.mkdirs();
                                
                String sourcepaths = RoboVMPlugin.getSourcePaths(javaProject);
                configBuilder.addPluginArgument("debug:sourcepath=" + sourcepaths);
                configBuilder.addPluginArgument("debug:jdwpport=" + debuggerPort);
                configBuilder.addPluginArgument("debug:logdir=" + logDir.getAbsolutePath());
                configBuilder.addPluginArgument("debug:clientmode=false");
                configBuilder.addPluginArgument("debug:logconsole=true");
            }

            if (bootclasspath != null) {
                configBuilder.skipRuntimeLib(true);
                for (String p : bootclasspath) {
                    configBuilder.addBootClasspathEntry(new File(p));
                }
            }
            for (String p : classpath) {
                configBuilder.addClasspathEntry(new File(p));
            }
            if (mainTypeName != null) {
                configBuilder.mainClass(mainTypeName);
            }
            // we need to filter those vm args that belong to plugins
            // in case of iOS run configs, we can only pass program args
            filterPluginArguments(vmArgs, configBuilder);
            filterPluginArguments(pgmArgs, configBuilder);

            configBuilder.tmpDir(tmpDir);
            configBuilder.skipInstall(true);

            Config config = null;
            AppCompiler compiler = null;
            try {
                RoboVMPlugin.consoleInfo("Cleaning output dir " + tmpDir.getAbsolutePath());
                FileUtils.deleteDirectory(tmpDir);
                tmpDir.mkdirs();

                Home home = RoboVMPlugin.getRoboVMHome();
                if (home.isDev()) {
                    configBuilder.useDebugLibs(true);
                    configBuilder.dumpIntermediates(true);
                }
                configBuilder.home(home);
                config = configure(configBuilder, configuration, mode).build();
                compiler = new AppCompiler(config);
                if (monitor.isCanceled()) {
                    return;
                }
                monitor.worked(1);

                monitor.subTask("Building executable");
                AppCompilerThread thread = new AppCompilerThread(compiler, monitor);
                thread.compile();
                if (monitor.isCanceled()) {
                    RoboVMPlugin.consoleInfo("Build canceled");
                    return;
                }
                monitor.worked(1);
                RoboVMPlugin.consoleInfo("Build done");
            } catch (InterruptedException e) {
                RoboVMPlugin.consoleInfo("Build canceled");
                return;
            } catch (IOException e) {
                RoboVMPlugin.consoleError("Build failed");
                throw new CoreException(new Status(IStatus.ERROR, RoboVMPlugin.PLUGIN_ID,
                        "Build failed. Check the RoboVM console for more information.", e));
            }

            try {
                RoboVMPlugin.consoleInfo("Launching executable");
                monitor.subTask("Launching executable");
                mainTypeName = config.getMainClass();

                List<String> runArgs = new ArrayList<String>();
                runArgs.addAll(vmArgs);
                runArgs.addAll(pgmArgs);
                LaunchParameters launchParameters = config.getTarget().createLaunchParameters();
                launchParameters.setArguments(runArgs);
                launchParameters.setWorkingDirectory(workingDir);
                launchParameters.setEnvironment(envToMap(envp));
                customizeLaunchParameters(config, launchParameters, configuration, mode);
                String label = String.format("%s (%s)", mainTypeName,
                        DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(new Date()));
                
                Process process = compiler.launchAsync(launchParameters);
                IProcess iProcess = DebugPlugin.newProcess(launch, process, label);
                
                // setup the debugger
                if (ILaunchManager.DEBUG_MODE.equals(mode)) {
                	try {
                		attachToVm(monitor, debuggerPort, launch);
                	} catch (Exception e) {
                        process.destroy();
                        throw e;
                	}
                }
                RoboVMPlugin.consoleInfo("Launch done");

                if (monitor.isCanceled()) {
                    process.destroy();
                    return;
                }
                monitor.worked(1);
            } catch (Throwable t) {
                RoboVMPlugin.consoleError("Launch failed");
                throw new CoreException(new Status(IStatus.ERROR, RoboVMPlugin.PLUGIN_ID,
                        "Launch failed. Check the RoboVM console for more information.", t));
            }

        } finally {
            monitor.done();
        }
    }

    private void filterPluginArguments(List<String> args, Builder configBuilder) {
        Map<String, PluginArgument> pluginArguments = configBuilder.fetchPluginArguments();
        Iterator<String> iter = args.iterator();
        while (iter.hasNext()) {
            String arg = iter.next();
            if (!arg.startsWith("-rvm") && arg.startsWith("-")) {
                String argName = arg.substring(1);
                if (argName.contains("=")) {
                    argName = argName.substring(0, argName.indexOf('='));
                }
                PluginArgument pluginArg = pluginArguments.get(argName);
                if (pluginArg != null) {
                    configBuilder.addPluginArgument(arg.substring(1));
                    iter.remove();
                }
            }
        }        
    }

    private void attachToVm(IProgressMonitor monitor, int port,  ILaunch launch) throws CoreException {
    	IVMConnector connector = JavaRuntime.getVMConnector(IJavaLaunchConfigurationConstants.ID_SOCKET_ATTACH_VM_CONNECTOR);
        if (connector == null) {
            throw new CoreException(new Status(IStatus.ERROR, RoboVMPlugin.PLUGIN_ID, "Socket attaching connector not found"));
        }

        Map<String, String> connectMap = new HashMap<>();
        connectMap.put("hostname", "localhost");
        connectMap.put("port", String.valueOf(port));
        connectMap.put("timeout", String.valueOf(DEBUGGER_REQUEST_TIMEOUT));
        
        boolean connected = false;
        CoreException lastException = null;
        int retries = 60;

        while (retries > 0 && !monitor.isCanceled()) {
            try {
                // This single call attaches to the VM, creates the JDIDebugTarget, 
                // and wires it to the Eclipse Debug view automatically!
                connector.connect(connectMap, monitor, launch);
                connected = true;
                break;
            } catch (CoreException e) {
                lastException = e;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            retries--;
        }

        if (!connected || monitor.isCanceled()) {
            if (lastException != null && !monitor.isCanceled()) {
                throw lastException;
            }
            return;
        }
    }

    private Map<String, String> envToMap(String[] envp) throws IOException {
        if (envp == null) {
            return Collections.emptyMap();
        }
        Map<String, String> result = new HashMap<String, String>();
        for (int i = 0; i < envp.length; i++) {
            int index = envp[i].indexOf('=');
            if (index != -1) {
                result.put(envp[i].substring(0, index), envp[i].substring(index + 1));
            }
        }
        return result;
    }

    private List<String> splitArgs(String args) {
        if (args == null || args.trim().length() == 0) {
            return Collections.emptyList();
        }
        List<String> parts = LauncherUtils.splitCommandLine(args);
        if (parts.isEmpty()) {
            return Collections.emptyList();
        }
        return parts;
    }

    public int findFreePort()
    {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(0);
            return socket.getLocalPort();
        } catch (IOException localIOException2) {
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException localIOException4) {
                }
            }
        }
        return -1;
    }
}
