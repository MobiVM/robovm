/*
 * Copyright (C) 2013 RoboVM AB.
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
package org.robovm.maven.plugin;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.robovm.compiler.target.ios.DeviceType.DeviceFamily;

/**
 * Compiles your application and deploys it to the iPad simulator.
 */
@Mojo(name="ipad-sim", defaultPhase=LifecyclePhase.PACKAGE,
      requiresDependencyResolution=ResolutionScope.COMPILE_PLUS_RUNTIME)
public class IPadSimMojo extends AbstractIOSSimulatorMojo {

    public IPadSimMojo() {
        super(DeviceFamily.iPad);
    }
}
