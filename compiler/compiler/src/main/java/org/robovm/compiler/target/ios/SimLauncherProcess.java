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

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.output.NullOutputStream;
import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.Launcher;
import org.robovm.compiler.util.Executor;
import org.robovm.compiler.util.io.OpenOnWriteFileOutputStream;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
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
    private final DeviceType deviceType;
    private final String watchAppName;
    private final File wd;
    private final String bundleId;
    private final File appDir;
    private final List<String> arguments;
    private HashMap<String, String> env;
    private Thread launcherThread;
    private volatile boolean finished = false;
    private volatile int exitCode = -1;
    private OutputStream errStream;
    private OutputStream outStream;

    public SimLauncherProcess(Logger log, File appDir, String bundleId, IOSSimulatorLaunchParameters launchParameters) {
        this.log = log;
        deviceType = launchParameters.getDeviceType();
        watchAppName = launchParameters.getPairedWatchAppName();
        wd = launchParameters.getWorkingDirectory();
        this.appDir = appDir;
        this.bundleId = bundleId;
        this.arguments = new ArrayList<>(launchParameters.getArguments(true));
        if (launchParameters.getEnvironment() != null) {
            this.env = new HashMap<>();
            for (Map.Entry<String, String> entry : launchParameters.getEnvironment().entrySet()) {
                env.put("SIMCTL_CHILD_" + entry.getKey(), entry.getValue());
            }
        }

        outStream = System.out;
        errStream = System.err;
        if (launchParameters.getStdoutFifo() != null) {
            outStream = new OpenOnWriteFileOutputStream(launchParameters.getStdoutFifo());
        }
        if (launchParameters.getStderrFifo() != null) {
            errStream = new OpenOnWriteFileOutputStream(launchParameters.getStderrFifo());
        }
    }

    @Override
    public Process execAsync() throws IOException {
        this.launcherThread = new Thread("SimLauncherThread-" + threadCounter.getAndIncrement()) {
            @Override
            public void run() {
                try {
                    Executor executor;
                    DeviceType freshState = deviceType.refresh();
                    if (freshState != null && "shutdown".equals(freshState.getState().toLowerCase())) {
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

                    // launch and deploy to paired watch simulator
                    if (watchAppName != null && freshState != null  && freshState.getPair() != null) {
                        DeviceType watchDeviceType = freshState.getPair();
                        if ("shutdown".equals(watchDeviceType.getState().toLowerCase())) {
                            log.info("Booting watch simulator %s", watchDeviceType.getUdid());
                            executor = new Executor(log, "xcrun");
                            executor.args("simctl", "boot", watchDeviceType.getUdid());
                            executor.exec();
                        }

                        // bringing simulator to front (and showing it if it was just booted)
                        log.info("Showing watch simulator %s", watchDeviceType.getUdid());
                        executor = new Executor(log, "open");
                        executor.args("-a", "Simulator", "--args", "-CurrentDeviceUDID", watchDeviceType.getUdid());
                        executor.exec();

                        File watchAppDir = new File(appDir, "Watch/" + watchAppName);
                        log.info("Deploying app %s to watch simulator %s", watchAppDir.getAbsolutePath(),
                                watchDeviceType.getUdid());
                        executor = new Executor(log, "xcrun");
                        executor.args("simctl", "install", watchDeviceType.getUdid(), watchAppDir.getAbsolutePath());
                        executor.exec();
                    }

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

                    executor.wd(wd).out(outStream).err(errStream).closeOutputStreams(true).inheritEnv(false);
                    executor.exec();
                    exitCode = 0;
                } catch (ExecuteException e) {
                    exitCode = e.getExitValue();
                    // if process is interrupted Apache Excutor will use this constant, replace with 0 otherwise
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
}
