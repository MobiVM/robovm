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
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.externalSystem.importing.ImportSpecBuilder;
import com.intellij.openapi.externalSystem.model.ExternalSystemDataKeys;
import com.intellij.openapi.externalSystem.service.execution.ExternalSystemJdkUtil;
import com.intellij.openapi.externalSystem.settings.AbstractExternalSystemSettings;
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil;
import com.intellij.openapi.externalSystem.util.ExternalSystemUtil;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.StdModuleTypes;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.LanguageLevelModuleExtension;
import com.intellij.openapi.roots.LanguageLevelModuleExtensionImpl;
import com.intellij.openapi.roots.LanguageLevelProjectExtension;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.roots.SourceFolder;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.pom.java.LanguageLevel;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.idea.maven.project.MavenProjectsManager;
import org.jetbrains.plugins.gradle.settings.DistributionType;
import org.jetbrains.plugins.gradle.settings.GradleProjectSettings;
import org.jetbrains.plugins.gradle.util.GradleConstants;
import org.robovm.compiler.Version;
import org.robovm.idea.RoboVmPlugin;
import org.robovm.idea.sdk.RoboVmSdkType;
import org.robovm.templater.Templater;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * Creates all the files for a new project/module using the templater. See
 * https://android.googlesource.com/platform/tools/adt/idea/+/
 * 7ac63164a27e301d45d8640852a0bdaa6eabbad0/android/src/org/jetbrains/android/
 * newProject/AndroidModuleBuilder.java
 */
public class RoboVmModuleBuilder extends JavaModuleBuilder {
    public static final String ROBOVM_VERSION_PLACEHOLDER = "__robovmVersion__";
    public static final String PACKAGE_NAME_PLACEHOLDER = "__packageName__";
    public static final String APP_NAME_PLACEHOLDER = "__appName__";

    protected final String templateName;
    protected final Map<String, String> templateCustomValues;
    protected String packageName;
    protected String mainClassName;
    protected String appName;
    protected String appId;
    protected final String robovmDir;
    protected BuildSystem buildSystem;

    public RoboVmModuleBuilder(String templateName) {
        this(templateName, null);
    }

    public RoboVmModuleBuilder(String templateName, Map<String, String> customValues) {
        this.templateName = templateName;
        this.templateCustomValues = customValues;
        this.robovmDir = "";
    }

    @Nullable
    @Override
    public String getBuilderId() {
        return this.getClass().getName() + templateName;
    }

    @Override
    public ModuleType<JavaModuleBuilder> getModuleType() {
        return StdModuleTypes.JAVA;
    }

    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        RoboVmModuleWizardStep wizardStep = new RoboVmModuleWizardStep(this, wizardContext, modulesProvider, this.templateCustomValues);

        // Android Studio is not providing maven plugin anymore, and module management is also lame so it will not
        // allow to manage modules without build system.
        // Leaving only Gradle as only option for AS
        if (RoboVmPlugin.isAndroidStudio()) {
            wizardStep.disableBuildSystem();
            buildSystem = BuildSystem.Gradle;
        }

