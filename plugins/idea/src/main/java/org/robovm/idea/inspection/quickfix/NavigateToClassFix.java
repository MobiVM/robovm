package org.robovm.idea.inspection.quickfix;

import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.codeInspection.ProblemDescriptor;
import com.intellij.codeInspection.util.IntentionFamilyName;
import com.intellij.codeInspection.util.IntentionName;
import com.intellij.openapi.project.Project;
import com.intellij.pom.Navigatable;
import org.jetbrains.annotations.NotNull;
import org.robovm.idea.inspection.RvmInspectionBundle;

/**
 * Navigate to class QuickFix
 * @author dkimitsa
 */
public class NavigateToClassFix implements LocalQuickFix {
    @NotNull
    private final Navigatable element;
    @NotNull
    private final String elementName;

    public NavigateToClassFix(@NotNull Navigatable element, @NotNull String elementName) {
        this.element = element;
        this.elementName = elementName;
    }

    @Override
    public @IntentionName
    @NotNull String getName() {
        return RvmInspectionBundle.message("robovm.quickfix.navigate.tofix", elementName);
    }

    @Override
    public @IntentionFamilyName
    @NotNull String getFamilyName() {
        return RvmInspectionBundle.message("robovm.inspection.group");
    }

    @Override
    public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor descriptor) {
        if (element.canNavigateToSource())
            element.navigate(true);
    }
}
