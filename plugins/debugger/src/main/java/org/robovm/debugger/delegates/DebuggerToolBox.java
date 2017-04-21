package org.robovm.debugger.delegates;

import org.robovm.debugger.utils.DebuggerThread;
import org.robovm.debugger.utils.IDebuggerToolbox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Demyan Kimitsa
 * implements toolbox interface that provides common primitives and functionalities
 */
public class DebuggerToolBox implements IDebuggerToolbox {

    /**
     * list of threads associated with debugger
     */
    private List<DebuggerThread> debuggerThreads = new ArrayList<>();

    /**
     * catcher to receive notification about thread failure
     */
    private final DebuggerThread.Catcher catcher;

    public DebuggerToolBox(DebuggerThread.Catcher catcher) {
        this.catcher = catcher;
    }

    /**
     * Toolbox method to create customized thread
     * @param r runnable to run in thread
     * @param name to give to thread
     * @return custom thread
     */
    @Override
    public Thread createThread(Runnable r, String name) {
        // return debugger thread to catch exceptions
        DebuggerThread thread = new DebuggerThread(catcher, r, name);

        // also remember all threads to be able to shutdown these if required
        debuggerThreads.add(thread);

        return thread;
    }

    public void shutdown() {
        // stop all threads
        for (DebuggerThread t : debuggerThreads) {
            t.interrupt();
            try {
                t.join(500);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
