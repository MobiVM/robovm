package org.robovm.debugger.hooks;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.hooks.payloads.InvokeCmdPayload;
import org.robovm.debugger.hooks.payloads.ThreadCallStackPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventClassLoadedPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventStoppedPayload;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

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
public class HooksChannel implements IHooksApi{
    DbgLogger log = DbgLogger.get(this.getClass().getSimpleName());

    private final static int DEFAULT_TIMEOUT = 5000;
    private final static int PORT_FILE_WAIT_TIMEOUT = 60000;
    private final Thread socketThread;
    private final IntSupplier hooksPortSupplier;
    private final boolean is64bit;
    private Socket socket;
    private long reqIdCounter = 100;
    private final Map<Long, HookReqHolder> requestsInProgress = new HashMap<>();
    private final ByteBufferPacket headerBuffer;
    private final IHooksEventsHandler eventsHandler;

    private HooksChannel(boolean is64bit, IntSupplier hooksPortSupplier, IHooksEventsHandler eventsHandler) {
        this.hooksPortSupplier = hooksPortSupplier;
        this.is64bit = is64bit;
        this.eventsHandler = eventsHandler;
        this.socketThread = new Thread(() -> doSocketWork());

        headerBuffer = new ByteBufferPacket();
        headerBuffer.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    /** when port is known */
    public HooksChannel(boolean is64bit, int port, IHooksEventsHandler eventsHandler) {
        this(is64bit, () -> port, eventsHandler);
    }

    /** when port to be read from simulator port file  */
    public HooksChannel(boolean is64bit, File portFile, IHooksEventsHandler eventsHandler) {
        this(is64bit, () -> readFromPortFile(portFile), eventsHandler);
    }

    public void start() {
        this.socketThread.start();
    }


    private void doSocketWork() {
        // establish connection
        try {
            int port = hooksPortSupplier.getAsInt();
            socket = new Socket();
            socket.connect(new InetSocketAddress("127.0.0.1", port), 1000);
            socket.setTcpNoDelay(true);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            // read handshake
            ByteBufferPacket buffer = new ByteBufferPacket(is64bit);
            buffer.setByteOrder(ByteOrder.BIG_ENDIAN);
            buffer.fillFromInputStream(inputStream, 8);
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
            buffer.fillFromInputStream(inputStream, 8);
            buffer.setPosition(0);
            long robovmBaseSymbol = buffer.readLong();

            // deliver callback that connected to device
            eventsHandler.attached(this, robovmBaseSymbol);

            // handshake complete, process messages
            while (!socketThread.isInterrupted()) {
                // read entire response header
                buffer.reset();
                buffer.fillFromInputStream(inputStream, 1 + 8 + 8);
                buffer.setPosition(0);
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

                    // lets create event
                    Object payload = createPayloadObject(cmd, buffer);
                    this.eventsHandler.handleEvent(payload);
                } else {
                    // its response to request request
                    HookReqHolder holder = requestsInProgress.remove(reqId);
                    if (holder == null)
                        throw new DebuggerException("Unexpected response id " + reqId + ", cmd = " + cmd);

                    log.debug("Received reps2req: " + reqId + " cmd:" + cmd);

                    // notify thread that there is an result
                    Object response = createPayloadObject(cmd, buffer);
                    holder.setResponse(response);
                    holder.release();
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }


    private <T> T sendCommand(byte cmd, ByteBufferPacket payload) {
        if (Thread.currentThread().getId() == socketThread.getId())
            throw new DebuggerException("Send command should not be invoked from response listening thread due blocking of last");

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
            headerBuffer.dumpToOutputStream(socket.getOutputStream());
            payload.dumpToOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        log.debug("sent " + cmd);
        try {
            if (!holder.aquire(DEFAULT_TIMEOUT))
                throw new DebuggerException("timeout performing req:" + reqId + "cmd " + cmd);

        } catch (InterruptedException e) {
            throw new DebuggerException(e);
        }
        log.debug("received " + holder.response);

        //noinspection unchecked
        return (T) holder.response;
    }

    @Override
    public byte[] readMemory(long addr, int numBytes) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        packet.writeInt32(numBytes);
        return sendCommand(HookConsts.commands.READ_MEMORY, packet);
    }

    @Override
    public String readCString(long addr) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        return sendCommand(HookConsts.commands.READ_CSTRING, packet);
    }

    @Override
    public void writeMemory(long addr, byte[] data) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        packet.writeInt32(data.length);
        packet.writeBytes(data);
        sendCommand(HookConsts.commands.WRITE_MEMORY, packet);
    }

