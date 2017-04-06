package org.robovm.debugger;

import org.robovm.debugger.delegates.AllDelegates;
import org.robovm.debugger.hooks.HooksChannel;
import org.robovm.debugger.hooks.IHooksApi;
import org.robovm.debugger.hooks.IHooksEventsHandler;
import org.robovm.debugger.hooks.payloads.HooksEventPayload;
import org.robovm.debugger.jdwp.IJdwpServerApi;
import org.robovm.debugger.jdwp.IJdwpServerDelegate;
import org.robovm.debugger.jdwp.JdwpDebugServer;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.DebuggerThread;

import java.io.File;

/**
 * @author  Demyan Kimitsa
 * Main debugger logic class
 * TODO: this file got big and need to be sliced into several delegates
 */
public class Debugger implements DebuggerThread.Catcher, IHooksEventsHandler, IJdwpServerDelegate {
    private final DbgLogger log = DbgLogger.get(this.getClass().getSimpleName());

    /**
     * config debugger was started with
     */
    private final DebuggerConfig config;

    /**
     * all delegates and logic in one place
     */
    private final AllDelegates delegates;


    /**
     * debugger state
     */
    private final VmDebuggerState state;

    /**
     * debugger state
     */
    private final JdwpDebugServer jdwpServer;

    /**
     * interface to target device/simulator
     */
    private final HooksChannel hooksChannel;


    public Debugger(DebuggerConfig config) {
        // setup logger
        if (config.logDir() != null) {
            DbgLogger.setup(new File(config.logDir(), "debugger"+System.currentTimeMillis() + ".log"), config.logToConsole());
        }

        // save references
        this.config = config;
        this.state = new VmDebuggerState(config.appfile(), config.arch());
        this.delegates = new AllDelegates(this, state);

        this.jdwpServer = new JdwpDebugServer(delegates, this, config.jdwpClienMode(), config.jdwpPort()) ;
        if (config.hooksPortFile() != null)
            this.hooksChannel = new HooksChannel(delegates, !config.arch().is32Bit(), config.hooksPortFile(), this);
        else
            this.hooksChannel = new HooksChannel(delegates, !config.arch().is32Bit(), config.hooksPort(), this);

    }


    public void start() {
        // start JDWP server
        this.jdwpServer.start();

        // start hoocks channel
        this.hooksChannel.start();
    }

    public void shutdown() {
        delegates.shutdown();

        // shutdown JDWP and hooks
        jdwpServer.shutdown();
        hooksChannel.shutdown();
    }

    @Override
    public void onJdwpHandshakeComplete(IJdwpServerApi api) {
        delegates.onConnectedToJdwp(api);
    }

    @Override
    public void onHooksTargetAttached(IHooksApi api, long robovmBaseSymbol) {
        // calculate runtime to mach-o memory offset
        long robovmBaseSymbolMachO = state.appFileLoader().resolveSymbol("robovmBaseSymbol");
        long runtimeMemoryOffset = robovmBaseSymbol - robovmBaseSymbolMachO;

        delegates.onConnectedToTarget(api, runtimeMemoryOffset);
    }

    @Override
    public void onHooksTargetEvent(HooksEventPayload eventPayload) {
        // can't directly handle event payload here as callback is called from HooksChannel loop
        // as handling events often will cause sending message back to device which will cause
        // blocking of receiving thread on waiting for response
        delegates.events().postEventFromHooks(eventPayload);
    }


    @Override
    public void onException(Thread thread, Throwable t) {
        log.error("Thread " + thread.getName() + " crashed", t);
        shutdown();
    }

    public static void main(String[] argv) throws InterruptedException {
        DebuggerConfig config = DebuggerConfig.fromCommandLine(argv);
        Debugger debugger = new Debugger(config);
        debugger.start();

        // as all threads are daemon now
        Thread.sleep(Long.MAX_VALUE);
    }
}
