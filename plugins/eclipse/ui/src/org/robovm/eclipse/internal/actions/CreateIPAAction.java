/*
 * Copyright (C) 2013 RoboVM AB
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
package org.robovm.eclipse.internal.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.eclipse.RoboVMPlugin;
import org.robovm.eclipse.internal.AppCompilerThread;

/**
 * 
 */
public class CreateIPAAction implements IObjectActionDelegate {

    private ISelection selection;
    private CreateIPADialog dialog = null;

    @Override
    public void run(IAction action) {
        if (!(selection instanceof IStructuredSelection)) {
            return;
        }
        for (Object o : ((IStructuredSelection) selection).toList()) {
            IProject project = toProject(o);
            if (project != null) {
                createIPA(project);
            }
        }
    }

    private void createIPA(final IProject project) {
        if (dialog == null) {
            dialog = new CreateIPADialog(RoboVMPlugin.getShell());
            dialog.create();
        }
        if (dialog.open() != Window.OK) {
            return;
        }

        final String destDir = dialog.getDestinationDir();
        final String signingIdentity = dialog.getSigningIdentity();
        final String provisioningProfile = dialog.getProvisioningProfile();
        final List<Arch> archs = dialog.getArchs();

        new Job("Package for App Store/Ad-Hoc distribution") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    RoboVMPlugin.consoleInfo("Creating package in " + destDir + " ...");
                    if (monitor != null) {
                        monitor.beginTask("Package for App Store/Ad-Hoc distribution", 3);
                    }

                    File projectRoot = project.getLocation().toFile();
                    Config.Builder configBuilder = new Config.Builder();
                    configBuilder.logger(RoboVMPlugin.getConsoleLogger());
                    RoboVMPlugin.loadConfig(configBuilder, projectRoot, false);
                    configBuilder.os(OS.ios);
                    configBuilder.archs(archs);
                    configBuilder.installDir(new File(destDir));
                    configBuilder.iosSignIdentity(SigningIdentity.find(SigningIdentity.list(), signingIdentity));
                    if (provisioningProfile != null) {
                        configBuilder.iosProvisioningProfile(ProvisioningProfile.find(ProvisioningProfile.list(),
                                provisioningProfile));
                    }

                    IJavaProject javaProject = JavaCore.create(project);
                    for (String entry : getClasspath(javaProject)) {
                        configBuilder.addClasspathEntry(new File(entry));
                    }
                    //
                    configBuilder.home(RoboVMPlugin.getRoboVMHome());
                    Config config = configBuilder.build();

                    if (monitor != null) {
                        monitor.worked(1);
                    }

                    AppCompiler compiler = new AppCompiler(config);
                    AppCompilerThread thread = new AppCompilerThread(compiler, monitor) {
                        protected void doCompile() throws Exception {
                            compiler.build();
                            compiler.archive();
                        }
                    };
                    thread.compile();
                    if (monitor != null && monitor.isCanceled()) {
                        RoboVMPlugin.consoleInfo("Build canceled");
                        return Status.CANCEL_STATUS;
                    }

                    if (monitor != null) {
                        monitor.worked(1);
                    }

                    RoboVMPlugin.consoleInfo("Package successfully created in " + destDir);

                    return Status.OK_STATUS;
                } catch (JavaModelException e) {
                    return e.getJavaModelStatus();
                } catch (CoreException e) {
                    return e.getStatus();
                } catch (Exception e) {
                    return new Status(IStatus.ERROR, RoboVMPlugin.PLUGIN_ID,
                            "Packaging failed. Check the RoboVM console for more information.", e);
                } finally {
                    if (monitor != null) {
                        monitor.done();
                    }
                }
            }
        }.schedule();
    }

    private String[] getClasspath(IJavaProject project) throws CoreException {
        Set<String> classpath = new HashSet<String>();
        getClasspath(project, classpath);
        return classpath.toArray(new String[classpath.size()]);
    }

    /**
     * Recursively gathers all user classpath entries
     */
    private void getClasspath(IJavaProject project, Set<String> classpath) throws CoreException {
        IRuntimeClasspathEntry[] unresolvedEntries = JavaRuntime.computeUnresolvedRuntimeClasspath(project);
        List<IRuntimeClasspathEntry> entries = new ArrayList<IRuntimeClasspathEntry>();
        for (IRuntimeClasspathEntry entry : unresolvedEntries) {
            entries.addAll(Arrays.asList(JavaRuntime.resolveRuntimeClasspathEntry(entry, project)));
        }

        for (IRuntimeClasspathEntry entry : entries) {
            if (entry.getClasspathProperty() == IRuntimeClasspathEntry.USER_CLASSES) {
                IProject projectEntry = toProject(entry.getResource());
                if (projectEntry != null) {
                    IJavaProject projectDependency = JavaCore.create(projectEntry);
                    if (!projectDependency.equals(project)) {
                        getClasspath(projectDependency, classpath);
                    }
                } else {
                    String location = entry.getLocation();
                    if (location != null) {
                        classpath.add(location);
                    }
                }
            }
        }

        classpath.addAll(Arrays.asList(JavaRuntime.computeDefaultRuntimeClassPath(project)));
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
