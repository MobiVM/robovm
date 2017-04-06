package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * Represend thread object received from target
 */
public class VmThread extends VmInstance {

    public enum Status {
        SUPENDED,
        RUNNING
    }

    private final long threadPtr;
    private Status status;
    private int suspendCount;
    private VmStackTrace[] stack;

    public VmThread(long objectPtr, long threadPtr, ClassInfo classInfo) {
        super(objectPtr, classInfo);
        this.threadPtr = threadPtr;
        status = Status.RUNNING;
    }

    public int suspendCount() {
        return suspendCount;
    }

    public int suspend() {
        suspendCount += 1;
        return suspendCount;
    }

    public int resume() {
        if (suspendCount > 0) {
            suspendCount -= 1;
            return suspendCount;
        }

        // already resumed
        return -1;
    }


    public long threadPtr() {
        return threadPtr;
    }

    public VmStackTrace[] stack() {
        return stack;
    }

    public void setStack(VmStackTrace[] stack) {
        this.stack = stack;
    }

    public Status status() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
