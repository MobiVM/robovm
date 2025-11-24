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
 */package org.robovm.compiler.target.ios.devicectl;

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.output.NullOutputStream;
import org.robovm.compiler.CompilerException;
import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.Launcher;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties.PairingState;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties.TunnelState;
import org.robovm.compiler.util.io.OpenOnWriteFileOutputStream;
import org.robovm.debugger.hooks.IHooksConnection;
import org.robovm.debugger.utils.IHooksConnectionUtils;
import org.robovm.debugger.utils.IHooksConnectionUtils.OutputHookPortObserverFuture;
import org.robovm.debugger.utils.IHooksConnectionUtils.SocketHooksConnection;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import static org.apache.commons.exec.Executor.INVALID_EXITVALUE;

/**
 * {@link Process} implementation which runs an app on a attached device using a
 * simctl
 */
public class DeviceCtlLauncherProcess extends Process implements Launcher {
    private final CountDownLatch countDownLatch = new CountDownLatch(1);
    private final AtomicInteger threadCounter = new AtomicInteger();
    private final Logger log;
    private final File appDir;
    private final String bundleId;
    private final IOSDeviceCtlLaunchParameters launchParameters;
    private AppleDevice device;
    private Thread launcherThread;
    private volatile boolean finished = false;
    private volatile int exitCode = -1;

    public DeviceCtlLauncherProcess(Logger log, File appDir, String bundleId, IOSDeviceCtlLaunchParameters launchParameters) {
        this.log = log;
        this.appDir = appDir;
        this.bundleId = bundleId;
        this.launchParameters = launchParameters;
    }

    private AppleDevice waitForDevice(String deviceId) throws Exception {
        int retries = 20;
        int retriesLeft = retries;
        int secondsBetweenRetries = 1;

        while (true) {
            List<AppleDevice> devices = DeviceCtl.listDevices(log);
            if (devices.size() == 1) {
                AppleDevice candidate = devices.get(0);
                if (deviceId == null || deviceId.equals(candidate.hardwareProperties.udid)) {
                    // single device and it's a match
                    return candidate;
                }
            } else if (devices.size() > 1 && deviceId != null) {
                // multiple devices connected but specified is there
                AppleDevice candidate = devices.stream().filter(d -> deviceId.equals(d.hardwareProperties.udid))
                    .findFirst().orElse(null);
                if (candidate != null)
                    return candidate;
            }

            String message;
            if (devices.isEmpty()) message = "No devices connected";
            else if (deviceId != null) message = String.format("Required %s is not connected", deviceId);
            else message = String.format("More than 1 device connected (%d)", devices.size());

            if (retriesLeft > 0) {
                retriesLeft -= 1;
                log.info("Waiting for device: %s. (retry %d of %d)...", message, (retries - retriesLeft), retries);
                //noinspection BusyWait
                Thread.sleep(secondsBetweenRetries * 1000L);
            } else throw new IllegalStateException(message);
        }
    }

    private void checkPreRequirements(AppleDevice device) throws Exception {
        // check if developer mode is enabled
        if (!device.deviceProperties.developerModeStatus) {
            log.error("Developer mode is not enabled on device %s", device.hardwareProperties.udid);
            log.error("https://developer.apple.com/documentation/xcode/enabling-developer-mode-on-a-device");
            throw new CompilerException("Developer mode is not enabled!");

        }

        // check if paired
        if (device.connectionProperties.pairingState != PairingState.PAIRED) {
            log.info("Device is not pairing, trying to pair device %s", device.hardwareProperties.udid);
            DeviceCtl.pairDevice(log, device.hardwareProperties.udid);
        }

    }

    private String getDeviceTunnelAddress(AppleDevice device) throws Exception {
        // refresh device information
        log.info("Retrieving tunnel ipv6 for device %s", device.hardwareProperties.udid);
        AppleDevice updatedInfo = DeviceCtl.getDeviceInfo(log, device.hardwareProperties.udid);
        if (updatedInfo.connectionProperties.tunnelState != TunnelState.CONNECTED || updatedInfo.connectionProperties.tunnelIPAddress == null) {
            throw new CompilerException("Tunnel is not established !");
        }
        return updatedInfo.connectionProperties.tunnelIPAddress;
    }



    @Override
    public Process execAsync() throws IOException {
        // pick parameters and setup debugger before returning Process
        String deviceId = launchParameters.getDeviceId();
        OutputStream outStream = System.out;
        OutputStream errStream = System.err;
        if (launchParameters.getStdoutFifo() != null) {
            outStream = new OpenOnWriteFileOutputStream(launchParameters.getStdoutFifo());
        }
        if (launchParameters.getStderrFifo() != null) {
            errStream = new OpenOnWriteFileOutputStream(launchParameters.getStderrFifo());
        }

        // inject debugger related parameters if thre is request from the debugger
        OutputStream outStreamFinal = setupDebuggerConnection(outStream);
        OutputStream errStreamFinal = errStream;
        List<String> arguments = new ArrayList<>(launchParameters.getArguments(true));
        Map<String, String> env = launchParameters.getEnvironment();


        this.launcherThread = new Thread("SimLauncherThread-" + threadCounter.getAndIncrement()) {
            @Override
            public void run() {
                try {
                    // wait for device or fail
                    device = waitForDevice(deviceId);

                    // check pre-requirements (paired status, dev mode)
                    checkPreRequirements(device);

                    // deploying to device
                    log.info("Deploying app %s to device %s", appDir.getAbsolutePath(), device.deviceProperties.name);
                    DeviceCtl.install(log, device.hardwareProperties.udid, appDir.getAbsolutePath());

                    // launch
                    log.info("Launching app %s on device %s", appDir.getAbsolutePath(), device.deviceProperties.name);
                    DeviceCtl.launchAndWait(log, device.hardwareProperties.udid, bundleId, arguments, env, outStreamFinal, errStreamFinal);

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

    final InputStream waitInputStream = new InputStream() {
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
     * Setups debugger/hooks connection:
     * 1. observes stdout for printed hook port
     * 2. checks device tunnel ipv6 to establish connection to it
     * if there is no request from debugger -- doesn't affect run parameters/output stream
     */
    private OutputStream setupDebuggerConnection(OutputStream outputStream){
        IHooksConnectionUtils.DelegatingFuture<IHooksConnection> requestFuture = launchParameters.getRequestForDebuggerConnection();
        if (requestFuture == null) return outputStream;

        // launching on device using devicectl, observe  hooks port from its output
        launchParameters.getArguments().add("-rvm:PrintDebugPort");

        OutputHookPortObserverFuture observeOutputFeature = new OutputHookPortObserverFuture();
        class ObservingOutputStream extends FilterOutputStream {
            public ObservingOutputStream() {
                super(outputStream);
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                observeOutputFeature.observeOutput(b, off, len);
                super.write(b, off, len);
            }

            @Override
            public void write(int b) throws IOException {
                observeOutputFeature.observeOutput(new byte[]{(byte) b}, 0, 1);
                super.write(b);
            }
        }
        OutputStream overvedOutputStream = new ObservingOutputStream();

        Future<IHooksConnection> connectionFuture = observeOutputFeature.thenApply(port -> {
            // port captured from device, pick tunnel address
            String tunnelAddress;
            try {
                tunnelAddress = getDeviceTunnelAddress(device);
            } catch (Exception e) {
                throw new CompilerException(e);
            }
            return new SocketHooksConnection(new InetSocketAddress(tunnelAddress, port));
        });
        requestFuture.setDelegate(connectionFuture);

        return overvedOutputStream;
    }
}