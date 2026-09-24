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

/**
 *
 * @version $Id$
 */
public class VectorStructureType extends StructureType {

    public VectorStructureType(int ownMembersOffset, Type ... types) {
        super(ownMembersOffset, 0, types);
    }

    public VectorStructureType(Type ... types) {
        super(types);
    }

    public VectorStructureType(String alias, Type ... types) {
        super(alias, types);
    }

    /**
     * @return true if vector consists of another vector structs (not primitives)\
     * and will be translated into struct of array of primitive vector
     * example is MatrixFloat2x2
     */
    public boolean isVectorArray() {
        return types[0] instanceof StructureType;
    }


    @Override
    public void writeDefinition(Writer writer) throws IOException {
        if (types[0] instanceof StructureType) {
            // return as struct that contains array
            StructureType st = (StructureType) types[0];
            writer.write("{ [");
            writer.write(Integer.toString(types.length));
            writer.write(" x ");
            st.writeDefinition(writer);
            writer.write("] }");
        } else {
            writer.write("<");
            writer.write(Integer.toString(types.length));
            writer.write(" x ");
            types[0].write(writer);
            writer.write(">");
        }
    }

    @Override
    public String getDefinition() {
        return toString(this::writeDefinition);
    }
}
