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
package org.robovm.compiler.target.ios.libimobiledevice;

import org.robovm.compiler.launcher.Launcher;
import org.robovm.compiler.launcher.LauncherConnections;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.ios.devicecommon.IOSDeviceLaunchParameters;
import org.robovm.compiler.util.ToolchainUtil;
import org.robovm.libimobiledevice.AfcClient;
import org.robovm.libimobiledevice.IDevice;
import org.robovm.libimobiledevice.InstallationProxyClient;
import org.robovm.libimobiledevice.util.AppLauncher;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * IOS device launcher delegate that is used for pre iOS 17 devices and launches
 * using libimobiledevice's AppLauncher
 */
public class AppLauncherDelegate {
    private final Logger log;
    private final File appDir;

    public AppLauncherDelegate(Logger log, File appDir) {
        this.log = log;
        this.appDir = appDir;
    }

    public int internalLaunch(String deviceUdid, IOSDeviceLaunchParameters launchParameters) throws IOException {
        Map<String, String> env = launchParameters.getEnvironment();
        if (env == null) {
            env = new HashMap<>();
        }
        //Fix for #71, see http://stackoverflow.com/questions/37800790/hide-strange-unwanted-xcode-8-logs
        env.put("OS_ACTIVITY_DT_MODE", "");

        OutputStream outStream = launchParameters.getStdoutChain().getInbound();
        AppLauncher launcher = new AppLauncher(deviceUdid, appDir) {
            protected void log(String s, Object... args) {
                log.info(s, args);
            }
        };
        Thread launcherThread = Thread.currentThread();
        launcher.stdout(outStream)
            .closeOutOnExit(true)
            .args(launchParameters.getArguments(true).toArray(new String[0]))
            .env(env)
            .appLauncherCallback((info) -> {
                Launcher.Listener launcherListener = launchParameters.getLauncherListener();
                if (launcherListener != null)
                    launcherListener.onLaunched(new LaunchedTarget(launcherThread, info.getDevice()));
            })
            .xcodePath(ToolchainUtil.findXcodePath())
            .uploadProgressCallback(getProgressListener())
            .installStatusCallback(getInstallationListener());

        return launcher.launch();
    }

    /// simple progress listener for upload phase, just logs progress to console.
    private AfcClient.UploadProgressCallback getProgressListener() {
        return new AfcClient.UploadProgressCallback() {
            boolean first = true;

            public void success() {
                log.info("[100%%] Upload complete");
            }

            public void progress(File path, int percentComplete) {
                if (first) log.info("[  0%%] Beginning upload...");
                first = false;
                log.info("[%3d%%] Uploading %s...", percentComplete, path);
            }

            public void error(String message) {
            }
        };
    }

    /// simple progress listener for installation phase, logs progress to console
    private InstallationProxyClient.StatusCallback getInstallationListener() {
        return new InstallationProxyClient.StatusCallback() {
            boolean first = true;

            public void success() {
                log.info("[100%%] Install complete");
            }

            public void progress(String status, int percentComplete) {
                if (first) log.info("[  0%%] Beginning installation...");
                first = false;
                log.info("[%3d%%] %s", percentComplete, status);
            }

            public void error(String message) {
            }
        };
    }

    /**
     * Launcher.Target implementation for launched app using ilibmobiledevice, provides connection to app using
     * device tunnel
     */
    private static class LaunchedTarget implements Launcher.Target {
        private final IDevice device;
        final Thread thread;

        LaunchedTarget(Thread thread, IDevice device) {
            this.thread = thread;
            this.device = device;
        }

        @Override
        public Launcher.Connection createConnection() throws IOException {
            try {
                return new LauncherConnections.LibMobileDeviceConnection(device);
            } catch (Exception e) {
                throw new IOException(e);
            }
        }

        @Override
        public void terminate() {
            // send interrupt to launcher thread, it will cause AppLauncher to stop
            thread.interrupt();
        }
    }
}
