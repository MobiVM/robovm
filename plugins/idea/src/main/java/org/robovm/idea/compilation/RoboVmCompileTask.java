/*
 * Copyright (C) 2015 RoboVM AB
 * Copyright (C) 2018 Daniel Thommes, NeverNull GmbH, <daniel.thommes@nevernull.io>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.idea.compilation;

import com.intellij.compiler.options.CompileStepBeforeRun;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileTask;
import com.intellij.openapi.compiler.CompilerMessageCategory;
import com.intellij.openapi.compiler.CompilerPaths;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.OrderEnumerator;
import com.intellij.openapi.roots.OrderRootsEnumerator;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.util.Computable;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.io.FileUtils;
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.target.ConsoleTarget;
import org.robovm.compiler.target.ios.IOSTarget;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.idea.RoboVmPlugin;
import org.robovm.idea.actions.CreateFrameworkAction;
import org.robovm.idea.actions.CreateIpaAction;
import org.robovm.idea.running.RoboVmRunConfiguration;
import org.robovm.idea.running.RoboVmIOSRunConfigurationSettingsEditor;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.*;

/**
 * Registered by {@link org.robovm.idea.RoboVmPlugin} on startup. Responsible
 * for compiling an app in case there's a run configuration in the {@link com.intellij.openapi.compiler.CompileContext}
 * or if we perform an ad-hoc/IPA build from the RoboVM menu.
 */
public class RoboVmCompileTask implements CompileTask {
    // A list of languages (other than java) for which we might expect to find .class files. Idea compiles these into separate directories,
    // but only provides the /classes/java/main in the list of classpaths.
    private static final String[] jvmLangs = {"groovy", "scala", "kotlin"};

    @Override
    public boolean execute(CompileContext context) {
        if(context.getMessageCount(CompilerMessageCategory.ERROR) > 0) {
            RoboVmPlugin.logError(context.getProject(), "Can't compile application due to previous compilation errors");
            return false;
        }

        RunConfiguration c = context.getCompileScope().getUserData(CompileStepBeforeRun.RUN_CONFIGURATION);
        if(c == null || !(c instanceof RoboVmRunConfiguration)) {
            CreateIpaAction.IpaConfig ipaConfig = context.getCompileScope().getUserData(CreateIpaAction.IPA_CONFIG_KEY);
            if(ipaConfig != null) {
                return compileForIpa(context, ipaConfig);
            }

            CreateFrameworkAction.FrameworkConfig frameworkConfig = context.getCompileScope().getUserData(CreateFrameworkAction.FRAMEWORK_CONFIG_KEY);
            if (frameworkConfig != null) {
                return compileForFramework(context, frameworkConfig);
            }

            return true;
        } else {
            return compileForRunConfiguration(context, (RoboVmRunConfiguration)c);
        }
    }

    private boolean compileForIpa(CompileContext context, final CreateIpaAction.IpaConfig ipaConfig) {
        try {
            ProgressIndicator progress = context.getProgressIndicator();
            context.getProgressIndicator().pushState();
            RoboVmPlugin.focusToolWindow(context.getProject());
            progress.setText("Creating IPA");

            RoboVmPlugin.logInfo(context.getProject(), "Creating package in " + ipaConfig.getDestinationDir().getAbsolutePath() + " ...");

            Config.Builder builder = new Config.Builder();
            builder.logger(RoboVmPlugin.getLogger(context.getProject()));
            File moduleBaseDir = RoboVmPlugin.getModuleBaseDir(ipaConfig.getModule());

            // load the robovm.xml file
            loadConfig(context.getProject(), builder, moduleBaseDir, false);
            builder.os(OS.ios);
            builder.archs(ipaConfig.getArchs());

            builder.installDir(ipaConfig.getDestinationDir());
            builder.iosSignIdentity(SigningIdentity.find(SigningIdentity.list(), ipaConfig.getSigningIdentity()));
            if (ipaConfig.getProvisioningProfile() != null) {
                builder.iosProvisioningProfile(ProvisioningProfile.find(ProvisioningProfile.list(), ipaConfig.getProvisioningProfile()));
            }
            configureClassAndSourcepaths(context, builder, ipaConfig.getModule());
            builder.home(RoboVmPlugin.getRoboVmHome());
            Config config = builder.build();

            progress.setFraction(0.5);

            AppCompiler compiler = new AppCompiler(config);
            RoboVmCompilerThread thread = new RoboVmCompilerThread(compiler, progress) {
                protected void doCompile() throws Exception {
                    compiler.build();
                    compiler.archive();
                }
            };
            thread.compile();

            if(progress.isCanceled()) {
                RoboVmPlugin.logInfo(context.getProject(), "Build canceled");
                return false;
            }

            progress.setFraction(1);
            RoboVmPlugin.logInfo(context.getProject(), "Package successfully created in " + ipaConfig.getDestinationDir().getAbsolutePath());
        } catch(Throwable t) {
            RoboVmPlugin.logErrorThrowable(context.getProject(), "Couldn't create IPA", t, false);
            return false;
        } finally {
            context.getProgressIndicator().popState();
        }
        return true;
    }

