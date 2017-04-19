package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * represent class object instance
 * does nothing, just used to be able to find proper object tag
 */
public class VmClassInstance extends VmInstance {
    public VmClassInstance(long objectPtr, ClassInfo classInfo) {
        super(objectPtr, classInfo);
    }
}