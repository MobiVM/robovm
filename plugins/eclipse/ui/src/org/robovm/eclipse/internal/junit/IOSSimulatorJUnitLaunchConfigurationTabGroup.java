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
package org.robovm.eclipse.internal.junit;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaSourceLookupTab;
import org.eclipse.jdt.junit.launcher.JUnitLaunchConfigurationTab;
import org.robovm.eclipse.internal.IOSEnvironmentTab;
import org.robovm.eclipse.internal.IOSSimulatorLaunchConfigurationTabGroup;

/**
 *
 */
public class IOSSimulatorJUnitLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

    @Override
    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        setTabs(new ILaunchConfigurationTab[] {
            new JUnitLaunchConfigurationTab(),
            new IOSSimulatorLaunchConfigurationTabGroup.SimulatorTab(false),
            new JavaClasspathTab(),
            new JavaSourceLookupTab(),
            new IOSEnvironmentTab(),
            new CommonTab()
        });
    }
}
