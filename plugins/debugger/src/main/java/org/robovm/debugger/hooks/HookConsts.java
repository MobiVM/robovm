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
package org.robovm.debugger.hooks;

/**
 * @author Demyan Kimitsa
 * Constants for hook channel operations
 * check hooks.c for details
 */
public final class HookConsts {

    final static class handshake {
        static final long QUESTION = 0x526f626f564d3f3fL; // RoboVM??
        static final long ANSWER = 0x526f626f564d2121L; // RoboVM!!
    }

    final static class commands {
        // memory operations
        static final byte READ_MEMORY = 1;
        static final byte READ_CSTRING = 2;
        static final byte WRITE_MEMORY = 3;
        static final byte WRITE_AND_BITS = 4;
        static final byte WRITE_OR_BITS = 5;
        static final byte ALLOCATE = 6;
        static final byte FREE = 7;

        // thread operations
        static final byte THREAD_SUSPEND = 50;
        static final byte THREAD_RESUME = 51;
        static final byte THREAD_STEP = 52;
        static final byte THREAD_INVOKE = 53;
        static final byte THREAD_NEWSTRING = 54;
        static final byte THREAD_NEWARRAY = 55;
        static final byte THREAD_NEWINSTANCE = 56;

        // class operations
        static final byte CLASS_FILTER = 70;
    }

    public final static class events {
        // events
        public static final byte THREAD_ATTACHED = 100;
        public static final byte THREAD_STARTED = 101;
        public static final byte THREAD_DETTACHED = 102;
        public static final byte THREAD_SUSPENDED = 103;
        public static final byte THREAD_RESUMED = 104;
        public static final byte BREAKPOINT = 105;
        public static final byte THREAD_STEPPED = 106;
        public static final byte CLASS_LOAD = 107;
        public static final byte EXCEPTION = 108;
    }

    public static String commandToString(int cmd) {
        switch(cmd) {
            case commands.READ_MEMORY: return "READ_MEMORY";
            case commands.READ_CSTRING: return "READ_CSTRING";
            case commands.WRITE_MEMORY: return "WRITE_MEMORY";
            case commands.WRITE_AND_BITS: return "WRITE_AND_BITS";
            case commands.WRITE_OR_BITS: return "WRITE_OR_BITS";
            case commands.ALLOCATE: return "ALLOCATE";
            case commands.FREE: return "FREE";

            // thread operations
            case commands.THREAD_SUSPEND: return "THREAD_SUSPEND";
            case commands.THREAD_RESUME: return "THREAD_RESUME";
            case commands.THREAD_STEP: return "THREAD_STEP";
            case commands.THREAD_INVOKE: return "THREAD_INVOKE";
            case commands.THREAD_NEWSTRING: return "THREAD_NEWSTRING";
            case commands.THREAD_NEWARRAY: return "THREAD_NEWARRAY";
            case commands.THREAD_NEWINSTANCE: return "THREAD_NEWINSTANCE";

            // class operations
            case commands.CLASS_FILTER: return "CLASS_FILTER";

            case events.THREAD_ATTACHED: return "THREAD_ATTACHED";
            case events.THREAD_STARTED: return "THREAD_STARTED";
            case events.THREAD_DETTACHED: return "THREAD_DETTACHED";
            case events.THREAD_SUSPENDED: return "THREAD_SUSPENDED";
            case events.THREAD_RESUMED: return "THREAD_RESUMED";
            case events.BREAKPOINT: return "BREAKPOINT";
            case events.THREAD_STEPPED: return "THREAD_STEPPED";
            case events.CLASS_LOAD: return "CLASS_LOAD";
            case events.EXCEPTION: return "EXCEPTION";
        }

        return "UNKNOWN_" + cmd;
    }
}
