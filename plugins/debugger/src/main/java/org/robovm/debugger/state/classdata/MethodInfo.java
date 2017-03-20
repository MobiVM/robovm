package org.robovm.debugger.state.classdata;

import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;

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


    public void readMethodInfo(ByteBufferMemoryReader reader) {
        flags = reader.readInt16();

        int vtableIndex = reader.readInt16();
        name = reader.readStringZAtPtr(reader.readPointer());

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
            if (isSynchronized())
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

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    boolean isBroCallback() {
        return (flags & ClassDataConsts.methodinfo.BRO_CALLBACK) != 0;
    }

    boolean isBroBridge() {
        return (flags & ClassDataConsts.methodinfo.BRO_BRIDGE) != 0;
    }

    @Override
    protected int convertModifiers() {
        return Converter.methodModifiers(flags);
    }
}
