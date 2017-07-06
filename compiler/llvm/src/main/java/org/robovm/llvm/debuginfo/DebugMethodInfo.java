package org.robovm.llvm.debuginfo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * Method debug info that is extracted from ObjectFile/DWARF
 */
public class DebugMethodInfo {
    private final String name;
    private final DebugVariableInfo[] localvariables;
    private Map<String, DebugVariableInfo> variableByName;

    // scope visibility range -- line numbers (not available from DWARF)
    private final int startLine;
    private final int finalLine;

    public DebugMethodInfo(String name, DebugVariableInfo[] localvariables) {
        this.name = name;
        this.localvariables = localvariables;
        this.startLine = -1;
        this.finalLine = -1;
    }

    public DebugMethodInfo(String name, DebugVariableInfo[] localvariables, int startLine, int finalLine) {
        this.name = name;
        this.localvariables = localvariables;
        this.startLine = startLine;
        this.finalLine = finalLine;
    }

    public String signature() {
        return name;
    }

    public DebugVariableInfo[] localvariables() {
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
        return "DebugMethodInfo{" +
                "name='" + name + '\'' +
                ", localvariables=" + Arrays.toString(localvariables) +
                '}';
    }

    public DebugVariableInfo variableByName(String name) {
        if (variableByName == null) {
            variableByName = new HashMap<>();
            for (DebugVariableInfo variableInfo : localvariables)
                variableByName.put(variableInfo.name(), variableInfo);
        }
        return variableByName.get(name);
    }
}
