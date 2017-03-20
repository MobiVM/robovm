package org.robovm.debugger.utils;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.ClassDataConsts;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.FieldInfo;
import org.robovm.debugger.state.classdata.MethodInfo;

/**
 * @author Demyan Kimitsa
 * Set of different convertation helpers
 */
public final class Converter {

    public static byte jdwpTypeTag(ClassInfo classInfo) {
        if ((classInfo.getFlags() & ClassDataConsts.classinfo.INTERFACE) != 0)
            return JdwpConsts.TypeTag.INTERFACE;
        return  JdwpConsts.TypeTag.CLASS;
    }

    public static int jdwpClassStatus(ClassInfo classInfo) {
        if ((classInfo.getFlags() & ClassDataConsts.classinfo.ERROR) != 0)
            return JdwpConsts.ClassStatus.ERROR;
        // TODO: check if these are valid
        return JdwpConsts.ClassStatus.INITIALIZED | JdwpConsts.ClassStatus.VERIFIED;
    }

    public static int jdwpModifierBits(ClassInfo classInfo) {
        int flags = classInfo.getFlags();
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

    public static int jdwpModifierBits(FieldInfo fieldInfo) {
        int jdwpFlags = 0;
        int flags = fieldInfo.flags;
//        if ((flags & FI_ACCESS_MASK) == FI_PUBLIC) jdwpFlags |= ACC_PUBLIC;
//        if ((flags & FI_ACCESS_MASK) == FI_PRIVATE) jdwpFlags |= ACC_PRIVATE;
//        if ((flags & FI_ACCESS_MASK) == FI_PROTECTED) jdwpFlags |= ACC_PROTECTED;
//        if (flags & FI_STATIC) jdwpFlags |= ACC_STATIC;
//        if (flags & FI_FINAL) jdwpFlags |= ACC_FINAL;
//        if (flags & FI_VOLATILE) jdwpFlags |= ACC_VOLATILE;
//        if (flags & FI_TRANSIENT) jdwpFlags |= ACC_TRANSIENT;
//        if (flags & FI_SYNTHETIC) jdwpFlags |= ACC_SYNTHETIC;
//        if (flags & FI_ENUM) jdwpFlags |= ACC_ENUM;
        return jdwpFlags;
    }

    public static int jdwpModifierBits(MethodInfo methodInfo) {
//        jint access = 0;
//        if ((flags & MI_ACCESS_MASK) == MI_PUBLIC) access |= ACC_PUBLIC;
//        if ((flags & MI_ACCESS_MASK) == MI_PRIVATE) access |= ACC_PRIVATE;
//        if ((flags & MI_ACCESS_MASK) == MI_PROTECTED) access |= ACC_PROTECTED;
//        if (flags & MI_STATIC) access |= ACC_STATIC;
//        if (flags & MI_FINAL) access |= ACC_FINAL;
//        if (flags & MI_SYNCHRONIZED) access |= ACC_SYNCHRONIZED;
//        if (flags & MI_BRIDGE) access |= ACC_BRIDGE;
//        if (flags & MI_VARARGS) access |= ACC_VARARGS;
//        if (flags & MI_NATIVE) access |= ACC_NATIVE;
//        if (flags & MI_ABSTRACT) access |= ACC_ABSTRACT;
//        if (flags & MI_STRICT) access |= ACC_STRICT;
//        if (flags & MI_SYNTHETIC) access |= ACC_SYNTHETIC;
        return 0;
    }
}
