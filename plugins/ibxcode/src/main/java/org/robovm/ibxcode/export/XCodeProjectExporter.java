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

import com.dd.plist.NSDictionary;
import com.dd.plist.PropertyListParser;
import org.robovm.compiler.config.tools.IBXOptions;
import org.robovm.compiler.util.AntPathMatcher;
import org.robovm.compiler.util.InfoPList;
import org.robovm.ibxcode.Utils;
import org.robovm.ibxcode.parser.IBClassHierarchyData;
import org.robovm.ibxcode.IBException;
import org.robovm.ibxcode.consts.StringConsts;
import org.robovm.ibxcode.pbxproj.PBXProject;
import org.apache.bcel.classfile.JavaClass;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;

/**
 * Generates .m, .h files and pre-compiled headers
 */
public class XCodeProjectExporter {
    private final IBXOptions ibxConfig;
    private final List<IBClassExportData> exportClasses;
    private final List<File> resources;
    private final List<FrameworkExportData> frameworks;
    private final InfoPList infoPlist;
    private final File projectDir;
    private final File exportDir;
    private final String projectName;
    private final PBXProject pbxProject;

    public XCodeProjectExporter(
            IBXOptions ibxConfig,
            List<IBClassExportData> exportClasses,
            List<File> resources,
            List<FrameworkExportData> frameworks,
            InfoPList infoPlist,
            File projectDir,
            File exportDir,
            String projectName)
    {
        this.ibxConfig = ibxConfig;
        this.exportClasses = exportClasses;
        this.resources = resources;
        this.frameworks = frameworks;
        this.infoPlist = infoPlist;
        this.projectDir = projectDir;
        this.exportDir = exportDir;
        this.projectName = projectName;
        this.pbxProject = new PBXProject(exportDir);
    }

    public void export() {
        // walk class by class
        for (IBClassExportData exportClass : exportClasses) {
            //
            JavaClass jc = exportClass.classData.getJavaClass();
            String packageName = jc.getPackageName();
            String exportClassName = exportClass.classData.getExportClassName();

            // destination folder
            File classDestFolder = new File(exportDir, packageName);
            if (!classDestFolder.exists()) {
                if (!classDestFolder.mkdirs())
                    throw new IBException("Failed to create package folder for XCode project: " + classDestFolder.getAbsolutePath());
            }

            // export files
            File sourceFile = new File(classDestFolder, exportClassName + ".h");
            this.exportHeaderFile(exportClass, sourceFile);
            pbxProject.addSourceFile(packageName, sourceFile);

            sourceFile = new File(classDestFolder, exportClassName + ".m");
            this.exportMFile(exportClass, sourceFile);
            pbxProject.addSourceFile(packageName, sourceFile);
        }

        // add dummy main() to remove XCode linker failure
        try (PrintStream ps = new PrintStream(new File(exportDir,  "main.m"))) {
            ps.println("int main() {");
            ps.println("}");
            pbxProject.addSourceFile("", new File(exportDir,  "main.m"));
        } catch (FileNotFoundException e) {
            IBException ibe = new IBException("Failed to write main.m file");
            ibe.addSuppressed(e);
            throw ibe;
        }

        // add resources
        int resNo = 1;
        Path projectResPath = (new File(projectDir, "resources")).toPath();
        for (File resourceFile : resources) {
            File resourceDir = resourceFile.getParentFile();
            if (resourceDir.getName().endsWith(".lproj")) {
                // it is sub-localization folder, get one level up\
                resourceDir = resourceDir.getParentFile();
            }

            String resGroup;
            if (resourceFile.toPath().startsWith(projectResPath)) {
                // inside project folder, skip "project/"
                resGroup = Utils.getRelativePath(projectResPath.toFile(), resourceDir);
            } else {
                resGroup = Utils.getRelativePath(projectDir, resourceDir);
            }
            if (resGroup == null)
                resGroup = "Resources" + resNo++;
            pbxProject.addResourceFile(resGroup, resourceFile);
        }

        // add frameworks
        for (FrameworkExportData frameworkData : frameworks) {
            pbxProject.addFramework(frameworkData.name, frameworkData.path);
        }

        // write info-plist
        if (infoPlist != null && infoPlist.getDictionary() != null) {
            NSDictionary dict = infoPlist.getDictionary();
            File infoPlistPath = new File(exportDir, "Info.plist");
            try {
                PropertyListParser.saveAsXML(dict, infoPlistPath);
            } catch (IOException e) {
                IBException ibe = new IBException("Failed to write Info.plist file");
                ibe.addSuppressed(e);
                throw ibe;
            }
        }

        // create pre-compiled header
        File preCompiledHeaderPath = new File(exportDir, "Prefix.pch");
        try (PrintStream ps = new PrintStream(preCompiledHeaderPath)) {
            Predicate<String> frameworkFilter = (frameworkName) -> true;
            if (ibxConfig != null && ibxConfig.getPrecompileHeadersOptions() != null) {
                IBXOptions.PCHOptions pchConfig = ibxConfig.getPrecompileHeadersOptions();
                // print list of additional includes
                for (IBXOptions.IncludeEntry include: pchConfig.getIncludes()) {
                    if (include.isImport()) ps.println("@import " + include.getIncludeText() + ";");
                    else ps.println("#import <" + include.getIncludeText() + ">");
                }

                // produce list of predicates to filter out frameworks that to be imported
                for (IBXOptions.FilterEntry filter: pchConfig.getFilters()) {
                    if (filter.getAntPathPattern() != null && !filter.getAntPathPattern().isEmpty()) {
                        frameworkFilter = frameworkFilter.and(
                                (name) -> AntPathMatcher.match(filter.getAntPathPattern(), name) ^ filter.isExclude()
                        );
                    }
                }
            }

            // dump frameworks first
            for (FrameworkExportData frameworkData : frameworks) {
                String frameworkName = frameworkData.name.replace(".framework", "").replace(".xcframework", "");

                // skip frameworks that were directed to exclude from pch (that are not required for import and breaks compilation)
                if (!frameworkFilter.test(frameworkName))
                    continue;

                // look for headers in framework location and make only imports if corresponding file exists
                File frameworkPath = frameworkData.frameworkPath;
                if (frameworkPath != null) {
                    // not always there is $frameworks.h header available. do a check. also check for swift ones.
                    // try to find headers for it
                    if (new File(frameworkPath, "Headers/" + frameworkName + ".h").exists())
                        ps.println("#import <" + frameworkName + "/" + frameworkName + ".h>");
                    else {
                        // check for Swift headers
                        boolean hasUmbrella = new File(frameworkPath, "Headers/" + frameworkName + "-umbrella.h").exists();
                        if (hasUmbrella) {
                            ps.println("#import <" + frameworkName + "/" + frameworkName + "-umbrella.h>");
                        }
                        boolean hasSwift = new File(frameworkPath, "Headers/" + frameworkName + "-Swift.h").exists();
                        if (hasSwift) {
                            ps.println("#import <" + frameworkName + "/" + frameworkName + "-Swift.h>");
                        }
                        if (!hasSwift && !hasUmbrella) {
                            ps.println("// #import <" + frameworkName + "/" + frameworkName + ".h> // -- not found");
                        }
                    }
                } else {
                    // path not resolved, probably system framework
                    ps.println("#import <" + frameworkName + "/" + frameworkName + ".h>");
                }
            }
            ps.println();
            // now all classes
            for (IBClassExportData exportClass : exportClasses)
                ps.println("#import \"" + exportClass.classData.getExportClassName() + ".h\"");
        } catch (FileNotFoundException e) {
            IBException ibe = new IBException("Failed to write pre-compiled headers  file");
            ibe.addSuppressed(e);
            throw ibe;
        }
        pbxProject.addSourceFile("", preCompiledHeaderPath);

        // export project file
        File projectFile = new File(exportDir, projectName + ".xcodeproj/project.pbxproj");
        if (!projectFile.getParentFile().exists()) {
            if (!projectFile.getParentFile().mkdirs())
                throw new IBException("Failed to create project folder for XCode project: " + projectFile.getParentFile().getAbsolutePath());
        }
        try (PrintStream ps = new PrintStream(projectFile)) {
            pbxProject.export(ps);
        } catch (FileNotFoundException e) {
            IBException ibe = new IBException("Failed to write project file");
            ibe.addSuppressed(e);
            throw ibe;
        }
    }


