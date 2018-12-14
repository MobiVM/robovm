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

import java.util.Arrays;


/**
 *
 * @version $Id$
 */
public class StructureType extends AggregateType {
    private final Type[] types;
    private final int ownMembersOffset; // 1 if inherit another struct, zero otherwise
    private final boolean isVector;

    public StructureType(int ownMembersOffset, Type ... types) {
        this.types = types.clone();
        this.ownMembersOffset = ownMembersOffset;
        isVector = false;
    }

    public StructureType(int ownMembersOffset, boolean vector, Type ... types) {
        this.types = types.clone();
        this.ownMembersOffset = ownMembersOffset;
        isVector = vector;
    }

    public StructureType(Type ... types) {
        this.types = types.clone();
        ownMembersOffset = 0;
        isVector = false;
    }
    
    public StructureType(String alias, Type ... types) {
        super(alias);
        this.types = types.clone();
        ownMembersOffset = 0;
        isVector = false;
    }

    @Override
    public Type getTypeAt(int index) {
        return types[index];
    }

    public Type[] getTypes() {
        return types;
    }

    @Override
    public int getTypeCount() {
        return types.length;
    }

    public int getOwnMembersOffset() {
        return ownMembersOffset;
    }

    public boolean isVector() {
        return isVector;
    }

    /**
     * @return true if vector consists of another vector structs (not primitives)\
     * and will be translated into stuct of array of primitive vector
     * example is MatrixFloat2x2
     */
    public boolean isVectorArray() {
        return isVector && types[0] instanceof StructureType;
    }

    @Override
    public String getDefinition() {
        if (isVector && types.length > 0) {
            if (types[0] instanceof StructureType) {
                // return as struct that contains array
                StructureType st = (StructureType) types[0];
                return "{ [" + types.length + " x " + st.getDefinition() + "] }";
            } else {
                return "<" + types.length + " x " + types[0].toString() + ">";
            }
        } else {
            StringBuilder sb = new StringBuilder("{");
            for (int i = 0; i < types.length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(types[i].toString());
            }
            sb.append("}");
            return sb.toString();
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Arrays.hashCode(types);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        StructureType other = (StructureType) obj;
        if (!Arrays.equals(types, other.types) || isVector != other.isVector) {
            return false;
        }
        return true;
    }
}
