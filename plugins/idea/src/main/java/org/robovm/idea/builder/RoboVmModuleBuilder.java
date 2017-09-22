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

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.intellij.openapi.externalSystem.service.project.ProjectDataManager;
import com.intellij.openapi.module.*;
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

import com.intellij.ide.actions.ImportModuleAction;
import com.intellij.ide.util.newProjectWizard.AddModuleWizard;
import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.externalSystem.model.ExternalSystemDataKeys;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.DumbAwareRunnable;
import com.intellij.openapi.project.DumbService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.JavaSdk;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.*;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.startup.StartupManager;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VfsUtilCore;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.pom.java.LanguageLevel;
import com.intellij.projectImport.ProjectImportProvider;

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

    protected String templateName;
    protected String packageName;
    protected String mainClassName;
    protected String appName;
    protected String appId;
    protected String robovmDir;
    protected BuildSystem buildSystem;

    public RoboVmModuleBuilder(String templateName) {
        this.templateName = templateName;
        this.robovmDir = "";
    }

    public RoboVmModuleBuilder(String templateName, String robovmDir) {
        this.templateName = templateName;
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
        RoboVmModuleWizardStep wizardStep = new RoboVmModuleWizardStep(this, wizardContext, modulesProvider);

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

        if (buildSystem != BuildSystem.None) {
            super.setupRootModel(modifiableRootModel);

            // apply the template
            final Project project = modifiableRootModel.getProject();
            StartupManager.getInstance(project).runWhenProjectIsInitialized(new DumbAwareRunnable() {
                public void run() {
                    DumbService.getInstance(project).smartInvokeLater(new Runnable() {
                        public void run() {
                            ApplicationManager.getApplication().runWriteAction(new Runnable() {
                                public void run() {
                                    RoboVmModuleBuilder.this.applyTemplate(project);
                                }
                            });
                        }
                    });
                }
            });

            // apply the build system
            StartupManager.getInstance(project).registerPostStartupActivity(new DumbAwareRunnable() {
                public void run() {
                    DumbService.getInstance(project).smartInvokeLater(new Runnable() {
                        public void run() {
                            RoboVmModuleBuilder.this.applyBuildSystem(project);
                        }
                    });
                }
            });
        } else {
            Sdk jdk = RoboVmSdkType.findBestJdk();
            LanguageLevel langLevel = ((JavaSdk) jdk.getSdkType()).getVersion(jdk).getMaxLanguageLevel();
            modifiableRootModel.getModuleExtension(LanguageLevelModuleExtension.class).setLanguageLevel(langLevel);
            super.setupRootModel(modifiableRootModel);

            final VirtualFile contentRoot = LocalFileSystem.getInstance()
                    .findFileByIoFile(new File(modifiableRootModel.getProject().getBasePath()));
            applyTemplate(modifiableRootModel.getProject());
            for (ContentEntry entry : modifiableRootModel.getContentEntries()) {
                for (SourceFolder srcFolder : entry.getSourceFolders()) {
                    entry.removeSourceFolder(srcFolder);
                }
                if (robovmDir.isEmpty()) {
                    entry.addSourceFolder(contentRoot.findFileByRelativePath("/src/main/java"), false);
                }
                new File(entry.getFile().getCanonicalPath()).delete();
            }
        }
    }

    private void applyTemplate(Project project) {
        // extract the template files and setup the source folders
        Templater templater = new Templater(templateName);
        templater.appId(appId);
        templater.appName(appName);
        templater.executable(appName);
        templater.mainClass(packageName + "." + mainClassName);
        templater.packageName(packageName);
        // templater.androidSdkVersion(RoboVmPlugin.getBestAndroidSdkVersion());
        // templater.androidBuildToolsVersion(RoboVmPlugin.getBestAndroidBuildToolsVersion());
        templater.buildProject(new File(project.getBasePath()));

        try {
            // set up robovm version in robovm module build.gradle
            if (buildSystem == BuildSystem.Gradle) {
                final File buildFile = new File(project.getBasePath() + "/" + robovmDir + "/build.gradle");
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
                    final File localProps = new File(project.getBasePath() + "/local.properties");
                    try (FileWriter writer = new FileWriter(localProps)) {
                        writer.write("sdk.dir=" + RoboVmPlugin.getBestAndroidSdkDir().getAbsolutePath().replace('\\', '/'));
                    }
                }
            } else if (buildSystem == BuildSystem.Maven) {
                String template = IOUtils.toString(RoboVmModuleBuilder.class.getResource("/pom.xml"), "UTF-8");
                template = template.replaceAll(ROBOVM_VERSION_PLACEHOLDER, Version.getVersion());
                template = template.replaceAll(PACKAGE_NAME_PLACEHOLDER, packageName);
                template = template.replaceAll(APP_NAME_PLACEHOLDER, mainClassName);
                File buildFile = new File(project.getBasePath() + "/pom.xml");
                FileUtils.write(buildFile, template);
            }
        } catch (IOException e) {
            RoboVmPlugin.logError(project, "Couldn't create build system file %s",
                    new File(project.getBasePath() + "/" + robovmDir + "/build.gradle").getAbsolutePath());
        }

        // refresh to let idea see changes on fs
        final VirtualFile contentRoot = LocalFileSystem.getInstance().findFileByIoFile(new File(project.getBasePath()));
        contentRoot.refresh(false, true);

        RoboVmPlugin.logInfo(project, "Project created in %s", project.getBasePath());
    }

    private void applyBuildSystem(final Project project) {
        if (buildSystem == BuildSystem.Gradle) {
            File baseDir = VfsUtilCore.virtualToIoFile(project.getBaseDir());
            File[] files = baseDir.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return FileUtil.namesEqual("build.gradle", name);
                }
            });
            if (files != null && files.length != 0) {
                project.putUserData(ExternalSystemDataKeys.NEWLY_CREATED_PROJECT, Boolean.TRUE);
                ProjectDataManager projectDataManager = (ProjectDataManager) ServiceManager
                        .getService(ProjectDataManager.class);
                GradleProjectImportBuilder gradleProjectImportBuilder = new GradleProjectImportBuilder(
                        projectDataManager);
                gradleProjectImportBuilder.getControl(project).getProjectSettings()
                        .setDistributionType(DistributionType.WRAPPED);
                gradleProjectImportBuilder.getControl(project).getProjectSettings().
                        setResolveModulePerSourceSet(false);
                GradleProjectImportProvider gradleProjectImportProvider = new GradleProjectImportProvider(
                        gradleProjectImportBuilder);
                AddModuleWizard wizard = new AddModuleWizard(project, files[0].getPath(),
                        new ProjectImportProvider[] { gradleProjectImportProvider });
                if (wizard.getStepCount() <= 0 || wizard.showAndGet()) {
                    ImportModuleAction.createFromWizard(project, wizard);

                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
                        @Override
                        public void run() {
                            ModifiableModuleModel modifiableModel = ModuleManager.getInstance(project).getModifiableModel();
                            for (Module module : modifiableModel.getModules()) {
                                try {
                                    LanguageLevelModuleExtensionImpl langModel = (LanguageLevelModuleExtensionImpl) LanguageLevelModuleExtensionImpl.getInstance(module).getModifiableModel(true);
                                    langModel.setLanguageLevel(LanguageLevel.JDK_1_8);
                                    langModel.commit();
                                } catch(Throwable t) {
                                    // could be a non-Java project
                                    t.printStackTrace();
                                }
                            }
                            modifiableModel.commit();
                        }
                    });
                }
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
