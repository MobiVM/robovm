package org.robovm.debugger.utils.macho.cmds;

import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

/**
 * @author Demyan Kimitsa
 * mach-o symtab command definition
 */
public class SymtabCommand {
    public final long symoff;
    public final long nsyms;
    public final long stroff;
    public final long strsize;

    public SymtabCommand(ByteBufferReader reader) {
        //uint32_t	symoff;		/* symbol table offset */
        symoff = reader.readUnsignedInt32();
        //uint32_t	nsyms;		/* number of symbol table entries */
        nsyms = reader.readUnsignedInt32();
        //uint32_t	stroff;		/* string table offset */
        stroff = reader.readUnsignedInt32();
        //uint32_t	strsize;	/* string table size in bytes */
        strsize = reader.readUnsignedInt32();
    }
}
