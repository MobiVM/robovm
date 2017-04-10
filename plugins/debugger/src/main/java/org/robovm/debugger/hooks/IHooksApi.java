package org.robovm.debugger.hooks;

import org.robovm.debugger.hooks.payloads.HooksCmdResponse;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * API to target hook.c module that to be exposed once connected to device
 */
public interface IHooksApi {

    byte[] readMemory(long addr, int numBytes) ;
    String readCString(long addr);
    void writeMemory(long addr, byte[] data);
    void writeMemory(long addr, ByteBufferPacket packet);
    void andBits(long addr, byte mask);
    void orBits(long addr, byte mask);
    long allocate(int numBytes);
    void free(long addr);
    void classFilter(boolean isSet, String className);
    void threadSuspend(long thread);
    void threadResume(long thread);
    void threadStep(long thread, long pcLow, long pcHigh, long pcLow2, long pcHigh2);
    void threadInvoke(long thread, long classOrObjectPtr, String methodName, String descriptor,
                      boolean isClassMethod, byte returnType, Object[] arguments);
    void newInstance(long thread, long classPtr, String methodName, String descriptor, Object[] arguments);
    HooksCmdResponse newString(long thread, String s);
    HooksCmdResponse newArray(long thread, int arrayLength, String elementName) ;
}
