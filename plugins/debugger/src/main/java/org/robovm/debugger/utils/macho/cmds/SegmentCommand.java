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
package org.robovm.debugger.utils.macho.cmds;

import org.robovm.debugger.utils.bytebuffer.DataBufferArrayReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.macho.structs.Section;

/**
 * @author Demyan Kimitsa
 * mach-o segment command definition
 */
public class SegmentCommand {
    private String segname;
    private long vmaddr;
    private long vmsize;
    private long fileoff;
    private long filesize;
    private int maxprot;
    private int initprot;
    private long nsects;
    private long flags;
    private int firstSectionIdx;
    private Section[] sections;
    private boolean is64b;

    public SegmentCommand(DataBufferReader reader, boolean is64b, int firstSectionIdx) {
        if (is64b)
            read64(reader, firstSectionIdx);
        else
            read32(reader, firstSectionIdx);
    }

    public SegmentCommand read32(DataBufferReader reader, int firstSectionIdx) {
        is64b = false;

        //char		segname[16];	/* segment name */
        segname = reader.readString(16);
        //uint32_t	vmaddr;		/* memory address of this segment */
        vmaddr = reader.readUnsignedInt32();
        //uint32_t	vmsize;		/* memory size of this segment */
        vmsize = reader.readUnsignedInt32();
        //uint32_t	fileoff;	/* file offset of this segment */
        fileoff = reader.readUnsignedInt32();
        //uint32_t	filesize;	/* amount to map from the file */
        filesize = reader.readUnsignedInt32();
        //vm_prot_t	maxprot;	/* maximum VM protection */
        maxprot = reader.readInt32();
        //vm_prot_t	initprot;	/* initial VM protection */
        initprot = reader.readInt32();
        //uint32_t	nsects;		/* number of sections in segment */
        nsects = reader.readUnsignedInt32();
        //uint32_t	flags;		/* flags */
        flags = reader.readUnsignedInt32();

        readSections(reader);
        this.firstSectionIdx = firstSectionIdx;

        return this;
    }


    public SegmentCommand read64(DataBufferReader reader, int firstSectionIdx) {
        is64b = true;

        //char		segname[16];	/* segment name */
        segname = reader.readString(16);
        //uint64_t	vmaddr;		/* memory address of this segment */
        vmaddr = reader.readLong();
        //uint64_t	vmsize;		/* memory size of this segment */
        vmsize = reader.readLong();
        //uint64_t	fileoff;	/* file offset of this segment */
        fileoff = reader.readLong();
        //uint64_t	filesize;	/* amount to map from the file */
        filesize = reader.readLong();
        //vm_prot_t	maxprot;	/* maximum VM protection */
        maxprot = reader.readInt32();
        //vm_prot_t	initprot;	/* initial VM protection */
        initprot = reader.readInt32();
        //uint32_t	nsects;		/* number of sections in segment */
        nsects = reader.readUnsignedInt32();
        //uint32_t	flags;		/* flags */
        flags = reader.readUnsignedInt32();

        readSections(reader);
        this.firstSectionIdx = firstSectionIdx;

        return this;
    }

    private void readSections(DataBufferReader reader) {
        sections = new Section[(int) nsects];
        if (nsects == 0)
            return;
        DataBufferReader sectReader = reader.slice((int) (Section.ITEM_SIZE(is64b()) * nsects));
        DataBufferArrayReader<Section> arrayReader = new DataBufferArrayReader<>(sectReader,
                Section.ITEM_SIZE(is64b), Section.OBJECT_READER(is64b), false);
        // dump sections
        int idx = 0;
        for (Section sec : arrayReader)
            sections[idx++] = sec;
    }


    public String segname() {
        return segname;
    }

    public long vmaddr() {
        return vmaddr;
    }

    public long vmsize() {
        return vmsize;
    }

    public long fileoff() {
        return fileoff;
    }

    public long filesize() {
        return filesize;
    }

    public int maxprot() {
        return maxprot;
    }

    public int initprot() {
        return initprot;
    }

    public long nsects() {
        return nsects;
    }

    public long flags() {
        return flags;
    }

    public Section[] sections() {
        return sections;
    }

    public int firstSectionIdx() {
        return firstSectionIdx;
    }

    public boolean is64b() {
        return is64b;
    }
}
