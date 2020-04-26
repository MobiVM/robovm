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

import org.robovm.debugger.hooks.payloads.HooksCmdResponse;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;

/**
 * @author Demyan Kimitsa
 * API to target hook.c module that to be exposed once connected to device
 */
public interface IHooksApi {

    byte[] readMemory(long addr, int numBytes) ;
    String readCString(long addr);
    void writeMemory(long addr, byte[] data);
    void writeMemory(long addr, DataBufferReader data);
    void andBits(long addr, byte mask);
    void orBits(long addr, byte mask);
    long allocate(int numBytes);
    void free(long addr);
    void classFilter(boolean isSet, String className);
    void threadSuspend(long thread);
    void threadResume(long thread);
    void threadStep(long thread, long pcLow, long pcHigh, long pcLow2, long pcHigh2);
    HooksCmdResponse threadInvoke(long thread, long classOrObjectPtr, String methodName, String descriptor,
                      boolean isClassMethod, byte returnType, DataBufferReader arguments);
    HooksCmdResponse newInstance(long thread, long classPtr, String methodName, String descriptor,
                                 DataBufferReader arguments);
    HooksCmdResponse newString(long thread, String s);
    HooksCmdResponse newArray(long thread, int arrayLength, String elementName) ;
}
