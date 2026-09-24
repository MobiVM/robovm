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
package org.robovm.debugger.utils;

import org.robovm.debugger.delegates.AllDelegates;
import org.robovm.debugger.hooks.HookConsts;
import org.robovm.debugger.hooks.payloads.HooksCallStackEntry;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.instances.VmStackTrace;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Demyan Kimitsa
 * Converts hooks stack traces into debugger one
 */
public final class StackTraceConverter {

    public static VmStackTrace[] convertCallStack(int eventId, HooksCallStackEntry[] callStack, AllDelegates delegates, DbgLogger log) {
        List<VmStackTrace> result = new ArrayList<>();
        for (HooksCallStackEntry entry : callStack) {
            VmStackTrace stackTrace = convertStackTrace(eventId, entry, delegates, log);
            if (stackTrace != null)
                result.add(stackTrace);
        }

        if (result.size() == 0)
            log.error(HookConsts.commandToString(eventId) + ": Empty callstack!");

        return result.toArray(new VmStackTrace[0]);
    }

    private static VmStackTrace convertStackTrace(int eventId, HooksCallStackEntry payload, AllDelegates delegates, DbgLogger log) {
        String signature = "L" + payload.clazzName() + ";";
        ClassInfo classInfo = delegates.state().classInfoLoader().classInfoBySignature(signature);
        if (classInfo == null) {
            log.error(HookConsts.commandToString(eventId) + ": Failed to get get stack entry. Class is not known " +
                    payload.clazzName());
            return null;
        }

        // find method
        MethodInfo[] methods = delegates.state().classInfoLoader().classMethods(classInfo);
        long implPtr = delegates.runtime().toMachOAddr(payload.impl());
        MethodInfo methodInfo = null;
        for (MethodInfo mi : methods) {
            if (mi.implPtr() == implPtr) {
                methodInfo = mi;
                break;
            }
        }

        if (methodInfo == null) {
            log.error(HookConsts.commandToString(eventId) + ": Failed to get get stack entry. Method not found for impl " +
                    Long.toHexString(payload.impl()) + " class " + payload.clazzName());
            return null;
        }

        // skip synthetic methods from being visible to debugger
        if (methodInfo.isBridge() || methodInfo.isBroCallback() || methodInfo.isBroBridge())
            return null;

        return new VmStackTrace(classInfo, methodInfo, payload.lineNumber(), payload.fp(), payload.pc() - payload.impl());
    }

}
