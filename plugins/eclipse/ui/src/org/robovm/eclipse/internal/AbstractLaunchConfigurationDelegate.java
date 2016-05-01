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

import org.apache.commons.exec.CommandLine;
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
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.compiler.config.Config.Home;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.plugin.Plugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.util.io.Fifos;
import org.robovm.compiler.util.io.OpenOnReadFileInputStream;
import org.robovm.eclipse.RoboVMPlugin;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.VirtualMachineManager;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector.Argument;

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
        launchParameters.setStdoutFifo(Fifos.mkfifo("stdout"));
        launchParameters.setStderrFifo(Fifos.mkfifo("stderr"));
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
            boolean hasDebugPlugin = false;

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
            try {
                configBuilder = new Config.Builder();
            } catch (IOException e) {
                throw new CoreException(new Status(IStatus.ERROR, RoboVMPlugin.PLUGIN_ID,
                        "Launch failed. Check the RoboVM console for more information.", e));
            }
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
                String sourcepaths = RoboVMPlugin.getSourcePaths(javaProject);
                configBuilder.addPluginArgument("debug:sourcepath=" + sourcepaths);
                configBuilder.addPluginArgument("debug:jdwpport=" + debuggerPort);
                configBuilder.addPluginArgument("debug:logdir=" + new File(projectRoot, "robovm-logs").getAbsolutePath());
                // check if we have the debug plugin
                for (Plugin plugin : configBuilder.getPlugins()) {
                    if ("DebugLaunchPlugin".equals(plugin.getClass().getSimpleName())) {
                        hasDebugPlugin = true;
                    }
                }
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
                // launch plugin may proxy stdout/stderr fifo, which
                // it then writes to. Need to save the original fifos
                File stdOutFifo = launchParameters.getStdoutFifo();
                File stdErrFifo = launchParameters.getStderrFifo();
                PipedInputStream pipedIn = new PipedInputStream();
                PipedOutputStream pipedOut = new PipedOutputStream(pipedIn);
                Process process = compiler.launchAsync(launchParameters, pipedIn);
                if (stdOutFifo != null || stdErrFifo != null) {
                    InputStream stdoutStream = null;
                    InputStream stderrStream = null;
                    if (launchParameters.getStdoutFifo() != null) {
                        stdoutStream = new OpenOnReadFileInputStream(stdOutFifo);
                    }
                    if (launchParameters.getStderrFifo() != null) {
                        stderrStream = new OpenOnReadFileInputStream(stdErrFifo);
                    }
                    process = new ProcessProxy(process, pipedOut, stdoutStream, stderrStream, compiler);
                }

                IProcess iProcess = DebugPlugin.newProcess(launch, process, label);
                
                // setup the debugger
                if (ILaunchManager.DEBUG_MODE.equals(mode) && hasDebugPlugin) {
                    VirtualMachine vm = attachToVm(monitor, debuggerPort);
                    // we were canceled
                    if (vm == null) {
                        process.destroy();
                        return;
                    }
                    if (vm instanceof VirtualMachineImpl) {
                        ((VirtualMachineImpl) vm).setRequestTimeout(DEBUGGER_REQUEST_TIMEOUT);
                    }
                    JDIDebugModel.newDebugTarget(launch, vm, mainTypeName + " at localhost:" + debuggerPort, iProcess,
                            true, false, true);
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

    private VirtualMachine attachToVm(IProgressMonitor monitor, int port) throws CoreException {
        VirtualMachineManager manager = Bootstrap.virtualMachineManager();
        AttachingConnector connector = null;
        for (Iterator<?> it = manager.attachingConnectors().iterator(); it.hasNext();) {
            AttachingConnector con = (AttachingConnector) it.next();
            if ("dt_socket".equalsIgnoreCase(con.transport().name())) {
                connector = con;
                break;
            }
        }
        if (connector == null) {
            throw new CoreException(new Status(IStatus.ERROR, RoboVMPlugin.PLUGIN_ID, "Couldn't find socket transport"));
        }
        Map<String, Argument> defaultArguments = connector.defaultArguments();
        defaultArguments.get("hostname").setValue("localhost");
        defaultArguments.get("port").setValue("" + port);
        int retries = 60;
        CoreException exception = null;
        while (retries > 0) {
            try {
                return connector.attach(defaultArguments);
            } catch (Exception e) {
                exception = new CoreException(new Status(IStatus.ERROR, RoboVMPlugin.PLUGIN_ID,
                        "Couldn't connect to JDWP server at localhost:" + port, e));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            if (monitor.isCanceled()) {
                return null;
            }
            retries--;
        }
        throw exception;
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

    private String unquoteArg(String arg) {
        if (arg.startsWith("\"") && arg.endsWith("\"")) {
            return arg.substring(1, arg.length() - 1);
        }
        return arg;
    }

    private List<String> splitArgs(String args) {
        if (args == null || args.trim().length() == 0) {
            return Collections.emptyList();
        }
        String[] parts = CommandLine.parse("foo " + args).toStrings();
        if (parts.length <= 1) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<String>(parts.length - 1);
        for (int i = 1; i < parts.length; i++) {
            result.add(unquoteArg(parts[i]));
        }
        return result;
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

    private static class ProcessProxy extends Process {
        private final Process target;
        private final OutputStream outputStream;
        private final InputStream inputStream;
        private final InputStream errorStream;
        private final AppCompiler appCompiler;
        private volatile boolean cleanedUp = false;

        ProcessProxy(Process target, OutputStream outputStream, InputStream inputStream, InputStream errorStream,
                AppCompiler appCompiler) {
            this.target = target;
            this.outputStream = outputStream;
            this.inputStream = inputStream;
            this.errorStream = errorStream;
            this.appCompiler = appCompiler;
        }

        public void destroy() {
            synchronized(this) {
                if(!cleanedUp) {
                    appCompiler.launchAsyncCleanup();
                    cleanedUp = true;
                }
            }            
            target.destroy();
        }

        public boolean equals(Object obj) {
            return target.equals(obj);
        }

        public int exitValue() {
            return target.exitValue();
        }

        public InputStream getErrorStream() {
            if (errorStream != null) {
                return errorStream;
            }
            return target.getErrorStream();
        }

        public InputStream getInputStream() {
            if (inputStream != null) {
                return inputStream;
            }
            return target.getInputStream();
        }

        public OutputStream getOutputStream() {
            if (outputStream != null) {
                return outputStream;
            }
            return target.getOutputStream();
        }

        public int hashCode() {
            return target.hashCode();
        }

        public String toString() {
            return target.toString();
        }

        public int waitFor() {
            try {
                return target.waitFor();
            } catch (Throwable t) {
                synchronized(this) {
                    if(!cleanedUp) {
                        appCompiler.launchAsyncCleanup();
                        cleanedUp = true;
                    }
                } 
                throw new RuntimeException(t);
            }
        }
    }
}
