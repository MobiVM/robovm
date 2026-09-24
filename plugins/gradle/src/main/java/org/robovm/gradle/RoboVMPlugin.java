/*
 * Copyright (C) 2014 RoboVM AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;
import org.robovm.compiler.Version;
import org.robovm.gradle.tasks.*;
import org.robovm.gradle.tooling.ModelBuilder;

import javax.inject.Inject;

/**
 * Gradle plugin that extends the Java plugin for RoboVM development.
 *
 * @author Junji Takakura
 */
public class RoboVMPlugin implements Plugin<Project> {
    private final ToolingModelBuilderRegistry registry;

    public static String getRoboVMVersion() {
        return Version.getCompilerVersion();
    }

    @Inject
    public RoboVMPlugin(ToolingModelBuilderRegistry registry) {
        this.registry = registry;
    }

    @Override
    public void apply(Project project) {
        // register tooling model builder to provide model to Idea plugin
        registry.register(new ModelBuilder());

        project.getExtensions().create(RoboVMPluginExtension.NAME, RoboVMPluginExtension.class, project);
        registerTask(project, "launchIPhoneSimulator", IPhoneSimulatorTask.class,
                "Runs your iOS app in the iPhone simulator");
        registerTask(project, "launchIPadSimulator", IPadSimulatorTask.class,
                "Runs your iOS app in the iPad simulator");
        registerTask(project, "launchIOSDevice", IOSDeviceTask.class,
                "Runs your iOS app on a connected iOS device.");
        registerTask(project, "launchConsole", ConsoleTask.class, "Runs a console app");
        registerTask(project, "createIPA", ArchiveTask.class,
                "Creates .ipa file. This is an alias for the robovmArchive task");
        registerTask(project,"robovmArchive", ArchiveTask.class,
                "Compiles a binary, archives it in a format suitable for distribution and saves it to build/robovm/");
        registerTask(project,"robovmInstall", InstallTask.class,
                "Compiles a binary and installs it to build/robovm/");
    }


    private <T extends Task>  void registerTask(Project project, String name, Class<T> type, String description) {
        registerTask(project, name, type, description, "build");
    }

    private <T extends Task>  void registerTask(Project project, String name, Class<T> type, String description, String ... dependencies) {
        project.getTasks().register(name, type, task -> {
            task.dependsOn((Object[]) dependencies);
            task.setDescription(description);
        });
    }
}
