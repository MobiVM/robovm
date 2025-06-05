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
package org.robovm.ibxcode;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.apache.commons.io.FileUtils;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Resource;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.InfoPList;
import org.robovm.ibxcode.export.FrameworkExportData;
import org.robovm.ibxcode.export.IBClassExportData;
import org.robovm.ibxcode.export.XCodeProjectExporter;
import org.robovm.ibxcode.parser.IBClassHierarchyData;
import org.robovm.ibxcode.parser.IBClassHierarchyResolver;
import org.robovm.ibxcode.parser.IBClassMemberParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import static java.nio.file.FileVisitResult.CONTINUE;

public class IBXcodeProject {

    private final Config config;
    private final Logger logger;

    public IBXcodeProject(Config config) {
        this.config = config;
        this.logger = config.getLogger();
    }


    public void generate(File projectDir, File exportDir, String projectName, boolean openXCode) throws IBException {
        // clean up the project
        prepareExportDir(exportDir, projectName);

        Map<String, JavaClass> classesData = new HashMap<>();
        // parse all class path into JavaClass structures
        List<File> classPathList = config.getClasspath();
        for (File path : classPathList) {
            if (path.isFile() && path.getAbsolutePath().endsWith(".jar")) {
                processJarClassPath(path, classesData);
            } else if (path.isDirectory()) {
                processDirectoryClassPath(path.toPath(), classesData);
            } else {
                logger.debug("Processing class path for XcodeProject: unexpected file type: " + path.getAbsolutePath());
            }
        }

        // build parse hierarchy
        // resolve super classes and attach usage flags
        IBClassHierarchyResolver resolver = new IBClassHierarchyResolver(classesData);
        Map<String, IBClassHierarchyData> resolvedClasses = resolver.parse();

        // create export data base on Annotations on method/fields
        // e.g. each IBClassExportData represent something related to IB
        IBClassMemberParser mp = new IBClassMemberParser(resolvedClasses);
        List<IBClassExportData> exportDatas = mp.parse();

        // resolve resource list
        List<File> resources = resolveResources();

        // resolve frameworks list
        List<FrameworkExportData> frameworks = resolveFrameworks();

        // resolve info.plist entries
        InfoPList plist = config.getInfoPList();
        plist.parse(config.getProperties());

        // now create and write xcode project
        XCodeProjectExporter projectExporter = new XCodeProjectExporter(
                config.getTools().getIbx(),
                exportDatas, resources, frameworks, plist,
                projectDir, exportDir, projectName);
        projectExporter.export();

        // open xcode now
        if (openXCode)
            projectExporter.openXCode();
    }

