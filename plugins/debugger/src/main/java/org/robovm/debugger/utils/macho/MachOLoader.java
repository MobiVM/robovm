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
package org.robovm.debugger.utils.macho;

import org.robovm.debugger.utils.bytebuffer.ByteBufferArrayReader;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;
import org.robovm.debugger.utils.macho.cmds.SegmentCommand;
import org.robovm.debugger.utils.macho.cmds.SymtabCommand;
import org.robovm.debugger.utils.macho.structs.MachHeader;
import org.robovm.debugger.utils.macho.structs.NList;
import org.robovm.debugger.utils.macho.structs.Section;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 *         Class that retrieves information from Match-O binary format
 */
public class MachOLoader {
    private final ByteBufferReader rootReader;
    private final MachHeader machOHeader;
    private final int machOCpuType;
    private List<SegmentCommand> segments = new ArrayList<>();
    private Map<String, Long> symTable = new HashMap<>();
    private SegmentCommand dataSegment;


    public MachOLoader(File executable, int cpuType) throws MachOException {

        ByteBuffer bb;
        try {
            bb = new RandomAccessFile(executable, "r").getChannel().map(FileChannel.MapMode.READ_ONLY, 0, executable.length()).asReadOnlyBuffer();
        } catch (IOException e) {
            throw new MachOException("Failed to open mach-o file", e);
        }
        rootReader = ByteBufferReader.wrap(bb);
        rootReader.setByteOrder(ByteOrder.LITTLE_ENDIAN);

        // read architectures
        long magic = rootReader.readUnsignedInt32();
        if (magic == MachOConsts.FAT_CIGAM || magic == MachOConsts.FAT_CIGAM_64) {
            throw new MachOException("FAT mach-o files are not supported!");
            // as these contains AR !<arch> archive objects file that are extra to parse
            // and for debugger there should be no fat archives
        }

        MachHeader header = parseMachHeader(rootReader, magic);
        if (header.cputype() != cpuType)
            throw new MachOException("CPU type " + Integer.toHexString(cpuType) + " is not present in mach-o file");
        machOHeader = header;
        machOCpuType = cpuType;

        // get some useful data
        readCommandData(rootReader, machOHeader);
    }

    private MachHeader parseMachHeader(ByteBufferReader reader, long magic) throws MachOException {
        if (magic != MachOConsts.MAGIC && magic != MachOConsts.MAGIC_64)
            throw new MachOException("unexpected Mach header MAGIC 0x" + Long.toHexString(magic));
        return new MachHeader(reader, magic == MachOConsts.MAGIC_64);
    }

    private void readCommandData(ByteBufferReader reader, MachHeader header) {
        int sectionIdx = 1;
        // read all commands
        for (int idx = 0; idx < header.ncmds(); idx++) {
            int pos = reader.position();
            int cmd = (int) reader.readUnsignedInt32();
            int cmdsize = (int) reader.readUnsignedInt32();
            if (cmd == MachOConsts.commands.LC_SEGMENT || cmd == MachOConsts.commands.LC_SEGMENT_64) {
                SegmentCommand segCmd = new SegmentCommand(reader, cmd == MachOConsts.commands.LC_SEGMENT_64, sectionIdx);
                if (header.is64b() != segCmd.is64b())
                    throw new RuntimeException("bits of LC_SEGMENT shall match MAGIC header");
                segments.add(segCmd);
                sectionIdx += segCmd.sections().length;

                // save data segment
                if ("__DATA".equals(segCmd.segname()))
                    dataSegment = segCmd;
            } else if (cmd == MachOConsts.commands.LC_SYMTAB) {
                SymtabCommand symtabCommand = new SymtabCommand(reader);
                ByteBufferReader stringReader = reader.sliceAt((int) symtabCommand.stroff, (int) symtabCommand.strsize);
                ByteBufferReader nlistReader = reader.sliceAt((int) symtabCommand.symoff, (int) (symtabCommand.nsyms * NList.ITEM_SIZE(header.is64b())));
                ByteBufferArrayReader<NList> arrayReader = new ByteBufferArrayReader<>(nlistReader,
                        NList.ITEM_SIZE(header.is64b()), NList.OBJECT_READER(header.is64b()));
                for (NList nlist : arrayReader) {
                    if (nlist.isTypeStab()) {
                        if (!nlist.isTypeStabGlobalSymb())
                            continue;
                    } else {
                        // do some filtering
                        if (nlist.isTypeUndfined())
                            continue;
                        if (nlist.isTypePreboundUndefined())
                            continue;
                    }
                    if (nlist.n_sect() == 0)
                        continue;

                    // save offset to NList as there is too much of symbols
                    String sym = stringReader.readStringZ((int) nlist.n_strx());
                    symTable.put(sym, nlist.getByteBufferOffset());
                }
            }

            reader.setPosition(pos + cmdsize);
        }
    }

