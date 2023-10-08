package org.robovm.idea.inspection;

import com.intellij.codeInspection.*;
import com.intellij.openapi.project.Project;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiAnonymousClass;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiIdentifier;
import org.jetbrains.annotations.NotNull;
import org.robovm.idea.inspection.quickfix.ChangeSuperClassFix;
import org.robovm.idea.inspection.quickfix.NavigateToClassFix;

import java.util.*;

/**
 * Simple inspection that check Java objects that implement NSObjectProtocol and
 * doesn't extend NSObject
 * @see #checkClass(PsiClass, InspectionManager, boolean)  for comments
 * @author dkimitsa
 */
public class ClassWithProtocolShouldExtendNSObject extends AbstractBaseJavaLocalInspectionTool {
    @Override
    public ProblemDescriptor[] checkClass(@NotNull PsiClass cls, @NotNull InspectionManager manager, boolean isOnTheFly) {
        try {
            // ignore: annotations, interfaces and anonymous classes
            if (cls instanceof PsiAnonymousClass || cls.isInterface() || cls.isAnnotationType())
                return null;

            // skip if unable to get class name identifier and build the message
            PsiIdentifier classNameIdentifier = cls.getNameIdentifier();
            if (classNameIdentifier == null)
                return null;

            // if extends from NSObject -- do nothing
            LinkedList<PsiClass> clsHierarchy = new LinkedList<>();
            if (RvmCommonUtils.clsExtends(cls, RvmCommonClassNames.NSObject, clsHierarchy))
                return null;

            // check hierarchy and if there is any class with @Marshaler annotation -- skip case
            for (PsiClass c : clsHierarchy)
                if (c.getAnnotation(RvmCommonClassNames.Marshaler) != null)
                    return null;

            // move from bottom of hierarchy to find first class that implements NSObjectProtocol
            PsiClass clsWithProtocol = null;
            ListIterator<PsiClass> it = clsHierarchy.listIterator(clsHierarchy.size());
            while (it.hasPrevious()) {
                PsiClass c = it.previous();
                if (RvmCommonUtils.clsImplements(c, RvmCommonClassNames.NSObjectProtocol, true)) {
                    clsWithProtocol = c;
                    break;
                }
            }

            //  if class doesn't implement NSProtocol -- do nothing
            if (clsWithProtocol == null || clsWithProtocol.getName() == null)
                return null;


            ProblemDescriptor[] problemDescriptors = null;
            if (clsWithProtocol == clsHierarchy.getLast()) {
                // class implements protocol and directly extends from java.lang.Object
                // this class will be promoted to NSObject. Attach warning.
                if (clsWithProtocol == cls) {
                    // its same class under analyze, propose switch to NSObject supper as a quick-fix
                    // show as warning
                    Project project = cls.getProject();
                    PsiClass NSObjectCls = JavaPsiFacade.getInstance(project).findClass(RvmCommonClassNames.NSObject,
                            cls.getResolveScope());
                    if (NSObjectCls != null) {
                        LocalQuickFix fix = new ChangeSuperClassFix(NSObjectCls);
                        String description = RvmInspectionBundle.message("robovm.inspection.objcprotocol.shouldbe.in.nsobject");
                        ProblemDescriptor p = manager.createProblemDescriptor(classNameIdentifier,
                                description, fix, ProblemHighlightType.WARNING, false);
                        problemDescriptors = new ProblemDescriptor[]{p};
                    }
                } else {
                    // protocol was declared in one of the supers, but its fixable, propose navigate to
                    // that super as quick fix
                    // show as warning
                    LocalQuickFix fix = new NavigateToClassFix(clsWithProtocol, clsWithProtocol.getName());
                    String description = RvmInspectionBundle.message("robovm.inspection.objcprotocol.parent.should.extend.nsobject",
                            cls.getName(), clsWithProtocol.getName());
                    ProblemDescriptor p = manager.createProblemDescriptor(classNameIdentifier,
                            description, fix, ProblemHighlightType.WARNING, false);
                    problemDescriptors = new ProblemDescriptor[]{p};
                }
            } else {
                // class has intermediate super between it and java.lang.Object and can't be promoted
                // the class can't be promoted and will cause error runtime
                String description;
                if (cls == clsWithProtocol) {
                    description = RvmInspectionBundle.message("robovm.inspection.objcprotocol.should.extend.object.or.nsobject.error",
                            cls.getName(), clsWithProtocol.getName());
                } else {
                    description = RvmInspectionBundle.message("robovm.inspection.objcprotocol.parent.should.extend.object.or.nsobject.error",
                            cls.getName(), clsWithProtocol.getName());
                }
                ProblemDescriptor p = manager.createProblemDescriptor(classNameIdentifier,
                        description, (LocalQuickFix) null, ProblemHighlightType.ERROR, false);
                problemDescriptors = new ProblemDescriptor[]{p};
            }

            return problemDescriptors;
        } catch (Exception e) {
            throw e;
        }
    }
}
