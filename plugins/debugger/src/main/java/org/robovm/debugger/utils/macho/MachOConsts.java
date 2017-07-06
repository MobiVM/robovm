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

/**
 * @author Demyan Kimitsa
 * Mach-o constants and structures
 */
public final class MachOConsts {
    // the mach magic number
    public static final long MAGIC = 0xfeedfaceL;
    public static final long MAGIC_64 = 0xfeedfacfL;

    // fat magic numbers
    public static final long FAT_MAGIC = 0xcafebabeL;
    public static final long FAT_MAGIC_64 = 0xcafebabfL;
    public static final long FAT_CIGAM = 0xbebafecaL;
    public static final long FAT_CIGAM_64 = 0xbfbafecaL;

    public static final class cpu_type {
        public static final int CPU_ARCH_ABI64 = 0x01000000;
        public static final int CPU_TYPE_X86 = 7;
        public static final int CPU_TYPE_I386 = CPU_TYPE_X86; /* compatibility */
        public static final int CPU_TYPE_X86_64 = (CPU_TYPE_X86 | CPU_ARCH_ABI64);
        public static final int CPU_TYPE_ARM = 12;
        public static final int CPU_TYPE_ARM64 = (CPU_TYPE_ARM | CPU_ARCH_ABI64);
    }

    public static final class cpu_sub_type {
        public static final int CPU_SUBTYPE_LITTLE_ENDIAN = 0;
        public static final int CPU_SUBTYPE_BIG_ENDIAN = 1;
    }

    public static final class commands {
        public static final int LC_SEGMENT = 0x1;
        public static final int LC_SEGMENT_64 = 0x19;
        public static final int LC_SYMTAB = 0x2;
        public static final int LC_DYSYMTAB = 0xb;
    }

    public static class nlist {
        public static final int N_STAB = 0xe0;  // if any of these bits set, a symbolic debugging entry
        public static final int N_PEXT = 0x10;  // private external symbol bit
        public static final int N_TYPE = 0x0e;  // mask for the type bits
        public static final int N_EXT = 0x01;   // external symbol bit, set for external symbols

        public static final int N_TYPE_UNDF = 0x0;  // undefined, n_sect == NO_SECT
        public static final int N_TYPE_ABS = 0x2;   // absolute, n_sect == NO_SECT
        public static final int N_TYPE_SECT = 0xe;  // defined in section number n_sect
        public static final int N_TYPE_PBUD = 0xc;  // prebound undefined (defined in a dylib)
        public static final int N_TYPE_INDR = 0xa;  // indirect
    }

    public static class stab {
        public static final int N_GSYM = 0x20;   // global symbol: name,,NO_SECT,type,0
        public static final int N_FNAME = 0x22;  // procedure name (f77 kludge): name,,NO_SECT,0,0
        public static final int N_FUN = 0x24;    // procedure: name,,n_sect,linenumber,address
        public static final int N_STSYM = 0x26;  // static symbol: name,,n_sect,type,address
        public static final int N_LCSYM = 0x28;  // .lcomm symbol: name,,n_sect,type,address
        public static final int N_BNSYM = 0x2e;  // begin nsect sym: 0,,n_sect,0,address
        public static final int N_AST = 0x32;    // AST file path: name,,NO_SECT,0,0
        public static final int N_OPT = 0x3c;    // emitted with gcc2_compiled and in gcc source
        public static final int N_RSYM = 0x40;   // register sym: name,,NO_SECT,type,register
        public static final int N_SLINE = 0x44;  // src line: 0,,n_sect,linenumber,address
        public static final int N_ENSYM = 0x4e;  // end nsect sym: 0,,n_sect,0,address
        public static final int N_SSYM = 0x60;   // structure elt: name,,NO_SECT,type,struct_offset
        public static final int N_SO = 0x64;     // source file name: name,,n_sect,0,address
        public static final int N_OSO = 0x66;    // object file name: name,,0,0,st_mtime
        public static final int N_LSYM = 0x80;   // local sym: name,,NO_SECT,type,offset
        public static final int N_BINCL = 0x82;  // include file beginning: name,,NO_SECT,0,sum
        public static final int N_SOL = 0x84;    // #included file name: name,,n_sect,0,address
        public static final int N_PARAMS = 0x86;  // compiler parameters: name,,NO_SECT,0,0
        public static final int N_VERSION = 0x88; // compiler version: name,,NO_SECT,0,0
        public static final int N_OLEVEL = 0x8A;  // compiler -O level: name,,NO_SECT,0,0
        public static final int N_PSYM = 0xa0;   // parameter: name,,NO_SECT,type,offset
        public static final int N_EINCL = 0xa2;  // include file end: name,,NO_SECT,0,0
        public static final int N_ENTRY = 0xa4;  // alternate entry: name,,n_sect,linenumber,address
        public static final int N_LBRAC = 0xc0;  // left bracket: 0,,NO_SECT,nesting level,address
        public static final int N_EXCL = 0xc2;   // deleted include file: name,,NO_SECT,0,sum
        public static final int N_RBRAC = 0xe0;  // right bracket: 0,,NO_SECT,nesting level,address
        public static final int N_BCOMM = 0xe2;  // begin common: name,,NO_SECT,0,0
        public static final int N_ECOMM = 0xe4;  // end common: name,,n_sect,0,0
        public static final int N_ECOML = 0xe8;  // end common (local name): 0,,n_sect,0,address
        public static final int N_LENG = 0xfe;   // second stab entry with length information
    }
}
