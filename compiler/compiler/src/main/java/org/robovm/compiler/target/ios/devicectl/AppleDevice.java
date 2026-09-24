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

import java.util.Set;



/**
 * Physical device types, consisting of the device type id and SDK version as
 * listed by xcrun devicectl list devices -j @dest-file
 */
public class AppleDevice {
    public final String identifier;
    public final Set<Capability> capability;
    public final ConnectionProperties connectionProperties;
    public final DeviceProperties deviceProperties;
    public final HardwareProperties hardwareProperties;

    public AppleDevice(
            String identifier,
            Set<Capability> capability,
            ConnectionProperties connectionProperties,
            DeviceProperties deviceProperties,
            HardwareProperties hardwareProperties
    ) {
        this.identifier = identifier;
        this.capability = capability;
        this.connectionProperties = connectionProperties;
        this.deviceProperties = deviceProperties;
        this.hardwareProperties = hardwareProperties;
    }

    @Override
    public String toString() {
        return "AppleDevice{" +
                "identifier='" + identifier + '\'' +
                ", capability=" + capability +
                ", connectionProperties=" + connectionProperties +
                ", deviceProperties=" + deviceProperties +
                ", hardwareProperties=" + hardwareProperties +
                '}';
    }

    /**
     * capability object as parsed from
     *  "result.devices[0].capabilities" : [
     *      {
     *        "featureIdentifier" : "com.apple.coredevice.feature.acquireusageassertion",
     *        "name" : "Acquire Usage Assertion"
     *      }
     *   ]
     */
    public final static class Capability extends ValueEnumEntry<String> {
        private Capability(String rawValue) { super(rawValue); }
        private static final Producer<String, Capability> producer = new Producer<>(Capability::new);
        public static Capability of(String id) {
            return producer.of(id);
        }

        // known constants
        public static Capability ACQUIRE_USAGE_ASSERTION = of("com.apple.coredevice.feature.acquireusageassertion");
        public static Capability CAPTURE_SYSDIAGNOSE = of("com.apple.coredevice.feature.capturesysdiagnose");
        public static Capability CREATE_SERVICE_CONNECTION = of("com.apple.dt.serviceconnection.create");
        public static Capability CREATE_SERVICE_SOCKET = of("com.apple.dt.servicesocket.create");
        public static Capability DISABLE_DDI = of("com.apple.coredevice.feature.disableddiservices");
        public static Capability DISCONNECT_DEVICE = of("com.apple.coredevice.feature.disconnectdevice");
        public static Capability INSTALL_APP = of("com.apple.coredevice.feature.installapp");
        public static Capability UNINSTALL_APP = of("com.apple.coredevice.feature.uninstallapp");
        public static Capability VIEW_DEVICE_SCREEN = of("com.apple.coredevice.feature.viewdevicescreen");
        public static Capability SPAWN_EXECUTABLE = of("com.apple.coredevice.feature.spawnexecutable");
    }

    /**
     * connectionProperties object as parsed from
     *  "result.devices[0].connectionProperties" : [
     *      {
     *           "authenticationType" : "manualPairing",
     *           "pairingState" : "paired",
     *           "transportType" : "wired",
     *           "tunnelState" : "connected",
     *           "tunnelIPAddress" : "fdeb:b11:406e::1",
     *      }
     *   ]
     */
    public final static class ConnectionProperties {
        ///  value of field "authenticationType" : "manualPairing",
        public static final class AuthenticationType extends ValueEnumEntry<String>{
            private AuthenticationType(String rawValue) { super(rawValue); }
            private static final Producer<String, AuthenticationType> producer = new Producer<>(AuthenticationType::new);
            public static AuthenticationType of(String id) {
                return producer.of(id == null ? "null" : id);
            }

            // known constants
            public static AuthenticationType MANUAL_PAIRING = of("manualPairing");
        }

        ///  value of field  pairingState" : "paired",
        public static final class PairingState extends ValueEnumEntry<String>{
            private PairingState(String rawValue) { super(rawValue); }
            private static final Producer<String, PairingState> producer = new Producer<>(PairingState::new);
            public static PairingState of(String id) {
                return producer.of(id == null ? "null" : id);
            }

            // known constants
            public static PairingState PAIRED = of("paired");
            public static PairingState UNPAIRED = of("unpaired");
        }

        /// value of field "transportType" : "wired",
        public static final class TransportType extends ValueEnumEntry<String>{
            private TransportType(String rawValue) { super(rawValue); }
            private static final Producer<String, TransportType> producer = new Producer<>(TransportType::new);
            public static TransportType of(String id) {
                return producer.of(id == null ? "null" : id);
            }

            // known constants
            public static TransportType WIRED = of("wired");
        }

