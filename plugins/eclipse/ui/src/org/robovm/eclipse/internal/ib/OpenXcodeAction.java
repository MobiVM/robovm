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
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
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
            final IProject project = toProject(o);
            if (project != null) {
                final IBIntegratorProxy ib = IBIntegratorManager.getInstance().getIBIntegrator(project);
                if (ib == null)
                    continue;
                Job job = new Job("Opening Xcode") {
                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        SubMonitor subMonitor = SubMonitor.convert(monitor, 2);
                        try {
                            project.build(IncrementalProjectBuilder.AUTO_BUILD, monitor);
                            subMonitor.worked(1);
                            ib.openProject();
                            subMonitor.worked(1);
                        } catch (CoreException e) {
                            return Status.CANCEL_STATUS;
                        }
                        return Status.OK_STATUS;
                    }
                };
                job.schedule();
                break;
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
