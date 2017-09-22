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

import java.util.Arrays;

/**
 * @author Demyan Kimitsa
 * Event for breakpoint/step/exception case
 */
public class HooksThreadStoppedEventPayload extends HooksEventPayload{
    private final long threadObj;
    private final long thread;
    private final long throwable;
    private final boolean isCaught;
    private final HooksCallStackEntry[] callStack;

    public HooksThreadStoppedEventPayload(int eventId, long threadObj, long thread, HooksCallStackEntry[] callStack) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.throwable = 0;
        this.isCaught = false;
        this.callStack = callStack;
    }

    public HooksThreadStoppedEventPayload(int eventId, long threadObj, long thread, long throwable, boolean isCaught, HooksCallStackEntry[] callStack) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.throwable = throwable;
        this.isCaught = isCaught;
        this.callStack = callStack;
    }

    public long threadObj() {
        return threadObj;
    }

    public long thread() {
        return thread;
    }

    public long throwable() {
        return throwable;
    }

    public boolean isCaught() {
        return isCaught;
    }

    public HooksCallStackEntry[] callStack() {
        return callStack;
    }

    @Override
    public String toString() {
        return "HooksThreadStoppedEventPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", throwable=" + throwable +
                ", isCaught=" + isCaught +
                ", callStack=" + Arrays.toString(callStack) +
                '}';
    }
}
