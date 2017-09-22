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
 * Payload for class loaded event
 */
public class HooksClassLoadedEventPayload extends HooksEventPayload {
    private final long threadObj;
    private final long thread;
    private final long clazz;
    private final long classInfo;
    private final HooksCallStackEntry[] callStack;

    public HooksClassLoadedEventPayload(int eventId, long threadObj, long thread, long clazz, long classInfo, HooksCallStackEntry[] callStack) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.clazz = clazz;
        this.classInfo = classInfo;
        this.callStack = callStack;
    }

    public long threadObj() {
        return threadObj;
    }

    public long thread() {
        return thread;
    }

    public long clazz() {
        return clazz;
    }

    public long classInfo() {
        return classInfo;
    }

    public HooksCallStackEntry[] callStack() {
        return callStack;
    }

    @Override
    public String toString() {
        return "HooksClassLoadedEventPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", clazz=" + clazz +
                ", classInfo=" + classInfo +
                ", callStack=" + (callStack != null ? Arrays.toString(callStack) : null) +
                '}';
    }
}
