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

import java.io.IOException;
import java.io.Writer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @version $Id$
 */
public class StructureConstant extends Constant {
    private final StructureType type;
    private final Value[] values;

    public StructureConstant(StructureType type, Value ... values) {
        this.type = type;
        this.values = values;
    }
    
    @Override
    public StructureType getType() {
        return type;
    }



    // flatten all contained structs in way removing struct and inserting struct members
    private static void flattenInto(List<Value> dest, StructureConstant struct) {
        for (Value v: struct.values) {
            if (v instanceof StructureConstant)
                flattenInto(dest, (StructureConstant)v);
            else
                dest.add(v);
        }
    }

    public StructureConstant flatten() {
        List<Value> flattenValues = new ArrayList<>();
        flattenInto(flattenValues, this);

        Type[] types = new Type[flattenValues.size()];
        int i = 0;
        for (Value v : flattenValues) {
            types[i++] = v.getType();
        }

        return new StructureConstant(new StructureType(types), flattenValues.toArray(new Value[0]));
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write('{');
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                writer.write(", ");
            }
            values[i].getType().write(writer);
            writer.write(' ');
            values[i].write(writer);
        }
        writer.write('}');
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
