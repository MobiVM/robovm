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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * Resource change listener that observes changes in projects (import, classpath
 * changes, etc.). Adds RoboVM nature and classpath container if applicable, removing
 * any JDK container in the process.
 *
 */
public class RoboVMProjectObserver implements IResourceChangeListener {
    private static final RoboVMProjectObserver INSTANCE = new RoboVMProjectObserver();
    
    private RoboVMProjectObserver() {
    }
    
    public static RoboVMProjectObserver getInstance() {
        return INSTANCE;
    }

    public void start(IProgressMonitor monitor) throws CoreException {
        ResourcesPlugin.getWorkspace().run(new IWorkspaceRunnable() {
            
            @Override
            public void run(IProgressMonitor innerMonitor) throws CoreException {
             // Needed to make IJavaProject.getResolvedClasspath() work properly.
                JavaCore.initializeAfterLoad(innerMonitor);

                for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
                    if (p.isOpen()) {
                        try {
                            projectChanged(p);
                        } catch (CoreException e) {
                            RoboVMPlugin.log(e);
                        }
                    }
                }        
                
                ResourcesPlugin.getWorkspace().addResourceChangeListener(RoboVMProjectObserver.this);
            }
        }, null);                
    }
    
    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        if (event == null || event.getDelta() == null) {
            return;
        }

        try {
            event.getDelta().accept(new IResourceDeltaVisitor() {
                public boolean visit(final IResourceDelta delta) throws CoreException {
                    IResource resource = delta.getResource();                    
                    if ((resource.getType() & IResource.PROJECT) != 0) {
                        IProject project = (IProject) resource;                        
                        if (project.isOpen()) {                            
                            projectChanged(project);
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
    
    private void projectChanged(final IProject project) throws CoreException {        
        
        final IJavaProject javaProject = JavaCore.create(project);        
        if(javaProject == null || !javaProject.exists()) {
            return;
        }
        
        Set<String> roboVmLibs = new HashSet<String>();
        roboVmLibs.add("robovm-rt");
        roboVmLibs.add("robovm-objc");
        roboVmLibs.add("robovm-cocoatouch");
        
        final Set<String> foundRoboVmLibs = new HashSet<String>();
        
        boolean isRoboVMProject = false;        
        boolean hasRoboVMContainer = false;
        boolean hasRoboVMNature = project.hasNature(RoboVMNature.ID);
        
        for(IClasspathEntry entry: javaProject.getRawClasspath()) {
            if(RoboVMClasspathContainer.ID.equals(entry.getPath().toString())) {
                hasRoboVMContainer = true;
                isRoboVMProject = true;
            }
        }
        
        for(IClasspathEntry entry: javaProject.getResolvedClasspath(true)) {                        
            String lastSegment = entry.getPath().lastSegment();
            for(String lib: roboVmLibs) {
                if(lastSegment.startsWith(lib)) {
                    foundRoboVmLibs.add(lastSegment);
                    isRoboVMProject = true;
                    break;
                }
            }
        }
        
        // check if there's a robovm.xml in the root of the project
        isRoboVMProject &= project.getFile("robovm.xml").exists();  
        
        // check if we got a JRE container attached        
        boolean hasJREContainer = false;
        for(IClasspathEntry e: javaProject.getRawClasspath()) {              
            if(e.getPath().toString().startsWith("org.eclipse.jdt.launching.JRE_CONTAINER")) {
                hasJREContainer = true;
            }
        }
        
        if(isRoboVMProject) {                        
            if(!hasRoboVMContainer || !hasRoboVMNature || hasJREContainer) {
                final boolean hasContainer = hasRoboVMContainer;
                final boolean hasJRE = hasJREContainer;                        
                final boolean hasNature = hasRoboVMNature;                   
                
                // we need to submit the project modification as a job
                // as modifying the workspace tree during event notification
                // is not allowed.
                Job job = new Job("RoboVM Project Updater") {
                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        try {
                            ResourcesPlugin.getWorkspace().run(new IWorkspaceRunnable() {                    
                                @Override
                                public void run(IProgressMonitor monitor) throws CoreException {
                                    if(!hasNature) {                                        
                                        RoboVMNature.configureNatures(project, monitor);
                                    }
                                    
                                    if(!hasContainer || hasJRE) {                                        
                                        addClasspathContainer(javaProject, monitor, foundRoboVmLibs);
                                    }
                                }
                            }, null);
                        } catch (CoreException e) {
                            RoboVMPlugin.getConsoleLogger().error("Couldn't run project update job, %s", e.getMessage());
                            RoboVMPlugin.log(e);
                        }
                        return Status.OK_STATUS;
                    }
                };
                job.schedule();                                    
            }
        }
    }
    

    private void addClasspathContainer(IJavaProject javaProject, IProgressMonitor monitor,
            Set<String> foundRoboVmLibs) throws CoreException {
        // check if we need to update the container, Eclipse might have called us multiple times
        // concurrently (e.g. Gradle -> Refresh All), and we may already have added the containers
        boolean hasRtContainer = false;
        boolean hasCocoaTouchContainer = false;
        for(IClasspathEntry entry: javaProject.getRawClasspath()) {
            if(entry.getPath().equals(RoboVMClasspathContainer.PATH)) {
                hasRtContainer = true;
            }
            if(entry.getPath().equals(RoboVMCocoaTouchClasspathContainer.PATH)) {
                hasCocoaTouchContainer = true;
            }
        }
        List<IClasspathEntry> entries = new ArrayList<>(Arrays.asList(javaProject.getRawClasspath()));
        
        // add the RT container
        if(!hasRtContainer) {
            IClasspathEntry entry = JavaCore.newContainerEntry(RoboVMClasspathContainer.PATH, false);
            ClasspathContainerInitializer initializer = JavaCore.getClasspathContainerInitializer(RoboVMClasspathContainer.ID);
            initializer.initialize(RoboVMClasspathContainer.PATH, javaProject);            
            entries.add(0, entry);
        }   
        
        // remove the JRE container
        Iterator<IClasspathEntry> iter = entries.iterator();
        while(iter.hasNext()) {
            IClasspathEntry e = iter.next();
            if(e.getPath().toString().startsWith("org.eclipse.jdt.launching.JRE_CONTAINER")) {
                iter.remove();
            }
        }
        
        // conditionally add the cocoatouch container
        boolean hasCocoaTouch = false;
        for(String lib: foundRoboVmLibs) {
            if(lib.startsWith("robovm-cocoatouch")) {
                hasCocoaTouch = true;
                break;
            }
        }
        if(hasCocoaTouch && !hasCocoaTouchContainer) {
            IClasspathEntry entry = JavaCore.newContainerEntry(RoboVMCocoaTouchClasspathContainer.PATH, false);
            ClasspathContainerInitializer initializer = JavaCore.getClasspathContainerInitializer(RoboVMCocoaTouchClasspathContainer.ID);
            initializer.initialize(RoboVMCocoaTouchClasspathContainer.PATH, javaProject);            
            entries.add(1, entry);
        }
        
        // set the updated classpath
        javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[0]), monitor);        
    }
}
