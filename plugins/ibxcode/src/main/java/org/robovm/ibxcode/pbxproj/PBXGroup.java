package org.robovm.ibxcode.pbxproj;

import java.util.*;

public class PBXGroup extends PBXNode{
    private final List<PBXNode>children = new ArrayList<>();
    private final Map<String, PBXGroup> childrenGroups = new HashMap<>();
    private final Map<String, PBXFile> childrenFiles = new HashMap<>();
    private final Type groupType;

    /** possible group types */
    public enum Type {
        GROUP("PBXGroup"),
        VARIANT_GROUP("PBXVariantGroup");

        private final String value;
        Type(String s) {
            value = s;
        }
    }

    public PBXGroup(PBXProject project, String name) {
        super(project, name);
        groupType = Type.GROUP;
    }

    public PBXGroup(PBXProject project, String name, Type type) {
        super(project, name);
        groupType = type;
    }

    public <T extends PBXNode> T addChild(T child) {
        this.children.add(child);
        if (child instanceof PBXGroup)
            childrenGroups.put(child.getName(), (PBXGroup) child);
        if (child instanceof PBXFile)
            childrenFiles.put(child.getName(), (PBXFile) child);
        return child;
    }

    public List<PBXNode> getChildren() {
        return children ;
    }

    public List<PBXNode> getSortedChildren(Comparator<? super PBXNode> comparator) {
        List<PBXNode> sortedList = new ArrayList<>(children);
        sortedList.sort(comparator);
        return sortedList;
    }

    public PBXFile getChildFile(String name) {
        return childrenFiles.get(name);
    }

    public PBXGroup getChildGroup(String name) {
        return childrenGroups.get(name);
    }

    public Type getGroupType() {
        return groupType;
    }

    @Override
    public void dump(PrintStreamTab ps) {
        dump(ps, null);
    }

    public void dump(PrintStreamTab ps, Comparator<? super PBXNode> comparator) {
        ps.println(this.uuidWithComment() + " = {");
        PrintStreamTab groupPs = new PrintStreamTab(ps);
        groupPs.println("isa = " + groupType.value + ";");
        groupPs.println("children = (");

        PrintStreamTab childPs = new PrintStreamTab(groupPs);
        List<PBXNode> sortedNodes = comparator != null ? getSortedChildren(comparator) : children;
        for (PBXNode node : sortedNodes)
            childPs.println(node.uuidWithComment() + ",");

        groupPs.println(");");
        groupPs.println("name = \"" + this.getName() + "\";");
        groupPs.println("sourceTree = \"<group>\";");

        ps.println("};");
    }
}
