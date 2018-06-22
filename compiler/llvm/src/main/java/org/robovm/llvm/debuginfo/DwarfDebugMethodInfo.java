package org.robovm.llvm.debuginfo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * Method debug info that is extracted from ObjectFile/DWARF
 */
public class DwarfDebugMethodInfo {
    private final String name;
    private final DwarfDebugVariableInfo[] localvariables;
    private Map<String, DwarfDebugVariableInfo> variableByName;

    // scope visibility range -- line numbers (not available from DWARF)
    private final int startLine;
    private final int finalLine;

    public DwarfDebugMethodInfo(String name, DwarfDebugVariableInfo[] localvariables) {
        this.name = name;
        this.localvariables = localvariables;
        this.startLine = -1;
        this.finalLine = -1;
    }

    public DwarfDebugMethodInfo(String name, DwarfDebugVariableInfo[] localvariables, int startLine, int finalLine) {
        this.name = name;
        this.localvariables = localvariables;
        this.startLine = startLine;
        this.finalLine = finalLine;
    }

    public String signature() {
        return name;
    }

    public DwarfDebugVariableInfo[] localvariables() {
        return localvariables;
    }

    public int startLine() {
        return startLine;
    }

    public int finalLine() {
        return finalLine;
    }

    @Override
    public String toString() {
        return "DwarfDebugMethodInfo{" +
                "name='" + name + '\'' +
                ", localvariables=" + Arrays.toString(localvariables) +
                '}';
    }

    public DwarfDebugVariableInfo variableByName(String name) {
        if (variableByName == null) {
            variableByName = new HashMap<>();
            for (DwarfDebugVariableInfo variableInfo : localvariables)
                variableByName.put(variableInfo.name(), variableInfo);
        }
        return variableByName.get(name);
    }
}
