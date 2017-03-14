package org.robovm.debugger.hooks;

/**
 * @author Demyan Kimitsa
 * Constants for hook channel operations
 * check hooks.c for details
 */
final class HookConsts {

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

    final static class events {
        // events
        static final int THREAD_ATTACHED = 100;
        static final int THREAD_STARTED = 101;
        static final int THREAD_DETTACHED = 102;
        static final int THREAD_SUSPENDED = 103;
        static final int THREAD_RESUMED = 104;
        static final int BREAKPOINT = 105;
        static final int THREAD_STEPPED = 106;
        static final int CLASS_LOAD = 107;
        static final int EXCEPTION = 108;
    }
}
