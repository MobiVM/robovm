/*
 * Copyright (C) 2013 RoboVM AB
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
package org.robovm.compiler.target.ios;

import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.util.Executor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * {@link Process} which runs in console and redirects io
 */
public class ConsoleLauncherProcess extends AbstractLauncherProcess<LaunchParameters> {
    private final File executable;
    private final PipedInputStream pipedStdOutStream;
    private final PipedInputStream pipedStdErrStream;
    private final PipedOutputStream pipedStdInStream;

    public ConsoleLauncherProcess(Logger log, Listener listener, File executable, LaunchParameters launchParameters) {
        super(log, listener, launchParameters);

        this.executable = executable;
        pipedStdOutStream = new PipedInputStream();
        pipedStdErrStream = new PipedInputStream();
        pipedStdInStream = new PipedOutputStream();
    }

    @Override
    protected int performLaunch() throws IOException {
        File wd = launchParameters.getWorkingDirectory();
        ArrayList<String> arguments = new ArrayList<>(launchParameters.getArguments());
        Map<String, String> env = launchParameters.getEnvironment();

        OutputStream outStream = new PipedOutputStream(pipedStdOutStream);
        OutputStream errStream = new PipedOutputStream(pipedStdErrStream);
        InputStream inStream = new PipedInputStream(pipedStdInStream);
        Executor executor = new Executor(log, executable.getAbsolutePath())
                .args(arguments)
                .wd(wd)
                .inheritEnv(env == null)
                .env(env == null ? Collections.emptyMap() : env)
                .out(outStream)
                .err(errStream)
                .in(inStream)
                .closeOutputStreams(true);

        log.info("Launching console app %s", executable.getAbsolutePath());
        executor.exec();
        return  0;
    }

    @Override
    protected OutputStream getPipeForStdIn() {
        return pipedStdInStream;
    }

    @Override
    protected InputStream getPipeForStdOut() {
        return pipedStdOutStream;
    }

    @Override
    protected InputStream getPipeForStdErr() {
        return pipedStdErrStream;
    }
}
