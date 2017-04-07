package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 */
public class VmStringInstance extends VmInstance {
    private String value;

    public VmStringInstance(long objectPtr, ClassInfo classInfo) {
        super(objectPtr, classInfo);
    }

    public String value() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
