package org.robovm.compiler.llvm.debug.dwarf;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.BooleanConstant;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.NamedMetadata;
import org.robovm.compiler.llvm.UnnamedMetadata;

/**
 * base class for metadata, used as single point of data to be attached to builder and once attached this data
 * should be used as everywhere as metadata reference
 * it is intentionally doesn't extend metadata to be make sure value object not to be used as reference and vise verse
 */
public class DIBaseItem {
    private final Metadata value;

    /**
     * this metadata is not attached to root and will be used as value and not reference
     */
    public DIBaseItem() {
        this.value = new MetadataWrap();
    }

    protected DIBaseItem(Metadata w) {
        this.value = w != null ? w : new MetadataWrap();
    }

    /**
     * Creates metadata to be added to root with unnamed reference
     * @param builder to attach metadata to root of
     */
    public DIBaseItem(ModuleBuilder builder) {
        this(builder, (Metadata)null);
    }

    protected DIBaseItem(ModuleBuilder builder, Metadata w) {
        this.value = builder.newUnnamedMetadata(w != null ? w : new MetadataWrap()).ref();
    }

    /**
     * Creates metadata to be added to root and referenced with name
     * @param builder to attach metadata to root of
     * @param name to give to metadata
     */
    public DIBaseItem(ModuleBuilder builder, String name) {
        this(builder, name, null);
    }

    protected DIBaseItem(ModuleBuilder builder, String name, Metadata... values) {
        NamedMetadata namedMetadata;
        if (values == null) {
            namedMetadata = new NamedMetadata(name,  builder.newUnnamedMetadata(new MetadataWrap()));
        } else {
            UnnamedMetadata[] unnamedMetadataList = new UnnamedMetadata[values.length];
            int idx = 0;
            for (Metadata v : values)
                unnamedMetadataList[idx++] =  builder.newUnnamedMetadata(v);
            namedMetadata = new NamedMetadata(name, unnamedMetadataList);
        }
        builder.addNamedMetadata(namedMetadata);
        this.value = new NamedMetadataRef(name);
    }

    /**
     * method to be used when this metadata is referenced. If it is attached to builder there will be ref returned
     * otherwise object itself
     * @return reference or object itself
     */
    public final Metadata get() {
        return value;
    }

    private static class NamedMetadataRef extends Metadata {
        private final String name;

        NamedMetadataRef(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "!" + name;
        }
    };


    /** just a wrapper that allows this class to be considered as metadata */
    private class MetadataWrap extends Metadata {
        @Override
        public String toString() {
            return DIBaseItem.this.toString();
        }
    }

    protected IntegerConstant v(int i) {
        return new IntegerConstant(i);
    }

    protected MetadataString v(String s) {
        return new MetadataString(s);
    }

    protected BooleanConstant v(boolean b) {
        return b ? BooleanConstant.TRUE : BooleanConstant.FALSE;
    }
}
