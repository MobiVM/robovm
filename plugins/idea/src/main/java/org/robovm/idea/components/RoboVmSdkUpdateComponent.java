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

import com.intellij.ProjectTopics;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleComponent;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootEvent;
import com.intellij.openapi.roots.ModuleRootListener;
import com.intellij.openapi.roots.ModuleRootManager;
import org.jetbrains.annotations.NotNull;
import org.robovm.idea.RoboVmPlugin;

/**
 * Adds or updates the RoboVM SDK to a module, sets compiler flags.
 */
public class RoboVmSdkUpdateComponent implements ModuleComponent {
    private final Module module;
    private final Project project;

    public RoboVmSdkUpdateComponent(Module module, final Project project) {
        this.module = module;
        this.project = project;

        // register a listener on root model changes
        project.getMessageBus().connect().subscribe(ProjectTopics.PROJECT_ROOTS, new ModuleRootListener() {
            public void rootsChanged(@NotNull ModuleRootEvent event) {
                for (Module module : ModuleManager.getInstance(project).getModules()) {
                    updateModule(module);
                }
            }
        });
    }

    @Override
    public void moduleAdded() {
        updateModule(module);
    }

    private void updateModule(final Module moduleToUpdate) {
        if (!RoboVmPlugin.isRoboVmModule(moduleToUpdate)) {
            return;
        }
        ApplicationManager.getApplication().invokeLater(() -> ApplicationManager.getApplication().runWriteAction(() -> {
            // module might already have been disposed, need to fetch it
            // by name
            Module module = (!project.isDisposed() && !moduleToUpdate.isDisposed())
                    ? ModuleManager.getInstance(project).findModuleByName(moduleToUpdate.getName())
                    : null;
            if (module != null) {
                ModuleRootManager manager = ModuleRootManager.getInstance(module);
                ModifiableRootModel model = manager.getModifiableModel();
                Sdk sdk = RoboVmPlugin.getSdk();
                if (sdk != null && !sdk.equals(model.getSdk())) {
                    model.setSdk(sdk);
                    model.commit();
                }
            }
        }));
    }

    @Override
    public void initComponent() {
    }

    @Override
    public void disposeComponent() {

    }

    @NotNull
    @Override
    public String getComponentName() {
        return "org.robovm.idea.components.RoboVmSdkUpdateComponent";
    }
}
