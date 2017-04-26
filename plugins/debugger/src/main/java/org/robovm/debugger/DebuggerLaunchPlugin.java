package org.robovm.debugger;

import org.robovm.compiler.CompilerException;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.plugin.LaunchPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.Target;
import org.robovm.compiler.target.ios.IOSTarget;

import java.io.File;
import java.io.IOException;
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
@SuppressWarnings("unused")
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
        
        // fetch values passed from Idea/Eclipse
        Map<String, String> arguments = parseArguments(config);

        String logDir = argumentValue(arguments, ARG_KEY_LOG_DIR, config.getTmpDir().getAbsolutePath());
        int jdwpPort = argumentIntValue(arguments, ARG_KEY_JDWP_PORT);
        boolean jdwpClientMode = argumentBoolValue(arguments, ARG_KEY_CLIENT_MODE);
        boolean logConsole = config.isDumpIntermediates() || argumentValue(arguments, ARG_KEY_CLIENT_MODE, false);

        // parameters to target
        File hooksPortFile;

        // make list of arguments for target
        Target target = config.getTarget();
        if (IOSTarget.isSimulatorArch(target.getArch())) {
            // launching on simulator, it can write down port number to file on local system
            try {
                hooksPortFile = File.createTempFile("robovm-dbg-sim", ".port");
            } catch (IOException e) {
                throw new CompilerException("Failed to create simulator debuuger port file", e);
            }

            parameters.getArguments().add("-rvm:PrintDebugPort=" + hooksPortFile.getAbsolutePath());
        } else {
            // launching on device
            throw new CompilerException("TODO: launch on device is not implemented yet");
        }

        // common parameters to target
        parameters.getArguments().add("-rvm:EnableHooks");
        parameters.getArguments().add("-rvm:WaitForResume");

        // now create debugger config
        DebuggerConfig.Builder builder = new DebuggerConfig.Builder();
        builder.setHooksPortFile(hooksPortFile);
        builder.setJdwpPort(jdwpPort);
        builder.setJdwpClienMode(jdwpClientMode);
        builder.setLogToConsole(logConsole);
        builder.setLogDir(new File(logDir));
        builder.setAppfile(new File(config.isSkipInstall() ? config.getTmpDir() : config.getInstallDir(), config.getExecutableName()));
        builder.setArch(target.getArch());

        debuggerConfig = builder.build();
    }

    @Override
    public void afterLaunch(Config config, LaunchParameters parameters, Process process) {
        // create and start the debugger
        debugger = new Debugger(debuggerConfig);
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

    private String argumentValue(Map<String, String> arguments, String key, String defaultValue) {
        String v = arguments.get(key);
        return v != null ? v : defaultValue;
    }

    private int argumentValue(Map<String, String> arguments, String key, int defaultValue) {
        String v = arguments.get(key);
        return v != null ? Integer.parseInt(v) : defaultValue;
    }

    private int argumentIntValue(Map<String, String> arguments, String key) {
        String v = arguments.get(key);
        if (v == null)
            throw new CompilerException("Missing required debugger argument " + key);

        return Integer.parseInt(v);
    }

    private boolean argumentValue(Map<String, String> arguments, String key, boolean defaultValue) {
        String v = arguments.get(key);
        return v != null ? Boolean.parseBoolean(v) : defaultValue;
    }

    boolean argumentBoolValue(Map<String, String> arguments, String key) {
        String v = arguments.get(key);
        if (v == null)
            throw new CompilerException("Missing required debugger argument " + key);

        return Boolean.parseBoolean(v);
    }
}
