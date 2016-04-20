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
package org.robovm.eclipse.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.swt.widgets.Composite;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * {@link EnvironmentTab} which doesn't support appending the current
 * environment.
 */
public final class IOSEnvironmentTab extends EnvironmentTab {

    @Override
    public void initializeFrom(ILaunchConfiguration configuration) {
        try {
            ILaunchConfigurationWorkingCopy wc = configuration.getWorkingCopy();
            wc.setAttribute(ILaunchManager.ATTR_APPEND_ENVIRONMENT_VARIABLES, false);
            super.initializeFrom(wc.doSave());
        } catch (CoreException e) {
            RoboVMPlugin.log(e);
        }
    }

    @Override
    protected void createAppendReplace(Composite parent) {
        super.createAppendReplace(parent);
        appendEnvironment.setVisible(false);
        replaceEnvironment.setVisible(false);
    }
}
