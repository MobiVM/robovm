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
package org.robovm.debugger.utils.macho.structs;

import org.robovm.debugger.utils.bytebuffer.DataBufferArrayReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;

/**
 * @author Demyan Kimitsa
 * mach-o fat arch entry definition
 */
public class FatArch {
    private int cputype;
    private int cpusubtype;
    private long offset;
    private long size;
    private long align;
    private long reserved;
    private boolean is64b;

    public FatArch(DataBufferReader reader, boolean is64b) {
        if (is64b)
            read64(reader);
        else
            read32(reader);
    }

    public FatArch read32(DataBufferReader reader) {
        //cpu_type_t	cputype;	/* cpu specifier (int) */
        cputype = reader.readInt32();
        //cpu_subtype_t	cpusubtype;	/* machine specifier (int) */
        cpusubtype = reader.readInt32();
        //uint32_t	offset;		/* file offset to this object file */
        offset = reader.readUnsignedInt32();
        //uint32_t	size;		/* size of this object file */
        size = reader.readUnsignedInt32();
        //uint32_t	align;		/* alignment as a power of 2 */
        align = reader.readUnsignedInt32();

        return this;
    }

    public FatArch read64(DataBufferReader reader) {
        //cpu_type_t	cputype;	/* cpu specifier (int) */
        cputype = reader.readInt32();
        //cpu_subtype_t	cpusubtype;	/* machine specifier (int) */
        cpusubtype = reader.readInt32();
        //uint64_t	offset;		/* file offset to this object file */
        offset = reader.readLong();
        //uint64_t	size;		/* size of this object file */
        size = reader.readLong();
        //uint32_t	align;		/* alignment as a power of 2 */
        align = reader.readUnsignedInt32();
        //uint32_t	reserved;	/* reserved */
        reserved = reader.readUnsignedInt32();

        return this;
    }

    public int cputype() {
        return cputype;
    }

    public int cpusubtype() {
        return cpusubtype;
    }

    public long offset() {
        return offset;
    }

    public long size() {
        return size;
    }

    public long align() {
        return align;
    }

    public boolean is64b() {
        return is64b;
    }

    private static DataBufferArrayReader.ObjectReader<FatArch> objectReader32 = new DataBufferArrayReader.ObjectReader<FatArch>() {
        @Override
        public FatArch readObject(DataBufferReader reader, FatArch object) {
            return object == null ? new FatArch(reader, false) : object.read32(reader);
        }
    };

    private static DataBufferArrayReader.ObjectReader<FatArch> objectReader64 = new DataBufferArrayReader.ObjectReader<FatArch>() {
        @Override
        public FatArch readObject(DataBufferReader reader, FatArch object) {
            return object == null ? new FatArch(reader, true) : object.read64(reader);
        }
    };

    public static DataBufferArrayReader.ObjectReader<FatArch> OBJECT_READER(boolean is64b) {
        return is64b ? objectReader64 : objectReader32;
    }

    public static int ITEM_SIZE(boolean is64b) {
        return is64b ? (4 + 4 + 8 + 8 + 4 + 4) : (4 + 4 + 4 + 4 + 4);
    }

}
