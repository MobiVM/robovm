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

public class DILocalVariable extends DIBaseItem {

    private final String name;
    private final int defLineNo;
    private final int argNo;
    private final DIBaseItem file;
    private final DIBaseItem context;
    private final DIBaseItem type;


    /**
     * Creates Argument type local variable
     * @param builder to attach metadata to root of
     * @param name of variable
     * @param defLineNo line it is defined
     * @param argNo argument index
     * @param file it was defined
     * @param context (scope) it was defined in
     * @param type referent to type metadata of var
     */
    public DILocalVariable(ModuleBuilder builder, String name, int defLineNo, int argNo, DIBaseItem file,
                           DIBaseItem context, DIBaseItem type) {
        super(builder);
        this.name = name;
        this.defLineNo = defLineNo;
        this.argNo = argNo;
        this.file = file;
        this.context = context;
        this.type = type;
    }


    /**
     * Constructor for auto variable (without argument no parameter_
     */
    public DILocalVariable(ModuleBuilder builder, String name, int defLineNo, DIBaseItem file,
                           DIBaseItem context, DIBaseItem type) {
        super(builder);
        this.name = name;
        this.defLineNo = defLineNo;
        this.argNo = 0;
        this.file = file;
        this.context = context;
        this.type = type;
    }

    public String name() {
        return name;
    }

    public int defLineNo() {
        return defLineNo;
    }

    public int argNo() {
        return argNo;
    }

    public DIBaseItem file() {
        return file;
    }

    public DIBaseItem context() {
        return context;
    }

    public DIBaseItem type() {
        return type;
    }

    private MetadataNode build() {
        MetadataNodeBuilder builder = new MetadataNodeBuilder();
        // Building following structure
        //!2 = metadata !{
        //    DIHeader(
        builder.add(
                (new DIHeader())
                        //i32,      ;; Tag = 46 (DW_TAG_subprogram)
                        .add(argNo <= 0 ? DwarfConst.LLVMConstants.TAG_auto_variable : DwarfConst.LLVMConstants.TAG_arg_variable)
                        //mdstring, ;; Name
                        .add(name)
                        //i32, ;; line number and argument (8 bit arg + 24 line number)
                        .add((argNo << 24) + defLineNo)
                        //i32,      ;; Flags - not used
                        .add(0)
                //),
        );
        //metadata, ;; Reference to context descriptor
        builder.add(context.get());
        //metadata, ;; Source directory (including trailing slash) & file pair
        builder.add(file.get());
        //metadata, ;; Reference to type descriptor
        builder.add(type.get());

        return builder.build();
    }

    @Override
    public String toString() {
        return build().toString();
    }
}
