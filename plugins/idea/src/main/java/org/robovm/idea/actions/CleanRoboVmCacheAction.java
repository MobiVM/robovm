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
package org.robovm.idea.actions;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.robovm.idea.ibxcode.RoboVmIbXcodeProjectTask;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Action command to clean cache. Due different kind of problems this is often required operation
 */
public class CleanRoboVmCacheAction extends AnAction {
    private static AtomicBoolean busy = new AtomicBoolean(false);

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        if (!busy.get())
            ProgressManager.getInstance().run(new CleanTask());
    }

    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setEnabled(!busy.get());
    }

    /**
     * background task that cleans cache directory
     */
    private static class CleanTask extends Task.Backgroundable {
        Throwable exceptionIfHappened;
        CleanTask() {
            super(null, "RoboVM Cache Clearer");
        }

        @Override
        public void run(@NotNull ProgressIndicator progress) {
            busy.set(true);
            progress.setText("Clearing RoboVM cache (~/.robovm/cache)");
            progress.setFraction(0.5);

            File file = new File(System.getProperty("user.home"), ".robovm/cache");
            try {
                FileUtils.deleteDirectory(file);
            } catch (IOException e) {
            }
        }

        @Override
        public void onError(@NotNull Exception error) {
            super.onError(error);
            exceptionIfHappened = error;
        }

        @Override
        public void onFinished() {
            super.onFinished();

            // single exit point
            if (exceptionIfHappened != null) {
                Notifications.Bus.notify(new Notification( "RoboVM", "RoboVM Cache Clearer",
                        "Failed due error: " + exceptionIfHappened.getMessage(), NotificationType.ERROR));
            }

            busy.set(false);
        }
    }
}
