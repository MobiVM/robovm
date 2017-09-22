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
package org.robovm.debugger.jdwp;

/**
 * @author Demyan Kimitsa
 */
public class JdwpConsts {

    public static class Error {
        public static final int NONE = 0;
        public static final int INVALID_THREAD = 10;
        public static final int INVALID_THREAD_GROUP = 11;
        public static final int INVALID_PRIORITY = 12;
        public static final int THREAD_NOT_SUSPENDED = 13;
        public static final int THREAD_SUSPENDED = 14;
        public static final int THREAD_NOT_ALIVE = 15;
        public static final int INVALID_OBJECT = 20;
        public static final int INVALID_CLASS = 21;
        public static final int CLASS_NOT_PREPARED = 22;
        public static final int INVALID_METHODID = 23;
        public static final int INVALID_LOCATION = 24;
        public static final int INVALID_FIELDID = 25;
        public static final int INVALID_FRAMEID = 30;
        public static final int NO_MORE_FRAMES = 31;
        public static final int OPAQUE_FRAME = 32;
        public static final int NOT_CURRENT_FRAME = 33;
        public static final int TYPE_MISMATCH = 34;
        public static final int INVALID_SLOT = 35;
        public static final int DUPLICATE = 40;
        public static final int NOT_FOUND = 41;
        public static final int INVALID_MONITOR = 50;
        public static final int NOT_MONITOR_OWNER = 51;
        public static final int INTERRUPT = 52;
        public static final int INVALID_CLASS_FORMAT = 60;
        public static final int CIRCULAR_CLASS_DEFINITION = 61;
        public static final int FAILS_VERIFICATION = 62;
        public static final int ADD_METHOD_NOT_IMPLEMENTED = 63;
        public static final int SCHEMA_CHANGE_NOT_IMPLEMENTED = 64;
        public static final int INVALID_TYPESTATE = 65;
        public static final int HIERARCHY_CHANGE_NOT_IMPLEMENTED = 66;
        public static final int DELETE_METHOD_NOT_IMPLEMENTED = 67;
        public static final int UNSUPPORTED_VERSION = 68;
        public static final int NAMES_DONT_MATCH = 69;
        public static final int CLASS_MODIFIERS_CHANGE_NOT_IMPLEMENTED = 70;
        public static final int METHOD_MODIFIERS_CHANGE_NOT_IMPLEMENTED = 71;
        public static final int NOT_IMPLEMENTED = 99;
        public static final int NULL_POINTER = 100;
        public static final int ABSENT_INFORMATION = 101;
        public static final int INVALID_EVENT_TYPE = 102;
        public static final int ILLEGAL_ARGUMENT = 103;
        public static final int OUT_OF_MEMORY = 110;
        public static final int ACCESS_DENIED = 111;
        public static final int VM_DEAD = 112;
        public static final int INTERNAL = 113;
        public static final int UNATTACHED_THREAD = 115;
        public static final int INVALID_TAG = 500;
        public static final int ALREADY_INVOKING = 502;
        public static final int INVALID_INDEX = 503;
        public static final int INVALID_LENGTH = 504;
        public static final int INVALID_STRING = 506;
        public static final int INVALID_CLASS_LOADER = 507;
        public static final int INVALID_ARRAY = 508;
        public static final int TRANSPORT_LOAD = 509;
        public static final int TRANSPORT_INIT = 510;
        public static final int NATIVE_METHOD = 511;
        public static final int INVALID_COUNT = 512;
    }

    public static class EventKind {
        public static final byte SINGLE_STEP = 1;
        public static final byte BREAKPOINT = 2;
        public static final byte FRAME_POP = 3;
        public static final byte EXCEPTION = 4;
        public static final byte USER_DEFINED = 5;
        public static final byte THREAD_START = 6;
        public static final byte THREAD_DEATH = 7;
        public static final byte THREAD_END = 7;
        public static final byte CLASS_PREPARE = 8;
        public static final byte CLASS_UNLOAD = 9;
        public static final byte CLASS_LOAD = 10;
        public static final byte FIELD_ACCESS = 20;
        public static final byte FIELD_MODIFICATION = 21;
        public static final byte EXCEPTION_CATCH = 30;
        public static final byte METHOD_ENTRY = 40;
        public static final byte METHOD_EXIT = 41;
        public static final byte METHOD_EXIT_WITH_RETURN_VALUE = 42;
        public static final byte MONITOR_CONTENDED_ENTER = 43;
        public static final byte MONITOR_CONTENDED_ENTERED = 44;
        public static final byte MONITOR_WAIT = 45;
        public static final byte MONITOR_WAITED = 46;
        public static final byte VM_START = 90;
        public static final byte VM_INIT = 90;
        public static final byte VM_DEATH = 99;
        public static final byte VM_DISCONNECTED = 100;
    }

    public static class EventModifier {
        public static final byte CASE_COUNT = 1;
        public static final byte CONDITIONAL = 2;
        public static final byte THREAD_ONLY = 3;
        public static final byte CLASS_ONLY = 4;
        public static final byte CLASS_MATCH = 5;
        public static final byte CLASS_EXCLUDE = 6;
        public static final byte LOCATION_ONLY = 7;
        public static final byte EXCEPTION_ONLY = 8;
        public static final byte FIELD_ONLY = 9;
        public static final byte STEP = 10;
        public static final byte INSTANCE_ONLY = 11;
        public static final byte SOURCE_NAME_MATCH = 12;
    }

