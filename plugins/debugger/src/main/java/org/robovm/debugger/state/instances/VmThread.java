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
        RESUMED
    }

    private final long threadPtr;
    private Status status;
    private int suspendReqCount;

    public VmThread(long objectPtr, long threadPtr, ClassInfo classInfo) {
        super(objectPtr, classInfo);
        this.threadPtr = threadPtr;
        status = Status.ATTACHED;
    }

    public int suspended() {
        suspendReqCount += 1;
        return suspendReqCount;
    }

    public int resumed() {
        if (suspendReqCount > 0)
            suspendReqCount -= 1;
        return suspendReqCount;
    }


    public long getThreadPtr() {
        return threadPtr;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
