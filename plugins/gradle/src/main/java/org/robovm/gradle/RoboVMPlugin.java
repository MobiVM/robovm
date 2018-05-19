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
import org.robovm.compiler.Version;
import org.robovm.gradle.tasks.ArchiveTask;
import org.robovm.gradle.tasks.ConsoleTask;
import org.robovm.gradle.tasks.IOSDeviceTask;
import org.robovm.gradle.tasks.IPadSimulatorTask;
import org.robovm.gradle.tasks.IPhoneSimulatorTask;
import org.robovm.gradle.tasks.InstallTask;

import java.util.HashMap;
import java.util.Map;

/**
 * Gradle plugin that extends the Java plugin for RoboVM development.
 *
 * @author Junji Takakura
 */
public class RoboVMPlugin implements Plugin<Project> {

    public static String getRoboVMVersion() {
        return Version.getVersion();
    }

    @Override
    public void apply(Project project) {
        project.getExtensions().create(RoboVMPluginExtension.NAME, RoboVMPluginExtension.class, project);
        project.task(params(IPhoneSimulatorTask.class, "Runs your iOS app in the iPhone simulator"),
                "launchIPhoneSimulator");
        project.task(params(IPadSimulatorTask.class,"Runs your iOS app in the iPad simulator"),
                "launchIPadSimulator");
        project.task(params(IOSDeviceTask.class, "Runs your iOS app on a connected iOS device."),
                "launchIOSDevice");
        project.task(params(ConsoleTask.class, "Runs a console app"),"launchConsole");
        project.task(params(ArchiveTask.class, "Creates .ipa file. This is an alias for the robovmArchive task"),
                "createIPA");
        project.task(params(ArchiveTask.class, "Compiles a binary, archives it in a format suitable for distribution and saves it to build/robovm/"),
                "robovmArchive");
        project.task(params(InstallTask.class, "Compiles a binary and installs it to build/robovm/"),
                "robovmInstall");
    }

    private Map<String, Object> params(Class<? extends  Task> task, String description) {
        return params(task, description, "build"); // by default depends on build
    }

    private Map<String, Object> params(Class<? extends  Task> task, String description, String... dependencies) {
        Map<String, Object> params = new HashMap<>();
        params.put(Task.TASK_TYPE, task);
        params.put(Task.TASK_DESCRIPTION, description);
        if (dependencies != null)
            params.put(Task.TASK_DEPENDS_ON, dependencies);
        return params;
    }
}
