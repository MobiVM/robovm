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

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.Launchers;
import org.robovm.compiler.target.Launchers.Listener;
import org.robovm.compiler.util.Executor;
import org.robovm.compiler.util.io.NeverCloseInputStream;
import org.robovm.compiler.util.io.NeverCloseOutputStream;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * {@link Process} which runs in console and redirects io
 */
public class ConsoleLauncherProcess extends AbstractLauncherProcess<LaunchParameters> {
    private final File executable;

    private ConsoleLauncherProcess(Builder builder, File executable) {
        super(builder);

        this.executable = executable;
    }

    public static Launchers.CustomizableLauncher createLauncher(Logger log, Listener listener, LaunchParameters launchParameters,
                                                                File executable) {
        return new ConsoleLauncherProcess.Builder(log, listener, launchParameters, executable);
    }

    @Override
    protected int performLaunch() throws IOException {
        File wd = launchParameters.getWorkingDirectory();
        ArrayList<String> arguments = new ArrayList<>(launchParameters.getArguments());
        Map<String, String> env = launchParameters.getEnvironment();

        Executor executor = new Executor(log, executable.getAbsolutePath())
                .args(arguments)
                .wd(wd)
                .inheritEnv(env == null)
                .env(env == null ? Collections.emptyMap() : env)
                .out(out)
                .err(err)
                .in(in)
                .closeOutputStreams(true);

        log.info("Launching console app %s", executable.getAbsolutePath());
        executor.exec();
        return  0;
    }

    public static class Builder extends AbstractLauncherProcess.Builder<LaunchParameters> {
        private final File executable;

        public Builder(Logger log, Listener listener, LaunchParameters launchParameters,
                       File executable) {
            super(log, listener, launchParameters);
            this.executable = executable;
        }

        @Override
        protected AbstractLauncherProcess.Builder<LaunchParameters> duplicate() {
            return new Builder(log, listener, launchParameters, executable);
        }

        @Override
        protected AbstractLauncherProcess<LaunchParameters> createAndSetupThread(boolean async) throws IOException {
            // apply default streams if not configured
            if (async) {
                if (out == null) {
                    PipedInputStream sink = new PipedInputStream();
                    out = new ImmutablePair<>(new PipedOutputStream(sink), sink);
                }
                if (err == null) {
                    PipedInputStream sink = new PipedInputStream();
                    err = new ImmutablePair<>(new PipedOutputStream(sink), sink);
                }
                if (in == null) {
                    PipedOutputStream sink = new PipedOutputStream();
                    in = new ImmutablePair<>(new PipedInputStream(sink), sink);
                }
            } else {
                if (out == null)
                    out = new ImmutablePair<>(new NeverCloseOutputStream(System.out), null);
                if (err == null)
                    err = new ImmutablePair<>(new NeverCloseOutputStream(System.err), null);
                if (in == null)
                    in = new ImmutablePair<>(new NeverCloseInputStream(System.in), null);
            }
            return new ConsoleLauncherProcess(this, executable);
        }

        @Override
        public Launchers.AsyncLauncherBuilder setIn(InputStream in, OutputStream inSink) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Launchers.SyncLauncherBuilder setIn(InputStream in) {
            throw new UnsupportedOperationException();
        }
    }
}
