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
package org.robovm.compiler.plugin.debug;

import org.robovm.compiler.CompilerException;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.launcher.LaunchParameters;
import org.robovm.compiler.launcher.Launcher;
import org.robovm.compiler.launcher.LauncherUtils;
import org.robovm.compiler.launcher.LauncherUtils.OutputPortObserverFuture;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.plugin.launch.LaunchPlugin;
import org.robovm.compiler.target.Target;
import org.robovm.compiler.target.console.ConsoleLaunchParameters;
import org.robovm.compiler.target.ios.IIOSLaunchParameters;
import org.robovm.compiler.target.ios.IOSTarget;
import org.robovm.debugger.Debugger;
import org.robovm.debugger.DebuggerConfig;
import org.robovm.debugger.hooks.IHooksConnection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Demyan Kimitsa
 *
 * this launch plugin starts JDWP debug server in after launch phase
 * there is no direct reference to this class as it is picked up
 * from classloader.
 * Refer {@link org.robovm.compiler.AppCompiler} to find details about LauchPlugin calls
 * Refer {@link Config#loadPluginsFromClassPath()} to find how configs are loaded from classloader
 * Also corresponding entry has to be done in META-INF/services
 */
@SuppressWarnings({"unused", "JavadocReference"})
public class DebuggerLaunchPlugin extends LaunchPlugin implements Launcher.Listener {
    private final static String ARG_KEY_LOG_CONSOLE = "logconsole";
    private final static String ARG_KEY_SOURCE_PATH = "sourcepath";
    private final static String ARG_KEY_JDWP_PORT = "jdwpport";
    private final static String ARG_KEY_CLIENT_MODE = "clientmode";
    private final static String ARG_KEY_LOG_DIR = "logdir";

    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private DebuggerConfig debuggerConfig;
    private Debugger debugger;

    @Override
    public PluginArguments getArguments() {
        // list of arguments as these passed by idea, check idea/compilation/RoboVMCompileTask
        List<PluginArgument> args = new ArrayList<>();
        args.add(new PluginArgument(ARG_KEY_LOG_CONSOLE, "Flag: enables debugger logs to console"));
        args.add(new PluginArgument(ARG_KEY_SOURCE_PATH, "Locations of source files"));
        args.add(new PluginArgument(ARG_KEY_JDWP_PORT, "TCP port JDWP server should listen or connects to"));
        args.add(new PluginArgument(ARG_KEY_CLIENT_MODE, "Flag: specifies that JDWP server shall connect instead of listening"));
        args.add(new PluginArgument(ARG_KEY_LOG_DIR, "Custom location of log directory"));
        return new PluginArguments("debug", args);
    }

    @Override
    public void setupLaunch(Config config, LaunchParameters parameters) {
        cleanup();

        if (!config.isDebug())
            return;
        
        // fetch values passed from Idea/Eclipse
        Map<String, String> arguments = parseArguments(config);

        String logDir = argumentValue(arguments, ARG_KEY_LOG_DIR, config.getTmpDir().getAbsolutePath());
        int jdwpPort = argumentIntValue(arguments, ARG_KEY_JDWP_PORT);
        boolean jdwpClientMode = argumentValue(arguments, ARG_KEY_CLIENT_MODE, false);
        boolean logConsole = config.isDumpIntermediates() || argumentValue(arguments, ARG_KEY_LOG_CONSOLE, false);

        // common parameters to target
        parameters.getArguments().add("-rvm:EnableHooks");
        parameters.getArguments().add("-rvm:WaitForResume");

        // register as launch listener to be able to start debugger once target is launched
        parameters.setLauncherListener(this);

        Target target = config.getTarget();

        // now create debugger config
        DebuggerConfig.Builder builder = new DebuggerConfig.Builder();
        builder.setJdwpPort(jdwpPort);
        builder.setJdwpClienMode(jdwpClientMode);
        builder.setLogToConsole(logConsole);
        builder.setLogDir(new File(logDir));
        builder.setArch(DebuggerConfig.Arch.valueOf(config.getArch().getCpuArch().name()));

        // specific settings depending on launch type
        if (parameters instanceof ConsoleLaunchParameters) {
            File appDir = config.isSkipInstall() ? config.getTmpDir() : config.getInstallDir();
            builder.setAppfile(new File(appDir, config.getExecutableName()));
        } else if (parameters instanceof IIOSLaunchParameters) {
            // all ios
            File appDir = new File(config.isSkipInstall() ? config.getTmpDir() : config.getInstallDir(), config.getExecutableName() + ".app");
            builder.setAppfile(new File(appDir, config.getExecutableName()));
        } else {
            throw new IllegalArgumentException("Unsupported target " + target.getType());
        }

        // setup way to receive hooks port number from target
        Future<Integer> portNumberPromise = getPortNumberPromise(parameters, config.getTarget(), config.getArch());
        builder.setPortNumberPromise(portNumberPromise);

        debuggerConfig = builder.build();
    }

    @Override
    public void onLaunching() {
        // launcher callback: launch is initiated, while deployment is starting can start parsing
        // hash maps of binary
        executor.submit(() -> { debugger = new Debugger(debuggerConfig); });
    }

    @Override
    public void onLaunched(Launcher.Target target) {
        executor.submit(() -> {
            try {
                int portNumber = debuggerConfig.getPortNumberPromise().get();
                IHooksConnection connection = hookConnectionFromTarget(target, portNumber);
                debugger.start(target::terminate, connection);
            } catch (Exception e) {
                // failed to connect to target, shutdown debugger
                debugger.onException(Thread.currentThread(), e);
                debugger.shutdown();
            }
        });
    }

    @Override
    public void onExited(int code) {
        cleanup();
    }

    private void cleanup() {
        // shutdown previous instance of debugger
        synchronized (this) {
            if (debugger != null) {
                debugger.shutdown();
            }

            debugger = null;
            debuggerConfig = null;
        }
    }

    private int argumentIntValue(Map<String, String> arguments, String key) {
        String v = arguments.get(key);
        if (v == null)
            throw new CompilerException("Missing required debugger argument " + key);

        return Integer.parseInt(v);
    }

    boolean argumentBoolValue(Map<String, String> arguments, String key) {
        String v = arguments.get(key);
        if (v == null)
            throw new CompilerException("Missing required debugger argument " + key);

        return Boolean.parseBoolean(v);
    }

    /**
     * Converts target connection to IHooksConnection
     */
    private IHooksConnection hookConnectionFromTarget(Launcher.Target target, int port) throws IOException {
        return new IHooksConnection() {
            final Launcher.Connection connection = target.createConnection();

            @Override
            public void connect() throws IOException {
                connection.connect(port);
            }

            @Override
            public void disconnect() throws IOException {
                connection.disconnect();
            }

            @Override
            public InputStream getInputStream() throws IOException {
                return connection.in();
            }

            @Override
            public OutputStream getOutputStream() throws IOException {
                return connection.out();
            }
        };
    }

    /**
     * Depending on target type and arch, setup way to receive hooks port number from target
     */
    private Future<Integer> getPortNumberPromise(LaunchParameters parameters, Target target, Arch arch) {
        try {
            if (parameters instanceof ConsoleLaunchParameters) {
                File hooksPortFile = File.createTempFile("robovm-dbg-console", ".port");
                parameters.getArguments().add("-rvm:PrintDebugPort=" + hooksPortFile.getAbsolutePath());
                return LauncherUtils.waitForPortFromFile(hooksPortFile);
            } else if (parameters instanceof IIOSLaunchParameters) {
                if (IOSTarget.isSimulatorArch(arch)) {
                    // launching on simulator, it can write down port number to file on local system
                    File hooksPortFile = File.createTempFile("robovm-dbg-sim", ".port");
                    parameters.getArguments().add("-rvm:PrintDebugPort=" + hooksPortFile.getAbsolutePath());
                    return LauncherUtils.waitForPortFromFile(hooksPortFile);
                } else {
                    // launching on device, port number will be sent via stdout, setup stdout reader to catch it
                    parameters.getArguments().add("-rvm:PrintDebugPort");
                    OutputPortObserverFuture observeOutputFeature = new OutputPortObserverFuture();
                    LauncherUtils.attachOutputPortObserver(parameters.getStdoutChain(), observeOutputFeature);
                    return observeOutputFeature;
                }
            }
        } catch (IOException e) {
            throw new CompilerException("Failed to create debugger port file", e);
        }

        throw new IllegalArgumentException("Unsupported target " + target.getType());
    }
}
