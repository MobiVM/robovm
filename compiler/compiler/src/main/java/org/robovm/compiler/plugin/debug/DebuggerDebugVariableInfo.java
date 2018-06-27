package org.robovm.compiler.plugin.debug;

/**
 * @author Demyan Kimitsa
 * Debug information about local variable
 */
public class DebuggerDebugVariableInfo {
    private final String name;
    private final boolean isArgument;
    private final int startLine;
    private final int finalLine;
    private final String typeSignature;

    /**
     * constructor used to produce debug information that will be saved to dbg file
     * covers information that is not available in dwarf
     */
    DebuggerDebugVariableInfo(String name, String typeSignature, boolean isArgument, int startLine, int finalLine) {
        this.name = name;
        this.typeSignature = typeSignature;
        this.isArgument = isArgument;
        this.startLine = startLine;
        this.finalLine = finalLine;
    }

    public String name() {
        return name;
    }

    public boolean isArgument() {
        return isArgument;
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

    @Override
    public String toString() {
        return "DebuggerDebugVariableInfo{" +
                "name='" + name + '\'' +
                ", isArgument=" + isArgument +
                ", startLine=" + startLine +
                ", finalLine=" + finalLine +
                ", typeSignature='" + typeSignature + '\'' +
                '}';
    }
}
