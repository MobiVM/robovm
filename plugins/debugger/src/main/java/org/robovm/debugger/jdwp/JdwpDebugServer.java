package org.robovm.debugger.jdwp;

import org.robovm.compiler.config.Arch;
import org.robovm.debugger.DebuggerException;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Demyan Kimitsa
 * JDWP server implementation
 */
public class JdwpDebugServer {

    private final Thread socketThread;
    private final boolean jdwpClientMode;
    private final int jdwpPort;

    public JdwpDebugServer(boolean jdwpClienMode, int jdwpPort) {
        this.jdwpClientMode = jdwpClienMode;
        this.jdwpPort = jdwpPort;
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
        } catch (DebuggerException e) {

            e.printStackTrace();
        }

    }

    private Socket establishConnection() throws DebuggerException {
        Socket socket = null;
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

        return socket;
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
                } else if ("-verbose".equals(args[i])) {
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
