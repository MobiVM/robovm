package org.robovm.debugger.utils;


/**
 * @author Demyan Kimitsa
 * Custom thread to track unhandled exception case to shutdown everything gracefuly
 */
public class DebuggerThread extends Thread {

    /** interface for listener for catch */
    public interface Catcher {
        void onException(Thread thread, Throwable t);
    }

    private final Catcher catcher;

    public DebuggerThread(Catcher catcher, Runnable target, String name) {
        super(target, name);
        this.catcher = catcher;
        // all threads are daemon to not block idea/eclipse exit
        this.setDaemon(true);
    }

    @Override
    public final void run() {
        try {
            super.run();
        } catch (Throwable t) {
            catcher.onException(this, t);
        }
    }
}
