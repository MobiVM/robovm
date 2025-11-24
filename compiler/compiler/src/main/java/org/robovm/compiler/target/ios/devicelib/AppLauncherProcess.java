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
package org.robovm.compiler.target.ios.devicelib;

import org.apache.commons.io.output.NullOutputStream;
import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.Launcher;
import org.robovm.compiler.util.ToolchainUtil;
import org.robovm.compiler.util.io.OpenOnWriteFileOutputStream;
import org.robovm.debugger.hooks.IHooksConnection;
import org.robovm.debugger.utils.IHooksConnectionUtils;
import org.robovm.debugger.utils.IHooksConnectionUtils.OutputHookPortObserverFuture;
import org.robovm.libimobiledevice.AfcClient;
import org.robovm.libimobiledevice.IDevice;
import org.robovm.libimobiledevice.IDeviceConnection;
import org.robovm.libimobiledevice.InstallationProxyClient;
import org.robovm.libimobiledevice.util.AppLauncher;
import org.robovm.libimobiledevice.util.AppLauncherCallback;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link Process} implementation which runs an app on a device using an
 * {@link AppLauncher}.
 */
public class AppLauncherProcess extends Process implements Launcher {
    private final AtomicInteger threadCounter = new AtomicInteger();
    private final Logger log;
    private final File appDir;
    private final IOSDeviceLaunchParameters launchParameters;
    private final WaitInputStream in = new WaitInputStream();
    private final WaitInputStream err = new WaitInputStream();
    private final CountDownLatch countDownLatch = new CountDownLatch(1);
    private Thread launcherThread;
    private AppLauncher launcher;
    private volatile boolean finished = false;
    private volatile int exitCode = -1;

    public AppLauncherProcess(Logger log, File appDir, IOSDeviceLaunchParameters launchParameters) {
        this.log = log;
        this.appDir = appDir;
        this.launchParameters = launchParameters;
    }

    @Override
    public Process execAsync() throws IOException {
        this.launcherThread = new Thread("AppLauncherThread-" + threadCounter.getAndIncrement()) {
            @Override
            public void run() {
                try {
                    // install and launch
                    exitCode = internalLaunch();
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

    private int internalLaunch() throws IOException {
        String deviceUdid = launchParameters.getDeviceId();
        int forwardPort = launchParameters.getForwardPort();

        // setup app launcher callback if debugger connection was requested
        AppLauncherCallback callback = setupDebuggerConnection();

        OutputStream outStream = System.out;
        if (launchParameters.getStdoutFifo() != null) {
            outStream = new OpenOnWriteFileOutputStream(launchParameters.getStdoutFifo());
        }

        Map<String, String> env = launchParameters.getEnvironment();
        if (env == null) {
            env = new HashMap<>();
        }
        //Fix for #71, see http://stackoverflow.com/questions/37800790/hide-strange-unwanted-xcode-8-logs
        env.put("OS_ACTIVITY_DT_MODE", "");

        launcher = new AppLauncher(deviceUdid, appDir) {
            protected void log(String s, Object... args) {
                log.info(s, args);
            }
        }.stdout(outStream)
                .closeOutOnExit(true)
                .args(launchParameters.getArguments(true).toArray(new String[0]))
                .env(env)
                .forward(forwardPort)
                .appLauncherCallback(callback)
                .xcodePath(ToolchainUtil.findXcodePath())
                .uploadProgressCallback(new AfcClient.UploadProgressCallback() {
                    boolean first = true;
                    public void success() {
                        log.info("[100%%] Upload complete");
                    }
                    public void progress(File path, int percentComplete) {
                        if (first) log.info("[  0%%] Beginning upload...");
                        first = false;
                        log.info("[%3d%%] Uploading %s...", percentComplete, path);
                    }
                    public void error(String message) {}
                })
                .installStatusCallback(new InstallationProxyClient.StatusCallback() {
                    boolean first = true;

                    public void success() {
                        log.info("[100%%] Install complete");
                    }

                    public void progress(String status, int percentComplete) {
                        if (first) log.info("[  0%%] Beginning installation...");
                        first = false;
                        log.info("[%3d%%] %s", percentComplete, status);
                    }

                    public void error(String message) {}
                });

        return launcher.launch();
    }

    @Override
    public OutputStream getOutputStream() {
        return new NullOutputStream();
    }

    @Override
    public InputStream getInputStream() {
        return in;
    }

    @Override
    public InputStream getErrorStream() {
        return err;
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
        launcher.kill();
    }

    private class WaitInputStream extends InputStream {

        @Override
        public int read() throws IOException {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new InterruptedIOException();
            }
            return -1;
        }

    }

    /**
     * setups additional debug parameters, shall be called BEFORE arguments are extracted from launch params
     */
    private AppLauncherCallback setupDebuggerConnection() {
        IHooksConnectionUtils.DelegatingFuture<IHooksConnection> requestFuture = launchParameters.getRequestForDebuggerConnection();
        if (requestFuture == null) return null;

        // launching on device using ilibmobiledevice, observe it output for port number
        launchParameters.getArguments().add("-rvm:PrintDebugPort");

        OutputHookPortObserverFuture observeOutputFeature = new OutputHookPortObserverFuture();
        class Impl implements AppLauncherCallback {
            IDevice device = null;
            @Override
            public void setAppLaunchInfo(AppLauncherInfo info) { device = info.getDevice(); }

            @Override
            public byte[] filterOutput(byte[] data) {
                observeOutputFeature.observeOutput(data, 0, data.length);
                return data;
            }
        }
        Impl callback = new Impl();

        // provide future to debugger
        Future<IHooksConnection> connectionFuture = observeOutputFeature
                .thenApply(port -> new LibMobileDeviceHooksConnection(callback.device, port));
        requestFuture.setDelegate(connectionFuture);

        return callback;
    }

    /**
     * implements hooks connection to device over ILibMobileDevice
     */
    private static class LibMobileDeviceHooksConnection implements IHooksConnection {
        private IDeviceConnection deviceConnection;
        private final IDevice device;
        private final int hooksPort;

        public LibMobileDeviceHooksConnection(IDevice device, int hooksPort) {
            this.device = device;
            this.hooksPort = hooksPort;
        }

        /**
         * waits till port hooks port is available and establish connection
         */
        @Override
        public void connect() {
            deviceConnection = device.connect(hooksPort);
        }

        @Override
        public void disconnect() {
            deviceConnection.close();
        }

        @Override
        public InputStream getInputStream() {
            return deviceConnection.getInputStream();
        }

        @Override
        public OutputStream getOutputStream() {
            return deviceConnection.getOutputStream();
        }
    }
}
