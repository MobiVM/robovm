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
package org.robovm.debugger.state.instances;

import org.robovm.debugger.hooks.HookConsts;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.ClassInfo;

/**
 * @author Demyan Kimitsa
 * Represend thread object received from target
 */
public class VmThread extends VmInstance {

    /** native (not java) thread object pointer */
    private long threadPtr;

    /** thread name */
    private final String name;

    /** thread group */
    private final VmThreadGroup threadGroup;

    private int jdwpThreadStatus;
    private int hookSuspendStatus;
    private int suspendCount;
    private VmStackTrace[] stack;


    public VmThread(long objectPtr, long threadPtr, ClassInfo classInfo, String name, VmThreadGroup threadGroup) {
        super(objectPtr, classInfo);
        this.threadPtr = threadPtr;
        this.name = name;
        this.threadGroup = threadGroup;
        jdwpThreadStatus = JdwpConsts.ThreadStatus.RUNNING;
        hookSuspendStatus = HookConsts.threadSuspendStatus.RUNNING;
    }

    public int suspendCount() {
        return suspendCount;
    }

    public int markSuspended() {
        suspendCount += 1;
        return suspendCount;
    }

    public int markResumed() {
        if (suspendCount > 0) {
            suspendCount -= 1;
            return suspendCount;
        }

        // already resumed
        return -1;
    }

    public String name() {
        return name;
    }

    public VmThreadGroup threadGroup() {
        return threadGroup;
    }

    public long threadPtr() {
        return threadPtr;
    }

    public void attach(long threadPtr) {
        this.threadPtr = threadPtr;
    }

    public VmStackTrace[] stack() {
        return stack;
    }

    public void setStack(VmStackTrace[] stack) {
        this.stack = stack;
    }

    public int getJdwpThreadStatus() {
        return jdwpThreadStatus;
    }

    public void setJdwpThreadStatus(int jdwpThreadStatus) {
        this.jdwpThreadStatus = jdwpThreadStatus;
    }

    public int getHookSuspendStatus() {
        return hookSuspendStatus;
    }

    public void setHookSuspendStatus(int hookSuspendStatus) {
        this.hookSuspendStatus = hookSuspendStatus;
    }

    @Override
    public String toString() {
        return "thread (" + refId() + ", " + name + ", " + threadGroup.name() + ")";
    }
}