    private void exportHeaderFile(IBClassExportData exportClassData, File outputFile) {
        // writing header
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            PrintStream ps = new PrintStream(fos);

            // dump header
            ps.println("/**");
            ps.println(" * " + outputFile.getName());
            ps.println(" *");
            ps.println(StringConsts.EXPORT_FILE_HEADER);
            ps.println(" */");
            ps.println();

            // interface definition
            IBClassHierarchyData classData = exportClassData.classData;
            if (classData.getSuper() != null) {
                ps.println("@interface " + classData.getExportClassName() + " : " + classData.getSuper().getExportClassName());
            } else {
                ps.println("@interface " + classData.getExportClassName());
            }
            ps.println();

            // dump all internals if any
            if (exportClassData.members != null) {
                for (IClassExportMemberItem item : exportClassData.members) {
                    item.exportHeaderText(ps);
                }
            }

            // the end
            ps.println("@end");
        } catch (IOException e) {
            IBException ibe = new IBException("Failed to write file: " + outputFile.getAbsolutePath());
            ibe.addSuppressed(e);
            throw ibe;
        }
    }

    private void exportMFile(IBClassExportData exportClassData,  File outputFile) {
        // writing header
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            PrintStream ps = new PrintStream(fos);

            // dump header
            ps.println("/**");
            ps.println(" * " + outputFile.getName());
            ps.println(" *");
            ps.println(StringConsts.EXPORT_FILE_HEADER);
            ps.println(" */");
            ps.println();

            IBClassHierarchyData classData = exportClassData.classData;
            ps.println("#import \"" + classData.getExportClassName() + ".h\"");
            ps.println();
            ps.println("@implementation " + classData.getExportClassName());
            ps.println();

            // dump all internals if any
            if (exportClassData.members != null) {
                for (IClassExportMemberItem item : exportClassData.members) {
                    item.exportMFileText(ps);
                }
            }

            // the end
            ps.println("@end");
        } catch (IOException e) {
            IBException ibe = new IBException("Failed to write file: " + outputFile.getAbsolutePath());
            ibe.addSuppressed(e);
            throw ibe;
        }
    }

    public void openXCode() {
        File projectFile = new File(exportDir, projectName + ".xcodeproj");
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec(new String[]{"open", projectFile.getAbsolutePath()});
        } catch (IOException e) {
            IBException ibe = new IBException("Failed to start XCode ");
            ibe.addSuppressed(e);
            throw ibe;
        }
    }
}
