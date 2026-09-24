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
package org.robovm.compiler.llvm.debug.dwarf;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.BooleanConstant;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.NamedMetadata;
import org.robovm.compiler.llvm.UnnamedMetadata;

import java.io.IOException;
import java.io.Writer;

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
        this(builder, name, (Metadata[])null);
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

        @Override
        public void write(Writer writer) throws IOException {
            writer.write(toString());
        }
    }


    /** just a wrapper that allows this class to be considered as metadata */
    private class MetadataWrap extends Metadata {
        @Override
        public String toString() {
            return DIBaseItem.this.toString();
        }

        @Override
        public void write(Writer writer) throws IOException {
            writer.write(toString());
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
