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
package org.robovm.idea.running;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.target.ConsoleTarget;
import org.robovm.compiler.target.ios.DeviceType;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.idea.RoboVmPlugin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RoboVmConsoleRunConfigurationSettingsEditor extends SettingsEditor<RoboVmRunConfiguration> {
    private JComboBox module;
    private JPanel panel;
    private JTextArea args;
    private JTextField workingDir;
    private JButton browseButton;

    @Override
    protected void resetEditorFrom(RoboVmRunConfiguration config) {
        populateControls(config);
    }

    @Override
    protected void applyEditorTo(RoboVmRunConfiguration config) throws ConfigurationException {
        config.setModuleName(module.getSelectedItem() != null ? module.getSelectedItem().toString() : "");
        config.setTargetType(RoboVmRunConfiguration.TargetType.Console);
        config.setArguments(args.getText());
        config.setWorkingDir(workingDir.getText());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return panel;
    }

    private void populateControls(final RoboVmRunConfiguration config) {
        // populate with RoboVM Sdk modules
        this.module.removeAllItems();
        List<Module> roboVmModules = RoboVmPlugin.getRoboVmModules(config.getProject(), ConsoleTarget.TYPE);
        Collections.sort(roboVmModules, new Comparator<Module>() {
            @Override
            public int compare(Module o1, Module o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Module module: roboVmModules) {
            this.module.addItem(module.getName());
            if(module.getName().equals(config.getModuleName())) {
                this.module.setSelectedIndex(this.module.getItemCount() - 1);
            }
        }

        this.args.setText(config.getArguments());
        String dir = config.getWorkingDir();
        if(dir == null || dir.trim().isEmpty()) {
            dir = config.getProject().getBasePath();
        }
        this.workingDir.setText(dir);
        this.browseButton.addActionListener(new ActionListener() {
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
                VirtualFile[] dir = fileChooser.choose(config.getProject());
                if(dir != null && dir.length > 0) {
                    workingDir.setText(dir[0].getCanonicalPath());
                }
            }
        });
    }
}
