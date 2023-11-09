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
package org.robovm.libimobiledevice.util;

import com.dd.plist.NSArray;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSNumber;
import com.dd.plist.NSString;
import com.dd.plist.PropertyListParser;
import org.robovm.libimobiledevice.AfcClient;
import org.robovm.libimobiledevice.AfcClient.UploadProgressCallback;
import org.robovm.libimobiledevice.DebugServerClient;
import org.robovm.libimobiledevice.IDevice;
import org.robovm.libimobiledevice.InstallationProxyClient;
import org.robovm.libimobiledevice.InstallationProxyClient.Options;
import org.robovm.libimobiledevice.InstallationProxyClient.Options.PackageType;
import org.robovm.libimobiledevice.InstallationProxyClient.StatusCallback;
import org.robovm.libimobiledevice.LibIMobileDeviceException;
import org.robovm.libimobiledevice.LockdowndClient;
import org.robovm.libimobiledevice.LockdowndServiceDescriptor;
import org.robovm.libimobiledevice.MobileImageMounterClient;
import org.robovm.libimobiledevice.binding.LockdowndError;
import org.robovm.libimobiledevice.binding.MobileImageMounterError;
import org.robovm.libimobiledevice.util.AppLauncherCallback.AppLauncherInfo;
import org.robovm.libimobiledevice.util.Lambdas.CheckedConsumer;
import org.robovm.libimobiledevice.util.Lambdas.CheckedFunction;
import org.robovm.libimobiledevice.util.Lambdas.CheckedSupplier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import static org.robovm.libimobiledevice.binding.LibIMobileDeviceConstants.DEBUGSERVER_SECURE_SERVICE_NAME;
import static org.robovm.libimobiledevice.binding.LibIMobileDeviceConstants.DEBUGSERVER_SERVICE_NAME;

/**
 * Launches an application on a device using the {@code com.apple.debuserver}
 * service. The app must have the {@code get-task-allow} entitlement set to 
 * {@code true} in order to be allowed to be launched by the debug server.
 */
public class AppLauncher {
    public static final int DEFAULT_FORWARD_PORT = 17777;

    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    private static final int RECEIVE_TIMEOUT = 5000;
    private static final byte[] BREAK = new byte[] { 0x03 };

    private byte[] buffer = new byte[4096];
    private StringBuilder bufferedResponses = new StringBuilder(4096);

    private final String deviceUdid;
    private IDevice resolvedDevice;
    private final String appId;
    private final File localAppPath;
    private boolean installed = false;
    private List<String> args = new ArrayList<>();
    private Map<String, String> env = new HashMap<String, String>();
    private OutputStream stdout = System.out;
    private boolean closeOutOnExit = false;
    private boolean debug = false;
    private int localPort = -1;
    private AppLauncherCallback appLauncherCallback = null;
    private volatile boolean killed = false;
    private StatusCallback installStatusCallback;
    private UploadProgressCallback uploadProgressCallback;
    private String xcodePath;
    private int launchOnLockedRetries = 20;
    private int secondsBetweenLaunchOnLockedRetries = 1;
    
    /**
     * Creates a new {@link AppLauncher} which will launch an already installed
     * app with the specified id.
     * 
     * @param deviceUdid the device's UDID to connect to (or null to auto pick one).
     * @param appId the id (CFBundleIdentifier) of the app to run.
     */
    public AppLauncher(String deviceUdid, String appId) {
        this(deviceUdid, appId, null);
    }

    /**
     * Creates a new {@link AppLauncher} which will install the app from the
     * specified IPA file or app bundle dir and launch it.
     *
     * @param deviceUdid the device's UDID to connect to (or null to auto pick one).
     * @param localAppPath the IPA file of app bundle dir containing the app to 
     *        install and launch.
     */
    public AppLauncher(String deviceUdid, File localAppPath) throws IOException {
        this(deviceUdid, getAppId(localAppPath), localAppPath);
    }

    private AppLauncher(String deviceUdid, String appId, File localAppPath) {
        if (appId == null) {
            throw new NullPointerException("appId");
        }
        this.deviceUdid = deviceUdid != null && !deviceUdid.isEmpty() ? deviceUdid : null;
        this.appId = appId;
        this.localAppPath = localAppPath;
    }

    private IDevice waitForDevice(String deviceUdid) throws Exception{
        final int retries = launchOnLockedRetries;
        int retriesLeft = retries;
        int secondsBetweenRetries = secondsBetweenLaunchOnLockedRetries;

        while (true) {
            String[] udids = IDevice.listUdids();
            if (udids.length == 1 && (deviceUdid == null || deviceUdid.equals(udids[0]))) {
                // single device and it's a match
                return new IDevice(udids[0]);
            } else if (udids.length > 1 && deviceUdid != null && Arrays.asList(udids).contains(deviceUdid)) {
                // multiple devices connected but specified is there
                return new IDevice(deviceUdid);
            }

            String message;
            if (udids.length == 0) {
                message = "No devices connected";
            } else if (deviceUdid != null) {
                message = String.format("Required %s is not connected (%s)", deviceUdid, Arrays.asList(udids));
            } else {
                message = String.format("More than 1 device connected (%s)", Arrays.asList(udids));
            }

            if (retriesLeft > 0) {
                retriesLeft -= 1;
                log("Waiting for device: %s. (retry %d of %d)...", message, (retries - retriesLeft), retries);
                Thread.sleep(secondsBetweenRetries * 1000L);
            } else throw new LibIMobileDeviceException(message);
        }
    }

