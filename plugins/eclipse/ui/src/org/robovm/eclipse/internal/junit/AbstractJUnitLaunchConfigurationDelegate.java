/*
 * Copyright (C) 2014 RoboVM AB
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
package org.robovm.eclipse.internal.junit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.junit.launcher.JUnitLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.eclipse.RoboVMPlugin;
import org.robovm.eclipse.internal.AbstractLaunchConfigurationDelegate;

/**
 */
public abstract class AbstractJUnitLaunchConfigurationDelegate extends AbstractLaunchConfigurationDelegate {

    JUnitLauncher jUnitLauncher;
    String[] runnerProgramArgs;
    String[] testClasses;
    
    @Override
    public void launch(final ILaunchConfiguration configuration, final String mode, ILaunch launch, IProgressMonitor monitor)
            throws CoreException {
        
        jUnitLauncher = new JUnitLauncher(new IVMRunner() {
            @Override
            public void run(VMRunnerConfiguration runnerConfig, final ILaunch launch, IProgressMonitor monitor) throws CoreException {
                // Add a bogus IProcess to the launch to trigger the
                // RemoteTestRunnerClient to start listening for a connection.
                final TestRunnerProcess testRunnerProcess = new TestRunnerProcess(launch);
                // Listen for changes to the launch. When the real process is
                // added we remove the TestRunnerProcess since otherwise the
                // launch consoles will linger in the UI.
                DebugPlugin.getDefault().getLaunchManager().addLaunchListener(new ILaunchListener() {
                    public void launchRemoved(ILaunch l) {}
                    public void launchChanged(ILaunch l) {
                        if (l.getProcesses().length == 2 && Arrays.asList(l.getProcesses()).contains(testRunnerProcess)) {
                            l.removeProcess(testRunnerProcess);
                            DebugPlugin.getDefault().getLaunchManager().removeLaunchListener(this);
                        }
                    }
                    public void launchAdded(ILaunch launch) {}
                });
                launch.addProcess(testRunnerProcess);
                processArgs(runnerConfig.getProgramArguments());
                superLaunch(configuration, mode, launch, monitor);
            }
        });
        
        jUnitLauncher.launch(configuration, mode, launch, monitor);
    }
    
    /**
     * Extracts the test class names from the RemoteTestRunner arguments. Also
     * converts -testnamefile arguments to -classNames since the file with the
     * test names will not be available if we launch on a device.
     */
    @SuppressWarnings("unchecked")
    private void processArgs(String[] args) throws CoreException {
        List<String> classes = new ArrayList<>();
        List<String> modifiedArgs = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            String arg = args[i].toLowerCase();
            if ("-test".equals(arg)) {
                // -test <class>:<method>
                String v = args[++i];
                classes.add(v.substring(0, v.indexOf(':')));
                modifiedArgs.add("-test");
                modifiedArgs.add(v);
            } else if ("-classnames".equals(arg) || "-classname".equals(arg)) {
                // -classnames <class1> <class2> ...
                i++;
                while (i < args.length && args[i].charAt(0) != '-') {
                    classes.add(args[i++]);
                }
                modifiedArgs.add("-classNames");
                modifiedArgs.addAll(classes);
            } else if ("-testnamefile".equals(arg)) {
                try {
                    classes.addAll((List<String>) FileUtils.readLines(new File(args[++i])));
                } catch (IOException e) {
                    throw new CoreException(new Status(IStatus.ERROR, RoboVMPlugin.PLUGIN_ID, "", e));
                }
                // Convert to -classNames <class1> <class2> ...
                modifiedArgs.add("-classNames");
                modifiedArgs.addAll(classes);
            } else {
                modifiedArgs.add(args[i]);
            }
        }
        this.runnerProgramArgs = modifiedArgs.toArray(new String[modifiedArgs.size()]);
        this.testClasses = classes.toArray(new String[classes.size()]);
    }
    
    private void superLaunch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
            throws CoreException {

        super.launch(configuration, mode, launch, monitor);
    }
    
    @Override
    public String verifyMainTypeName(ILaunchConfiguration configuration) throws CoreException {
        return jUnitLauncher.verifyMainTypeName(configuration);
    }
    
    public String[] getClasspath(ILaunchConfiguration configuration) throws CoreException {
        return jUnitLauncher.getClasspath(configuration);
    }

    public String getMainTypeName(ILaunchConfiguration configuration) throws CoreException {
        // getMainTypeName() returns the test class. We want the
        // RemoteTestRunner which is returned by verifyMainTypeName()
        return jUnitLauncher.verifyMainTypeName(configuration);
    }

    public String getProgramArguments(ILaunchConfiguration configuration) throws CoreException {
        StringBuilder sb = new StringBuilder(jUnitLauncher.getProgramArguments(configuration));
        if (runnerProgramArgs.length > 0) {
            for (String arg : runnerProgramArgs) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append('"').append(arg).append('"');
            }
        }
        return sb.toString();
    }

    public String getVMArguments(ILaunchConfiguration configuration) throws CoreException {
        return jUnitLauncher.getVMArguments(configuration);
    }

    public IJavaProject verifyJavaProject(ILaunchConfiguration configuration) throws CoreException {
        return jUnitLauncher.verifyJavaProject(configuration);
    }

    public IVMInstall verifyVMInstall(ILaunchConfiguration configuration) throws CoreException {
        return jUnitLauncher.verifyVMInstall(configuration);
    }

    public File verifyWorkingDirectory(ILaunchConfiguration configuration) throws CoreException {
        return jUnitLauncher.verifyWorkingDirectory(configuration);
    }

    @Override
    protected boolean isTestConfiguration() {
        return true;
    }

    @Override
    protected Builder configure(Builder configBuilder, ILaunchConfiguration configuration, String mode)
            throws IOException, CoreException {

        configBuilder.addForceLinkClass("org.eclipse.jdt.**");
        for (String c : testClasses) {
            configBuilder.addForceLinkClass(c);
        }
        
        return configBuilder;
    }

    private static class JUnitLauncher extends JUnitLaunchConfigurationDelegate {
        private final IVMRunner runner;
        
        JUnitLauncher(IVMRunner runner) {
            this.runner = runner;
        }
        
        @Override
        public IVMRunner getVMRunner(ILaunchConfiguration configuration, String mode) throws CoreException {
            return runner;
        }
    }

    private static class TestRunnerProcess implements IProcess {
        private final ILaunch launch;
        private boolean terminated = false;

        public TestRunnerProcess(ILaunch launch) {
            this.launch = launch;
        }
        
        @Override
        public boolean canTerminate() {
            return true;
        }

        @Override
        public boolean isTerminated() {
            return terminated;
        }

        @Override
        public void terminate() throws DebugException {
            terminated = true;
        }

        @Override
        public Object getAdapter(Class adapter) {
            return null;
        }

        @Override
        public String getLabel() {
            return "";
        }

        @Override
        public ILaunch getLaunch() {
            return launch;
        }

        @Override
        public IStreamsProxy getStreamsProxy() {
            return null;
        }

        @Override
        public void setAttribute(String key, String value) {}

        @Override
        public String getAttribute(String key) {
            return null;
        }

        @Override
        public int getExitValue() throws DebugException {
            return 0;
        }
    }
}
