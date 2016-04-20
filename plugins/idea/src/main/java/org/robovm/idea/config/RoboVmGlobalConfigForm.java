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
package org.robovm.idea.config;

import com.intellij.ide.util.PropertiesComponent;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RoboVmGlobalConfigForm {
    private JPanel panel;
    private JCheckBox compileOnSaveRequiredCheckBox;

    public RoboVmGlobalConfigForm(final RoboVmGlobalConfig config) {
        super();
        updateConfig(config);
        compileOnSaveRequiredCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                config.setCompileOnSave(compileOnSaveRequiredCheckBox.isSelected());
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

    public void updateConfig(RoboVmGlobalConfig config) {
        compileOnSaveRequiredCheckBox.setSelected(config.isCompileOnSave());
    }
}
