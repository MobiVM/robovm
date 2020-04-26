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
package org.robovm.debugger;

import org.robovm.debugger.hooks.HooksChannel;
import org.robovm.debugger.hooks.IHooksConnection;
import org.robovm.debugger.utils.macho.MachOConsts;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;

/**
 * @author Demyan Kimitsas
 * Configuration file that is to start debugger
 */
public class DebuggerConfig {
    public final static int TARGET_WAIT_TIMEOUT = 60000;

    /**
     * debugger local arch list, corresponds one from compiler
     */
    public enum Arch {
        x86(MachOConsts.cpu_type.CPU_TYPE_X86, true),
        x86_64(MachOConsts.cpu_type.CPU_TYPE_X86_64),
        thumbv7(MachOConsts.cpu_type.CPU_TYPE_ARM, true),
        arm64(MachOConsts.cpu_type.CPU_TYPE_ARM64);

        private final boolean is32bit;
        private int machoValue;

        Arch(int machoValue, boolean is32bit) {
            this.machoValue = machoValue;
            this.is32bit = is32bit;
        }

        Arch(int machoValue) {
            this(machoValue, false);
        }

        public boolean is32Bit() {
            return is32bit;
        }

        public int getMachoValue() {
            return machoValue;
        }
    }

    private List<File> sourcePath;
    private Arch arch;
    private File logDir;
    private File appfile;
    private boolean logToConsole;
    private boolean jdwpClienMode;
    private int jdwpPort = -1;
    private boolean standalone;
    private IHooksConnection hooksConnection;

    private DebuggerConfig() {
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

    public IHooksConnection hooksConnection() {
        return hooksConnection;
    }

    public boolean isStandalone() {
        return standalone;
    }

    public static class Builder {
        private final DebuggerConfig config = new DebuggerConfig();

        public DebuggerConfig build() {
            if (config.arch == null || config.appfile == null || config.jdwpPort < 0 || config.hooksConnection == null)
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

        public void setHooksPortFile(File portFile) {
            IntSupplier portSupplier = () -> {
                try {
                    long ts = System.currentTimeMillis();
                    while (!portFile.exists() || portFile.length() == 0) {
                        if (System.currentTimeMillis() - ts > DebuggerConfig.TARGET_WAIT_TIMEOUT)
                            throw new DebuggerException("Timeout while waiting simulator port file");
                        Thread.sleep(200);
                    }
                    return Integer.parseInt(new String(Files.readAllBytes(portFile.toPath())));
                } catch (InterruptedException | IOException e) {
                    throw new DebuggerException(e);
                }
            };

            config.hooksConnection = new HooksChannel.SocketHooksConnection(portSupplier);
        }

        public void setHooksPort(int hooksPort) {
            config.hooksConnection = new HooksChannel.SocketHooksConnection(() -> hooksPort);
        }

        public void setHooksConnection(IHooksConnection conn) {
            config.hooksConnection = conn;
        }

        private void setStandalone(boolean b) {
            config.standalone = b;
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
        File hooksPortFile = null;
        int hooksPort = -1;

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
                    jdwpPort = Integer.parseInt(args[++i]);
                } else if ("-hooksPortFile".equals(args[i])) {
                    hooksPortFile = new File(args[++i]);
                } else if ("-hooksPort".equals(args[i])) {
                    hooksPort = Integer.parseInt(args[++i]);
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
        if (hooksPortFile != null)
            builder.setHooksPortFile(hooksPortFile);
        else if (hooksPort != -1)
            builder.setHooksPort(hooksPort);
        builder.setStandalone(true);

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
        ps.println("  -sourcepath <list> :   separated list of directories, JAR archives, and ZIP \n"
                + "                          archives to search for source files.");
        ps.println("  -arch <name>           The name of the LLVM arch to compile for. Allowed values\n"
                + "                          are 'auto', 'x86', 'x86_64', 'thumbv7', 'arm64'. Default is\n"
                + "                         'auto' which means use the LLVM default.");
        ps.println("  -appfile <file>        The path to compiled application file");
        ps.println("  -logdir <dir>          The directory to put log file to. Default is temp dir");
        ps.println("  -verbose               Output log messages to console");
        ps.println("  -jdwpClientMode        Specifies that JDWP server shall connect instead of listening");
        ps.println("  -jdwpPort <value>      TCP port JDWP server should listen or connects to");
        ps.println("  -hooksPortFile <value> File where target have written TCT port simulator is listened on for debugger");
        ps.println("  -hooksPort <value>     TCT port simulator is listened on for debugger");


        return new String(baos.toByteArray(), StandardCharsets.UTF_8);
    }
}
