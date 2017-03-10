package org.robovm.ibxcode.export;

import org.robovm.ibxcode.parser.IBClassHierarchyData;

import java.io.PrintStream;


public class IBOutletExportMemberItem implements  IClassExportMemberItem {
    private String propertyType;
    private String name;
    private String selector;
    private IBClassHierarchyData fieldType;

    public IBOutletExportMemberItem(String propertyType, String name, String selector, IBClassHierarchyData fieldType) {
        this.propertyType = propertyType;
        this.name = name;
        this.selector = selector;
        this.fieldType = fieldType;
    }

    @Override
    public void exportHeaderText(PrintStream ps) {
        ps.println("/**");
        ps.println("* " + propertyType + " " + this.name);
        ps.println("*/");
        if (fieldType.isPrimitive())
            ps.println("@property (assign, nonatomic) " + propertyType + " " + fieldType.getExportClassName() + " " + this.name + ";");
        else
            ps.println("@property (weak, nonatomic) " + propertyType + " " + fieldType.getExportClassName() + " *" + this.name + ";");
        ps.println();
    }

    @Override
    public void exportMFileText(PrintStream ps) {
    }
}
