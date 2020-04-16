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

import org.robovm.debugger.utils.bytebuffer.DataBufferReader;

/**
 * @author Demyan Kimitsa
 * mach-o header definiton
 */
public class MachHeader {
    private int cputype;
    private int cpusubtype;
    private long filetype;
    private long ncmds;
    private long sizeofcmds;
    private long flags;
    private long reserved;
    private boolean is64b;

    public MachHeader(DataBufferReader reader, boolean is64b) {
        if (is64b)
            read64(reader);
        else
            read32(reader);
    }

    public MachHeader read32(DataBufferReader reader) {
        is64b = false;

        //cpu_type_t	cputype;	/* cpu specifier */
        cputype = reader.readInt32();
        //cpu_subtype_t	cpusubtype;	/* machine specifier */
        cpusubtype = reader.readInt32();
        //uint32_t	filetype;	/* type of file */
        filetype = reader.readInt32();
        //uint32_t	ncmds;		/* number of load commands */
        ncmds = reader.readInt32();
        //uint32_t	sizeofcmds;	/* the size of all the load commands */
        sizeofcmds = reader.readInt32();
        //uint32_t	flags;		/* flags */
        flags = reader.readInt32();

        return this;
    }


    public MachHeader read64(DataBufferReader reader) {
        is64b = true;

        //cpu_type_t	cputype;	/* cpu specifier */
        cputype = reader.readInt32();
        //cpu_subtype_t	cpusubtype;	/* machine specifier */
        cpusubtype = reader.readInt32();
        //uint32_t	filetype;	/* type of file */
        filetype = reader.readUnsignedInt32();
        //uint32_t	ncmds;		/* number of load commands */
        ncmds = reader.readUnsignedInt32();
        //uint32_t	sizeofcmds;	/* the size of all the load commands */
        sizeofcmds = reader.readUnsignedInt32();
        //uint32_t	flags;		/* flags */
        flags = reader.readUnsignedInt32();
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

    public long filetype() {
        return filetype;
    }

    public long ncmds() {
        return ncmds;
    }

    public long sizeofcmds() {
        return sizeofcmds;
    }

    public long flags() {
        return flags;
    }

    public boolean is64b() {
        return is64b;
    }
}
