package org.robovm.ibxcode.pbxproj;

import java.io.File;
import java.io.PrintStream;
import java.util.Comparator;

public class PBXProject extends PBXNode {
    private final File projectDir;

    private final PBXGroup rootGroup = new PBXGroup(this, "root");
    private final PBXGroup sourcesGroup = rootGroup.addChild(new PBXGroup(this, "sources"));
    private final PBXGroup resourcesGroup = rootGroup.addChild(new PBXGroup(this, "resources"));
    private final PBXGroup frameworksGroup = rootGroup.addChild(new PBXGroup(this, "frameworks"));
    private final PBXGroup buildFilesGroup = new PBXGroup(this, "buildFileGroup");
    private final PBXNode buildConfigurationList = new PBXNode(this, "Build configuration list for PBXProject");
    private final PBXNode buildConfigurationRoboVM = new PBXNode(this, "RoboVM");
    private final PBXNode sourcesBuildPhaseRoboVM = new PBXNode(this, "Sources");
    private final PBXNode frameworksBuildPhaseRoboVM = new PBXNode(this, "Frameworks");
    private final PBXNode buildNativeTarget = new PBXNode(this, "RoboVM");

    public PBXProject(File projectDir) {
        super(null, "Project object");
        this.projectDir = projectDir;
    }

    public File getProjectDir() {
        return projectDir;
    }

    public void addSourceFile(String groupId, File path) {
        PBXGroup group = groupId.isEmpty() ? sourcesGroup : sourcesGroup.getChildGroup(groupId);
        if (group == null)
            group = sourcesGroup.addChild(new PBXGroup(this, groupId));
        PBXFile fileNode = group.addChild(new PBXFile(this, path));

        // add to build group if it is .m file
        if (path.getName().endsWith(".m"))
            buildFilesGroup.addChild(new PBXBuildFile(this, fileNode));
    }

    public void addResourceFile(String groupId, File path) {
        PBXGroup group = groupId.isEmpty() ? resourcesGroup : resourcesGroup.getChildGroup(groupId);
        if (group == null)
            group = resourcesGroup.addChild(new PBXGroup(this, groupId));

        // special case -- files in lproj folders has to be exported as name of .lproj
        String parenName = path.getParentFile().getName();
        if (parenName.endsWith(".lproj")) {
            // add variant group instead
            String name = parenName.substring(0, parenName.length() - ".lproj".length());
            PBXGroup variantGroup = group.getChildGroup(path.getName());
            if (variantGroup == null) {
                variantGroup = group.addChild(new PBXGroup(this, path.getName(), PBXGroup.Type.VARIANT_GROUP));
            }
            variantGroup.addChild(new PBXFile(this, name, path));
        } else {
            group.addChild(new PBXFile(this, path));

        }
    }

    public void addFramework(String name, File path) {
        PBXFile fileNode = frameworksGroup.addChild(new PBXFile(this, name, path));
        buildFilesGroup.addChild(new PBXBuildFile(this, fileNode));
    }

