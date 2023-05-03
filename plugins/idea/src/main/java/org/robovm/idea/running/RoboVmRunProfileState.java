/*
 * Copyright (C) 2015 RoboVM AB
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
package org.robovm.idea.running;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.process.ColoredProcessHandler;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.process.SelfKiller;
import com.intellij.execution.runners.ExecutionEnvironment;
import org.jetbrains.annotations.NotNull;
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.ios.DeviceType;
import org.robovm.compiler.target.ios.IOSDeviceLaunchParameters;
import org.robovm.compiler.target.ios.IOSSimulatorLaunchParameters;
import org.robovm.compiler.util.io.Fifos;
import org.robovm.compiler.util.io.OpenOnReadFileInputStream;
import org.robovm.idea.RoboVmPlugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class RoboVmRunProfileState extends CommandLineState {
    public RoboVmRunProfileState(ExecutionEnvironment environment) {
        super(environment);
    }

    protected ProcessHandler executeRun() throws Throwable {
        RunnerAndConfigurationSettings runnerAndConfigurationSettings = getEnvironment().getRunnerAndConfigurationSettings();
        if (runnerAndConfigurationSettings == null)
            throw new ExecutionException("RoboVmRunConfiguration is missing");
        RoboVmRunConfiguration runConfig = (RoboVmRunConfiguration) runnerAndConfigurationSettings.getConfiguration();
        Config config = runConfig.getConfig();
        AppCompiler compiler = runConfig.getCompiler();
        runConfig.setConfig(null);
        runConfig.setCompiler(null);
        RoboVmPlugin.logInfo(getEnvironment().getProject(), "Launching executable");

        LaunchParameters launchParameters = config.getTarget().createLaunchParameters();
        customizeLaunchParameters(runConfig, config, launchParameters);
        launchParameters.setArguments(runConfig.getProgramArguments());

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

        final OSProcessHandler processHandler = new ColoredProcessHandler(process, null);
        ProcessTerminatedListener.attach(processHandler);
        return processHandler;
    }

    protected void customizeLaunchParameters(RoboVmRunConfiguration runConfig, Config config, LaunchParameters launchParameters) throws IOException, ExecutionException {
        launchParameters.setStdoutFifo(Fifos.mkfifo("stdout"));
        launchParameters.setStderrFifo(Fifos.mkfifo("stderr"));

        if (config.getOs() != OS.ios) {
            if (runConfig.getWorkingDir() != null && !runConfig.getWorkingDir().isEmpty()) {
                launchParameters.setWorkingDirectory(new File(runConfig.getWorkingDir()));
            }
        } else {
            if (launchParameters instanceof IOSSimulatorLaunchParameters) {
                IOSSimulatorLaunchParameters simParams = (IOSSimulatorLaunchParameters) launchParameters;
                // finding exact simulator to run at
                DeviceType exactType = RoboVmRunConfigurationUtils.getSimulator(runConfig);
                if (exactType == null)
                    throw new ExecutionException("Simulator type is not set or is not available anymore!");
                simParams.setDeviceType(exactType);
                simParams.setPairedWatchAppName(config.getWatchKitApp() != null && runConfig.simulatorLaunchWatch()
                        ? config.getWatchKitApp().getWatchAppName() : null);
            } else if (launchParameters instanceof IOSDeviceLaunchParameters) {
                IOSDeviceLaunchParameters deviceParams = (IOSDeviceLaunchParameters) launchParameters;
                deviceParams.setDeviceId(runConfig.getTargetDeviceUDID());
            }
        }
    }

    @NotNull
    @Override
    protected ProcessHandler startProcess() throws ExecutionException {
        try {
            if (getEnvironment().getExecutor().getId().equals(RoboVmRunner.RUN_EXECUTOR)) {
                return executeRun();
            } else if (getEnvironment().getExecutor().getId().equals(RoboVmRunner.DEBUG_EXECUTOR)) {
                return executeRun();
            } else {
                throw new ExecutionException("Unsupported executor " + getEnvironment().getExecutor().getId());
            }
        } catch (Throwable t) {
            RoboVmPlugin.logErrorThrowable(getEnvironment().getProject(), "Couldn't start application", t, true);
            throw new ExecutionException(t);
        }
    }

    private static class ProcessProxy extends Process implements SelfKiller {
        private final Process target;
        private final OutputStream outputStream;
        private final InputStream inputStream;
        private final InputStream errorStream;
        private AppCompiler appCompiler;
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
            synchronized (this) {
                if (!cleanedUp) {
                    if (appCompiler != null) {
                        appCompiler.launchAsyncCleanup();
                        appCompiler = null;
                    }
                    cleanedUp = true;
                }
            }
            target.destroy();
        }

        @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
        public boolean equals(Object obj) {
            return target.equals(obj);
        }

        public int exitValue() {
            int exitValue = target.exitValue();
            synchronized (this) {
                if (appCompiler != null && !cleanedUp) {
                    appCompiler.launchAsyncCleanup();
                    appCompiler = null;
                    cleanedUp = true;
                }
            }
            return exitValue;
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
                synchronized (this) {
                    if (!cleanedUp) {
                        if (appCompiler != null) {
                            appCompiler.launchAsyncCleanup();
                        }
                        cleanedUp = true;
                    }
                    appCompiler = null;
                }
                throw new RuntimeException(t);
            }
        }
    }
}
