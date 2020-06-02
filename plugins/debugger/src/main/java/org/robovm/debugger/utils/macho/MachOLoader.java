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

import org.robovm.debugger.utils.bytebuffer.CompositeDataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferArrayReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataByteBufferReader;
import org.robovm.debugger.utils.bytebuffer.NullDataBufferReader;
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
 * Class that retrieves information from Match-O binary format
 */
public class MachOLoader {
    private final DataBufferReader rootReader;
    private final MachHeader machOHeader;
    private final int machOCpuType;
    private final List<SegmentCommand> segments = new ArrayList<>();
    private final Map<String, Long> symTable = new HashMap<>();
    private SegmentCommand dataSegment;


    public MachOLoader(File executable, int cpuType) throws MachOException {
        ByteBuffer bb;
        try {
            bb = new RandomAccessFile(executable, "r").getChannel().map(FileChannel.MapMode.READ_ONLY, 0, executable.length());
        } catch (IOException e) {
            throw new MachOException("Failed to open mach-o file", e);
        }
        rootReader = new DataByteBufferReader(bb);
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

    private MachHeader parseMachHeader(DataBufferReader reader, long magic) throws MachOException {
        if (magic != MachOConsts.MAGIC && magic != MachOConsts.MAGIC_64)
            throw new MachOException("unexpected Mach header MAGIC 0x" + Long.toHexString(magic));
        return new MachHeader(reader, magic == MachOConsts.MAGIC_64);
    }

    private void readCommandData(DataBufferReader reader, MachHeader header) {
        int sectionIdx = 1;
        // read all commands
        for (int idx = 0; idx < header.ncmds(); idx++) {
            long pos = reader.position();
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
                DataBufferReader stringReader;
                if (symtabCommand.strsize < 8 * 1024 * 1024) {
                    // read entire data to byte array and wrap to byte buffer
                    // to enable array based optimizations
                    byte[] symtabBytes = reader.setPosition(symtabCommand.stroff).readBytes((int) symtabCommand.strsize);
                    stringReader = DataBufferReader.wrap(symtabBytes);
                } else {
                    stringReader = reader.sliceAt(symtabCommand.stroff, (int) symtabCommand.strsize);
                }
                DataBufferReader nlistReader = reader.sliceAt(symtabCommand.symoff, (int) (symtabCommand.nsyms * NList.ITEM_SIZE(header.is64b())));
                DataBufferArrayReader<NList> arrayReader = new DataBufferArrayReader<>(nlistReader,
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
                    String sym = stringReader.readStringZ(nlist.n_strx());
                    if (isUsableDebuggerSym(sym))
                        symTable.put(sym, nlist.n_value());
                }
            }

            reader.setPosition(pos + cmdsize);
        }
    }

    private boolean isUsableDebuggerSym(String sym) {
        return sym.endsWith("[debuginfo]") ||
                sym.endsWith("[bptable]") ||
                sym.startsWith("_prim_") ||
                sym.equals("__bcBootClassesHash") ||
                sym.equals("__bcClassesHash") ||
                sym.equals("_robovmBaseSymbol");
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
        Long symbAddr = symTable.get("_" + symbolName);
        if (symbAddr == null)
            return -1;
        return symbAddr;
    }

    public DataBufferReader memoryReader() {
        // after test it clear that some data is read from __TEXT section (consts) so need to pick proper sections into
        // list
        List<DataBufferReader> regions = new ArrayList<>();
        for (SegmentCommand segCmd : segments) {
            boolean isText = "__TEXT".equals(segCmd.segname());
            boolean isData = "__DATA".equals(segCmd.segname());
            if (!isText && !isData)
                continue;
            for (Section sec : segCmd.sections()) {
                DataBufferReader region = null;
                if (isText) {
                    // spFpOffset is in text section
                    if (!"__const".equals(sec.sectname()) && !"__text".equals(sec.sectname()))
                        continue;
                } else {
                    // data
                    if ("__bss".equals(sec.sectname()) || "__common".equals(sec.sectname())) {
                        // zero initialized zeros data goes to __bss(static)/__common(global) so have to read it as well
                        region = new NullDataBufferReader(sec.addr(), (int) sec.size(), isPatform64Bit());
                    } else if (!"__const".equals(sec.sectname()) && !"__data".equals(sec.sectname()))
                        continue;
                }

                if (region == null)
                    region = rootReader.sliceAt(sec.offset(), (int) sec.size(), sec.addr(), isPatform64Bit());
                regions.add(region);
            }
        }
        // not likely to happen but data segment is required
        if (dataSegment == null)
            return null;

        return new CompositeDataBufferReader(regions.toArray(new DataBufferReader[0]));
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
