package org.robovm.ibxcode.pbxproj;

import java.io.PrintStream;

/**
 * Wrapper that adds intend
 */
public class PrintStreamTab {
    public final String TAB = "\t";
    private final PrintStream ps;
    private final String intend;

    public PrintStreamTab(PrintStream ps) {
        this.ps = ps;
        this.intend = "";
    }

    public PrintStreamTab(PrintStreamTab parent) {
        this.ps = parent.ps;
        this.intend = parent.intend + TAB;
    }

    public void println(String s) {
        this.ps.println(this.intend + s);
    }

    public void println() {
        this.ps.println();
    }
}
