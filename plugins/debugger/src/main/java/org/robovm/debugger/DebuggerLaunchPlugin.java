package org.robovm.debugger;

import org.robovm.compiler.config.Config;
import org.robovm.compiler.plugin.LaunchPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.target.LaunchParameters;

import java.util.ArrayList;
import java.util.List;

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

    }

    @Override
    public void afterLaunch(Config config, LaunchParameters parameters, Process process) {

    }

    @Override
    public void launchFailed(Config config, LaunchParameters parameters) {

    }

    @Override
    public void cleanup() {

    }
}
