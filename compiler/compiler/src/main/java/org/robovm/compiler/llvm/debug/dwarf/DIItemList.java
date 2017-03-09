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
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.Value;

import java.util.List;

/** list several nodes in one item. backends to MetadataNode */
public class DIItemList extends DIBaseItem {
    public DIItemList(Value... values) {
        super(new MetadataNode(values));
    }

    public DIItemList(List<? extends Value> values) {
        super(new MetadataNode(values));
    }

    public DIItemList(ModuleBuilder builder, Value ... values) {
        super(builder, new MetadataNode(values));
    }

    public DIItemList(ModuleBuilder builder, List<? extends Value> values) {
        super(builder, new MetadataNode(values));
    }

    public DIItemList(ModuleBuilder builder, String name, Metadata... values) {
        super(builder, name, values);
    }
}
