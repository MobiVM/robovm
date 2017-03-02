package org.robovm.ibxcode.export;

import java.io.PrintStream;

/**
 * Interface to create simple interface when exporting data
 */
public interface IClassExportMemberItem {
    void exportHeaderText(PrintStream ps);
    void exportMFileText(PrintStream ps);
}
