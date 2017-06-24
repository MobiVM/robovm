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
 * single repsponse payload for command that receive result from target
 */
public class HooksCmdResponse  {
    private final Object result;
    private final long exceptionPrt;

    public HooksCmdResponse(Object result) {
        this.result = result;
        exceptionPrt = -1;
    }

    public HooksCmdResponse(Object result, long exceptionPrt) {
        this.result = result;
        this.exceptionPrt = exceptionPrt;
    }

    public <T> T result() {
        //noinspection unchecked
        return (T) result;
    }

    public long exceptionPrt() {
        return exceptionPrt;
    }

    @Override
    public String toString() {
        return "HooksCmdResponse{" +
                "result=" + result +
                ", exceptionPrt=" + exceptionPrt +
                '}';
    }
}
