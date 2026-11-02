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
package org.robovm.compiler.target.ios.simulator;

import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.CpuArch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Simulator device types, consisting of the device type id and SDK version as
 * listed by xcrun simctl list devices devicetypes runtimes pairs -j.
 */
public class DeviceType implements Comparable<DeviceType> {
    public static final String PREFERRED_IPHONE_SIM_NAME = "iPhone SE";
    public static final String PREFERRED_IPAD_SIM_NAME = "iPad Air";

    public enum DeviceFamily {
        iPhone,
        iPad,
        // next are not directly supported by used during parsing
        AppleWatch,
        AppleTV,
        AppleVision
    }

    public enum SimPlatform {
        iOS,
        tvOS,
        watchOS,
        visionOS
    }

    static final class SimDeviceModel {
        final DeviceFamily productFamily;
        final String modelIdentifier;
        final String name;

        SimDeviceModel(DeviceFamily productFamily, String modelIdentifier, String name) {
            this.productFamily = productFamily;
            this.modelIdentifier = modelIdentifier;
            this.name = name;
        }
    }

    /// represents a runtime entry in the simctl list response
    static final class SimRuntime {
        final SimPlatform platform;
        final Version version;
        final Set<Arch> archs;

        SimRuntime(SimPlatform platform, Version version, Set<Arch> archs) {
            this.platform = platform;
            this.version = version;
            this.archs = archs;
        }
    }


    // depending on x86_64 or m1 CPU use different host simulator arches
    public final static CpuArch DEFAULT_HOST_ARCH;
    static {
        String archProp = System.getProperty("os.arch").toLowerCase();
        if (archProp.matches("aarch64|arm64")) {
            DEFAULT_HOST_ARCH = CpuArch.arm64;
        } else {
            DEFAULT_HOST_ARCH = CpuArch.x86_64;
        }
    }

    private final String deviceName;
    private final String udid;
    private final String state;
    final SimRuntime runtime;
    final SimDeviceModel model;
    final DeviceType pair;

    DeviceType(String deviceName, String udid, String state, SimRuntime runtime, SimDeviceModel model, DeviceType pair) {
        this.deviceName = deviceName;
        this.udid = udid;
        this.state = state;
        this.runtime = runtime;
        this.model = model;
        this.pair = pair;
    }

    DeviceType(DeviceType device, DeviceType pair) {
        this(device.deviceName, device.udid, device.state, device.runtime, device.model, pair);
    }

    public String getDeviceName() {
        return deviceName;
    }

    public Version getVersion() {
        return runtime.version;
    }

    public Set<Arch> getArchs() {
        return runtime.archs;
    }

    public DeviceType getPair() {
        return pair;
    }

    /**
     * @return id as understood by the AppCompiler -simdevicetype flag
     */
    public String getSimpleDeviceTypeId() {
        return getSimpleDeviceName() + ", " + getVersion();
    }

    public String getSimpleDeviceName() {
        return deviceName + " (" + udid + ")";
    }

    public DeviceFamily getFamily() {
        return model.productFamily;
    }

    public String getUdid() {
        return udid;
    }

    public String getState() {
        return state;
    }

    public static List<DeviceType> listDeviceTypes() {
        return SimCtl.list();
    }

    @Override
    public int compareTo(DeviceType that) {
        int c = this.runtime.version.compareTo(that.runtime.version);
        if (c == 0) {
            c = this.getFamily().compareTo(that.getFamily());
            if (c == 0) {
                c = this.deviceName.compareToIgnoreCase(that.deviceName);
            }
        }
        return c;
    }

