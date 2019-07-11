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
    private final DbgLogger log;

    /**
     * reference to process this debug session is working on. in case of debugger crash will terminate process as well
     */
    private final Process process;

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


    public Debugger(Process process, DebuggerConfig config) {
        // setup logger
        File logFile = config.logDir() != null ? new File(config.logDir(), "debugger"+System.currentTimeMillis() + ".log") : null;
        DbgLogger.setup(logFile, config.logToConsole());

        // can now create log as logger is initialized
        this.log = DbgLogger.get(this.getClass().getSimpleName());

        // save references
        this.process = process;
        this.config = config;
        this.state = new VmDebuggerState(config.appfile(), config.arch());
        this.delegates = new AllDelegates(this, state);

        this.jdwpServer = new JdwpDebugServer(delegates, this, config.jdwpClienMode(), config.jdwpPort()) ;
        this.hooksChannel = new HooksChannel(delegates, !config.arch().is32Bit(), config.hooksConnection(), this);

    }


    public void start() {
        // start JDWP server
        this.jdwpServer.start();

        // start hoocks channel
        this.hooksChannel.start();
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

        // if it is standalone run -- terminate app
        if (config.isStandalone())
            System.exit(-1);

        // destroy process, otherwise it will stuck as running in Idea
        if (process != null && process.isAlive())
            process.destroy();
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
        Debugger debugger = new Debugger(null, config);
        debugger.start();

        // as all threads are daemon now
        Thread.sleep(Long.MAX_VALUE);
    }
}
