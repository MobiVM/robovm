/*
 * Copyright (C) 2012 RoboVM AB
 * Copyright (C) 2018 Daniel Thommes, NeverNull GmbH, <daniel.thommes@nevernull.io>
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

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.PrefixFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.lang3.tuple.Pair;
import org.robovm.compiler.CompilerException;
import org.robovm.compiler.config.AppExtension;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.config.Resource;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.AbstractTarget;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.Launcher;
import org.robovm.compiler.target.ios.ProvisioningProfile.Type;
import org.robovm.compiler.util.Executor;
import org.robovm.compiler.util.ToolchainUtil;
import org.robovm.compiler.util.io.OpenOnWriteFileOutputStream;
import org.robovm.libimobiledevice.AfcClient.UploadProgressCallback;
import org.robovm.libimobiledevice.IDevice;
import org.robovm.libimobiledevice.InstallationProxyClient.StatusCallback;
import org.robovm.libimobiledevice.util.AppLauncher;
import org.robovm.libimobiledevice.util.AppLauncherCallback;

import com.dd.plist.NSArray;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSNumber;
import com.dd.plist.NSObject;
import com.dd.plist.NSString;
import com.dd.plist.PropertyListParser;

/**
 * @author niklas
 *
 */
public class IOSTarget extends AbstractTarget {
    final List<String> excludedKeys = Arrays.asList(
        "com.apple.developer.icloud-container-development-container-identifiers",
        "com.apple.developer.icloud-container-environment",
        "com.apple.developer.icloud-container-identifiers",
        "com.apple.developer.icloud-services",
        "com.apple.developer.restricted-resource-mode",
        "com.apple.developer.ubiquity-container-identifiers",
        "com.apple.developer.ubiquity-kvstore-identifier",
        "inter-app-audio",
        "com.apple.developer.homekit",
        "com.apple.developer.healthkit",
        "com.apple.developer.in-app-payments",
        "com.apple.developer.associated-domains",
        "com.apple.security.application-groups",
        "com.apple.developer.maps",
        "com.apple.developer.networking.vpn.api",
        "com.apple.external-accessory.wireless-configuration"
    );

    public static final String TYPE = "ios";

    private static File iosSimPath;

    private Arch arch;
    private SDK sdk;    
    private File entitlementsPList;
    private SigningIdentity signIdentity;
    private ProvisioningProfile provisioningProfile;
    private IDevice device;
    private File partialPListDir;

    public IOSTarget() {}

    public String getType() {
        return TYPE;
    }

    @Override
    public Arch getArch() {
        return arch;
    }

    @Override
    public LaunchParameters createLaunchParameters() {
        if (isSimulatorArch(arch)) {
            return new IOSSimulatorLaunchParameters();
        }
        return new IOSDeviceLaunchParameters();
    }

    public static boolean isSimulatorArch(Arch arch) {
        return arch == Arch.x86 || arch == Arch.x86_64;
    }

    public static boolean isDeviceArch(Arch arch) {
        return arch == Arch.thumbv7 || arch == Arch.arm64;
    }

    /**
     * Late initialization as we cannot assume that the tmp dir is available at configuration creation
     *
     * @return
     */
    private File getPartialPListDir() {
        if (!partialPListDir.exists()) {
            partialPListDir.mkdirs();
        }
        return partialPListDir;
    }

    public List<SDK> getSDKs() {
        if (isSimulatorArch(arch)) {
            return SDK.listSimulatorSDKs();
        } else {
            return SDK.listDeviceSDKs();
        }
    }

    /**
     * Returns the {@link IDevice} when an app has been launched on a device.
     * Returns {@code null} before {@link #launch(LaunchParameters)} has been
     * called or if the app was launched in the simulator.
     */
    public IDevice getDevice() {
        return device;
    }

    @Override
    protected Launcher createLauncher(LaunchParameters launchParameters) throws IOException {
        if (isSimulatorArch(arch)) {
            return createIOSSimLauncher(launchParameters);
        } else {
            return createIOSDevLauncher(launchParameters);
        }
    }

    private Launcher createIOSSimLauncher(LaunchParameters launchParameters) throws IOException {
        File dir = getAppDir();

        String iosSimPath = new File(config.getHome().getBinDir(), "simlauncher").getAbsolutePath();;

        IOSSimulatorLaunchParameters simulatorLaunchParameters = (IOSSimulatorLaunchParameters) launchParameters;
        
        List<Object> args = new ArrayList<Object>();
        args.add("-a=" + dir);
        args.add("-u=" + simulatorLaunchParameters.getDeviceType().getUdid());
        
        if (launchParameters.getEnvironment() != null) {
            for (Entry<String, String> entry : launchParameters.getEnvironment().entrySet()) {
                args.add("-e="+ entry.getKey() + "=" + entry.getValue() + "");
            }
        }

        if (!launchParameters.getArguments().isEmpty()) {
        	for (String entry : launchParameters.getArguments()) {
                args.add("-x=" + entry);
            }        
        }

        File xcodePath = new File(ToolchainUtil.findXcodePath());
        Map<String, String> env = Collections.singletonMap("DEVELOPER_DIR", xcodePath.getAbsolutePath());
        
        OutputStream out = System.out;
        OutputStream err = System.err;
        if (launchParameters.getStdoutFifo() != null) {
            out = new OpenOnWriteFileOutputStream(launchParameters.getStdoutFifo());
        }
        if (launchParameters.getStderrFifo() != null) {
            err = new OpenOnWriteFileOutputStream(launchParameters.getStderrFifo());
        }
        
        return new Executor(config.getLogger(), iosSimPath)
                .args(args)
                .wd(launchParameters.getWorkingDirectory())
                .out(out).err(err).closeOutputStreams(true)
                .inheritEnv(false)
                .env(env);
    }

