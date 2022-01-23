package org.robovm.idea.components;

import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentManager;
import com.intellij.ui.content.impl.ContentImpl;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RoboVmToolWindowFactory implements ToolWindowFactory, DumbAware {
    public static final String ID = "RoboVM";
    public static final String Title = "Console";

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ConsoleView consoleView = TextConsoleBuilderFactory.getInstance().createBuilder(project).getConsole();
        Content content = new MyContent(consoleView, Title, true);
        ContentManager contentManager = toolWindow.getContentManager();
        contentManager.addContent(content);
    }

    /**
     * just to keep console instance
     */
    public static class MyContent extends ContentImpl {
        public final ConsoleView consoleView;

        public MyContent(ConsoleView consoleView, @Nullable @Nls(capitalization = Nls.Capitalization.Title) String displayName, boolean isPinnable) {
            super(consoleView.getComponent(), displayName, isPinnable);
            this.consoleView = consoleView;
        }
    }
}
