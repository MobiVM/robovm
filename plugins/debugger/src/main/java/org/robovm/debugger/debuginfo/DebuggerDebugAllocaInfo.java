package org.robovm.debugger.debuginfo;

/**
 * Provides information about location of variable during runtime.
 * In way register + offset
 * @author dkimitsa
 */
public class DebuggerDebugAllocaInfo {
    // register names from DwarfConsts
    public final static int OP_breg13 = 0x7d;
    public final static int OP_fbreg = 0x91;
    public final static int OP_breg31 = 0x8f;

    /** refer to DwarfConst.LocationAtom for list of registers */
    private final int register;
    private final int offset;

    public DebuggerDebugAllocaInfo(int register, int offset) {
        this.register = register;
        this.offset = offset;
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
        return "DebuggerDebugAllocaInfo{" +
                ", register=" + registerName(register) +
                ", offset=" + offset +
                '}';
    }
}
