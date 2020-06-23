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
package org.robovm.debugger.jdwp;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.delegates.AllDelegates;
import org.robovm.debugger.jdwp.handlers.array.JdwpArrayGetLength;
import org.robovm.debugger.jdwp.handlers.array.JdwpArrayGetValues;
import org.robovm.debugger.jdwp.handlers.array.JdwpArraySetValues;
import org.robovm.debugger.jdwp.handlers.arraytype.JdwpArrayTypeNewInstanceHandler;
import org.robovm.debugger.jdwp.handlers.classobjectreference.JdwpClassObjRefReflectedTypeHandler;
import org.robovm.debugger.jdwp.handlers.classtype.JdwpClassTypeInvokeMethodHandler;
import org.robovm.debugger.jdwp.handlers.classtype.JdwpClassTypeNewInstanceHandler;
import org.robovm.debugger.jdwp.handlers.classtype.JdwpClassTypeSetValuesHandler;
import org.robovm.debugger.jdwp.handlers.classtype.JdwpClassTypeSuperclassHandler;
import org.robovm.debugger.jdwp.handlers.eventrequest.JdwpEventReqClearAllBreakpointsHandler;
import org.robovm.debugger.jdwp.handlers.eventrequest.JdwpEventReqClearHandler;
import org.robovm.debugger.jdwp.handlers.eventrequest.JdwpEventReqSetHandler;
import org.robovm.debugger.jdwp.handlers.method.JdwpMethodLineTableHandler;
import org.robovm.debugger.jdwp.handlers.method.JdwpMethodVariableTableHandler;
import org.robovm.debugger.jdwp.handlers.method.JdwpMethodVariableTableWithGenericsHandler;
import org.robovm.debugger.jdwp.handlers.objectreference.JdwpObjRefDisableCollectionHandler;
import org.robovm.debugger.jdwp.handlers.objectreference.JdwpObjRefEnableCollectionHandler;
import org.robovm.debugger.jdwp.handlers.objectreference.JdwpObjRefGetValuesHandler;
import org.robovm.debugger.jdwp.handlers.objectreference.JdwpObjRefInvokeMethodHandler;
import org.robovm.debugger.jdwp.handlers.objectreference.JdwpObjRefIsCollectedHandler;
import org.robovm.debugger.jdwp.handlers.objectreference.JdwpObjRefReferenceTypeHandler;
import org.robovm.debugger.jdwp.handlers.objectreference.JdwpObjRefSetValuesHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeClassFileVersionHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeClassLoaderHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeClassObjectHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeFieldsHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeFieldsWithGenericHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeGetValuesHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeInterfacesHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeMethodsHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeMethodsWithGenericHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeModifiersHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeNestedTypesHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeSignatureHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeSignatureWithGenericHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeSourceFileHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRefTypeStatusHandler;
import org.robovm.debugger.jdwp.handlers.stackframe.JdwpStackFrameGetValuesHandler;
import org.robovm.debugger.jdwp.handlers.stackframe.JdwpStackFrameSetValuesHandler;
import org.robovm.debugger.jdwp.handlers.stackframe.JdwpStackFrameThisObjectHandler;
import org.robovm.debugger.jdwp.handlers.string.JdwpStringGetValueHandler;
import org.robovm.debugger.jdwp.handlers.thread.JdwpThreadFramesCountHandler;
import org.robovm.debugger.jdwp.handlers.thread.JdwpThreadFramesHandler;
import org.robovm.debugger.jdwp.handlers.thread.JdwpThreadGetNameHandler;
import org.robovm.debugger.jdwp.handlers.thread.JdwpThreadResumeHandler;
import org.robovm.debugger.jdwp.handlers.thread.JdwpThreadStatusHandler;
import org.robovm.debugger.jdwp.handlers.thread.JdwpThreadSuspendCountHandler;
import org.robovm.debugger.jdwp.handlers.thread.JdwpThreadSuspendHandler;
import org.robovm.debugger.jdwp.handlers.thread.JdwpThreadThreadGroupHandler;
import org.robovm.debugger.jdwp.handlers.threadgroup.JdwpThreadGroupChildrenHandler;
import org.robovm.debugger.jdwp.handlers.threadgroup.JdwpThreadGroupNameHandler;
import org.robovm.debugger.jdwp.handlers.threadgroup.JdwpThreadGroupParentHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmAllClassesHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmAllClassesWithGenericsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmAllThreadsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmCapabilitiesHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmCapabilitiesNewHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmClassPathsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmClassesBySignatureHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmCreateStringHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmDisposeHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmDisposeObjectsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmExitHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmHoldEventsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmIdSizesHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmReleaseEventsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmResumeHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmSuspendHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmTopLevelThreadGroupsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmVersionHandler;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.jdwp.protocol.JdwpRequestHeader;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferReaderWriter;
import org.robovm.debugger.utils.bytebuffer.DataByteBufferWriter;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * JDWP server implementation
 */
