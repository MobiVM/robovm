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
import com.intellij.openapi.options.Configurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RoboVmGlobalConfig implements Configurable {
    private static final String ROBOVM_COMPILE_ON_SAVE = "org.robovm.COMPILE_ON_SAVE";
    private boolean modified = false;
    private RoboVmGlobalConfigForm form;

    @Nls
    @Override
    public String getDisplayName() {
        return "RoboVM Settings";
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return null;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        if (form == null) {
            form = new RoboVmGlobalConfigForm(this);
        }
        return form.getPanel();
    }

    @Override
    public void disposeUIResources() {}

    @Override
    public boolean isModified() {
        return modified;
    }

    @Override
    public void apply() {
        modified = false;
    }

    @Override
    public void reset() {
        if (form != null) {
            form.updateConfig(this);
        }
        modified = true;
    }

    public static boolean isCompileOnSave() {
        // dkimitsa: forced to return false as compile on saved is not required for new xcode pluggin
//        return PropertiesComponent.getInstance().getBoolean(ROBOVM_COMPILE_ON_SAVE, true);
        return false;
    }

    public void setCompileOnSave(boolean isCompileOnSave) {
        PropertiesComponent.getInstance().setValue(ROBOVM_COMPILE_ON_SAVE, Boolean.toString(isCompileOnSave));
        modified = true;
    }
}
