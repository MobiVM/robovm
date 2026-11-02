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
import org.robovm.compiler.target.ios.simulator.DeviceType.DeviceFamily;
import org.robovm.compiler.target.ios.simulator.DeviceType.SimDeviceModel;
import org.robovm.compiler.target.ios.simulator.DeviceType.SimRuntime;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.robovm.compiler.util.JsonUtils.*;

public class SimCtlParsers {

    /**
     * parses json that have the following structure:
     * {
     *  "devicetypes" : [],
     *  "runtimes" : [],
     *  "pairs" : {},
     *  "devices" : {}
     * }
     */
    public static List<DeviceType> parseListResponse(JsonObject root) {
        List<DeviceType> types = new ArrayList<>();
        // Device entries reference the shared model catalog by deviceTypeIdentifier.
        Map<String, DeviceType.SimDeviceModel> deviceModels = new HashMap<>();
        asObjectStream(root, "devicetypes", Stream.empty()).forEach(deviceType -> {
            String id = asString(deviceType, "identifier");
            DeviceType.SimDeviceModel model = id != null ? parseDeviceModel(deviceType) : null;
            if (model != null)
                deviceModels.put(id, model);
        });

        // parse runtime catalog into runtime id -> runtime map
        Map<String, SimRuntime> runtimes = new HashMap<>();
        asObjectStream(root, "runtimes", Stream.empty()).forEach(entry -> {
            String id = asString(entry, "identifier");
            DeviceType.SimRuntime runtime = id != null ? parseRuntime(entry) : null;
            if (runtime != null) {
                runtimes.put(id, runtime);
            }
        });

        // parse all devices into a map of udid -> device
        // uses prepared runtime
        //   "devices" : {
        //     "com.apple.CoreSimulator.SimRuntime.iOS-26-5" : []
        //   }
        Map<String, DeviceType> devicesByUdid = new LinkedHashMap<>();
        JsonObject deviceList = asJson(root, "devices");
        for (Map.Entry<String, Object> entry : deviceList.entrySet()) {
            SimRuntime runtime = runtimes.get(entry.getKey());
            if (runtime == null)
                continue;
            JsonArray devices = (JsonArray) entry.getValue();
            toObjectStream(devices).forEach(device -> {
                SimDeviceModel model = deviceModels.get(asString(device, "deviceTypeIdentifier"));
                DeviceType type = model != null ? parseDevice(device, runtime, model) : null;
                if (type != null) {
                    devicesByUdid.put(type.getUdid(), type);
                }
            });
        }

        // parse all pairs entries
        JsonObject pairList = asJson(root, "pairs");
        if (pairList != null) {
            for (Object e : pairList.values()) {
                if (!(e instanceof JsonObject)) continue;
                DeviceType phone = buildPairedDevice((JsonObject) e, devicesByUdid);
                if (phone != null) {
                    // make a replacement
                    devicesByUdid.put(phone.getUdid(), phone);
                }
            }
        }

        // leave only iOS and sort. Make sure that devices that have an id which is a prefix of
        // another id comes before in the list.
        return devicesByUdid.values().stream()
            .filter(type -> type.runtime.platform == DeviceType.SimPlatform.iOS)
            .sorted()
            .collect(Collectors.toList());
    }

    /**
     * Parses device type entry json
     * {
     *   "productFamily" : "iPhone",
     *   "identifier" : "com.apple.CoreSimulator.SimDeviceType.iPhone-18-Pro",
     *   "modelIdentifier" : "iPhone19,2",
     *   "name" : "iPhone 18 Pro"
     * }
     */
    private static DeviceType.SimDeviceModel parseDeviceModel(JsonObject entry) {
        DeviceFamily productFamily = parseProductFamily(asString(entry, "productFamily"));
        if (productFamily == null)
            return null;
        return new DeviceType.SimDeviceModel(productFamily, asString(entry, "modelIdentifier"), asString(entry, "name"));
    }

