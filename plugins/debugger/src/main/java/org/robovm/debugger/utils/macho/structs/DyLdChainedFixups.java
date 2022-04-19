package org.robovm.debugger.utils.macho.structs;

import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.macho.MachOConsts;
import org.robovm.debugger.utils.macho.tools.Bits64;
import org.robovm.debugger.utils.macho.tools.ExportedSymbolsParser.ResolvedSymbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.robovm.debugger.utils.macho.MachOConsts.dyld.*;

public class DyLdChainedFixups {
    static final int DYLD_CHAINED_IMPORT = 1;
    static final int DYLD_CHAINED_IMPORT_ADDEND = 2;
    static final int DYLD_CHAINED_IMPORT_ADDEND64 = 3;

    // header of the LC_DYLD_CHAINED_FIXUPS payload
    // dyld_chained_fixups_header
    public static class Header {
        public final StartsInSegment[] startsInSegment;
        public final Long[] imports;

        public Header(DataBufferReader reader, Map<String, ResolvedSymbol> knownSymbols) {
            long start = reader.position();

            // uint32_t    fixups_version;    // 0
            int fixups_version = reader.readInt32();
            // uint32_t    starts_offset;     // offset of dyld_chained_starts_in_image in chain_data
            long starts_offset = reader.readUnsignedInt32();
            // uint32_t    imports_offset;    // offset of imports table in chain_data
            long imports_offset = reader.readUnsignedInt32();
            // uint32_t    symbols_offset;    // offset of symbol strings in chain_data
            long symbols_offset = reader.readUnsignedInt32();
            // uint32_t    imports_count;     // number of imported symbol names
            int imports_count = reader.readInt32();
            // uint32_t    imports_format;    // DYLD_CHAINED_IMPORT*
            int imports_format = reader.readInt32();
            // uint32_t    symbols_format;    // 0 => uncompressed, 1 => zlib compressed
            boolean symbolsCompressed = reader.readInt32() == 1;
            if (symbolsCompressed)
                throw new UnsupportedOperationException("Compressed symbols not supported at moment");

            // parse starts
            startsInSegment = parseChainedStartsInImage(reader.setPosition(starts_offset));

            // parse imports
            DataBufferReader stringReader = reader.setPosition(start + symbols_offset).slice();
            imports = parseImports(imports_format, reader.setPosition(start + imports_offset),
                    stringReader, imports_count, knownSymbols);
        }

        private StartsInSegment[] parseChainedStartsInImage(DataBufferReader reader) {
            long start = reader.position();

            // uint32_t    seg_count;
            // uint32_t    seg_info_offset[1];  // each entry is offset into this struct for that segment
            // followed by pool of dyld_chain_starts_in_segment data
            int seg_count = reader.readInt32();
            List<StartsInSegment> chainedStars = new ArrayList<>(seg_count);
            for (int i = 0; i < seg_count; i++) {
                int offset = reader.readInt32();
                if (offset != 0) {
                    long savedPos = reader.position();
                    reader.setPosition(start + offset);
                    chainedStars.add(new StartsInSegment(reader));
                    reader.setPosition(savedPos);
                }
            }

            return chainedStars.toArray(new StartsInSegment[0]);
        }

        private Long[] parseImports(int format, DataBufferReader reader, DataBufferReader stringReader, int count,
                                      Map<String, ResolvedSymbol> knownSymbols) {
            Long[] imports = new Long[count];

            for (int i = 0; i < count; i++)
                imports[i] = parseSingleImport(format, reader, stringReader, knownSymbols);
            return imports;
        }