    private boolean compileForFramework(CompileContext context, final CreateFrameworkAction.FrameworkConfig frameworkConfig) {
        try {
            ProgressIndicator progress = context.getProgressIndicator();
            context.getProgressIndicator().pushState();
            RoboVmPlugin.focusToolWindow(context.getProject());
            progress.setText("Creating Framework");

            RoboVmPlugin.logInfo(context.getProject(), "Creating package in " + frameworkConfig.getDestinationDir().getAbsolutePath() + " ...");

            Config.Builder builder = new Config.Builder();
            builder.logger(RoboVmPlugin.getLogger(context.getProject()));
            File moduleBaseDir = RoboVmPlugin.getModuleBaseDir(frameworkConfig.getModule());

            // load the robovm.xml file
            loadConfig(context.getProject(), builder, moduleBaseDir, false);
            builder.os(OS.ios);
            builder.installDir(frameworkConfig.getDestinationDir());
            configureClassAndSourcepaths(context, builder, frameworkConfig.getModule());

            // Set the Home to be used, create the Config and AppCompiler
            Config.Home home = RoboVmPlugin.getRoboVmHome();
            if(home.isDev()) {
                builder.useDebugLibs(true);
                builder.dumpIntermediates(true);
                builder.addPluginArgument("debug:logconsole=true");
            }
            builder.home(home);

            Config config = builder.build();

            progress.setFraction(0.5);

            AppCompiler compiler = new AppCompiler(config);
            RoboVmCompilerThread thread = new RoboVmCompilerThread(compiler, progress) {
                protected void doCompile() throws Exception {
                    compiler.build();
                    compiler.install();
                }
            };
            thread.compile();

            if(progress.isCanceled()) {
                RoboVmPlugin.logInfo(context.getProject(), "Build canceled");
                return false;
            }

            progress.setFraction(1);
            RoboVmPlugin.logInfo(context.getProject(), "Framework successfully created in " + frameworkConfig.getDestinationDir().getAbsolutePath());
        } catch(Throwable t) {
            RoboVmPlugin.logErrorThrowable(context.getProject(), "Couldn't create Framework", t, false);
            return false;
        } finally {
            context.getProgressIndicator().popState();
        }
        return true;
    }

