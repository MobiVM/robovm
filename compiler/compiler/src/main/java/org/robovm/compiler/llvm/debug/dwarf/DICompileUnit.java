package org.robovm.compiler.llvm.debug.dwarf;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Version;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataNodeBuilder;

/**
 * Compile unit metadata
 */
public class DICompileUnit extends DIBaseItem {

    private DIBaseItem file;
    private DIBaseItem methods;

    public DICompileUnit(ModuleBuilder builder, String name, DIBaseItem file, DIBaseItem methods) {
        super(builder, name);
        this.file = file;
        this.methods = methods;
    }

    private MetadataNode build() {
        MetadataNodeBuilder builder = new MetadataNodeBuilder();
        // Building following struct
        //!0 = metadata !{
        //  DIHeader(
        builder.add(
                (new DIHeader())
                        //    i32,       ;; Tag = 17 (DW_TAG_compile_unit)
                        .add(DwarfConst.Tag.TAG_compile_unit)
                        //    i32,       ;; DWARF language identifier (ex. DW_LANG_C89)
                        .add(DwarfConst.SourceLanguage.LANG_Java)
                        //    mdstring,  ;; Producer (ex. "4.0.1 LLVM (LLVM research group)")
                        .add("RoboVM " + Version.getVersion())
                        //    i1,        ;; True if this is optimized.
                        .add(false)
                        //    mdstring,  ;; Flags
                        .add("")
                        //    i32,       ;; Runtime version
                        .add(0)
                        //    mdstring,  ;; Split debug filename
                        .add("")
                        //    i32        ;; Debug info emission kind (1 = Full Debug Info, 2 = Line Tables Only)
                        .add(2)
                //  ),
        );
        //  metadata,  ;; Source directory (including trailing slash) & file pair
        builder.add(file.get());
        //  metadata,  ;; List of enums types
        builder.add(new MetadataNode());
        //  metadata,  ;; List of retained types
        builder.add(new MetadataNode());
        //  metadata,  ;; List of subprograms
        builder.add(methods.get());
        //  metadata,  ;; List of global variables
        builder.add(new MetadataNode());
        //  metadata   ;; List of imported entities
        builder.add(new MetadataNode());
        //}
        return builder.build();
    }

    @Override
    public String toString() {
        return build().toString();
    }
}
