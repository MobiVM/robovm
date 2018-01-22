/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.delegates;

import org.robovm.debugger.hooks.unitls.TargetByteBufferReader;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;

import java.util.HashSet;
import java.util.Set;

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

    /**
     * set if classname that are currently set in device
     */
    private Set<String> activeClassFilters;

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
    public RuntimeStepReference step(VmThread thread, int depth) {
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
                if (stack[idx].methodInfo().isNative())
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
                    return null;
                }
            } else {
                // should not happen
                return null;
            }
        }

        // apply to target
        delegates.hooksApi().threadStep(thread.threadPtr(), pclow, pchigh, pclow2, pchigh2);

        // return reference
        return new RuntimeStepReference(thread, pclow, pchigh, pclow2, pchigh2);
    }


    public void restep(RuntimeStepReference ref) {
        // apply to target
        delegates.hooksApi().threadStep(ref.thread.threadPtr(), ref.pclow, ref.pchigh, ref.pclow2, ref.pchigh2);
    }


    public void setClassLoadFilter(Set<String> filters) {
        Set<String> filtersToSet = null;
        Set<String> filtersToRemove = null;

        if (activeClassFilters == null || activeClassFilters.isEmpty()) {
            if (filters == null || filters.isEmpty())
                return; // no change

            filtersToSet = filters;
        } else {
            if (filters == null || filters.isEmpty()) {
                filtersToRemove = activeClassFilters;
            } else {
                // find a difference
                filtersToSet = new HashSet<>(filters);
                filtersToSet.removeAll(activeClassFilters);
                filtersToRemove = new HashSet<>(activeClassFilters);
                filtersToRemove.removeAll(filters);

            }
        }

        // remove filters
        if (filtersToRemove != null && !filtersToRemove.isEmpty()) {
            for (String className : filtersToRemove) {
                delegates.hooksApi().classFilter(false, className);
            }
        }

        // add new filters
        if (filtersToSet != null && !filtersToSet.isEmpty()) {
            for (String className : filtersToSet) {
                delegates.hooksApi().classFilter(true, className);
            }
        }

        activeClassFilters = filters;
    }

    /**
     * container to keep configuration of step performed as step often required to reproduce
     */
    public static class RuntimeStepReference {
        private final VmThread thread;
        private final long pclow;
        private final long pchigh;
        private final long pclow2;
        private final long pchigh2;
        private Object payload;

        private RuntimeStepReference(VmThread thread, long pclow, long pchigh, long pclow2, long pchigh2) {
            this.thread = thread;
            this.pclow = pclow;
            this.pchigh = pchigh;
            this.pclow2 = pclow2;
            this.pchigh2 = pchigh2;
        }

        public VmThread thread() {
            return thread;
        }

        public <T> T payload() {
            //noinspection unchecked
            return (T)payload;
        }

        public RuntimeStepReference setPayload(Object payload) {
            this.payload = payload;
            return this;
        }
    }
}