    private boolean compileForRunConfiguration(CompileContext context, final RoboVmRunConfiguration runConfig) {
        try {
            ProgressIndicator progress = context.getProgressIndicator();
            context.getProgressIndicator().pushState();
            RoboVmPlugin.focusToolWindow(context.getProject());
            progress.setText("Compiling RoboVM app");

            Config.Builder builder = new Config.Builder();
            builder.logger(RoboVmPlugin.getLogger(context.getProject()));

            // get the module we are about to compile
            ModuleManager moduleManager = ModuleManager.getInstance(runConfig.getProject());
            Module module = ApplicationManager.getApplication().runReadAction(new Computable<Module>() {
                @Override
                public Module compute() {
                    return ModuleManager.getInstance(runConfig.getProject()).findModuleByName(runConfig.getModuleName());
                }
            });
            if(module == null) {
                RoboVmPlugin.logBalloon(context.getProject(), MessageType.ERROR, "Couldn't find Module '" + runConfig.getModuleName() + "'");
                return false;
            }
            File moduleBaseDir = RoboVmPlugin.getModuleBaseDir(module);

            // load the robovm.xml file
            loadConfig(context.getProject(), builder, moduleBaseDir, false);

            // set OS and arch
            OS os = null;
            Arch arch = null;
            if(runConfig.getTargetType() == RoboVmRunConfiguration.TargetType.Device) {
                os = OS.ios;
                arch = runConfig.getDeviceArch();
            } else if(runConfig.getTargetType() == RoboVmRunConfiguration.TargetType.Simulator) {
                os = OS.ios;
                arch = runConfig.getSimArch();
            } else {
                os = OS.getDefaultOS();
                arch = Arch.getDefaultArch();
            }
            builder.os(os);
            builder.arch(arch);

            // set the plugin args
            List<String> args = splitArgs(runConfig.getArguments());
            applyPluginArguments(args, builder);

            // set build dir and install dir, pattern
            // module-basedir/robovm-build/tmp/module-name/runconfig-name/os/arch.
            // module-basedir/robovm-build/app/module-name/runconfig-name/os/arch.
            File buildDir = RoboVmPlugin.getModuleBuildDir(module, runConfig.getName(), os, arch);
            builder.tmpDir(buildDir);
            builder.skipInstall(true);
            RoboVmPlugin.logInfo(context.getProject(), "Building executable in %s", buildDir.getAbsolutePath());
            RoboVmPlugin.logInfo(context.getProject(), "Installation of app in %s", buildDir.getAbsolutePath());

            // setup classpath entries, debug build parameters and target
            // parameters, e.g. signing identity etc.
            configureClassAndSourcepaths(context, builder, module);
            configureDebugging(builder, runConfig, module);
            configureTarget(builder, runConfig);

            // Set the Home to be used, create the Config and AppCompiler
            Config.Home home = RoboVmPlugin.getRoboVmHome();
            if(home.isDev()) {
                builder.useDebugLibs(true);
                builder.dumpIntermediates(true);
                builder.addPluginArgument("debug:logconsole=true");
            }
            builder.home(home);

            // mark that prepare for launch was done already performed and no need to do it during launch
            // this is required to unfreeze IDEA as prepareForLaunch is called in blocking manner that is
            // against contract
            builder.manuallyPreparedForLaunch(true);

            Config config = builder.build();

            // clean build dir if smartSkipRebuild is disabled
            if(!config.isSmartSkipRebuild()){
                RoboVmPlugin.logInfo(context.getProject(), "Cleaning output dir " + buildDir.getAbsolutePath());
                FileUtils.deleteDirectory(buildDir);
                buildDir.mkdirs();
            }

            AppCompiler compiler = new AppCompiler(config);
            if(progress.isCanceled()) {
                RoboVmPlugin.logInfo(context.getProject(), "Build canceled");
                return false;
            }
            progress.setFraction(0.5);

            // Start the build in a separate thread, check if
            // user canceled it.
            RoboVmCompilerThread thread = new RoboVmCompilerThread(compiler, progress) {
                protected void doCompile() throws Exception {
                    compiler.build();
                    // perform prepare for launch here, as doing this in lauch task will block UI due bad design
                    if (config.getTarget().canLaunch()) {
                        long start = System.currentTimeMillis();
                        config.getTarget().prepareLaunch();
                        long duration = System.currentTimeMillis() - start;
                        config.getLogger().info("Prepared for launch in %.2f seconds", duration / 1000.0);
                    }
                }
            };
            thread.compile();
            if(progress.isCanceled()) {
                RoboVmPlugin.logInfo(context.getProject(), "Build canceled");
                return false;
            }
            RoboVmPlugin.logInfo(context.getProject(), "Build done");

            // set the config and compiler on the run configuration so
            // it knows where to find things.
            runConfig.setConfig(config);
            runConfig.setCompiler(compiler);
            runConfig.setProgramArguments(args);
        } catch(Throwable t) {
            RoboVmPlugin.logErrorThrowable(context.getProject(), "Couldn't compile app", t, false);
            return false;
        } finally {
            context.getProgressIndicator().popState();
        }
        return true;
    }

