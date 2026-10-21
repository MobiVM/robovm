/*
 * Copyright (C) 2026 The MobiVM Contributors
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
package org.robovm.compiler.target.ios.devicecommon;

import org.robovm.compiler.Version;
import org.robovm.compiler.launcher.Launcher;
import org.robovm.compiler.launcher.ProcessProxy;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.ios.devicectl.DeviceCtl;
import org.robovm.compiler.target.ios.devicectl.DeviceCtlLauncherDelegate;
import org.robovm.compiler.target.ios.libimobiledevice.AppLauncherDelegate;
import org.robovm.libimobiledevice.IDevice;
import org.robovm.libimobiledevice.LibIMobileDeviceException;
import org.robovm.libimobiledevice.LockdowndClient;
import org.robovm.libimobiledevice.util.AppLauncher;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * {@link Launcher} IOS device launcher, uses libimobiledevice to list devices and pick the on to launch.
 * Based on ios version will use either DeviceCtl (for iOS 17 and above) or AppLauncher (libmobilectl) for older.
 */
public class IOSDeviceLauncher implements Launcher {
    private final Logger log;
    private final File appDir;
    private final String bundleId;
    private final IOSDeviceLaunchParameters launchParameters;
    /// cache to store new/old launcher variant status for device id to minimize amoint of times we need to query
    /// device for its iOS version. There is a risk that device iOS version changes during development session,
    ///  but it is very low and in that case user can just restart
    private static final Map<String, Boolean> resolvedDevicesCache = new HashMap<>();

    public IOSDeviceLauncher(Logger log, File appDir, String bundleId, IOSDeviceLaunchParameters launchParameters) {
        this.log = log;
        this.appDir = appDir;
        this.bundleId = bundleId;
        this.launchParameters = launchParameters;
    }

    @Override
    public Process launchAsync() throws IOException {
        // Streams where ProxyProcess will read from
        InputStream inputOutStream = launchParameters.getStdoutChain().getOutboundAsInput();
        InputStream inputErrStream = launchParameters.getStderrChain().getOutboundAsInput();
        ProcessProxy.ProcessTask task = () -> pickDeviceAndDelegate(launchParameters);
        return ProcessProxy.singleThread(
            inputOutStream,
            inputErrStream,
            null,
            launchParameters.getLauncherListener(),
            task
        );
    }

    private int pickDeviceAndDelegate(IOSDeviceLaunchParameters launchParameters) throws IOException {
        String deviceUdid = launchParameters.getDeviceId();
        if (deviceUdid != null) {
            // running on specific device, check cache first
            Boolean runningIOS17;
            synchronized (resolvedDevicesCache) {
                runningIOS17 = resolvedDevicesCache.get(deviceUdid);
            }
            if (runningIOS17 != null)
                return launchUsingDelegate(runningIOS17, launchParameters, deviceUdid);
        }

        boolean runningIOS17;
        try {
            DeviceResp selectedDevice = waitForDevice(deviceUdid, log::info);

            // check cache first before querying device
            Boolean cachedRunningIOS17;
            synchronized (resolvedDevicesCache) {
                if (selectedDevice.ios17OrAbove) {
                    cachedRunningIOS17 = true;
                    resolvedDevicesCache.put(selectedDevice.udid, true);
                } else {
                    cachedRunningIOS17 = resolvedDevicesCache.get(selectedDevice.udid);
                }
            }
            if (cachedRunningIOS17 != null) {
                runningIOS17 = cachedRunningIOS17;
            } else {
                // get device's IOS version
                try (LockdowndClient lockdowndClient = new LockdowndClient(new IDevice(selectedDevice.udid), "IOSDeviceLauncher", true)) {
                    String productVersion = lockdowndClient.getValue(null, "ProductVersion").toString(); // E.g. 7.0.2
                    Version version = Version.parse(productVersion);
                    runningIOS17 = version.getMajor() >= 17;
                    // update cache
                    synchronized (resolvedDevicesCache) {
                        resolvedDevicesCache.put(selectedDevice.udid, runningIOS17);
                    }
                }
            }
        } catch (InterruptedException e) {
            // canceled while waiting for device, exit without error message
            return 0;
        } catch (Exception e) {
             // failed to pick device, log error and exit
            log.error(e.getMessage());
            return -1;
        }

        // continue using corresponding delegate
        return launchUsingDelegate(runningIOS17, launchParameters, deviceUdid);
    }

    private int launchUsingDelegate(
        boolean runningIOS17, IOSDeviceLaunchParameters launchParameters, String deviceUdid
    ) throws IOException {
        try {
            if (runningIOS17) {
                // launch using DeviceCtl
                DeviceCtlLauncherDelegate delegate = new DeviceCtlLauncherDelegate(log, appDir, bundleId);
                return delegate.internalLaunch(deviceUdid, launchParameters);
            } else {
                // launch using AppLauncher
                AppLauncherDelegate delegate = new AppLauncherDelegate(log, appDir);
                return delegate.internalLaunch(deviceUdid, launchParameters);
            }
        } catch (Throwable t) {
            log.error("iOS DeviceLauncher failed with an exception: %s", t.getMessage());
            throw t;
        }
    }

    /**
     * look for a specific device or wait for a single device to be connected, with retries.
     * look in both DeviceCtl and libimobiledevice for connected devices.
     */
    private DeviceResp waitForDevice(String deviceUdid, AppLauncher.Logger logger) throws Exception{
        final int retries = 20;
        final int secondsBetweenRetries = 1;
        int retriesLeft = retries;

        while (true) {
            List<DeviceResp> udids = Stream.concat(
                DeviceCtl.listDevices().stream().map(d -> new DeviceResp(d.hardwareProperties.udid, true)),
                Arrays.stream(IDevice.listUdids()).map(s -> new DeviceResp(s, false))
            ).distinct().collect(Collectors.toList());
            if (udids.size() == 1 && (deviceUdid == null || deviceUdid.equals(udids.get(0).udid))) {
                // single device and it's a match
                return udids.get(0);
            } else if (udids.size() > 1 && deviceUdid != null) {
                int idx = udids.indexOf(new DeviceResp(deviceUdid, false));
                if (idx >= 0) {
                    // multiple devices connected but specified is there
                    return udids.get(idx);
                }
            }

            String message;
            if (udids.isEmpty()) {
                message = "No devices connected";
            } else if (deviceUdid != null) {
                message = String.format("Required %s is not connected (%s)", deviceUdid, udids);
            } else {
                message = String.format("More than 1 device connected (%s)", udids);
            }

            if (retriesLeft > 0) {
                retriesLeft -= 1;
                logger.log(String.format("Waiting for device: %s. (retry %d of %d)...", message, (retries - retriesLeft), retries));
                Thread.sleep(secondsBetweenRetries * 1000L);
            } else throw new LibIMobileDeviceException(message);
        }
    }

    // response from waitForDevice, contains device udid and whether it is running iOS 17 or above
    private static class DeviceResp {
        private final String udid;
        private final boolean ios17OrAbove;

        public DeviceResp(String udid, boolean ios17OrAbove) {
            this.udid = udid;
            this.ios17OrAbove = ios17OrAbove;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeviceResp) {
                DeviceResp otherResp = (DeviceResp) obj;
                return this.udid.equals(otherResp.udid);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return udid.hashCode();
        }

        @Override
        public String toString() {
            return udid;
        }
    }
}
