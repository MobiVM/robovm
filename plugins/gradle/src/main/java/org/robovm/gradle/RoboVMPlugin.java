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

import java.util.Collections;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.robovm.compiler.Version;
import org.robovm.gradle.tasks.ActivateLicenseTask;
import org.robovm.gradle.tasks.ArchiveTask;
import org.robovm.gradle.tasks.ConsoleTask;
import org.robovm.gradle.tasks.DeactivateLicenseTask;
import org.robovm.gradle.tasks.IOSDeviceTask;
import org.robovm.gradle.tasks.IPadSimulatorTask;
import org.robovm.gradle.tasks.IPhoneSimulatorTask;
import org.robovm.gradle.tasks.InstallTask;

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
        project.task(Collections.singletonMap("type", IPhoneSimulatorTask.class), "launchIPhoneSimulator");
        project.task(Collections.singletonMap("type", IPadSimulatorTask.class), "launchIPadSimulator");
        project.task(Collections.singletonMap("type", IOSDeviceTask.class), "launchIOSDevice");
        project.task(Collections.singletonMap("type", ConsoleTask.class), "launchConsole");
        project.task(Collections.singletonMap("type", ArchiveTask.class), "createIPA");
        project.task(Collections.singletonMap("type", ArchiveTask.class), "robovmArchive");
        project.task(Collections.singletonMap("type", InstallTask.class), "robovmInstall");
        project.task(Collections.singletonMap("type", ActivateLicenseTask.class), "activateLicense");
        project.task(Collections.singletonMap("type", DeactivateLicenseTask.class), "deactivateLicense");
    }
}
