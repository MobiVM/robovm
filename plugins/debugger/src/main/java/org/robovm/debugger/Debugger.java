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
package org.robovm.debugger;

import org.robovm.debugger.delegates.AllDelegates;
import org.robovm.debugger.hooks.HooksChannel;
import org.robovm.debugger.hooks.IHooksApi;
import org.robovm.debugger.hooks.IHooksConnection;
import org.robovm.debugger.hooks.IHooksEventsHandler;
import org.robovm.debugger.hooks.payloads.HooksEventPayload;
import org.robovm.debugger.jdwp.IJdwpServerApi;
import org.robovm.debugger.jdwp.IJdwpServerDelegate;
import org.robovm.debugger.jdwp.JdwpDebugServer;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.DebuggerThread;
import org.robovm.debugger.utils.IHooksConnectionUtils;

import java.io.File;
import java.util.concurrent.ExecutionException;

/**
 * @author  Demyan Kimitsa
 * Main debugger logic class
 * TODO: this file got big and need to be sliced into several delegates
 */
public class Debugger implements DebuggerThread.Catcher, IHooksEventsHandler, IJdwpServerDelegate {
    private final DbgLogger log;

    /**
     * callback to be called when process termination detected on debugger side, used to notify other parties
     * */
    private Runnable onTerminated = null;

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
        File logFile = config.logDir() != null ? new File(config.logDir(), "debugger"+System.currentTimeMillis() + ".log") : null;
        DbgLogger.setup(logFile, config.logToConsole());

        // can now create log as logger is initialized
        this.log = DbgLogger.get(this.getClass().getSimpleName());

        // save references
        this.config = config;
        this.state = new VmDebuggerState(config.appfile(), config.arch());
        this.delegates = new AllDelegates(this, state);

        this.jdwpServer = new JdwpDebugServer(delegates, this, config.jdwpClienMode(), config.jdwpPort()) ;
        this.hooksChannel = new HooksChannel(delegates, !config.arch().is32Bit(), this);
    }


    public void start(Runnable onTerminated, IHooksConnection connection) {
        this.onTerminated = onTerminated;

        // start JDWP server
        this.jdwpServer.start();

        // start hooks channel
        this.hooksChannel.start(connection);
    }

    private volatile boolean shuttingDown;
    public void shutdown() {
        // only one shutdown is allowed
        synchronized (this) {
            if (shuttingDown)
                return;
            shuttingDown = true;
        }

        delegates.shutdown();

        // shutdown JDWP and hooks
        jdwpServer.shutdown();
        hooksChannel.shutdown();

        // destroy process, otherwise it will stuck as running in Idea
        if (onTerminated != null)
            onTerminated.run();
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

    public static void main(String[] argv) throws InterruptedException, ExecutionException {
        DebuggerConfig config = DebuggerConfig.fromCommandLine(argv);
        Debugger debugger = new Debugger(config);
        int hookPort = config.getPortNumberPromise().get();
        debugger.start(() -> System.exit(-1), new IHooksConnectionUtils.SocketHooksConnection(hookPort));

        // as all threads are daemon now
        Thread.sleep(Long.MAX_VALUE);
    }
}