    private static List<DeviceType> filter(List<DeviceType> deviceTypes, Arch arch,
                                           DeviceFamily family, String deviceName, Version simVersion) {

        deviceName = deviceName == null ? null : deviceName.toLowerCase();

        List<DeviceType> result = new ArrayList<>();
        for (DeviceType type : deviceTypes) {
            if (arch == null || type.getArchs().contains(arch)) {
                if (family == null || family == type.getFamily()) {
                    if (deviceName == null || type.getDeviceName().toLowerCase().contains(deviceName)) {
                        if (simVersion == null || type.runtime.version.isSameOrBetter(simVersion)) {
                            result.add(type);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<String> getSimpleDeviceTypeIds() {
        List<String> result = new ArrayList<>();
        for (DeviceType type : SimCtl.list()) {
            result.add(type.getSimpleDeviceTypeId());
        }
        return result;
    }

    public static DeviceType getDeviceType(String displayName) {
        List<DeviceType> types = SimCtl.list();
        if (displayName == null) {
            return null;
        }
        for (DeviceType type : types) {
            if (displayName.equals(type.getSimpleDeviceTypeId())) {
                return type;
            }
        }
        return null;
    }

    public static DeviceType getBestDeviceType() {
        return getBestDeviceType(null, null, null, null);
    }

    public static DeviceType getBestDeviceType(DeviceFamily family) {
        return getBestDeviceType(null, family, null, null);
    }

    /**
     * Returns the best {@link DeviceType} matching the parameters. If multiple
     * device types match the parameters the first one with the highest SDK
     * number will be returned. If no device name and no {@link DeviceFamily} is
     * specified this method will default to {@link DeviceFamily#iPhone}.
     */
    public static DeviceType getBestDeviceType(Arch arch, DeviceFamily family,
                                               String deviceName, String deviceVersion) {

        if (deviceName == null && family == null) {
            family = DeviceFamily.iPhone;
        }
        String preferredDeviceName = family == DeviceFamily.iPad
                ? PREFERRED_IPAD_SIM_NAME : PREFERRED_IPHONE_SIM_NAME;

        // set simulator types and find one that matches version and name
        DeviceType exact = null;
        DeviceType bestDefault = null;
        DeviceType bestAny = null;
        Version version = deviceVersion != null ? Version.parse(deviceVersion) : null;
        List<DeviceType> devices = filter(SimCtl.list(), arch, family, deviceName, version);
        for (DeviceType type : devices) {
            if (type.getDeviceName().equals(deviceName)) {
                // match for specified device
                if (exact == null || (version == null && type.runtime.version.versionCode > exact.runtime.version.versionCode))
                    exact = type;
            } else if (deviceName == null && type.model.name.startsWith(preferredDeviceName)) {
                // Apply the default preference to the canonical model name, even for renamed instances.
                if (bestDefault == null || (version == null && type.runtime.version.versionCode > bestDefault.runtime.version.versionCode))
                    bestDefault = type;
            } else {
                // just pick one with best version
                if (bestAny == null || (version == null && type.runtime.version.versionCode > bestAny.runtime.version.versionCode))
                    bestAny = type;
            }
        }

        DeviceType best = exact;
        if (best == null) {
            best = bestDefault != null ? bestDefault : bestAny;
        }
        if (best == null) {
            throw new IllegalArgumentException("Unable to find a matching device "
                    + "[arch=" + arch + ", family=" + family
                    + ", name=" + deviceName + ", version=" + version + "]");
        }
        return best;
    }

    @Override
    public String toString() {
        return "DeviceType [deviceName=" + deviceName + ", version=" + runtime.version + ", archs=" + runtime.archs + "]";
    }

    /**
     * simulator version
     */
    public static class Version {
        public final int major, minor, revision, versionCode;

        public Version(int major, int minor, int revision) {
            this.major = major;
            this.minor = minor;
            this.revision = revision;
            this.versionCode = (major << 16) | (minor << 8) | revision;
        }

        static Version parse(String v) {
            String[] parts = v.split("\\.");
            int major = Integer.parseInt(parts[0]);
            int minor = parts.length >= 2 ? Integer.parseInt(parts[1]) : 0;
            int revision = parts.length >= 3 ? Integer.parseInt(parts[2]) : 0;
            return new Version(major, minor, revision);
        }

        @Override
        public String toString() {
            return major + "." + minor + (revision != 0 ? ("." + revision) : "");
        }

        public int compareTo(Version other) {
            return versionCode - other.versionCode;
        }

        public boolean isSameOrBetter(Version other) {
            return versionCode >= other.versionCode;
        }
    }
}
