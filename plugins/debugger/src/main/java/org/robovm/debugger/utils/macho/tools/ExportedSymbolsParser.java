package org.robovm.debugger.utils.macho.tools;

import org.robovm.debugger.utils.bytebuffer.DataBufferArrayReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.macho.MachOConsts.ExportSymbolFlags;
import org.robovm.debugger.utils.macho.MachOConsts.ExportSymbolKind;
import org.robovm.debugger.utils.macho.cmds.SymtabCommand;
import org.robovm.debugger.utils.macho.structs.NList;

import java.util.Map;

final public class ExportedSymbolsParser {

    public static class ResolvedSymbol {
        public final String symbolName;
        public final ExportSymbolKind kind;
        public final long target;

        public ResolvedSymbol(String symbolName, ExportSymbolKind kind, long target) {
            this.symbolName = symbolName;
            this.kind = kind;
            this.target = target;
        }
    }

    public static void parseSymtabCommand(Map<String, ResolvedSymbol> dest, DataBufferReader reader,
                                          SymtabCommand symtabCommand, boolean is64b) {
        DataBufferReader stringReader;
        if (symtabCommand.strsize < 8 * 1024 * 1024) {
            // read entire data to byte array and wrap to byte buffer
            // to enable array based optimizations
            byte[] symtabBytes = reader.setPosition(symtabCommand.stroff).readBytes((int) symtabCommand.strsize);
            stringReader = DataBufferReader.wrap(symtabBytes);
        } else {
            stringReader = reader.sliceAt(symtabCommand.stroff, (int) symtabCommand.strsize);
        }
        DataBufferReader nlistReader = reader.sliceAt(symtabCommand.symoff, (int) (symtabCommand.nsyms * NList.ITEM_SIZE(is64b)));
        DataBufferArrayReader<NList> arrayReader = new DataBufferArrayReader<>(nlistReader,
                NList.ITEM_SIZE(is64b), NList.OBJECT_READER(is64b));
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
            if (isUsableDebuggerSym(sym)) {
                ExportSymbolKind kind = ExportSymbolKind.ABSOLUTE;
                long target = nlist.n_value();
                ResolvedSymbol resolved = new ResolvedSymbol(sym, kind, target);
                dest.put(sym, resolved);
            }
        }
    }

    public static void parseExportTrie(Map<String, ResolvedSymbol> dest, DataBufferReader trie) {

        Trie.forEach(trie, (symbolName, data, size) -> {
            // capture only usable symbols
            if (isUsableDebuggerSym(symbolName)) {
                DataBufferReader symbolData = data.slice(size);
                int flags = (int) symbolData.readUleb128();
                ExportSymbolKind kind = ExportSymbolKind.values()[flags & ExportSymbolFlags.KIND_MASK];

                // proceed only if symbol: not reexport, not weekm and not stub and resolver
                boolean accept = (flags & ExportSymbolFlags.REEXPORT) == 0 &&
                        (flags & ExportSymbolFlags.WEAK_DEFINITION) == 0 &&
                        (flags & ExportSymbolFlags.STUB_AND_RESOLVER) != 0;

                if (accept) {
                    long target = symbolData.readUleb128();
                    ResolvedSymbol resolved = new ResolvedSymbol(symbolName, kind, target);
                    dest.put(symbolName, resolved);
                }
            }
            return true;
        });
    }

    private static boolean isUsableDebuggerSym(String sym) {
        return sym.endsWith("[debuginfo]") ||
                sym.endsWith("[bptable]") ||
                sym.startsWith("_prim_") ||
                sym.equals("__bcBootClassesHash") ||
                sym.equals("__bcClassesHash") ||
                sym.equals("_robovmBaseSymbol");
    }
}
