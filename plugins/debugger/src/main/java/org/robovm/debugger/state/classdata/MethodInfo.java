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
package org.robovm.debugger.state.classdata;

import org.robovm.debugger.debuginfo.DebuggerDebugMethodInfo;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;

/**
 * @author Demyan Kimitsa
 * This is java representation for MethodInfo struct from classinfo.h
 * it is being parsed right from application
 * class info hash is produced in Linker.java
 */
public class MethodInfo extends BaseModifiersInfo {
    //typedef struct {
    //    jint flags;
    //    jint vtableIndex;
    //    jint access;
    //    const char* name;
    //    const char* desc;
    //    void* attributes;
    //    jint size;
    //    void* impl;
    //    void* synchronizedImpl;
    //    void* linetable;
    //    void** targetFnPtr;
    //    void* callbackImpl;
    //} MethodInfo;
    private int flags;
    private String name;
    private String desc;
    private long implPtr;
    private int methodCodeSize;

    // debug information if available
    private DebuggerDebugMethodInfo debugInfo;
    // mach-o address of breakpoint table for method. <=0 if missing
    private long bpTableAddr;
    // call specification for method build from desc fiend
    private CallSpec callspec;

    public void readMethodInfo(DataBufferReader reader) {
        flags = reader.readInt16(true);

        int vtableIndex = reader.readInt16(true);
        name = reader.readStringZ(reader.readPointer(true));

        if ((flags & ClassDataConsts.methodinfo.COMPACT_DESC) != 0) {
            switch (reader.readByte()) {
                case ClassDataConsts.desc.B:
                    desc = "()B";
                    break;
                case ClassDataConsts.desc.C:
                    desc = "()C";
                    break;
                case ClassDataConsts.desc.D:
                    desc = "()D";
                    break;
                case ClassDataConsts.desc.F:
                    desc = "()F";
                    break;
                case ClassDataConsts.desc.I:
                    desc = "()I";
                    break;
                case ClassDataConsts.desc.J:
                    desc = "()J";
                    break;
                case ClassDataConsts.desc.S:
                    desc = "()S";
                    break;
                case ClassDataConsts.desc.Z:
                    desc = "()Z";
                    break;
                case ClassDataConsts.desc.V:
                    desc = "()V";
                    break;
            }
        } else {
            desc = reader.readStringZ(reader.readPointer(true));
        }

        if ((flags & ClassDataConsts.methodinfo.ATTRIBUTES) != 0) {
            // TODO: skip attributes
            reader.readPointer(true);
        }

        long synchronizedImpl = 0;
        long linetable = 0;
        if (!isAbstract()) {
            implPtr = reader.readPointer(true);
            methodCodeSize = reader.readInt32(true);
            if (isSynchronized())
                synchronizedImpl = reader.readPointer(true);
            if (!isNative()) {
                linetable = reader.readPointer(true);
            }
        }
        long targetFnPtr = 0;
        if (isBroBridge())
            targetFnPtr = reader.readPointer(true);
        long callbackImpl = 0;
        if (isBroCallback())
            callbackImpl = reader.readPointer(true);
    }

    public String name() {
        return name;
    }

    public String signature() {
        return desc;
    }

    public long implPtr() {
        return implPtr;
    }

    public int methodCodeSize() {
        return methodCodeSize;
    }

    public DebuggerDebugMethodInfo debugInfo() {
        return debugInfo;
    }

    public void setDebugInfo(DebuggerDebugMethodInfo debugInfo) {
        this.debugInfo = debugInfo;
    }

    /**
     * sets address of BP table for method, WARNING address is in mach-o address space
     */
    public void setBpTableAddr(long addr) {
        this.bpTableAddr = addr;
    }

    public long bpTableAddr() {
        return bpTableAddr;
    }

    public int spFpOffset() {
        return debugInfo.getSpFpOffset();
    }

    public int spFpAlign() {
        return debugInfo.getSpFpAlign();
    }

    public boolean isBroCallback() {
        return (flags & ClassDataConsts.methodinfo.BRO_CALLBACK) != 0;
    }

    public boolean isBroBridge() {
        return (flags & ClassDataConsts.methodinfo.BRO_BRIDGE) != 0;
    }

    /**
     * marks method as native due lack of ability to work with it as with pure java one
     * e.g. if there is not enough debug information etc
     */
    public void markAsNative() {
        flags |= ClassDataConsts.methodinfo.NATIVE;
        reloadModifiers();
    }

    public CallSpec callspec() {
        return callspec;
    }

    public void setCallspec(CallSpec callspec) {
        this.callspec = callspec;
    }

    @Override
    protected int convertModifiers() {
        return Converter.methodModifiers(flags);
    }

    /**
     * spec for parameters and return type of method
     */
    public static class CallSpec {
        public final ClassInfo returnType;
        public final ClassInfo[] arguments;

        public CallSpec(ClassInfo returnType, ClassInfo[] arguments) {
            this.returnType = returnType;
            this.arguments = arguments;
        }
    }
}
