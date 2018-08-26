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
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataNodeBuilder;

public class DIDerivedType extends DIBaseItem {

    private final int typeTag;
    private final String name;
    private final int defLineNo;
    private final long sizeBits;
    private final long alignmentBits;
    private final DIBaseItem file;
    private final DIBaseItem context;

    /**
     * Creates metadata to be added to root with unnamed reference
     *
     * @param builder to attach metadata to root of
     */
    public DIDerivedType(ModuleBuilder builder, int typeTag, String name, int defLineNo, long sizeBits, long alignmentBits, DIBaseItem file, DIBaseItem context) {
        super(builder);
        this.typeTag = typeTag;
        this.name = name;
        this.defLineNo = defLineNo;
        this.sizeBits = sizeBits;
        this.alignmentBits = alignmentBits;
        this.file = file;
        this.context = context;
    }

    public String name() {
        return name;
    }

    public int defLineNo() {
        return defLineNo;
    }

    public long sizeBits() {
        return sizeBits;
    }

    public long alignmentBits() {
        return alignmentBits;
    }

    public DIBaseItem file() {
        return file;
    }

    public DIBaseItem getContext() {
        return context;
    }

    private MetadataNode build() {
        MetadataNodeBuilder builder = new MetadataNodeBuilder();
        // Building following structure
        //!2 = metadata !{
        //    DIHeader(
        builder.add(
                (new DIHeader())
                        // i32,
                        .add(typeTag)
                        //mdstring, ;; Name
                        .add(name)
                        //i32, ;; Line number where defined (may be 0)
                        .add(defLineNo)
                        //i64, ;; Size in bits
                        .add(sizeBits)
                        //i64, ;; Alignment in bits
                        .add(alignmentBits)
                        //i64, ;; Offset in bits
                        .add(0L)
                        //i32, ;; Flags
                        .add(0)
                //),
        );
        //metadata, ;; Source directory (including trailing slash) & file pair
        builder.add(file.get());
        //metadata, ;; Reference to context descriptor
        builder.add(context != null ? context.get() : null);
        //metadata, ;; ;; Reference to type derived from
        builder.add(null);
        //metadata, ;; (optional) Objective C property node
        builder.add(null);

        return builder.build();
    }

    @Override
    public String toString() {
        return build().toString();
    }
}
