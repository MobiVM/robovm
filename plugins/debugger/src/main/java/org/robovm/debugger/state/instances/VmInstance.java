package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.refid.RefIdHolder;

/**
 * @author Demyan Kimitsa
 * Represent instance received from target
 */
public class VmInstance  implements RefIdHolder.IRefIdObject{
    private final long objectPtr;
    private final ClassInfo classInfo;
    private long refId;

    public VmInstance(long objectPtr, ClassInfo classInfo) {
        this.objectPtr = objectPtr;
        this.classInfo = classInfo;
    }

    @Override
    public void setRefId(long refId) {
        this.refId = refId;
    }

    @Override
    public long getRefId() {
        return refId;
    }

    public long getObjectPtr() {
        return objectPtr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VmInstance that = (VmInstance) o;

        if (objectPtr != that.objectPtr) return false;
        return refId == that.refId;
    }

    @Override
    public int hashCode() {
        int result = (int) (objectPtr ^ (objectPtr >>> 32));
        result = 31 * result + (int) (refId ^ (refId >>> 32));
        return result;
    }
}
