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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DeveloperImageResolver {
    private static String xcodePath;

    static File getXcodePath() throws Exception {
        if (xcodePath != null) {
            return new File(xcodePath);
        }

        File tmpFile = File.createTempFile("DeveloperImageResolver", ".tmp");
        try {
            int ret = new ProcessBuilder("xcode-select", "-print-path")
                    .redirectErrorStream(true)
                    .redirectOutput(ProcessBuilder.Redirect.to(tmpFile))
                    .start().waitFor();
            if (ret != 0) {
                throw new IOException("xcode-select failed with error code: " + ret);
            }

            return new File(new String(Files.readAllBytes(tmpFile.toPath()), StandardCharsets.UTF_8).trim());
        } finally {
            tmpFile.delete();
        }
    }

    static File getDeviceSupportPath() throws Exception {
        return new File(getXcodePath(), "Platforms/iPhoneOS.platform/DeviceSupport");
    }

    /**
     * Value object to provide information about resolved developer image
     */
    static class Response {
        final Version version;
        final File dmg;
        final File signature;

        Response(Version version, File dmg, File signature) {
            this.version = version;
            this.dmg = dmg;
            this.signature = signature;
        }
    }

    static Response findDeveloperImage(File dsDir, Version deviceVersion) throws FileNotFoundException {
        // Find the DeveloperDiskImage.dmg path that best matches the current device. Here's what
        // the paths look like:
        // Platforms/iPhoneOS.platform/DeviceSupport/5.0/DeveloperDiskImage.dmg
        // Platforms/iPhoneOS.platform/DeviceSupport/6.0/DeveloperDiskImage.dmg
        // Platforms/iPhoneOS.platform/DeviceSupport/6.1/DeveloperDiskImage.dmg
        // Platforms/iPhoneOS.platform/DeviceSupport/7.0/DeveloperDiskImage.dmg
        // Platforms/iPhoneOS.platform/DeviceSupport/7.0 (11A465)/DeveloperDiskImage.dmg
        // Platforms/iPhoneOS.platform/DeviceSupport/7.0.3 (11B508)/DeveloperDiskImage.dmg

        // capturing patter: version + optional buildNumber e.g. "16.0.0 (16A123)"
        Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)*)(?:\\s*\\((.*)\\))?");

        Version bestMatchVersion= null;
        File bestMatchDmgFile= null;
        File bestMatchSignatureFile= null;
        File[] dirs = dsDir.listFiles();
        for (File dir : dirs) {
            if (dir.isDirectory()) {
                Matcher matcher = pattern.matcher(dir.getName());
                if (matcher.matches()) {
                    File dmg = new File(dir, "DeveloperDiskImage.dmg");
                    File sig = new File(dir, dmg.getName() + ".signature");
                    if (dmg.isFile() && sig.isFile()) {
                        Version dmgVersion = Version.parse(matcher.group(1));
                        if (dmgVersion.getMajor() == deviceVersion.getMajor()) {
                            int diff = dmgVersion.compareTo(deviceVersion);
                            if (diff == 0) {
                                // exact match
                                bestMatchVersion = dmgVersion;
                                bestMatchDmgFile = dmg;
                                bestMatchSignatureFile = sig;
                                // found the one
                                break;
                            } else if (diff < 0 && (bestMatchVersion == null || bestMatchVersion.compareTo(dmgVersion) < 0)) {
                                // version is older than device one and version is never than best one
                                bestMatchVersion = dmgVersion;
                                bestMatchDmgFile = dmg;
                                bestMatchSignatureFile = sig;
                            }
                        }
                    }
                }
            }
        }
        if (bestMatchDmgFile == null) {
            throw new FileNotFoundException("No DeveloperDiskImage.dmg found in "
                    + dsDir.getAbsolutePath() + " for iOS version " + deviceVersion);
        }

        return new Response(bestMatchVersion, bestMatchDmgFile, bestMatchSignatureFile);
    }
}