    public static int cpuTypeFromString(String cpuString) {
        switch (cpuString) {
            case "i386":
            case "x86":
                return MachOConsts.cpu_type.CPU_TYPE_X86;

            case "x86_64":
                return MachOConsts.cpu_type.CPU_TYPE_X86_64;

            case "thumbv7":
            case "armv7":
                return MachOConsts.cpu_type.CPU_TYPE_ARM;

            case "arm64":
                return MachOConsts.cpu_type.CPU_TYPE_ARM64;

            default:
                return -1;
        }
    }

    public int cpuType() {
        return machOCpuType;
    }

    public boolean isPatform64Bit() {
        switch (machOCpuType) {
            case MachOConsts.cpu_type.CPU_TYPE_X86_64:
            case MachOConsts.cpu_type.CPU_TYPE_ARM64:
                return true;

            case MachOConsts.cpu_type.CPU_TYPE_X86:
            case MachOConsts.cpu_type.CPU_TYPE_ARM:
                return false;
        }

        throw new RuntimeException("Unknown CPU type to get data bit width " + machOCpuType);
    }

    public long resolveSymbol(String symbolName) {
        Long nlistAddr = symTable.get("_" + symbolName);
        if (nlistAddr == null)
            return -1;

        rootReader.setPosition(nlistAddr);
        NList nlist = NList.OBJECT_READER(machOHeader.is64b()).readObject(rootReader, null);

        return nlist.n_value();
    }

    public ByteBufferMemoryReader memoryReader() {
        // after test it clear that some data is read from __TEXT section (consts) so need to pick proper sections into
        // list
        List<ByteBufferMemoryReader.MemoryRegion> regions = new ArrayList<>();
        for (SegmentCommand segCmd : segments) {
            boolean isText = "__TEXT".equals(segCmd.segname());
            boolean isData = "__DATA".equals(segCmd.segname());
            if (!isText && !isData)
                continue;
            for (Section sec : segCmd.sections()) {
                if (isText) {
                    // spFpOffset is in text section
                    if (!"__const".equals(sec.sectname()) && !"__text".equals(sec.sectname()))
                        continue;
                } else if (isData) {
                    if (!"__const".equals(sec.sectname()) && !"__data".equals(sec.sectname()))
                        continue;
                } else {
                    continue;
                }

                regions.add(new ByteBufferMemoryReader.MemoryRegion(sec.addr(), sec.addr() + sec.size() - 1, (int)sec.offset()));
            }
        }
        // not likely to happen but data segment is required
        if (dataSegment == null)
            return null;

        return new ByteBufferMemoryReader(rootReader, 0, rootReader.size(), isPatform64Bit(),
                regions.toArray(new ByteBufferMemoryReader.MemoryRegion[regions.size()]));
    }

    public static void main(String[] argv) {
        // just for debug purpose
        try {
            MachOLoader loader = new MachOLoader(new File(argv[0]), cpuTypeFromString(argv[1]));
            // dump info
            System.out.println("Segments:");
            System.out.println(String.format("  %-30s | %10s | %16s | %16s", "", "size", "file_offs", "vm_addr"));
            for (SegmentCommand segment : loader.segments) {
                System.out.println(String.format("  %-30s | %10X | %16X | %16X", segment.segname(),
                        segment.filesize(), segment.fileoff(), segment.vmaddr()));
                int idx = 0;
                for (Section section : segment.sections()) {
                    System.out.println(String.format("  %4d:%-25s | %10X | %16X | %16X",
                            segment.firstSectionIdx() + idx, section.sectname(), section.size(), section.offset(), section.addr()));
                    idx++;
                }
            }
            System.out.println(String.format("Symbols(%d):", loader.symTable.size()));
            for (Map.Entry<String, Long> e : loader.symTable.entrySet()) {
                System.out.println("  " + e.getKey());
            }

        } catch (MachOException e) {
            e.printStackTrace();
        }
    }
}
