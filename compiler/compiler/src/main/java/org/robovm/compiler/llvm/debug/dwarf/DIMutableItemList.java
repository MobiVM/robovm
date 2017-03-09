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
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.Value;

import java.util.ArrayList;
import java.util.List;

/** Mutable item list, Similar to Metadata node but allows adding items */
public class DIMutableItemList<T extends DIBaseItem> extends DIBaseItem {
    private List<T> items = new ArrayList<>();

    public DIMutableItemList(ModuleBuilder builder) {
        super(builder);
    }

    public T add(T o) {
        items.add(o);
        return o;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("!{");
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Value v = items.get(i).get();
            if (v == null) {
                sb.append("null");
            } else {
                if (v.getType() != Type.METADATA) {
                    sb.append(v.getType());
                    sb.append(' ');
                }
                sb.append(v);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
