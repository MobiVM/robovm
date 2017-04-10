package org.robovm.debugger.utils;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.ClassDataConsts;
import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * Set of different convertation helpers
 */
public final class Converter {

    public static byte jdwpTypeTag(ClassInfo classInfo) {
        if (classInfo.isArray())
            return JdwpConsts.TypeTag.ARRAY;
        else if (classInfo.isInterface())
            return JdwpConsts.TypeTag.INTERFACE;
        else
            return JdwpConsts.TypeTag.CLASS;

    }

    public static int jdwpClassStatus(ClassInfo classInfo) {
        if (classInfo.hasError())
            return JdwpConsts.ClassStatus.ERROR;
        // TODO: check if these are valid
        return JdwpConsts.ClassStatus.INITIALIZED | JdwpConsts.ClassStatus.VERIFIED;
    }

    public static int classModifiers(int flags) {
        int jdwpFlags = 0;

        if ((flags & ClassDataConsts.classinfo.PUBLIC) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.PUBLIC;

        if ((flags & ClassDataConsts.classinfo.FINAL) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.FINAL;

        if ((flags & ClassDataConsts.classinfo.INTERFACE) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.INTERFACE;

        if ((flags & ClassDataConsts.classinfo.ABSTRACT) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.ABSTRACT;

        if ((flags & ClassDataConsts.classinfo.SYNTHETIC) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.SYNTHETIC;

        if ((flags & ClassDataConsts.classinfo.ANNOTATION) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.ANNOTATION;

        if ((flags & ClassDataConsts.classinfo.ENUM) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.ENUM;

        return jdwpFlags;
    }

    public static int fieldModifiers(int flags) {
        int jdwpFlags = 0;
        if ((flags & ClassDataConsts.fieldinfo.ACCESS_MASK) == ClassDataConsts.fieldinfo.PUBLIC)
            jdwpFlags |= JdwpConsts.Modifiers.PUBLIC;

        if ((flags & ClassDataConsts.fieldinfo.ACCESS_MASK) == ClassDataConsts.fieldinfo.PRIVATE)
            jdwpFlags |= JdwpConsts.Modifiers.PRIVATE;

        if ((flags & ClassDataConsts.fieldinfo.ACCESS_MASK) == ClassDataConsts.fieldinfo.PROTECTED)
            jdwpFlags |= JdwpConsts.Modifiers.PROTECTED;

        if ((flags & ClassDataConsts.fieldinfo.STATIC) !=0 )
                jdwpFlags |= JdwpConsts.Modifiers.STATIC;

        if ((flags & ClassDataConsts.fieldinfo.FINAL) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.FINAL;

        if ((flags & ClassDataConsts.fieldinfo.VOLATILE) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.VOLATILE;

        if ((flags & ClassDataConsts.fieldinfo.TRANSIENT) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.TRANSIENT;

        if ((flags & ClassDataConsts.fieldinfo.SYNTHETIC) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.SYNTHETIC;

        if ((flags & ClassDataConsts.fieldinfo.ENUM) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.ENUM;

        return jdwpFlags;
    }

    public static int methodModifiers(int flags) {
        int jdwpFlags = 0;
        if ((flags & ClassDataConsts.methodinfo.ACCESS_MASK) == ClassDataConsts.methodinfo.PUBLIC)
            jdwpFlags |= JdwpConsts.Modifiers.PUBLIC;

        if ((flags & ClassDataConsts.methodinfo.ACCESS_MASK) == ClassDataConsts.methodinfo.PRIVATE)
            jdwpFlags |= JdwpConsts.Modifiers.PRIVATE;

        if ((flags & ClassDataConsts.methodinfo.ACCESS_MASK) == ClassDataConsts.methodinfo.PROTECTED)
            jdwpFlags |= JdwpConsts.Modifiers.PROTECTED;

        if ((flags & ClassDataConsts.methodinfo.STATIC) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.STATIC;

        if ((flags & ClassDataConsts.methodinfo.FINAL) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.FINAL;

        if ((flags & ClassDataConsts.methodinfo.SYNCHRONIZED) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.SYNCHRONIZED;

        if ((flags & ClassDataConsts.methodinfo.BRIDGE) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.BRIDGE;

        if ((flags & ClassDataConsts.methodinfo.VARARGS) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.VARARGS;

        if ((flags & ClassDataConsts.methodinfo.NATIVE) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.NATIVE;

        if ((flags & ClassDataConsts.methodinfo.ABSTRACT) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.ABSTRACT;

        if ((flags & ClassDataConsts.methodinfo.STRICT) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.STRICT;

        if ((flags & ClassDataConsts.methodinfo.SYNTHETIC) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.SYNTHETIC;

        return jdwpFlags;
    }

    /**
     * returns instance tag
     * @param classInfo of instance
     * @return JDPW presentation of instance
     */
    public static byte jdwpInstanceTag(ClassInfo classInfo) {
        // TODO: implement !!!
        return 0;
    }
}
