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
package org.robovm.idea.sdk;

import java.io.File;

import javax.swing.*;

import org.jdom.Element;
import org.jetbrains.annotations.Nullable;
import org.robovm.compiler.Version;
import org.robovm.idea.RoboVmIcons;
import org.robovm.idea.RoboVmPlugin;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.projectRoots.*;
import com.intellij.openapi.projectRoots.impl.JavaDependentSdkType;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.vfs.JarFileSystem;
import com.intellij.openapi.vfs.VirtualFile;

public class RoboVmSdkType extends JavaDependentSdkType implements JavaSdkType {
    public static final String SDK_NAME = "RoboVM SDK";

    public RoboVmSdkType() {
        super(SDK_NAME);
    }

    @Override
    public String getBinPath(Sdk sdk) {
        Sdk jdk = findBestJdk();
        return ((JavaSdk)jdk.getSdkType()).getBinPath(jdk);
    }

    @Override
    public String getToolsPath(Sdk sdk) {
        Sdk jdk = findBestJdk();
        return ((JavaSdk)jdk.getSdkType()).getToolsPath(jdk);
    }

    @Override
    public String getVMExecutablePath(Sdk sdk) {
        Sdk jdk = findBestJdk();
        return ((JavaSdk)jdk.getSdkType()).getVMExecutablePath(jdk);
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        return RoboVmPlugin.getSdkHome().getAbsolutePath();
    }

    @Override
    public boolean isValidSdkHome(String path) {
        return RoboVmPlugin.getSdkHome().equals(new File(path));
    }

    @Override
    public String suggestSdkName(String currentSdkName, String sdkHome) {
        return SDK_NAME + " " + Version.getVersion();
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(SdkModel sdkModel, SdkModificator sdkModificator) {
        return null;
    }

    @Override
    public String getPresentableName() {
        return SDK_NAME;
    }

    @Override
    public Icon getIcon() {
        return RoboVmIcons.ROBOVM_SMALL;
    }

    @Override
    public Icon getIconForAddAction() {
        return RoboVmIcons.ROBOVM_SMALL;
    }

    @Override
    public void saveAdditionalData(SdkAdditionalData additionalData, Element additional) {
    }

    @Override
    public boolean setupSdkPaths(final Sdk sdk, final SdkModel sdkModel) {
        Sdk jdk = findBestJdk();
        setupSdkRoots(sdk, jdk);
        return true;
    }

    public void setupSdkRoots(Sdk sdk, Sdk jdk) {
        SdkModificator sdkModificator = sdk.getSdkModificator();
        sdkModificator.removeAllRoots();

        // add all class and source jars from the SDK lib/ folder
        for(File file: RoboVmPlugin.getSdkLibraries()) {
            VirtualFile virtualFile = JarFileSystem.getInstance().findLocalVirtualFileByPath(file.getAbsolutePath());
            sdkModificator.addRoot(virtualFile, file.getName().endsWith("-sources.jar")?  OrderRootType.SOURCES: OrderRootType.CLASSES);
        }

        // set the JDK version as the version string, otherwise
        // IDEA gets angry
        sdkModificator.setVersionString(jdk.getVersionString());

        // set the home path, we check this in createSdkIfNotExists
        sdkModificator.setHomePath(RoboVmPlugin.getSdkHome().getAbsolutePath());

        // commit changes and let IDEA handle the rest
        sdkModificator.commitChanges();
    }

    public static void createSdkIfNotExists() {
        // check if a RoboVM SDK already exists
        // for our version
        if(RoboVmPlugin.getSdk() != null) return;

        // if not, create a new SDK
        ApplicationManager.getApplication().runWriteAction(new Runnable() {
            @Override
            public void run() {
                RoboVmSdkType sdkType = new RoboVmSdkType();
                Sdk sdk = ProjectJdkTable.getInstance().createSdk(sdkType.suggestSdkName(null, null), sdkType);
                sdkType.setupSdkRoots(sdk, findBestJdk());
                ProjectJdkTable.getInstance().addJdk(sdk);
                RoboVmPlugin.logInfo(null, "Added new SDK " + sdk.getName());
            }
        });
    }

    public static Sdk findBestJdk() {
        // filter out all Java SDKs, so we can present them
        Sdk bestJdk = null;
        for(Sdk jdk: ProjectJdkTable.getInstance().getAllJdks()) {
            if(jdk != null && jdk.getSdkType() instanceof JavaSdk) {
                if(bestJdk == null) {
                    bestJdk = jdk;
                } else {
                    JavaSdkVersion version = ((JavaSdk) jdk.getSdkType()).getVersion(jdk);
                    JavaSdkVersion bestVersion = ((JavaSdk)bestJdk.getSdkType()).getVersion(bestJdk);
                    if(version.isAtLeast(bestVersion)) {
                        bestJdk = jdk;
                    }
                }
            }
        }
        return bestJdk;
    }
}