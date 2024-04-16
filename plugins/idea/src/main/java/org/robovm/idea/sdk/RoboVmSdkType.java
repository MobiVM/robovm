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

import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.pom.java.LanguageLevel;
import org.robovm.compiler.Version;
import org.robovm.idea.RoboVmIcons;
import org.robovm.idea.RoboVmPlugin;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.projectRoots.*;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.vfs.VirtualFile;

public class RoboVmSdkType extends SdkType implements JavaSdkType {
    private static final String SDK_NAME = "RoboVM SDK";
    public static final LanguageLevel REQUIRED_JAVA_LANGUAGE_LEVEL = LanguageLevel.JDK_1_8;

    public RoboVmSdkType() {
        super(SDK_NAME);
    }

    @Override
    public String getBinPath(@NotNull Sdk sdk) {
        return null;
    }

    @Override
    public String getToolsPath(@NotNull Sdk sdk) {
        return null;
    }

    @Override
    public String getVMExecutablePath(@NotNull Sdk sdk) {
        return null;
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        return RoboVmPlugin.getSdkHome().getAbsolutePath();
    }

    @Override
    public boolean isValidSdkHome(String path) {
        return FileUtil.filesEqual(RoboVmPlugin.getSdkHome(), new File(path));
    }

    @NotNull
    @Override
    public String suggestSdkName(String currentSdkName, String sdkHome) {
        return SDK_NAME + " " + Version.getCompilerVersion();
    }

    @Override
    public @Nullable String getVersionString(@NotNull String sdkHome) {
        if (sdkHome.equals(suggestHomePath()))
            return Version.getCompilerVersion();
        else return null;
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(@NotNull SdkModel sdkModel, @NotNull SdkModificator sdkModificator) {
        return null;
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return SDK_NAME;
    }

    @Override
    public Icon getIcon() {
        return RoboVmIcons.ROBOVM_SMALL;
    }

    @NotNull
    @Override
    public Icon getIconForAddAction() {
        return RoboVmIcons.ROBOVM_SMALL;
    }

    @Override
    public void saveAdditionalData(@NotNull SdkAdditionalData additionalData, @NotNull Element additional) {
    }

    @Override
    public boolean setupSdkPaths(@NotNull final Sdk sdk, @NotNull final SdkModel sdkModel) {
        setupSdkRoots(sdk);
        return true;
    }

    private void setupSdkRoots(Sdk sdk) {
        SdkModificator sdkModificator = sdk.getSdkModificator();
        sdkModificator.removeAllRoots();

        // add all class and source jars from the SDK lib/ folder
        for(File file: RoboVmPlugin.getSdkLibraries()) {
            VirtualFile virtualFile = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(file);
            assert virtualFile != null;
            sdkModificator.addRoot(virtualFile, file.getName().endsWith("-sources.jar")?  OrderRootType.SOURCES: OrderRootType.CLASSES);
        }

        // set the home path, we check this in createSdkIfNotExists
        sdkModificator.setHomePath(RoboVmPlugin.getSdkHome().getAbsolutePath());

        // commit changes and let IDEA handle the rest
        ApplicationManager.getApplication().invokeAndWait(() ->
                ApplicationManager.getApplication().runWriteAction(sdkModificator::commitChanges)
        );
    }

    public static void createSdkIfNotExists() {
        // check if a RoboVM SDK already exists
        // for our version
        if(RoboVmPlugin.getSdk() != null) return;

        // if not, create a new SDK
        ApplicationManager.getApplication().runWriteAction(() -> {
            RoboVmSdkType sdkType = new RoboVmSdkType();
            Sdk sdk = ProjectJdkTable.getInstance().createSdk(sdkType.suggestSdkName(null, null), sdkType);
            sdkType.setupSdkRoots(sdk);
            ProjectJdkTable.getInstance().addJdk(sdk);
            RoboVmPlugin.logInfo(null, "Added new SDK " + sdk.getName());
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
                    if(version != null && bestVersion != null && version.isAtLeast(bestVersion)) {
                        bestJdk = jdk;
                    }
                }
            }
        }
        return bestJdk;
    }
}