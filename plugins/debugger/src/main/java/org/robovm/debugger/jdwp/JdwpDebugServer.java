package org.robovm.debugger.jdwp;

import org.robovm.debugger.Debugger;
import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.handlers.eventrequest.JdwpEventReqClearAllBreakpointsHandler;
import org.robovm.debugger.jdwp.handlers.eventrequest.JdwpEventReqClearHandler;
import org.robovm.debugger.jdwp.handlers.eventrequest.JdwpEventReqSetHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRegTypeClassLoaderHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRegTypeFieldsHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRegTypeMethodsHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRegTypeModifiersHandler;
import org.robovm.debugger.jdwp.handlers.referencetype.JdwpRegTypeSignatureHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmCapabilitiesHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmCapabilitiesNewHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmClassPathsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmAllClassesHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmAllClassesWithGenericsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmClassesBySignatureHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmDisposeHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmIdSizesHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmVersionHandler;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.jdwp.protocol.JdwpRequestHeader;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

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
public class JdwpDebugServer {
    private final DbgLogger log = DbgLogger.get(this.getClass().getSimpleName());
    private static final String JDWP_HANDSHAKE = "JDWP-Handshake";
    private final Thread socketThread;
    private final boolean jdwpClientMode;
    private final int jdwpPort;
    private Socket socket;
    private Map<Integer, IJdwpRequestHandler> handlers = new HashMap<>();
    private ByteBufferPacket headerBuffer = new ByteBufferPacket();
    private final Debugger debugger;


    public JdwpDebugServer(Debugger debugger, boolean jdwpClienMode, int jdwpPort) {
        this.jdwpClientMode = jdwpClienMode;
        this.jdwpPort = jdwpPort;
        this.socketThread = new Thread(new Runnable() {
            @Override
            public void run() {
                doSocketWork();
            }
        });

        headerBuffer = new ByteBufferPacket();
        headerBuffer.setByteOrder(ByteOrder.BIG_ENDIAN);

        this.debugger = debugger;
    }

    public void start() {
        registerHandlers();

        this.socketThread.start();
    }

    public void cleanup() {
        this.socketThread.interrupt();
        try {
            this.socketThread.join(2000);
        } catch (InterruptedException ignored) {
        }
    }

    private void doSocketWork() {
        // establish connection
        try {
            establishConnection();
            InputStream inputStream = socket.getInputStream();

            JdwpRequestHeader header = new JdwpRequestHeader();
            ByteBufferPacket packet = new ByteBufferPacket();
            ByteBufferPacket outPacket = new ByteBufferPacket();
            // and data sent via JDWP should be in big-endian format.
            packet.setByteOrder(ByteOrder.BIG_ENDIAN);


            // receive handshake
            packet.fillFromInputStream(inputStream, JDWP_HANDSHAKE.length());
            packet.setPosition(0);
            String handshake = packet.readString();
            if (!JDWP_HANDSHAKE.equals(handshake)) {
                // handshake failed
                throw new DebuggerException("Unexpected JDWP handshake");
            }
            // send it back
            packet.dumpToOutputStream(socket.getOutputStream());


            // run JDPW packet cycle
            while (!socketThread.isInterrupted()) {
                header.readFromStream(inputStream, packet);

                // read payload if any
                packet.reset();
                if (header.payloadSize() != 0) {
                    packet.fillFromInputStream(inputStream, header.payloadSize());
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
            }
        } catch (DebuggerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void sendResponse(int id, short errorCode, ByteBufferPacket payload) throws IOException {
        headerBuffer.reset();
        headerBuffer.writeInt32(11 + payload.size());
        headerBuffer.writeInt32(id);
        headerBuffer.writeByte((byte) 0x80); // Reply packet
        headerBuffer.writeInt16(errorCode);

        headerBuffer.dumpToOutputStream(socket.getOutputStream());
        payload.dumpToOutputStream(socket.getOutputStream());
    }

    private void establishConnection() throws DebuggerException {
        if (jdwpClientMode) {
            // connect to server
            while (!Thread.interrupted()) {
                try {
                    socket = new Socket();
                    socket.connect(new InetSocketAddress("127.0.0.1", jdwpPort), 1000);
                    break;
                } catch (IOException e) {
                    // timeout
                    socket = null;
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
                serverSocket.setSoTimeout(1000);
            } catch (SocketException e) {
                throw new DebuggerException("Failed to accept connection", e);
            }

            while (!Thread.interrupted()) {
                try {
                    socket = serverSocket.accept();
                    break;
                } catch (IOException ignored) {
                }
            }
        }

        // interrupt or connected
        if (socket == null)
            throw new DebuggerException("Interrupted while establishing JDWP connection");
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
        VmDebuggerState state = debugger.debuggerState();

        // VirtualMachine Command Set (1)
        registerHandler(new JdwpVmVersionHandler()); // 1
        registerHandler(new JdwpVmClassesBySignatureHandler(state)); // 2
        registerHandler(new JdwpVmAllClassesHandler(state)); // 3
        // AllThreads Command (4)
        // TopLevelThreadGroups Command (5)
        registerHandler(new JdwpVmDisposeHandler()); // 6
        registerHandler(new JdwpVmIdSizesHandler()); // 7
        // Suspend Command (8)
        // Resume Command (9)
        // Exit Command (10)
        // CreateString Command (11)
        registerHandler(new JdwpVmCapabilitiesHandler()); // 12
        registerHandler(new JdwpVmClassPathsHandler()); // 13
        // DisposeObjects Command (14)
        // HoldEvents Command (15)
        // ReleaseEvents Command (16)
        registerHandler(new JdwpVmCapabilitiesNewHandler()); // 17
        // RedefineClasses Command (18) -- NOT_IMPLEMENTED
        // SetDefaultStratum Command (19) -- NOT_IMPLEMENTED
        registerHandler(new JdwpVmAllClassesWithGenericsHandler(state)); // 20
        // InstanceCounts Command (21) -- NOT_IMPLEMENTED

        //ReferenceType Command Set (2)
        registerHandler(new JdwpRegTypeSignatureHandler(state)); // 1
        registerHandler(new JdwpRegTypeClassLoaderHandler()); // 2
        registerHandler(new JdwpRegTypeModifiersHandler(state)); // 3
        registerHandler(new JdwpRegTypeFieldsHandler(state)); // 4
        registerHandler(new JdwpRegTypeMethodsHandler(state)); // 5
        //GetValues (6)
        //SourceFile (7)
        //NestedTypes (8)
        //Status (9)
        //Interfaces (10)
        //ClassObject (11)
        //SourceDebugExtension (12)
        //SignatureWithGeneric (13)
        //FieldsWithGeneric (14)
        //MethodsWithGeneric (15)
        //Instances (16)
        //ClassFileVersion (17)
        //ConstantPool (18)

        // EventRequest Command Set (15)
        registerHandler(new JdwpEventReqSetHandler(debugger.executionControlCenter()));
        registerHandler(new JdwpEventReqClearHandler(debugger.executionControlCenter()));
        registerHandler(new JdwpEventReqClearAllBreakpointsHandler(debugger.executionControlCenter()));
    }

}
