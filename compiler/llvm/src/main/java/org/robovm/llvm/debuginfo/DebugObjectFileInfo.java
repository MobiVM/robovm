package org.robovm.llvm.debuginfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * Object file information as extracted from ObjectFile/DWARF
 */
public class DebugObjectFileInfo {
    private final String sourceFile;
    private final DebugMethodInfo[] methods;
    private Map<String, DebugMethodInfo> methodBySignature;

    public DebugObjectFileInfo(String sourceFile, DebugMethodInfo[] methods) {
        this.sourceFile = sourceFile;
        this.methods = methods;
    }

    public String sourceFile() {
        return sourceFile;
    }

    public DebugMethodInfo[] methods() {
        return methods;
    }

    public DebugMethodInfo methodBySignature(String signature) {
        if (methodBySignature == null) {
            methodBySignature = new HashMap<>();
            for (DebugMethodInfo methodInfo : methods())
                methodBySignature.put(methodInfo.signature(), methodInfo);
        }

        return methodBySignature.get(signature);
    }
}
