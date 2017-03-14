package org.robovm.debugger.state;

/**
 * @author Demyan Kimitsa
 * Contains constants that describes VM
 */
public class VmSpecConsts {
    // VM name as reported by JDWP
    public static final String JDWP_NAME = "RoboVM.Debugger";

    // suppose 1.6 set of commands is implemented
    // http://docs.oracle.com/javase/6/docs/platform/jpda/jdwp/jdwp-protocol.html
    public static final int JDWP_VERSION_MAJOR = 1;
    public static final int JDWP_VERSION_MINOR = 6;

    // java VM version
    public static final String JAVA_VM_VERSION = "1.8_RoboVM";
    // java VM name
    public static final String JAVA_VM_NAME = "RoboVM";

    // will use long as identifiers for everything
    public static final int ID_SIZE = 8;
}