    @Override
    public void andBits(long addr, byte mask) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        packet.writeByte(mask);
        sendCommand(HookConsts.commands.WRITE_AND_BITS, packet);
    }


    @Override
    public void orBits(long addr, byte mask) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        packet.writeByte(mask);
        sendCommand(HookConsts.commands.WRITE_OR_BITS, packet);
    }

    @Override
    public long allocate(int numBytes) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeInt32(numBytes);
        return sendCommand(HookConsts.commands.ALLOCATE, packet);
    }

    @Override
    public void free(long addr) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(addr);
        sendCommand(HookConsts.commands.FREE, packet);
    }

    @Override
    public void classFilter(boolean isSet, String className) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeByte((byte) (isSet ? -1 : 0));
        byte[] bytes = className.getBytes();
        packet.writeInt32(bytes.length);
        packet.writeBytes(bytes);
        sendCommand(HookConsts.commands.CLASS_FILTER, packet);
    }

    @Override
    public void threadSuspend(long thread) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        sendCommand(HookConsts.commands.THREAD_SUSPEND, packet);
    }

    @Override
    public void threadResume(long thread) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        sendCommand(HookConsts.commands.THREAD_RESUME, packet);
    }

    @Override
    public void threadStep(long thread, long pcLow, long pcHigh, long pcLow2, long pcHigh2) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        packet.writeLong(pcLow);
        packet.writeLong(pcHigh);
        packet.writeLong(pcLow2);
        packet.writeLong(pcHigh2);
        sendCommand(HookConsts.commands.THREAD_STEP, packet);
    }

    @Override
    public void threadInvoke(long thread, long classOrObjectPtr, String methodName, String descriptor,
                             boolean isClassMethod, byte returnType, Object[] arguments) {
        // TODO: implement
    }

    @Override
    public void newInstance(long thread, long classPtr, String methodName, String descriptor, Object[] arguments) {
        // TODO: implement
    }

    @Override
    public InvokeCmdPayload newString(long thread, String s) {
        ByteBufferPacket packet = new ByteBufferPacket();
        packet.writeLong(thread);
        byte[] bytes = s.getBytes();
        packet.writeInt32(bytes.length);
        packet.writeBytes(bytes);
        return sendCommand(HookConsts.commands.THREAD_NEWSTRING, packet);
    }

    @Override
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
                res = new ThreadEventPayload(cmd, threadObj, thread);
                break;
            }

            case HookConsts.events.THREAD_DETTACHED:
            {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                long throwable = reader.readLong();
                res = new ThreadEventPayload(cmd, threadObj, thread, throwable);
                break;
            }

            case HookConsts.events.THREAD_SUSPENDED:
            case HookConsts.events.THREAD_STEPPED:
            case HookConsts.events.BREAKPOINT: {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                ThreadCallStackPayload[] callStack = readCallStack(reader);
                res = new ThreadEventStoppedPayload(cmd, threadObj, thread, callStack);
                break;
            }

            case HookConsts.events.EXCEPTION: {
                long threadObj = reader.readLong();
                long thread = reader.readLong();
                long throwable = reader.readLong();
                boolean isCaught = reader.readByte() != 0;
                ThreadCallStackPayload[] callStack = readCallStack(reader);
                res = new ThreadEventStoppedPayload(cmd, threadObj, thread, throwable, isCaught, callStack);
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
                res = new ThreadEventClassLoadedPayload(threadObj, thread, clazz, classInfo, callStack);
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

    public static int readFromPortFile(File portFile) {
        try {
            long ts = System.currentTimeMillis();
            while (!portFile.exists() || portFile.length() == 0) {
                if (System.currentTimeMillis() - ts > PORT_FILE_WAIT_TIMEOUT)
                    throw new DebuggerException("Timeout while waiting simulator port file");
                Thread.sleep(200);
            }
            return Integer.parseInt(new String(Files.readAllBytes(portFile.toPath())));
        } catch (InterruptedException | IOException e) {
            throw new DebuggerException(e);
        }
    }

    public static void main(String[] argv) {
        int port;

        if ("-port".equals(argv[0])) {
            port = Integer.parseInt(argv[1]);
        } else if ("-file".equals(argv[0])) {
            try {
                File file = new File(argv[1]);
//                if (file.exists())
//                    file.delete();
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

        final HooksChannel hooksChannel = new HooksChannel(true, port, new IHooksEventsHandler() {
            @Override
            public void attached(IHooksApi api, long robovmBaseSymbol) {

            }

            @Override
            public void handleEvent(Object payload) {
                System.out.println(payload);
            }
        });
        DbgLogger.setup(null, true);
        hooksChannel.start();
    }
}