        return new ModuleWizardStep[]{wizardStep};
    }

    @Override
    public void setupRootModel(@NotNull final ModifiableRootModel modifiableRootModel) throws ConfigurationException {
        // set the Java SDK
        myJdk = RoboVmPlugin.getSdk();

        // set a project jdk if none is set
        ProjectRootManager manager = ProjectRootManager.getInstance(modifiableRootModel.getProject());
        if (manager.getProjectSdk() == null) {
            manager.setProjectSdk(myJdk);
        }

        // before calling super setup SDK for projects with buildsystem == None
        if (buildSystem == BuildSystem.None) {
            LanguageLevel langLevel = RoboVmSdkType.REQUIRED_JAVA_LANGUAGE_LEVEL;
            modifiableRootModel.getModuleExtension(LanguageLevelModuleExtension.class).setLanguageLevel(langLevel);
        }

        // super will fill down content roots and other stuff
        super.setupRootModel(modifiableRootModel);

        final Project project = modifiableRootModel.getProject();
        final Module module = modifiableRootModel.getModule();
        final VirtualFile contentRootFile = modifiableRootModel.getContentRoots()[0];

        if (buildSystem != BuildSystem.None) {
            applyTemplate(project, module, contentRootFile);
            applyBuildSystem(project, module, modifiableRootModel, contentRootFile);
        } else {
            applyTemplate(project, module, contentRootFile);

            // fix path for project/module without build system
            for (ContentEntry entry : modifiableRootModel.getContentEntries()) {
                for (SourceFolder srcFolder : entry.getSourceFolders()) {
                    entry.removeSourceFolder(srcFolder);
                }
                if (robovmDir.isEmpty()) {
                    VirtualFile javaPath = contentRootFile.findFileByRelativePath("/src/main/java");
                    if (javaPath != null)
                        entry.addSourceFolder(javaPath, false);
                }

                try {
                    VirtualFile entryDir = entry.getFile();
                    if (entryDir != null)
                        entryDir.delete(null);
                } catch (IOException e) {
                    throw new ConfigurationException("Failed to delete " + entry, e, "Error");
                }
            }
        }
    }

    private void applyTemplate(Project project, @SuppressWarnings("unused") Module module, VirtualFile contentRootFile) {
        String contentRoot = contentRootFile.getPath();

        // extract the template files and setup the source folders
        Templater templater = new Templater(templateName);
        templater.appId(appId);
        templater.appName(appName);
        templater.executable(appName);
        templater.mainClass(packageName + "." + mainClassName);
        templater.packageName(packageName);
        // templater.androidSdkVersion(RoboVmPlugin.getBestAndroidSdkVersion());
        // templater.androidBuildToolsVersion(RoboVmPlugin.getBestAndroidBuildToolsVersion());
        templater.buildProject(new File(contentRoot));

        try {
            // set up robovm version in robovm module build.gradle
            if (buildSystem == BuildSystem.Gradle) {
                final File buildFile = new File(contentRoot + "/" + robovmDir + "/build.gradle");
                if (buildFile.exists()) {
                    String template = FileUtils.readFileToString(buildFile, StandardCharsets.UTF_8.name());
                    template = template.replaceAll(ROBOVM_VERSION_PLACEHOLDER, Version.getVersion());
                    FileUtils.write(buildFile, template, Charset.defaultCharset());
                } else {
                    String template = IOUtils.toString(RoboVmModuleBuilder.class.getResource("/template_build.gradle"),
                            StandardCharsets.UTF_8);
                    template = template.replaceAll(ROBOVM_VERSION_PLACEHOLDER, Version.getVersion());
                    FileUtils.write(buildFile, template, Charset.defaultCharset());
                }
            } else if (buildSystem == BuildSystem.Maven) {
                String template = IOUtils.toString(RoboVmModuleBuilder.class.getResource("/template_pom.xml"), StandardCharsets.UTF_8);
                template = template.replaceAll(ROBOVM_VERSION_PLACEHOLDER, Version.getVersion());
                template = template.replaceAll(PACKAGE_NAME_PLACEHOLDER, packageName);
                template = template.replaceAll(APP_NAME_PLACEHOLDER, appName);
                File buildFile = new File(contentRoot + "/pom.xml");
                FileUtils.write(buildFile, template, Charset.defaultCharset());
            }
        } catch (IOException e) {
            RoboVmPlugin.logError(project, "Couldn't create build system file %s",
                    contentRoot + "/" + robovmDir + "/build.gradle");
        }

        // refresh to let idea see changes on fs
        contentRootFile.refresh(false, true);

        RoboVmPlugin.logInfo(project, "Project created in %s", contentRoot);
    }

    private void applyBuildSystem(final Project project, @SuppressWarnings("unused") final Module module, ModifiableRootModel rootModel, VirtualFile contentRootFile) {
        String contentRoot = contentRootFile.getPath();

        if (buildSystem == BuildSystem.Gradle) {
            File baseDir = new File(contentRoot);
            File[] files = baseDir.listFiles((dir, name) -> FileUtil.namesEqual("build.gradle", name));
            if (files != null && files.length != 0) {
                project.putUserData(ExternalSystemDataKeys.NEWLY_CREATED_PROJECT, Boolean.TRUE);
                GradleProjectSettings gradleSettings = new GradleProjectSettings();
                gradleSettings.setDistributionType(DistributionType.WRAPPED);
                gradleSettings.setExternalProjectPath(contentRoot);
                gradleSettings.setResolveModulePerSourceSet(false);
                // use internal JDK otherwise gradle will use RoboVM one and will not able to import project
                gradleSettings.setGradleJvm(ExternalSystemJdkUtil.USE_INTERNAL_JAVA);

                //noinspection rawtypes
                AbstractExternalSystemSettings settings = ExternalSystemApiUtil.getSettings(rootModel.getProject(), GradleConstants.SYSTEM_ID);
                project.putUserData(ExternalSystemDataKeys.NEWLY_CREATED_PROJECT, Boolean.TRUE);
                //noinspection unchecked
                settings.linkProject(gradleSettings);

                // force java8
                LanguageLevelProjectExtension projectLangModel = LanguageLevelProjectExtension.getInstance(project);
                projectLangModel.setLanguageLevel(LanguageLevel.JDK_1_8);
                LanguageLevelModuleExtensionImpl moduleLangModel = LanguageLevelModuleExtensionImpl.getInstance(module);
                moduleLangModel.setLanguageLevel(LanguageLevel.JDK_1_8);

                FileDocumentManager.getInstance().saveAllDocuments();
                ImportSpecBuilder builder = new ImportSpecBuilder(rootModel.getProject(), GradleConstants.SYSTEM_ID);
                builder.forceWhenUptodate(true);

                ExternalSystemUtil.refreshProjects(builder);
            }
        } else {
            FileDocumentManager.getInstance().saveAllDocuments();
            MavenProjectsManager.getInstance(project).forceUpdateAllProjectsOrFindAllAvailablePomFiles();
        }
    }

    public void setApplicationId(String applicationId) {
        this.appId = applicationId;
    }

    public void setApplicationName(String applicationName) {
        this.appName = applicationName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setMainClassName(String mainClassName) {
        this.mainClassName = mainClassName;
    }

    public void setBuildSystem(BuildSystem buildSystem) {
        this.buildSystem = buildSystem;
    }

    public enum BuildSystem {
        Gradle, Maven, None
    }
}
