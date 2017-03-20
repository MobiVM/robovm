package org.robovm.debugger.state.classdata;

import org.robovm.debugger.jdwp.handlers.RefIdHolder;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;

/**
 * @author Demyan Kimitsa
 * This is java representation for FieldInfo struct from classinfo.h
 * it is being parsed right from application
 * class info hash is produced in Linker.java
 */
public class FieldInfo implements RefIdHolder.IRefIdObject {
    //typedef struct {
    //    jint flags;
    //    jint access;
    //    const char* name;
    //    const char* desc;
    //    void* attributes;
    //    jint offset;
    //} FieldInfo;


    private long refId;
    public int flags;
    public int access;
    public String name;
    public String desc;
    public int offset;

    public void readFieldInfo(ByteBufferMemoryReader reader) {
        flags = reader.readInt16();
        name = reader.readStringZAtPtr(reader.readPointer());

        if ((flags >> 12) != 0) {
            switch ((flags >> 12) & 0xf) {
                case ClassDataConsts.desc.B: desc = "B"; break;
                case ClassDataConsts.desc.C: desc = "C"; break;
                case ClassDataConsts.desc.D: desc = "D"; break;
                case ClassDataConsts.desc.F: desc = "F"; break;
                case ClassDataConsts.desc.I: desc = "I"; break;
                case ClassDataConsts.desc.J: desc = "J"; break;
                case ClassDataConsts.desc.S: desc = "S"; break;
                case ClassDataConsts.desc.Z: desc = "Z"; break;
            }
        } else {
            desc = reader.readStringZAtPtr(reader.readPointer());
        }

        offset = reader.readInt32();

        if ((flags & ClassDataConsts.fieldinfo.ATTRIBUTES) != 0) {
            // TODO: skip attributes for now
            reader.skip(reader.pointerSize());
        }
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
