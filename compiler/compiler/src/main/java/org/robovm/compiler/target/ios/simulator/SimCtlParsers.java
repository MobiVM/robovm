/*
 * Copyright (C) 2013 RoboVM AB
 * Copyright (C) 2025 The MobiVM Contributors
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

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.CpuArch;
import org.robovm.compiler.config.Environment;

import java.util.*;

public class SimCtlParsers {
    public static final String IOS_VERSION_PREFIX = "com.apple.CoreSimulator.SimRuntime.iOS-";
    public static final String[] ONLY_32BIT_DEVICES = {"iPhone 4", "iPhone 4s", "iPhone 5", "iPhone 5c", "iPad 2"};
    public static final DeviceType.Version ARM64_IOS_VERSION = new DeviceType.Version(14, 0, 0);

    public static List<DeviceType> parseListResponse(JsonObject root) {
        List<DeviceType> types = new ArrayList<>();
        // parse watch pairs to
        Map<String, DeviceType> pairs = new HashMap<>();
        JsonObject pairList = (JsonObject) root.get("pairs");
        if (pairList != null) {
            for (Object e : pairList.values()) {
                JsonObject entry = (JsonObject) e;
                if (entry.containsKey("state") && entry.get("state").toString().contains("unavailable"))
                    continue;
                JsonObject watchEntry = (JsonObject) entry.get("watch");
                JsonObject phoneEntry = (JsonObject) entry.get("phone");
                if (watchEntry != null && phoneEntry != null) {
                    String phoneUdid = phoneEntry.get("udid").toString();
                    String watchUdid = watchEntry.get("udid").toString();
                    String watchName = watchEntry.get("name").toString();
                    String watchState = watchEntry.get("state").toString();
                    if (watchState.contains("unavailable"))
                        continue;
                    DeviceType simpleWatch = new DeviceType(watchName, watchUdid, watchState,
                            new DeviceType.Version(0, 0, 0), Collections.emptySet(), null);
                    pairs.put(phoneUdid, simpleWatch);
                }
            }
        }

        JsonObject deviceList = (JsonObject) root.get("devices");
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
            JsonArray devices = (JsonArray) entry.getValue();
            for (Object obj : devices) {
                JsonObject device = (JsonObject) obj;
                boolean isAvailable = false;
                if (device.containsKey("isAvailable")) {
                    Object o = device.get("isAvailable");
                    isAvailable = o instanceof Boolean ? (Boolean) o : "true".equals(o.toString());
                } else if (device.containsKey("availability"))
                    isAvailable = !device.get("availability").toString().contains("unavailable");

                if (isAvailable) {
                    final String deviceName = device.get("name").toString();
                    final DeviceType.Version version = DeviceType.Version.parse(versionKey);
                    Set<Arch> archs = new HashSet<>();
                    if (!Arrays.asList(ONLY_32BIT_DEVICES).contains(deviceName)) {
                        // This is assumption that on M1 ios versions starting from ios14 can run arm64 target
                        if (DeviceType.DEFAULT_HOST_ARCH == CpuArch.arm64 && version.isSameOrBetter(ARM64_IOS_VERSION))
                            archs.add(new Arch(CpuArch.arm64, Environment.Simulator));
                        archs.add(new Arch(CpuArch.x86_64, Environment.Simulator));
                    }

                    String udid = device.get("udid").toString();
                    DeviceType watchPair = pairs.get(udid);
                    types.add(new DeviceType(deviceName, udid, device.get("state").toString(), version, archs, watchPair));
                }
            }
        }

        // Sort. Make sure that devices that have an id which is a prefix of
        // another id comes before in the list.
        Collections.sort(types);
        return types;
    }
}