    /**
     * Parses runtime entry json
     *     {
     *       "isAvailable" : true,
     *       "version" : "27.2",
     *       "isInternal" : false,
     *       "buildversion" : "24B91016s",
     *       "supportedArchitectures" : ["arm64"],
     *       "supportedDeviceTypes" : [...],
     *       "identifier" : "com.apple.CoreSimulator.SimRuntime.iOS-27-2-iPhone19-4",
     *       "platform" : "iOS",
     *       "bundlePath" : "...",
     *       "runtimeRoot" : "...",
     *       "name" : "iOS 27.2"
     *     }
     */
    private static DeviceType.SimRuntime parseRuntime(JsonObject entry) {
        if (!isAvailable(entry))
            return null;
        DeviceType.SimPlatform platform = parseDevicePlatform(asString(entry, "platform"));
        // currently supported only iOS and watchOS (for pairs) runtimes
        if (platform != DeviceType.SimPlatform.iOS && platform != DeviceType.SimPlatform.watchOS)
            return null;

        DeviceType.Version version = DeviceType.Version.parse(asString(entry, "version"));
        Set<Arch> archs = new HashSet<>();
        // arm64 is not supported on x86_64 host
        boolean supportsArm64 = DeviceType.DEFAULT_HOST_ARCH == CpuArch.arm64;
        asStringStream(entry, "supportedArchitectures", Stream.empty())
            .map(SimCtlParsers::parseCpuArch)
            .filter(arch -> arch != null && (arch != CpuArch.arm64 || supportsArm64))
            .forEach(arch -> archs.add(new Arch(arch, Environment.Simulator)));
        if (archs.isEmpty())
            return null;

        return new DeviceType.SimRuntime(platform, version, Collections.unmodifiableSet(archs));
    }

    /**
     * Parses device entry json
     * {
     *   "udid" : "BD48B4CD-B7AF-4AFA-BB61-F1821D7603AE",
     *   "isAvailable" : true,
     *   "deviceTypeIdentifier" : "com.apple.CoreSimulator.SimDeviceType.iPad-mini-A20-Pro",
     *   "state" : "Shutdown",
     *   "name" : "iPad mini (A20 Pro)"
     *  }
     */
    private static DeviceType parseDevice(JsonObject entry, DeviceType.SimRuntime runtime, DeviceType.SimDeviceModel model) {
        if (!isAvailable(entry))
            return null;
        String udid = asString(entry, "udid");
        if (udid == null)
            return null;
        String name = asString(entry, "name");
        String state = asString(entry, "state");
        return new DeviceType(name, udid, state, runtime, model, null);
    }

    /**
     * Parses paired device entry json, and returns updated DeviceType paired with watch
     *  "295AE94A-3D06-43C2-90E7-F756BD6415C9" : {
     *    "watch" : {
     *      "udid" : "C1B41F2E-B0EC-46FB-A670-D4CA17D7C78C",
     *    },
     *    "phone" : {
     *      "udid" : "BADC17A8-FFB6-4247-A83E-8F975A252DE0",
     *    },
     *    "state" : "(unavailable)"
     *  }
     */
    private static DeviceType buildPairedDevice(JsonObject entry, Map<String, DeviceType> devicesByUdid) {
        if (asString(entry, "state", "").contains("unavailable")) return null;
        JsonObject watchEntry = asJson(entry, "watch");
        JsonObject phoneEntry = asJson(entry, "phone");
        if (watchEntry != null && phoneEntry != null) {
            String phoneUdid = asString(phoneEntry, "udid");
            String watchUdid = asString(watchEntry, "udid");
            DeviceType phone = phoneUdid != null ? devicesByUdid.get(phoneUdid) : null;
            DeviceType watch = watchUdid != null ? devicesByUdid.get(watchUdid) : null;
            if (phone != null && watch != null) {
                return new DeviceType(phone, watch);
            }
        }

        return null;
    }

    private static DeviceFamily parseProductFamily(String productFamily) {
        switch (productFamily) {
            case "iPhone": return DeviceFamily.iPhone;
            case "iPad": return DeviceFamily.iPad;
            case "Apple Watch": return DeviceFamily.AppleWatch;
            case "Apple TV": return DeviceFamily.AppleTV;
            case "Apple Vision": return DeviceFamily.AppleVision;
            default: return null;
        }
    }

    private static DeviceType.SimPlatform parseDevicePlatform(String platform) {
        switch (platform) {
            case "iOS": return DeviceType.SimPlatform.iOS;
            case "tvOS": return DeviceType.SimPlatform.tvOS;
            case "watchOS": return DeviceType.SimPlatform.watchOS;
            case "visionOS": return DeviceType.SimPlatform.visionOS;
            default: return null;
        }
    }

    private static CpuArch parseCpuArch(String s) {
        switch (s) {
            case "arm64": return CpuArch.arm64;
            case "x86_64": return CpuArch.x86_64;
            default: return null;
        }
    }

    private static boolean isAvailable(JsonObject entry) {
        if (entry.containsKey("isAvailable"))
            return asBoolean(entry, "isAvailable", false);
        String availability = asString(entry, "availability");
        return availability != null && !availability.contains("unavailable");
    }
}
