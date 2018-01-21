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
package org.robovm.idea.builder;

import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.platform.ProjectTemplate;
import com.intellij.platform.ProjectTemplatesFactory;
import com.intellij.platform.templates.BuilderBasedTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.robovm.idea.RoboVmIcons;

import javax.swing.*;
import java.util.HashMap;

/**
 * Returns a project template for every template known
 * by the templater. If a user selects one of the templates
 * it's build with the {@link RoboVmModuleBuilder}
 *
 */
public class RoboVmTemplatesFactory extends ProjectTemplatesFactory {
    @NotNull
    @Override
    public String[] getGroups() {
        return new String[] { "RoboVM" };
    }

    @Override
    public int getGroupWeight(String group) {
        return JavaModuleBuilder.JAVA_MOBILE_WEIGHT;
    }

    @Override
    public String getParentGroup(String group) {
        return "Java";
    }

    @Override
    public Icon getGroupIcon(String group) {
        return RoboVmIcons.ROBOVM_SMALL;
    }

    @NotNull
    @Override
    public ProjectTemplate[] createTemplates(String group, WizardContext context) {
        return new ProjectTemplate[] {
                new RoboVmProjectTemplate("RoboVM iOS App without storyboards", "A basic single view app without storyboards", new RoboVmModuleBuilder("ios-single-view-no-ib")),
                new RoboVmProjectTemplate("RoboVM iOS Framework", "A basic iOS framework template ", new RoboVmModuleBuilder("ios-framework",
                        new HashMap<String, String>(){{
                            put("appNameLabel", "Framework Name");
                            put("appIdLabel", "Framework Id");
                            put("mainClassName", "MyFramework");
                            put("packageName", "com.mycompany.myframework");
                            put("appName", "MyFramework");
                            put("appId", "com.mycompany.myframework");
                        }})),
                new RoboVmProjectTemplate("RoboVM Console App", "A console app for Mac OS X or Linux", new RoboVmModuleBuilder("console")),
        };
    }

    private static class RoboVmProjectTemplate extends BuilderBasedTemplate {
        private final String name;
        private final String description;

        public RoboVmProjectTemplate(String name, String description, ModuleBuilder builder) {
            super(builder);
            this.name = name;
            this.description = description;
        }

        @NotNull
        @Override
        public String getName() {
            return name;
        }

        @Nullable
        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public Icon getIcon() {
            return RoboVmIcons.ROBOVM_SMALL;
        }
    }
}
