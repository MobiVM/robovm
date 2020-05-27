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
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.Launchers.*;
import org.robovm.compiler.util.ToolchainUtil;
import org.robovm.compiler.util.io.NeverCloseOutputStream;
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

    private AppLauncherProcess(Builder builder, File appDir) throws IOException {
        super(builder);

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

        launcher = new AppLauncher(device, appDir) {
            protected void log(String s, Object... args) {
                log.info(s, args);
            }
        };
        launcher.closeOutOnExit(true)
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

                    public void error(String message) {
                        log.error("Upload failed with message: %s", message);
                    }
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

                    public void error(String message) {
                        log.error("Install failed with message: %s", message);
                    }
                });
    }

    public static CustomizableLauncher createLauncher(Logger log, Listener listener,
                                                      IOSDeviceLaunchParameters launchParameters,
                                                      File appDir) {
        return new Builder(log, listener, launchParameters, appDir);
    }

    @Override
    protected int performLaunch() throws IOException {
        launcher.install();
        launcher.stdout(out);
        return launcher.launch();
    }


    public static class Builder extends AbstractLauncherProcess.Builder<IOSDeviceLaunchParameters> {
        private final File appDir;

        public Builder(Logger log, Listener listener, IOSDeviceLaunchParameters launchParameters,
                       File appDir) {
            super(log, listener, launchParameters);
            this.appDir = appDir;
        }

        @Override
        protected AbstractLauncherProcess.Builder<IOSDeviceLaunchParameters> duplicate() {
            return new Builder(log, listener, launchParameters, appDir);
        }

        @Override
        protected AbstractLauncherProcess<IOSDeviceLaunchParameters> createAndSetupThread(boolean async) throws IOException {
            // apply default streams if not configured
            // error/input stream is not used
            err = new ImmutablePair<>(null, null);
            in = new ImmutablePair<>(null, new NullOutputStream());
            if (async) {
                if (out == null) {
                    PipedInputStream sink = new PipedInputStream();
                    out = new ImmutablePair<>(new PipedOutputStream(sink), sink);
                }
            } else {
                if (out == null)
                    out = new ImmutablePair<>(new NeverCloseOutputStream(System.out), null);
            }

            AppLauncherProcess launcher = new AppLauncherProcess(this, appDir);
            if (async) {
                // need to provide not null sink for err stream for process
                err = new ImmutablePair<>(null, launcher.waitInputStream);
            }
            return launcher;
        }

        @Override
        public AsyncLauncherBuilder setIn(InputStream in, OutputStream inSink) {
            throw new UnsupportedOperationException();
        }

        @Override
        public SyncLauncherBuilder setIn(InputStream in) {
            throw new UnsupportedOperationException();
        }

        @Override
        public SyncLauncherBuilder setErr(OutputStream err) {
            throw new UnsupportedOperationException();
        }

        @Override
        public AsyncLauncherBuilder setErr(OutputStream err, InputStream errSink) {
            throw new UnsupportedOperationException();
        }
    }
}
