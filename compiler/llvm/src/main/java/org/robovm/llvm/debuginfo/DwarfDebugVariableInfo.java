package org.robovm.llvm.debuginfo;

/**
 * @author Demyan Kimitsa
 * Debug information about local variable extracted from ObjectFile/DWARF
 */
public class DwarfDebugVariableInfo {
    // register names from DwarfConsts
    public final static int OP_breg13 = 0x7d;
    public final static int OP_fbreg = 0x91;
    public final static int OP_breg31 = 0x8f;

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

    public DwarfDebugVariableInfo(int register, int offset) {
        this.name = null;
        this.isArgument = false;
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

    public static String registerName(int register) {
        if (register == OP_breg13)
            return "OP_breg13";
        if (register == OP_breg31)
            return "OP_breg31";
        else if (register == OP_fbreg)
            return "OP_fbreg";
        else
            return "OP_" + Integer.toHexString(register);
    }

    @Override
    public String toString() {
        return "DwarfDebugVariableInfo{" +
                "name='" + name + '\'' +
                ", isArgument=" + isArgument +
                ", register=" + registerName(register) +
                ", offset=" + offset +
                '}';
    }
}
