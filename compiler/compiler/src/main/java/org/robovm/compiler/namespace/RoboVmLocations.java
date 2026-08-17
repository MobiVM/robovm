package org.robovm.compiler.namespace;

import org.robovm.compiler.Version;
import org.robovm.compiler.config.Config;

import java.io.File;

/**
 * Default locations for RoboVM entities such as cache/sdk etc
 * @author dkimitsa
 */
public final class RoboVmLocations {
    private RoboVmLocations() {}

    ///  just ~/
    public final static File UserHome = new File(System.getProperty("user.home"));

    /// e.g. ~/.robovm
    public final static File roboVmBaseDir = new File(UserHome, ".robovm");

    /// e.g. ~/.robovm-sdks
    public final static File roboVmSdksBaseDir = new File(UserHome, ".robovm-sdks");

    /// home for current RoboVM version, e.g. ~/.robovm-sdks/robovm-2.3.24
    public final static File roboVmSdkDir = new File(roboVmSdksBaseDir,"robovm-" + Version.getCompilerVersion());

    /// e.g. ~/.robovm/cache
    public final static File roboVmCacheDir = new File(roboVmBaseDir, "cache");

    /**
     * RoboVm SDK home.
     * points to $roboVmSdk (e.g. ~/.robovm-sdks/robovm-2.3.24)
     * or development compiler project location
     */
    public final static Config.Home roboVmHome;
    static {
        // check if running in dev environment
        Config.Home candidate = Config.Home.suggestDevHome();
        // production: not validated to allow SDK extraction routine to work with dev status
        if (candidate == null) candidate = new Config.Home(roboVmSdkDir, false);
        roboVmHome = candidate;
    }

    /**
     * e.g. ~/.robovm/${fileName}
     * @return location for fileName withing Home dir
     */
    public static File inHomeDir(String fileName) {
        return new File(roboVmBaseDir, fileName);
    }

    /**
     * e.g. project/ios-module/robovm-build
     * @return name for build-folder withing given module path
     */
    public static File buildDir(File moduleDir) {
        return new File(moduleDir, "robovm-build");
    }

    /**
     * e.g. project/ios-module/robovm-build/${subDir}
     * @return path for subDir withing build-folder in given moduleDir
     */
    public static File inBuildDir(File moduleDir, String subDir) {
        return new File(buildDir(moduleDir), subDir);
    }
}
