/*
 * Copyright (C) 2015 RoboVM AB
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
package org.robovm.idea.running;

import org.robovm.compiler.target.ios.DeviceType;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.idea.running.RoboVmRunConfiguration.EntryType;

public final class RoboVmRunConfigurationUtils {
    /**
     * returns signing identity from run configuration
     */
    public static SigningIdentity getIdentity(RoboVmRunConfiguration config) {
        SigningIdentity result;
        String signingId = config.getSigningIdentity();
        EntryType entryType = config.getSigningIdentityType();

        if (config.getSigningIdentityType() == null) {
            // legacy, lookup by name
            if (!RoboVmRunConfiguration.AUTO_SIGNING_IDENTITY.equals(config.getSigningIdentity()))
                result =  SigningIdentity.find(SigningIdentity.list(), signingId);
            else
                result = null; // auto
        } else if (entryType == EntryType.ID) {
            // lookup by id/footprint
            result = SigningIdentity.find(SigningIdentity.list(), signingId);
        } else {
            result = null; // auto
        }

        return  result;
    }

    public static ProvisioningProfile getProvisioningProfile(RoboVmRunConfiguration config) {
        ProvisioningProfile result;
        String profile = config.getProvisioningProfile();
        EntryType entryType = config.getProvisioningProfileType();
        if (entryType == null) {
            // legacy, lookup by profile name
            if (!RoboVmRunConfiguration.AUTO_PROVISIONING_PROFILE.equals(profile))
                result = ProvisioningProfile.find(ProvisioningProfile.list(), profile);
            else
                result = null; // auto
        } else if (entryType == EntryType.ID) {
            // lookup by udid
            result = ProvisioningProfile.find(ProvisioningProfile.list(), profile);
        } else {
            result = null; // auto
        }

        return result;
    }

    public static DeviceType getSimulator(RoboVmRunConfiguration config) {
        DeviceType result;
        String simulator = config.getSimulator();
        EntryType entryType = config.getSimulatorType();
        if (entryType == null) {
            // legacy, lookup by simulator name
            result = DeviceType.listDeviceTypes().stream()
                    .filter(t -> t.getDeviceName().equals(simulator) && t.getVersion().versionCode == config.getSimulatorSdk())
                    .findAny().orElse(null);
        } else {
            switch (entryType) {
                case ID:
                    // lookup by udid
                    result = DeviceType.listDeviceTypes().stream()
                            .filter(t -> t.getUdid().equals(simulator)).findAny().orElse(null);
                    break;
                case AUTO:
                    // auto iPhone
                    result = DeviceType.getBestDeviceType(DeviceType.DeviceFamily.iPhone);
                    break;
                case AUTO2:
                    // auto iPad
                    result = DeviceType.getBestDeviceType(DeviceType.DeviceFamily.iPad);
                    break;
                default:
                    result = null;
            }
        }

        return result;
    }
}
