package org.robovm.ibxcode.pbxproj;

import org.robovm.ibxcode.Utils;

import java.io.File;

public class PBXBuildFile extends PBXNode{
    private final PBXFile ref;

    public PBXBuildFile(PBXProject project, PBXFile ref) {
        super(project, ref.getName());
        this.ref = ref;
    }

    @Override
    public void dump(PrintStreamTab ips) {
        ips.println(uuidWithComment() + " = {isa = PBXBuildFile; fileRef = " + ref.uuidWithComment() + "; };");
    }
}

