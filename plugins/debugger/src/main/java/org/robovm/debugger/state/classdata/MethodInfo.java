package org.robovm.debugger.state.classdata;

import org.robovm.debugger.jdwp.handlers.RefIdHolder;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;

/**
 * @author Demyan Kimitsa
 * This is java representation for MethodInfo struct from classinfo.h
 * it is being parsed right from application
 * class info hash is produced in Linker.java
 */
public class MethodInfo implements RefIdHolder.IRefIdObject {
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
    int flags;
    String name;
    String desc;
    private long refId;


    public void readMethodInfo(ByteBufferMemoryReader reader) {
        flags = reader.readInt16();
        int vtableIndex = reader.readInt16();
        name = reader.readStringZAtPtr(reader.readPointer());

        // TODO: check compact descriptors
        // like str__28_29B_00
        if ((flags & ClassDataConsts.methodinfo.COMPACT_DESC) != 0) {
            switch (reader.readByte()) {
                case ClassDataConsts.desc.B:
                    desc = "B";
                    break;
                case ClassDataConsts.desc.C:
                    desc = "C";
                    break;
                case ClassDataConsts.desc.D:
                    desc = "D";
                    break;
                case ClassDataConsts.desc.F:
                    desc = "F";
                    break;
                case ClassDataConsts.desc.I:
                    desc = "I";
                    break;
                case ClassDataConsts.desc.J:
                    desc = "J";
                    break;
                case ClassDataConsts.desc.S:
                    desc = "S";
                    break;
                case ClassDataConsts.desc.Z:
                    desc = "Z";
                    break;
                case ClassDataConsts.desc.V:
                    desc = "V";
                    break;
            }
        } else {
            desc = reader.readStringZAtPtr(reader.readPointer());
        }

        if ((flags & ClassDataConsts.methodinfo.ATTRIBUTES) != 0) {
            // TODO: skip attributes
            reader.skip(reader.pointerSize());
        }

        long impl = 0;
        int size = 0;
        long synchronizedImpl = 0;
        long linetable = 0;
        if (!isAbstract()) {
            impl = reader.readPointer();
            size = reader.readInt32();
            if (isSyncronized())
                synchronizedImpl = reader.readPointer();
            if (!isNative()) {
                linetable = reader.readPointer();
            }
        }
        long targetFnPtr = 0;
        if (isBroBridge())
            targetFnPtr = reader.readPointer();
        long callbackImpl = 0;
        if (isBroCallback())
            callbackImpl = reader.readPointer();
    }

    boolean isAbstract() {
        return (flags & ClassDataConsts.methodinfo.ABSTRACT) != 0;
    }

    boolean isSyncronized() {
        return (flags & ClassDataConsts.methodinfo.SYNCHRONIZED) != 0;
    }

    boolean isNative() {
        return (flags & ClassDataConsts.methodinfo.NATIVE) != 0;
    }

    boolean isBroCallback() {
        return (flags & ClassDataConsts.methodinfo.BRO_CALLBACK) != 0;
    }

    boolean isBroBridge() {
        return (flags & ClassDataConsts.methodinfo.BRO_BRIDGE) != 0;
    }

    @Override
    public void setRefId(long refId) {
        this.refId = refId;
    }

    @Override
    public long getRefId() {
        return refId;
    }
}
