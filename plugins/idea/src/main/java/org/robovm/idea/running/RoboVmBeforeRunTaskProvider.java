package org.robovm.idea.running;

import com.intellij.execution.BeforeRunTask;
import com.intellij.execution.BeforeRunTaskProvider;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.Ref;
import com.intellij.util.concurrency.Semaphore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.robovm.idea.RoboVmIcons;
import org.robovm.idea.RoboVmPlugin;
import org.robovm.idea.compilation.RoboVmCompileTask;

import javax.swing.*;

/**
 * @author dkimitsa
 * Workaround for (Unable to start RoboVM iOS in IntelliJ due to NullPointerException)
 * https://github.com/MobiVM/robovm/issues/242
 * Issue happened if project is gradle driven (e.g. Android one in AndroidStudio3.2 and
 * CompilerTask is not being executed as Idea doesn't controll build process anymore.
 * So this task is added as before run task and it checks if RoboVmCompileTask was invoked
 * and if not -- invokes it
 */
public class RoboVmBeforeRunTaskProvider extends BeforeRunTaskProvider<RoboVmBeforeRunTaskProvider.Task> {
    private static final Key<Task> TaskID = new Key<>("Buildr.BeforeRunTask");

    @Override
    public Key<Task> getId() {
        return TaskID;
    }

    @Override
    public String getName() {
        return "Build RoboVm app";
    }

    @Nullable
    @Override
    public Icon getTaskIcon(Task task) {
        return RoboVmIcons.ROBOVM_SMALL;
    }

    @Override
    public String getDescription(Task task) {
        return "Build RoboVm app";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return RoboVmIcons.ROBOVM_SMALL;
    }

    @Override
    public boolean isConfigurable() {
        return false;
    }

    @Nullable
    @Override
    public Task createTask(@NotNull RunConfiguration runConfiguration) {
        if (runConfiguration instanceof RoboVmRunConfiguration) {
            return new Task(TaskID);
        }
        return null;
    }

    @Override
    public boolean canExecuteTask(@NotNull RunConfiguration configuration, @NotNull Task task) {
        return configuration instanceof RoboVmRunConfiguration;
    }

    @Override
    public boolean executeTask(@NotNull DataContext context, @NotNull final RunConfiguration configuration, @NotNull final ExecutionEnvironment env, @NotNull Task task) {
        final RoboVmRunConfiguration runConfig = (RoboVmRunConfiguration) configuration;
        if (runConfig.getConfig() != null) {
            // configuration is set when RoboVmCompilerTask is executed.
            // in this case there is no need to run this workaround
            return true;
        }

        final Ref<Boolean> result = new Ref<>(Boolean.FALSE);
        final Exception[] exception = {null};
        final Semaphore done = new Semaphore();
        done.down();

        ProgressManager.getInstance().run(new com.intellij.openapi.progress.Task.Backgroundable(env.getProject(), "Building RoboVM Project ", true) {
            @Override
            public void run(@NotNull ProgressIndicator progressIndicator) {
                try {
                    result.set(RoboVmCompileTask.compileForRunConfiguration(env.getProject(), null, progressIndicator, runConfig));
                } catch (Exception e) {
                    exception[0] = e;
                } finally {
                    done.up();
                }
            }
        });

        done.waitFor();
        if (exception[0] != null) {
            RoboVmPlugin.logErrorThrowable(env.getProject(), "Couldn't compile app", exception[0], false);
        }

        return result.get();
    }

    static class Task extends BeforeRunTask<Task> {
        Task(@NotNull Key<Task> providerId) {
            super(providerId);
            setEnabled(true);
        }
    }
}
