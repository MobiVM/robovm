package org.robovm.compiler.plugin;

import org.robovm.compiler.Linker;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.llvm.ObjectFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Plugins that release resources/caches once these are not needed
 */
public class BuildGarbageCollectorPlugin extends AbstractCompilerPlugin {
    private static final String ARG_KEY_ENABLE_PLUGIN = "enable";
    private Boolean enabled;

    @Override
    public PluginArguments getArguments() {
        List<PluginArgument> args = new ArrayList<>();
        args.add(new PluginArgument(ARG_KEY_ENABLE_PLUGIN, "false", "Flag: disables releasing compilation caches as soon as not needed"));
        return new PluginArguments("buildGC", args);
    }

    private boolean isEnabled(Config config) {
        if (enabled == null) {
            enabled = argumentValue(parseArguments(config), ARG_KEY_ENABLE_PLUGIN, true);
        }
        return enabled;
    }

    @Override
    public void afterClassDependenciesResolved(Config config, Clazz clazz) {
        if (isEnabled(config)) {
            // at this moment this class is processed and all dependency information not required any more
            // can be dropped to reduce memory usage
            clazz.getClazzInfo().dropDependencyData();
        }
    }

    @Override
    public void afterObjectFile(Config config, Clazz clazz, File objectFile, ObjectFile objectFileData) throws IOException {
        if (isEnabled(config)) {
            // remove all soot structures that are not
            // required anymore but consume memory
            clazz.shrinkSoot();
        }
    }

    @Override
    public void beforeLinker(Config config, Linker linker, Set<Clazz> classes) {
        if (isEnabled(config)) {
            // reset anything that can be retained by Soot library. As it keeps structures that are not required
            // any more
            // this to be called here as some plugins (like Framework Target) use classes cache during linkage
            config.getClazzes().disposeSoot();
        }
    }

    @Override
    public void afterLinker(Config config, File executable) throws IOException {
        if (isEnabled(config)) {
            // dispose compilation data that is not required anymore (clazzes, dependency trie etc)
            config.disposeBuildData();
        }
    }
}
