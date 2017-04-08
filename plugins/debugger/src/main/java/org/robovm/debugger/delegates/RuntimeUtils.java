package org.robovm.debugger.delegates;

import org.robovm.debugger.hooks.unitls.TargetByteBufferReader;
import org.robovm.debugger.state.classdata.RuntimeClassInfoLoader;

/**
 * @author Demyan Kimitsa
 * provides utilities to work with taget
 */
public class RuntimeUtils {

    private final AllDelegates delegates;

    /**
     * diff of address of base symbol, used to offset mach-o addresses due PIE/ASLR mode
     * (e.g. runtimeMemoryOffset = robovmBaseSymbol(runtime) - robovmBaseSymbol(mach-o)
     */
    private final long runtimeMemoryOffset;

    /**
     * reader of device memory
     */
    private final TargetByteBufferReader deviceMemoryReader;


    public RuntimeUtils(AllDelegates delegates, long runtimeMemoryOffset) {
        this.delegates = delegates;
        this.runtimeMemoryOffset = runtimeMemoryOffset;
        this.deviceMemoryReader = new TargetByteBufferReader(delegates.hooksApi(), delegates.state().isTarget64bit());
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


    /**
     * Converts mach-o address to one that can be used with target
     * (runtime address differs due PIE/ASLR protection)
     *
     * @param machOAddr as it was read from mach-o space
     * @return address that can be use with device
     */
    public long toRuntimeAddr(long machOAddr) {
        return machOAddr + runtimeMemoryOffset;
    }

    public TargetByteBufferReader deviceMemoryReader() {
        return deviceMemoryReader;
    }
}
