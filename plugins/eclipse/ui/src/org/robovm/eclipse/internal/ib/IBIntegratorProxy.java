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
import java.util.List;
import java.util.Set;

import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Home;
import org.robovm.compiler.log.Logger;
import org.robovm.ibxcode.IBXcodeProject;

/**
 * 
 */
public class IBIntegratorProxy {

	private final Home home;
	private final String projectName;
	private final File projectLocation;
	private final File target;
	private List<File> classpath;
	private final Logger logger;
	
    public IBIntegratorProxy(Home home, Logger logger, String projectName, File projectLocation, File target) {
    	this.home = home;
    	this.logger = logger;
    	this.projectName = projectName;
    	this.projectLocation = projectLocation;
    	this.target = target;
    }

    public void setClasspath(List<File> classpath) {
    	this.classpath = classpath;
    }

    public File newIOSStoryboard(String name, File path) {
    	throw new RuntimeException("Not available");
    }

    public File newIOSView(String name, File path) {
    	throw new RuntimeException("Not available");
    }

    public File newIOSViewController(String name, File path) {
    	throw new RuntimeException("Not available");
    }

    public void openProject() {
        // load the robovm.xml file
    	IBConfigBuilder builder;
    	IBXcodeProject ibXcodeProject;
        try {
        	builder = new IBConfigBuilder();;
            builder.logger(this.logger);
            builder.readProjectProperties(this.projectLocation, false);
            builder.readProjectConfig(this.projectLocation, false);
            
            // set the user classpath entries
            builder.clearBootClasspathEntries();
            builder.clearClasspathEntries();
            for (File path : classpath) {
                builder.addClasspathEntry(path);
            }


            Config config = builder.build();
            ibXcodeProject = new IBXcodeProject(config);
        } catch (IOException e) {
            return;
        }

        File exportDir = new File(this.target, ".ib");
        ibXcodeProject.generate(this.projectLocation, exportDir, this.projectName, true);

    	
    }

    public void openProjectFile(String file) {
    	throw new RuntimeException("Not available");
    }

    public void start() {
    }

    public void shutDown() {
    }
    
    static class IBConfigBuilder extends Config.Builder {
        IBConfigBuilder() throws IOException {
        }

        @Override
        public Config build() throws IOException {
            // do not build any complex config as it is time consuming and not required at all for this task
            return this.config;
        }
    }

}
