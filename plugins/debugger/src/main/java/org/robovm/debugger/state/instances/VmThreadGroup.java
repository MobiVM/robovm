package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * Represent thread group object
 */
public class VmThreadGroup extends VmInstance{

    private final String name;
    private final VmThreadGroup parent;

    public VmThreadGroup(long objectPtr, ClassInfo classInfo, String name, VmThreadGroup parent) {
        super(objectPtr, classInfo);
        this.name = name;
        this.parent = parent;
    }
}
