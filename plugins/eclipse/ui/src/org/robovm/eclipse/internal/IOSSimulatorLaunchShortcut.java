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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.robovm.compiler.target.ios.DeviceType;
import org.robovm.compiler.target.ios.DeviceType.DeviceFamily;

/**
 * @author niklas
 *
 */
public abstract class IOSSimulatorLaunchShortcut extends AbstractProjectLaunchShortcut {

    @Override
    protected String getConfigurationTypeId() {
        return IOSSimulatorLaunchConfigurationDelegate.TYPE_ID;
    }

    @Override
    protected void customizeConfiguration(ILaunchConfigurationWorkingCopy wc) {
        wc.setAttribute(IOSSimulatorLaunchConfigurationDelegate.ATTR_IOS_SIM_DEVICE_TYPE,
                DeviceType.getBestDeviceType(getFamily()).getSimpleDeviceTypeId());
    }

    protected abstract DeviceFamily getFamily();

    protected List<ILaunchConfiguration> filterConfigs(List<ILaunchConfiguration> configs) throws CoreException {
        List<ILaunchConfiguration> result = new ArrayList<ILaunchConfiguration>();
        for (ILaunchConfiguration config : configs) {
            String deviceTypeId = config.getAttribute(IOSSimulatorLaunchConfigurationDelegate.ATTR_IOS_SIM_DEVICE_TYPE,
                    (String) null);
            if (deviceTypeId == null) {
                continue;
            }
            DeviceType type = DeviceType.getDeviceType(deviceTypeId);
            if (type != null && type.getFamily() == getFamily()) {
                result.add(config);
            }
        }
        return result;
    }
}
