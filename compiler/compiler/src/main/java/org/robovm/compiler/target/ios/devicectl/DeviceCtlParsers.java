/*
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
package org.robovm.compiler.target.ios.devicectl;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.Capability;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties.AuthenticationType;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties.PairingState;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties.TransportType;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.ConnectionProperties.TunnelState;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.DeviceProperties;
import org.robovm.compiler.target.ios.devicectl.AppleDevice.HardwareProperties;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * parsers for output of `devicectl` utility
 */
public final class DeviceCtlParsers {

    /**
     * parses array of capabilities
     * [
     *   {
     *     "featureIdentifier" : "com.apple.coredevice.feature.acquireusageassertion",
     *     "name" : "Acquire Usage Assertion"
     *   }
     * ]
     */
    public static Set<Capability> parseCapabilities(@Required Stream<JsonObject> stream) {
        return stream.map(js -> js.get("featureIdentifier"))
                .filter(s -> s instanceof String)
                .map(s -> Capability.of((String)s)).collect(Collectors.toSet());
    }

    /**
     * parses connection properties entry
     * {
     *   "authenticationType" : "manualPairing",
     *   "pairingState" : "paired",
     *   "transportType" : "wired",
     *   "tunnelState" : "connected",
     *   "tunnelIPAddress" : "fdeb:b11:406e::1",
     * }
     */
    public static ConnectionProperties parseConnectionProperties(@Optional JsonObject json) {
        AuthenticationType authenticationType = AuthenticationType.of(asString(json, "authenticationType"));
        PairingState pairingState = PairingState.of(asString(json, "pairingState"));
        TransportType transportType = TransportType.of(asString(json, "transportType"));
        TunnelState tunnelState = TunnelState.of(asString(json, "tunnelState"));
        String tunnelIPAddress = asString(json, "tunnelIPAddress");

        return new ConnectionProperties(authenticationType, pairingState, transportType, tunnelState, tunnelIPAddress);
    }

    /**
     * parses device properties section
     * {
     *   "bootState" : "booted",
     *   "developerModeStatus" : "enabled",
     *   "name" : "iPhone XR",
     *   "osBuildUpdate" : "22F76",
     *   "osVersionNumber" : "18.5",
     * }
     */
    public static DeviceProperties parseDeviceProperties(@Optional JsonObject json) {
        return new DeviceProperties(
            "booted".equals(asString(json, "bootState")),
            "enabled".equals(asString(json, "developerModeStatus")),
            asString(json, "name", "?"),
            asString(json, "osBuildUpdate", "?"),
            asString(json, "osVersionNumber", "0")
        );
    }

    /**
     * parses hardware properties section
     * {
     *   "cpuType" : {
     *     "name" : "arm64e",
     *   },
     *   "deviceType" : "iPhone",
     *   "ecid" : 123456,
     *   "hardwareModel" : "N841AP",
     *   "marketingName" : "iPhone XR",
     *   "platform" : "iOS",
     *   "productType" : "iPhone11,8",
     *   "serialNumber" : "1234567",
     *   "supportedCPUTypes" : [
     *     { "name" : "arm64e" },
     *     { "name" : "arm64" },
     *     { "name" : "armv8"}
     *   ],
     *   "udid" : "00008020-000123123123123"
     *  }
     */
    public static HardwareProperties parseHardwareProperties(@Optional JsonObject json) {
        HardwareProperties.CPUType cpuType = HardwareProperties.CPUType.of(
            asString(asJson(json, "cpuType"), "name")
        );
        String deviceType = asString(json, "deviceType");
        long ecid = asLong(json, "ecid", 0L);
        String hardwareModel = asString(json, "hardwareModel");
        String marketingName = asString(json, "marketingName");
        String platform = asString(json, "platform");
        String productType = asString(json, "productType");
        String serialNumber = asString(json, "serialNumber");
        Set<HardwareProperties.CPUType> supportedCPUTypes = asObjectStream(json, "supportedCPUTypes", Stream.empty())
            .map( js -> HardwareProperties.CPUType.of(asString(js, "name"))).collect(Collectors.toSet());
        String udid = asString(json, "udid");
        return new HardwareProperties(
            cpuType,
            deviceType,
            ecid,
            hardwareModel,
            marketingName,
            platform,
            productType,
            serialNumber,
            supportedCPUTypes,
            udid
        );
    }

    /**
     * Parses single device section
     *   {
     *     "capabilities" : [],
     *     "connectionProperties" : { },
     *     "deviceProperties" : { },
     *     "hardwareProperties" : { },
     *     "identifier" : "AF319CBD-DC10-5AC0-815E-3774F8270D13",
     *  }
     */
    public static AppleDevice parseAppleDevice(@Required JsonObject json) {
        return new AppleDevice(
            asString(json, "identifier"),
            parseCapabilities(asObjectStream(json, "capabilities", Stream.empty())),
            parseConnectionProperties(asJson(json, "connectionProperties")),
            parseDeviceProperties(asJson(json, "deviceProperties")),
            parseHardwareProperties(asJson(json, "hardwareProperties"))
        );
    }

    /**
     * parses `xcrun devicectl list devices -j @dest-file` response
     * {
     *   "result" : {
     *     "devices" : []
     *   }
     * }
     */
    public static List<AppleDevice> parseListResponse(@Required JsonObject json) {
        JsonObject result = asJson(json, "result");
        return asObjectStream(result, "devices", Stream.empty())
            .map(DeviceCtlParsers::parseAppleDevice)
            .filter(d -> d.deviceProperties.bootState)
            .collect(Collectors.toList());
    }

    /**
     * parses `xcrun devicectl device info details -d -j @dest-file` response
     * {
     *   "result" : {
     *   }
     * }
     */
    public static AppleDevice parseDeviceInfoResponse(@Required JsonObject json) {
        JsonObject result = asJson(json, "result");
        if (result == null) throw new IllegalStateException("Unexpected JSON response: result is missing!");
        return parseAppleDevice(result);
    }

    //
    // Internal annotations for visibility
    //
    @Retention(RetentionPolicy.SOURCE)
    public @interface Required {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Optional {
    }

    //
    // JSON utilities bellow
    //

    public static Stream<JsonObject> toObjectStream(@Required JsonArray arr) {
        return ((List<?>) arr).stream()
            .filter(o -> o instanceof JsonObject)
            .map(o -> (JsonObject)o);
    }

    public static Stream<JsonObject> asObjectStream(@Optional JsonObject json, String key, Stream<JsonObject> defaultValue) {
        if (json == null) return defaultValue;
        Object o = json.get(key);
        if (o instanceof JsonArray) return toObjectStream((JsonArray) o);
        return defaultValue;
    }

    public static String asString(@Optional JsonObject json, String key, String defaultValue) {
        if (json == null) return defaultValue;
        Object o = json.get(key);
        if (o instanceof String) return (String) o;
        return defaultValue;
    }

    public static String asString(@Optional JsonObject json, String key) {
        return asString(json, key, null);
    }

    public static JsonObject asJson(@Optional JsonObject json, String key) {
        if (json == null) return null;
        Object o = json.get(key);
        if (o instanceof JsonObject) return (JsonObject) o;
        return null;
    }

    public static long asLong(@Optional JsonObject json, String key, long defaultValue) {
        if (json == null) return defaultValue;
        Object o = json.get(key);
        if (o instanceof Number) return ((Number) o).longValue();
        return defaultValue;
    }

}
