package org.robovm.debugger.hooks;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.hooks.payloads.InvokeCmdPayload;
import org.robovm.debugger.hooks.payloads.ThreadCallStackPayload;
import org.robovm.debugger.hooks.payloads.ThreadClassLoadedPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventPayload;
import org.robovm.debugger.hooks.payloads.ThreadStoppedPayload;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * Class implements itnerface to hooks server as it is implemented device side
 * Check hooks.c for reference
 */
public class HooksChannel {

    private final int DEFAULT_TIMEOUT = 5000;
    private final Thread socketThread;
    private final int hooksPort;
    private Socket socket;
    private long reqIdCounter = 100;
    private final Map<Long, HookReqHolder> requestsInProgress = new HashMap<>();
    private final ByteBufferPacket headerBuffer = new ByteBufferPacket();

    public HooksChannel(int hooksPort) {
        this.hooksPort = hooksPort;
        this.socketThread = new Thread(new Runnable() {
            @Override
            public void run() {
                doSocketWork();
            }
        });
    }

    public void start() {
        this.socketThread.start();
    }


    private void doSocketWork() {
        // establish connection
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress("127.0.0.1", hooksPort), 1000);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            // read handshake
            ByteBufferPacket buffer = new ByteBufferPacket();
            buffer.fillFromInputStream(inputStream, 4);
            buffer.setPosition(0);
            if (buffer.readUnsignedInt32() != HookConsts.handshake.QUESTION)
                throw new DebuggerException("Handshake failed!");
            // send handshake
            buffer.setPosition(0);
            buffer.writeUnsignedInt32(HookConsts.handshake.ANSWER);
            buffer.dumpToOutputStream(outputStream);

            while (!socketThread.isInterrupted()) {
                // read entire response header
                buffer.reset();
                buffer.fillFromInputStream(inputStream, 9);
                byte cmd = buffer.readByte();
                long reqId = buffer.readLong();
                long payloadSize = buffer.readLong();
                // also pick up the payload
                if (payloadSize != 0)
                    buffer.fillFromInputStream(inputStream, (int) payloadSize);

                if (reqId == 0) {
                    // looks to be event
                    if (!this.isEvent(cmd))
                        throw new DebuggerException("Non event response received with reqId == 0");
                } else {
                    // its request
                    HookReqHolder holder = requestsInProgress.remove(reqId);
                    if (holder == null)
                        throw new DebuggerException("Unexpected response id " + reqId + ", cmd = " + cmd);
                    // notify thread that there is an result
                    Object response = createPayloadObject(cmd, buffer);
                    holder.setResponse(response);
                    holder.notify();
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }


    private <T> T sendCommand(byte cmd, ByteBufferPacket payload) {
        // TODO: synchronizations to be done
        long reqId = reqIdCounter++;
        headerBuffer.reset();
        headerBuffer.writeByte(cmd);
        headerBuffer.writeLong(reqId);
        headerBuffer.writeLong(payload.size());
        headerBuffer.setPosition(0);
        payload.setPosition(0);

        HookReqHolder holder = new HookReqHolder(cmd);
        requestsInProgress.put(reqId, holder);

        try {
            socket.getChannel().write(new ByteBuffer[]{headerBuffer.getByteBuffer(), payload.getByteBuffer()});
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            holder.wait(DEFAULT_TIMEOUT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //noinspection unchecked
        return (T) holder.response;
    }

    public byte[] readMemory(long addr, int numBytes) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        packet.writeInt32(numBytes);
        return sendCommand(HookConsts.commands.READ_MEMORY, packet);
    }

    public String readCString(long addr) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        return sendCommand(HookConsts.commands.READ_CSTRING, packet);
    }

    public void writeMemory(long addr, byte[] data) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        packet.writeInt32(data.length);
        packet.writeBytes(data);
        sendCommand(HookConsts.commands.WRITE_MEMORY, packet);
    }

