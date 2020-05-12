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

import org.apache.commons.io.output.NullOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.libimobiledevice.util.AppLauncher;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * {@link Process} implementation which runs an app on a device using an
 * {@link AppLauncher}.
 */
public class AppLauncherProcess extends AbstractLauncherProcess<LaunchParameters> {
    private final AppLauncher launcher;
    private final NullOutputStream stdInStream = new NullOutputStream();
    private final WaitInputStream stdErrStream = new WaitInputStream();
    private final PipedInputStream pipedStdOutStream = new PipedInputStream();

    public AppLauncherProcess(Logger log, Listener listener, AppLauncher launcher, LaunchParameters launchParameters) {
        super(log, listener, launchParameters);
        this.launcher = launcher;
    }

    @Override
    protected int performLaunch() throws IOException {
        launcher.install();
        launcher.stdout(new PipedOutputStream(pipedStdOutStream));
        return launcher.launch();
    }

    @Override
    protected OutputStream getPipeForStdIn() {
        return stdInStream ;
    }

    @Override
    protected InputStream getPipeForStdOut() {
        return pipedStdOutStream;
    }

    @Override
    protected InputStream getPipeForStdErr() {
        return stdErrStream;
    }
}
