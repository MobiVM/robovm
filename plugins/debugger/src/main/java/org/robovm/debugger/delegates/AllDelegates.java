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
import org.robovm.debugger.hooks.IHooksApi;
import org.robovm.debugger.jdwp.IJdwpServerApi;
import org.robovm.debugger.jdwp.handlers.array.IJdwpArrayDelegate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.IJdwpEventDelegate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventPredicate;
import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;
import org.robovm.debugger.jdwp.handlers.stackframe.IJdwpStackFrameDelegate;
import org.robovm.debugger.jdwp.handlers.thread.IJdwpThreadDelegate;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmClassInstance;
import org.robovm.debugger.state.instances.VmStringInstance;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.DebuggerThread;
import org.robovm.debugger.utils.IDebuggerToolbox;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferReaderWriter;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;
import org.robovm.debugger.utils.bytebuffer.DataByteBufferWriter;

import java.nio.ByteOrder;
import java.util.List;

/**
 * @author Demyan Kimitsa
 * keeps all delegate in one place and implements all their interfaces
 * also provides lock protection of data
 */
public class AllDelegates implements IJdwpEventDelegate, IJdwpArrayDelegate, IDebuggerToolbox, IJdwpThreadDelegate,
        IJdwpInstanceDelegate, IJdwpStackFrameDelegate {

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
    private final JdwpEventCenterDelegate events;

    /**
     * interface to JDPW array API implementation
     */
    private JdwpArrayDelegate arrays;

    /**
     * interface to thread delegates
     */
    private final ThreadDelegate threads;

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
    private RuntimeUtils runtime;

    /**
     * Shared byte buffer packet that can be used for operations with target once central lock is taken
     */
    private final DataBufferReaderWriter sharedTargetPacket;

    /**
     * Instance operation delegate
     */
    private InstanceUtils instances;

    /**
     * delegate that handles stack frame operations
     */
    private StackFrameDelegate stackframes;

    public AllDelegates(DebuggerThread.Catcher catcher, VmDebuggerState state) {
        this.toolBox = new DebuggerToolBox(catcher);
        this.state = state;
        this.threads = new ThreadDelegate(this);
        this.sharedTargetPacket = new DataByteBufferWriter(state.isTarget64bit());
        this.sharedTargetPacket.setByteOrder(ByteOrder.LITTLE_ENDIAN); // targets are little endian
        this.events = new JdwpEventCenterDelegate(this);
    }

    public void onConnectedToTarget(IHooksApi api, long runtimeMemoryOffset) {
        synchronized (state.centralLock()) {
            this.hooksApi = api;
            this.runtime = new RuntimeUtils(this, runtimeMemoryOffset);
            this.instances = new InstanceUtils(this);
            this.stackframes = new StackFrameDelegate(this);
            this.arrays = new JdwpArrayDelegate(this);

            // ping event center that is attached to start picking data
            events.onConnectedToTarget();
        }
    }

    public void onConnectedToJdwp(IJdwpServerApi api) {
        synchronized (state.centralLock()) {
            jdwpServerApi = api;

            // ping event center that there is a connection to JDWP
            events.onConnectedToJdpw();
        }
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

    public InstanceUtils instances() {
        return instances;
    }

    public StackFrameDelegate stackframes() {
        return stackframes;
    }

    public DataBufferReaderWriter sharedTargetPacket() {
        return sharedTargetPacket;
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

    /**
     * stops sending events to JDPW but keeps buffering them
     */
    @Override
    public void jdwpHoldEvents() {
        synchronized (state.centralLock()) {
            events.jdwpHoldEvents();
        }
    }

    /**
     * resumes sending of all events -- also sends buffered events
     */
    @Override
    public void jdwpReleaseEvents() {
        synchronized (state.centralLock()) {
            events.jdwpReleaseEvents();
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
    public void jdwpArrayGetValue(long arrayId, int index, int length, DataBufferWriter writer) throws DebuggerException {
        synchronized (state.centralLock()) {
            arrays.jdwpArrayGetValue(arrayId, index, length, writer);
        }
    }

    @Override
    public void jdwpArraySetValue(long arrayId, int index, int length, DataBufferReader reader) throws DebuggerException {
        synchronized (state.centralLock()) {
            arrays.jdwpArraySetValue(arrayId, index, length, reader);
        }
    }

    /**
     * creates new instance of array
     *
     * @param arrayTypeId -- type of array to create
     * @param length      -- number of elements to create
     * @return instance id of new array
     */
    @Override
    public long jdwpArrayCreateInstance(long arrayTypeId, int length) {
        synchronized (state.centralLock()) {
            return arrays.jdwpArrayCreateInstance(arrayTypeId, length);
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


    @Override
    public void jdwpSuspendAllThreads() {
        synchronized (state.centralLock()) {
            threads.jdwpSuspendAllThreads();
        }
    }

    @Override
    public void jdwpResumeAllThreads() {
        synchronized (state.centralLock()) {
            threads.jdwpResumeAllThreads();
        }
    }


    //
    // JDPW instance delegate
    //
    @Override
    public VmStringInstance jdwpCreateStringInstance(String value) {
        synchronized (state.centralLock()) {
            return instances.createVmStringInstance(value);
        }
    }

    @Override
    public String jdwpGetStringValue(long stringRefId) {
        synchronized (state.centralLock()) {
            return instances.readStringValue(stringRefId);
        }
    }

    @Override
    public void jdwpFieldGetValues(long objectId, long[] fields, boolean isStatic, DataBufferWriter output) {
        synchronized (state.centralLock()) {
            instances.jdwpFieldGetValues(objectId, fields, isStatic, output);
        }
    }

    @Override
    public void jdwpFieldSetValues(long objectId, int fieldsCount, boolean isStatic, DataBufferReader payload) {
        synchronized (state.centralLock()) {
            instances.jdwpFieldSetValues(objectId, fieldsCount, isStatic, payload);
        }
    }

    @Override
    public VmClassInstance jdwpGetClazzObject(long objectId) throws DebuggerException {
        synchronized (state.centralLock()) {
            return instances.getClazzObject(objectId);
        }
    }

    @Override
    public void jdwpInvokeMethod(long objectOrClassId, long threadId, long methodId, boolean isStatic,
                                 boolean singleThread, Object[] args, DataBufferWriter output) {
        synchronized (state.centralLock()) {
            instances.jdwpInvokeMethod(objectOrClassId, threadId, methodId, isStatic, singleThread,  args, output);
        }
    }

    //
    // Stack Frame delegate implementation
    //
    @Override
    public void getFrameValues(long threadId, long frameId, int[] varIndexes, byte[] varTags, DataBufferWriter output) {
        synchronized (state.centralLock()) {
            stackframes.getFrameValues(threadId, frameId, varIndexes, varTags, output);
        }
    }

    @Override
    public void setFrameValues(long threadId, long frameId, DataBufferReader payload, int count) {
        synchronized (state.centralLock()) {
            stackframes.setFrameValues(threadId, frameId, payload, count);
        }
    }

    @Override
    public void getFrameVariable(long threadId, long frameId, String variableName, DataBufferWriter output) {
        synchronized (state.centralLock()) {
            stackframes.getFrameVariable(threadId, frameId, variableName, output);
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
