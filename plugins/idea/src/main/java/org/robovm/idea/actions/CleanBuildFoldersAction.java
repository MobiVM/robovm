/*
 * Copyright (C) 2018 Daniel Thommes, NeverNull GmbH, <daniel.thommes@nevernull.io>
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
package org.robovm.idea.actions;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.robovm.compiler.target.ios.IOSTarget;
import org.robovm.idea.RoboVmPlugin;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Action command to clean cache. Due different kind of problems this is often required operation
 */
public class CleanBuildFoldersAction extends AnAction {
    private static AtomicBoolean busy = new AtomicBoolean(false);

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        if (!busy.get()) {
            ProgressManager.getInstance().run(new CleanTask(anActionEvent.getProject()));
        }
    }

    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setEnabled(!busy.get());
    }

    /**
     * background task that cleans build directories
     */
    private static class CleanTask extends Task.Backgroundable {
        Throwable exceptionIfHappened;
        private Project project;

        CleanTask(Project project) {
            super(null, "RoboVM Build Folder Clearer");
            this.project = project;
        }

        @Override
        public void run(@NotNull ProgressIndicator progress) {
            busy.set(true);
            progress.setText("Cleaning RoboVM build folders");
            progress.setFraction(0.5);
            try {
                for (Module module : RoboVmPlugin.getRoboVmModules(project, IOSTarget.TYPE)) {
                    File moduleBaseDir = RoboVmPlugin.getModuleBaseDir(module);
                    File robovmBuildDir = new File(moduleBaseDir, "robovm-build");
                    FileUtils.deleteDirectory(robovmBuildDir);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                //Refresh the module folder, so that we see, it has happened
                project.getBaseDir().refresh(false, true);
            }
        }

        @Override
        public void onThrowable(@NotNull Throwable error) {
            super.onThrowable(error);
            exceptionIfHappened = error;
        }

        @Override
        public void onFinished() {
            super.onFinished();

            // single exit point
            if (exceptionIfHappened != null) {
                Notifications.Bus.notify(new Notification("RoboVM", "RoboVM Cache Build Folder Clearer",
                        "Failed due error: " + exceptionIfHappened.getMessage(), NotificationType.ERROR));
            }

            busy.set(false);
        }
    }
}