        private Long parseSingleImport(int format, DataBufferReader reader, DataBufferReader stringReader,
                                       Map<String, ResolvedSymbol> knownSymbols) {
            long v;
            int lib_ordinal;
            boolean weak_import;
            String symbolName;
            long addend;
            switch (format) {
                case DYLD_CHAINED_IMPORT: {
                    // uint32_t lib_ordinal :  8,
                    //          weak_import :  1,
                    //          name_offset : 23;
                    v = reader.readUnsignedInt32();
                    lib_ordinal = (int) (v & 0xff);
                    weak_import = ((v >> 8) & 1) == 1;
                    long name_offset = (v >> 9 & 0x7fffff);
                    symbolName = stringReader.setPosition(name_offset).readStringZ();
                    addend = 0;
                    break;
                }

                case DYLD_CHAINED_IMPORT_ADDEND: {
                    // uint32_t lib_ordinal :  8,
                    //          weak_import :  1,
                    //          name_offset : 23;
                    // int32_t  addend;
                    v = reader.readUnsignedInt32();
                    lib_ordinal = (int) (v & 0xff);
                    weak_import = ((v >> 8) & 1) == 1;
                    long name_offset = (v >> 9 & 0x7fffff);
                    symbolName = stringReader.setPosition(name_offset).readStringZ();
                    addend = reader.readUnsignedInt32();
                    break;
                }

                case DYLD_CHAINED_IMPORT_ADDEND64: {
                    // uint64_t lib_ordinal : 16,
                    //          weak_import :  1,
                    //          reserved    : 15,
                    //          name_offset : 32;
                    // uint64_t addend;
                    v = reader.readUnsignedInt32();
                    lib_ordinal = (int) (v & 0xff);
                    weak_import = ((v >> 8) & 1) == 1;
                    long name_offset = (v >> 9 & 0x7fffff);
                    symbolName = stringReader.setPosition(name_offset).readStringZ();
                    addend = reader.readLong();
                    break;
                }

                default:
                    // throw new IllegalArgumentException("Unsupported import format: " + format);
                    return null;
            }

            // capture only symbols debugger will be used for -- own ones
            if (lib_ordinal == MachOConsts.BindSpecialDylib.SELF && !weak_import) {
                ResolvedSymbol resolvedSymbol = knownSymbols.get(symbolName);
                if (resolvedSymbol != null) {
                    switch (resolvedSymbol.kind) {
                        case REGULAR:
                        case ABSOLUTE:
                            return resolvedSymbol.target + addend;

                        case THREAD_LOCAL:
                            // no type checking that client expected TLV yet
                            return resolvedSymbol.target;
                    }
                }
            }

            // import bind debugger doesn't bother about
            return null;
        }
    }


    public static class StartsInSegment {
        public final short page_size;
        public final short pointer_format;
        public final long segment_offset;
        public final long max_valid_pointer;
        public final short[] page_starts;
        // or DYLD_CHAINED_PTR_START_NONE if no fixups on page
        // uint16_t    chain_starts[1];    // some 32-bit formats may require multiple starts per page.

        public StartsInSegment(DataBufferReader reader) {
            // uint32_t    size;               // size of this (amount kernel needs to copy)
            int size = reader.readInt32();
            // uint16_t    page_size;          // 0x1000 or 0x4000
            page_size = reader.readInt16();
            // uint16_t    pointer_format;     // DYLD_CHAINED_PTR_*
            pointer_format = reader.readInt16();
            // uint64_t    segment_offset;     // offset in memory to start of segment
            segment_offset = reader.readLong();
            // uint32_t    max_valid_pointer;  // for 32-bit OS, any value beyond this is not a pointer
            max_valid_pointer = reader.readInt32();
            // uint16_t    page_count;         // how many pages are in array
            short page_count = reader.readInt16();
            // uint16_t    page_start[1];      // each entry is offset in each page of first element in chain
            // or DYLD_CHAINED_PTR_START_NONE if no fixups on page
            page_starts = new short[page_count];
            for (int i = 0; i < page_count; i++)
                page_starts[i] = reader.readInt16();
        }
    }

    /**
     * represent fixup pointer structures
     */
    public static class PointerOnDisk extends Bits64 {
        public final long addr;

