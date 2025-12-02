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

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.output.NullOutputStream;
import org.robovm.compiler.CompilerException;
import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.Launcher;
import org.robovm.compiler.util.io.OpenOnWriteFileOutputStream;
import org.robovm.debugger.hooks.IHooksConnection;
import org.robovm.debugger.utils.IHooksConnectionUtils;
import org.robovm.debugger.utils.IHooksConnectionUtils.DelegatingFuture;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import static org.apache.commons.exec.Executor.INVALID_EXITVALUE;

/**
 * {@link Process} implementation which runs an app on a simulator using an
 * simctl
 */
public class SimLauncherProcess extends Process implements Launcher {
    private final CountDownLatch countDownLatch = new CountDownLatch(1);
    private final AtomicInteger threadCounter = new AtomicInteger();
    private final Logger log;
    private final String bundleId;
    private final File appDir;
    private final IOSSimulatorLaunchParameters launchParameters;
    private Thread launcherThread;
    private volatile boolean finished = false;
    private volatile int exitCode = -1;


    public SimLauncherProcess(Logger log, File appDir, String bundleId, IOSSimulatorLaunchParameters launchParameters) {
        this.log = log;
        this.appDir = appDir;
        this.bundleId = bundleId;
        this.launchParameters = launchParameters;
    }

    @Override
    public Process execAsync() throws IOException {
        // provide debugger connection information if it was requested
        // has to be done before argument list is built
        setupDebuggerConnection();

        DeviceType deviceType = launchParameters.getDeviceType();
        String watchAppName = launchParameters.getPairedWatchAppName();
        List<String> arguments = new ArrayList<>(launchParameters.getArguments(true));
        Map<String, String> env = launchParameters.getEnvironment();

        OutputStream outStream = System.out;
        OutputStream errStream = System.err;
        if (launchParameters.getStdoutFifo() != null) {
            outStream = new OpenOnWriteFileOutputStream(launchParameters.getStdoutFifo());
        }
        if (launchParameters.getStderrFifo() != null) {
            errStream = new OpenOnWriteFileOutputStream(launchParameters.getStderrFifo());
        }
        OutputStream outStreamFinal = outStream;
        OutputStream errStreamFinal = errStream;

        this.launcherThread = new Thread("SimLauncherThread-" + threadCounter.getAndIncrement()) {
            @Override
            public void run() {
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

                    log.info("Launching app %s on simulator %s", appDir.getAbsolutePath(),
                            deviceType.getUdid());
                    SimCtl.launchAndWait(log, deviceType.getUdid(), bundleId, arguments, env, outStreamFinal, errStreamFinal);
                    exitCode = 0;
                } catch (ExecuteException e) {
                    exitCode = e.getExitValue();
                    // if process is interrupted Apache Executor will use this constant, replace with 0 otherwise
                    // -559038737 looks odd in console output
                    if (exitCode == INVALID_EXITVALUE)
                        exitCode = 0;
                } catch (Throwable t) {
                    log.error("AppLauncher failed with an exception:", t.getMessage());
                    t.printStackTrace(new PrintStream(new ErrorOutputStream(log), true));
                } finally {
                    finished = true;
                    countDownLatch.countDown();
                }
            }
        };
        this.launcherThread.start();
        return this;
    }

    @Override
    public OutputStream getOutputStream() {
        return new NullOutputStream();
    }

    @Override
    public InputStream getInputStream() {
        return waitInputStream;
    }

    @Override
    public InputStream getErrorStream() {
        return waitInputStream;
    }

    @Override
    public int waitFor() throws InterruptedException {
        countDownLatch.await();
        return exitCode;
    }

    @Override
    public int exitValue() {
        if (!finished) {
            throw new IllegalThreadStateException("Not terminated");
        }
        return exitCode;
    }

    @Override
    public void destroy() {
        try {
            this.launcherThread.interrupt();
            this.launcherThread.join();
        } catch (InterruptedException ignored) {
        }
    }

    final InputStream waitInputStream = new  InputStream() {
        @Override
        public int read() throws IOException {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new InterruptedIOException();
            }
            return -1;
        }
    };

    /**
     * setups additional debug parameters, shall be called BEFORE arguments are extracted from launch params
     */
    private void setupDebuggerConnection() {
        DelegatingFuture<IHooksConnection> requestFuture = launchParameters.getRequestForDebuggerConnection();
        if (requestFuture == null) return;

        // launching on simulator, it can write down port number to file on local system
        File hooksPortFile;
        try {
            hooksPortFile = File.createTempFile("robovm-dbg-sim", ".port");
        } catch (IOException e) {
            throw new CompilerException("Failed to create simulator debugger port file", e);
        }
        launchParameters.getArguments().add("-rvm:PrintDebugPort=" + hooksPortFile.getAbsolutePath());

        // provide future to debugger
        Future<IHooksConnection> connectionFuture = IHooksConnectionUtils.waitForPortFromFile(hooksPortFile)
                .thenApply(IHooksConnectionUtils.SocketHooksConnection::new);
        requestFuture.setDelegate(connectionFuture);
    }
}
