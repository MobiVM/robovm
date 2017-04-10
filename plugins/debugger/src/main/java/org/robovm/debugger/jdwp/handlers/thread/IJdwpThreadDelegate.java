package org.robovm.debugger.jdwp.handlers.thread;

import org.robovm.debugger.DebuggerException;

/**
 * @author Demyan Kimitsa
 * delegate to provide api to Thread related activities
 */
public interface IJdwpThreadDelegate {
    void jdwpSuspendThread(long threadId) throws DebuggerException;
    void jdwpResumeThread(long threadId) throws DebuggerException;
    void jdwpSuspendAllThreads();
    void jdwpResumeAllThreads();
}