    public void export(PrintStream fps) {
        PrintStreamTab ps = new PrintStreamTab(fps);
        ps.println("// !$*UTF8*$!");
        ps.println("{");

        PrintStreamTab bodyPs = new PrintStreamTab(ps);
        bodyPs.println("archiveVersion = 1;");
        bodyPs.println("classes = {");
        bodyPs.println("};");
        bodyPs.println("objectVersion = 46;");
        bodyPs.println("objects = {");

        PrintStreamTab childPs = new PrintStreamTab(bodyPs);
        ps.println();

        // dump file refs
        ps.println("/* Begin PBXFileReference section */");
        this.dumpPBXfiles(rootGroup, childPs);
        ps.println("/* End PBXFileReference section */");
        ps.println();

        // dump groups
        ps.println("/* Begin PBXGroup section */");
        this.dumpPBXgroups(rootGroup, childPs, PBXGroup.Type.GROUP);
        ps.println("/* End PBXGroup section */");
        ps.println();

        // dump now variant groups
        ps.println("/* Begin PBVariantXGroup section */");
        this.dumpPBXgroups(rootGroup, childPs, PBXGroup.Type.VARIANT_GROUP);
        ps.println("/* End PBVariantXGroup section */");
        ps.println();

        // dump PBXBuildFile refs
        ps.println("/* Begin PBXBuildFile section */");
        this.dumpPBXBuildFilesfiles(childPs);
        ps.println("/* End PBXBuildFile section */");
        ps.println();

        // dump source build phases
        ps.println("/* Begin PBXSourcesBuildPhase section */");
        this.dumpSourcesBuildPhase(childPs);
        ps.println("/* End PBXSourcesBuildPhase section */");
        ps.println();

        // dump frameworks build phases
        ps.println("/* Begin PBXFrameworksBuildPhase section */");
        this.dumpFrameworksBuildPhase(childPs);
        ps.println("/* End PBXFrameworksBuildPhase section */");
        ps.println();

        // dump native targets
        ps.println("/* Begin PBXNativeTarget section */");
        this.dumpBuildNativeTarget(childPs);
        ps.println("/* End PBXNativeTarget section */");
        ps.println();

        // dump BuildConfiguration
        ps.println("/* Begin XCBuildConfiguration section */");
        this.dumpBuildConfigurationRoboVM(childPs);
        ps.println("/* End XCBuildConfiguration section */");
        ps.println();

        // dump BuildConfigurationList
        ps.println("/* Begin XCConfigurationList section */");
        this.dumpBuildConfigurationList(childPs);
        ps.println("/* End XCConfigurationList section */");
        ps.println();

        // dump project object -- e.g. self
        ps.println("/* Begin PBXProject section */");
        this.dump(childPs);
        ps.println("/* End PBXProject section */");
        ps.println();

        bodyPs.println("};");
        bodyPs.println("rootObject = " + this.uuidWithComment() + ";");

        ps.println("}");
    }

    private void dumpPBXfiles(PBXGroup group, PrintStreamTab ps) {
        for (PBXNode node : group.getChildren()) {
            if (node instanceof PBXFile)
                node.dump(ps);
            else if (node instanceof PBXGroup)
                dumpPBXfiles((PBXGroup) node, ps);
        }
    }

    private void dumpPBXgroups(PBXGroup group, PrintStreamTab ps, PBXGroup.Type groupType) {
        if (group.getGroupType() == groupType)
            group.dump(ps, PROJECT_ITEM_COMPARATOR);
        for (PBXNode node : group.getChildren()) {
            if (node instanceof PBXGroup) {
                dumpPBXgroups((PBXGroup) node, ps, groupType);
            }
        }
    }

    private void dumpPBXBuildFilesfiles(PrintStreamTab ps) {
        for (PBXNode node : buildFilesGroup.getChildren())
            node.dump(ps);
    }

    private void dumpBuildConfigurationList(PrintStreamTab ps) {
        PrintStreamTab bodyPs = new PrintStreamTab(ps);
        PrintStreamTab childPs = new PrintStreamTab(bodyPs);
        ps.println(buildConfigurationList.uuidWithComment() + " = {");
        bodyPs.println("isa = XCConfigurationList;");
        bodyPs.println("buildConfigurations = (");
        childPs.println(buildConfigurationRoboVM.uuidWithComment() + ",");
        bodyPs.println(");");
        bodyPs.println("defaultConfigurationName = " + buildConfigurationRoboVM.getName() + ";");
        ps.println("};");
    }

    private void dumpBuildConfigurationRoboVM(PrintStreamTab ps) {
        PrintStreamTab bodyPs = new PrintStreamTab(ps);
        PrintStreamTab childPs = new PrintStreamTab(bodyPs);
        ps.println(buildConfigurationRoboVM.uuidWithComment() + " = {");
        bodyPs.println("isa = XCBuildConfiguration;");
        bodyPs.println("buildSettings = {");
        childPs.println("SDKROOT = iphoneos;");
        childPs.println("PRODUCT_NAME = \"RoboVM\";");
        childPs.println("CLANG_ENABLE_MODULES = \"YES\";");
        childPs.println("GCC_PRECOMPILE_PREFIX_HEADER = \"YES\";");
        childPs.println("GCC_PREFIX_HEADER = Prefix.pch;");
        childPs.println("GENERATE_INFOPLIST_FILE = \"YES\";");
        childPs.println("INFOPLIST_FILE = Info.plist;");
        bodyPs.println("};");
        bodyPs.println("name = \"" + buildConfigurationRoboVM.getName() +"\";");
        ps.println("};");
    }

