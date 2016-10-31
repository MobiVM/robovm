/*
 * Copyright (C) 2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.junit.protocol;

/**
 * Used to report back an unserializable {@link Throwable} instance the the
 * server. This instance will copy the stacktrace, classname and message and
 * from the unserializable {@link Throwable} and print those when
 * {@link Throwable#toString()} or {@link Throwable#printStackTrace()} are
 * called on it.
 */
public class UnserializableException extends Throwable {
    private static final long serialVersionUID = 1L;

    private String className;

    public UnserializableException(Throwable t) {
        super(t.getMessage(), wrapCause(t));
        this.className = t.getClass().getName();
        setStackTrace(t.getStackTrace());
    }

    private static Throwable wrapCause(Throwable t) {
        return t != null && t.getCause() != null && t.getCause() != t
                ? new UnserializableException(t.getCause()) : null;
    }

    public String toString() {
        String message = getMessage();
        return (message != null) ? (className + ": " + message) : className;
    }
}