        ///  value of field "tunnelState" : "connected",
        public static final class TunnelState extends ValueEnumEntry<String>{
            private TunnelState(String rawValue) { super(rawValue); }
            private static final Producer<String, TunnelState> producer = new Producer<>(TunnelState::new);
            public static TunnelState of(String id) {
                return producer.of(id == null ? "null" : id);
            }

            // known constants
            public static TunnelState CONNECTED = of("connected");
        }

        public final AuthenticationType authenticationType;
        public final PairingState pairingState;
        public final TransportType transportType;
        public final TunnelState tunnelState;
        public final String tunnelIPAddress;

        public ConnectionProperties(
                AuthenticationType authenticationType,
                PairingState pairingState,
                TransportType transportType,
                TunnelState tunnelState,
                String tunnelIPAddress
        ) {
            this.authenticationType = authenticationType;
            this.pairingState = pairingState;
            this.transportType = transportType;
            this.tunnelState = tunnelState;
            this.tunnelIPAddress = tunnelIPAddress;
        }

        @Override
        public String toString() {
            return "ConnectionProperties{" +
                    "authenticationType=" + authenticationType +
                    ", pairingState=" + pairingState +
                    ", transportType=" + transportType +
                    ", tunnelState=" + tunnelState +
                    '}';
        }
    }

    public final static class DeviceProperties {
        public final boolean bootState;           // "bootState" : "booted"
        public final boolean developerModeStatus; // "developerModeStatus" : "enabled",
        public final String name;                 //  "name" : "iPhone XR",
        public final String osBuildUpdate;        // "osBuildUpdate" : "22F76",
        public final String osVersionNumber;      // "osVersionNumber" : "18.5",

        public DeviceProperties(
                boolean bootState,
                boolean developerModeStatus,
                String name,
                String osBuildUpdate,
                String osVersionNumber
        ) {
            this.bootState = bootState;
            this.developerModeStatus = developerModeStatus;
            this.name = name;
            this.osBuildUpdate = osBuildUpdate;
            this.osVersionNumber = osVersionNumber;
        }

        @Override
        public String toString() {
            return "DeviceProperties{" +
                    "bootState=" + bootState +
                    ", developerModeStatus=" + developerModeStatus +
                    ", name='" + name + '\'' +
                    ", osBuildUpdate='" + osBuildUpdate + '\'' +
                    ", osVersionNumber='" + osVersionNumber + '\'' +
                    '}';
        }
    }

    public final static class HardwareProperties {
        ///  possible CPU types
            public static final class CPUType extends ValueEnumEntry<String> {
            private CPUType(String rawValue) {
                super(rawValue);
            }

            private static final Producer<String, CPUType> producer = new Producer<>(CPUType::new);

            public static CPUType of(String id) {
                return producer.of(id == null ? "null" : id);
            }

            // known constants
            public static CPUType ARM64E = of("arm64e");
            public static CPUType ARM64 = of("arm64");
            public static CPUType ARMV8 = of("armv8");
        }

        public final CPUType cpuType;       // "cpuType" : { "name" : "arm64e" }
        public final String deviceType;     // "deviceType" : "iPhone",
        public final long ecid;           // "ecid" : 1813464338726958,
        public final String hardwareModel;  // "hardwareModel" : "N841AP",
        public final String marketingName;  // "marketingName" : "iPhone XR",
        public final String platform;       // "platform" : "iOS",
        public final String productType;    // "productType" : "iPhone11,8"
        public final String serialNumber;   // "serialNumber" : "DX123456789"
        public final Set<CPUType> supportedCPUTypes;  // "supportedCPUTypes" : [ { "name" : "arm64e" } ]
        public final String udid;           // "udid" : "00001234-000123456789012"

        public HardwareProperties(
                CPUType cpuType,
                String deviceType,
                long ecid,
                String hardwareModel,
                String marketingName,
                String platform,
                String productType,
                String serialNumber,
                Set<CPUType> supportedCPUTypes,
                String udid
        ) {
            this.cpuType = cpuType;
            this.deviceType = deviceType;
            this.ecid = ecid;
            this.hardwareModel = hardwareModel;
            this.marketingName = marketingName;
            this.platform = platform;
            this.productType = productType;
            this.serialNumber = serialNumber;
            this.supportedCPUTypes = supportedCPUTypes;
            this.udid = udid;
        }

        @Override
        public String toString() {
            return "HardwareProperties{" +
                    "cpuType=" + cpuType +
                    ", deviceType='" + deviceType + '\'' +
                    ", ecid=" + ecid +
                    ", hardwareModel='" + hardwareModel + '\'' +
                    ", marketingName='" + marketingName + '\'' +
                    ", platform='" + platform + '\'' +
                    ", productType='" + productType + '\'' +
                    ", serialNumber='" + serialNumber + '\'' +
                    ", supportedCPUTypes=" + supportedCPUTypes +
                    ", udid='" + udid + '\'' +
                    '}';
        }
    }
}