    private Launcher createIOSDevLauncher(LaunchParameters launchParameters)
            throws IOException {

        IOSDeviceLaunchParameters deviceLaunchParameters = (IOSDeviceLaunchParameters) launchParameters;
        String deviceId = deviceLaunchParameters.getDeviceId();
        int forwardPort = deviceLaunchParameters.getForwardPort();
        AppLauncherCallback callback = deviceLaunchParameters.getAppPathCallback();
        if (deviceId == null) {
            String[] udids = IDevice.listUdids();
            if (udids.length == 0) {
                throw new RuntimeException("No devices connected");
            }
            if (udids.length > 1) {
                config.getLogger().warn("More than 1 device connected (%s). "
                        + "Using %s.", Arrays.asList(udids), udids[0]);
            }
            deviceId = udids[0];
        }
        device = new IDevice(deviceId);

        OutputStream out = null;
        if (launchParameters.getStdoutFifo() != null) {
            out = new OpenOnWriteFileOutputStream(launchParameters.getStdoutFifo());
        } else {
            out = System.out;
        }

        Map<String, String> env = launchParameters.getEnvironment();
        if (env == null) {
            env = new HashMap<>();
        }
        //Fix for #71, see http://stackoverflow.com/questions/37800790/hide-strange-unwanted-xcode-8-logs
        env.put("OS_ACTIVITY_DT_MODE", "");

        AppLauncher launcher = new AppLauncher(device, getAppDir()) {
            protected void log(String s, Object... args) {
                config.getLogger().info(s, args);
            }
        }
                .stdout(out)
                .closeOutOnExit(true)
                .args(launchParameters.getArguments().toArray(new String[0]))
                .env(env)
                .forward(forwardPort)
                .appLauncherCallback(callback)
                .xcodePath(ToolchainUtil.findXcodePath())
                .uploadProgressCallback(new UploadProgressCallback() {
                    boolean first = true;

                    public void success() {
                        config.getLogger().info("[100%%] Upload complete");
                    }

                    public void progress(File path, int percentComplete) {
                        if (first) {
                            config.getLogger().info("[  0%%] Beginning upload...");
                        }
                        first = false;
                        config.getLogger().info("[%3d%%] Uploading %s...", percentComplete, path);
                    }

                    public void error(String message) {}
                })
                .installStatusCallback(new StatusCallback() {
                    boolean first = true;

                    public void success() {
                        config.getLogger().info("[100%%] Install complete");
                    }

                    public void progress(String status, int percentComplete) {
                        if (first) {
                            config.getLogger().info("[  0%%] Beginning installation...");
                        }
                        first = false;
                        config.getLogger().info("[%3d%%] %s", percentComplete, status);
                    }

                    public void error(String message) {}
                });

        return new AppLauncherProcess(config.getLogger(), launcher, launchParameters);
    }

    @Override
    protected void doBuild(File outFile, List<String> ccArgs,
            List<File> objectFiles, List<String> libArgs)
            throws IOException {

        // Always link against UIKit or else it will not be initialized properly
        // causing problems with UIAlertView and maybe other classes on iOS 7
        // (#195)
        if (!config.getFrameworks().contains("UIKit")) {
            libArgs.add("-framework");
            libArgs.add("UIKit");
        }

        String minVersion = getMinimumOSVersion();

        int majorVersionNumber = -1;
        try {
            majorVersionNumber = Integer.parseInt(minVersion.substring(0, minVersion.indexOf('.')));
            int minMajorSupportedVersion = Integer.parseInt(minVersion.substring(0, config.getOs().getMinVersion().indexOf('.')));

            if (majorVersionNumber < minMajorSupportedVersion) {
                throw new CompilerException("MinimumOSVersion of " + minVersion + " is not supported. "
                    + "The minimum version for this platform is " + config.getOs().getMinVersion());
            }

        } catch (NumberFormatException e) {
            throw new CompilerException("Failed to get major version number from "
                    + "MinimumOSVersion string '" + minVersion + "'");
        }
        if (isDeviceArch(arch)) {
            ccArgs.add("-miphoneos-version-min=" + minVersion);
            if (config.isDebug()) {
                ccArgs.add("-Wl,-no_pie");
            }
        } else {
            ccArgs.add("-mios-simulator-version-min=" + minVersion);
            if (config.getArch() == Arch.x86 || config.isDebug()) {
                ccArgs.add("-Wl,-no_pie");
            }
        }
        ccArgs.add("-isysroot");
        ccArgs.add(sdk.getRoot().getAbsolutePath());

        // specify sdk version for linker
        libArgs.add("-Xlinker");
        libArgs.add("-sdk_version");
        libArgs.add("-Xlinker");
        libArgs.add(sdk.getVersion());

        // specify dynamic library loading path
        libArgs.add("-Xlinker");
        libArgs.add("-rpath");
        libArgs.add("-Xlinker");
        libArgs.add("@executable_path/Frameworks");
        libArgs.add("-Xlinker");
        libArgs.add("-rpath");
        libArgs.add("-Xlinker");
        libArgs.add("@loader_path/Frameworks");
        
        super.doBuild(outFile, ccArgs, objectFiles, libArgs);
    }

