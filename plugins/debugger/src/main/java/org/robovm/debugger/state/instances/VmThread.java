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

    /** native (not java) thread object pointer */
    private final long threadPtr;

    /** thread name */
    private final String name;

    /** thread group */
    private final VmThreadGroup threadGroup;

    private Status status;
    private int suspendCount;
    private VmStackTrace[] stack;


    public VmThread(long objectPtr, long threadPtr, ClassInfo classInfo, String name, VmThreadGroup threadGroup) {
        super(objectPtr, classInfo);
        this.threadPtr = threadPtr;
        this.name = name;
        this.threadGroup = threadGroup;
        status = Status.RUNNING;
    }

    public int suspendCount() {
        return suspendCount;
    }

    public int markSuspended() {
        suspendCount += 1;
        return suspendCount;
    }

    public int markResumed() {
        if (suspendCount > 0) {
            suspendCount -= 1;
            return suspendCount;
        }

        // already resumed
        return -1;
    }

    public String name() {
        return name;
    }

    public VmThreadGroup threadGroup() {
        return threadGroup;
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

    @Override
    public String toString() {
        return "thread (" + refId() + ", " + name + ", " + threadGroup.name() + ")";
    }
}
