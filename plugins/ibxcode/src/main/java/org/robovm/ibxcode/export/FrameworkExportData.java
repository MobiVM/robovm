/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.ibxcode.export;

import java.io.File;

public class FrameworkExportData {
    public final String name;
    public final File path;
    public final File frameworkPath;

    /**
     * @param name           - name of framework with .framework or .xcframework suffix
     * @param path           - location of framework: either .xcframework or .framwork folder
     * @param frameworkPath  - location of framework in case of .xcframwork otherwise same as path
     */
    public FrameworkExportData(String name, File path, File frameworkPath) {
        this.name = name;
        this.path = path;
        this.frameworkPath = frameworkPath;
    }
}
