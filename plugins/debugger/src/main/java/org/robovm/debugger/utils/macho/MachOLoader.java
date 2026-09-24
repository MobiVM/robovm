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

import org.robovm.debugger.utils.Pair;
import org.robovm.debugger.utils.bytebuffer.*;
import org.robovm.debugger.utils.macho.tools.ChainedFixup;
import org.robovm.debugger.utils.macho.structs.DyLdChainedFixups;
import org.robovm.debugger.utils.macho.cmds.LinkeditDataCommand;
import org.robovm.debugger.utils.macho.cmds.SegmentCommand;
import org.robovm.debugger.utils.macho.cmds.SymtabCommand;
import org.robovm.debugger.utils.macho.structs.MachHeader;
import org.robovm.debugger.utils.macho.structs.Section;
import org.robovm.debugger.utils.macho.tools.ExportedSymbolsParser;
import org.robovm.debugger.utils.macho.tools.ExportedSymbolsParser.ResolvedSymbol;
import org.robovm.debugger.utils.macho.tools.RegionSquasher;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.*;
import java.util.function.*;

/**
 * @author Demyan Kimitsa
 * Class that retrieves information from Match-O binary format
 */
public class MachOLoader {
    private final DataBufferReader rootReader;
    private final DataBufferReaderWriter rootReaderWriter;
    private final MachHeader machOHeader;
    private final int machOCpuType;
    private final List<SegmentCommand> segments = new ArrayList<>();
    private final Map<String, Long> symTable = new HashMap<>();


    public MachOLoader(File executable, int cpuType) throws MachOException {
        ByteBuffer bb;
        try {
            bb = new RandomAccessFile(executable, "rw").getChannel().map(FileChannel.MapMode.PRIVATE, 0, executable.length());
        } catch (IOException e) {
            throw new MachOException("Failed to open mach-o file", e);
        }
        rootReaderWriter = new DataByteBufferWriter(bb);
        rootReader = rootReaderWriter;
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
        List<LinkeditDataCommand> dyldChainedFixups = null;
        Map<String, ResolvedSymbol> exportedSymbols = new HashMap<>();
        long imageBaseAddress = 0;

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

                // update image base address
                if ("__TEXT".equals(segCmd.segname()))
                    imageBaseAddress = segCmd.vmaddr();
            } else if (cmd == MachOConsts.commands.LC_SYMTAB) {
                SymtabCommand symtabCommand = new SymtabCommand(reader);
                ExportedSymbolsParser.parseSymtabCommand(exportedSymbols, reader, symtabCommand, header.is64b());
            } else if (cmd == MachOConsts.commands.LC_DYLD_EXPORTS_TRIE) {
                // read linkedit_data_command
                LinkeditDataCommand dyldExportTrie = new LinkeditDataCommand(reader);
                ExportedSymbolsParser.parseExportTrie(exportedSymbols, reader.sliceAt(dyldExportTrie.getDataoff(),
                        dyldExportTrie.getDatasize()));
            } else if (cmd == MachOConsts.commands.LC_DYLD_CHAINED_FIXUPS) {
                // read linkedit_data_command
                LinkeditDataCommand linkedit = new LinkeditDataCommand(reader);

                if (dyldChainedFixups == null)
                    dyldChainedFixups = new ArrayList<>();
                dyldChainedFixups.add(linkedit);
            }

