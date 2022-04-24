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
public abstract class FloatingPointBinaryInstruction extends BinaryOpInstruction {
    private final String name;

    protected FloatingPointBinaryInstruction(String name, Variable result, Value op1, Value op2) {
        super(result, op1, op2);
        if (!result.isFloatingPoint() || !op1.isFloatingPoint() || !op2.isFloatingPoint()) {
            throw new IllegalArgumentException("Floating point type expected");
        }
        if (!result.getType().equals(op1.getType()) || !op1.getType().equals(op2.getType())) {
            throw new IllegalArgumentException("Type mismatch ");
        }
        this.name = name;
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.append(result.toString()).append(" = ").append(name).append(' ');
        op1.getType().write(writer);
        writer.write(' ');
        op1.write(writer);
        writer.write(", ");
        op2.write(writer);
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
