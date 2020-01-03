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

import org.apache.commons.exec.util.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.Executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Simulator device types, consisting of the device type id and SDK version as
 * listed by xcrun simctl devices -j list.
 */
public class DeviceType implements Comparable<DeviceType> {
    public static final String IOS_VERSION_PREFIX = "com.apple.CoreSimulator.SimRuntime.iOS-";
    public static final String PREFERRED_IPHONE_SIM_NAME = "iPhone 6";
    public static final String PREFERRED_IPAD_SIM_NAME = "iPad Air";

    public static final String[] ONLY_32BIT_DEVICES = {"iPhone 4", "iPhone 4s", "iPhone 5", "iPhone 5c", "iPad 2"};

    public enum DeviceFamily {
        iPhone,
        iPad
    }

    private final String deviceName;
    private final String udid;
    private final String state;
    private final Version version;
    private final Set<Arch> archs;

    DeviceType(String deviceName, String udid, String state, Version version, Set<Arch> archs) {
        this.deviceName = deviceName;
        this.udid = udid;
        this.state = state;
        this.version = version;
        this.archs = archs;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public Version getVersion() {
        return version;
    }

    public Set<Arch> getArchs() {
        return Collections.unmodifiableSet(archs);
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
        if (deviceName.contains("iPhone")) {
            return DeviceFamily.iPhone;
        } else {
            return DeviceFamily.iPad;
        }
    }

    public String getUdid() {
        return udid;
    }

    public String getState() {
        return getState(false);
    }

    public String getState(boolean fresh) {
        if (fresh) {
            // get fresh state by requesting a list
            for (DeviceType t : listDeviceTypes()) {
                if (udid.equals(t.udid))
                    return t.state;
            }

        }
        return state;
    }

    public static List<DeviceType> listDeviceTypes() {
        try {
            String capture = new Executor(Logger.NULL_LOGGER, "xcrun").args(
                    "simctl", "list", "devices", "-j").execCapture();
            List<DeviceType> types = new ArrayList<>();

            JSONParser parser = new JSONParser();
            JSONObject deviceList = (JSONObject) ((JSONObject) parser.parse(capture)).get("devices");

            for (Object value : deviceList.entrySet()) {
                //noinspection rawtypes
                Map.Entry entry = (Map.Entry) value;
                String versionKey = entry.getKey().toString();
                if (versionKey.startsWith(IOS_VERSION_PREFIX)) {
                    // com.apple.CoreSimulator.SimRuntime.iOS-
                    versionKey = versionKey.replace(IOS_VERSION_PREFIX, "").replace('-', '.');
                } else if (versionKey.startsWith("iOS ")) {
                    versionKey = versionKey.replace("iOS ", "");
                } else {
                    // not iOS
                    continue;
                }
                JSONArray devices = (JSONArray) entry.getValue();
                for (Object obj : devices) {
                    JSONObject device = (JSONObject) obj;
                    boolean isAvailable = false;
                    if (device.containsKey("isAvailable")) {
                        Object o = device.get("isAvailable");
                        isAvailable = o instanceof Boolean ? (Boolean) o : "true".equals(o.toString());
                    } else if (device.containsKey("availability"))
                        isAvailable = !device.get("availability").toString().contains("unavailable");

                    if (isAvailable) {
                        final String deviceName = device.get("name").toString();
                        Set<Arch> archs = new HashSet<>();
                        archs.add(Arch.x86);
                        if (!Arrays.asList(ONLY_32BIT_DEVICES).contains(deviceName)) {
                            archs.add(Arch.x86_64);
                        }

                        types.add(new DeviceType(deviceName, device.get("udid").toString(),
                                device.get("state").toString(), Version.parse(versionKey), archs));
                    }
                }
            }

            // Sort. Make sure that devices that have an id which is a prefix of
            // another id comes before in the list.
            Collections.sort(types);
            return types;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(DeviceType that) {
        int c = this.version.compareTo(that.version);
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
                        if (simVersion == null || type.version.isSameOrBetter(simVersion)) {
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
        for (DeviceType type : listDeviceTypes()) {
            result.add(type.getSimpleDeviceTypeId());
        }
        return result;
    }

    public static DeviceType getDeviceType(String displayName) {
        List<DeviceType> types = listDeviceTypes();
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
        String preferredDeciveName = PREFERRED_IPHONE_SIM_NAME;
        if (family == DeviceFamily.iPad) {
            preferredDeciveName = PREFERRED_IPAD_SIM_NAME;
        }


        // set simulator types and find one that matches version and name
        DeviceType exact = null;
        DeviceType bestDefault = null;
        DeviceType bestAny = null;
        Version version = deviceVersion != null ? Version.parse(deviceVersion) : null;
        List<DeviceType> devices = filter(listDeviceTypes(), arch, family, deviceName, version);
        for (DeviceType type : devices) {
            if (type.getDeviceName().equals(deviceName)) {
                // match for specified device
                if (exact == null || (version == null && type.version.versionCode > exact.version.versionCode))
                    exact = type;
            } else if (deviceName == null && type.getDeviceName().equals(preferredDeciveName)) {
                // match for preferable device
                if (bestDefault == null || (version == null && type.version.versionCode > bestDefault.version.versionCode))
                    bestDefault = type;
            } else {
                // just pick one with best version
                if (bestAny == null || (version == null && type.version.versionCode > bestAny.version.versionCode))
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
        return "DeviceType [deviceName=" + deviceName + ", version=" + version + ", archs=" + archs + "]";
    }

    /**
     * simulator version
     */
    public static class Version {
        public final int major, minor, revision, versionCode;

        public Version(int major, int minor, int revision, int versionCode) {
            this.major = major;
            this.minor = minor;
            this.revision = revision;
            this.versionCode = versionCode;
        }

        static Version parse(String v) {
            String[] parts = StringUtils.split(v, ".");
            int major = Integer.parseInt(parts[0]);
            int minor = parts.length >= 2 ? Integer.parseInt(parts[1]) : 0;
            int revision = parts.length >= 3 ? Integer.parseInt(parts[2]) : 0;
            int versionCode = (major << 16) | (minor << 8) | revision;
            return new Version(major, minor, revision, versionCode);
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
