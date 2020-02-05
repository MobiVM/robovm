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

import com.intellij.debugger.settings.DebuggerSettings;
import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.ui.classFilter.ClassFilter;
import org.jetbrains.annotations.NotNull;
import org.robovm.compiler.util.ToolchainUtil;
import org.robovm.idea.RoboVmPlugin;
import org.robovm.idea.components.setupwizard.JdkSetupDialog;
import org.robovm.idea.components.setupwizard.NoXcodeSetupDialog;
import org.robovm.idea.components.setupwizard.XcodeSetupDialog;
import org.robovm.idea.sdk.RoboVmSdkType;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/**
 * Call on app startup, responsible for extracting/updating the RoboVM SDK and
 * setting up the SDK so its available in IDEA.
 */
public class RoboVmApplicationComponent implements ApplicationComponent {
    public static final String ROBOVM_HAS_SHOWN_NO_XCODE_WIZARD = "robovm.hasShownNoXcodeWizard";

    @Override
    public void initComponent() {
        displaySetupWizard();
        RoboVmPlugin.extractSdk();
        setupDebugger();
    }

    private void displaySetupWizard() {
        // build with gradle plugin will try to run plugin and it will fail on any attempt to show dialogue.
        // skip any wizards if there is no graphics environment
        if (GraphicsEnvironment.isHeadless())
            return;

        // uncomment for debugging
        // PropertiesComponent.getInstance().unsetValue(ROBOVM_HAS_SHOWN_ANDROID_WIZARD);
        // PropertiesComponent.getInstance().unsetValue(ROBOVM_HAS_SHOWN_LICENSE_WIZARD);

        // make sure a JDK is configured
        Sdk jdk = RoboVmSdkType.findBestJdk();
        if (jdk == null) {
            new JdkSetupDialog().setVisible(true);
        }

        // make sure Xcode is installed
        // If we are on a Mac, otherwise
        // inform the user that they
        // won't be able to compile for
        // iOS
        if (System.getProperty("os.name").contains("Mac")) {
            try {
                ToolchainUtil.findXcodePath();
            } catch (Throwable e) {
                new XcodeSetupDialog().setVisible(true);
            }
        } else {
            if(!PropertiesComponent.getInstance().getBoolean(ROBOVM_HAS_SHOWN_NO_XCODE_WIZARD, false)) {
                new NoXcodeSetupDialog().setVisible(true);
                PropertiesComponent.getInstance().setValue(ROBOVM_HAS_SHOWN_NO_XCODE_WIZARD, "true");
            }
        }
    }

    /**
     ** setup stepping filters to disable enter into dalvik.* and libcore.* classes
     */
    private void setupDebugger() {
        // tests if filter is configured
        BiPredicate<ClassFilter[], String> patternConfiguredPredicate = (classFilters, pattern) -> {
            for (ClassFilter filter : classFilters) {
                // exact match
                String fp = filter.getPattern();
                if (fp.equals(pattern))
                    return true;
                // match as low level pattern
                if (fp.endsWith(".*") && pattern.startsWith(fp.substring(0, fp.length() - 1)))
                    return true;
            }
            return false;
        };

        String[] robovmFilters = {"dalvik.*", "libcore.*"};
        ClassFilter[] filters = DebuggerSettings.getInstance().getSteppingFilters();
        List<ClassFilter> modifiedFilters = null;
        for (String pattern : robovmFilters) {
            if (patternConfiguredPredicate.test(filters, pattern))
                continue;
            // not configured
            if (modifiedFilters == null)
                modifiedFilters =new ArrayList<>(Arrays.asList(filters));
            modifiedFilters.add(new ClassFilter(pattern));
        }

        if (modifiedFilters != null)
            DebuggerSettings.getInstance().setSteppingFilters(modifiedFilters.toArray(new ClassFilter[0]));
    }

    @Override
    public void disposeComponent() {}

    @NotNull
    @Override
    public String getComponentName() {
        return "org.robovm.idea.components.RoboVmApplicationComponent";
    }
}