public class JdwpDebugServer implements IJdwpServerApi{
    private final DbgLogger log = DbgLogger.get(this.getClass().getSimpleName());
    private static final String JDWP_HANDSHAKE = "JDWP-Handshake";
    private final Thread socketThread;
    private final boolean jdwpClientMode;
    private final int jdwpPort;
    private Socket socket;
    private final Map<Integer, IJdwpRequestHandler> handlers = new HashMap<>();
    private final DataBufferReaderWriter headerBuffer;
    private final IJdwpServerDelegate delegate;
    private final AllDelegates delegates;
    private int eventRequestSerial = 0x10000000;


    public JdwpDebugServer(AllDelegates delegates, IJdwpServerDelegate delegate, boolean jdwpClienMode, int jdwpPort) {
        this.delegates = delegates;
        this.delegate = delegate;
        this.jdwpClientMode = jdwpClienMode;
        this.jdwpPort = jdwpPort;

        socketThread = delegates.createThread(this::doSocketWork, "JDWP server socket thread");
        headerBuffer = new DataByteBufferWriter();
        headerBuffer.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    public void start() {
        registerHandlers();

        socketThread.start();
    }

    public void shutdown() {
        // don't bother about thread as it is already killed in debugger
        if (socket != null && !socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException ignored) {
            }
        }
    }

    private void doSocketWork() {
        // establish connection
        try {
            socket = establishConnection();
            if (socket == null) // interrupted
                return;

            InputStream inputStream = socket.getInputStream();

            JdwpRequestHeader header = new JdwpRequestHeader();
            DataBufferReaderWriter packet = new DataByteBufferWriter();
            DataBufferReaderWriter outPacket = new DataByteBufferWriter();
            // and data sent via JDWP should be in big-endian format.
            packet.setByteOrder(ByteOrder.BIG_ENDIAN);


            // receive handshake
            packet.writeFromStream(inputStream, JDWP_HANDSHAKE.length());
            packet.setPosition(0);
            String handshake = packet.readString();
            if (!JDWP_HANDSHAKE.equals(handshake)) {
                // handshake failed
                throw new DebuggerException("Unexpected JDWP handshake");
            }
            // send it back
            packet.dumpToOutputStream(socket.getOutputStream());

            // notify delegate
            delegate.onJdwpHandshakeComplete(this);

            // run JDPW packet cycle
            while (!Thread.interrupted()) {
                header.readFromStream(inputStream, packet);

                // read payload if any
                packet.reset();
                if (header.payloadSize() != 0) {
                    packet.writeFromStream(inputStream, header.payloadSize());
                    packet.resetReader();
                }

                // find handler
                IJdwpRequestHandler handler = handlers.get(makeHandlerKey(header.commandset, header.command));
                outPacket.reset();
                short errorCode;
                if (handler != null) {
                    log.debug("handling req: " + handler.toString());
                    errorCode = handler.handle(packet, outPacket);
                } else {
                    log.debug("unhanndled req: cmdset " + header.commandset + ", cmd " + header.command );
                    errorCode = JdwpConsts.Error.NOT_IMPLEMENTED;
                }

                // send response
                sendResponse(header.id, errorCode, outPacket);

                if (errorCode == JdwpConsts.Error.VM_DEAD) {
                    // it was exit command, terminate everything via exception
                    throw new DebuggerException("Terminating due exit command");
                }
            }
        } catch (IOException e) {
            throw new DebuggerException(e);
        }
    }


