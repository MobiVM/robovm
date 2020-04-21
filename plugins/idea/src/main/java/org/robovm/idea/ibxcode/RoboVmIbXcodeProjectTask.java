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
package org.robovm.idea.ibxcode;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompilerManager;
import com.intellij.openapi.compiler.CompilerPaths;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.OrderEnumerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.robovm.compiler.config.Config;
import org.robovm.ibxcode.IBXcodeProject;
import org.robovm.idea.RoboVmPlugin;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class RoboVmIbXcodeProjectTask {
    private static final AtomicBoolean busy = new AtomicBoolean(false);
    private final Module module;
    private Config.Builder builder;
    private Config config;

    public RoboVmIbXcodeProjectTask(Module module) {
        this.module = module;
    }

    public static boolean isBusy() {
        return busy.get();
    }

    public void generateProject() {
        // mark as busy
        busy.set(true);

        // prepare config
        Project project = this.module.getProject();
        File moduleBaseDir = RoboVmPlugin.getModuleBaseDir(module);

        // load the robovm.xml file
        try {
            this.builder = new IBConfigBuilder();
            this.builder.logger(RoboVmPlugin.getLogger(project));
            this.builder.readProjectProperties(moduleBaseDir, false);
            this.builder.readProjectConfig(moduleBaseDir, false);
        } catch (IOException e) {
            this.complete(e);
            return;
        }

        // compile module
        CompilerManager.getInstance(project).make(module, (aborted, errors, warnings, compileContext) -> {
            if (aborted) {
                RoboVmPlugin.logDebug(project, "XCode project: compilation aborted");
                complete((String)null);
            } else if (errors > 0) {
                complete("XCode project generation failed due compilation errors");
            } else {
                startGeneratingWithClassPath(compileContext);
            }
        });
    }

    private void startGeneratingWithClassPath(CompileContext context) {
        Set<File> classPaths = new LinkedHashSet<>();
        // Use the libs from the SDK (but not RT)
        for(File path: RoboVmPlugin.getSdkLibrariesWithoutSources()) {
            if(!RoboVmPlugin.isBootClasspathLibrary(path)) {
                classPaths.add(path);
            }
        }

        // gather the boot and user classpaths. RoboVM RT libs may be
        // specified in a Maven/Gradle build file, in which case they'll
        // turn up as order entries. We filter them out here.
        OrderEnumerator classes = ModuleRootManager.getInstance(module).orderEntries().recursively().withoutSdk().compileOnly().productionOnly();
        for (String path : classes.getPathsList().getPathList()) {
            if (!RoboVmPlugin.isSdkLibrary(path)) {
                classPaths.add(new File(path));
            }
        }

        // add the output dirs of all affected modules to the
        // classpath. IDEA will make the output directory
        // of a module an order entry after the first compile
        // so we add the path twice. Fixed by using a set.
        // FIXME junit needs to include test output directories
        for (Module mod : context.getCompileScope().getAffectedModules()) {
            String path = CompilerPaths.getModuleOutputPath(mod, false);
            if (path != null && !path.isEmpty()) {
                classPaths.add(new File(path));
            } else {
                RoboVmPlugin.logWarn(context.getProject(), "Output path of module %s not defined", mod.getName());
            }
        }

        // set the user classpath entries
        builder.clearBootClasspathEntries();
        builder.clearClasspathEntries();
        for (File path : classPaths) {
            RoboVmPlugin.logInfo(context.getProject(), "classpath entry: %s", path.getAbsolutePath());
            builder.addClasspathEntry(path);
        }

        // no need to add RT from the SDK as it will be removed
        // start background task that will work with converter
        try {
            config = builder.build();
        } catch (IOException e) {
            complete(e);
            return;
        }

        ProgressManager.getInstance().run(new BackgroundTaskMonitor());
    }


    private void complete(@NotNull Throwable e) {
        complete(e.getMessage());
    }

    private void complete(@Nullable String errorMessage) {
        // single exit point
        if (errorMessage != null) {
            Notifications.Bus.notify(new Notification( "XCode project", "XCode project",
                    "Failed due error: " + errorMessage, NotificationType.ERROR));
        }

        busy.set(false);
    }


    private class BackgroundTaskMonitor extends Task.Backgroundable {
        Throwable exceptionIfHappened;
        BackgroundTaskMonitor() {
            super(module.getProject(), "RoboVm Xcode Project Generator Task");
        }

        @Override
        public void run(@NotNull ProgressIndicator progress) {
            progress.setText("Generating XCode project");

            TaskThread taskThread = new TaskThread();
            taskThread.start();
            try {
                while (taskThread.isAlive() && !progress.isCanceled()) {
                    taskThread.join(500);
                }
                if (taskThread.isAlive()) {
                    taskThread.interrupt();
                    taskThread.join(500);
                }
                if (taskThread.throwable instanceof IOException) {
                    throw (IOException) taskThread.throwable;
                } else if (taskThread.throwable instanceof RuntimeException) {
                    throw (RuntimeException) taskThread.throwable;
                } else if (taskThread.throwable instanceof Error) {
                    throw (Error) taskThread.throwable;
                } else if (taskThread.throwable != null) {
                    throw new RuntimeException(taskThread.throwable);
                }
            } catch (InterruptedException | IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void onCancel() {
            super.onCancel();
        }

        @Override
        public void onSuccess() {
            super.onSuccess();
        }

        @Override
        public void onThrowable(@NotNull Throwable error) {
            super.onThrowable(error);
            exceptionIfHappened = error;
        }

        @Override
        public void onFinished() {
            super.onFinished();
            complete(exceptionIfHappened != null ? exceptionIfHappened.getMessage() : null);
        }
    }


    /**
     * {@link Thread} which calls {@link IBXcodeProject#generate(File, File, String, boolean)} ()} and waits for it
     * to finish.
     */
    class TaskThread extends Thread {
        private Throwable throwable;

        TaskThread() {
            super(RoboVmIbXcodeProjectTask.class.getSimpleName() + ".thread");
        }

        @Override
        public void run() {
            try {
                IBXcodeProject ibXcodeProject = new IBXcodeProject(config);
                File xcodeDir = RoboVmPlugin.getModuleXcodeDir(module);
                File exportDir = new File(xcodeDir, ".ib");
                ibXcodeProject.generate(RoboVmPlugin.getModuleBaseDir(module), exportDir, module.getName(), true);
            } catch (Throwable t) {
                this.throwable = t;
            }
        }
    }


    static class IBConfigBuilder extends Config.Builder {
        IBConfigBuilder() {
        }

        @Override
        public Config build() {
            // do not build any complex config as it is time consuming and not required at all for this task
            return this.config;
        }
    }
}


