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
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataNodeBuilder;

public class DISubprogram extends DIBaseItem {

    private String signature;
    private int defLineNo;
    private int scopeLineNo;
    private int flags;
    private boolean isStatic;
    private DIBaseItem file;
    private DIBaseItem fileContext;
    private DICompositeType subrotineType;
    private FunctionRef llvmFunction;
    private DIMutableItemList<DILocalVariable> variables;

    public DISubprogram(ModuleBuilder builder) {
        super(builder);
    }

    private MetadataNode build() {
        MetadataNodeBuilder builder = new MetadataNodeBuilder();
        // Building following structure
        //!2 = metadata !{
        //    DIHeader(
        builder.add(
                (new DIHeader())
                        //i32,      ;; Tag = 46 (DW_TAG_subprogram)
                        .add(DwarfConst.Tag.TAG_subprogram)
                        //mdstring, ;; Name
                        .add(signature)
                        //mdstring, ;; Display name (fully qualified C++ name)
                        .add(signature)
                        //mdstring, ;; MIPS linkage name (for C++)
                        .add("")
                        //i32,      ;; Line number where defined
                        .add(defLineNo)
                        //i1,       ;; True if the global is local to compile unit (static)
                        .add(isStatic)
                        //i1,       ;; True if the global is defined in the compile unit (not extern)
                        .add(true)
                        //i32,      ;; Virtuality, e.g. dwarf::DW_VIRTUALITY__virtual
                        .add(0)
                        //i32,      ;; Index into a virtual function
                        .add(0)
                        //i32,      ;; Flags - Artificial, Private, Protected, Explicit, Prototyped.
                        .add(flags)
                        //i1,       ;; isOptimized
                        .add(false)
                        //i32       ;; Line number where the scope of the subprogram begins
                        .add(scopeLineNo)
                //),
        );
        //metadata, ;; Source directory (including trailing slash) & file pair
        builder.add(file.get());
        //metadata, ;; Reference to context descriptor
        builder.add(fileContext.get());
        //metadata, ;; Reference to type descriptor
        builder.add(subrotineType.get());
        //metadata, ;; indicates which base type contains the vtable pointer for the derived class
        builder.add(null);
        //{}*,      ;; Reference to the LLVM function
        builder.add(llvmFunction);
        //metadata, ;; Lists function template parameters
        builder.add(null);
        //metadata, ;; Function declaration descriptor
        builder.add(null);
        //metadata  ;; List of function variables
        builder.add(variables != null ? variables.get() : null);
        // }

        return builder.build();
    }

    @Override
    public String toString() {
        return build().toString();
    }

    public DISubprogram setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    public DISubprogram setDefLineNo(int defLineNo) {
        this.defLineNo = defLineNo;
        return this;
    }

    public DISubprogram setScopeLineNo(int scopeLineNo) {
        this.scopeLineNo = scopeLineNo;
        return this;
    }

    public DISubprogram setFlags(int flags) {
        this.flags = flags;
        return this;
    }

    public DISubprogram setStatic(boolean aStatic) {
        isStatic = aStatic;
        return this;
    }

    public DISubprogram setFile(DIBaseItem file) {
        this.file = file;
        return this;
    }

    public DISubprogram setFileContext(DIBaseItem fileContext) {
        this.fileContext = fileContext;
        return this;
    }

    public DISubprogram setSubrotineType(DICompositeType subrotineType) {
        this.subrotineType = subrotineType;
        return this;
    }

    public void setLlvmFunction(FunctionRef llvmFunction) {
        this.llvmFunction = llvmFunction;
    }

    public void setVariables(DIMutableItemList<DILocalVariable> variables) {
        this.variables = variables;
    }
}
