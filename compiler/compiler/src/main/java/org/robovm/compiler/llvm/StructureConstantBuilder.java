/*
 * Copyright (C) 2012 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.llvm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @version $Id$
 */
public class StructureConstantBuilder {
    private final List<Value> values = new ArrayList<>();

    public StructureConstantBuilder add(Value v) {
        values.add(v);
        return this;
    }

    public StructureConstant build() {
        return build(null);
    }

    /**
     * @param typeAlias if specified structure will be created with type alias
     */
    public StructureConstant build(String typeAlias) {
        Type[] types = new Type[values.size()];
        int i = 0;
        for (Value v : values) {
            types[i++] = v.getType();
        }

        if (typeAlias != null) {
            return new StructureConstant(new StructureType(typeAlias, types), values.toArray(new Value[0]));
        } else {
            return new StructureConstant(new StructureType(types), values.toArray(new Value[0]));
        }
    }
    
}
