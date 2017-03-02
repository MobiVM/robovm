package org.robovm.ibxcode.export;

import org.robovm.ibxcode.parser.IBClassHierarchyData;

import java.util.List;

public class IBClassExportData {
    final IBClassHierarchyData classData;
    final List<IClassExportMemberItem> members;

    public IBClassExportData(IBClassHierarchyData classData, List<IClassExportMemberItem> members) {
        this.classData = classData;
        this.members = members;
    }
}
