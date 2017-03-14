package org.robovm.debugger.jdwp;

import org.robovm.compiler.config.Arch;
import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.handlers.eventrequest.JdwpEventReqSetHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmAllClassesWithGenericsHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmVersionHandler;
import org.robovm.debugger.jdwp.handlers.vm.JdwpVmIdSizesHandler;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.jdwp.protocol.JdwpRequestHeader;
import org.robovm.debugger.utils.DbgLogger;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


    public JdwpDebugServer(boolean jdwpClienMode, int jdwpPort) {
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

        registerHandlers();
    }

    public void start() {
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
                log.debug("JDWP req: cmdset " + header.commandset + ", cmd " + header.command );

                // read payload if any
                packet.reset();
                if (header.payloadSize() != 0) {
                    packet.fillFromInputStream(inputStream, header.payloadSize());
                }

                // find handler
                IJdwpRequestHandler handler = handlers.get(makeHandlerKey(header.commandset, header.command));
                outPacket.reset();
                short errorCode;
                if (handler != null)
                    errorCode = handler.handle(packet, outPacket);
                else
                    errorCode = JdwpConsts.Error.NOT_IMPLEMENTED;

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
        handlers.put(makeHandlerKey(handler.getCommandSet(), handler.getCommand()), handler);
    }

    private void registerHandlers() {
        // VirtualMachine Command Set (1)
        registerHandler(new JdwpVmVersionHandler());
        registerHandler(new JdwpVmIdSizesHandler());
        registerHandler(new JdwpVmAllClassesWithGenericsHandler());

        // EventRequest Command Set (15)
        registerHandler(new JdwpEventReqSetHandler());
    }

    public static void main(String[] args) throws IOException {
        List<File> sourcePath = new ArrayList<>();
        Arch arch = null;
        File logDir = null;
        boolean logToConsole = false;
        boolean jdwpClienMode = false;
        int jdwpPort = -1;

        try {
            int i = 0;
            while (i < args.length) {
                if ("-sourcepath".equals(args[i])) {
                    for (String p : args[++i].split(File.pathSeparator)) {
                        sourcePath.add(new File(p));
                    }
                } else if ("-arch".equals(args[i])) {
                    String s = args[++i];
                    arch = Arch.valueOf(s);
                } else if ("-logdir".equals(args[i])) {
                    logDir = new File(args[++i]);
                } else if ("-logToConsole".equals(args[i])) {
                    logToConsole = true;
                } else if ("-jdwpClientMode".equals(args[i])) {
                    jdwpClienMode = true;
                } else if ("-jdwpPort".equals(args[i])) {
                    jdwpPort = Integer.valueOf(args[++i]);
                } else {
                    throw new IllegalArgumentException("Unrecognized option: " + args[i]);
                }
                i++;
            }

            if (jdwpPort == -1)
                throw new IllegalArgumentException("Missing jdwpPort argument");
        } catch (Throwable t) {
            String message = t.getMessage();
            if (t instanceof ArrayIndexOutOfBoundsException) {
                message = "Missing argument";
            }
            if (t instanceof IndexOutOfBoundsException) {
                message = "Missing argument";
            }

            printUsageAndExit(message);
        }

        DbgLogger.setup(null, logToConsole);
        JdwpDebugServer server = new JdwpDebugServer(jdwpClienMode, jdwpPort);
        server.start();
    }

    private static void printUsageAndExit(String errorMessage) {
        if (errorMessage != null) {
            System.err.format("JdwpDebugServer: %s\n", errorMessage);
        }

        System.err.println("Usage: JdwpDebugServer [-options]");
        System.err.println("Options:");
        System.err.println("  -sourcepath <list> : separated list of directories, JAR archives, and ZIP \n"
                + "                        archives to search for source files.");
        System.err.println("  -arch <name>          The name of the LLVM arch to compile for. Allowed values\n"
                + "                        are 'auto', 'x86', 'x86_64', 'thumbv7', 'arm64'. Default is\n"
                + "                        'auto' which means use the LLVM default.");
        System.err.println("  -logdir <dir>         The directory to put log file to. Default is temp dir");
        System.err.println("  -verbose              Output log messages to console");
        System.err.println("  -jdwpClientMode        Specifies that JDWP server shall connect instead of listening");
        System.err.println("  -jdwpPort <value>     TCP port JDWP server should listen or connects to");
        System.exit(errorMessage != null ? 1 : 0);
    }


}
