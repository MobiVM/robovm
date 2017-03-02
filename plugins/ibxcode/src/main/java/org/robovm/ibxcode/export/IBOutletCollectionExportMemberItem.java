package org.robovm.ibxcode.export;

import org.robovm.ibxcode.parser.IBClassHierarchyData;

import java.io.PrintStream;


public class IBOutletCollectionExportMemberItem implements  IClassExportMemberItem {
    private String name;
    private String selector;
    private IBClassHierarchyData fieldType;

    public IBOutletCollectionExportMemberItem(String name, String selector, IBClassHierarchyData fieldType) {
        this.name = name;
        this.selector = selector;
        this.fieldType = fieldType;
    }

    @Override
    public void exportHeaderText(PrintStream ps) {
        ps.println("/**");
        ps.println("* IBOutletCollection " + this.name);
        ps.println("*/");
        ps.println("@property (strong, nonatomic) IBOutletCollection("+ fieldType.getExportClassName() + ") NSArray *" + this.name + ";");
        ps.println();
    }

    @Override
    public void exportMFileText(PrintStream ps) {
    }
}
