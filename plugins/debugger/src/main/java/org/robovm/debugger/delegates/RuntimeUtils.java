package org.robovm.debugger.delegates;

import org.robovm.debugger.hooks.unitls.TargetByteBufferReader;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.RuntimeClassInfoLoader;
import org.robovm.debugger.state.instances.VmInstance;

/**
 * @author Demyan Kimitsa
 * provides utilities to work with taget
 */
public class RuntimeUtils {

    private final AllDelegates delegates;

    /**
     * class info loader that resolves class info for classes created in runtime
     */
    private final RuntimeClassInfoLoader runtimeClassInfoLoader;

    /**
     * diff of address of base symbol, used to offset mach-o addresses due PIE/ASLR mode
     * (e.g. runtimeMemoryOffset = robovmBaseSymbol(runtime) - robovmBaseSymbol(mach-o)
     */
    private final long runtimeMemoryOffset;

    /**
     * reader of device memory
     */
    final TargetByteBufferReader deviceMemoryReader;


    public RuntimeUtils(AllDelegates delegates, long runtimeMemoryOffset) {
        this.delegates = delegates;
        this.runtimeMemoryOffset = runtimeMemoryOffset;
        this.deviceMemoryReader = new TargetByteBufferReader(delegates.hooksApi(), delegates.state().isTarget64bit());
        this.runtimeClassInfoLoader = new RuntimeClassInfoLoader(delegates.state().classInfoLoader(), deviceMemoryReader);
    }

    public String getStringObjectValue(VmInstance strInstance) {
        return null;
    }

    public void readFieldValue(VmInstance instance, String field) {
        ClassInfo classInfo = instance.classInfo();
//        fields = classInfo.fields()
    }



    /**
     * Converts runtime address to one that can be used with mach-o image
     * (runtime address differs due PIE/ASLR protection)
     *
     * @param runtimeAddr as it was read from device
     * @return address that can be use with mach-o space
     */
    public long toMachOAddr(long runtimeAddr) {
        return runtimeAddr - runtimeMemoryOffset;
    }


    public RuntimeClassInfoLoader classInfoLoader() {
        return runtimeClassInfoLoader;
    }
}
