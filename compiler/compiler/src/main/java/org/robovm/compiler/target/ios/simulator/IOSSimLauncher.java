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
package org.robovm.compiler.target.ios.simulator;

import org.robovm.compiler.launcher.Launcher;
import org.robovm.compiler.launcher.LauncherConnections;
import org.robovm.compiler.launcher.ProcessProxy;
import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.Executor.ExecuteException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * {@link Launcher} implementation which runs an app on a simulator using simctl
 */
public class IOSSimLauncher implements Launcher {
    private final Logger log;
    private final String bundleId;
    private final File appDir;
    private final IOSSimulatorLaunchParameters launchParameters;


    public IOSSimLauncher(Logger log, File appDir, String bundleId, IOSSimulatorLaunchParameters launchParameters) {
        this.log = log;
        this.appDir = appDir;
        this.bundleId = bundleId;
        this.launchParameters = launchParameters;
    }

    @Override
    public Process launchAsync() throws IOException {
        // TODO: it is wrong to do deploy in launch phase due this it to happen in separate thread
        //       it means we can't optimize streams and have to go through
        //       PipedOutputStream/PipedInputStream with ProxyProcess that is being set with
        //       target process lately (once all deploys etc are complete)

        // Streams where ProxyProcess will read from
        InputStream inputOutStream = launchParameters.getStdoutChain().getOutboundAsInput();
        InputStream inputErrStream = launchParameters.getStderrChain().getOutboundAsInput();

        // FIXME: there is install/deployment is pending, can't return just a process. Wrap to proxy and
        //        perform setup before launching in it
        ProcessProxy.ProcessTask task = () -> internalLaunch(launchParameters);
        return ProcessProxy.singleThread(
            inputOutStream,
            inputErrStream,
            null,
            launchParameters.getLauncherListener(),
            task
        );
    }

    /**
     * Performs actual launch of the app on simulator, deploys to paired watch if required. This is called in separate thread by ProcessProxy
     */
    private int internalLaunch(IOSSimulatorLaunchParameters launchParameters) throws Exception {
        DeviceType deviceType = launchParameters.getDeviceType();
        String watchAppName = launchParameters.getPairedWatchAppName();
        List<String> arguments = new ArrayList<>(launchParameters.getArguments(true));
        Map<String, String> env = launchParameters.getEnvironment();
        if (env == null) {
            env = new HashMap<>();
        }
        // from LLVM project:
        //    We want to make sure that OS_ACTIVITY_DT_MODE is set so that we get
        //    os_log and NSLog messages mirrored to the target process stderr.
        env.put("OS_ACTIVITY_DT_MODE", "enabled");

        // preparation: booting simulator if required, deploying app to it and to paired watch if required
        try {
            DeviceType freshState = SimCtl.refresh(deviceType);
            if (freshState != null && "shutdown".equalsIgnoreCase(freshState.getState())) {
                log.info("Booting simulator %s", deviceType.getUdid());
                SimCtl.boot(log, deviceType.getUdid());
            }

            // bringing simulator to front (and showing it if it was just booted)
            log.info("Showing simulator %s", deviceType.getUdid());
            SimCtl.show(log, deviceType.getUdid());

            log.info("Deploying app %s to simulator %s", appDir.getAbsolutePath(),
                    deviceType.getUdid());
            SimCtl.install(log, deviceType.getUdid(), appDir.getAbsolutePath());

            // launch and deploy to paired watch simulator
            if (watchAppName != null && freshState != null  && freshState.getPair() != null) {
                DeviceType watchDeviceType = freshState.getPair();
                if ("shutdown".equalsIgnoreCase(watchDeviceType.getState())) {
                    log.info("Booting watch simulator %s", watchDeviceType.getUdid());
                    SimCtl.boot(log, watchDeviceType.getUdid());
                }

                // bringing simulator to front (and showing it if it was just booted)
                log.info("Showing watch simulator %s", watchDeviceType.getUdid());
                SimCtl.show(log,  watchDeviceType.getUdid());

                File watchAppDir = new File(appDir, "Watch/" + watchAppName);
                log.info("Deploying app %s to watch simulator %s", watchAppDir.getAbsolutePath(),
                        watchDeviceType.getUdid());
                SimCtl.install(log, watchDeviceType.getUdid(), watchAppDir.getAbsolutePath());
            }
        } catch (ExecuteException e) {
            int exitCode = e.getExitCode();
            // if process is interrupted replace with 0 otherwise constant will look odd in console output
            if (exitCode == ExecuteException.INTERRUPTED_EXIT_CODE) return 0;
            throw e;
        } catch (Throwable t) {
            log.error("AppLauncher failed with an exception: %s", t.getMessage());
            t.printStackTrace(new PrintStream(new ErrorOutputStream(log), true));
            throw t;
        }

        // actual launch
        Process process = null;
        try {
            log.info("Launching app %s on simulator %s", appDir.getAbsolutePath(),
                deviceType.getUdid());
            OutputStream outStream = launchParameters.getStdoutChain().getInbound();
            OutputStream errStream = launchParameters.getStderrChain().getInbound();
            process = SimCtl.launchAsync(log, deviceType.getUdid(), bundleId, arguments, env, outStream, errStream);

            // deliver onLaunched event to allow debugger to attach
            Launcher.Listener launcherListener = launchParameters.getLauncherListener();
            if (launcherListener != null)
                launcherListener.onLaunched(new LaunchedTarget(process));

            return process.waitFor();
        } catch (InterruptedException e) {
            // interrupted while waitFor, means cancel was requested by users, return 0 as exit code
            process.destroy();
            return 0;
        } catch (ExecuteException e) {
            int exitCode = e.getExitCode();
            if (exitCode == ExecuteException.INTERRUPTED_EXIT_CODE) return 0;
            throw e;
        } catch (Throwable t) {
            log.error("AppLauncher failed with an exception:", t.getMessage());
            t.printStackTrace(new PrintStream(new ErrorOutputStream(log), true));
            throw t;
        }
    }

    /**
     * Launcher.Target implementation for launched app using SimCtl
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
