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
public abstract class FunctionCallInstruction extends Instruction {
    private final String name;
    private final Variable result;
    private final Value function;
    private final Argument[] args;
    
    protected FunctionCallInstruction(String name, Value function, Value ... args) {
        this(name, null, function, args);
    }
    
    protected FunctionCallInstruction(String name, Value function, Argument ... args) {
        this(name, null, function, args);
    }
    
    protected FunctionCallInstruction(String name, Variable result, Value function, Value ... args) {
        this(name, result, function, valuesToArgs(args));
    }
    
    protected FunctionCallInstruction(String name, Variable result, Value function, Argument ... args) {
        if (!function.isFunction()) {
            throw new IllegalArgumentException("Function type expected");
        }
        this.name = name;
        this.result = result;
        this.function = function;
        this.args = args;
    }
    
    private static Argument[] valuesToArgs(Value[] values) {
        Argument[] arguments = new Argument[values.length];
        for (int i = 0; i < values.length; i++) {
            arguments[i] = new Argument(values[i]);
        }
        return arguments;
    }
    
    @Override
    public Set<Variable> getWritesTo() {
        if (result != null) {
            return Collections.singleton(result);
        }
        return super.getWritesTo();
    }

    @Override
    public Set<VariableRef> getReadsFrom() {
        Set<VariableRef> s = new HashSet<VariableRef>();
        for (Argument a : args) {
            if (a.getValue() instanceof VariableRef) {
                s.add((VariableRef) a.getValue());
            }
        }
        return s;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(args);
        result = prime * result
                + ((function == null) ? 0 : function.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result
                + ((this.result == null) ? 0 : this.result.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FunctionCallInstruction other = (FunctionCallInstruction) obj;
        if (!Arrays.equals(args, other.args)) {
            return false;
        }
        if (function == null) {
            if (other.function != null) {
                return false;
            }
        } else if (!function.equals(other.function)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (result == null) {
            if (other.result != null) {
                return false;
            }
        } else if (!result.equals(other.result)) {
            return false;
        }
        return true;
    }

    @Override
    public void write(Writer writer) throws IOException {
        if (result != null) {
            writer.write(result.toString());
            writer.write(" = ");
        }
        writer.write(name);
        writer.write(' ');
        FunctionType ftype = (FunctionType) function.getType();
        if (ftype.isVarargs())
            ftype.writeDefinition(writer);
        else
            ftype.getReturnType().write(writer);
        writer.write(' ');
        function.write(writer);
        writer.write('(');
        for (int i = 0; i < args.length; i++) {
            if (i > 0) {
                writer.write(", ");
            }
            args[i].getType().write(writer);
            writer.write(' ');
            args[i].write(writer);
        }
        writer.write(')');
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
