package org.robovm.idea.inspection;

import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class RvmCommonUtils {
    private RvmCommonUtils() {
    }

    /**
     * Checks if class extends specified class
     *
     * @param cls     to test
     * @param classQN qualified name of class to check if extended
     */
    public static boolean clsExtends(@NotNull PsiClass cls, @NotNull String classQN) {
        return clsExtends(cls, classQN, null);
    }

    /**
     * Checks if class extends specified class
     *
     * @param cls           to test
     * @param classQN       qualified name of class to check if extended
     * @param outHierarchy  if specified -- hierarchy of inheritance will be returned
     *                      excluding java.lang.Object and including cls itself
     */
    public static boolean clsExtends(@NotNull PsiClass cls, @NotNull String classQN, @Nullable List<PsiClass> outHierarchy) {
        if (outHierarchy != null) outHierarchy.add(cls);

        PsiClass superCls = cls.getSuperClass();
        while (superCls != null && !CommonClassNames.JAVA_LANG_OBJECT.equals(superCls.getQualifiedName())) {
            if (outHierarchy != null) outHierarchy.add(superCls);
            if (classQN.equals(superCls.getQualifiedName()))
                return true;
            superCls = superCls.getSuperClass();
        }
        return false;
    }

    /**
     * checks if class implements Interface
     * @param cls to check
     * @param interfaceQN fully qualified name of interface
     * @param checkSubInterfaces deep check -- super of each interface will be chcekd
     * @return true if implements
     */
    public static boolean clsImplements(@NotNull PsiClass cls, @NotNull String interfaceQN, boolean checkSubInterfaces) {
        PsiClassType[] implementsList = cls.isInterface() ? cls.getExtendsListTypes() : cls.getImplementsListTypes();
        for (PsiClassType implType : implementsList) {
            if (implType.equalsToText(interfaceQN)) {
                return true;
            }
            if (checkSubInterfaces) {
                // check sub-interfaces
                PsiClass el = implType.resolve();
                if (el != null && clsImplements(el, interfaceQN, true))
                    return true;
            }
        }

        return false;
    }

    public static PsiJavaCodeReferenceElement[] getReferences(PsiReferenceList list) {
        return list == null ? PsiJavaCodeReferenceElement.EMPTY_ARRAY : list.getReferenceElements();
    }
}
