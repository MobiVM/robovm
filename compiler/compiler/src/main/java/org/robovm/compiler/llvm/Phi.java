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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @version $Id$
 */
public class Phi extends Instruction {
    private final Variable result;
    private final VariableRef[] vars;

    public Phi(Variable result, VariableRef ... vars) {
        if (vars.length < 2) {
            throw new IllegalArgumentException("At least two variables expected");
        }
        Type t = result.getType();
        for (int i = 0; i < vars.length; i++) {
            if (!vars[i].getType().equals(t)) {
                throw new IllegalArgumentException("Type mismatch in variable " + vars[i]);
            }
        }
        this.result = result;
        this.vars = vars;
    }
    
    @Override
    public Set<Variable> getWritesTo() {
        return Collections.singleton(result);
    }
    
    @Override
    public Set<VariableRef> getReadsFrom() {
        return new HashSet<VariableRef>(Arrays.asList(vars));
    }
    
    @Override
    public void write(Writer writer) throws IOException {
        writer.write(result.toString());
        writer.write(" = phi ");
        result.getType().write(writer);
        for (int i = 0; i < vars.length; i++) {
            if (i > 0) {
                writer.write(", ");
            }
            writer.write("[ ");
            writer.write(vars[i].toString());
            writer.write(", ");
            BasicBlock bb = basicBlock.getFunction().getDefinedIn(vars[i]);
            writer.write('%');
            writer.write(bb.getName());
            writer.write(" ]");
        }
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
