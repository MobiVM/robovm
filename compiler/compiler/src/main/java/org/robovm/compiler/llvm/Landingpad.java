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
 * @author niklas
 *
 */
public class Landingpad extends Instruction {
    private final Variable result;
    private final Constant personalityFn;
    private final boolean cleanup;
    private final Clause[] clauses;
    
    public Landingpad(Variable result, Constant personalityFn, Clause ... clauses) {
        this(result, personalityFn, false, clauses);
    }
    
    public Landingpad(Variable result, Constant personalityFn,
            boolean cleanup, Clause ... clauses) {
        
        this.result = result;
        this.personalityFn = personalityFn;
        this.cleanup = cleanup;
        this.clauses = new Clause[clauses.length];
        System.arraycopy(clauses, 0, this.clauses, 0, clauses.length);
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write(result.toString());
        writer.write(" = landingpad ");
        result.getType().write(writer);
        writer.write(" personality ");
        personalityFn.getType().write(writer);
        writer.write(' ');
        personalityFn.write(writer);
        if (cleanup) {
            writer.write(" cleanup");
        }
        for (Clause clause : clauses) {
            writer.write(' ');
            clause.write(writer);
        }
    }

    @Override
    public String toString() {
        return toString(this::write);
    }

    public interface Clause extends Writable {}
    
    public static class Catch implements Clause {
        private final Value value;
        public Catch(Value value) {
            this.value = value;
        }

        @Override
        public void write(Writer writer) throws IOException {
            writer.write("catch ");
            value.getType().write(writer);
            writer.write(' ');
            value.write(writer);
        }

        @Override
        public String toString() {
            return toString(this::write);
        }
    }
    
    public static class Filter implements Clause {
        private final ArrayConstant value;
        public Filter(ArrayConstant value) {
            this.value = value;
        }

        @Override
        public void write(Writer writer) throws IOException {
            writer.write("filter ");
            value.getType().write(writer);
            writer.write(' ');
            value.write(writer);
        }

        @Override
        public String toString() {
            return toString(this::write);
        }
    }
}
