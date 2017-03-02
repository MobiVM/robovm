package org.robovm.ibxcode.export;

import org.robovm.ibxcode.parser.IBClassHierarchyData;

import java.io.PrintStream;


public class IBOutletExportMemberItem implements  IClassExportMemberItem {
    private String name;
    private String selector;
    private IBClassHierarchyData fieldType;

    public IBOutletExportMemberItem(String name, String selector, IBClassHierarchyData fieldType) {
        this.name = name;
        this.selector = selector;
        this.fieldType = fieldType;
    }

    @Override
    public void exportHeaderText(PrintStream ps) {
        ps.println("/**");
        ps.println("* IBOutlet " + this.name);
        ps.println("*/");
        if (fieldType.isPrimitive())
            ps.println("@property (assign, nonatomic) IBOutlet "+ fieldType.getExportClassName() + " " + this.name + ";");
        else
            ps.println("@property (weak, nonatomic) IBOutlet "+ fieldType.getExportClassName() + " *" + this.name + ";");
        ps.println();
    }

    @Override
    public void exportMFileText(PrintStream ps) {
    }
}
