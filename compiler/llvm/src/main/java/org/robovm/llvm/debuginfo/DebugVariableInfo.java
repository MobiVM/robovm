package org.robovm.llvm.debuginfo;

/**
 * @author Demyan Kimitsa
 * Debug information about local variable extracted from ObjectFile/DWARF
 */
public class DebugVariableInfo {
    // register names from DwarfConsts
    public final static int OP_breg13 = 0x7d;
    public final static int OP_fbreg = 0x91;
    public final static int OP_breg31 = 0x8f;

    private final String name;
    private final boolean isArgument;

    // scope visibility range -- line numbers (not available from DWARF)
    private final int startLine;
    private final int finalLine;
    // type signature (not available from DWARF)
    private final String typeSignature;

    /** refer to DwarfConst.LocationAtom for list of registers */
    private final int register;
    private final int offset;

    public DebugVariableInfo(String name, boolean isArgument, int register, int offset) {
        this.name = name;
        this.isArgument = isArgument;
        this.register = register;
        this.offset = offset;
        this.startLine = -1;
        this.finalLine = -1;
        this.typeSignature = null;
    }

    /**
     * constructor used to produce debug information that will be saved to dbg file
     * covers information that is not available in dwarf
     */
    public DebugVariableInfo(String name, String typeSignature, boolean isArgument, int startLine, int finalLine,  int register, int offset) {
        this.name = name;
        this.typeSignature = typeSignature;
        this.isArgument = isArgument;
        this.startLine = startLine;
        this.finalLine = finalLine;
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

    public int startLine() {
        return startLine;
    }

    public int finalLine() {
        return finalLine;
    }

    public String typeSignature() {
        return typeSignature;
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
        return "DebugVariableInfo{" +
                "name='" + name + '\'' +
                ", isArgument=" + isArgument +
                ", register=" + registerName(register) +
                ", offset=" + offset +
                '}';
    }
}
