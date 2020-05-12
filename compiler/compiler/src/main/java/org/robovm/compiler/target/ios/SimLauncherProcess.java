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
import org.robovm.compiler.util.Executor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link Process} implementation which runs an app on a simulator using an
 * simctl
 */
public class SimLauncherProcess extends AbstractLauncherProcess<IOSSimulatorLaunchParameters> {
    private final PipedInputStream pipedStdOutStream = new PipedInputStream();
    private final PipedInputStream pipedStdErrStream = new PipedInputStream();
    private final NullOutputStream stdInStream = new NullOutputStream();
    private final File appDir;
    private final String bundleId;

    public SimLauncherProcess(Logger log, Listener listener, File appDir, String bundleId, IOSSimulatorLaunchParameters launchParameters) {
        super(log, listener, launchParameters);

        this.appDir = appDir;
        this.bundleId = bundleId;
    }

    @Override
    protected int performLaunch() throws IOException {
        DeviceType deviceType = launchParameters.getDeviceType();
        File wd = launchParameters.getWorkingDirectory();
        ArrayList<String> arguments = new ArrayList<>(launchParameters.getArguments());
        Map<String, String> env = null;
        if (launchParameters.getEnvironment() != null) {
            env = new HashMap<>();
            for (Map.Entry<String, String> entry : launchParameters.getEnvironment().entrySet()) {
                env.put("SIMCTL_CHILD_" + entry.getKey(), entry.getValue());
            }
        }

        Executor executor;
        if ("shutdown".equals(deviceType.getState(true).toLowerCase())) {
            log.info("Booting simulator %s", deviceType.getUdid());
            executor = new Executor(log, "xcrun");
            executor.args("simctl", "boot", deviceType.getUdid());
            executor.exec();
        }

        // bringing simulator to front (and showing it if it was just booted)
        log.info("Showing simulator %s", deviceType.getUdid());
        executor = new Executor(log, "open");
        executor.args("-a", "Simulator", "--args", "-CurrentDeviceUDID", deviceType.getUdid());
        executor.exec();

        log.info("Deploying app %s to simulator %s", appDir.getAbsolutePath(),
                deviceType.getUdid());
        executor = new Executor(log, "xcrun");
        executor.args("simctl", "install", deviceType.getUdid(), appDir.getAbsolutePath());
        executor.exec();

        log.info("Launching app %s on simulator %s", appDir.getAbsolutePath(),
                deviceType.getUdid());
        executor = new Executor(log, "xcrun");
        List<Object> args = new ArrayList<>();
        args.add("simctl");
        args.add("launch");
        args.add("--console");
        args.add(deviceType.getUdid());
        args.add(bundleId);
        args.addAll(arguments);
        executor.args(args);

        if (env != null) {
            executor.env(env);
        }

        OutputStream outStream = new PipedOutputStream(pipedStdOutStream);
        OutputStream errStream = new PipedOutputStream(pipedStdErrStream);
        executor.wd(wd).out(outStream).err(errStream).closeOutputStreams(true).inheritEnv(false);
        executor.exec();
        return  0;
    }

    @Override
    protected OutputStream getPipeForStdIn() {
        // no input stream for IOS
        return stdInStream;
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
