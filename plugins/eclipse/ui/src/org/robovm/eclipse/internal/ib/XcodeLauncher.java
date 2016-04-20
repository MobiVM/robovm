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
package org.robovm.eclipse.internal.ib;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IEditorLauncher;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * Opens a file in Xcode.
 */
public class XcodeLauncher implements IEditorLauncher {

    @Override
    public void open(IPath file) {
        try {
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            for (IProject project : root.getProjects()) {
                if (project.isOpen() && RoboVMPlugin.isRoboVMIOSProject(project)) {
                    if (project.getLocation().isPrefixOf(file)) {
                        IBIntegratorProxy ib = IBIntegratorManager.getInstance().getIBIntegrator(project);
                        if (ib != null) {
                            ib.openProjectFile(file.toString());
                        }
                    }
                }
            }
        } catch (CoreException e) {
            RoboVMPlugin.log(e);
        }
    }

}
