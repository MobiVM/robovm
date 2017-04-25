package org.robovm.debugger.delegates;

import org.robovm.debugger.hooks.unitls.TargetByteBufferReader;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;

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

    /**
     * sets breakpoint in target
     * WARNING: no validation at this point, all has to be valid
     * @param methodInfo with debug and bptable
     * @param line to set bp to
     */
    public void setBreakPoint(MethodInfo methodInfo, int line) {
        int lineOffset = line - methodInfo.debugInfo().startLine();
        int addrOffset = lineOffset >> 3;
        int bitOffset = lineOffset & 7;
        int mask = 1 << bitOffset;

        long addr = toRuntimeAddr(methodInfo.bpTableAddr() + addrOffset);
        delegates.hooksApi().orBits(addr, (byte)(mask & 0xff));
    }

    /**
     * removes breakpoint in target
     * WARNING: no validation at this point, all has to be valid
     * @param methodInfo with debug and bptable
     * @param line to remove bp from
     */
    public void clearBreakPoint(MethodInfo methodInfo, int line) {
        int lineOffset = line - methodInfo.debugInfo().startLine();
        int addrOffset = lineOffset >> 3;
        int bitOffset = lineOffset & 7;
        int mask = ~(1 << bitOffset);

        long addr = toRuntimeAddr(methodInfo.bpTableAddr() + addrOffset);
        delegates.hooksApi().andBits(addr, (byte)(mask & 0xff));
    }

    /**
     * performs step om target
     * WARNING: no validation at this point, thread shall be suspended
     * @param thread to step
     * @param depth of step, {@link org.robovm.debugger.jdwp.JdwpConsts.StepDepth}
     */
    public void step(VmThread thread, int depth) {
        long pclow;
        long pchigh;
        long pclow2;
        long pchigh2;

        VmStackTrace[] stack = thread.stack();
        VmStackTrace topStackEntry = stack[0];
        if (depth == JdwpConsts.StepDepth.INTO) {
            // stop at any line
            pclow = 0;
            pchigh = Long.MAX_VALUE;
            pclow2 = 0;
            pchigh2 = Long.MAX_VALUE;
        } else {
            // find out previous not native entry
            VmStackTrace prevStackEntry = null;
            for (int idx = 1; idx < stack.length; idx++) {
                if (stack[idx].methodInfo().isNative() || stack[idx].methodInfo().isBridge())
                    continue;
                prevStackEntry = stack[idx];
                break;
            }

            if (depth == JdwpConsts.StepDepth.OVER) {
                // walk inside this method and outside
                pclow = toRuntimeAddr(topStackEntry.methodInfo().implPtr());
                pchigh = pclow + topStackEntry.methodInfo().methodCodeSize();
                if (prevStackEntry != null) {
                    pclow2 = toRuntimeAddr(prevStackEntry.methodInfo().implPtr());
                    pchigh2 = pclow2 + prevStackEntry.methodInfo().methodCodeSize();
                } else {
                    pclow2 = 0;
                    pchigh2 = 0;
                }
            } else if (depth == JdwpConsts.StepDepth.OUT) {
                // walk out current method
                if (prevStackEntry != null) {
                    pclow = toRuntimeAddr(prevStackEntry.methodInfo().implPtr());
                    pchigh = pclow + prevStackEntry.methodInfo().methodCodeSize();
                    pclow2 = 0;
                    pchigh2 = 0;
                } else {
                    // if prevStackEntry then there is no java method in stack bellow
                    return;
                }
            } else {
                // should not happen
                return;
            }
        }

        // apply to target
        delegates.hooksApi().threadStep(thread.threadPtr(), pclow, pchigh, pclow2, pchigh2);
    }
}
