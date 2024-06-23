package org.robovm.ibxcode.pbxproj;

import org.robovm.ibxcode.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PBXFile extends PBXNode{
    private final File file;

    public PBXFile(PBXProject project, File file) {
        super(project, file.getName());
        this.file = file;
    }

    public PBXFile(PBXProject project, String name, File file) {
        super(project, name);
        this.file = file;
    }

    @Override
    public void dump(PrintStreamTab ips) {
        String line;

        line = uuidWithComment() + " = {isa = PBXFileReference;";
        String fileType = getFileType();
        if (fileType != null)
            line += " lastKnownFileType = " + fileType + ";";
        line += " name = \"" + getName() +"\"";
        if (getName().endsWith(".framework") && file == null) {
            // special case -- system framework (without path)
            line += "; path = System/Library/Frameworks/" + getName() + "; sourceTree = SDKROOT; };";
        } else {
            // try make relative path
            String relativePath = Utils.getRelativePath(getProject().getProjectDir(), file);
            if (relativePath != null)
                line += "; path = \"" + relativePath + "\"; sourceTree = SOURCE_ROOT; };";
            else
                line += "; path = \"" + file.getAbsolutePath() + "\"; sourceTree = \"<absolute>\"; };";
        }
        ips.println(line);
    }

    private String getFileType() {
        String fileName = getName();
        if (fileName.endsWith(".xib"))
            return "file.xib";
        else if (fileName.endsWith(".h"))
            return "sourcecode.c.h";
        else if (fileName.endsWith(".m"))
            return "sourcecode.c.objc";
        else if (fileName.endsWith(".storyboard"))
            return "file.storyboard";
        else if (fileName.endsWith(".xcassets"))
            return "folder.assetcatalog";
        else if (fileName.endsWith(".strings"))
            return "text.plist.strings";
        else if (fileName.endsWith(".framework"))
            return "wrapper.framework";
        else if (fileName.endsWith(".xcframework"))
            return "wrapper.xcframework";
        else if (fileName.endsWith(".plist"))
            return "text.plist.xml";
        else if (file != null && file.isDirectory())
            return "folder";
        return null;
    }

}

