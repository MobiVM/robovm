package org.robovm.compiler.llvm.debug.dwarf;

import org.robovm.compiler.ModuleBuilder;

/** file descriptor metadata */
public class DIFileDescriptor extends DIItemList {
    public DIFileDescriptor(ModuleBuilder builder, DIBaseItem file) {
        // follows following structure
        // DIHeader(
        //    i32       ;; Tag = 41 (DW_TAG_file_type)
        //  ),
        //  metadata  ;; Source directory (including trailing slash) & file pair
        super(builder, (new DIHeader()).add(DwarfConst.Tag.TAG_file_type), file.get());
    }
}
