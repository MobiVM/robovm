package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * represent class object instance
 * does nothing, just used to be able to find proper object tag
 */
public class VmClassInstance extends VmInstance {
    private final ClassInfo representedClassInfo;

    public VmClassInstance(long objectPtr, ClassInfo classInfo, ClassInfo representedClassInfo) {
        super(objectPtr, classInfo);
        this.representedClassInfo = representedClassInfo;
    }

    public ClassInfo representedClassInfo() {
        return representedClassInfo;
    }
}