        public final Arm64e arm64e = new Arm64e();
        public final Generic64 generic64 = new Generic64();

        public PointerOnDisk(long addr, long val) {
            super(val);
            this.addr = addr;
        }

        public class Arm64e {
            public final AuthRebase authRebase = new AuthRebase();
            public final AuthBind authBind = new AuthBind();
            public final Rebase rebase = new Rebase();
            public final Bind bind = new Bind();

            public long signPointer(PointerOnDisk loc, long target) {
                assert (authBind.auth());
                return target;
            }

            public long signExtendedAddend() {
                assert (authBind.bind());
                assert (!authBind.auth());
                long addend19 = bind.addend();
                if ((addend19 & 0x40000) != 0)
                    return addend19 | 0xFFFFFFFFFFFC0000L;
                else
                    return addend19;
            }

            public long unpackTarget() {
                assert (!authBind.bind());
                assert (!authBind.auth());
                return (rebase.high8() << 56) | (this.rebase.target());
            }

            public class Rebase {
                // uint64_t    target   : 43,    // vmaddr
                //    high8    :  8,
                //    next     : 11,    // 8-byte stide
                //    bind     :  1,    // == 0
                //    auth     :  1;    // == 0
                public long target() {
                    return getLongBits(43);
                }

                public long high8() {
                    return getLongBits(8, 43);
                }

                public long next() {
                    return getLongBits(11, 43 + 8);
                }

                public boolean bind() {
                    return getBooleanBit(43 + 8 + 11);
                }

                public boolean auth() {
                    return getBooleanBit(43 + 8 + 11 + 1);
                }
            }

            public class Bind {
                // uint64_t    ordinal   : 16,
                //    zero      : 16,
                //    addend    : 19,
                //    next      : 11,    // 8-byte stide
                //    bind      :  1,    // == 1
                //    auth      :  1;    // == 0
                public int ordinal() {
                    return getIntBits(16);
                }

                public long addend() {
                    return getLongBits(19, 16 + 16);
                }

                public long next() {
                    return getLongBits(11, 16 + 16 + 19);
                }

                public boolean bind() {
                    return getBooleanBit(16 + 16 + 19 + 11);
                }

                public boolean auth() {
                    return getBooleanBit(16 + 16 + 19 + 11 + 1);
                }
            }

            public class AuthRebase {
                // uint64_t    target    : 32,   // runtimeOffset
                //    diversity : 16,
                //    addrDiv   :  1,
                //    key       :  2,
                //    next      : 11,    // 8-byte stide
                //    bind      :  1,    // == 0
                //    auth      :  1;    // == 1

                public long target() {
                    return getLongBits(32);
                }

                public int diversity() {
                    return getIntBits(16, 32);
                }

                public boolean addrDiv() {
                    return getBooleanBit(32 + 16);
                }

                public int key() {
                    return getIntBits(2, 32 + 16 + 1);
                }

                public long next() {
                    return getIntBits(11, 32 + 16 + 1 + 2);
                }

                public boolean bind() {
                    return getBooleanBit(32 + 16 + 1 + 2 + 11);
                }

                public boolean auth() {
                    return getBooleanBit(32 + 16 + 1 + 2 + 11 + 1);
                }
            }

            public class AuthBind {
                //uint64_t ordinal   :16,
                //    zero      :16,
                //    diversity :16,
                //    addrDiv   :1,
                //    key       :2,
                //    next      :11,    // 8-byte stide
                //    bind      :1,    // == 1
                //    auth      :1;    // == 1
                public int ordinal() {
                    return getIntBits(16);
                }

                public int diversity() {
                    return getIntBits(16, 16 + 16);
                }

                public boolean addrDiv() {
                    return getBooleanBit(16 + 16 + 16);
                }

                public int key() {
                    return getIntBits(2, 16 + 16 + 16 + 1);
                }

