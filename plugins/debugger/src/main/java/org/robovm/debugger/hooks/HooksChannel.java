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
package org.robovm.debugger.hooks;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.hooks.payloads.HooksCallStackEntry;
import org.robovm.debugger.hooks.payloads.HooksClassLoadedEventPayload;
import org.robovm.debugger.hooks.payloads.HooksCmdResponse;
import org.robovm.debugger.hooks.payloads.HooksEventPayload;
import org.robovm.debugger.hooks.payloads.HooksThreadEventPayload;
import org.robovm.debugger.hooks.payloads.HooksThreadStoppedEventPayload;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.IDebuggerToolbox;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferReaderWriter;
import org.robovm.debugger.utils.bytebuffer.DataByteBufferWriter;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntSupplier;

/**
 * @author Demyan Kimitsa
 * Class implements itnerface to hooks server as it is implemented device side
 * Check hooks.c for reference
 */
public class HooksChannel implements IHooksApi {
    private final static int DEFAULT_TIMEOUT = 5000;
    private final Thread socketThread;
    private final boolean is64bit;
    private IHooksConnection hooksConnection;
    private long reqIdCounter = 100;
    private final Map<Long, HookReqHolder> requestsInProgress = new HashMap<>();
    private final DataBufferReaderWriter headerBuffer;
    private final IHooksEventsHandler eventsHandler;

    public HooksChannel(IDebuggerToolbox toolbox, boolean is64bit, IHooksConnection connection, IHooksEventsHandler eventsHandler) {
        this.hooksConnection = connection;
        this.is64bit = is64bit;
        this.eventsHandler = eventsHandler;
        this.socketThread = toolbox.createThread(this::doSocketWork, "HooksChannel socket thread");

        headerBuffer = new DataByteBufferWriter();
        headerBuffer.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    public void start() {
        this.socketThread.start();
    }

    public void shutdown() {
        // don't bother about thread as it is already killed in debugger
        if (hooksConnection != null) {
            try {
                hooksConnection.disconnect();
                hooksConnection = null;
            } catch (Throwable ignored) {
            }
        }
    }

    private void doSocketWork() {
        // establish connection
        try {
            hooksConnection.connect();
            InputStream inputStream = hooksConnection.getInputStream();
            OutputStream outputStream = hooksConnection.getOutputStream();

            // read handshake
            DataByteBufferWriter buffer = new DataByteBufferWriter(is64bit);
            buffer.setByteOrder(ByteOrder.BIG_ENDIAN);
            buffer.writeFromStream(inputStream, 8);
            buffer.setPosition(0);
            long handshake = buffer.readLong();
            if (handshake != HookConsts.handshake.QUESTION)
                throw new DebuggerException("Handshake failed!");
            // send handshake
            buffer.reset();
            buffer.writeLong(HookConsts.handshake.ANSWER);
            buffer.dumpToOutputStream(outputStream);

            // now read robovmBaseSymbol
            buffer.reset();
            buffer.writeFromStream(inputStream, 8);
            buffer.setPosition(0);
            long robovmBaseSymbol = buffer.readLong();

            // deliver callback that connected to device
            eventsHandler.onHooksTargetAttached(this, robovmBaseSymbol);

            // handshake complete, process messages
            while (!socketThread.isInterrupted()) {
                // read entire response header
                buffer.reset();
                buffer.writeFromStream(inputStream, 1 + 8 + 8);
                buffer.setPosition(0);
                byte cmd = buffer.readByte();
                long reqId = buffer.readLong();
                long payloadSize = buffer.readLong();
                // also pick up the payload
                buffer.reset();
                if (payloadSize != 0) {
                    buffer.writeFromStream(inputStream, (int) payloadSize);
                    buffer.resetReader();
                }

                if (reqId == 0) {
                    // looks to be event
                    if (!this.isEvent(cmd))
                        throw new DebuggerException("Non event response received with reqId == 0");

                    // lets create event
                    HooksEventPayload payload = createEventPayloadObject(cmd, buffer);
                    this.eventsHandler.onHooksTargetEvent(payload);
                } else {
                    // its response to request request
                    HookReqHolder holder = requestsInProgress.remove(reqId);
                    if (holder == null)
                        throw new DebuggerException("Unexpected response id " + reqId + ", cmd = " + cmd);

                    // notify thread that there is an result
                    HooksCmdResponse response = createCmdPayloadObject(cmd, buffer);
                    holder.setResponse(response);
                    holder.release();
                }
            }
        } catch (Throwable e) {
            throw new DebuggerException(e);
        }
    }


    private HooksCmdResponse sendCommand(byte cmd, DataBufferReader payload) {
        if (Thread.currentThread().getId() == socketThread.getId())
            throw new DebuggerException("Send command should not be invoked from response listening thread due blocking of last");

        // TODO: synchronizations to be done
        long reqId = reqIdCounter++;
        headerBuffer.reset();
        headerBuffer.writeByte(cmd);
        headerBuffer.writeLong(reqId);
        headerBuffer.writeLong(payload.size());
        headerBuffer.resetReader();
        payload.resetReader();

        HookReqHolder holder = new HookReqHolder(cmd);
        requestsInProgress.put(reqId, holder);

        try {
            OutputStream outputStream = hooksConnection.getOutputStream();
            headerBuffer.dumpToOutputStream(outputStream);
            payload.dumpToOutputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (!holder.aquire(DEFAULT_TIMEOUT))
                throw new DebuggerException("timeout performing req:" + reqId + "cmd " + cmd);

        } catch (InterruptedException e) {
            throw new DebuggerException(e);
        }

        return holder.response;
    }

    @Override
    public byte[] readMemory(long addr, int numBytes) {
//        log.debug("readMemory @" + Long.toHexString(addr) + ", " + numBytes);
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(addr);
        packet.writeInt32(numBytes);

        HooksCmdResponse resp = sendCommand(HookConsts.commands.READ_MEMORY, packet);
        return resp.result();
    }

    @Override
    public String readCString(long addr) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(addr);
        HooksCmdResponse resp = sendCommand(HookConsts.commands.READ_CSTRING, packet);
        return resp.result();
    }

