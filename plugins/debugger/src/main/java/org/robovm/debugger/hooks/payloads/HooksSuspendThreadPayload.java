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
package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 * Suspend thread response payload
 */
public class HooksSuspendThreadPayload {
    private final HooksCallStackEntry[] callStack;
    // JVM state of the thread 
    private final int jvmThreadState;
    // HOOK debug environment thread state: running/soft suspended/forced suspended 
    private final int suspendThreadStatus;

    public HooksSuspendThreadPayload(HooksCallStackEntry[] callStack, int jvmThreadState, int suspendThreadStatus) {
        this.callStack = callStack;
        this.jvmThreadState = jvmThreadState;
        this.suspendThreadStatus = suspendThreadStatus;
    }

    public HooksCallStackEntry[] getCallStack() {
        return callStack;
    }

    public int getJvmThreadState() {
        return jvmThreadState;
    }

    public int getSuspendThreadStatus() {
        return suspendThreadStatus;
    }
}