    /**
     * Looks for connected device
     */
    private IDevice findDevice() throws Exception{
        if (resolvedDevice == null)
            resolvedDevice = waitForDevice(deviceUdid);

        return resolvedDevice;
    }

    private static String getAppId(File f) throws IOException {
        if (f == null) {
            throw new NullPointerException("localAppPath");
        }
        if (!f.exists()) {
            throw new FileNotFoundException(f.getAbsolutePath());
        }
        NSDictionary infoPlistDict = null;
        if (f.getName().toLowerCase().endsWith(".ipa")) {
            try (ZipFile zipFile = new ZipFile(f)) {
                for (ZipEntry entry : Collections.list(zipFile.entries())) {
                    if (entry.getName().matches("Payload/[^/]+\\.app/Info\\.plist")) {
                        try (InputStream is = zipFile.getInputStream(entry)) {
                            try {
                                infoPlistDict = (NSDictionary) PropertyListParser.parse(is);
                            } catch (IOException e) {
                                throw e;
                            } catch (Exception e) {
                                throw new IOException(e);
                            }
                            break;
                        }
                    }
                }
            }
        } else if (f.isDirectory()) {
            File infoPlistFile = new File(f, "Info.plist");
            if (infoPlistFile.exists()) {
                try {
                    infoPlistDict = (NSDictionary) PropertyListParser.parse(infoPlistFile);
                } catch (IOException e) {
                    throw e;
                } catch (Exception e) {
                    throw new IOException(e);
                }
            }
        }
        
        if (infoPlistDict == null) {
            throw new IllegalArgumentException("Path " + f + " is neither a " 
                    + ".ipa file nor an iOS app bundle directory.");
        }
        
        NSString appId = (NSString) infoPlistDict.objectForKey("CFBundleIdentifier");
        if (appId == null) {
            throw new IllegalArgumentException("No CFBundleIdentifier found in " 
                    + "the Info.plist file in " + f);
        }
        
        return appId.toString();
    }
    
    /**
     * Sets an {@link UploadProgressCallback} which will be used to report the
     * progress when the app is uploaded to the device.
     * 
     * @param callback the callback.
     */
    public AppLauncher uploadProgressCallback(UploadProgressCallback callback) {
        this.uploadProgressCallback = callback;
        return this;
    }
    
    /**
     * Sets an {@link StatusCallback} which will be used to report the
     * progress when the app is installed on the device.
     * 
     * @param callback the callback.
     */
    public AppLauncher installStatusCallback(StatusCallback callback) {
        this.installStatusCallback = callback;
        return this;
    }
    
    /**
     * Adds command line arguments which will be passed to the app on launch.
     * 
     * @param args the arguments to be added.
     */
    public AppLauncher args(String ... args) {
        this.args.addAll(Arrays.asList(args));
        return this;
    }
    
    /**
     * Sets an {@link OutputStream} which all console output (stdout and stderr)
     * of the app will be written to when the app is launched. By default all
     * output will be written to {@link System#out}
     * 
     * @param stdout the {@link OutputStream}.
     */
    public AppLauncher stdout(OutputStream stdout) {
        if (stdout == null) {
            throw new NullPointerException("stdout");
        }
        this.stdout = stdout;
        return this;
    }
    
    /**
     * Sets whether the stdout stream should be closed once the app has 
     * terminated.
     * 
     * @param closeOutOnExit <code>true</code> or <code>false</code>.
     */
    public AppLauncher closeOutOnExit(boolean closeOutOnExit) {
        this.closeOutOnExit = closeOutOnExit;
        return this;
    }
    
