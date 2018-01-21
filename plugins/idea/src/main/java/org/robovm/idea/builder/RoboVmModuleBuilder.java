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

import com.intellij.ide.actions.ImportModuleAction;
import com.intellij.ide.util.newProjectWizard.AddModuleWizard;
import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.externalSystem.model.ExternalSystemDataKeys;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.module.ModifiableModuleModel;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.StdModuleTypes;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.JavaSdk;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.LanguageLevelModuleExtension;
import com.intellij.openapi.roots.LanguageLevelModuleExtensionImpl;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.roots.SourceFolder;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.pom.java.LanguageLevel;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.idea.maven.project.MavenProjectsManager;
import org.jetbrains.plugins.gradle.service.project.wizard.GradleProjectImportBuilder;
import org.jetbrains.plugins.gradle.service.project.wizard.GradleProjectImportProvider;
import org.jetbrains.plugins.gradle.settings.DistributionType;
import org.robovm.compiler.Version;
import org.robovm.idea.RoboVmPlugin;
import org.robovm.idea.sdk.RoboVmSdkType;
import org.robovm.templater.Templater;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
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
        this(templateName, (Map<String, String>)null);
    }

    public RoboVmModuleBuilder(String templateName, Map<String, String> customValues) {
        this.templateName = templateName;
        this.templateCustomValues = customValues;
        this.robovmDir = "";
    }

    public RoboVmModuleBuilder(String templateName, String robovmDir) {
        this.templateName = templateName;
        this.templateCustomValues = null;
        this.robovmDir = robovmDir;
    }

    @Nullable
    @Override
    public String getBuilderId() {
        return this.getClass().getName() + templateName;
    }

    @Override
    public ModuleType getModuleType() {
        return StdModuleTypes.JAVA;
    }

    @Override
    public ModuleWizardStep[] createWizardSteps(WizardContext wizardContext, ModulesProvider modulesProvider) {
        RoboVmModuleWizardStep wizardStep = new RoboVmModuleWizardStep(this, wizardContext, modulesProvider, this.templateCustomValues);

        if (!robovmDir.isEmpty()) {
            wizardStep.disableBuildSystem();
            buildSystem = BuildSystem.Gradle;
        }

        return new ModuleWizardStep[] { wizardStep };
    }

    @Override
    public void setupRootModel(final ModifiableRootModel modifiableRootModel) throws ConfigurationException {
        // set the Java SDK
        myJdk = RoboVmPlugin.getSdk();
        if (myJdk == null || !robovmDir.isEmpty()) {
            myJdk = RoboVmSdkType.findBestJdk();
        }

        // set a project jdk if none is set
        ProjectRootManager manager = ProjectRootManager.getInstance(modifiableRootModel.getProject());
        if (manager.getProjectSdk() == null) {
            manager.setProjectSdk(RoboVmSdkType.findBestJdk());
        }

        // before calling super setup SDK for projects with buildsystem == None
        if (buildSystem == BuildSystem.None) {
            Sdk jdk = RoboVmSdkType.findBestJdk();
            LanguageLevel langLevel = ((JavaSdk) jdk.getSdkType()).getVersion(jdk).getMaxLanguageLevel();
            modifiableRootModel.getModuleExtension(LanguageLevelModuleExtension.class).setLanguageLevel(langLevel);
        }

        // super will fill down content roots and other stuff
        super.setupRootModel(modifiableRootModel);

        final Project project = modifiableRootModel.getProject();
        final Module module = modifiableRootModel.getModule();
        final VirtualFile contentRootFile = modifiableRootModel.getContentRoots()[0];

        if (buildSystem != BuildSystem.None) {
            applyTemplate(project, module, contentRootFile);
            applyBuildSystem(project, module, contentRootFile);
        } else {
            applyTemplate(project, module, contentRootFile);

            // fix path for project/module without build system
            for (ContentEntry entry : modifiableRootModel.getContentEntries()) {
                for (SourceFolder srcFolder : entry.getSourceFolders()) {
                    entry.removeSourceFolder(srcFolder);
                }
                if (robovmDir.isEmpty()) {
                    entry.addSourceFolder(contentRootFile.findFileByRelativePath("/src/main/java"), false);
                }
                new File(entry.getFile().getCanonicalPath()).delete();
            }
        }
    }

    private void applyTemplate(Project project, Module module, VirtualFile contentRootFile) {
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
                    String template = FileUtils.readFileToString(buildFile, StandardCharsets.UTF_8);
                    template = template.replaceAll(ROBOVM_VERSION_PLACEHOLDER, Version.getVersion());
                    FileUtils.write(buildFile, template);
                } else {
                    String template = IOUtils.toString(RoboVmModuleBuilder.class.getResource("/template_build.gradle"),
                            "UTF-8");
                    template = template.replaceAll(ROBOVM_VERSION_PLACEHOLDER, Version.getVersion());
                    FileUtils.write(buildFile, template);
                }
                // write android sdk location to local.properties
                if (!robovmDir.isEmpty()) {
                    final File localProps = new File(contentRoot +  "/local.properties");
                    try (FileWriter writer = new FileWriter(localProps)) {
                        writer.write("sdk.dir=" + RoboVmPlugin.getBestAndroidSdkDir().getAbsolutePath().replace('\\', '/'));
                    }
                }
            } else if (buildSystem == BuildSystem.Maven) {
                String template = IOUtils.toString(RoboVmModuleBuilder.class.getResource("/pom.xml"), "UTF-8");
                template = template.replaceAll(ROBOVM_VERSION_PLACEHOLDER, Version.getVersion());
                template = template.replaceAll(PACKAGE_NAME_PLACEHOLDER, packageName);
                template = template.replaceAll(APP_NAME_PLACEHOLDER, appName);
                File buildFile = new File(contentRoot + "/pom.xml");
                FileUtils.write(buildFile, template);
            }
        } catch (IOException e) {
            RoboVmPlugin.logError(project, "Couldn't create build system file %s",
                    contentRoot + "/" + robovmDir + "/build.gradle");
        }

        // refresh to let idea see changes on fs
        contentRootFile.refresh(false, true);

        RoboVmPlugin.logInfo(project, "Project created in %s", contentRoot);
    }

    private void applyBuildSystem(final Project project, final Module module, VirtualFile contentRootFile ) {
        String contentRoot = contentRootFile.getPath();

        if (buildSystem == BuildSystem.Gradle) {
            File baseDir = new File(contentRoot);
            File[] files = baseDir.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return FileUtil.namesEqual("build.gradle", name);
                }
            });
            if (files != null && files.length != 0) {
                project.putUserData(ExternalSystemDataKeys.NEWLY_CREATED_PROJECT, Boolean.TRUE);
                // to workaround "AWT events are not allowed inside write action"
                ApplicationManager.getApplication().invokeLater(() -> {

                    // dkimitsa: there is a mess between ProjectDataManagers.
                    // IDEA uses new com.intellij.openapi.externalSystem.service.project.ProjectDataManager;
                    // but Android studio outdated: com.intellij.openapi.externalSystem.service.project.manage.ProjectDataManager;
                    // so try first using recent one if failed -- try outdated
                    GradleProjectImportBuilder gradleProjectImportBuilder;
                    try {
                        // recent from Idea2017
                        com.intellij.openapi.externalSystem.service.project.ProjectDataManager projectDataManager;
                        projectDataManager = com.intellij.openapi.externalSystem.service.project.ProjectDataManager.getInstance();
                        gradleProjectImportBuilder = new GradleProjectImportBuilder(projectDataManager);
                    } catch (Throwable ignored) {
                        // old idea and AndroidStudios (even v3)
                        com.intellij.openapi.externalSystem.service.project.manage.ProjectDataManager projectDataManager;
                        projectDataManager = com.intellij.openapi.externalSystem.service.project.manage.ProjectDataManager.getInstance();
                        gradleProjectImportBuilder = new GradleProjectImportBuilder(projectDataManager);
                    }

                    gradleProjectImportBuilder.getControl(project).getProjectSettings()
                            .setDistributionType(DistributionType.WRAPPED);
                    gradleProjectImportBuilder.getControl(project).getProjectSettings().
                            setResolveModulePerSourceSet(false);
                    GradleProjectImportProvider gradleProjectImportProvider = new GradleProjectImportProvider(
                            gradleProjectImportBuilder);
                    AddModuleWizard wizard = new AddModuleWizard(project, files[0].getPath(),
                            gradleProjectImportProvider);
                    if (wizard.getStepCount() <= 0 || wizard.showAndGet()) {
                        ImportModuleAction.createFromWizard(project, wizard);

                        ApplicationManager.getApplication().runWriteAction(new Runnable() {
                            @Override
                            public void run() {
                                ModifiableModuleModel modifiableModel = ModuleManager.getInstance(project).getModifiableModel();
                                try {
                                    LanguageLevelModuleExtensionImpl langModel = LanguageLevelModuleExtensionImpl.getInstance(module);
                                    langModel = (LanguageLevelModuleExtensionImpl) langModel.getModifiableModel(true);
                                    langModel.setLanguageLevel(LanguageLevel.JDK_1_8);
                                    langModel.commit();
                                } catch(Throwable t) {
                                    // should not happen
                                    t.printStackTrace();
                                }
                                modifiableModel.commit();
                            }
                        });
                    }
                });
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

    public static enum BuildSystem {
        Gradle, Maven, None
    }
}
