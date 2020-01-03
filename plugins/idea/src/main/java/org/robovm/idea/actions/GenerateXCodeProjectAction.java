/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.idea.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import org.jetbrains.annotations.NotNull;
import org.robovm.idea.RoboVmPlugin;
import org.robovm.idea.ibxcode.RoboVmIbXcodeProjectTask;

public class GenerateXCodeProjectAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        if (!RoboVmIbXcodeProjectTask.isBusy()) {
            Module module = anActionEvent.getDataContext().getData(LangDataKeys.MODULE);
            if (module != null) {
                // this workarounds the issue when there are module groups are created with suffixes _main, _test
                // as from project tree modules without suffix is picked up this caused no class path to be present
                // and empty project to be generated
                // TODO: this to be fixed on plugin level -- e.g. create project without module group etc (as in v1.14)
                module = workaroundModuleGroupingIssue(module);
                RoboVmIbXcodeProjectTask task = new RoboVmIbXcodeProjectTask(module);
                task.generateProject();
            }
        }
    }

    private Module workaroundModuleGroupingIssue(Module module) {
        String moduleName = module.getName();
        if (moduleName.endsWith("_main"))
            return module;
        // try to find module with sufix
        moduleName += "_main";
        for (Module m : ModuleManager.getInstance(module.getProject()).getModules()) {
            if (m.getName().equals(moduleName))
                return m;
        }

        return module;
    }

    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setEnabled(!RoboVmIbXcodeProjectTask.isBusy() && isValidModuleEvent(e));
    }

    private boolean isValidModuleEvent(AnActionEvent e) {
        Module module = e.getDataContext().getData(LangDataKeys.MODULE);
        return module != null && RoboVmPlugin.isRoboVmModule(module);
    }
}
