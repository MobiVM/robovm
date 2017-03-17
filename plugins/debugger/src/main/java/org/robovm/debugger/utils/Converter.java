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
}
