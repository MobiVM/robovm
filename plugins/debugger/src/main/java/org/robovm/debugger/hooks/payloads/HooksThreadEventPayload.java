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
 * Common payload for set of thread events
 */
public class HooksThreadEventPayload extends HooksEventPayload {
    private final long threadObj;
    private final long thread;
    private final long exceptionPrt;

    public HooksThreadEventPayload(int eventId, long threadObj, long thread, long exceptionPrt) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.exceptionPrt = exceptionPrt;
    }

    public HooksThreadEventPayload(int eventId, long threadObj, long thread) {
        super(eventId);
        this.threadObj = threadObj;
        this.thread = thread;
        this.exceptionPrt = 0;
    }

    public long threadObj() {
        return threadObj;
    }

    public long thread() {
        return thread;
    }

    public long exceptionPrt() {
        return exceptionPrt;
    }

    @Override
    public String toString() {
        return "HooksThreadEventPayload{" +
                "threadObj=" + threadObj +
                ", thread=" + thread +
                ", exceptionPrt=" + exceptionPrt +
                '}';
    }
}
