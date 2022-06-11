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
import java.util.HashSet;
import java.util.Set;



/**
 *
 * @version $Id$
 */
public class Store extends Instruction {
    private final Value value;
    private final Value pointer;
    private final boolean _volatile;
    private final Ordering ordering;
    private final int alignment;

    public Store(Value value, Value pointer) {
        this(value, pointer, false, null, -1);
    }

    public Store(Value value, Value pointer, boolean _volatile) {
        this(value, pointer, _volatile, null, -1);
    }
    
    public Store(Value value, Value pointer, boolean _volatile, Ordering ordering, int alignment) {
        this.value = value;
        this.pointer = pointer;
        this._volatile = _volatile;
        this.ordering = ordering;
        this.alignment = alignment;
    }
    
    public Value getValue() {
        return value;
    }
    
    public Value getPointer() {
        return pointer;
    }
    
    @Override
    public Set<VariableRef> getReadsFrom() {
        Set<VariableRef> result = new HashSet<VariableRef>();
        if (value instanceof VariableRef) {
            result.add((VariableRef) value);
        }
        if (pointer instanceof VariableRef) {
            result.add((VariableRef) pointer);
        }
        return result;
    }
    
    @Override
    public void write(Writer writer) throws IOException {
        writer.write("store ");
        if (_volatile) {
            writer.write("volatile ");
        }
        if (ordering != null) {
            writer.write("atomic ");
        }
        value.getType().write(writer);
        writer.write(" ");
        value.write(writer);
        writer.write(", ");
        pointer.getType().write(writer);
        writer.write(" ");
        pointer.write(writer);
        if (ordering != null) {
            writer.write(" ");
            writer.write(ordering.toString());
        }
        if (alignment > 0) {
            writer.write(", align ");
            writer.write(Integer.toString(alignment));
        }
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
