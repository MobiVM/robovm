package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * represent class loader instance
 * does nothing, just used to be able to find proper object tag
 */
public class VmClassLoaderInstance extends VmInstance {
    public VmClassLoaderInstance(long objectPtr, ClassInfo classInfo) {
        super(objectPtr, classInfo);
    }
}
