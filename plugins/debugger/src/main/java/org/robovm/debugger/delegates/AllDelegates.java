package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.IJdwpEventDelegate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventPredicate;
import org.robovm.debugger.hooks.IHooksApi;
import org.robovm.debugger.jdwp.IJdwpServerApi;
import org.robovm.debugger.jdwp.handlers.array.IJdwpArrayDelegate;
import org.robovm.debugger.jdwp.handlers.thread.IJdwpThreadDelegate;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.DebuggerThread;
import org.robovm.debugger.utils.IDebuggerToolbox;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

import java.util.List;

/**
 * @author Demyan Kimitsa
 * keeps all delegate in one place and implements all their interfaces
 * also provides lock protection of data
 */
public class AllDelegates implements IJdwpEventDelegate, IJdwpArrayDelegate, IDebuggerToolbox, IJdwpThreadDelegate {

    private final DbgLogger log = DbgLogger.get("Delegates");

    /**
     * toolbox full of tools
     */
    private final DebuggerToolBox toolBox;

    /**
     * debugger state
     */
    private final VmDebuggerState state;

    /**
     * interface to hooks event processor and JDPW event request handler
     */
    private JdwpEventCenterDelegate events;

    /**
     * interface to JDPW array API implementation
     */
    private JdwpArrayDelegate arrays;

    /**
     * interface to thread delegates
     */
    private ThreadDelegate threads;

    /**
     * API to JDWPServer set once JDWP handshake complete used if not set lot of activities will not happen
     */
    private IJdwpServerApi jdwpServerApi;

    /**
     * API to hooks.c once connection with device is established, set once connection with target is established
     */
    private IHooksApi hooksApi;

    /**
     * Runtime utils
     */
    RuntimeUtils runtime;

    public AllDelegates(DebuggerThread.Catcher catcher, VmDebuggerState state) {
        this.toolBox = new DebuggerToolBox(catcher);
        this.state = state;
        this.threads = new ThreadDelegate(this);
    }

    public void onConnectedToTarget(IHooksApi api, long runtimeMemoryOffset) {
        this.hooksApi = api;
        this.runtime = new RuntimeUtils(this, runtimeMemoryOffset);

        // ping event center that is attached to start picking data
        events.onConnectedToTarget();
    }

    public void onConnectedToJdwp(IJdwpServerApi api) {
        jdwpServerApi = api;
    }

    public void shutdown() {
        // everything is going to hell
        // forward to delegates
        toolBox.shutdown();
    }


    public DbgLogger log() {
        return log;
    }

    public DebuggerToolBox toolBox() {
        return toolBox;
    }

    public JdwpEventCenterDelegate events() {
        return events;
    }

    public VmDebuggerState state() {
        return state;
    }

    public JdwpArrayDelegate arrays() {
        return arrays;
    }

    public IJdwpServerApi jdwpServerApi() {
        return jdwpServerApi;
    }

    public IHooksApi hooksApi() {
        return hooksApi;
    }

    public RuntimeUtils runtime() {
        return runtime;
    }

    public ThreadDelegate threads() {
        return threads;
    }

    //
    // JDWP event delegates
    //
    @Override
    public int jdwpSetEventRequest(byte eventKind, byte suspendPolicy, List<EventPredicate> predicates) {
        synchronized (state.centralLock()) {
            return events.jdwpSetEventRequest(eventKind, suspendPolicy, predicates);
        }
    }

    @Override
    public short jdwpClearEventRequest(byte eventKind, int requestID) {
        synchronized (state.centralLock()) {
            return events.jdwpClearEventRequest(eventKind, requestID);
        }
    }

    @Override
    public void jdwpClearAllBreakpoints() {
        synchronized (state.centralLock()) {
            events.jdwpClearAllBreakpoints();
        }
    }


    //
    // JDWP array delegates
    //
    @Override
    public int jdwpArrayLength(long arrayId) throws DebuggerException {
        synchronized (state.centralLock()) {
            return arrays.jdwpArrayLength(arrayId);
        }
    }

    @Override
    public void jdwpArrayGetValue(long arrayId, int index, int length, ByteBufferPacket writer) throws DebuggerException {
        synchronized (state.centralLock()) {
            arrays.jdwpArrayGetValue(arrayId, index, length, writer);
        }
    }

    @Override
    public void jdwpArraySetValue(long arrayId, int index, int length, ByteBufferReader reader) throws DebuggerException {
        synchronized (state.centralLock()) {
            arrays.jdwpArraySetValue(arrayId, index, length, reader);
        }
    }


    //
    // JDWP threads delegate
    //


    @Override
    public void jdwpSuspendThread(long threadId) throws DebuggerException {
        synchronized (state.centralLock()) {
            threads.jdwpSuspendThread(threadId);
        }
    }

    @Override
    public void jdwpResumeThread(long threadId) throws DebuggerException {
        synchronized (state.centralLock()) {
            threads.jdwpResumeThread(threadId);
        }
    }

    //
    // Debugger toolbox implementation
    //
    @Override
    public Thread createThread(Runnable r, String name) {
        return toolBox.createThread(r, name);
    }
}
