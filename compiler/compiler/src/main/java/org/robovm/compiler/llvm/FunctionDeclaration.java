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
public class FunctionDeclaration implements Writable{
    private final String name;
    private final FunctionType type;

    public FunctionDeclaration(String name, FunctionType type) {
        this.name = name;
        this.type = type;
    }

    public FunctionDeclaration(FunctionRef ref) {
        this(ref.getName(), ref.getType());
    }
    
    public String getName() {
        return name;
    }

    public FunctionType getType() {
        return type;
    }
    
    public FunctionRef ref() {
        return new FunctionRef(name, type);
    }

    @Override
    public void write(Writer writer) throws IOException {
        Type returnType = type.getReturnType();
        Type[] parameterTypes = type.getParameterTypes();
        writer.write("declare ");
        returnType.write(writer);
        writer.write(" @\"");
        writer.write(name);
        writer.write("\"(");
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                writer.write(", ");
            }
            parameterTypes[i].write(writer);
        }
        if (type.isVarargs()) {
            writer.write(", ...");
        }
        writer.write(')');
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