    private void sendResponse(int id, short errorCode, DataBufferReader payload) throws IOException {
        synchronized (socket) {
            headerBuffer.reset();
            headerBuffer.writeInt32(11 + payload.size());
            headerBuffer.writeInt32(id);
            headerBuffer.writeByte((byte) 0x80); // Reply packet
            headerBuffer.writeInt16(errorCode);

            headerBuffer.dumpToOutputStream(socket.getOutputStream());
            payload.dumpToOutputStream(socket.getOutputStream());
        }
    }

    @Override
    public void sendEvent(byte suspendPolicy, int eventsCount, DataBufferReader payload) {
        synchronized (socket) {
            headerBuffer.reset();
            headerBuffer.writeInt32(11 + 5 + payload.size());
            headerBuffer.writeInt32(eventRequestSerial++); // id
            headerBuffer.writeByte((byte) 0); // flags
            headerBuffer.writeByte((byte) 64); // composite set -- events
            headerBuffer.writeByte((byte) 100); // composite command

            headerBuffer.writeByte(suspendPolicy);
            headerBuffer.writeInt32(eventsCount);

            try {
                headerBuffer.dumpToOutputStream(socket.getOutputStream());
                payload.dumpToOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                throw new DebuggerException(e);
            }
        }
    }

    private Socket establishConnection() throws DebuggerException {
        Socket s = null;
        if (jdwpClientMode) {
            // connect to server
            while (!Thread.interrupted()) {
                try {
                    s = new Socket();
                    s.connect(new InetSocketAddress("127.0.0.1", jdwpPort), 200);
                    break;
                } catch (IOException e) {
                    // timeout
                    s = null;
                }
            }
        } else {
            // listen for connection
            ServerSocket serverSocket;
            try {
                serverSocket = new ServerSocket(jdwpPort);
            } catch (IOException e) {
                throw new DebuggerException("Unable to bind JDWP port " + jdwpPort, e);
            }

            try {
                serverSocket.setSoTimeout(200);
            } catch (SocketException e) {
                throw new DebuggerException("Failed setup server socket connection", e);
            }

            while (!Thread.interrupted()) {
                try {
                    s = serverSocket.accept();
                    break;
                } catch (IOException ignored) {
                }
            }
        }

        // interrupt or connected
        if (s == null) {
            // thread is interrupted
            log.debug("Interrupted while establishing JDWP connection");
        }

        return s;
    }


    private Integer makeHandlerKey(byte commandset, byte command) {
        return commandset * 256 + command;
    }


    private void registerHandler(IJdwpRequestHandler handler) {
        Integer key = makeHandlerKey(handler.getCommandSet(), handler.getCommand());
        if (handlers.containsKey(key))
            throw new RuntimeException("Internal error: specified JDWP handler key already registered");
        handlers.put(key, handler);
    }

