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
import java.util.Collections;
import java.util.Set;

/**
 *
 * @version $Id$
 */
public class Getelementptr extends Instruction {
    private final Variable result;
    private final Value ptr;
    private final Value[] idx;

    public Getelementptr(Variable result, Value ptr, int ... idx) {
        if (!ptr.isPointer()) {
            throw new IllegalArgumentException("PointerType expected");
        }
        if (idx.length > 1 && !(((PointerType) ptr.getType()).getBase() instanceof AggregateType)) {
            throw new IllegalArgumentException("PointerType should point to AggregateType");
        }
        if (idx == null || idx.length == 0) {
            throw new IllegalArgumentException("No indexes");
        }
        this.result = result;
        this.ptr = ptr;
        this.idx = new Value[idx.length];
        for (int i = 0; i < idx.length; i++) {
            this.idx[i] = new IntegerConstant(idx[i]);
        }
    }

    public Getelementptr(Variable result, Value ptr, Value ... idx) {
        if (!ptr.isPointer()) {
            throw new IllegalArgumentException("PointerType expected");
        }
        if (idx.length > 1 && !(((PointerType) ptr.getType()).getBase() instanceof AggregateType)) {
            throw new IllegalArgumentException("PointerType should point to AggregateType");
        }
        if (idx == null || idx.length == 0) {
            throw new IllegalArgumentException("No indexes");
        }
        this.result = result;
        this.ptr = ptr;
        this.idx = idx;
    }
    
    @Override
    public Set<Variable> getWritesTo() {
        return Collections.singleton(result);
    }
    
    @Override
    public Set<VariableRef> getReadsFrom() {
        if (ptr instanceof VariableRef) {
            return Collections.singleton((VariableRef) ptr);
        }
        return super.getReadsFrom();
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write(result.toString());
        writer.write(" = getelementptr ");
        ptr.getType().write(writer);
        writer.write(' ');
        ptr.write(writer);
        for (Value value : idx) {
            writer.write(", ");
            value.getType().write(writer);
            writer.write(" ");
            value.write(writer);
        }
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
