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

import org.robovm.compiler.CompilerException;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.Launcher;
import org.robovm.compiler.util.Executor;
import org.robovm.compiler.util.io.OpenOnWriteFileOutputStream;
import org.robovm.debugger.hooks.IHooksConnection;
import org.robovm.debugger.utils.IHooksConnectionUtils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Launcher for console application.
 * Just delegates to Executor, setup debugger if required
 */
public class ConsoleLauncherProcess implements Launcher {
    private final Logger log;
    private final File executable;
    private final ConsoleLaunchParameters launchParameters;

    public ConsoleLauncherProcess(Logger log, File executable, ConsoleLaunchParameters launchParameters) {
        this.log = log;
        this.executable = executable;
        this.launchParameters = launchParameters;
    }

    @Override
    public Process execAsync() throws IOException {
        // provide debugger connection information if it was requested
        // has to be done before argument list is built
        setupDebuggerConnection();

        List<String> arguments = new ArrayList<>(launchParameters.getArguments(true));
        Map<String, String> env = launchParameters.getEnvironment();
        File wd = launchParameters.getWorkingDirectory();
        OutputStream errStream = System.out;
        OutputStream outStream = System.err;
        if (launchParameters.getStdoutFifo() != null) {
            outStream = new OpenOnWriteFileOutputStream(launchParameters.getStdoutFifo());
        }
        if (launchParameters.getStderrFifo() != null) {
            errStream = new OpenOnWriteFileOutputStream(launchParameters.getStderrFifo());
        }

        return new Executor(log, executable.getAbsolutePath())
                .args(arguments)
                .wd(wd)
                .inheritEnv(env == null)
                .out(outStream).err(errStream).closeOutputStreams(true)
                .env(env == null ? Collections.emptyMap() : env)
                .execAsync();
    }

    /**
     * setups additional debug parameters, shall be called BEFORE arguments are extracted from launch params
     */
    private void setupDebuggerConnection() {
        IHooksConnectionUtils.DelegatingFuture<IHooksConnection> requestFuture = launchParameters.getRequestForDebuggerConnection();
        if (requestFuture == null) return;

        // launching on simulator, it can write down port number to file on local system
        File hooksPortFile;
        try {
            hooksPortFile = File.createTempFile("robovm-dbg-console", ".port");
        } catch (IOException e) {
            throw new CompilerException("Failed to create debugger port file", e);
        }
        launchParameters.getArguments().add("-rvm:PrintDebugPort=" + hooksPortFile.getAbsolutePath());

        // provide future to debugger
        Future<IHooksConnection> connectionFuture = IHooksConnectionUtils.waitForPortFromFile(hooksPortFile)
                .thenApply(IHooksConnectionUtils.SocketHooksConnection::new);
        requestFuture.setDelegate(connectionFuture);
    }
}
