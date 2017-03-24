package org.robovm.debugger.state.refid;

import org.robovm.debugger.state.instances.VmInstance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * holder for instances, extend and adds functionality to get instance by pointer and remove it if required
 */
public class InstanceRefIdHolder extends RefIdHolder<VmInstance> {

    /** map of addresses to objects */
    protected final Map<Long, VmInstance> addrToObject = new HashMap<>();

    public InstanceRefIdHolder() {
        super(RefIdType.REFERENCE_TYPE);
    }

    @Override
    public VmInstance addObject(VmInstance obj) {
        synchronized (idToObject) {
            addrToObject.put(obj.getObjectPtr(), obj);
            return super.addObject(obj);
        }
    }

    @Override
    public VmInstance removeObject(VmInstance obj) {
        synchronized (idToObject) {
            addrToObject.remove(obj.getObjectPtr());
            return super.removeObject(obj);
        }
    }

    public <T extends VmInstance> T objectByAddr(long addr) {
        synchronized (idToObject) {
            //noinspection unchecked
            return (T)addrToObject.get(addr);
        }
    }
}