    private void dumpSourcesBuildPhase(PrintStreamTab ps) {
        PrintStreamTab bodyPs = new PrintStreamTab(ps);
        PrintStreamTab childPs = new PrintStreamTab(bodyPs);
        ps.println(sourcesBuildPhaseRoboVM.uuidWithComment() + " = {");
        bodyPs.println("isa = PBXSourcesBuildPhase;");
        bodyPs.println("buildActionMask = 2147483647;");
        bodyPs.println("files = (");
        for (PBXNode node : buildFilesGroup.getChildren())
            if (node.getName().endsWith(".m"))
                childPs.println(node.uuidWithComment() + ",");
        bodyPs.println(");");
        bodyPs.println("runOnlyForDeploymentPostprocessing = 0;");
        ps.println("};");
    }

    private void dumpFrameworksBuildPhase(PrintStreamTab ps) {
        PrintStreamTab bodyPs = new PrintStreamTab(ps);
        PrintStreamTab childPs = new PrintStreamTab(bodyPs);
        ps.println(frameworksBuildPhaseRoboVM.uuidWithComment() + " = {");
        bodyPs.println("isa = PBXFrameworksBuildPhase;");
        bodyPs.println("buildActionMask = 2147483647;");
        bodyPs.println("files = (");
        for (PBXNode node : buildFilesGroup.getChildren())
            if (node.getName().endsWith(".framework") || node.getName().endsWith(".xcframework"))
                childPs.println(node.uuidWithComment() + ",");
        bodyPs.println(");");
        bodyPs.println("runOnlyForDeploymentPostprocessing = 0;");
        ps.println("};");
    }

    private void dumpBuildNativeTarget(PrintStreamTab ps) {
        PrintStreamTab bodyPs = new PrintStreamTab(ps);
        PrintStreamTab childPs = new PrintStreamTab(bodyPs);
        ps.println(buildNativeTarget.uuidWithComment() + " = {");
        bodyPs.println("isa = PBXNativeTarget;");
        bodyPs.println("buildPhases = (");
        childPs.println(sourcesBuildPhaseRoboVM.uuidWithComment() + ",");
        childPs.println(frameworksBuildPhaseRoboVM.uuidWithComment() + ",");
        bodyPs.println(");");
        bodyPs.println("buildRules = (");
        bodyPs.println(");");
        bodyPs.println("dependencies = (");
        bodyPs.println(");");
        bodyPs.println("name = \"" + buildNativeTarget.getName() +"\";");
        bodyPs.println("productName = \"" + buildNativeTarget.getName() +"\";");
        bodyPs.println("productType = \"com.apple.product-type.application\";");
        ps.println("};");
    }

    @Override
    public void dump(PrintStreamTab ps) {
        PrintStreamTab bodyPs = new PrintStreamTab(ps);
        PrintStreamTab childPs = new PrintStreamTab(bodyPs);
        ps.println(uuidWithComment() + " = {");
        bodyPs.println("isa = PBXProject;");
        bodyPs.println("buildConfigurationList = " + buildConfigurationList.uuidWithComment() + ";");
        bodyPs.println("compatibilityVersion = \"Xcode 3.2\";");
        bodyPs.println("developmentRegion = English;");
        bodyPs.println("hasScannedForEncodings = 0;");
        bodyPs.println("knownRegions = (");
        childPs.println("en,");
        bodyPs.println(");");
        bodyPs.println("mainGroup = " + this.rootGroup.getUuid() + ";");
//        bodyPs.println("productRefGroup = B8C809B61E2641F300F077E1 /* Products */;");
        bodyPs.println("projectDirPath = \"\";");
        bodyPs.println("projectRoot = \"\";");
        bodyPs.println("targets = (");
        childPs.println(buildNativeTarget.uuidWithComment() + ",");
        bodyPs.println(");");
        ps.println("};");
    }

    /** comparator to sort items */
    private final Comparator<PBXNode> PROJECT_ITEM_COMPARATOR = (o1, o2) -> {
        // put groups top
        boolean g1 = o1 instanceof PBXGroup;
        boolean g2 = o2 instanceof PBXGroup;
        if (g1 == g2) {
            // both are groups or both are not
            // compare names
            return o1.getName().compareTo(o2.getName());
        } else {
            // node that is group will go top
            return g1 ? -1 : 1;
        }
    };

}