    private void registerHandlers() {
        VmDebuggerState state = delegates.state();

        //
        // VirtualMachine Command Set (1)
        //
        registerHandler(new JdwpVmVersionHandler()); // 1
        registerHandler(new JdwpVmClassesBySignatureHandler(state)); // 2
        registerHandler(new JdwpVmAllClassesHandler(state)); // 3
        registerHandler(new JdwpVmAllThreadsHandler(state)); // AllThreads Command (4)
        registerHandler(new JdwpVmTopLevelThreadGroupsHandler(state)); // TopLevelThreadGroups Command (5)
        registerHandler(new JdwpVmDisposeHandler()); // 6
        registerHandler(new JdwpVmIdSizesHandler()); // 7
        registerHandler(new JdwpVmSuspendHandler(delegates)); // Suspend Command (8)
        registerHandler(new JdwpVmResumeHandler(delegates)); // Resume Command (9)
        registerHandler(new JdwpVmExitHandler());
        // Exit Command (10) -- NOT_IMPLEMENTED
        registerHandler(new JdwpVmCreateStringHandler(delegates));// CreateString Command (11)
        registerHandler(new JdwpVmCapabilitiesHandler()); // 12
        registerHandler(new JdwpVmClassPathsHandler()); // 13
        registerHandler(new JdwpVmDisposeObjectsHandler()); // 14
        registerHandler(new JdwpVmHoldEventsHandler(delegates)); // HoldEvents Command (15)
        registerHandler(new JdwpVmReleaseEventsHandler(delegates)); // ReleaseEvents Command (16)
        registerHandler(new JdwpVmCapabilitiesNewHandler()); // 17
        // RedefineClasses Command (18) -- NOT_IMPLEMENTED
        // SetDefaultStratum Command (19) -- NOT_IMPLEMENTED
        registerHandler(new JdwpVmAllClassesWithGenericsHandler(state)); // 20
        // InstanceCounts Command (21) -- NOT_IMPLEMENTED

        //
        // ReferenceType Command Set (2)
        //
        registerHandler(new JdwpRefTypeSignatureHandler(state)); // 1
        registerHandler(new JdwpRefTypeClassLoaderHandler()); // 2
        registerHandler(new JdwpRefTypeModifiersHandler(state)); // 3
        registerHandler(new JdwpRefTypeFieldsHandler(state)); // 4
        registerHandler(new JdwpRefTypeMethodsHandler(state)); // 5
        registerHandler(new JdwpRefTypeGetValuesHandler(delegates)); //GetValues (6)
        registerHandler(new JdwpRefTypeSourceFileHandler(state)); //SourceFile (7)
        registerHandler(new JdwpRefTypeNestedTypesHandler()); //NestedTypes (8) // TODO:
        registerHandler(new JdwpRefTypeStatusHandler(state)); //Status (9)
        registerHandler(new JdwpRefTypeInterfacesHandler(state)); //Interfaces (10)
        registerHandler(new JdwpRefTypeClassObjectHandler(delegates)); //ClassObject (11)
        //SourceDebugExtension (12) -- NOT_IMPLEMENTED           
        registerHandler(new JdwpRefTypeSignatureWithGenericHandler(state)); //SignatureWithGeneric (13)
        registerHandler(new JdwpRefTypeFieldsWithGenericHandler(state)); //FieldsWithGeneric (14)
        registerHandler(new JdwpRefTypeMethodsWithGenericHandler(state)); //MethodsWithGeneric (15)
        //Instances (16) -- NOT_IMPLEMENTED
        registerHandler(new JdwpRefTypeClassFileVersionHandler(state)); //ClassFileVersion (17)
        //ConstantPool (18) -- NOT_IMPLEMENTED

        //
        // ClassType Command Set (3)
        //
        registerHandler(new JdwpClassTypeSuperclassHandler(state)); // Superclass (1)
        registerHandler(new JdwpClassTypeSetValuesHandler(delegates)); // SetValues (2)
        registerHandler(new JdwpClassTypeInvokeMethodHandler(delegates)); // InvokeMethod (3)
        registerHandler(new JdwpClassTypeNewInstanceHandler(delegates)); // NewInstance (4)

        //
        // ArrayType Command Set (4)
        //
        registerHandler(new JdwpArrayTypeNewInstanceHandler(delegates)); // NewInstance (1)

        // InterfaceType Command Set (5) -- EMPTY

        //
        // Method Command Set (6)
        //
        registerHandler(new JdwpMethodLineTableHandler(state)); // LineTable (1)
        registerHandler(new JdwpMethodVariableTableHandler(state)); // VariableTable (2)
        // Bytecodes (3) -- NOT_IMPLEMENTED
        // IsObsolete (4) -- NOT_IMPLEMENTED
        registerHandler(new JdwpMethodVariableTableWithGenericsHandler(state)); // VariableTableWithGeneric (5)

        // Field Command Set (8) -- EMPTY

        //
        // ObjectReference Command Set (9)
        //
        registerHandler(new JdwpObjRefReferenceTypeHandler(state)); // ReferenceType (1)
        registerHandler(new JdwpObjRefGetValuesHandler(delegates)); // GetValues (2)
        registerHandler(new JdwpObjRefSetValuesHandler(delegates)); // SetValues (3)
        //MonitorInfo (5) -- NOT_IMPLEMENTED
        registerHandler(new JdwpObjRefInvokeMethodHandler(delegates)); // InvokeMethod (6)
        registerHandler(new JdwpObjRefDisableCollectionHandler()); // DisableCollection (7)
        registerHandler(new JdwpObjRefEnableCollectionHandler()); // EnableCollection (8)
        registerHandler(new JdwpObjRefIsCollectedHandler(state)); // IsCollected (9)
        // ReferringObjects (10) -- NOT_IMPLEMENTED

        //
        // StringReference Command Set (10)
        //
        registerHandler(new JdwpStringGetValueHandler(delegates)); // Value (1)

        //
        // ThreadReference Command Set (11)
        //
        registerHandler(new JdwpThreadGetNameHandler(state)); // Name (1)
        registerHandler(new JdwpThreadSuspendHandler(delegates)); // Suspend (2)
        registerHandler(new JdwpThreadResumeHandler(delegates)); // Resume (3)
        registerHandler(new JdwpThreadStatusHandler(state)); // Status (4)
        registerHandler(new JdwpThreadThreadGroupHandler(state)); // ThreadGroup (5)
        registerHandler(new JdwpThreadFramesHandler(state)); // Frames (6)
        registerHandler(new JdwpThreadFramesCountHandler(state)); // FrameCount (7)
        // OwnedMonitors (8) -- NOT_IMPLEMENTED
        // CurrentContendedMonitor (9) -- NOT_IMPLEMENTED
        // Stop (10) -- NOT_IMPLEMENTED
        // Interrupt (11) -- NOT_IMPLEMENTED
        registerHandler(new JdwpThreadSuspendCountHandler(state)); // SuspendCount (12)
        // OwnedMonitorsStackDepthInfo (13) -- NOT_IMPLEMENTED
        // ForceEarlyReturn (14) -- NOT_IMPLEMENTED

        //
        // ThreadGroupReference Command Set (12)
        //
        registerHandler(new JdwpThreadGroupNameHandler(state)); // Name (1)
        registerHandler(new JdwpThreadGroupParentHandler(state)); // Parent (2)
        registerHandler(new JdwpThreadGroupChildrenHandler(state)); // Children (3)

        //
        // ArrayReference Command Set (13)
        //
        registerHandler(new JdwpArrayGetLength(delegates)); // Length (1)
        registerHandler(new JdwpArrayGetValues(delegates)); // GetValues (2)
        registerHandler(new JdwpArraySetValues(delegates)); // SetValues (3)

        //
        // ClassLoaderReference Command Set (14)
        //
        // VisibleClasses (1) // TODO:

        // EventRequest Command Set (15)
        registerHandler(new JdwpEventReqSetHandler(delegates));
        registerHandler(new JdwpEventReqClearHandler(delegates));
        registerHandler(new JdwpEventReqClearAllBreakpointsHandler(delegates));

        //
        // StackFrame Command Set (16)
        //
        registerHandler(new JdwpStackFrameGetValuesHandler(delegates)); // GetValues (1)
        registerHandler(new JdwpStackFrameSetValuesHandler(delegates)); // SetValues (2)
        registerHandler(new JdwpStackFrameThisObjectHandler(delegates));
        // PopFrames (4) -- NOT_IMPLEMENTED

        //
        // ClassObjectReference Command Set (17)
        registerHandler(new JdwpClassObjRefReflectedTypeHandler(state)); // ReflectedType (1)
    }
}
