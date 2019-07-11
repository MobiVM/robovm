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


    public DwarfDebugMethodInfo(String name, DwarfDebugVariableInfo[] localvariables) {
        this.name = name;
        this.localvariables = localvariables;
    }

    public String signature() {
        return name;
    }

    public DwarfDebugVariableInfo[] localvariables() {
        return localvariables;
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
