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

import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;

/**
 * @author Demyan Kimitsa
 * This is java representation for FieldInfo struct from classinfo.h
 * it is being parsed right from application
 * class info hash is produced in Linker.java
 */
public class FieldInfo extends BaseModifiersInfo {
    //typedef struct {
    //    jint flags;
    //    jint access;
    //    const char* name;
    //    const char* desc;
    //    void* attributes;
    //    jint offset;
    //} FieldInfo;


    private int flags;
    private String name;
    private String signature;
    private int offset;
    private ClassInfo typeInfo;

    public void readFieldInfo(DataBufferReader reader) {
        flags = reader.readInt16();

        name = reader.readStringZ(reader.readPointer());

        if ((flags >> 12) != 0) {
            switch ((flags >> 12) & 0xf) {
                case ClassDataConsts.desc.B: signature = "B"; break;
                case ClassDataConsts.desc.C: signature = "C"; break;
                case ClassDataConsts.desc.D: signature = "D"; break;
                case ClassDataConsts.desc.F: signature = "F"; break;
                case ClassDataConsts.desc.I: signature = "I"; break;
                case ClassDataConsts.desc.J: signature = "J"; break;
                case ClassDataConsts.desc.S: signature = "S"; break;
                case ClassDataConsts.desc.Z: signature = "Z"; break;
            }
        } else {
            signature = reader.readStringZ(reader.readPointer());
        }

        offset = reader.readInt32();

        if ((flags & ClassDataConsts.fieldinfo.ATTRIBUTES) != 0) {
            // TODO: skip attributes for now
            reader.skip(reader.pointerSize());
        }
    }

    public String name() {
        return name;
    }

    public String signature() {
        return signature;
    }

    public int offset() {
        return offset;
    }

    public ClassInfo typeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(ClassInfo typeInfo) {
        this.typeInfo = typeInfo;
    }

    @Override
    protected int convertModifiers() {
        return Converter.fieldModifiers(flags);
    }
}
