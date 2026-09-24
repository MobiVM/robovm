package org.robovm.idea.inspection.quickfix;

import com.intellij.codeInsight.FileModificationService;
import com.intellij.codeInsight.intention.HighPriorityAction;
import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.codeInspection.ProblemDescriptor;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.JavaCodeStyleManager;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.robovm.idea.inspection.RvmInspectionBundle;

import java.util.Objects;

import static org.robovm.idea.inspection.RvmCommonUtils.getReferences;

/**
 * dkimitsa: code based on com.intellij.compiler.inspection as direct use of it not
 * possible as it seems to be internal class with unstable API
 */
public class ChangeSuperClassFix implements LocalQuickFix, HighPriorityAction {
    @NotNull
    private final SmartPsiElementPointer<PsiClass> myNewSuperClass;
    @NotNull
    private final String myNewSuperName;

    public ChangeSuperClassFix(
            @NotNull PsiClass newSuperClass
    ) {
        final SmartPointerManager smartPointerManager = SmartPointerManager.getInstance(newSuperClass.getProject());
        myNewSuperName = Objects.requireNonNull(newSuperClass.getQualifiedName());
        myNewSuperClass = smartPointerManager.createSmartPsiElementPointer(newSuperClass);
    }

    @NotNull
    @Override
    public String getName() {
        return RvmInspectionBundle.message("robovm.quickfix.make.extends", myNewSuperName);
    }

    @NotNull
    @Override
    public String getFamilyName() {
        return RvmInspectionBundle.message("robovm.inspection.group");
    }

    @Override
    public boolean startInWriteAction() {
        return false;
    }

    @Override
    public void applyFix(@NotNull final Project project, @NotNull final ProblemDescriptor problemDescriptor) {
        final PsiClass newSuperClass = myNewSuperClass.getElement();
        if (newSuperClass == null) return;
        PsiClass aClass = PsiTreeUtil.getParentOfType(problemDescriptor.getPsiElement(), PsiClass.class, false);
        if (aClass == null || !FileModificationService.getInstance().preparePsiElementsForWrite(aClass)) return;
        changeSuperClass(aClass, newSuperClass);
    }

    /**
     * newSuperClass can be interfaces or classes in any combination
     * <p/>
     * 1. does not check that newSuperClass not exists in currently existed supers
     */
    private static void changeSuperClass(@NotNull final PsiClass aClass,
                                         @NotNull final PsiClass newSuperClass) {
        WriteAction.run(() -> addSuperClass(aClass, newSuperClass));
    }

    private static void addSuperClass(
            @NotNull final PsiClass aClass,
            @NotNull final PsiClass newSuperClass
    ) {
        JavaPsiFacade psiFacade = JavaPsiFacade.getInstance(aClass.getProject());
        final PsiClass oldSuperClass = aClass.getSuperClass();
        if (oldSuperClass == null || aClass instanceof PsiAnonymousClass)
            return;

        PsiElementFactory factory = psiFacade.getElementFactory();
        PsiReferenceList extendsList = Objects.requireNonNull(aClass.getExtendsList());
        PsiJavaCodeReferenceElement[] refElements = getReferences(extendsList);
        for (PsiJavaCodeReferenceElement refElement : refElements) {
            if (refElement.isReferenceTo(oldSuperClass)) {
                refElement.delete();
            }
        }

        PsiReferenceList list;
        if (newSuperClass.isInterface() && !aClass.isInterface()) {
            list = aClass.getImplementsList();
        } else {
            list = extendsList;
            PsiJavaCodeReferenceElement[] elements = list.getReferenceElements();
            if (elements.length == 1) {
                PsiClass objectClass = psiFacade.findClass(CommonClassNames.JAVA_LANG_OBJECT, aClass.getResolveScope());
                if (objectClass != null && elements[0].isReferenceTo(objectClass)) {
                    elements[0].delete();
                }
            }
        }
        assert list != null;
        PsiElement ref = list.add(factory.createClassReferenceElement(newSuperClass));
        JavaCodeStyleManager.getInstance(aClass.getProject()).shortenClassReferences(ref);
    }
}
