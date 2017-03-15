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
        public static final int SINGLE_STEP = 1;
        public static final int BREAKPOINT = 2;
        public static final int FRAME_POP = 3;
        public static final int EXCEPTION = 4;
        public static final int USER_DEFINED = 5;
        public static final int THREAD_START = 6;
        public static final int THREAD_DEATH = 7;
        public static final int THREAD_END = 7;
        public static final int CLASS_PREPARE = 8;
        public static final int CLASS_UNLOAD = 9;
        public static final int CLASS_LOAD = 10;
        public static final int FIELD_ACCESS = 20;
        public static final int FIELD_MODIFICATION = 21;
        public static final int EXCEPTION_CATCH = 30;
        public static final int METHOD_ENTRY = 40;
        public static final int METHOD_EXIT = 41;
        public static final int METHOD_EXIT_WITH_RETURN_VALUE = 42;
        public static final int MONITOR_CONTENDED_ENTER = 43;
        public static final int MONITOR_CONTENDED_ENTERED = 44;
        public static final int MONITOR_WAIT = 45;
        public static final int MONITOR_WAITED = 46;
        public static final int VM_START = 90;
        public static final int VM_INIT = 90;
        public static final int VM_DEATH = 99;
        public static final int VM_DISCONNECTED = 100;
    }

    public static class SuspendPolicy {
        public static final int NONE = 0;
        public static final int EVENT_THREAD = 1;
        public static final int ALL = 2;
    }

    public static class TypeTag {
        public static final int CLASS = 1;
        public static final int INTERFACE = 2;
        public static final int ARRAY = 3;
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
        public static final int ARRAY = 91;
        public static final int BYTE = 66;
        public static final int CHAR = 67;
        public static final int OBJECT = 76;
        public static final int FLOAT = 70;
        public static final int DOUBLE = 68;
        public static final int INT = 73;
        public static final int LONG = 74;
        public static final int SHORT = 83;
        public static final int VOID = 86;
        public static final int BOOLEAN = 90;
        public static final int STRING = 115;
        public static final int THREAD = 116;
        public static final int THREAD_GROUP = 103;
        public static final int CLASS_LOADER = 108;
        public static final int CLASS_OBJECT = 99;
    }

    public static class ClassStatus {
        public static final int VERIFIED = 1;
        public static final int PREPARED = 2;
        public static final int INITIALIZED = 4;
        public static final int ERROR = 8;
    }

    static class InvokeOptions {
        public static final int INVOKE_SINGLE_THREADED = 0x01;
        public static final int INVOKE_NONVIRTUAL = 0x02;
    }
}
