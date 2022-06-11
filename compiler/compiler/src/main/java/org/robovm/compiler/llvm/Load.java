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
public class Load extends UnaryOpInstruction {
    private final boolean _volatile;
    private final Ordering ordering;
    private final int alignment;

    public Load(Variable result, Value op) {
        this(result, op, false, null, -1);
    }
    
    public Load(Variable result, Value op, boolean _volatile) {
        this(result, op, _volatile, null, -1);
    }

    public Load(Variable result, Value op, boolean _volatile, Ordering ordering, int alignment) {
        super(result, op);
        this._volatile = _volatile;
        this.ordering = ordering;
        this.alignment = alignment;
    }
    
    @Override
    public void write(Writer writer) throws IOException {
        writer.write(result.toString());
        writer.write(" = load ");
        if (_volatile) {
            writer.write("volatile ");
        }
        if (ordering != null) {
            writer.write("atomic ");
        }
        op.getType().write(writer);
        writer.write(" ");
        op.write(writer);
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
