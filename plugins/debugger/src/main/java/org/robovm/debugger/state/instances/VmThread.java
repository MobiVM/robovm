package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * Represend thread object received from target
 */
public class VmThread extends VmInstance {

    public enum Status {
        ATTACHED,
        STARTED,
        SUPENDED,
        SUSPEND_PENDING,
        RESUMED,
        RESUME_PENDING
    }

    Status status;
    int suspendReqCount;

    public VmThread(long objectPtr, ClassInfo classInfo) {
        super(objectPtr, classInfo);
        status = Status.ATTACHED;
    }

    public int suspend() {
        suspendReqCount += 1;
        return suspendReqCount;
    }

    public int resume() {
        if (suspendReqCount > 0)
            suspendReqCount -= 1;
        return suspendReqCount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
