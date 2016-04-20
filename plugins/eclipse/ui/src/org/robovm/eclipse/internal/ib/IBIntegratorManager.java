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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * 
 */
public class IBIntegratorManager implements IResourceChangeListener {
    private static boolean hasIBIntegrator;
    private static IBIntegratorManager instance;

    private final Map<IProject, IBIntegratorProxy> daemons = new HashMap<IProject, IBIntegratorProxy>();

    static {
        try {
            IBIntegratorProxy.getIBIntegratorClass();
            hasIBIntegrator = true;
        } catch (Throwable t) {
            hasIBIntegrator = false;
            RoboVMPlugin.getConsoleLogger().warn(t.getMessage());
        }
    }

    public static IBIntegratorManager getInstance() {
        if (instance == null) {
            instance = new IBIntegratorManager();
        }
        return instance;
    }

    public IBIntegratorProxy getIBIntegrator(IProject project) {
        return daemons.get(project);
    }

    public void start(IProgressMonitor monitor) throws CoreException {
        if (!System.getProperty("os.name").toLowerCase().contains("mac os x")) {
            return;
        }
        if (!hasIBIntegrator) {
            return;
        }

        // Needed to make IJavaProject.getResolvedClasspath() work properly.
        JavaCore.initializeAfterLoad(monitor);

        for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
            if (p.isOpen()) {
                try {
                    projectChanged(p);
                } catch (Throwable e) {
                    RoboVMPlugin.log(e);
                }
            }
        }
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
    }

    private void projectChanged(IProject project) throws CoreException {
        if (!RoboVMPlugin.isRoboVMIOSProject(project)) {
            shutdownDaemonIfRunning(project);
            return;
        }

        String name = project.getName();
        IBIntegratorProxy proxy = daemons.get(project);
        if (proxy == null) {
            try {
                File dir = RoboVMPlugin.getBuildDir(name);
                dir.mkdirs();
                RoboVMPlugin.consoleDebug("Starting Interface Builder integrator daemon for project %s", name);
                proxy = new IBIntegratorProxy(RoboVMPlugin.getRoboVMHome(), RoboVMPlugin.getConsoleLogger(), name, dir);
                proxy.start();
                daemons.put(project, proxy);
            } catch (RuntimeException e) {
                if (e.getClass().getSimpleName().equals("UnlicensedException")) {
                    RoboVMPlugin.getConsoleLogger().warn("Failed to start Interface Builder "
                            + "integrator for project " + name + ": " + e.getMessage());
                } else {
                    throw e;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (proxy != null) {
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            IJavaProject javaProject = JavaCore.create(project);

            File infoPlist = RoboVMPlugin.getRoboVMProjectInfoPlist(project);
            if (infoPlist != null) {
                proxy.setInfoPlist(infoPlist);
            }

            List<File> classpath = new ArrayList<>(resolveClasspath(root, javaProject));
            proxy.setClasspath(classpath);

            proxy.setSourceFolders(getOutputLocations(javaProject));

            Set<File> resourcePaths = RoboVMPlugin.getRoboVMProjectResourcePaths(project);
            proxy.setResourceFolders(resourcePaths);
        }
    }

    private LinkedHashSet<File> resolveClasspath(IWorkspaceRoot root, IJavaProject javaProject)
            throws JavaModelException {

        LinkedHashSet<File> classpath = new LinkedHashSet<>();
        for (IClasspathEntry cpe : javaProject.getResolvedClasspath(true)) {
            if (cpe.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
                IJavaProject jproj = JavaCore.create(root.findMember(cpe.getPath()).getProject());
                classpath.addAll(resolveClasspath(root, jproj));
            } else if (cpe.getEntryKind() != IClasspathEntry.CPE_SOURCE && cpe.getPath() != null) {
                File file = cpe.getPath().toFile();
                if (!file.exists()) {
                    // Probably a workspace absolute path. Resolve it.
                    IResource res = root.findMember(cpe.getPath());
                    if (res != null) {
                        file = res.getLocation().toFile();
                    }
                }
                if (file.exists()) {
                    classpath.add(file);
                }
            }
        }

        classpath.addAll(getOutputLocations(javaProject));

        return classpath;
    }

    private LinkedHashSet<File> getOutputLocations(IJavaProject javaProject)
            throws JavaModelException {

        LinkedHashSet<File> result = new LinkedHashSet<>();

        IProject project = javaProject.getProject();
        if (javaProject.getOutputLocation() != null) {
            File f = project.getFile(javaProject.getOutputLocation().removeFirstSegments(1)).getLocation().toFile();
            if (f.exists()) {
                result.add(f);
            }
        }
        for (IClasspathEntry cpe : javaProject.getRawClasspath()) {
            if (cpe.getOutputLocation() != null) {
                File f = project.getFile(cpe.getOutputLocation().removeFirstSegments(1)).getLocation().toFile();
                if (f.exists()) {
                    result.add(f);
                }
            }
        }

        return result;
    }

    private void shutdownDaemonIfRunning(IProject project) {
        String name = project.getName();
        IBIntegratorProxy proxy = daemons.remove(project);
        if (proxy != null) {
            RoboVMPlugin.consoleDebug("Shutting down Interface Builder integrator daemon for project %s", name);
            proxy.shutDown();
        }
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        if (event == null || event.getDelta() == null) {
            return;
        }

        try {
            event.getDelta().accept(new IResourceDeltaVisitor() {
                @Override
                public boolean visit(final IResourceDelta delta) throws CoreException {
                    IResource resource = delta.getResource();
                    if ((resource.getType() & IResource.PROJECT) != 0) {
                        IProject project = (IProject) resource;

                        if (project.isOpen()) {
                            if ((delta.getFlags() & IResourceDelta.OPEN) != 0 || !daemons.containsKey(project)) {
                                // Could be a RoboVM project that just opened.
                                projectChanged(project);
                                return false;
                            }
                        } else {
                            // Project was closed. Stop the daemon.
                            shutdownDaemonIfRunning(project);
                            return false;
                        }
                    } else if ((resource.getType() & IResource.FILE) != 0) {
                        if ("robovm.xml".equals(resource.getName())) {
                            // A robovm.xml has been modified in some way. Could
                            // be a change to the resource folders.
                            projectChanged(resource.getProject());
                            return false;
                        }
                    }
                    return true;
                }
            });

        } catch (Throwable t) {
            RoboVMPlugin.log(t);
        }
    }

}