            reader.setPosition(pos + cmdsize);
        }

        // Apply chained fixups
        if (dyldChainedFixups != null) {
            fixupAllChainedFixups(imageBaseAddress, dyldChainedFixups, exportedSymbols);
        }

        // build symbol table
        for (Map.Entry<String, ResolvedSymbol> e: exportedSymbols.entrySet()) {
            symTable.put(e.getKey(), e.getValue().target);
        }
    }

    private void fixupAllChainedFixups(long imageBaseAddress, List<LinkeditDataCommand> fixups, Map<String, ResolvedSymbol> exportedSymbols) {
        // going to write over mapped file as it mapped in Private mode (copy on write)
        // prepare composite writer over all usable segments
        List<DataBufferReaderWriter> regions = new ArrayList<>();

        // all segments that have virtual addresses are subject for reader
        for (SegmentCommand segment : segments) {
            if (segment.vmaddr() != 0 && segment.vmsize() > 0 && !"__LINKEDIT".equals(segment.segname())) {
                DataBufferReaderWriter writer = rootReaderWriter.sliceAt(segment.fileoff(), (int) segment.filesize(), segment.vmaddr(), isPatform64Bit());
                regions.add(writer);
            }
        }
        CompositeDataBufferWriter compositeWriter = new CompositeDataBufferWriter(regions.toArray(new DataBufferReaderWriter[0]));

        // code is not loaded at any different point so its actual location matches imageBaseAddress and slides from
        // it only at zero bytes
        long slide = 0;
        for (LinkeditDataCommand linkedit: fixups) {
            // process chained LC_DYLD_CHAINED_FIXUPS
            DyLdChainedFixups.Header fixupsHeader = new DyLdChainedFixups.Header(rootReader.sliceAt(linkedit.getDataoff(),
                    linkedit.getDatasize()), exportedSymbols);
            ChainedFixup mapper = new ChainedFixup(imageBaseAddress, compositeWriter);
            mapper.fixupAllChainedFixups(fixupsHeader.startsInSegment, slide, fixupsHeader.imports);
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
        Long symbAddr = symTable.get("_" + symbolName);
        if (symbAddr == null)
            return -1;
        return symbAddr;
    }

    public DataBufferReader memoryReader() {
        List<DataBufferReader> regions = new ArrayList<>();

        // all segments that have virtual addresses are subject for reader
        List<Pair<SegmentCommand, Section>> sections = new ArrayList<>();
        for (SegmentCommand segment : segments) {
            if (segment.vmaddr() != 0 && segment.vmsize() > 0 && !"__LINKEDIT".equals(segment.segname())) {
                for (Section section : segment.sections()) {
                    sections.add(new Pair<>(segment, section));
                }
            }
        }

        Predicate<Pair<SegmentCommand, Section>> uninitialized = (p) -> {
            Section section = p.right;
            return "__DATA".equals(section.segname()) && ("__bss".equals(section.sectname()) || "__common".equals(section.sectname()));
        };

        // in memory section can be fill memory pages but on disk it might take smaller amount of bytes
        // to join two sections together its important to know if address space corresponds disk space
        ToLongFunction<Pair<SegmentCommand, Section>> rightMarginOnDisk = (p) ->
                Math.min(p.right.addr() + p.right.size(), p.left.vmaddr() + p.left.filesize());

        BiPredicate<Pair<SegmentCommand, Section>, Pair<SegmentCommand, Section>> canSquash = (first, last) -> {
            // can squash if both are uninitialized (both are not)
            // and start of last one matches end of first one (allow some gap due alignments)
            boolean zeroSection = uninitialized.test(first);
            if (zeroSection != uninitialized.test(last))
                return false;
            if (zeroSection) {
                return (last.right.addr() - (first.right.addr() + first.right.size())) < 64;
            } else {
                return last.right.addr() - rightMarginOnDisk.applyAsLong(first) < 64;
            }
        };

        // sort by section addresses
        sections.sort(Comparator.comparingLong(p -> p.right.addr()));

        // squasher
        BiConsumer<Pair<SegmentCommand, Section>, Pair<SegmentCommand, Section>> squasher = (p1, p2) -> {
            Section first = p1.right;
            Section last = p2.right;
            DataBufferReader reader;
            if (uninitialized.test(p1)) {
                long size = last.addr() + last.size() - first.addr();
                reader = new NullDataBufferReader(first.addr(), size, isPatform64Bit());
            } else {
                long size = rightMarginOnDisk.applyAsLong(p2) - first.addr();
                reader = rootReader.sliceAt(first.offset(), (int) size, first.addr(), isPatform64Bit());
            }
            regions.add(reader);
        };

        // squash sections
        RegionSquasher.squash(sections, canSquash, squasher);

        return new CompositeDataBufferReader(regions.toArray(new DataBufferReader[0]));
    }

    public static void main(String[] argv) {
        // just for debug purpose
        try {
            MachOLoader loader = new MachOLoader(new File(argv[0]), cpuTypeFromString(argv[1]));
            // dump info
            System.out.println("Segments:");
            System.out.printf("  %-30s | %10s | %16s | %16s%n", "", "size", "file_offs", "vm_addr");
            for (SegmentCommand segment : loader.segments) {
                System.out.printf("  %-30s | %10X | %16X | %16X%n", segment.segname(),
                        segment.filesize(), segment.fileoff(), segment.vmaddr());
                int idx = 0;
                for (Section section : segment.sections()) {
                    System.out.printf("  %4d:%-25s | %10X | %16X | %16X%n",
                            segment.firstSectionIdx() + idx, section.sectname(), section.size(), section.offset(), section.addr());
                    idx++;
                }
            }
            System.out.printf("Symbols(%d):%n", loader.symTable.size());
            for (Map.Entry<String, Long> e : loader.symTable.entrySet()) {
                System.out.println("  " + e.getKey());
            }

        } catch (MachOException e) {
            e.printStackTrace();
        }
    }
}
