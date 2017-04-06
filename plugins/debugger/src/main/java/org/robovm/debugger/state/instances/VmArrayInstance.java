package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoArrayImpl;

/**
 * @author Demyan Kimitsa
 * Instance for array type
 */
public class VmArrayInstance extends VmInstance {
    private final int length;
    private final long dataPtr;

    public VmArrayInstance(long objectPtr, ClassInfoArrayImpl classInfo, int length, long dataPtr) {
        super(objectPtr, classInfo);
        this.length = length;
        this.dataPtr = dataPtr;
    }

    public int length() {
        return length;
    }

    public long dataPtr() {
        return dataPtr;
    }

    public ClassInfo elementType() {
        return ((ClassInfoArrayImpl)classInfo()).elementType();
    }
}
