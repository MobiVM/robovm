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
public class Alloca extends Instruction {
    private final Variable result;
    private final Type type;

    public Alloca(Variable result, Type type) {
        this.result = result;
        this.type = type;
    }

    @Override
    public Set<Variable> getWritesTo() {
        return Collections.singleton(result);
    }

    public Variable getResult() {
        return result;
    }

    public Type getType() {
        return type;
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.append(result.toString()).append(" = alloca ");
        type.write(writer);
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
