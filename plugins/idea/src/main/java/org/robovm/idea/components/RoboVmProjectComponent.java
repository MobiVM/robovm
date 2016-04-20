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
package org.robovm.idea.components;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.SdkType;
import org.jetbrains.annotations.NotNull;
import org.robovm.idea.RoboVmPlugin;

/**
 * Used to setup the {@link org.robovm.idea.RoboVmPlugin} whenever
 * a project is opened.
 */
public class RoboVmProjectComponent implements ProjectComponent {
    private final Project project;

    public RoboVmProjectComponent(Project project) {
        this.project = project;
    }

    public void initComponent() {
        SdkType.findInstance(org.jetbrains.android.sdk.AndroidSdkType.class);
    }

    public void disposeComponent() {
    }

    @NotNull
    public String getComponentName() {
        return "org.robovm.idea.components.RoboVmProjectComponent";
    }

    public void projectOpened() {
        RoboVmPlugin.initializeProject(project);
    }

    public void projectClosed() {
        RoboVmPlugin.unregisterProject(project);
    }
}
