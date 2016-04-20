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
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Opens the temp Xcode project for the selected Eclipse project.
 */
public class OpenXcodeAction implements IObjectActionDelegate {

    private ISelection selection;

    @Override
    public void run(IAction action) {
        if (!(selection instanceof IStructuredSelection)) {
            return;
        }
        for (Object o : ((IStructuredSelection) selection).toList()) {
            IProject project = toProject(o);
            if (project != null) {
                IBIntegratorProxy ib = IBIntegratorManager.getInstance().getIBIntegrator(project);
                if (ib != null) {
                    ib.openProject();
                }
            }
        }
    }

    private IProject toProject(Object o) {
        if (o instanceof IProject) {
            return (IProject) o;
        }
        if (o instanceof IAdaptable) {
            return (IProject) ((IAdaptable) o).getAdapter(IProject.class);
        }
        return null;
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        this.selection = selection;
    }

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    }

}
