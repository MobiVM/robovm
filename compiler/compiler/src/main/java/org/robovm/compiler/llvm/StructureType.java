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
import java.util.Arrays;


/**
 *
 * @version $Id$
 */
public class StructureType extends AggregateType {
    protected final Type[] types;
    private final int ownMembersOffset; // 1 if inherit another struct, zero otherwise

    // attributes, to help runtime solving stret case
    private final int attributes; // bitmask
    public final static int ATTR_UNALIGNED             = 1 << 0; // contains at least one field that is not aligned to its nature alignment
    public final static int ATTR_NOT_SINGLE_INT_STRUCT = 1 << 1; // indicates that structure is not one integer field wrap (up to 32 bit one)

    public StructureType(int ownMembersOffset, int flags, Type ... types) {
        this.types = types.clone();
        this.ownMembersOffset = ownMembersOffset;
        this.attributes = flags;
    }

    public StructureType(int ownMembersOffset, int flags, String alias, Type ... types) {
        super(alias);
        this.types = types.clone();
        this.ownMembersOffset = ownMembersOffset;
        this.attributes = flags;
    }

    public StructureType(Type ... types) {
        this(0, 0, types);
    }
    
    public StructureType(String alias, Type ... types) {
        this(0, 0, alias, types);
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

    @Override
    public void writeDefinition(Writer writer) throws IOException {
        writer.write('{');
        for (int i = 0; i < types.length; i++) {
            if (i > 0)
                writer.write(", ");
            types[i].write(writer);
        }
        writer.write('}');
    }

    @Override
    public String getDefinition() {
        return toString(this::writeDefinition);
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
        if (!Arrays.equals(types, other.types)) {
            return false;
        }
        return true;
    }

    public int getAttributes() {
        return attributes;
    }
}
