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

package org.robovm.maven.resolver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.jboss.shrinkwrap.resolver.api.NoResolvedResultException;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.jboss.shrinkwrap.resolver.api.maven.MavenResolvedArtifact;

public class RoboVMResolver {

    private static String ROBOVM_DIST = "com.mobidevelop.robovm:robovm-dist:tar.gz:nocompiler";

    private Logger logger = new GenericLogger();
    
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public MavenResolvedArtifact resolveArtifact(String artifact) {
        try {
            /* do offline check first */
            return Maven.configureResolver().workOffline().resolve(artifact).withoutTransitivity().asSingleResolvedArtifact();
        } catch (NoResolvedResultException nre) {
            return Maven
                    .configureResolver()
                    .withRemoteRepo("Sonatype Nexus Snapshots",
                            "https://oss.sonatype.org/content/repositories/snapshots/", "default")
                    .resolve(artifact).withoutTransitivity().asSingleResolvedArtifact();
        }
    }

    public MavenResolvedArtifact[] resolveArtifacts(String artifact) {
        try {
            /* do offline check first */
            return Maven.configureResolver().workOffline().resolve(artifact).withTransitivity().asResolvedArtifact();
        } catch (NoResolvedResultException nre) {
            return Maven
                    .configureResolver()
                    .withRemoteRepo("Sonatype Nexus Snapshots",
                            "https://oss.sonatype.org/content/repositories/snapshots/", "default")
                    .resolve(artifact).withTransitivity().asResolvedArtifact();
        }
    }

    public MavenResolvedArtifact resolveRoboVMDistArtifact(String version) {
        return resolveArtifact(ROBOVM_DIST + ":" + version);
    }

    public File resolveAndUnpackRoboVMDistArtifact(String version) throws IOException {
        MavenResolvedArtifact distTarArtifact = resolveRoboVMDistArtifact(version);
        File distTarFile = distTarArtifact.asFile();
        File unpackBaseDir = new File(distTarFile.getParent(), "unpacked");
        if (unpackBaseDir.exists() && distTarArtifact.isSnapshotVersion()) {
            getLog().debug("Deleting directory for unpacked snapshots: " + unpackBaseDir);
            FileUtils.deleteDirectory(unpackBaseDir);
        }
        unpack(distTarFile, unpackBaseDir);
        File unpackedDir = new File(unpackBaseDir, "robovm-" + version);
        return unpackedDir;
    }
    
    private Logger getLog() {
        return logger;
    }

    public File unpack(File archive, File targetDirectory)
            throws IOException {

        if (!targetDirectory.exists()) {

            getLog().info("Extracting '" + archive + "' to: " + targetDirectory);
            if (!targetDirectory.mkdirs()) {
                throw new RuntimeException(
                        "Unable to create base directory to unpack into: "
                                + targetDirectory);
            }

            Archiver.unarchive(getLog(), archive, targetDirectory);
        } else {
            getLog().debug(
                    "Archive '" + archive + "' was already unpacked in: "
                            + targetDirectory);
        }

        return targetDirectory;
    }

    public File unpackInPlace(File jarFile) throws IOException {
        File unpackDir = new File(jarFile.getParent(), "unpacked");
        return unpack(jarFile, unpackDir);
    }
}