    protected void prepareInstall(File installDir) throws IOException {
        createInfoPList(installDir);
        generateDsym(installDir, getExecutable(), false);

        if (isDeviceArch(arch)) {
            // only strip if this is not a debug build, otherwise
            // LLDB can't resolve the DWARF info
            if (!config.isDebug()) {
                strip(installDir, getExecutable());
            }            
            if (config.isIosSkipSigning()) {
                config.getLogger().warn("Skipping code signing. The resulting app will "
                        + "be unsigned and will not run on unjailbroken devices");
                ldid(entitlementsPList, installDir);
            } else {
                // Copy the provisioning profile
                copyProvisioningProfile(provisioningProfile, installDir);
                boolean getTaskAllow = provisioningProfile.getType() == Type.Development;
                signFrameworks(signIdentity, installDir);
                provisionAppExtensions(signIdentity, installDir);
                signAppExtensions(signIdentity, installDir, getTaskAllow);
                codesignApp(signIdentity, getOrCreateEntitlementsPList(getTaskAllow, getBundleId()), installDir);
            }
        }
    }

    private void copyProvisioningProfile(ProvisioningProfile profile, File destDir) throws IOException {
        config.getLogger().info("Copying %s provisioning profile: %s (%s)",
                profile.getType(),
                profile.getName(),
                profile.getEntitlements().objectForKey("application-identifier"));
        FileUtils.copyFile(profile.getFile(), new File(destDir, "embedded.mobileprovision"));
    }

    @Override
    public void prepareLaunch() throws IOException {
        prepareLaunch(getAppDir());
    }


    protected void prepareLaunch(File appDir) throws IOException {
        super.doInstall(appDir, getExecutable(), appDir);
        createInfoPList(appDir);
        generateDsym(appDir, getExecutable(), true);

        if (isDeviceArch(arch)) {            
            if (config.isIosSkipSigning()) {
                config.getLogger().warn("Skiping code signing. The resulting app will "
                        + "be unsigned and will not run on unjailbroken devices");
                ldid(getOrCreateEntitlementsPList(true, getBundleId()), appDir);
            } else {
                copyProvisioningProfile(provisioningProfile, appDir);
                boolean getTaskAllow = provisioningProfile.getType() == Type.Development;
                signFrameworks(signIdentity, appDir);
                provisionAppExtensions(signIdentity, appDir);
                signAppExtensions(signIdentity, appDir, getTaskAllow);
                // sign the app
                codesignApp(signIdentity, getOrCreateEntitlementsPList(getTaskAllow, getBundleId()), appDir);
            }
        } else { // simulator
            if (sdk.getVersionCode() >= 0x0B0300) {
                // code signing of frameworks and app extensions are required since iOS 11.3
                signFrameworks(SigningIdentity.ADHOC, appDir);
                signAppExtensions(SigningIdentity.ADHOC, appDir, true);
            }
        }
    }

    private void signFrameworks(SigningIdentity identity, File appDir) throws IOException {
        // sign dynamic frameworks first
        File frameworksDir = new File(appDir, "Frameworks");
        if (frameworksDir.exists() && frameworksDir.isDirectory()) {
            // Sign swift rt libs
            for (File swiftLib : frameworksDir.listFiles()) {
                if (swiftLib.getName().endsWith(".dylib")) {
                    codesignSwiftLib(identity, swiftLib);
                }
            }

            // sign embedded frameworks
            for (File framework : frameworksDir.listFiles()) {
                if (framework.isDirectory() && framework.getName().endsWith(".framework")) {
                    codesignCustomFramework(identity, framework);
                }
            }
        }
    }

    private void signAppExtensions(SigningIdentity identity, File appDir, boolean getTaskAllow) throws IOException {
        // sign dynamic frameworks first
        File extensionsDir = new File(appDir, "PlugIns");
        if (extensionsDir.exists() && extensionsDir.isDirectory()) {
            // sign embedded app-extensions
            for (File extension : extensionsDir.listFiles()) {
                if (extension.isDirectory() && extension.getName().endsWith(".appex")) {
                    File entitlements = null;
                    if (provisioningProfile != null) {
                        String bundleId =  provisioningProfile.getAppIdPrefix() + "." + getBundleId() + "." + extension.getName().replace(".appex", "");
                        entitlements = createEntitlementForAppEx(getTaskAllow, bundleId);
                    }

                    // now sign
                    codesignAppExtension(identity, entitlements, extension);
                }
            }
        }
    }

