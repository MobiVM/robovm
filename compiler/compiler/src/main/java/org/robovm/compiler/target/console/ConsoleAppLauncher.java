/*
 * Copyright (C) 2025 The MobiVM Contributors
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
package org.robovm.compiler.target.console;

import org.robovm.compiler.launcher.Launcher;
import org.robovm.compiler.launcher.LauncherConnections;
import org.robovm.compiler.launcher.ProcessProxy;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.Executor;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Launcher for console application.
 * Just delegates to Executor, setup debugger if required
 */
public class ConsoleAppLauncher implements Launcher {
    private final Logger log;
    private final File executable;
    private final ConsoleLaunchParameters launchParameters;

    public ConsoleAppLauncher(Logger log, File executable, ConsoleLaunchParameters launchParameters) {
        this.log = log;
        this.executable = executable;
        this.launchParameters = launchParameters;
    }

    @Override
    public Process launchAsync() throws IOException {
        // check if ProcessProxy is required:
        // - there should be a listener for launch events
        // - or there should be observer for stdout/stderr
        boolean needsProcessProxy = launchParameters.getLauncherListener() != null ||
            !launchParameters.getStdoutChain().isEmpty() ||
            !launchParameters.getStderrChain().isEmpty();

        List<String> arguments = new ArrayList<>(launchParameters.getArguments(true));
        Map<String, String> env = launchParameters.getEnvironment();
        File wd = launchParameters.getWorkingDirectory();
        Executor executor = new Executor(log, executable.getAbsolutePath())
            .args(arguments)
            .wd(wd)
            .inheritEnv(env == null)
            .env(env == null ? Collections.emptyMap() : env);

        if (needsProcessProxy) {
            // Streams where ProxyProcess will read from
            InputStream inputOutStream = launchParameters.getStdoutChain().getOutboundAsInput();
            InputStream inputErrStream = launchParameters.getStderrChain().getOutboundAsInput();
            PipedOutputStream outInStream = new PipedOutputStream();
            ProcessProxy.ProcessTask task = () -> {
                OutputStream outStream = launchParameters.getStdoutChain().getInbound();
                OutputStream errStream = launchParameters.getStderrChain().getInbound();
                InputStream inputStream = new PipedInputStream(outInStream);

                Process process = executor
                    .in(inputStream).out(outStream).err(errStream)
                    .closeOutputStreams(true)
                    .execAsync();

                Launcher.Listener launcherListener = launchParameters.getLauncherListener();
                if (launcherListener != null)
                    launcherListener.onLaunched(new LaunchedTarget(process));

                int exitCode;
                try {
                    exitCode = process.waitFor();
                } catch (InterruptedException e) {
                    // interrupted while waitFor, means cancel was requested by users, return 0 as exit code
                    process.destroy();
                    exitCode = 0;
                }
                return exitCode;
            };
            return ProcessProxy.singleThread(
                inputOutStream,
                inputErrStream,
                outInStream,
                launchParameters.getLauncherListener(),
                task
            );

        } else {
            // can run directly without ProcessProxy, just run and return process
            return executor.execAsync();
        }
    }

    /**
     * Launcher.Target implementation for locally launched apps
     */
    private static class LaunchedTarget implements Launcher.Target {
        final Process process;

        LaunchedTarget(Process process) {
            this.process = process;
        }

        @Override
        public Connection createConnection() throws IOException {
            try {
                return new LauncherConnections.SocketConnection("127.0.0.1");
            } catch (Exception e) {
                throw new IOException(e);
            }
        }

        @Override
        public void terminate() {
            process.destroy();
        }
    }
}
