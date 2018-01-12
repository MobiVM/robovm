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

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nullable;
import org.robovm.compiler.target.framework.FrameworkTarget;
import org.robovm.idea.RoboVmPlugin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class CreateFrameworkDialog extends DialogWrapper {
    private static final String MODULE_NAME = "robovm.frameworkConfig.moduleName";
    private static final String DESTINATION_DIR = "robovm.frameworkConfig.destinationDir";

    private JPanel panel;
    private JButton browseButton;
    private JTextField destinationDir;
    private JComboBox module;
    private Project project;

    protected CreateFrameworkDialog(@Nullable Project project) {
        super(project);
        this.project = project;
        init();
        setTitle("Create framework");
        populateControls();
    }

    private void populateControls() {
        PropertiesComponent properties = PropertiesComponent.getInstance(project);
        String configModule = properties.getValue(MODULE_NAME, "");
        String configDestDir = properties.getValue(DESTINATION_DIR, "");

        for(Module module: RoboVmPlugin.getRoboVmModules(project, FrameworkTarget.TYPE)) {
            this.module.addItem(module.getName());
            if(module.getName().equals(configModule)) {
                this.module.setSelectedIndex(this.module.getItemCount()-1);
            }
        }

        if(!configDestDir.isEmpty()) {
            destinationDir.setText(configDestDir);
        }

        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileChooserDialog fileChooser = FileChooserFactory.getInstance()
                        .createFileChooser(new FileChooserDescriptor(true, false, false, false, false, false) {
                            @Override
                            public boolean isFileVisible(VirtualFile file, boolean showHiddenFiles) {
                                return file.isDirectory();
                            }

                            @Override
                            public boolean isFileSelectable(VirtualFile file) {
                                return file.isDirectory();
                            }
                        }, null, panel);
                VirtualFile[] dir = fileChooser.choose(project);
                if (dir != null && dir.length > 0) {
                    destinationDir.setText(dir[0].getCanonicalPath());
                }
            }
        });
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return panel;
    }

    @Nullable
    @Override
    protected ValidationInfo doValidate() {
        if(this.module.getSelectedIndex() == -1) {
            return new ValidationInfo("No RoboVM module selected");
        }
        if(this.destinationDir.getText() == null || this.destinationDir.getText().length() == 0) {
            return new ValidationInfo("Specify a destination directory");
        }
        File destDir = new File(this.destinationDir.getText());
        if(!destDir.exists()) {
            return new ValidationInfo("Destination directory does not exist");
        }
        if(!destDir.isDirectory()) {
            return new ValidationInfo("Destination is not a directory");
        }
        return null;
    }

    public CreateFrameworkAction.FrameworkConfig getFrameworkConfig() {
        saveProperties();
        Module module = ModuleManager.getInstance(project).findModuleByName(this.module.getSelectedItem().toString());
        return new CreateFrameworkAction.FrameworkConfig(module, new File(this.destinationDir.getText()));
    }

    private void saveProperties() {
        PropertiesComponent properties = PropertiesComponent.getInstance(project);
        properties.setValue(MODULE_NAME, module.getSelectedItem().toString());
        properties.setValue(DESTINATION_DIR, destinationDir.getText());
    }
}