    /**
     * generates simple emtitlement plist which is required for AppEx during submit to app store
     */
    private File createEntitlementForAppEx(boolean getTaskAllow, String bundleId) throws IOException {
        try {
            File destFile = new File(config.getTmpDir(), "AppExtEntitlements.plist");
            NSDictionary dict = (NSDictionary) PropertyListParser.parse(IOUtils.toByteArray(getClass().getResourceAsStream(
                        "/Entitlements.plist")));
            dict.put("application-identifier", bundleId);
            dict.put("get-task-allow", getTaskAllow);
            PropertyListParser.saveAsXML(dict, destFile);
            return destFile;
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * finds and copies provisioning profile for AppExtension
     * @param signIdentity that matches profile
     * @param installDir of application
     */
    private void provisionAppExtensions(SigningIdentity signIdentity, File installDir) throws IOException {
        File pluginsDir = new File(installDir, "PlugIns");

        for (AppExtension extension : config.getAppExtensions()) {
            // find extension
            ProvisioningProfile appExtProfile;
            String profileName = extension.getProfile();
            if (profileName != null) {
                // profile is specified in robovm.xml
                appExtProfile = ProvisioningProfile.find(ProvisioningProfile.list(), profileName);
            } else {
                // find profile that matches app ext bundle id
                String bundleId = getBundleId() + "." + extension.getName();
                appExtProfile = ProvisioningProfile.find(ProvisioningProfile.list(), signIdentity, bundleId);
            }


            if (appExtProfile != null) {
                File extPath = new File(pluginsDir, extension.getName() + ".appex");
                config.getLogger().info("Copying %s provisioning profile for : %s (%s)",
                        appExtProfile.getType(),
                        appExtProfile.getName(),
                        appExtProfile.getEntitlements().objectForKey("application-identifier"));
                FileUtils.copyFile(appExtProfile.getFile(), new File(extPath, "embedded.mobileprovision"));
            } else {

            }
            if (provisioningProfile == null) {
                String bundleId = "*";
                if (config.getIosInfoPList() != null && config.getIosInfoPList().getBundleIdentifier() != null) {
                    bundleId = config.getIosInfoPList().getBundleIdentifier();
                }
                provisioningProfile = ProvisioningProfile.find(ProvisioningProfile.list(), signIdentity, bundleId);
            }


        }
    }

    private void codesignApp(SigningIdentity identity, File entitlementsPList, File appDir) throws IOException {
        config.getLogger().info("Code signing app using identity '%s' with fingerprint %s", identity.getName(),
                identity.getFingerprint());
        codesign(identity, entitlementsPList, false, false, true, appDir);
    }

    private void codesignSwiftLib(SigningIdentity identity, File swiftLib) throws IOException {
        config.getLogger().info("Code signing swift dylib '%s' using identity '%s' with fingerprint %s", swiftLib.getName(), identity.getName(),
                identity.getFingerprint());
        codesign(identity, null, false, true, false, swiftLib);
    }

    private void codesignCustomFramework(SigningIdentity identity, File frameworkDir) throws IOException {
        config.getLogger().info("Code signing framework '%s' using identity '%s' with fingerprint %s", frameworkDir.getName(), identity.getName(),
                identity.getFingerprint());
        codesign(identity, null, true, false, true, frameworkDir);
    }

    private void codesignAppExtension(SigningIdentity identity, File entitlementsPList, File extensionDir) throws IOException {
        config.getLogger().info("Code signing app-extension '%s' using identity '%s' with fingerprint %s", extensionDir.getName(), identity.getName(),
                identity.getFingerprint());
        codesign(identity, entitlementsPList, false, false, true, extensionDir);
    }

    private void codesign(SigningIdentity identity, File entitlementsPList, boolean preserveMetadata, boolean verbose, boolean allocate, File target) throws IOException {
        List<Object> args = new ArrayList<Object>();
        args.add("-f");
        args.add("-s");
        args.add(identity.getFingerprint());
        if (entitlementsPList != null) {
            args.add("--entitlements");
            args.add(entitlementsPList);
        }
        if (preserveMetadata) {
            args.add("--preserve-metadata=identifier,entitlements");
        }
        if (verbose) {
            args.add("--verbose");
        }
        args.add(target);
        Executor executor = new Executor(config.getLogger(), "codesign");
        if (allocate) {
            executor.addEnv("CODESIGN_ALLOCATE", ToolchainUtil.findXcodeCommand("codesign_allocate", "iphoneos"));
        }
        executor.args(args);
        executor.exec();
    }

    private void ldid(File entitlementsPList, File appDir) throws IOException {
        File executableFile = new File(appDir, getExecutable());
        config.getLogger().info("Pseudo-signing %s", executableFile.getAbsolutePath());
        List<Object> args = new ArrayList<Object>();
        if (entitlementsPList != null) {
            args.add("-S" + entitlementsPList.getAbsolutePath());
        } else {
            args.add("-S");
        }
        args.add(executableFile);
        new Executor(config.getLogger(), new File(config.getHome().getBinDir(), "ldid"))
                .args(args)
                .exec();
    }

    private File getOrCreateEntitlementsPList(boolean getTaskAllow, String bundleId) throws IOException {
        try {
            File destFile = new File(config.getTmpDir(), "Entitlements.plist");
            NSDictionary dict = null;
            if (entitlementsPList != null) {
                dict = (NSDictionary) PropertyListParser.parse(entitlementsPList);
            } else {
                dict = (NSDictionary) PropertyListParser.parse(IOUtils.toByteArray(getClass().getResourceAsStream(
                        "/Entitlements.plist")));
            }
            if (provisioningProfile != null) {
                NSDictionary profileEntitlements = provisioningProfile.getEntitlements();
                for (String key : profileEntitlements.allKeys()) {
                    if (dict.objectForKey(key) == null && !excludedKeys.contains(key)) {
                        dict.put(key, profileEntitlements.objectForKey(key));
                    }
                }
                dict.put("application-identifier", provisioningProfile.getAppIdPrefix() + "." + bundleId);
            }
            dict.put("get-task-allow", getTaskAllow);
            PropertyListParser.saveAsXML(dict, destFile);
            return destFile;
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void generateDsym(final File dir, final String executable, boolean copyToIndexedDir) throws IOException {
        final File dsymDir = new File(dir.getParentFile(), dir.getName() + ".dSYM");
        final File exePath = new File(dir, executable);
        FileUtils.deleteDirectory(dsymDir);
        final Process process = new Executor(config.getLogger(), "xcrun")
                .args("dsymutil", "-o", dsymDir, exePath)
                .execAsync();
        if (copyToIndexedDir) {
            new Thread() {
                public void run() {
                    try {
                        process.waitFor();
                    } catch (InterruptedException e) {
                        return;
                    }
                    copyToIndexedDir(dir, executable, dsymDir, exePath);
                }
            }.start();
        }
    }

    private void strip(File dir, String executable) throws IOException {
        new Executor(config.getLogger(), "xcrun")
                .args("strip", "-x", new File(dir, executable))
                .exec();
    }

    @Override
    protected void doInstall(File installDir, String executable, File resourcesDir) throws IOException {
        super.doInstall(installDir, getExecutable(), resourcesDir);
        prepareInstall(installDir);
    }

    @Override
    protected Process doLaunch(LaunchParameters launchParameters) throws IOException {
        // in IDEA prepare for launch is happening during build phase to not block calling thread
        // all other plugins will prepare here
        if (!config.isManuallyPreparedForLaunch())
            prepareLaunch();
        Process process = super.doLaunch(launchParameters);
        return process;
    }

    @Override
    public List<Arch> getDefaultArchs() {
        return Arrays.asList(Arch.thumbv7, Arch.arm64);
    }

    public void archive() throws IOException {
        config.getLogger().info("Creating IPA in %s", config.getInstallDir());
        config.getInstallDir().mkdirs();
        File tmpDir = new File(config.getInstallDir(), getExecutable() + ".app");
        FileUtils.deleteDirectory(tmpDir);
        tmpDir.mkdirs();
        super.doInstall(tmpDir, getExecutable(), tmpDir);
        prepareInstall(tmpDir);
        packageApplication(tmpDir);
    }

    private void packageApplication(File appDir) throws IOException {
        File ipaFile = new File(config.getInstallDir(), getExecutable() + ".ipa");
        config.getLogger().info("Packaging IPA %s from %s", ipaFile.getName(), appDir.getName());

        File tmpDir = new File(config.getInstallDir(), "ipabuild");
        FileUtils.deleteDirectory(tmpDir);
        tmpDir.mkdirs();

        File payloadDir = new File(tmpDir, "Payload");
        payloadDir.mkdir();
        config.getLogger().info("Copying %s to %s", appDir.getName(), payloadDir);
        new Executor(config.getLogger(), "cp")
                .args("-Rp", appDir, payloadDir)
                .exec();

        File frameworksDir = new File(appDir, "Frameworks");
        if (frameworksDir.exists()){
            String[] swiftLibs = frameworksDir.list(new AndFileFilter(
                    new PrefixFileFilter("libswift"),
                    new SuffixFileFilter(".dylib")));

            if (swiftLibs != null && swiftLibs.length > 0){
                File swiftSupportDir = new File(tmpDir, "SwiftSupport");

                // append OS name subfolder same as XCode does
                if (config.getOs() == OS.ios) {
                    if (config.getArch().isArm()) {
                        swiftSupportDir = new File(swiftSupportDir, "iphoneos");
                    }
                } else {
                    swiftSupportDir = new File(swiftSupportDir, "mac");
                }

                swiftSupportDir.mkdirs();
                copySwiftLibs(Arrays.asList(swiftLibs), swiftSupportDir, false);
            }
        }

        // check app extension and add suport files if needed
        File pluginsDir = new File(appDir, "PlugIns");
        if (pluginsDir.exists()){
            String[] plugins = pluginsDir.list();
            if (plugins != null && plugins.length > 0) {
                final String iStickersExtId = "com.apple.message-payload-provider";
                boolean hasStickers = false;
                for (String p : plugins) {
                    File infoPlistFile = new File(new File(pluginsDir, p), "Info.plist");
                    if (!infoPlistFile.exists())
                        continue;
                    try {
                        NSDictionary infoPlist = (NSDictionary)PropertyListParser.parse(infoPlistFile);
                        NSDictionary extensionDict = (NSDictionary) infoPlist.get("NSExtension");
                        if (extensionDict != null) {
                            hasStickers |= iStickersExtId.equals(extensionDict.get("NSExtensionPointIdentifier").toJavaObject());
                            // other ext types should go here if requried
                        }
                    } catch (Exception ignored) {
                    }
                }

                // provide support
                if (hasStickers) {
                    // for stickers extension
                    config.getLogger().info("Copying support files for Stickers app extension");
                    File xcodePath = new File(ToolchainUtil.findXcodePath());
                    File stickersExtSupportStub = new File(xcodePath, "Platforms/iPhoneOS.platform/Library/" +
                            "Application Support/MessagesApplicationExtensionStub/MessagesApplicationExtensionStub");
                    if (!stickersExtSupportStub.exists()) {
                        throw new FileNotFoundException("Stickers support: bi MessagesApplicationStub or MessagesApplicationExtensionStub found in "
                                + new File(xcodePath, "Platforms/iPhoneOS.platform/Library/Application Support/").getAbsolutePath());
                    }

                    File stickersExtSupportDestDir = new File(tmpDir, "MessagesApplicationExtensionSupport");

                    stickersExtSupportDestDir.mkdir();
                    Files.copy(stickersExtSupportStub.toPath(), new File(stickersExtSupportDestDir, stickersExtSupportStub.getName()).toPath(),
                            StandardCopyOption.COPY_ATTRIBUTES);
                }
            }
        }

        config.getLogger().info("Zipping %s to %s", tmpDir, ipaFile);
        new Executor(Logger.NULL_LOGGER, "zip")
                .wd(tmpDir)
                .args("--symlinks", "--recurse-paths", ipaFile, ".")
                .exec();

        config.getLogger().info("Deleting temp dir %s", tmpDir);
        FileUtils.deleteDirectory(tmpDir);
    }

    @Override
    protected boolean processDir(Resource resource, File dir, File destDir) throws IOException {
        if (dir.getName().endsWith(".atlas")) {
            destDir.mkdirs();

            ToolchainUtil.textureatlas(config, dir, destDir);
            return false;
        } else if (dir.getName().endsWith(".xcassets")) {
            ToolchainUtil.actool(config, createPartialInfoPlistFile(dir), dir, getAppDir());
            return false;
        }
        return super.processDir(resource, dir, destDir);
    }

    @Override
    protected void copyFile(Resource resource, File file, File destDir)
            throws IOException {

        if (isDeviceArch(arch) && !resource.isSkipPngCrush()
                && file.getName().toLowerCase().endsWith(".png")) {
            destDir.mkdirs();
            File outFile = new File(destDir, file.getName());
            ToolchainUtil.pngcrush(config, file, outFile);
        } else if (file.getName().toLowerCase().endsWith(".strings")) {
            destDir.mkdirs();
            File outFile = new File(destDir, file.getName());
            ToolchainUtil.compileStrings(config, file, outFile);
        } else if (file.getName().toLowerCase().endsWith(".storyboard")) {
            destDir.mkdirs();
            ToolchainUtil.ibtool(config, createPartialInfoPlistFile(file), file, destDir);
        } else if (file.getName().toLowerCase().endsWith(".xib")) {
            destDir.mkdirs();
            String fileName = file.getName();
            fileName = fileName.substring(0, fileName.lastIndexOf('.')) + ".nib";
            File outFile = new File(destDir, fileName);
            ToolchainUtil.ibtool(config, createPartialInfoPlistFile(file), file, outFile);
        } else {
            super.copyFile(resource, file, destDir);
        }
    }

    private File createPartialInfoPlistFile(File f) throws IOException {
        File tmpFile = File.createTempFile(f.getName() + "_", ".plist", getPartialPListDir());
        tmpFile.delete();
        return tmpFile;
    }

    protected File getAppDir() {
        File dir = null;
        if (!config.isSkipInstall()) {
            dir = new File(config.getInstallDir(), getExecutable() + ".app");
            if (!dir.exists()) {
                dir = config.getInstallDir();
            }
        } else {
            dir = new File(config.getTmpDir(), getExecutable() + ".app");
            dir.mkdirs();
        }
        return dir;
    }

    @Override
    protected String getExecutable() {
        if (config.getIosInfoPList() != null) {
            String bundleExecutable = config.getIosInfoPList().getBundleExecutable();
            if (bundleExecutable != null) {
                return bundleExecutable;
            }
        }
        return config.getExecutableName();
    }

    @Override
    protected String getBundleId() {
        if (config.getIosInfoPList() != null) {
            String bundleIdentifier = config.getIosInfoPList().getBundleIdentifier();
            if (bundleIdentifier != null) {
                return bundleIdentifier;
            }
        }
        return config.getMainClass() != null ? config.getMainClass() : config.getExecutableName();
    }

    protected String getMinimumOSVersion() {
        if (config.getIosInfoPList() != null) {
            String minVersion = config.getIosInfoPList().getMinimumOSVersion();
            if (minVersion != null) {
                return minVersion;
            }
        }
        return config.getOs().getMinVersion();
    }

    private void putIfAbsent(NSDictionary dict, String key, String value) {
        if (dict.objectForKey(key) == null) {
            dict.put(key, value);
        }
    }
    
    protected void customizeInfoPList(NSDictionary dict) {
        if (isSimulatorArch(arch)) {
            dict.put("CFBundleSupportedPlatforms", new NSArray(new NSString("iPhoneSimulator")));
        } else {            
            dict.put("CFBundleSupportedPlatforms", new NSArray(new NSString("iPhoneOS")));
            dict.put("DTPlatformVersion", sdk.getPlatformVersion());
            dict.put("DTPlatformBuild", sdk.getPlatformBuild());
            dict.put("DTSDKBuild", sdk.getBuild());

            // Validation fails without DTXcode and DTXcodeBuild. Try to read
            // them from the installed Xcode.
            try {
                File versionPListFile = new File(new File(ToolchainUtil.findXcodePath()).getParentFile(),
                        "version.plist");
                NSDictionary versionPList = (NSDictionary) PropertyListParser.parse(versionPListFile);
                File xcodeInfoPListFile = new File(new File(ToolchainUtil.findXcodePath()).getParentFile(),
                        "Info.plist");
                NSDictionary xcodeInfoPList = (NSDictionary) PropertyListParser.parse(xcodeInfoPListFile);
                NSString dtXcodeBuild = (NSString) versionPList.objectForKey("ProductBuildVersion");
                if (dtXcodeBuild == null) {
                    throw new NoSuchElementException("No ProductBuildVersion in " + versionPListFile.getAbsolutePath());
                }
                NSString dtXcode = (NSString) xcodeInfoPList.objectForKey("DTXcode");
                if (dtXcode == null) {
                    throw new NoSuchElementException("No DTXcode in " + xcodeInfoPListFile.getAbsolutePath());
                }
                putIfAbsent(dict, "DTXcode", dtXcode.toString());
                putIfAbsent(dict, "DTXcodeBuild", dtXcodeBuild.toString());
            } catch (Exception e) {
                config.getLogger()
                        .warn("Failed to read DTXcodeBuild/DTXcode from current Xcode install. Will use fake values. (%s: %s)",
                                e.getClass().getName(), e.getMessage());
            }
            // Fake Xcode 6.1.1 values if the above fails.
            putIfAbsent(dict, "DTXcode", "0611");
            putIfAbsent(dict, "DTXcodeBuild", "6A2008a");
        }
    }

    protected void createInfoPList(File dir) throws IOException {
        NSDictionary dict = new NSDictionary();
        if (config.getIosInfoPList() != null && config.getIosInfoPList().getDictionary() != null) {
            NSDictionary infoPListDict = config.getIosInfoPList().getDictionary();
            for (String key : infoPListDict.allKeys()) {
                dict.put(key, infoPListDict.objectForKey(key));
            }
        } else {
            dict.put("CFBundleVersion", "1.0");
            dict.put("CFBundleExecutable", config.getExecutableName());
            dict.put("CFBundleName", config.getExecutableName());
            dict.put("CFBundleIdentifier", getBundleId());
            dict.put("CFBundlePackageType", "APPL");
            dict.put("LSRequiresIPhoneOS", true);
            NSObject supportedDeviceFamilies = sdk.getDefaultProperty("SUPPORTED_DEVICE_FAMILIES");
            if (supportedDeviceFamilies != null) {
                // SUPPORTED_DEVICE_FAMILIES is either a NSString of comma
                // separated numbers
                // or an NSArray with NSStrings. UIDeviceFamily values should be
                // NSNumbers.
                NSArray families = null;
                if (supportedDeviceFamilies instanceof NSString) {
                    NSString defFamilies = (NSString) supportedDeviceFamilies;
                    String[] parts = defFamilies.toString().split(",");
                    families = new NSArray(parts.length);
                    for (int i = 0; i < families.count(); i++) {
                        families.setValue(i, new NSNumber(parts[i].trim()));
                    }
                } else {
                    NSArray defFamilies = (NSArray) supportedDeviceFamilies;
                    families = new NSArray(defFamilies.count());
                    for (int i = 0; i < families.count(); i++) {
                        families.setValue(i, new NSNumber(defFamilies.objectAtIndex(i).toString()));
                    }
                }
                dict.put("UIDeviceFamily", families);
            }
            dict.put("UISupportedInterfaceOrientations", new NSArray(
                    new NSString("UIInterfaceOrientationPortrait"),
                    new NSString("UIInterfaceOrientationLandscapeLeft"),
                    new NSString("UIInterfaceOrientationLandscapeRight"),
                    new NSString("UIInterfaceOrientationPortraitUpsideDown")
                    ));
            dict.put("UISupportedInterfaceOrientations~ipad", new NSArray(
                    new NSString("UIInterfaceOrientationPortrait"),
                    new NSString("UIInterfaceOrientationLandscapeLeft"),
                    new NSString("UIInterfaceOrientationLandscapeRight"),
                    new NSString("UIInterfaceOrientationPortraitUpsideDown")
                    ));
            dict.put("UIRequiredDeviceCapabilities", new NSArray(new NSString("armv7")));
        }

        dict.put("DTPlatformName", sdk.getPlatformName());
        dict.put("DTSDKName", sdk.getCanonicalName());

        for (File f : FileUtils.listFiles(getPartialPListDir(), new String[] {"plist"}, false)) {
            try {
                NSDictionary d = (NSDictionary) PropertyListParser.parse(f);
                dict.putAll(d);
            } catch (Exception e) {
                throw new CompilerException(e);
            }
        }

        if (dict.objectForKey("MinimumOSVersion") == null) {
            // This is required
            dict.put("MinimumOSVersion", "6.0");
        }

        customizeInfoPList(dict);

        /*
         * Make sure CFBundleShortVersionString and CFBundleVersion are at the
         * top of the Info.plist file to avoid the "Could not hardlink copy"
         * problem when launching on the simulator. com.dd.plist maintains the
         * insertion order of keys so we rebuild the dictionary here and make
         * sure those two keys are inserted first. See #771.
         */
        NSDictionary newDict = new NSDictionary();
        if (dict.objectForKey("CFBundleShortVersionString") != null) {
            newDict.put("CFBundleShortVersionString", dict.objectForKey("CFBundleShortVersionString"));
            dict.remove("CFBundleShortVersionString");
        }
        if (dict.objectForKey("CFBundleVersion") != null) {
            newDict.put("CFBundleVersion", dict.objectForKey("CFBundleVersion"));
            dict.remove("CFBundleVersion");
        }
        for (String key : dict.allKeys()) {
            newDict.put(key, dict.objectForKey(key));
        }

        File tmpInfoPlist = new File(config.getTmpDir(), "Info.plist");
        PropertyListParser.saveAsBinary(newDict, tmpInfoPlist);

        config.getLogger().info("Installing Info.plist to %s", dir);
        FileUtils.copyFile(tmpInfoPlist, new File(dir, tmpInfoPlist.getName()));
    }

    public void init(Config config) {
        super.init(config);

        if (config.getArch() == null) {
            arch = Arch.thumbv7;
        } else {
            if (!isSimulatorArch(config.getArch()) && !isDeviceArch(config.getArch())) {
                throw new IllegalArgumentException("Arch '" + config.getArch()
                        + "' is unsupported for iOS target");
            }
            arch = config.getArch();
        }

        if (config.getIosInfoPList() != null) {
            config.getIosInfoPList().parse(config.getProperties());
        }

        if (isDeviceArch(arch)) {
            if (!config.isSkipLinking() && !config.isIosSkipSigning()) {
                signIdentity = config.getIosSignIdentity();
                provisioningProfile = config.getIosProvisioningProfile();
                String bundleId = "*";
                if (config.getIosInfoPList() != null && config.getIosInfoPList().getBundleIdentifier() != null) {
                    bundleId = config.getIosInfoPList().getBundleIdentifier();
                }

                if (signIdentity == null && provisioningProfile == null) {
                    // both identity and provisioningProfile are set to auto, start with picking profile s
                    Pair<SigningIdentity, ProvisioningProfile> pair = ProvisioningProfile.find(ProvisioningProfile.list(), SigningIdentity.list("/(?i)iPhone Developer|iOS Development/"), bundleId);
                    signIdentity = pair.getLeft();
                    provisioningProfile = pair.getRight();
                } else if (signIdentity == null) {
                    // provisioning profile was specified, need to find a signing identity that matches it
                    signIdentity = SigningIdentity.find(SigningIdentity.list(), "/(?i)iPhone Developer|iOS Development/", provisioningProfile);
                } else if (provisioningProfile == null) {
                    // find profile that matches identity and bundle id
                    provisioningProfile = ProvisioningProfile.find(ProvisioningProfile.list(), signIdentity, bundleId);
                }
            }
        }

        String sdkVersion = config.getIosSdkVersion();
        List<SDK> sdks = getSDKs();
        if (sdkVersion == null) {
            if (sdks.isEmpty()) {
                throw new IllegalArgumentException("No " + (isDeviceArch(arch) ? "device" : "simulator")
                        + " SDKs installed");
            }
            Collections.sort(sdks);
            this.sdk = sdks.get(sdks.size() - 1);
        } else {
            for (SDK sdk : sdks) {
                if (sdk.getVersion().equals(sdkVersion)) {
                    this.sdk = sdk;
                    break;
                }
            }
            if (sdk == null) {
                throw new IllegalArgumentException("No SDK found matching version string " + sdkVersion);
            }
        }

        entitlementsPList = config.getIosEntitlementsPList();

        partialPListDir = new File(config.getTmpDir(), "partial-plists");
        try {
            //It may not exist, as we might clean the tmp dir depending on the configuration
            if(partialPListDir.exists()){
                FileUtils.cleanDirectory(partialPListDir);
            }
        } catch (IOException e) {
            throw new CompilerException(e);
        }
    }

    @Override
    public OS getOs() {
        return OS.ios;
    }

    @Override
    public boolean canLaunchInPlace() {
        return false;
    }

    /**
     * Copies the dSYM and the executable to {@code ~/Library/Developer/Xcode/
     * DerivedData/RoboVM/Build/Products/<appname>_<timestamp>/}.
     */
    private void copyToIndexedDir(File dir, String executable, File dsymDir, File exePath) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        final File indexedDir = new File(System.getProperty("user.home"),
                "Library/Developer/Xcode/DerivedData/RoboVM/Build/Products/"
                        + FilenameUtils.removeExtension(dir.getName()) + "_"
                        + sdf.format(new Date()));
        indexedDir.mkdirs();
        File indexedDSymDir = new File(indexedDir, dsymDir.getName());
        File indexedAppDir = new File(indexedDir, dir.getName());
        indexedAppDir.mkdirs();

        try {
            // No need to copy the whole .app folder. Just the exe
            // is enough to make symbolication happy.
            FileUtils.copyFile(exePath, new File(indexedAppDir, executable));
        } catch (IOException e) {
            config.getLogger().error("Failed to copy %s to indexed dir %s: %s",
                    exePath.getAbsolutePath(),
                    indexedAppDir.getAbsolutePath(), e.getMessage());
        }

        try {
            FileUtils.copyDirectory(dsymDir, indexedDSymDir);
        } catch (IOException e) {
            config.getLogger().error("Failed to copy %s to indexed dir %s: %s",
                    dsymDir.getAbsolutePath(),
                    indexedDir.getAbsolutePath(), e.getMessage());
        }

        // Now do some cleanup and delete all but the 3 most recent dirs
        List<File> dirs = new ArrayList<>(Arrays.asList(indexedDir.getParentFile().listFiles((FileFilter)
                new AndFileFilter(
                        new PrefixFileFilter(FilenameUtils.removeExtension(dir.getName())),
                        new RegexFileFilter(".*_\\d{14}")))));
        Collections.sort(dirs, new Comparator<File>() {
            public int compare(File o1, File o2) {
                return Long.compare(o1.lastModified(), o2.lastModified());
            }
        });
        if (dirs.size() > 3) {
            for (File f : dirs.subList(0, dirs.size() - 3)) {
                try {
                    FileUtils.deleteDirectory(f);
                } catch (IOException e) {
                    config.getLogger().error("Failed to delete diretcory %s",
                            f.getAbsolutePath(), e.getMessage());
                }
            }
        }
    }
}