    /**
     * Adds an environment variable which will be set when launching the app.
     * 
     * @param name the variable name.
     * @param value the variable value.
     */
    public AppLauncher env(String name, String value) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        if (value == null) {
            throw new NullPointerException("value");
        }
        this.env.put(name, value);
        return this;
    }
    
    /**
     * Adds environment variables which will be set when launching the app.
     * 
     * @param env the variables.
     */
    public AppLauncher env(Map<String, String> env) {
        if (env == null) {
            throw new NullPointerException("env");
        }
        this.env.putAll(env);
        return this;
    }
    
    /**
     * Sets whether GDB protocol packets should be logged to {@link System#out}.
     * Disabled by default.
     * 
     * @param debug <code>true</code> to enabled debug logging.
     */
    public AppLauncher debug(boolean debug) {
        this.debug = debug;
        return this;
    }
    
    /**
     * Forwards all GDB communication to the local TCP port after the app
     * has been successfully launched.
     * @param localPort local port or -1 to disable
     */
    public AppLauncher forward(int localPort) {
        this.localPort = localPort;
        return this;
    }
    
    /**
     * Sets a callback that is invoked when the remote app info is known.
     */
    public AppLauncher appLauncherCallback(AppLauncherCallback callback) {
        this.appLauncherCallback = callback;
        return this;
    }
    
    /**
     * Sets the path to Xcode where developer images will be searched for. This
     * should be set to the value returned by {@code xcode-select}. If not set
     * {@code /Applications/Xcode.app/Contents/Developer} will be used.
     * 
     * @param xcodePath the Xcode path.
     */
    public AppLauncher xcodePath(String xcodePath) {
        this.xcodePath = xcodePath;
        return this;
    }
    
    /**
     * Sets the number of times to retry a launch if the device is locked.
     * Default is 5.
     */
    public AppLauncher launchOnLockedRetries(int launchOnLockedRetries) {
        this.launchOnLockedRetries = launchOnLockedRetries;
        return this;
    }
    
    /**
     * Sets the number of seconds to wait between launch retries when the device
     * is locked. The default is 5.
     */
    public AppLauncher secondsBetweenLaunchOnLockedRetries(int secondsBetweenLaunchOnLockedRetries) {
        this.secondsBetweenLaunchOnLockedRetries = secondsBetweenLaunchOnLockedRetries;
        return this;
    }
    
    public void kill() {
        killed = true;
    }

    private static String toHex(String s) {
        StringBuilder sb = new StringBuilder(s.length() * 2);
        byte[] bytes;
        bytes = s.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            int c = bytes[i] & 0xff;
            sb.append(HEX_CHARS[c >> 4]);
            sb.append(HEX_CHARS[c & 0xf]);
        }
        return sb.toString();
    }

    private static byte fromHex(char c1, char c2) {
        int d = 0;
        if (c1 <= '9') {
            d = c1 - '0';
        } else {
            d = c1 - 'a' + 10;
        }
        d <<= 4;
        if (c2 <= '9') {
            d |= c2 - '0';
        } else {
            d |= c2 - 'a' + 10;
        }
        return (byte) d;
    }

    private static byte[] fromHex(String s) {
        int length = s.length();
        byte[] data = new byte[length / 2];
        for (int i = 0; i < (length >> 1); i++) {
            data[i] = fromHex(s.charAt(i * 2), s.charAt(i * 2 + 1));
        }
        return data;
    }

    private static byte[] fromHex(byte[] buffer, int offset, int length) {
        byte[] data = new byte[length / 2];
        for (int i = 0; i < (length >> 1); i++) {
            data[i] = fromHex((char)buffer[offset + i * 2], (char)buffer[offset + i * 2 + 1]);
        }
        return data;
    }

    private String encode(String cmd) {
        int checksum = 0;
        for (int i = 0; i < cmd.length(); i++) {
            checksum += cmd.charAt(i);
        }
        return String.format("$%s#%02x", cmd, checksum & 0xff);
    }

    private String decode(String packet) {
        int start = 1;
        if (packet.charAt(0) == '+' || packet.charAt(0) == '-') {
            start = 2;
        }
        int end = packet.lastIndexOf('#');
        return packet.substring(start, end);
    }

    private void debugGdb(String s) {
        if (debug) {
            System.out.println(s);
        }
    }

    /**
     * Logs a message to {@link System#out}. Override this method to use a
     * custom logger.
     */
    protected void log(String s, Object ... args) {
        System.out.format(s, args);
        System.out.println();
    }

    private void sendGdbPacket(DebugServerClient client, String packet) throws IOException {
        debugGdb("Sending packet: " + packet);
        byte[] data = packet.getBytes(StandardCharsets.US_ASCII);
        while (true) {
            int sentBytes = client.send(data, 0, data.length);
            if (sentBytes == data.length) {
                break;
            }
            data = Arrays.copyOfRange(data, sentBytes, data.length);
        }
    }

    private String receiveGdbPacket(DebugServerClient client) throws IOException, TimeoutException {
        return receiveGdbPacket(client, Integer.MAX_VALUE);
    }

    private String receiveGdbPacket(DebugServerClient client, long timeout) throws IOException, TimeoutException {
        int packetEnd = bufferedResponses.indexOf("#");
        if (packetEnd != -1 && bufferedResponses.length() - packetEnd > 2) {
            String packet = bufferedResponses.substring(0, packetEnd + 3);
            bufferedResponses.delete(0, packetEnd + 3);
            debugGdb("Received packet: " + packet);
            return packet;
        }

        long deadline = System.currentTimeMillis() + timeout;
        while (true) {
            if (killed || Thread.currentThread().isInterrupted()) {
                killed = true;
                throw new InterruptedIOException();
            }
            int receivedBytes = client.receive(buffer, 0, buffer.length, 10);
            if (receivedBytes > 0) {
                bufferedResponses.append(new String(buffer, 0, receivedBytes, StandardCharsets.US_ASCII));
                packetEnd = bufferedResponses.indexOf("#");
                if (packetEnd != -1 && bufferedResponses.length() - packetEnd > 2) {
                    String packet = bufferedResponses.substring(0, packetEnd + 3);
                    bufferedResponses.delete(0, packetEnd + 3);
                    debugGdb("Received packet: " + packet);
                    return packet;
                }
            }
            if (System.currentTimeMillis() > deadline) {
                throw new TimeoutException();
            }
        }
    }

    private boolean receiveGdbAck(DebugServerClient client) throws IOException {
        if (bufferedResponses.length() > 0) {
            char c = bufferedResponses.charAt(0);
            bufferedResponses.delete(0, 1);
            return c == '+';
        }

        byte[] buffer = new byte[1];
        client.receive(buffer, 0, buffer.length, RECEIVE_TIMEOUT);
        debugGdb("Received ack: " + (char) buffer[0]);
        return buffer[0] == '+';
    }

    private void sendReceivePacket(DebugServerClient client, String packet,
                                   String expectedResponse, boolean ackMode) throws IOException, TimeoutException {

        sendGdbPacket(client, packet);
        if (ackMode) {
            receiveGdbAck(client);
        }
        String response = decode(receiveGdbPacket(client, RECEIVE_TIMEOUT));
        if (!expectedResponse.equals(response)) {
            if (response.startsWith("E")) {
                throw new RuntimeException("Launch failed: " + response.substring(1));
            }
            throw new RuntimeException("Launch failed: Unexpected response '"
                    + response + "' to command '" + decode(packet) + "'");
        }
    }

    private void kill(DebugServerClient client) throws IOException, TimeoutException {
        // We're killed. Try to shutdown nicely.
        killed = false;
        Thread.interrupted();
        debugGdb("Sending break");
        client.send(BREAK, 0, BREAK.length);
        receiveGdbPacket(client, RECEIVE_TIMEOUT);
        sendGdbPacket(client, encode("k"));
    }

    private String encodeArgs(String appPath) {
        StringBuilder sb = new StringBuilder();
        String hex = toHex(appPath);
        sb.append(String.format("%d,0,%s", hex.length(), hex));
        for (int i = 0; i < args.size(); i++) {
            hex = toHex(args.get(i));
            sb.append(String.format(",%d,%d,%s", hex.length(), i + 1, hex));
        }
        return sb.toString();
    }

    private String getAppPath(LockdowndClient lockdowndClient, String appId) throws IOException {
        LockdowndServiceDescriptor instService = lockdowndClient.startService(InstallationProxyClient.SERVICE_NAME);
        try (InstallationProxyClient instClient = new InstallationProxyClient(lockdowndClient.getDevice(), instService)) {
            NSArray apps = instClient.browse();
            for (int i = 0; i < apps.count(); i++) {
                NSDictionary appInfo = (NSDictionary) apps.objectAtIndex(i);
                NSString bundleId = (NSString) appInfo.objectForKey("CFBundleIdentifier");
                if (bundleId != null && appId.equals(bundleId.toString())) {
                    NSString path = (NSString) appInfo.objectForKey("Path");
                    NSDictionary entitlements = (NSDictionary) appInfo.objectForKey("Entitlements");
                    if (entitlements == null || entitlements.objectForKey("get-task-allow") == null
                            || !entitlements.objectForKey("get-task-allow").equals(new NSNumber(true))) {
                        throw new RuntimeException("App with id '" + appId + "' does not "
                            + "have the 'get-task-allow' entitlement and cannot be debugged");
                    }
                    if (path == null) {
                        throw new RuntimeException("Path for app with id '" + appId + "' not found");
                    }
                    return path.toString();
                }
            }
            throw new RuntimeException("No app with id '" + appId + "' found on device");
        }
    }

    public void install() throws IOException {
        if (!installed) {
            Retrying<LockdowndClient> lockdownRetrying = new Retrying<>(() -> new LockdowndClient(findDevice(), getClass().getSimpleName(), true));
            try (lockdownRetrying) {
                // get lockdown client, retry if password protected
                LockdowndClient lockdowndClient = lockdownRetrying.perform((client) -> client);
                install(lockdowndClient);
            } catch (IOException | RuntimeException e) {
                throw e;
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }

    private void install(LockdowndClient lockdowndClient) throws Exception {
        if (!installed) {
            uploadInternal(lockdowndClient);
            if (uploadProgressCallback == null) {
                log("[ 50%%] Upload done. Installing app...");
            }
            installInternal(lockdowndClient);
            installed = true;
        }
    }

    /**
     * mounts developer image, first checks if its required
     * @return version of developer image that was mounted
     */
    private Version mountDeveloperImageIfRequired(LockdowndClient lockdowndClient, Version deviceVersion) throws Exception {
        Retrying<MobileImageMounterClient> retrying = new Retrying<>(() -> {
            LockdowndServiceDescriptor mimService = lockdowndClient.startService(MobileImageMounterClient.SERVICE_NAME);
            return new MobileImageMounterClient(lockdowndClient.getDevice(), mimService);
        });
        try (retrying) {
            // check if already mounted

            log("Checking if developer disk image requires to be mounted.");
            NSDictionary result = retrying.perform((mimClient) -> {
                return mimClient.lookupImage(null);
            });
            NSArray imageSignature = (NSArray) result.objectForKey("ImageSignature");
            if (imageSignature != null && imageSignature.count() > 0) {
                // already mounted
                log("Developer disk image is already mounted.");
                return null;
            }

            File deviceSupport = DeveloperImageResolver.getDeviceSupportPath();
            log("Looking up developer disk image for iOS version %s in %s", deviceVersion, deviceSupport);
            DeveloperImageResolver.Response devImageResp = DeveloperImageResolver.findDeveloperImage(deviceSupport, deviceVersion);
            byte[] devImageSigBytes = Files.readAllBytes(devImageResp.signature.toPath());

            log("Copying developer disk image %s to device", devImageResp.dmg);
            retrying.perform((mimClient) -> {
                mimClient.uploadImage(devImageResp.dmg, null, devImageSigBytes);
            });

            log("Mounting developer disk image");
            result = retrying.perform((mimClient) -> {
                return mimClient.mountImage("/PublicStaging/staging.dimage", devImageSigBytes, null);
            });
            NSString status = (NSString) result.objectForKey("Status");
            if (status == null || !"Complete".equals(status.toString())) {
                throw new IOException("Failed to mount " + devImageResp.dmg.getAbsolutePath() + " on the device.");
            }

            // FIXME: seems to be a delay required between mounting image and ability to start service
            Thread.sleep(1000);

            // verify that image was mounted
            result = retrying.perform((mimClient) -> {
                return mimClient.lookupImage(null);
            });
            if (result.objectForKey("ImageSignature") == null) {
                throw new LibIMobileDeviceException("Developer disk image mounting failed: status not mounted!");
            }
            return devImageResp.version;
        }
    }

    private int launchInternal() throws Exception {
        String appPath = null;

        Retrying<LockdowndClient> lockdownRetrying = new Retrying<>(() -> new LockdowndClient(findDevice(), getClass().getSimpleName(), true));
        try (lockdownRetrying) {
            // get lockdown client, retry if password protected
            LockdowndClient lockdowndClient = lockdownRetrying.perform((client) -> client);

            // install if required
            install(lockdowndClient);

            appPath = getAppPath(lockdowndClient, appId);
            String productVersion = lockdowndClient.getValue(null, "ProductVersion").toString(); // E.g. 7.0.2
            String buildVersion = lockdowndClient.getValue(null, "BuildVersion").toString(); // E.g. 11B508
            Version deviceVersion = Version.parse(productVersion);

            // check if development mode is enabled on ios16+ devices
            if (deviceVersion.getMajor() >= 16) {
                NSNumber developerModeStatus = (NSNumber) lockdowndClient.getValue("com.apple.security.mac.amfi", "DeveloperModeStatus");
                if (!developerModeStatus.boolValue()) {
                    String msg = "You have to enable Developer Mode on the given device!";
                    log(msg);
                    throw new RuntimeException(msg);
                }
            }

            // mount dev image if required
            Version mountedDevImage = mountDeveloperImageIfRequired(lockdowndClient, deviceVersion);

            // start debug server service
            LockdowndServiceDescriptor debugServerServiceDescriptor;
            {
                log("Starting DebugServerService.");

                // check if device is locked here before starting debug server otherwise it will fail without
                // ability to catch and retry
                try (Retrying<AutoCloseable> retrying = new Retrying<>(() -> null)) {
                    retrying.perform((ignored) -> {
                        NSNumber status = (NSNumber) lockdowndClient.getValue(null, "PasswordProtected");
                        if (status !=  null && status.boolValue()) {
                            throw new LibIMobileDeviceException(LockdowndError.LOCKDOWN_E_PASSWORD_PROTECTED.swigValue(),
                                    LockdowndError.LOCKDOWN_E_PASSWORD_PROTECTED.name());
                        }
                    });
                }

                // starting from developer image version 13.6 there is secure version of debug server service
                // if dev image wasn't mounted in this session its version is not known then using
                // secure only for ios14+
                String serviceName;
                if (deviceVersion.getMajor() >= 14 || (mountedDevImage != null && mountedDevImage.compareTo(new Version(13, 6)) >= 0)) {
                    serviceName = DEBUGSERVER_SECURE_SERVICE_NAME;
                } else {
                    serviceName = DEBUGSERVER_SERVICE_NAME;
                }
                debugServerServiceDescriptor = lockdowndClient.startService(serviceName);
            }

            // app is ready to launch
            if(appLauncherCallback != null) {
                appLauncherCallback.setAppLaunchInfo(new AppLauncherInfo(lockdowndClient.getDevice(), appPath, productVersion, buildVersion));
            }

            // start debug service
            try (DebugServerClient client = new DebugServerClient(lockdowndClient.getDevice(), debugServerServiceDescriptor)) {
                log("Debug server port: " + debugServerServiceDescriptor.getPort());

                if (localPort != -1) {
                    String exe = ((NSDictionary) PropertyListParser.parse(new File(localAppPath, "Info.plist"))).objectForKey("CFBundleExecutable").toString();
                    log("launchios \"" + new File(localAppPath, exe).getAbsolutePath() + "\" \"" + appPath + "\" " + localPort);
                    StringBuilder argsString = new StringBuilder();
                    for (String arg : args) {
                        if (argsString.length() > 0) {
                            argsString.append(' ');
                        }
                        argsString.append(arg);
                    }
                    log("process launch -- " + argsString);
                }

                log("Remote app path: " + appPath);
                log("Launching app...");

                // just pipe stdout if no port forwarding should be done
                // otherwise perform port forwarding and stdout piping
                if(localPort == -1) {
                    return pipeStdOut(client, appPath);
                } else {
                    return forward(client, appPath);
                }
            }
        }
    }
    
    private int pipeStdOut(DebugServerClient client, String appPath) throws Exception {
        log("App Path: %s", appPath);

        // Talk to the debugserver using the GDB remote protocol.
        // See https://sourceware.org/gdb/onlinedocs/gdb/Remote-Protocol.html.
        // This process has been determined by observing how Xcode talks to
        // the debugserver. To enable GDB remote protocol logging in Xcode
        // write the following to ~/.lldbinit:
        //   log enable -v -f /tmp/gdb-remote.log gdb-remote all
        // Disable ack mode
        sendGdbPacket(client, "+");
        sendReceivePacket(client, encode("QStartNoAckMode"), "OK", true);
        sendGdbPacket(client, "+");

        // Disable buffered IO. Xcode does it so we do it too.
        sendReceivePacket(client, encode("QEnvironment:NSUnbufferedIO=YES"), "OK", false);
        // Set environment variables
        for (Entry<String, String> entry : env.entrySet()) {
            String cmd = String.format("QEnvironment:%s=%s", entry.getKey(), entry.getValue());
            sendReceivePacket(client, encode(cmd), "OK", false);
        }
        // Tell the debuserver to send threads:xxx,yyy,... in stop replies
        sendReceivePacket(client, encode("QListThreadsInStopReply"), "OK", false);
        // Initialize argv with the app path and args
        sendReceivePacket(client, encode("A" + encodeArgs(appPath)), "OK", false);
        // Make sure the launch was successful
        sendReceivePacket(client, encode("qLaunchSuccess"), "OK", false);
        // Continue
        sendGdbPacket(client, encode("c"));

        boolean wasInterrupted = false;
        try {
            while (true) {
                try {
                    String response = receiveGdbPacket(client);
                    String payload = decode(response);
                    if (payload.charAt(0) == 'W') {
                        // The app exited. The number following W is the exit code.
                        int exitCode = Integer.parseInt(payload.substring(1), 16);
                        return exitCode;
                    } else if (payload.charAt(0) == 'O') {
                        // Console output encoded as hex.
                        byte[] data = fromHex(payload.substring(1));
                        if (appLauncherCallback != null) {
                            data = appLauncherCallback.filterOutput(data);
                        }
                        stdout.write(data);
                    } else if (payload.charAt(0) == 'T') {
                        // Signal received. Just continue.
                        // The Continue packet looks like this (thread 0x2403 was interrupted by signal 0x0b):
                        //   $vCont;c:2603;c:2703;c:2803;c:2903;c:2a03;c:2b03;c:2c03;c:2d03;C0b:2403#ed
                        String signal = payload.substring(1, 3);
                        String data = payload.substring(3);
                        String threadId = data.replaceAll(".*thread:([0-9a-fA-F]+).*", "$1");
                        String allThreadIds = data.replaceAll(".*threads:([0-9a-fA-F,]+).*", "$1");
                        Set<String> ids = new TreeSet<>(Arrays.asList(allThreadIds.split(",")));
                        ids.remove(threadId);
                        StringBuilder sb = new StringBuilder("vCont;");
                        for (String id : ids) {
                            sb.append("c:").append(id).append(';');
                        }
                        sb.append('C').append(signal).append(':').append(threadId);
                        sendGdbPacket(client, encode(sb.toString()));
                    } else if (payload.charAt(0) == 'X') {
                        int signal = Integer.parseInt(payload.substring(1, 3), 16);
                        String data = payload.substring(3);
                        String description = null;
                        if (data.contains("description:")) {
                            description = new String(fromHex(data.replaceAll(".*description:([0-9a-fA-F]+).*", "$1")), StandardCharsets.UTF_8).trim();
                            description = description.trim();
                            description = description.isEmpty() ? null : description;
                        }
                        String message = signal > 0 ? "The app crashed with signal " + signal : "The app crashed";
                        if (description != null) {
                            message += ": " + description;
                        }
                        message += ". Check the device logs in Xcode (Window->Devices) for more info.";
                        throw new RuntimeException(message);
                    } else {
                        throw new RuntimeException("Unexpected response "
                                + "from debugserver: " + response);
                    }
                } catch (InterruptedIOException e) {
                    // Remember whether we were interrupted. kill() clears
                    // the thread's interrupted state and we want to reset it
                    // when we exit.
                    wasInterrupted = Thread.currentThread().isInterrupted();
                    kill(client);
                    // FIXME: don't wait to graceful response as recent libmobiledevice returns SSL_ERROR
                    return -1;
                }
            }
        } finally {
            if (wasInterrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private int forward(DebugServerClient client, String appPath) throws Exception {
        boolean wasInterrupted = false;
        Socket clientSocket = null;

        try(ServerSocket serverSocket = new ServerSocket(localPort)) {
            serverSocket.setReuseAddress(true);
            log("Waiting for GDB remote connection at http://127.0.0.1:" + localPort);
            clientSocket = serverSocket.accept();
            clientSocket.setTcpNoDelay(true);
            log("GDB remote client connected");
        }

        try (FileOutputStream fileOut = new FileOutputStream("/tmp/dbgout")){
            final InputStream in = clientSocket.getInputStream();
            final OutputStream out = clientSocket.getOutputStream();
            byte[] buffer = new byte[10 * 4096];
            GdbRemoteParser lldbParser = new GdbRemoteParser();
            GdbRemoteParser debugServerParser = new GdbRemoteParser();
            boolean nextPacketIsData = false;
            while (true) {
                try {
                    // check if the client send us something and forward
                    // it to the debug server. We may not get a full
                    // command here, but we don't really care
                    if(in.available() > 0) {
                        int readBytes = in.read(buffer);
                        int sent = 0;
                        while(sent != readBytes) {
                            sent += client.send(buffer, sent, readBytes - sent);
                        }
                        List<byte[]> messages = lldbParser.parse(buffer, 0, readBytes);
                        debugForward(fileOut, "lldb->debugserver: ", messages);
                        for(byte[] m: messages) {
                            if(m[1] == 'x') {
                                nextPacketIsData = true;
                                break;
                            }
                        }
                    }

                    // check if we've been interrupted
                    if (killed || Thread.currentThread().isInterrupted()) {
                        killed = true;
                        throw new InterruptedIOException();
                    }

                    // check if we got a reply from the debug server, wait
                    // for 10 milliseconds
                    try {
                        int readBytes = client.receive(buffer, 0, buffer.length, 1);
                        if(readBytes > 0) {
                            out.write(buffer, 0, readBytes);
                            out.flush();

                            List<byte[]> messages = debugServerParser.parse(buffer, 0, readBytes);
                            for(byte[] message: messages) {
                                if (message[1] == 'W') {
                                    // The app exited. The number following W is the exit code.
                                    int exitCode = Integer.parseInt(new String(message, 2, message.length - 2 - 3, StandardCharsets.US_ASCII), 16);
                                    return exitCode;
                                } else if (message[1] == 'O') {
                                    // Console output encoded as hex.
                                    if (!nextPacketIsData) {
                                        byte[] data = fromHex(message, 2, message.length - 2 - 3);
                                        if (appLauncherCallback != null) {
                                            data = appLauncherCallback.filterOutput(data);
                                        }
                                        stdout.write(data);
                                    } else {
                                        nextPacketIsData = false;
                                    }
                                }
                            }
                            debugForward(fileOut, "debugserver->lldb: ", messages);
                        }
                    } catch(Exception e) {
                        // nothing to do here, we simply didn't receive a message
                        // unless we get an exception from libIMobileDevice which
                        // means the device might be locked or crashed.
                        if(e instanceof LibIMobileDeviceException) {
                            throw new InterruptedIOException(e.getMessage());
                        }
                    }
                } catch (InterruptedIOException e) {
                    // Remember whether we were interrupted. kill() clears
                    // the thread's interrupted state and we want to reset it
                    // when we exit.
                    wasInterrupted = Thread.currentThread().isInterrupted();
                    kill(client);
                    // FIXME: don't wait to graceful response as recent libmobiledevice returns SSL_ERROR
                    return -1;
                }
            }
        } finally {
            clientSocket.close();
            if (wasInterrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void debugForward(OutputStream fileOut, String prefix, List<byte[]> messages) throws IOException {
        if(!debug) {
            return;
        }
        for(byte[] message: messages) {
            String msgStr = null;
            if(message.length > 256) {
                msgStr = "(" + message.length + ") " + new String(message, 0, 256, StandardCharsets.US_ASCII);
            } else {
                msgStr = new String(message, StandardCharsets.US_ASCII);
            }
            String msg = prefix + msgStr;
            fileOut.write(msg.getBytes(StandardCharsets.US_ASCII));
            fileOut.write('\n');
            System.out.println(msg);
        }
    }

    private void installInternal(LockdowndClient lockdowndClient) throws Exception {
        final LibIMobileDeviceException[] ex = new LibIMobileDeviceException[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Retrying<InstallationProxyClient> retrying = new Retrying<>(() -> {
            LockdowndServiceDescriptor instproxyService = lockdowndClient.startService(InstallationProxyClient.SERVICE_NAME);
            return new InstallationProxyClient(lockdowndClient.getDevice(), instproxyService);
        });
        try (retrying) {
            retrying.perform((instClient) -> {
                instClient.upgrade("/PublicStaging/" + localAppPath.getName(),
                        new Options().packageType(localAppPath.isDirectory() ? PackageType.Developer : null),
                        new StatusCallback() {
                            @Override
                            public void progress(String status, int percentComplete) {
                                if (installStatusCallback != null) {
                                    installStatusCallback.progress(status, percentComplete);
                                } else {
                                    log("[%3d%%] %s", 50 + percentComplete / 2, status);
                                }
                            }

                            @Override
                            public void success() {
                                try {
                                    if (installStatusCallback != null) {
                                        installStatusCallback.success();
                                    } else {
                                        log("[100%%] Installation complete");
                                    }
                                } finally {
                                    countDownLatch.countDown();
                                }
                            }

                            @Override
                            public void error(String message) {
                                try {
                                    ex[0] = new LibIMobileDeviceException(message);
                                    if (installStatusCallback != null) {
                                        installStatusCallback.error(message);
                                    } else {
                                        log("Error: %s", message);
                                    }
                                } finally {
                                    countDownLatch.countDown();
                                }
                            }
                        });
                countDownLatch.await();
            });
        }

        if (ex[0] != null) {
            throw ex[0];
        }
    }

    private void uploadInternal(LockdowndClient lockdowndClient) throws Exception {
        Retrying<AfcClient> retrying = new Retrying<>(() -> {
            LockdowndServiceDescriptor afcService = lockdowndClient.startService(AfcClient.SERVICE_NAME);
            return new AfcClient(lockdowndClient.getDevice(), afcService);
        });
        try (retrying) {
            retrying.perform((afcClient) -> {
                afcClient.upload(localAppPath, "/PublicStaging", new UploadProgressCallback() {
                    public void progress(File path, int percentComplete) {
                        if (uploadProgressCallback != null) {
                            uploadProgressCallback.progress(path, percentComplete);
                        } else {
                            log("[%3d%%] Uploading %s", percentComplete / 2, path);
                        }
                    }
                    public void success() {
                        if (uploadProgressCallback != null) {
                            uploadProgressCallback.success();
                        }
                    }
                    public void error(String message) {
                        if (uploadProgressCallback != null) {
                            uploadProgressCallback.error(message);
                        } else {
                            log("Error: %s", message);
                        }
                    }
                });
            });
        }
    }

    /**
     * Helper class that performs retry if skipable errors happen such as Device is locked
     * clientConstructor -- lambda that construct client that is passed into perform function
     */

    private class Retrying<Client extends AutoCloseable> implements AutoCloseable {

        final private int retries;
        final private int secondsBetweenRetries;
        private int retriesLeft;
        private Client client;
        private final CheckedSupplier<Client> clientConstructor;

        public Retrying(int retries, int secondsBetweenRetries, CheckedSupplier<Client> clientConstructor) {
            this.retries = retries;
            this.secondsBetweenRetries = secondsBetweenRetries;
            this.retriesLeft = retries;
            this.clientConstructor = clientConstructor;
        }

        public Retrying(CheckedSupplier<Client> clientConstructor) {
            this(launchOnLockedRetries, secondsBetweenLaunchOnLockedRetries, clientConstructor);
        }

        private void perform(CheckedConsumer<Client> action) throws Exception {
            perform((client) -> {
                action.accept(client);
                return null;
            });
        }

        private <R> R perform(CheckedFunction<Client, R> action) throws Exception {
            while (true) {
                try {
                    if (client == null)
                        client = clientConstructor.get();
                    R r = action.apply(client);
                    // reset retries
                    this.retriesLeft = retries;
                    return r;
                } catch (LibIMobileDeviceException e) {
                    // if error had happened client to be re-created on next retry if it is not fatal
                    if (client != null) {
                        try {
                            client.close();;
                        } catch (Exception ignored){
                        }
                        client = null;
                    }

                    String message = null;
                    boolean fatal = true;
                    // if there is no retries left threat it as fatal
                    if (retriesLeft > 0) {
                        retriesLeft -= 1;
                        // check if it can be skipped
                        if (e.getErrorCode() == LockdowndError.LOCKDOWN_E_USER_DENIED_PAIRING.swigValue()) {
                            message = "Device is not paired with your computer, unlock it and choose to trust this computer when prompted.";
                        } else if (e.getErrorCode() == LockdowndError.LOCKDOWN_E_PAIRING_DIALOG_RESPONSE_PENDING.swigValue()) {
                            message = "Pairing in progress. Please choose to trust this computer.";
                            fatal = false;
                        } else if (e.getErrorCode() == LockdowndError.LOCKDOWN_E_PASSWORD_PROTECTED.swigValue() ||
                            e.getErrorCode() == MobileImageMounterError.MOBILE_IMAGE_MOUNTER_E_DEVICE_LOCKED.swigValue()) {
                            message = "Device is locked. Please unlock to proceed.";
                            fatal = false;
                        }
                    }

                    if (message != null) {
                        if (!fatal) log(message + " (retry %d of %d)...", (retries - retriesLeft), retries);
                        else log(message);
                    }

                    if (fatal)
                        throw e;

                    Thread.sleep(secondsBetweenRetries * 1000L);
                }
            }
        }

        @Override
        public void close() throws Exception {
            if (client != null)
                client.close();
        }
    }

    public int launch() throws IOException {
        try {
            return launchInternal();
        } catch (IOException | RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (closeOutOnExit) {
                try {
                    stdout.close();
                } catch (Throwable t) {
                    // Ignore
                }
            }
        }
    }

    private static void printUsageAndExit() {
        System.err.println(AppLauncher.class.getName() + " ...");
        System.err.println("  -appid    the id (CFBundleIdentifier) of the app to launch.");
        System.err.println("  -b path   to app bundle directory or IPA containing the app to launch.");
        System.err.println("  -udid     id of the device to launch on. If not specified the first device will be used.");
        System.err.println("  -debug    enable debug output.");
        System.err.println("  -f port   forwards the debug server connection to the local port after the app has launched");
        System.err.println("  -env name=value\n" 
                         + "            adds an environment variable with the specified name and value.");
        System.err.println("  -args ... the rest of the command line will be passed on as args to the app.");
        System.exit(0);
    }
    
    public static void main(String[] args) throws Exception {
        String appId = null;
        File localAppPath = null;
        String[] arguments = new String[0];
        Map<String, String> env = new HashMap<>();
        boolean debug = false;
        String deviceId = null;
        int forwardPort = -1;
        
        int i = 0;
        loop: while (i < args.length) {
            switch (args[i++]) {
            case "-h":
            case "-help":
                printUsageAndExit();
                break;
            case "-appid":
                appId = args[i++];
                break;
            case "-b":
                localAppPath = new File(args[i++]);
                break;
            case "-f":
                forwardPort = Integer.parseInt(args[i++]);
                break;
            case "-udid":
                deviceId = args[i++];
                break;
            case "-env":
                String[] parts = args[i++].split("=", 2);
                env.put(parts[0], parts[1]);
                break;
            case "-debug":
                debug = true;
                break;
            case "-args":
                arguments = Arrays.copyOfRange(args, i, args.length);
                break loop;
            }
        }
        
        if (appId == null && localAppPath == null) {
            printUsageAndExit();
        }
        
        AppLauncher launcher;
        if (localAppPath != null) {
            launcher = new AppLauncher(deviceId, localAppPath);
        } else {
            launcher = new AppLauncher(deviceId, appId);
        }
        
        System.exit(launcher
                .args(arguments)
                .env(env)
                .debug(debug)
                .forward(forwardPort)
                .launch());
    }
}
