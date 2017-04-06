package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.thread.IJdwpThreadDelegate;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;

/**
 * @author Demyan Kimitsa
 */
public class ThreadDelegate implements IJdwpThreadDelegate {
    /**
     * all delegates and logic in one place
     */
    private final AllDelegates delegates;

    public ThreadDelegate(AllDelegates delegates) {
        this.delegates = delegates;
    }

    @Override
    public void jdwpSuspendThread(long threadId) throws DebuggerException {
        VmThread thread = getThread(threadId);
        suspendThread(thread);;
    }

    public void suspendThread(VmThread thread) throws DebuggerException {
        // suspend only if suspend count was 0 (after call it is 1)
        int suspendCount = thread.suspend();
        if (suspendCount == 1) {
            delegates.hooksApi().threadSuspend(thread.threadPtr());
            thread.setStatus(VmThread.Status.SUPENDED);
        }
    }

    @Override
    public void jdwpResumeThread(long threadId) throws DebuggerException {
        VmThread thread = getThread(threadId);
        resumeThread(thread);
    }

    public void resumeThread(VmThread thread) throws DebuggerException {
        // resume if suspend count now is zero
        int suspendCount = thread.resume();
        if (suspendCount == 1) {
            delegates.hooksApi().threadResume(thread.threadPtr());
            thread.setStatus(VmThread.Status.RUNNING);
            setThreadStack(thread, null);
        }
    }


    /**
     * called once thread is suspended (as notification from hooks)
     * @param thread object
     * @param stack call stack
     * @param reported tells that this suspend event is not going to be reported to JDWP and if thread is not suspended
     *                 it should be immediately resumed. Otherwise stack shall be updated
     */
    public void onThreadSuspended(VmThread thread, VmStackTrace[] stack, boolean reported) {
        if (!reported) {
            if (thread.suspendCount() == 0) {
                // thread is not suspended and this event is filtered out, so resume thread
                delegates.hooksApi().threadResume(thread.threadPtr());
            } else {
                // TODO: there is a case that stack is updated but JDPW client doesn't know about it
                // update stack
                setThreadStack(thread, stack);
            }
        }

        // mark as suspended

    }

    public void onThreadSuspended(VmThread thread, VmStackTrace[] stack) {
        onThreadSuspended(thread, stack, true);
    }

    public void onTheadResumed(VmThread thread) {
        // res

    }

    private VmThread getThread(long threadId) {
        VmThread thread;
        try {
            thread = delegates.state().referenceRefIdHolder().instanceById(threadId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
        }
        if (thread == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);

        return thread;
    }

    private void setThreadStack(VmThread thread, VmStackTrace[] stack) {
        VmStackTrace[] oldStack = thread.stack();
        if (oldStack != null) {
            // unregister old stack entries to release some memory
            for (VmStackTrace trace : oldStack)
                delegates.state().frameRefIdHolder().removeObject(trace);
        }

        // now registers new
        if (stack != null) {
            for (VmStackTrace trace : stack)
                delegates.state().frameRefIdHolder().addObject(trace);
        }

        thread.setStack(stack);
    }

    public void suspendAllOtherThreads(VmThread stoppedThread) {
        for (VmThread thread : delegates.state().threads()) {
            if (thread != stoppedThread)
                suspendThread(thread);
        }
    }
}
