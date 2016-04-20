/*
 * Copyright (C) 2014 RoboVM AB
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
package org.robovm.eclipse.internal.junit;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.ios.DeviceType;
import org.robovm.compiler.target.ios.IOSSimulatorLaunchParameters;
import org.robovm.compiler.target.ios.IOSTarget;
import org.robovm.eclipse.internal.IOSSimulatorLaunchConfigurationDelegate;

/**
 *
 */
public class IOSSimulatorJUnitLaunchConfigurationDelegate extends AbstractJUnitLaunchConfigurationDelegate {

    public static final String TYPE_ID = "org.robovm.eclipse.IOSSimulatorJUnitLaunchConfigurationType";
    public static final String TYPE_NAME = "iOS Simulator JUnit Test";
    public static final String ATTR_IOS_SIM_DEVICE_TYPE = IOSSimulatorLaunchConfigurationDelegate.ATTR_IOS_SIM_DEVICE_TYPE;
    public static final String ATTR_IOS_SIM_ARCH = IOSSimulatorLaunchConfigurationDelegate.ATTR_IOS_SIM_ARCH;
    public static final Arch DEFAULT_ARCH = IOSSimulatorLaunchConfigurationDelegate.DEFAULT_ARCH;

    @Override
    protected Arch getArch(ILaunchConfiguration configuration, String mode) throws CoreException {
        Arch arch = DEFAULT_ARCH;
        try {
            arch = Arch.valueOf(configuration.getAttribute(ATTR_IOS_SIM_ARCH, DEFAULT_ARCH.toString()));
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
            ILaunchConfiguration configuration, String mode) throws CoreException, IOException {
        configBuilder = super.configure(configBuilder, configuration, mode);
        configBuilder.targetType(IOSTarget.TYPE);
        return configBuilder;
    }

    @Override
    protected void customizeLaunchParameters(Config config, LaunchParameters launchParameters,
            ILaunchConfiguration configuration, String mode) throws IOException, CoreException {
        super.customizeLaunchParameters(config, launchParameters, configuration, mode);

        IOSSimulatorLaunchParameters lp = (IOSSimulatorLaunchParameters) launchParameters;
        String deviceTypeId = configuration.getAttribute(ATTR_IOS_SIM_DEVICE_TYPE, (String) null);
        if (deviceTypeId != null) {
            lp.setDeviceType(DeviceType.getDeviceType(deviceTypeId));
        }
    }
}
