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
