package org.robovm.llvm.debuginfo;

/**
 * @author Demyan Kimitsa
 * Debug information about local variable extracted from ObjectFile/DWARF
 */
public class DwarfDebugVariableInfo {
    private final String name;
    private final boolean isArgument;

    /** refer to DwarfConst.LocationAtom for list of registers */
    private final int register;
    private final int offset;

    public DwarfDebugVariableInfo(String name, boolean isArgument, int register, int offset) {
        this.name = name;
        this.isArgument = isArgument;
        this.register = register;
        this.offset = offset;
    }

    public String name() {
        return name;
    }

    public boolean isArgument() {
        return isArgument;
    }

    public int register() {
        return register;
    }

    public int offset() {
        return offset;
    }
}
