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

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.robovm.eclipse.RoboVMPlugin;

/**
 *
 */
public abstract class AbstractNewXcodeFileWizard extends Wizard implements INewWizard {
    private IStructuredSelection selection;
    private WizardNewFileCreationPage page;
    private Map<String, Collection<File>> projectResourcePaths = new HashMap<String, Collection<File>>();

    protected abstract String getExtension();
    protected abstract String getTitle();
    protected abstract String getPageTitle();
    protected abstract String getPageDescription();
    protected abstract String getPageBanner();
    protected abstract String getPageName();
    protected abstract void createFile(IProject project, String name, File path);
    
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.selection = selection;
        setWindowTitle(getTitle());
    }

    private Collection<File> getProjectResourcePaths(IProject project) {
        Collection<File> resourcePaths = projectResourcePaths.get(project.getName());
        if (resourcePaths == null) {
            resourcePaths = RoboVMPlugin.getRoboVMProjectResourcePaths(project);
            projectResourcePaths.put(project.getName(), resourcePaths);
        }
        return resourcePaths;
    }

    @Override
    public boolean performFinish() {
        IPath containerPath = page.getContainerFullPath();
        if (containerPath == null) {
            return false;
        }

        IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(containerPath);
        IProject project = resource.getProject();
        File path = resource.getLocation().toFile();
        String name = page.getFileName();
        if (FilenameUtils.isExtension(name, getExtension())) {
            name = FilenameUtils.removeExtension(name);
        }

        createFile(project, name, path);
        try {
            resource.refreshLocal(IResource.DEPTH_ONE, null);
        } catch (CoreException e) {
            RoboVMPlugin.log(e);
        }

        return true;
    }

    @Override
    public boolean canFinish() {
        IPath containerPath = page.getContainerFullPath();
        if (containerPath == null) {
            return false;
        }
        if (page.getFileName() == null) {
            return false;
        }

        IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(containerPath);
        IProject project = resource.getProject();
        boolean valid = false;
        try {
            if (RoboVMPlugin.isRoboVMIOSProject(project)) {
                Collection<File> resourcePaths = getProjectResourcePaths(project);
                for (File f = resource.getLocation().toFile().getAbsoluteFile(); f != null; f = f.getParentFile()) {
                    if (resourcePaths.contains(f)) {
                        valid = true;
                        break;
                    }
                }
            }
        } catch (CoreException e) {
            RoboVMPlugin.log(e);
        }

        if (!valid) {
            page.setErrorMessage("Selected folder must be a resource folder in a RoboVM iOS project");
            return false;
        }

        File f = new File(resource.getLocation().toFile().getAbsoluteFile(), page.getFileName());
        if (!FilenameUtils.isExtension(f.getName(), getExtension())) {
            f = new File(f.getParentFile(), f.getName() + "." + getExtension());
        }
        if (f.exists()) {
            page.setErrorMessage("A file named '" + FilenameUtils.removeExtension(page.getFileName())
                    + "' already exists in the select folder");
            return false;
        }

        return true;
    }

    @Override
    public void addPages() {
        super.addPages();
        page = new WizardNewFileCreationPage(getPageName(), selection) {
            @Override
            protected void createAdvancedControls(Composite parent) {}

            @Override
            protected IStatus validateLinkedResource() {
                return Status.OK_STATUS;
            }
        };
        page.setImageDescriptor(RoboVMPlugin.getDefault().getImageRegistry()
                .getDescriptor(getPageBanner()));
        page.setTitle(getPageTitle());
        page.setDescription(getPageDescription());
        addPage(page);
    }

}
