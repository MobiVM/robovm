/*
 * Copyright (C) 2012 RoboVM AB
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
package org.robovm.eclipse.internal;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.target.ios.IOSTarget;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * @author niklas
 *
 */
public class IOSDeviceLaunchConfigurationDelegate extends AbstractLaunchConfigurationDelegate {

    public static final String TYPE_ID = "org.robovm.eclipse.IOSDeviceLaunchConfigurationType";
    public static final String TYPE_NAME = "iOS Device App";
    public static final String ATTR_IOS_DEVICE_SIGNING_ID = 
            RoboVMPlugin.PLUGIN_ID + ".IOS_DEVICE_SIGNING_ID";
    public static final String ATTR_IOS_DEVICE_PROVISIONING_PROFILE = 
            RoboVMPlugin.PLUGIN_ID + ".IOS_DEVICE_PROVISIONING_PROFILE";
    public static final String ATTR_IOS_DEVICE_ARCH = 
            RoboVMPlugin.PLUGIN_ID + ".IOS_DEVICE_ARCH";

    public static final String SIGNING_ID_SKIP_SIGNING = "SkipSigning";

    public static final Arch DEFAULT_ARCH = Arch.thumbv7;

    @Override
    protected Arch getArch(ILaunchConfiguration configuration, String mode) throws CoreException {
        Arch arch = DEFAULT_ARCH;
        try {
            arch = Arch.valueOf(configuration.getAttribute(ATTR_IOS_DEVICE_ARCH, DEFAULT_ARCH.toString()));
        } catch (Throwable t) {
        }
        return arch;
    }

    @Override
    protected OS getOS(ILaunchConfiguration configuration, String mode) {
        return OS.ios;
    }
    
    @Override
    protected Config.Builder configure(Config.Builder configBuilder,
            ILaunchConfiguration configuration, String mode) throws IOException, CoreException {
        
        configBuilder.targetType(IOSTarget.TYPE);
        String signingId = configuration.getAttribute(ATTR_IOS_DEVICE_SIGNING_ID, (String) null);
        String profile = configuration.getAttribute(ATTR_IOS_DEVICE_PROVISIONING_PROFILE, (String) null);
        if (SIGNING_ID_SKIP_SIGNING.equals(signingId)) {
            configBuilder.iosSkipSigning(true);
        } else {
            if (signingId != null) {
                configBuilder.iosSignIdentity(SigningIdentity.find(SigningIdentity.list(), signingId));
            }
            if (profile != null) {
                configBuilder.iosProvisioningProfile(ProvisioningProfile.find(ProvisioningProfile.list(), profile));
            }
        }
        
        return configBuilder;
    }
}
