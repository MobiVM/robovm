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

import com.intellij.ide.impl.NewProjectUtil;
import com.intellij.ide.projectWizard.NewProjectWizard;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;

/**
 * action to overcome idea studio limitation in creating new project
 */
public class ASNewProjectAction extends AnAction {
    public ASNewProjectAction() {
    }

    @Override
    public boolean startInTransaction() {
        return true;
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        NewProjectWizard wizard = new NewProjectWizard((Project)null, ModulesProvider.EMPTY_MODULES_PROVIDER, (String)null);
        NewProjectUtil.createNewProject(getEventProject(e), wizard);
    }
}