    private void addClassPath(String path, Set<File> classPaths) {
        File f = new File(path);
        if(f.exists())
            classPaths.add(f);
        // if this refers to a java class path, add paths for other JVM languages as well
        if(path.contains("/classes/java/")) {
            for(String jvmLang: jvmLangs) {
                File filePath = new File(path.replace("/java/", "/" + jvmLang + "/"));
                if(filePath.exists()) {
                    classPaths.add(filePath);
                }
            }
        }
    }

    private void configureClassAndSourcepaths(CompileContext context, Config.Builder builder, Module module) {
        // gather the boot and user classpaths. RoboVM RT libs may be
        // specified in a Maven/Gradle build file, in which case they'll
        // turn up as order entries. We filter them out here.
        // FIXME junit needs to include test classes
        OrderEnumerator classes = ModuleRootManager.getInstance(module).orderEntries().recursively().withoutSdk().compileOnly().productionOnly();
        Set<File> classPaths = new HashSet<File>();
        Set<File> bootClassPaths = new HashSet<File>();
        for(String path: classes.getPathsList().getPathList()) {
            if(!RoboVmPlugin.isSdkLibrary(path)) {
                addClassPath(path, classPaths);
            }
        }

        // add the output dirs of all affected modules to the
        // classpath. IDEA will make the output directory
        // of a module an order entry after the first compile
        // so we add the path twice. Fixed by using a set.
        // FIXME junit needs to include test output directories
        for(Module mod: context.getCompileScope().getAffectedModules()) {
            String path = CompilerPaths.getModuleOutputPath(mod, false);
            if(path != null && !path.isEmpty()) {
                addClassPath(path, classPaths);
            } else {
                RoboVmPlugin.logWarn(context.getProject(), "Output path of module %s not defined", mod.getName());
            }
        }

        // set the user classpath entries
        for(File path: classPaths) {
            RoboVmPlugin.logInfo(context.getProject(), "classpath entry: %s", path.getAbsolutePath());
            builder.addClasspathEntry(path);
        }

        // Use the RT from the SDK
        RoboVmPlugin.logInfo(context.getProject(), "Using SDK boot classpath");
        for(File path: RoboVmPlugin.getSdkLibrariesWithoutSources()) {
            if(RoboVmPlugin.isBootClasspathLibrary(path)) {
                builder.addBootClasspathEntry(path);
            } else {
                builder.addClasspathEntry(path);
            }
        }
    }

    private void configureDebugging(Config.Builder builder, RoboVmRunConfiguration runConfig, Module module) {
        // setup debug configuration if necessary
        if(runConfig.isDebug()) {
            Set<String> sourcesPaths = new HashSet<String>();

            // source paths of dependencies and modules
            OrderRootsEnumerator sources = ModuleRootManager.getInstance(module).orderEntries().recursively().withoutSdk().sources();
            for (String path : sources.getPathsList().getPathList()) {
                RoboVmPlugin.logInfo(module.getProject(), "source path entry: %s", path);
                sourcesPaths.add(path);
            }

            StringBuilder b = new StringBuilder();
            // SDK sourcepaths
            for(File path: RoboVmPlugin.getSdkLibrarySources()) {
                b.append(path.getAbsolutePath());
                b.append(":");
            }

            for(String path: sourcesPaths) {
                b.append(path);
                b.append(":");
            }

            // set arguments for debug plugin
            runConfig.setDebugPort(findFreePort());
            builder.debug(true);
            builder.addPluginArgument("debug:sourcepath=" + b.toString());
            builder.addPluginArgument("debug:jdwpport=" + runConfig.getDebugPort());
            builder.addPluginArgument("debug:clientmode=true");
            builder.addPluginArgument("debug:logdir=" + RoboVmPlugin.getModuleLogDir(module).getAbsolutePath());
        }
    }

