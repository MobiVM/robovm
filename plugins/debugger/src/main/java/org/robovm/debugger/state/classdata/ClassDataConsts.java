package org.robovm.debugger.state.classdata;

/**
 * @author Demyan Kimitsa
 *         contains constants from classinfo.h that are used to manipulate binary data
 */
public class ClassDataConsts {

    public static final class classinfo {
        public static final int PUBLIC = 0x1;
        public static final int FINAL = 0x2;
        public static final int INTERFACE = 0x4;
        public static final int ABSTRACT = 0x8;
        public static final int SYNTHETIC = 0x10;
        public static final int ANNOTATION = 0x20;
        public static final int ENUM = 0x40;
        public static final int ATTRIBUTES = 0x80;
        public static final int ERROR = 0x100;
        public static final int INITIALIZED = 0x200;
        public static final int FINALIZABLE = 0x400;

    }
}
