package org.robovm.compiler.config;

/**
 * Specifies environment kind build/deployment is targeted
 * @author dkimitsa
 */
public enum Environment {
    Native(""),
    Simulator("simulator");

    private final String llvmName;

    Environment(String llvmName) {
        this.llvmName = llvmName;
    }

    public String getLlvmName() {
        return llvmName;
    }

    public String asLlvmSuffix(String delimiter) {
        return (llvmName != null && !llvmName.isEmpty()) ? (delimiter + llvmName) : "";
    }

    public static Environment parse(String s) {
        for (Environment e: values())
            if (e.llvmName.equals(s))
                return e;
        throw new IllegalArgumentException("Failed to parse Environment with llvmName="+s);
    }
}