                public long next() {
                    return getIntBits(11, 16 + 16 + 16 + 1 + 2);
                }

                public boolean bind() {
                    return getBooleanBit(16 + 16 + 16 + 1 + 2 + 11);
                }

                public boolean auth() {
                    return getBooleanBit(16 + 16 + 16 + 1 + 2 + 11 + 1);
                }
            }
        }

        public class Generic64 {
            public final Rebase rebase = new Rebase();
            public final Bind bind = new Bind();

            public long signExtendedAddend() {
                long addend27 = bind.addend();
                long top8Bits = addend27 & 0x00007F80000L;
                long bottom19Bits = addend27 & 0x0000007FFFFL;
                return (top8Bits << 13) | (((bottom19Bits << 37) >> 37) & 0x00FFFFFFFFFFFFFFL);
            }

            public long unpackedTarget() {
                return (rebase.high8() << 56) | rebase.target();
            }

            public class Rebase {
                // uint64_t    target    : 36,    // vmaddr, 64GB max image size
                //    high8     :  8,    // top 8 bits set to this after slide added
                //    reserved  :  7,    // all zeros
                //    next      : 12,    // 4-byte stride
                //    bind      :  1;    // == 0
                public long target() {
                    return getLongBits(36);
                }

                public long high8() {
                    return getLongBits(8, 36);
                }

                public long next() {
                    return getLongBits(12, 36 + 8 + 7);
                }

                public boolean bind() {
                    return getBooleanBit(36 + 8 + 7 + 12);
                }

                @Override
                public String toString() {
                    return "Rebase: " +
                            "target=" + Long.toHexString(target()) +
                            ", hig8h=" + Long.toHexString(high8()) +
                            ", next=" + Long.toHexString(next()) +
                            ", bind=" + bind();
                }
            }

            // DYLD_CHAINED_PTR_64
            public class Bind {
                // uint64_t    ordinal   : 24,
                //    addend    :  8,   // 0 thru 255
                //    reserved  : 19,   // all zeros
                //    next      : 12,   // 4-byte stride
                //    bind      :  1;   // == 1
                public int ordinal() {
                    return getIntBits(24);
                }

                public long addend() {
                    return getLongBits(8, 24);
                }

                public long next() {
                    return getLongBits(12, 24 + 8 + 19);
                }

                public boolean bind() {
                    return getBooleanBit(24 + 8 + 19 + 12);
                }

                public String toString() {
                    return "Bind: " +
                            "ordinal=" + Long.toHexString(ordinal()) +
                            ", addend=" + Long.toHexString(addend()) +
                            ", next=" + Long.toHexString(next()) +
                            ", bind=" + bind();
                }
            }

            @Override
            public String toString() {
                return "Generic64: raw=" + Long.toHexString(raw);
            }
        }

        public static int strideSize(short pointerFormat) {
            switch (pointerFormat) {
                case DYLD_CHAINED_PTR_ARM64E:
                case DYLD_CHAINED_PTR_ARM64E_USERLAND:
                case DYLD_CHAINED_PTR_ARM64E_USERLAND24:
                    return 8;
                case DYLD_CHAINED_PTR_ARM64E_KERNEL:
                case DYLD_CHAINED_PTR_ARM64E_FIRMWARE:
                case DYLD_CHAINED_PTR_32_FIRMWARE:
                case DYLD_CHAINED_PTR_64:
                case DYLD_CHAINED_PTR_64_OFFSET:
                case DYLD_CHAINED_PTR_32:
                case DYLD_CHAINED_PTR_32_CACHE:
                case DYLD_CHAINED_PTR_64_KERNEL_CACHE:
                    return 4;
                case DYLD_CHAINED_PTR_X86_64_KERNEL_CACHE:
                    return 1;
            }

            throw new IllegalArgumentException("unsupported pointer chain format " + pointerFormat);
        }
    }
}
