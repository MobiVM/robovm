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

import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.robovm.compiler.target.ios.DeviceType;
import org.robovm.compiler.target.ios.DeviceType.DeviceFamily;

/**
 *
 */
public class IOSSimulatorJUnitLaunchShortcut extends AbstractJUnitLaunchShortcut {

    @Override
    protected String getConfigurationTypeId() {
        return IOSSimulatorJUnitLaunchConfigurationDelegate.TYPE_ID;
    }

    @Override
    protected void customizeConfiguration(ILaunchConfigurationWorkingCopy wc) {
        wc.setAttribute(IOSSimulatorJUnitLaunchConfigurationDelegate.ATTR_IOS_SIM_DEVICE_TYPE,
                DeviceType.getBestDeviceType(DeviceFamily.iPhone).getSimpleDeviceTypeId());
    }
}
