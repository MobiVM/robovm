package org.robovm.ibxcode.export;

import org.robovm.ibxcode.Utils;
import org.robovm.ibxcode.parser.IBClassHierarchyData;
import org.robovm.ibxcode.IBException;
import org.robovm.ibxcode.consts.StringConsts;
import org.robovm.ibxcode.pbxproj.PBXProject;
import org.apache.bcel.classfile.JavaClass;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

/**
 * Generates .m, .h files and pre-compiled headers
 */
public class XCodeProjectExporter {
    private final List<IBClassExportData> exportClasses;
    private final List<File> resources;
    private final List<FrameworkExportData> frameworks;
    private final File projectDir;
    private final File exportDir;
    private final String projectName;
    private final PBXProject pbxProject;

    public XCodeProjectExporter(List<IBClassExportData> exportClasses, List<File> resources, List<FrameworkExportData> frameworks,
                                File projectDir, File exportDir, String projectName) {
        this.exportClasses = exportClasses;
        this.resources = resources;
        this.frameworks = frameworks;
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

        // create pre-compiled header
        File preCompiledHeaderPath = new File(exportDir, "Prefix.pch");
        try (PrintStream ps = new PrintStream(preCompiledHeaderPath)) {
            // dump frameworks first
            for (FrameworkExportData frameworkData : frameworks) {
                String frameworkName = frameworkData.name.replace(".framework", "");
                ps.println("#import <" + frameworkName + "/" + frameworkName + ".h>");
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
