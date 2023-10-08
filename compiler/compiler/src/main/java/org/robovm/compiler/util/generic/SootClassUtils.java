package org.robovm.compiler.util.generic;

import soot.SootClass;
import soot.SootMethod;
import soot.SootResolver;
import soot.tagkit.EnclosingMethodTag;
import soot.tagkit.InnerClassTag;
import soot.tagkit.Tag;

public final class SootClassUtils {
    private SootClassUtils() {
    }

    public static String getDeclaringClassName(SootClass sootClass) {
        for (Tag tag : sootClass.getTags()) {
            if (tag instanceof InnerClassTag) {
                InnerClassTag icTag = (InnerClassTag) tag;
                if (icTag.getInnerClass() != null && icTag.getOuterClass() != null) {
                    String innerName = icTag.getInnerClass().replace('/', '.');
                    if (sootClass.getName().equals(innerName)) {
                        return icTag.getOuterClass().replace('/', '.');
                    }
                }
            }
        }
        return null;
    }

    public static String getEnclosingClassName(SootClass sootClass) {
        EnclosingMethodTag emTag = (EnclosingMethodTag) sootClass.getTag("EnclosingMethodTag");
        if (emTag != null) {
            return emTag.getEnclosingClass();
        }
        return null;
    }

    /**
     * checks if sootClass can be assigned with subSootClass (e.g. if subSootClass extends sootClass)
     */
    public static boolean isAssignableFrom(SootClass subSootClass, SootClass sootClass) {
        if (sootClass.equals(subSootClass)) {
            return true;
        }

        if (subSootClass.hasSuperclass()) {
            return isAssignableFrom(subSootClass.getSuperclass(), sootClass);
        }

        return false;
    }
}
