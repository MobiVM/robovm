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
package org.robovm.maven.plugin;

import org.apache.maven.artifact.handler.ArtifactHandler;

public class MavenArtifactHandler implements ArtifactHandler {

    private String extension;

    public MavenArtifactHandler() {
    }

    public MavenArtifactHandler(String ext) {
        this.extension = ext;
    }

    public String getExtension() {
        return extension;
    }

    public String getDirectory() {
        return "";
    }

    public String getClassifier() {
        return "";
    }

    public String getPackaging() {
        return "";
    }

    public boolean isIncludesDependencies() {
        return false;
    }

    public String getLanguage() {
        return "";
    }

    public boolean isAddedToClasspath() {
        return false;
    }
}
