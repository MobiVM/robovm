package org.robovm.debugger;

import org.robovm.compiler.config.Arch;
import org.robovm.debugger.execution.ExecutionControlCenter;
import org.robovm.debugger.hooks.HooksChannel;
import org.robovm.debugger.jdwp.JdwpDebugServer;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.utils.DbgLogger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Demyan Kimitsa
 * Aggregate class of all debugger modules
 */
public class Debugger {
    private final DbgLogger log = DbgLogger.get(this.getClass().getSimpleName());

    // start up parameters
    private final List<File> sourcePath;
    private final Arch arch;
    private final File logDir;
    private final File appfile;
    private final boolean logToConsole;
    private final boolean jdwpClienMode;
    private final int jdwpPort;

    // modules
    private final VmDebuggerState debuggerState;
    private final JdwpDebugServer jdwpServer;
    private final HooksChannel hooksChannel;
    private final ExecutionControlCenter executionControlCenter;

    public Debugger(List<File> sourcePath, File appfile, Arch arch, File logDir, boolean logToConsole,
                    boolean jdwpClienMode, int jdwpPort) {
        this.sourcePath = sourcePath;
        this.arch = arch;
        this.logDir = logDir;
        this.appfile = appfile;
        this.logToConsole = logToConsole;
        this.jdwpClienMode = jdwpClienMode;
        this.jdwpPort = jdwpPort;

        DbgLogger.setup(null, logToConsole);
        debuggerState = VmDebuggerState.create(appfile, arch);
        executionControlCenter = new ExecutionControlCenter();
        jdwpServer = new JdwpDebugServer(this, jdwpClienMode, jdwpPort);
        hooksChannel = null;
    }

    private void start() {
        log.info("Starting debugger");
        // start everything
        jdwpServer.start();
    }


    public VmDebuggerState debuggerState() {
        return debuggerState;
    }

    public JdwpDebugServer jdwpServer() {
        return jdwpServer;
    }

    public HooksChannel hooksChannel() {
        return hooksChannel;
    }

    public ExecutionControlCenter executionControlCenter() {
        return executionControlCenter;
    }

    public static void main(String[] args) throws IOException {
        List<File> sourcePath = new ArrayList<>();
        Arch arch = null;
        File logDir = null;
        File appfile = null;
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
                } else if ("-appfile".equals(args[i])) {
                    appfile = new File(args[++i]);
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

        if (arch == null || appfile == null)
            printUsageAndExit("Missing argument");

        Debugger debugger = new Debugger(sourcePath, appfile, arch, logDir, logToConsole, jdwpClienMode, jdwpPort);
        debugger.start();
    }

    private static void printUsageAndExit(String errorMessage) {
        if (errorMessage != null) {
            System.err.format("Debugger: %s\n", errorMessage);
        }

        System.err.println("Usage: Debugger [-options]");
        System.err.println("Options:");
        System.err.println("  -sourcepath <list> : separated list of directories, JAR archives, and ZIP \n"
                + "                        archives to search for source files.");
        System.err.println("  -arch <name>          The name of the LLVM arch to compile for. Allowed values\n"
                + "                        are 'auto', 'x86', 'x86_64', 'thumbv7', 'arm64'. Default is\n"
                + "                        'auto' which means use the LLVM default.");
        System.err.println("  -appfile<file>        The path to compiled application file");
        System.err.println("  -logdir <dir>         The directory to put log file to. Default is temp dir");
        System.err.println("  -verbose              Output log messages to console");
        System.err.println("  -jdwpClientMode        Specifies that JDWP server shall connect instead of listening");
        System.err.println("  -jdwpPort <value>     TCP port JDWP server should listen or connects to");
        System.exit(errorMessage != null ? 1 : 0);
    }
}
