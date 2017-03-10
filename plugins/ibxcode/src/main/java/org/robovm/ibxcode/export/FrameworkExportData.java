package org.robovm.ibxcode.export;

import java.io.File;

public class FrameworkExportData {
    public final String name;
    public final File path;

    public FrameworkExportData(String name, File path) {
        this.name = name;
        this.path = path;
    }
}
