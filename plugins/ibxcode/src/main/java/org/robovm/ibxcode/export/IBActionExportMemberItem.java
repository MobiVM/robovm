package org.robovm.ibxcode.export;

import org.robovm.ibxcode.parser.IBClassHierarchyData;

import java.io.PrintStream;


public class IBActionExportMemberItem implements  IClassExportMemberItem {
    private String name;
    private String selector;
    private IBClassHierarchyData argType;

    public IBActionExportMemberItem(String name, String selector, IBClassHierarchyData argType) {
        this.name = name;
        this.selector = selector;
        this.argType = argType;
    }

    @Override
    public void exportHeaderText(PrintStream ps) {
        ps.println("/**");
        ps.println(" * IBAction " + this.name);
        if (this.selector != null)
            ps.println(" * Selector " + this.selector);
        ps.println("*/");
        ps.print("-(IBAction) ");
        ps.print(this.selector != null ? this.selector : this.name);
        ps.println(this.argType != null ? ":(id) sender;": ";");
        ps.println("");
    }

    @Override
    public void exportMFileText(PrintStream ps) {
    }
}
