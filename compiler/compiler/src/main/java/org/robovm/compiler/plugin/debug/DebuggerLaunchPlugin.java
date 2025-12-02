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
import org.robovm.compiler.config.Config;
import org.robovm.compiler.plugin.LaunchPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.Target;
import org.robovm.compiler.target.console.ConsoleLaunchParameters;
import org.robovm.compiler.target.ios.IIOSLaunchParameters;
import org.robovm.debugger.Debugger;
import org.robovm.debugger.DebuggerConfig;
import org.robovm.debugger.hooks.IHooksConnection;
import org.robovm.debugger.utils.IHooksConnectionUtils.DelegatingFuture;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
public class DebuggerLaunchPlugin extends LaunchPlugin {
    private final static String ARG_KEY_LOG_CONSOLE = "logconsole";
    private final static String ARG_KEY_SOURCE_PATH = "sourcepath";
    private final static String ARG_KEY_JDWP_PORT = "jdwpport";
    private final static String ARG_KEY_CLIENT_MODE = "clientmode";
    private final static String ARG_KEY_LOG_DIR = "logdir";

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
    public void beforeLaunch(Config config, LaunchParameters parameters) {
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

        Target target = config.getTarget();

        // now create debugger config
        DebuggerConfig.Builder builder = new DebuggerConfig.Builder();
        builder.setJdwpPort(jdwpPort);
        builder.setJdwpClienMode(jdwpClientMode);
        builder.setLogToConsole(logConsole);
        builder.setLogDir(new File(logDir));
        builder.setArch(DebuggerConfig.Arch.valueOf(target.getArch().getCpuArch().name()));

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

        // tell launcher that debugger/hooks connection is expected
        DelegatingFuture<IHooksConnection> connectionPromise = new DelegatingFuture<>();
        builder.setHooksConnectionPromise(connectionPromise);
        parameters.setRequestForDebuggerConnection(connectionPromise);
        debuggerConfig = builder.build();
    }

    @Override
    public void afterLaunch(Config config, LaunchParameters parameters, Process process) {
        if (!config.isDebug())
            return;

        // create and start the debugger
        debugger = new Debugger(process, debuggerConfig);
        debugger.start();
    }

    @Override
    public void launchFailed(Config config, LaunchParameters parameters) {
        cleanup();
    }

    @Override
    public void cleanup() {
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
}