    public void andBits(long addr, byte mask) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        packet.writeByte(mask);
        sendCommand(HookConsts.commands.WRITE_AND_BITS, packet);
    }


    public void orBits(long addr, byte mask) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        packet.writeByte(mask);
        sendCommand(HookConsts.commands.WRITE_OR_BITS, packet);
    }

    public long allocate(int numBytes) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeInt32(numBytes);
        return sendCommand(HookConsts.commands.ALLOCATE, packet);
    }

    public void free(long addr) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        sendCommand(HookConsts.commands.FREE, packet);
    }

    public void classFilter(boolean isSet, String className) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeByte((byte) (isSet ? -1 : 0));
        byte[] bytes = className.getBytes();
        packet.writeInt32(bytes.length);
        packet.writeBytes(bytes);
        sendCommand(HookConsts.commands.CLASS_FILTER, packet);
    }

    public void threadSuspend(long thread) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        sendCommand(HookConsts.commands.THREAD_SUSPEND, packet);
    }

    public void threadResume(long thread) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        sendCommand(HookConsts.commands.THREAD_RESUME, packet);
    }

    public void threadStep(long thread, long pcLow, long pcHigh, long pcLow2, long pcHigh2) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        packet.writeLong(pcLow);
        packet.writeLong(pcHigh);
        packet.writeLong(pcLow2);
        packet.writeLong(pcHigh2);
        sendCommand(HookConsts.commands.THREAD_STEP, packet);
    }

    public void threadInvoke(long thread, long classOrObjectPtr, String methodName, String descriptor,
                             boolean isClassMethod, byte returnType, Object[] arguments) {
        // TODO: implement
    }

    public void newInstance(long thread, long classPtr, String methodName, String descriptor, Object[] arguments) {
        // TODO: implement
    }

    public InvokeCmdPayload newString(long thread, String s) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        byte[] bytes = s.getBytes();
        packet.writeInt32(bytes.length);
        packet.writeBytes(bytes);
        return sendCommand(HookConsts.commands.THREAD_NEWSTRING, packet);
    }

    public InvokeCmdPayload newArray(long thread, int arrayLength, String elementName) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        packet.writeInt32(arrayLength);
        byte[] bytes = elementName.getBytes();
        packet.writeInt32(bytes.length);
        packet.writeBytes(bytes);
        return sendCommand(HookConsts.commands.THREAD_NEWARRAY, packet);
    }


    private Object createPayloadObject(byte cmd, ByteBufferReader reader) {
        Object res = null;
        switch (cmd) {
            case HookConsts.commands.READ_MEMORY:
                res = reader.readBytes();
                break;

            case HookConsts.commands.READ_CSTRING:
                res = reader.readString();
                break;

            case HookConsts.commands.ALLOCATE:
                res = reader.readLong();
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
                res = new InvokeCmdPayload(resultPtr, throwable);
                break;
            }


            case HookConsts.events.THREAD_ATTACHED:
            case HookConsts.events.THREAD_STARTED:
            case HookConsts.events.THREAD_RESUMED:
            {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                res = new ThreadEventPayload(threadObj, thread);
                break;
            }

            case HookConsts.events.THREAD_DETTACHED:
            {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                long throwable = reader.readLong();
                res = new ThreadEventPayload(threadObj, thread, throwable);
                break;
            }

            case HookConsts.events.THREAD_SUSPENDED:
            case HookConsts.events.THREAD_STEPPED:
            case HookConsts.events.BREAKPOINT: {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                ThreadCallStackPayload[] callStack = readCallStack(reader);
                res = new ThreadStoppedPayload(threadObj, thread, callStack);
                break;
            }

            case HookConsts.events.EXCEPTION: {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                long throwable = reader.readLong();
                boolean isCaught = reader.readByte() != 0;
                ThreadCallStackPayload[] callStack = readCallStack(reader);
                res = new ThreadStoppedPayload(threadObj, thread, throwable, isCaught, callStack);
                break;
            }

            case HookConsts.events.CLASS_LOAD:
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                long clazz = reader.readLong();
                long classInfo = reader.readLong();
                ThreadCallStackPayload[] callStack = null;;
                if (reader.hasRemaining())
                    callStack = readCallStack(reader);
                res = new ThreadClassLoadedPayload(threadObj, thread, clazz, classInfo, callStack);
                break;

            default:
                throw new DebuggerException("Unrecognized Hooks command/event " + cmd);
        }

        return res;
    }


    private ThreadCallStackPayload[] readCallStack(ByteBufferReader reader) {
        int count = reader.readInt32();
        ThreadCallStackPayload[] res = new ThreadCallStackPayload[count];
        for (int idx = 0; idx < count; idx++) {
            long impl = reader.readLong();
            int lineNumber = reader.readInt32();
            long fp = reader.readLong();
            int clazzNameLen = reader.readInt32();
            String clazzName = reader.readString(clazzNameLen);
            res[idx] = new ThreadCallStackPayload(clazzName, impl, lineNumber, fp);
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
}
