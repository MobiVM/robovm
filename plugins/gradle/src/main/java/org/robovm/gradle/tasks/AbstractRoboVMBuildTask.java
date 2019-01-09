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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.gradle.api.GradleException;
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;

/**
 * 
 */
public abstract class AbstractRoboVMBuildTask extends AbstractRoboVMTask {

    protected abstract boolean shouldArchive();
    
    @Override
    public void invoke() {
        try {
            Config.Builder builder = configure(new Config.Builder())
                    .skipInstall(false);

            if (extension.getArchs() != null) {
                List<Arch> archs = new ArrayList<>();
                for (String s : extension.getArchs().trim().split(":")) {
                    archs.add(Arch.valueOf(s));
                }
                builder.archs(archs);
            }
            
            AppCompiler compiler = new AppCompiler(builder.build());
            compiler.build();
            if (shouldArchive()) {
                compiler.archive();
            } else {
                compiler.install();
            }
        } catch (IOException e) {
            if (shouldArchive()) {
                throw new GradleException("Failed to create archive", e);
            } else {
                throw new GradleException("Failed to install", e);
            }
        }
    }
}
