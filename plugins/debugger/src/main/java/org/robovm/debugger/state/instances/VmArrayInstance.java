package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * Instance for array type
 */
public class VmArrayInstance extends VmInstance {
    private final int length;
    private final long dataPtr;
    private final ClassInfo elementType;

    public VmArrayInstance(long objectPtr, ClassInfo classInfo, int length, long dataPtr) {
        super(objectPtr, classInfo);
        this.length = length;
        this.dataPtr = dataPtr;
    }
}
