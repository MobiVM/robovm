/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

    /** flag that hooks was moved forward from hand break */
    private boolean vmResumed;

    public ThreadDelegate(AllDelegates delegates) {
        this.delegates = delegates;
    }

    @Override
    public void jdwpSuspendThread(long threadId) throws DebuggerException {
        VmThread thread = getThread(threadId);
        if (thread == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
        suspendThread(thread);
    }

    public void suspendThread(VmThread thread) throws DebuggerException {
        // suspend only if suspend count was 0 (after call it is 1)
        int suspendCount = thread.markSuspended();
        if (suspendCount == 1) {
            delegates.hooksApi().threadSuspend(thread.threadPtr());
            thread.setStatus(VmThread.Status.SUSPENDED);
        }
    }

    @Override
    public void jdwpResumeThread(long threadId) throws DebuggerException {
        VmThread thread = getThread(threadId);
        resumeThread(thread);
    }

    public void resumeThread(VmThread thread) throws DebuggerException {
        // resume if suspend count now is zero
        int suspendCount = thread.suspendCount();
        thread.markResumed();
        if (suspendCount == 1) {
            // before resume try resume stepping if it was active
            delegates.events().restepBeforeResume(thread);

            delegates.hooksApi().threadResume(thread.threadPtr());
            thread.setStatus(VmThread.Status.RUNNING);
            setThreadStack(thread, null);
        }
    }


    @Override
    public void jdwpSuspendAllThreads() {
        for (VmThread thread : delegates.state().threads())
            suspendThread(thread);
    }

    @Override
    public void jdwpResumeAllThreads() {
        if (!vmResumed) {
            vmResumed = true;
            // tell hooks that we can start
            delegates.hooksApi().threadResume(0);
        }

        for (VmThread thread : delegates.state().threads())
            resumeThread(thread);
    }

    /**
     * called once thread is suspended (as notification from hooks)
     * @param thread object
     * @param stack call stack
     * @param keepSuspended if true thread will be moved to suspended in state.
     *                      otherwise if suspend is not expected -- thread will be release in target
     */
    public void onThreadSuspended(VmThread thread, VmStackTrace[] stack, boolean keepSuspended) {
        if (keepSuspended) {
            setThreadStack(thread, stack);
            thread.markSuspended();
            thread.setStatus(VmThread.Status.SUSPENDED);
        } else {
            if (thread.suspendCount() == 0) {
                // thread is not suspended and this event is filtered out, so resume thread
                delegates.hooksApi().threadResume(thread.threadPtr());
            } else {
                // update thread stack, don't touch anything else
                setThreadStack(thread, stack);
            }
        }

        // mark as suspended
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

    public void resumeAllOtherThreads(VmThread stoppedThread) {
        for (VmThread thread : delegates.state().threads()) {
            if (thread != stoppedThread)
                resumeThread(thread);
        }
    }

    /**
     * @return any suspended thread to perform newInstance operations within
     */
    public VmThread anySuspendedThread() {
        for (VmThread thread : delegates.state().threads()) {
            if (thread.status() == VmThread.Status.SUSPENDED)
                return thread;
        }
        return null;
    }

    /**
     * @return true if VMResume has been performed
     */
    public boolean isVmResumed() {
        return vmResumed;
    }
}
