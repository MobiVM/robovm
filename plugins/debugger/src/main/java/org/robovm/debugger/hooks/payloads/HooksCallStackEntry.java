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
 * Stack entry as received from target
 */
public class HooksCallStackEntry {
    private final String clazzName;
    private final long impl;
    private final int lineNumber;
    private final long fp;

    public HooksCallStackEntry(String clazzName, long impl, int lineNumber, long fp) {
        this.clazzName = clazzName;
        this.impl = impl;
        this.lineNumber = lineNumber;
        this.fp = fp;
    }

    public String clazzName() {
        return clazzName;
    }

    public long impl() {
        return impl;
    }

    public int lineNumber() {
        return lineNumber;
    }

    public long fp() {
        return fp;
    }

    @Override
    public String toString() {
        return "HooksCallStackEntry{" +
                "clazzName='" + clazzName + '\'' +
                ", impl=" + impl +
                ", lineNumber=" + lineNumber +
                ", fp=" + fp +
                '}';
    }
}
