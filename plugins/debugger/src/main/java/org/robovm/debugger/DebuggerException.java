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
package org.robovm.debugger;

/**
 * @author Demyan Kimitsa
 */
public class DebuggerException extends RuntimeException {
    /** helper code for cases need to pass it along exception */
    private int code = -1;

    public DebuggerException() {
    }

    public DebuggerException(int code) {
        this.code = code;
    }

    public DebuggerException(String message) {
        super(message);
    }

    public DebuggerException(String message, int code) {
        super(message);
        this.code = code;
    }

    public DebuggerException(String message, Throwable cause) {
        super(message, cause);
    }

    public DebuggerException(Throwable cause) {
        super(cause);
    }

    public int getCode() {
        return code;
    }
}

