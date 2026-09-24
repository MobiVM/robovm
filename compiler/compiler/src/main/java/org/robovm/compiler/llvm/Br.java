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
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @version $Id$
 */
public class Br extends Instruction {
    private final Value cond;
    private final BasicBlockRef destTrue;
    private final BasicBlockRef destFalse;

    public Br(BasicBlockRef dest) {
        this.cond = null;
        this.destTrue = dest;
        this.destFalse = null;
    }
    
    public Br(Value cond, BasicBlockRef destTrue, BasicBlockRef destFalse) {
        if (cond.getType() != Type.I1) {
            throw new IllegalArgumentException("Condition must have type " + Type.I1);
        }
        this.cond = cond;
        this.destTrue = destTrue;
        this.destFalse = destFalse;
    }
    
    @Override
    public Set<VariableRef> getReadsFrom() {
        if (cond instanceof VariableRef) {
            return Collections.singleton((VariableRef) cond);
        }
        return super.getReadsFrom();
    }
    
    @Override
    public Set<BasicBlockRef> getBranchTargets() {
        Set<BasicBlockRef> result = new HashSet<>();
        result.add(destTrue);
        if (cond != null) {
            result.add(destFalse);
        }
        return result;
    }

    @Override
    public void write(Writer writer) throws IOException {
        if (cond != null) {
            writer.write("br i1 ");
            cond.write(writer);
            writer.append(", label %").append(destTrue.getName()).append(", label %").append(destFalse.getName());
        } else {
            writer.append("br label %").append(destTrue.getName());
        }
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
