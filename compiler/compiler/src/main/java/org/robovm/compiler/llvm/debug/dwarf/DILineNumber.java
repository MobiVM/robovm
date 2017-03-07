package org.robovm.compiler.llvm.debug.dwarf;

public class DILineNumber extends DIBaseItem {
    private final int lineNo;
    private final int colNo;
    private final DIBaseItem block;

    public DILineNumber(int lineNo, int colNo, DIBaseItem block) {
        this.lineNo = lineNo;
        this.colNo = colNo;
        this.block = block;
    }

    @Override
    public String toString() {
        return "!dbg !{i32 " + lineNo + ", i32 " + colNo + ", " + block.get() + ", null}";
    }
}
