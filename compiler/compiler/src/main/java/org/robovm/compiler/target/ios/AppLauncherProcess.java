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
import org.robovm.compiler.util.ToolchainUtil;
import org.robovm.libimobiledevice.AfcClient;
import org.robovm.libimobiledevice.IDevice;
import org.robovm.libimobiledevice.InstallationProxyClient;
import org.robovm.libimobiledevice.util.AppLauncher;
import org.robovm.libimobiledevice.util.AppLauncherCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link Process} implementation which runs an app on a device using an
 * {@link AppLauncher}.
 */
public class AppLauncherProcess extends AbstractLauncherProcess<IOSDeviceLaunchParameters> {
    private final AppLauncher launcher;
    private final NullOutputStream stdInStream = new NullOutputStream();
    private final WaitInputStream stdErrStream = new WaitInputStream();
    private final PipedInputStream pipedStdOutStream = new PipedInputStream();

    public AppLauncherProcess(Logger log, Listener listener, IOSDeviceLaunchParameters launchParameters, File appDir) throws IOException {
        super(log, listener, launchParameters);
        String deviceId = launchParameters.getDeviceId();
        int forwardPort = launchParameters.getForwardPort();
        AppLauncherCallback callback = launchParameters.getAppPathCallback();
        if (deviceId == null) {
            String[] udids = IDevice.listUdids();
            if (udids.length == 0) {
                throw new RuntimeException("No devices connected");
            }
            if (udids.length > 1) {
                log.warn("More than 1 device connected (%s). "
                        + "Using %s.", Arrays.asList(udids), udids[0]);
            }
            deviceId = udids[0];
        }

        IDevice device = new IDevice(deviceId);
        Map<String, String> env = launchParameters.getEnvironment();
        if (env == null) {
            env = new HashMap<>();
        }
        //Fix for #71, see http://stackoverflow.com/questions/37800790/hide-strange-unwanted-xcode-8-logs
        env.put("OS_ACTIVITY_DT_MODE", "");

        this.launcher = new AppLauncher(device, appDir) {
            protected void log(String s, Object... args) {
                log.info(s, args);
            }
        };
        this.launcher
                .closeOutOnExit(true)
                .args(launchParameters.getArguments().toArray(new String[0]))
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
                        if (first) {
                            log.info("[  0%%] Beginning upload...");
                            first = false;
                        }
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
                        if (first) {
                            log.info("[  0%%] Beginning installation...");
                            first = false;
                        }
                        log.info("[%3d%%] %s", percentComplete, status);
                    }

                    public void error(String message) {}
                });
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
