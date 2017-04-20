package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.refid.RefIdHolder;

/**
 * @author Demyan Kimitsa
 * Represent stack trace converted from device one
 */
public class VmStackTrace implements RefIdHolder.IRefIdObject {
    private long refId;

    private final ClassInfo classInfo;
    private final MethodInfo methodInfo;
    private final int lineNumber;
    private final long fp;

    public VmStackTrace(ClassInfo classInfo, MethodInfo methodInfo, int lineNumber, long fp) {
        this.classInfo = classInfo;
        this.methodInfo = methodInfo;
        this.lineNumber = lineNumber;
        this.fp = fp;
    }

    public ClassInfo classInfo() {
        return classInfo;
    }

    public MethodInfo methodInfo() {
        return methodInfo;
    }

    public int lineNumber() {
        return lineNumber;
    }

    public long fp() {
        return fp;
    }

    @Override
    public void setRefId(long refId) {
        this.refId = refId;
    }

    @Override
    public long refId() {
        return refId;
    }
}
