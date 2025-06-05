/*
 * Copyright (C) 2015 RoboVM AB.
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
package org.robovm.gradle.tasks;

import org.apache.tools.ant.types.Commandline;
import org.gradle.api.tasks.options.Option;
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.target.ConsoleTarget;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.gradle.RoboVMGradleException;

import java.util.Arrays;

/**
 *
 */
public class ConsoleTask extends AbstractRoboVMTask {
    private String[] args;

    @Option(option = "args", description = "Command line arguments passed to app.")
    public void setArgs(String args) {
        this.args = Commandline.translateCommandline(args);
    }

    @Override
    public void invoke() {
        try {
            Arch arch = Arch.getDefaultArch();
            if (extension.getArch() != null) {
                arch = Arch.parse(extension.getArch());
            }

            AppCompiler compiler = build(OS.getDefaultOS(), arch, ConsoleTarget.TYPE);
            Config config = compiler.getConfig();
            LaunchParameters launchParameters = config.getTarget().createLaunchParameters();
            if (args != null) {
                launchParameters.setArguments(Arrays.asList(args));
            }
            compiler.launch(launchParameters);
        } catch (Throwable t) {
            throw new RoboVMGradleException("Failed to launch console application", t);
        }
    }
}