    public static class SuspendPolicy {
        public static final byte NONE = 0;
        public static final byte EVENT_THREAD = 1;
        public static final byte ALL = 2;
    }

    public static class TypeTag {
        public static final byte CLASS = 1;
        public static final byte INTERFACE = 2;
        public static final byte ARRAY = 3;
    }

    public static class ThreadStatus {
        public static final int ZOMBIE = 0;
        public static final int RUNNING = 1;
        public static final int SLEEPING = 2;
        public static final int MONITOR = 3;
        public static final int WAIT = 4;
    }

    public static class SuspendStatus {
        public static final int SUSPEND_STATUS_SUSPENDED = 0x1;
    }

    public static class Tag {
        public static final byte ARRAY = 91;
        public static final byte BYTE = 66;
        public static final byte CHAR = 67;
        public static final byte OBJECT = 76;
        public static final byte FLOAT = 70;
        public static final byte DOUBLE = 68;
        public static final byte INT = 73;
        public static final byte LONG = 74;
        public static final byte SHORT = 83;
        public static final byte VOID = 86;
        public static final byte BOOLEAN = 90;
        public static final byte STRING = 115;
        public static final byte THREAD = 116;
        public static final byte THREAD_GROUP = 103;
        public static final byte CLASS_LOADER = 108;
        public static final byte CLASS_OBJECT = 99;
    }

    public static class ClassStatus {
        public static final int VERIFIED = 1;
        public static final int PREPARED = 2;
        public static final int INITIALIZED = 4;
        public static final int ERROR = 8;
    }

    public static class InvokeOptions {
        public static final int INVOKE_SINGLE_THREADED = 0x01;
        public static final int INVOKE_NONVIRTUAL = 0x02;
    }

    public static class Modifiers {
        public static final int PUBLIC = 0x0001;
        public static final int PRIVATE = 0x0002;
        public static final int PROTECTED = 0x0004;
        public static final int STATIC = 0x0008;
        public static final int FINAL = 0x0010;
        public static final int SUPER = 0x0020;
        public static final int SYNCHRONIZED = 0x0020;
        public static final int VOLATILE = 0x0040;
        public static final int BRIDGE = 0x0040;
        public static final int VARARGS = 0x0080;
        public static final int TRANSIENT = 0x0080;
        public static final int NATIVE = 0x0100;
        public static final int INTERFACE = 0x0200;
        public static final int ABSTRACT = 0x0400;
        public static final int STRICT = 0x0800;
        public static final int SYNTHETIC = 0x1000;
        public static final int ANNOTATION = 0x2000;
        public static final int ENUM = 0x4000;
    }

    public static class StepDepth {
        public static final int INTO = 0;
        public static final int OVER = 1;
        public static final int OUT = 2;
    }

    public static class StepSize {
        public static final int MIN = 0;
        public static final int LINE = 1;
    }

    /**
     * Converts event kind value to string presentation
     */
    public static String stringEventKind(byte eventKind) {
        switch (eventKind) {
            case EventKind.SINGLE_STEP: return "SINGLE_STEP";
            case EventKind.BREAKPOINT: return "BREAKPOINT";
            case EventKind.FRAME_POP: return "FRAME_POP";
            case EventKind.EXCEPTION: return "EXCEPTION";
            case EventKind.USER_DEFINED: return "USER_DEFINED";
            case EventKind.THREAD_START: return "THREAD_START";
            case EventKind.THREAD_DEATH: return "THREAD_DEATH";
            case EventKind.CLASS_PREPARE: return "CLASS_PREPARE";
            case EventKind.CLASS_UNLOAD: return "CLASS_UNLOAD";
            case EventKind.CLASS_LOAD: return "CLASS_LOAD";
            case EventKind.FIELD_ACCESS: return "FIELD_ACCESS";
            case EventKind.FIELD_MODIFICATION: return "FIELD_MODIFICATION";
            case EventKind.EXCEPTION_CATCH: return "EXCEPTION_CATCH";
            case EventKind.METHOD_ENTRY: return "METHOD_ENTRY";
            case EventKind.METHOD_EXIT: return "METHOD_EXIT";
            case EventKind.METHOD_EXIT_WITH_RETURN_VALUE: return "METHOD_EXIT_WITH_RETURN_VALUE";
            case EventKind.MONITOR_CONTENDED_ENTER: return "MONITOR_CONTENDED_ENTER";
            case EventKind.MONITOR_CONTENDED_ENTERED: return "MONITOR_CONTENDED_ENTERED";
            case EventKind.MONITOR_WAIT: return "MONITOR_WAIT";
            case EventKind.MONITOR_WAITED: return "MONITOR_WAITED";
            case EventKind.VM_START: return "VM_START";
            case EventKind.VM_DEATH: return "VM_DEATH";
            case EventKind.VM_DISCONNECTED: return "VM_DISCONNECTED";
            default:
                return Byte.toString(eventKind);
        }
    }

    /**
     * Converts suspend policy value to string presentation
     */
    public static String stringSuspendPolicy(byte suspendPolicy) {
        switch (suspendPolicy) {
            case SuspendPolicy.ALL: return "ALL";
            case SuspendPolicy.EVENT_THREAD: return "EVENT_THREAD";
            case SuspendPolicy.NONE: return "NONE";
            default:
                return Byte.toString(suspendPolicy);
        }
    }

}
