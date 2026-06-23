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
package org.robovm.compiler.target.ios.devicectl;

import org.robovm.compiler.CompilerException;
import org.robovm.compiler.launcher.Launcher;
import org.robovm.compiler.launcher.LauncherConnections;
import org.robovm.compiler.launcher.ProcessProxy;
import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.ios.devicecommon.IOSDeviceLaunchParameters;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties.PairingState;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties.TunnelState;
import org.robovm.compiler.util.Executor.ExecuteException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * IOS device launcher delegate that is used for iOS 17+ devices and launches
 * using devicectl.
 */
 public class DeviceCtlLauncherDelegate {
    private final Logger log;
    private final File appDir;
    private final String bundleId;

    public DeviceCtlLauncherDelegate(Logger log, File appDir, String bundleId) {
        this.log = log;
        this.appDir = appDir;
        this.bundleId = bundleId;
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

    public int internalLaunch(String deviceId, IOSDeviceLaunchParameters launchParameters) throws IOException {
        OutputStream outStream = launchParameters.getStdoutChain().getInbound();
        OutputStream errStream = launchParameters.getStderrChain().getInbound();
        List<String> arguments = new ArrayList<>(launchParameters.getArguments(true));
        Map<String, String> env = launchParameters.getEnvironment();

        AppleDevice device;
        int exitCode;

        // preparation part
        try {
            // wait for device or fail
            device = waitForDevice(deviceId);

            // check pre-requirements (paired status, dev mode)
            checkPreRequirements(device);

            // deploying to device
            log.info("Deploying app %s to device %s", appDir.getAbsolutePath(), device.deviceProperties.name);
            DeviceCtl.install(log, device.hardwareProperties.udid, appDir.getAbsolutePath());
        } catch (ExecuteException e) {
            exitCode = e.getExitCode();
            if (exitCode == ExecuteException.INTERRUPTED_EXIT_CODE) // thread interrupted
                return 0;
            else throw e;
        } catch (Exception e) {
            log.error("AppLauncher failed with an exception:", e.getMessage());

            e.printStackTrace(new PrintStream(new ErrorOutputStream(log), true));
            throw new IOException(e);
        }

        // launch part
        try {
            log.info("Launching app %s on device %s", appDir.getAbsolutePath(), device.deviceProperties.name);
            Process process = DeviceCtl.launchAsync(
                log,
                device.hardwareProperties.udid,
                bundleId,
                arguments,
                env,
                outStream,
                errStream
            );

            // deliver on app launched if it is requested
            Launcher.Listener launcherListener = launchParameters.getLauncherListener();
            if (launcherListener != null)
                launcherListener.onLaunched(new LaunchedTarget(process, device));

            // wait for launched process to finish
            exitCode = process.waitFor();
        } catch (ExecuteException e) {
            exitCode = e.getExitCode();
            // if process is interrupted replace with 0
            if (exitCode == ExecuteException.INTERRUPTED_EXIT_CODE)
                exitCode = 0;
        } catch (InterruptedException ignored) {
            // interrupted while waitFor, means cancel was requested by users, return 0 as exit code
            exitCode = 0;
        } catch (Throwable t) {
            log.error("AppLauncher failed with an exception:", t.getMessage());
            t.printStackTrace(new PrintStream(new ErrorOutputStream(log), true));
            exitCode = -2000; // TODO
        }

        return exitCode;
    }

    /**
     * Launcher.Target implementation for launched app using DeviceCtl, provides connection to app using device tunnel
     * and allows to terminate launched process
     */
    private class LaunchedTarget implements Launcher.Target {
        final AppleDevice device;
        final Process process;

        LaunchedTarget(Process process, AppleDevice device) {
            this.process = process;
            this.device = device;
        }

        @Override
        public Launcher.Connection createConnection() throws IOException {
            try {
                String tunnelAddress = getDeviceTunnelAddress(device);
                return new LauncherConnections.SocketConnection(tunnelAddress);
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