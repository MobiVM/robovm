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
public class ConstantGetelementptr extends Constant {
    private final Constant cst;
    private final int[] idx;

    public ConstantGetelementptr(Constant cst, int ... idx) {
        if (!cst.isPointer()) {
            throw new IllegalArgumentException("PointerType expected");
        }
        if (!(((PointerType) cst.getType()).getBase() instanceof AggregateType)) {
            throw new IllegalArgumentException("PointerType should point to AggregateType");
        }
        if (idx == null || idx.length == 0) {
            throw new IllegalArgumentException("No indexes");
        }
        this.cst = cst;
        this.idx = idx;
    }
    
    @Override
    public Type getType() {
        Type t = (AggregateType) ((PointerType) cst.getType()).getBase();
        for (int i = 1; i < idx.length; i++) {
            t = ((AggregateType) t).getTypeAt(idx[i]);
        }
        return new PointerType(t);
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write("getelementptr (");
        cst.getType().write(writer);
        writer.write(' ');
        cst.write(writer);
        for (int j : idx) {
            writer.write(", i32 ");
            writer.write(Integer.toString(j));
        }
        writer.write(')');
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