    private void processDirectoryClassPath(final Path dirPath, final Map<String, JavaClass> classesData) {
        // add files from directory
        SimpleFileVisitor<Path> walker = new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                if (!file.getFileName().toString().endsWith(".class"))
                    return CONTINUE;
                String relative = dirPath.relativize(file).toString();
                if (Utils.isSystemLikeClassPath(relative.substring(0, relative.length() - ".class".length())))
                    return CONTINUE;
                try (InputStream is = Files.newInputStream(file.toFile().toPath())) {
                    // get class path for early skip
                    ClassParser cp = new ClassParser(is, file.toString());
                    JavaClass jc = cp.parse();
                    classesData.put(jc.getClassName(), jc);
                } catch (IOException e) {
                    IBException ibe = new IBException("Exception while parsing class at location: " + file);
                    logger.error(ibe.getMessage());
                    ibe.addSuppressed(e);
                    throw ibe;
                }
                return CONTINUE;
            }
        };
        try {
            Files.walkFileTree(dirPath, walker);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processJarClassPath(File path, Map<String, JavaClass> classesData) {
        // add files from jar
        try (JarFile jar = new JarFile(path)) {
            Enumeration<?> en = jar.entries();
            while (en.hasMoreElements()) {
                JarEntry entry = (JarEntry) en.nextElement();
                if (!entry.getName().endsWith(".class"))
                    continue;
                if (Utils.isSystemLikeClassPath(entry.getName().substring(0, entry.getName().length() - ".class".length())))
                    continue;

                try (InputStream is = jar.getInputStream(entry)) {
                    ClassParser cp = new ClassParser(is, entry.getName());
                    JavaClass jc = cp.parse();
                    classesData.put(jc.getClassName(), jc);
                } catch (IOException e) {
                    IBException ibe = new IBException("Exception while parsing class at location: " + entry.getName());
                    this.logger.error(ibe.getMessage());
                    ibe.addSuppressed(e);
                    throw ibe;
                }

            }
        } catch (IOException e) {
            IBException ibe = new IBException("IOException while opening JAR " + path.getAbsolutePath());
            this.logger.error(ibe.getMessage());
            ibe.addSuppressed(e);
            throw ibe;
        }
    }

    private void prepareExportDir(File exportDir, String projectName) {
        // clean up a dir if it exists, do not delete it as otherwise xcode will complain that project disappeared
        // in case it is currently opened
        if (exportDir.exists()) {
            try {
                if (!exportDir.isDirectory()) {
                    // try to delete it
                    FileUtils.deleteDirectory(exportDir);
                } else {
                    // remove all files but not xcode project
                    File[] files = exportDir.listFiles();
                    for (File file : files) {
                        if (file.getName().equals(projectName + ".xcodeproj"))
                            continue;
                        if (file.isFile()) {
                            if (!file.delete()) {
                                throw new IOException("Can't delete " + file.getAbsolutePath());
                            }
                        } else {
                            FileUtils.deleteDirectory(file);
                        }
                    }
                }
            } catch (IOException e) {
                IBException ibe = new IBException("Failed to remove destination folder for XCode project: " + exportDir.getAbsolutePath());
                ibe.addSuppressed(e);
                throw ibe;
            }
        }
    }

    private List<FrameworkExportData> resolveFrameworks() {
        List<FrameworkExportData> frameworks = new ArrayList<>();
        if (config.getFrameworks() == null)
            return frameworks;

        List<String> frameworkList = config.getFrameworks();
        if (!frameworkList.contains("UIKIT")) {
            // add uikit to be present in precompiled headers
            frameworkList = new ArrayList<>(config.getFrameworks());
            frameworkList.add("UIKIT");
        }
        List<File> frameworkPaths = config.getFrameworkPaths();
        for (String name : frameworkList) {
            // add suffix if it is not there
            String frameWorkName = name.endsWith(".framework") ? name : name + ".framework";
            String xcFrameWorkName = name.endsWith(".xcframework") ? name : name + ".xcframework";
            // look for framework in all possible framework locations
            FrameworkExportData frameWorkData = null;
            if (frameworkPaths != null) {
                File xcFrameWorkPath = null;
                for (File path : frameworkPaths) {
                    if (xcFrameWorkPath == null) {
                        // looks for possible xcframework and save it
                        // xcframework location expected to be before resolved location of particular
                        // framework for target arch in it. that is how resolver in Config class
                        // works.
                        File candidate = new File(path, xcFrameWorkName);
                        if (candidate.isDirectory())
                            xcFrameWorkPath = candidate;
                    }

                    File frameWorkPath = new File(path, frameWorkName);
                    if (frameWorkPath.isDirectory()) {
                        // framework found, but if there was a xcframework located before, save data
                        // as xcframework one
                        if (xcFrameWorkPath != null)
                            frameWorkData = new FrameworkExportData(xcFrameWorkName, xcFrameWorkPath, frameWorkPath);
                        else
                            frameWorkData = new FrameworkExportData(frameWorkName, frameWorkPath, frameWorkPath);
                        break;
                    }
                }
            }
            if (frameWorkData == null) {
                // probably global framework
                frameWorkData = new FrameworkExportData(frameWorkName, null, null);
            }

            frameworks.add(frameWorkData);
        }

        return frameworks;
    }

    private List<File> resolveResources() {
        // add all to map. key is target location in destination folder.
        // so this wil emulate override resource (.e.g later declared resource will override previous one)
        final Map<String, File> resources = new HashMap<>();
        if (config.getResources() == null || config.getResources().isEmpty())
            return Collections.emptyList();

        // contains list of groups. If any file inside this group it has to be
        // removed and group to be added instead s
        final List<Path> groupPaths = new ArrayList<>();

        // resolve resources with walker
        // this will allow to apply filtering but it will not allow to make final
        // structure of resources -- e.g. if resources are located in sub-folders inside package
        Resource.Walker walker = new Resource.Walker() {
            @Override
            public boolean processDir(Resource resource, File dir, File destDir) throws IOException {
                if (dir.getName().endsWith(".xcassets")) {
                    // remember the group to remove any file that belongs to it
                    groupPaths.add(dir.toPath().toAbsolutePath());
                }
                // dive in subfolder
                return true;
            }

            @Override
            public void processFile(Resource resource, File file, File destDir) throws IOException {
                resources.put(destDir.getName() + "/" + file.getName(), file);
            }
        };
        try {
            for (Resource r : config.getResources()) {
                r.walk(walker);
            }
        } catch (IOException e) {
            IBException ibe = new IBException("Failed to resolve resource list");
            ibe.addSuppressed(e);
            throw ibe;
        }

        // remove all files that are inside group path
        if (groupPaths.isEmpty()) {
            return new ArrayList<>(resources.values());
        } else {
            List<File> filteredResources = new ArrayList<>();
            Set<Path> processedGroupPath = new HashSet<>();
            for (File f : resources.values()) {
                Path groupPath = null;
                for (Path g : groupPaths) {
                    Path fp = f.toPath().toAbsolutePath();
                    if (fp.startsWith(g)) {
                        groupPath = g;
                        break;
                    }
                }
                if (groupPath != null) {
                    if (!processedGroupPath.contains(groupPath)) {
                        filteredResources.add(groupPath.toFile());
                        processedGroupPath.add(groupPath);
                    }
                } else {
                    filteredResources.add(f);
                }
            }
            return filteredResources;
        }
    }


}
