package org.robovm.llvm.debuginfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * Object file information as extracted from ObjectFile/DWARF
 */
public class DwarfDebugObjectFileInfo {
    private final String sourceFile;
    private final DwarfDebugMethodInfo[] methods;
    private Map<String, DwarfDebugMethodInfo> methodBySignature;

    public DwarfDebugObjectFileInfo(String sourceFile, DwarfDebugMethodInfo[] methods) {
        this.sourceFile = sourceFile;
        this.methods = methods;
    }

    public String sourceFile() {
        return sourceFile;
    }

    public DwarfDebugMethodInfo[] methods() {
        return methods;
    }

    public DwarfDebugMethodInfo methodBySignature(String signature) {
        if (methodBySignature == null) {
            methodBySignature = new HashMap<>();
            for (DwarfDebugMethodInfo methodInfo : methods())
                methodBySignature.put(methodInfo.signature(), methodInfo);
        }

        return methodBySignature.get(signature);
    }
}
