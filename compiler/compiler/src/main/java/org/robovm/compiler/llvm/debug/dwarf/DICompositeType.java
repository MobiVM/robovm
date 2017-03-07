package org.robovm.compiler.llvm.debug.dwarf;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataNodeBuilder;

/**
 * Composite type for:
 * DW_TAG_array_type       = 1
 * DW_TAG_enumeration_type = 4
 * DW_TAG_structure_type   = 19
 * DW_TAG_union_type       = 23
 * DW_TAG_subroutine_type  = 21
 * DW_TAG_inheritance      = 28
 */
public class DICompositeType extends DIBaseItem {
    private int typeTag;
    private String typeName;
    private int definitionLineNo;
    private int sizeInBits;
    private int allignmentInBits;
    private int offsetsInBits;
    private int flags;
    private int runtimeLangs;
    private DIBaseItem file;
    private DIBaseItem fileContext;
    private DIBaseItem derivedType;
    private DIBaseItem memberTypes;

    public DICompositeType(ModuleBuilder builder) {
        super(builder);
    }

    private MetadataNode build() {
        MetadataNodeBuilder builder = new MetadataNodeBuilder();
        // building following structure
        //!6 = metadata !{
        //DIHeader(
        builder.add(
                (new DIHeader())
                        //i32,      ;; Tag (see below)
                        .add(typeTag)
                        //mdstring, ;; Name (may be "" for anonymous types)
                        .add(typeName != null ? typeName : "")
                        //i32,      ;; Line number where defined (may be 0)
                        .add(definitionLineNo)
                        //i64,      ;; Size in bits
                        .add(sizeInBits)
                        //i64,      ;; Alignment in bits
                        .add(allignmentInBits)
                        //i64,      ;; Offset in bits
                        .add(offsetsInBits)
                        //i32,      ;; Flags
                        .add(flags)
                        //i32       ;; Runtime languages
                        .add(runtimeLangs)
                //),
        );

        //metadata, ;; Source directory (including trailing slash) & file pair (may be null)
        builder.add(file != null ? file.get() : null);
        //metadata, ;; Reference to context
        builder.add(fileContext != null ? fileContext.get() : null);
        //metadata, ;; Reference to type derived from
        builder.add(derivedType != null ? derivedType.get() : null);
        //metadata, ;; Reference to array of member descriptors
        builder.add(memberTypes != null ? memberTypes.get() : null);
        //metadata, ;; Base type containing the vtable pointer for this type
        builder.add(null);
        //metadata, ;; Template parameters
        builder.add(null);
        //mdstring  ;; A unique identifier for type uniquing purpose (may be null)
        builder.add(null);
        //}

        return builder.build();
    }

    @Override
    public String toString() {
        return build().toString();
    }

    public DICompositeType setTypeTag(int typeTag) {
        this.typeTag = typeTag;
        return this;
    }

    public DICompositeType setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public DICompositeType setDefinitionLineNo(int definitionLineNo) {
        this.definitionLineNo = definitionLineNo;
        return this;
    }

    public DICompositeType setSizeInBits(int sizeInBits) {
        this.sizeInBits = sizeInBits;
        return this;
    }

    public DICompositeType setAllignmentInBits(int allignmentInBits) {
        this.allignmentInBits = allignmentInBits;
        return this;
    }

    public DICompositeType setOffsetsInBits(int offsetsInBits) {
        this.offsetsInBits = offsetsInBits;
        return this;
    }

    public DICompositeType setFlags(int flags) {
        this.flags = flags;
        return this;
    }

    public DICompositeType setRuntimeLangs(int runtimeLangs) {
        this.runtimeLangs = runtimeLangs;
        return this;
    }

    public DICompositeType setFile(DIBaseItem file) {
        this.file = file;
        return this;
    }

    public DICompositeType setFileContext(DIBaseItem fileContext) {
        this.fileContext = fileContext;
        return this;
    }

    public DICompositeType setDerivedType(DIBaseItem derivedType) {
        this.derivedType = derivedType;
        return this;
    }

    public DICompositeType setMemberTypes(DIBaseItem memberTypes) {
        this.memberTypes = memberTypes;
        return this;
    }
}