    private void configureTarget(Config.Builder builder, RoboVmRunConfiguration runConfig) {
        if(runConfig.getTargetType() == RoboVmRunConfiguration.TargetType.Device) {
            // configure device build
            builder.targetType(IOSTarget.TYPE);
            String signingId = runConfig.getSigningIdentity();
            String profile = runConfig.getProvisioningProfile();
            if (RoboVmIOSRunConfigurationSettingsEditor.SKIP_SIGNING.equals(signingId)) {
                builder.iosSkipSigning(true);
            } else {
                if (signingId != null && !RoboVmIOSRunConfigurationSettingsEditor.AUTO_SIGNING_IDENTITY.equals(signingId)) {
                    builder.iosSignIdentity(SigningIdentity.find(SigningIdentity.list(), signingId));
                }
                if (profile != null && !RoboVmIOSRunConfigurationSettingsEditor.AUTO_PROVISIONING_PROFILE.equals(profile)) {
                    builder.iosProvisioningProfile(ProvisioningProfile.find(ProvisioningProfile.list(), profile));
                }
            }
        } else if(runConfig.getTargetType() == RoboVmRunConfiguration.TargetType.Simulator) {
            builder.targetType(IOSTarget.TYPE);
        } else if(runConfig.getTargetType() == RoboVmRunConfiguration.TargetType.Console) {
            builder.targetType(ConsoleTarget.TYPE);
        } else {
            throw new RuntimeException("Unsupported target type: " + runConfig.getTargetType());
        }
    }

    public static Config.Builder loadConfig(Project project, Config.Builder configBuilder, File projectRoot, boolean isTest) {
        try {
            configBuilder.readProjectProperties(projectRoot, isTest);
            configBuilder.readProjectConfig(projectRoot, isTest);
        } catch (IOException e) {
            RoboVmPlugin.logErrorThrowable(project, "Couldn't load robovm.xml", e, true);
            throw new RuntimeException(e);
        }

        // Ignore classpath entries in config XML file.
        configBuilder.clearBootClasspathEntries();
        configBuilder.clearClasspathEntries();

        return configBuilder;
    }

    public int findFreePort()
    {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(0);
            return socket.getLocalPort();
        } catch (IOException localIOException2) {
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException localIOException4) {
                }
            }
        }
        return -1;
    }

    private static String unquoteArg(String arg) {
        if (arg.startsWith("\"") && arg.endsWith("\"")) {
            return arg.substring(1, arg.length() - 1);
        }
        return arg;
    }

    public static List<String> splitArgs(String args) {
        if (args == null || args.trim().length() == 0) {
            return new ArrayList<String>();
        }
        String[] parts = CommandLine.parse("foo " + args).toStrings();
        if (parts.length <= 1) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<String>(parts.length - 1);
        for (int i = 1; i < parts.length; i++) {
            result.add(unquoteArg(parts[i]));
        }
        return result;
    }

    /**
     * Filters any plugin arguments and sets them on the provided builder
     * @param args
     * @param configBuilder builder or null to filter the args list
     */
    public static void applyPluginArguments(List<String> args, Config.Builder configBuilder) {
        Map<String, PluginArgument> pluginArguments = configBuilder.fetchPluginArguments();
        Iterator<String> iter = args.iterator();
        while (iter.hasNext()) {
            String arg = iter.next();
            if (!arg.startsWith("-rvm") && arg.startsWith("-")) {
                String argName = arg.substring(1);
                if (argName.contains("=")) {
                    argName = argName.substring(0, argName.indexOf('='));
                }
                PluginArgument pluginArg = pluginArguments.get(argName);
                if (pluginArg != null) {
                    if(configBuilder != null) {
                        configBuilder.addPluginArgument(arg.substring(1));
                        iter.remove();
                    }
                }
            }
        }
    }
}
