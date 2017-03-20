package org.robovm.ibxcode.pbxproj;

public class PBXNode {
    private static long uuidCounter = 0x10000000000000L;
    protected final String uuid;
    protected final PBXProject project;
    protected final String name;

    public PBXNode(PBXProject project, String name) {
        this.project = project;
        this.name = name;
        this.uuid = String.format("AB%020x", uuidCounter) ;
        uuidCounter += 1;
    }

    public PBXProject getProject() {
        return project;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String uuidWithComment() {
        return this.uuid + " /* " + this.name + " */";
    }

    public void dump(PrintStreamTab ps) {

    }
}
