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

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;

import javax.swing.*;
import java.util.Map;

/**
 * Custom project wizard step that lets the user specify
 * various attributes of the new project/module
 */
public class RoboVmModuleWizardStep extends ModuleWizardStep {
    private final RoboVmNewModuleEditor editor;
    private final RoboVmModuleBuilder builder;

    public RoboVmModuleWizardStep(RoboVmModuleBuilder builder, WizardContext wizardContext, ModulesProvider modulesProvider,
                                  Map<String, String> customValues) {
        super();
        this.editor = new RoboVmNewModuleEditor();
        if (customValues != null)
            applyCustomValues(customValues);
        this.builder = builder;
    }

    public void disableBuildSystem() {
        editor.buildSystemLabel.setVisible(false);
        editor.gradleRadioButton.setVisible(false);
        editor.mavenRadioButton.setVisible(false);
        editor.noneRadioButton.setVisible(false);
    }

    @Override
    public JComponent getComponent() {
        return editor.panel;
    }

    @Override
    public void updateDataModel() {
        builder.setApplicationId(editor.appId.getText());
        builder.setApplicationName(editor.appName.getText());
        builder.setMainClassName(editor.mainClassName.getText());
        builder.setPackageName(editor.packageName.getText());
        if(editor.gradleRadioButton.isSelected()) {
            builder.setBuildSystem(RoboVmModuleBuilder.BuildSystem.Gradle);
        } else if(editor.mavenRadioButton.isSelected()) {
            builder.setBuildSystem(RoboVmModuleBuilder.BuildSystem.Maven);
        } else {
            builder.setBuildSystem(RoboVmModuleBuilder.BuildSystem.None);
        }
    }

    /**
     * dkimitsa: applies custom titles for project templates that requires this. Ex. ios framework
     */
    private void applyCustomValues(Map<String, String> customTitles) {
        applyCustomTitle(customTitles.get("appIdLabel"), editor.appIdLabel);
        applyCustomTitle(customTitles.get("appNameLabel"), editor.appNameLabel);
        applyCustomTitle(customTitles.get("packageNameLabel"), editor.packageNameLabel);
        applyCustomTitle(customTitles.get("mainClassNameLabel"), editor.mainClassNameLabel);

        applyCustomValue(customTitles.get("appId"), editor.appId);
        applyCustomValue(customTitles.get("appName"), editor.appName);
        applyCustomValue(customTitles.get("packageName"), editor.packageName);
        applyCustomValue(customTitles.get("mainClassName"), editor.mainClassName);
    }

    private void applyCustomTitle(String title, JLabel label) {
        if (title != null)
            label.setText(title);
    }

    private void applyCustomValue(String value, JTextField field) {
        if (value != null)
            field.setText(value);
    }
}
