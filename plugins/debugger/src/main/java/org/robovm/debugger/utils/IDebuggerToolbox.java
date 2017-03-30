package org.robovm.debugger.utils;

/**
 * @author Demyan Kimitsa
 * Interface that provides common functionality for debugger elements
 */
public interface IDebuggerToolbox {
    Thread createThread(Runnable r, String name);
}