    @Override
    public void writeMemory(long addr, byte[] data) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(addr);
        packet.writeInt32(data.length);
        packet.writeBytes(data);
        sendCommand(HookConsts.commands.WRITE_MEMORY, packet);
    }

    @Override
    public void writeMemory(long addr, DataBufferReader data) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(addr);
        packet.writeInt32(data.size());
        packet.writeFromReader(data.resetReader());
        sendCommand(HookConsts.commands.WRITE_MEMORY, packet);
    }

    @Override
    public void andBits(long addr, byte mask) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(addr);
        packet.writeByte(mask);
        sendCommand(HookConsts.commands.WRITE_AND_BITS, packet);
    }


    @Override
    public void orBits(long addr, byte mask) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(addr);
        packet.writeByte(mask);
        sendCommand(HookConsts.commands.WRITE_OR_BITS, packet);
    }

    @Override
    public long allocate(int numBytes) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeInt32(numBytes);
        HooksCmdResponse resp = sendCommand(HookConsts.commands.ALLOCATE, packet);
        return resp.result();
    }

    @Override
    public void free(long addr) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(addr);
        sendCommand(HookConsts.commands.FREE, packet);
    }

    @Override
    public void classFilter(boolean isSet, String className) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeByte((byte) (isSet ? -1 : 0));
        packet.writeStringWithLen(className);
        sendCommand(HookConsts.commands.CLASS_FILTER, packet);
    }

    @Override
    public void threadSuspend(long thread) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(thread);
        sendCommand(HookConsts.commands.THREAD_SUSPEND, packet);
    }

    @Override
    public void threadResume(long thread) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(thread);
        sendCommand(HookConsts.commands.THREAD_RESUME, packet);
    }

    @Override
    public void threadStep(long thread, long pcLow, long pcHigh, long pcLow2, long pcHigh2) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(thread);
        packet.writeLong(pcLow);
        packet.writeLong(pcHigh);
        packet.writeLong(pcLow2);
        packet.writeLong(pcHigh2);
        sendCommand(HookConsts.commands.THREAD_STEP, packet);
    }

    @Override
    public HooksCmdResponse threadInvoke(long thread, long classOrObjectPtr, String methodName, String descriptor,
                                         boolean isClassMethod, byte returnType, DataBufferReader arguments) {
        long argumentsPtr = 0;
        // if there are arguments -- allocate memory and write them there
        if (arguments != null) {
            argumentsPtr = allocate(arguments.size());
            writeMemory(argumentsPtr, arguments);
        }

        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(thread);
        packet.writeLong(classOrObjectPtr);
        packet.writeStringWithLen(methodName);
        packet.writeStringWithLen(descriptor);
        packet.writeBoolean(isClassMethod);
        packet.writeByte(returnType);
        packet.writeLong(argumentsPtr);
        HooksCmdResponse resp = sendCommand(HookConsts.commands.THREAD_INVOKE, packet);

        if (argumentsPtr != 0) {
            // release memory up from arguments
            free(argumentsPtr);
        }

        return resp;
    }

    @Override
    public HooksCmdResponse newInstance(long thread, long classOrObjectPtr, String methodName, String descriptor, DataBufferReader arguments) {
        long argumentsPtr = 0;
        // if there are arguments -- allocate memory and write them there
        if (arguments != null) {
            argumentsPtr = allocate(arguments.size());
            writeMemory(argumentsPtr, arguments);
        }

        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(thread);
        packet.writeLong(classOrObjectPtr);
        packet.writeStringWithLen(methodName);
        packet.writeStringWithLen(descriptor);
        packet.writeLong(argumentsPtr);
        HooksCmdResponse resp = sendCommand(HookConsts.commands.THREAD_NEWINSTANCE, packet);

        if (argumentsPtr != 0) {
            // release memory up from arguments
            free(argumentsPtr);
        }

        return resp;
    }

    @Override
    public HooksCmdResponse newString(long thread, String s) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(thread);
        byte[] bytes = s.getBytes();
        packet.writeInt32(bytes.length);
        packet.writeBytes(bytes);
        return sendCommand(HookConsts.commands.THREAD_NEWSTRING, packet);
    }

    @Override
    public HooksCmdResponse newArray(long thread, int arrayLength, String elementName) {
        DataBufferReaderWriter packet = new DataByteBufferWriter();
        packet.writeLong(thread);
        packet.writeInt32(arrayLength);
        byte[] bytes = elementName.getBytes();
        packet.writeInt32(bytes.length);
        packet.writeBytes(bytes);
        return sendCommand(HookConsts.commands.THREAD_NEWARRAY, packet);
    }


    private HooksCmdResponse createCmdPayloadObject(byte cmd, DataBufferReader reader) {
        HooksCmdResponse res = null;
        switch (cmd) {
            case HookConsts.commands.READ_MEMORY:
                res = new HooksCmdResponse(reader.readBytes());
                break;

            case HookConsts.commands.READ_CSTRING:
                res = new HooksCmdResponse(reader.readString());
                break;

            case HookConsts.commands.ALLOCATE:
                res = new HooksCmdResponse(reader.readLong());
                break;

            case HookConsts.commands.WRITE_MEMORY:
            case HookConsts.commands.WRITE_AND_BITS:
            case HookConsts.commands.WRITE_OR_BITS:
            case HookConsts.commands.FREE:
            case HookConsts.commands.THREAD_SUSPEND:
            case HookConsts.commands.THREAD_RESUME:
            case HookConsts.commands.THREAD_STEP:
            case HookConsts.commands.CLASS_FILTER:
                // these are not provides any data back
                break;

            case HookConsts.commands.THREAD_INVOKE:
            case HookConsts.commands.THREAD_NEWSTRING:
            case HookConsts.commands.THREAD_NEWARRAY:
            case HookConsts.commands.THREAD_NEWINSTANCE: {
                long resultPtr = reader.readLong();
                long throwable = reader.readLong();
                res = new HooksCmdResponse(resultPtr, throwable);
                break;
            }

            default:
                throw new DebuggerException("Unrecognized Hooks command " + cmd);
        }

        return res;
    }

    private HooksEventPayload createEventPayloadObject(byte event, DataBufferReader reader) {
        HooksEventPayload res;
        switch (event) {
            case HookConsts.events.THREAD_ATTACHED:
            case HookConsts.events.THREAD_STARTED:
            case HookConsts.events.THREAD_RESUMED: {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                res = new HooksThreadEventPayload(event, threadObj, thread);
                break;
            }

            case HookConsts.events.THREAD_DETTACHED: {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                long throwable = reader.readLong();
                res = new HooksThreadEventPayload(event, threadObj, thread, throwable);
                break;
            }

            case HookConsts.events.THREAD_SUSPENDED:
            case HookConsts.events.THREAD_STEPPED:
            case HookConsts.events.BREAKPOINT: {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                HooksCallStackEntry[] callStack = readCallStack(reader);
                res = new HooksThreadStoppedEventPayload(event, threadObj, thread, callStack);
                break;
            }

            case HookConsts.events.EXCEPTION: {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                long throwable = reader.readLong();
                boolean isCaught = reader.readByte() != 0;
                HooksCallStackEntry[] callStack = readCallStack(reader);
                res = new HooksThreadStoppedEventPayload(event, threadObj, thread, throwable, isCaught, callStack);
                break;
            }

            case HookConsts.events.CLASS_LOAD:
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                long clazz = reader.readLong();
                long classInfo = reader.readLong();
                HooksCallStackEntry[] callStack = null;
                if (reader.hasRemaining())
                    callStack = readCallStack(reader);
                res = new HooksClassLoadedEventPayload(event, threadObj, thread, clazz, classInfo, callStack);
                break;

            default:
                throw new DebuggerException("Unrecognized Hooks event " + event);
        }

        return res;
    }

    private HooksCallStackEntry[] readCallStack(DataBufferReader reader) {
        int count = reader.readInt32();
        HooksCallStackEntry[] res = new HooksCallStackEntry[count];
        for (int idx = 0; idx < count; idx++) {
            long impl = reader.readLong();
            int lineNumber = reader.readInt32();
            long fp = reader.readLong();
            long pc = reader.readLong();
            int clazzNameLen = reader.readInt32();
            String clazzName = reader.readString(clazzNameLen);
            res[idx] = new HooksCallStackEntry(clazzName, impl, lineNumber, fp, pc);
        }

        return res;
    }

    private boolean isEvent(byte cmd) {
        switch (cmd) {
            case HookConsts.events.THREAD_ATTACHED:
            case HookConsts.events.THREAD_STARTED:
            case HookConsts.events.THREAD_DETTACHED:
            case HookConsts.events.THREAD_SUSPENDED:
            case HookConsts.events.THREAD_RESUMED:
            case HookConsts.events.BREAKPOINT:
            case HookConsts.events.THREAD_STEPPED:
            case HookConsts.events.CLASS_LOAD:
            case HookConsts.events.EXCEPTION:
                return true;
        }

        return false;
    }


    /**
     * Connection for socket case (local host simulator)
     */
    public static class SocketHooksConnection implements IHooksConnection {
        private final IntSupplier hooksPortSupplier;
        private Socket socket;

        public SocketHooksConnection(IntSupplier hooksPortSupplier) {
            this.hooksPortSupplier = hooksPortSupplier;
        }

        @Override
        public void connect() throws IOException {
            int port = hooksPortSupplier.getAsInt();
            socket = new Socket();
            socket.connect(new InetSocketAddress("127.0.0.1", port), 1000);
            socket.setTcpNoDelay(true);
        }

        @Override
        public void disconnect() throws IOException {
            if (socket != null && socket.isClosed())
                socket.close();
        }

        @Override
        public InputStream getInputStream() throws IOException {
            return socket.getInputStream();
        }

        @Override
        public OutputStream getOutputStream() throws IOException {
            return socket.getOutputStream();
        }
    }

    public static void main(String[] argv) {
        int port;

        if ("-port".equals(argv[0])) {
            port = Integer.parseInt(argv[1]);
        } else if ("-file".equals(argv[0])) {
            try {
                File file = new File(argv[1]);
                while (!file.exists() || file.length() == 0) {
                    Thread.sleep(200);
                }
                port = Integer.parseInt(new String(Files.readAllBytes(file.toPath())));
            } catch (InterruptedException | IOException e) {
                throw new DebuggerException("File IO error", e);
            }
        } else {
            throw new DebuggerException("Unknown arg !");
        }

        IDebuggerToolbox toolbox = Thread::new;
        final HooksChannel hooksChannel = new HooksChannel(toolbox, true, new SocketHooksConnection(() -> port),
                new IHooksEventsHandler() {
                    @Override
                    public void onHooksTargetAttached(IHooksApi api, long robovmBaseSymbol) {
                    }

                    @Override
                    public void onHooksTargetEvent(HooksEventPayload eventPayload) {
                    }
                });

        DbgLogger.setup(null, true);
        hooksChannel.start();
    }
}
