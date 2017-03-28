package org.robovm.debugger;

import org.robovm.compiler.config.Arch;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Demyan Kimitsas
 * Configuration file that is to start debugger
 */
public class DebuggerConfig {
    private List<File> sourcePath;
    private Arch arch;
    private File logDir;
    private File appfile;
    private boolean logToConsole;
    private boolean jdwpClienMode;
    private int jdwpPort = -1;
    private File hooksPortFile;
    private int hooksPort = -1;

    private  DebuggerConfig() {
    }

    public List<File> sourcePath() {
        return sourcePath;
    }

    public Arch arch() {
        return arch;
    }

    public File logDir() {
        return logDir;
    }

    public File appfile() {
        return appfile;
    }

    public boolean logToConsole() {
        return logToConsole;
    }

    public boolean jdwpClienMode() {
        return jdwpClienMode;
    }

    public int jdwpPort() {
        return jdwpPort;
    }

    public File hooksPortFile() {
        return hooksPortFile;
    }

    public int hooksPort() {
        return hooksPort;
    }

    public static class Builder {
        private final DebuggerConfig config = new DebuggerConfig();

        public DebuggerConfig build() {
            if (config.arch == null || config.appfile == null || config.jdwpPort < 0 ||
                    (config.hooksPort < 0 && config.hooksPortFile == null))
                throw new DebuggerException("Missing required parameters in config");
            return config;
        }

        public void setSourcePath(List<File> sourcePath) {
            config.sourcePath = sourcePath;
        }

        public void setArch(Arch arch) {
            config.arch = arch;
        }

        public void setLogDir(File logDir) {
            config.logDir = logDir;
        }

        public void setAppfile(File appfile) {
            config.appfile = appfile;
        }

        public void setLogToConsole(boolean logToConsole) {
            config.logToConsole = logToConsole;
        }

        public void setJdwpClienMode(boolean jdwpClienMode) {
            config.jdwpClienMode = jdwpClienMode;
        }

        public void setJdwpPort(int jdwpPort) {
            config.jdwpPort = jdwpPort;
        }

        public void setHooksPortFile(File hooksPortFile) {
            config.hooksPortFile = hooksPortFile;
        }

        public void setHooksPort(int hooksPort) {
            config.hooksPort = hooksPort;
        }
    }


    public static DebuggerConfig fromCommandLine(String[] args) {
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

            throw new DebuggerException(getCommandLineUsageText(message));
        }

        Builder builder = new Builder();
        builder.setSourcePath(sourcePath);
        builder.setAppfile(appfile);
        builder.setArch(arch);
        builder.setLogDir(logDir);
        builder.setLogToConsole(logToConsole);
        builder.setJdwpClienMode(jdwpClienMode);
        builder.setJdwpPort(jdwpPort);

        return builder.build();
    }

    private static String getCommandLineUsageText(String errorMessage) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        if (errorMessage != null) {
            ps.println("Debugger: " + errorMessage);
        }

        ps.println("Usage: Debugger [-options]");
        ps.println("Options:");
        ps.println("  -sourcepath <list> : separated list of directories, JAR archives, and ZIP \n"
                + "                        archives to search for source files.");
        ps.println("  -arch <name>          The name of the LLVM arch to compile for. Allowed values\n"
                + "                        are 'auto', 'x86', 'x86_64', 'thumbv7', 'arm64'. Default is\n"
                + "                        'auto' which means use the LLVM default.");
        ps.println("  -appfile<file>        The path to compiled application file");
        ps.println("  -logdir <dir>         The directory to put log file to. Default is temp dir");
        ps.println("  -verbose              Output log messages to console");
        ps.println("  -jdwpClientMode        Specifies that JDWP server shall connect instead of listening");
        ps.println("  -jdwpPort <value>     TCP port JDWP server should listen or connects to");

        return new String(baos.toByteArray(), StandardCharsets.UTF_8);
    }
}
