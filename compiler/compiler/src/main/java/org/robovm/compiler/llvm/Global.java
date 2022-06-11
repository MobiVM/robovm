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
public class Global implements Writable {
    private final String name;
    private final Linkage linkage;
    private final Constant value;
    private final Type type;
    private final boolean constant;
    private final String section;

    public Global(String name, Type type) {
        this(name, Linkage.external, type, false);
    }
    
    public Global(String name, Type type, boolean constant) {
        this(name, Linkage.external, type, constant);
    }
    
    public Global(String name, Linkage linkage, Type type, boolean constant) {
        this.name = name;
        this.linkage = linkage;
        this.value = null;
        this.type = type;
        this.constant = constant;
        this.section = null;
    }
    
    public Global(String name, Constant value) {
        this(name, null, value, false, null);
    }
    
    public Global(String name, Constant value, boolean constant) {
        this(name, null, value, constant, null);
    }
    
    public Global(String name, Linkage linkage, Constant value) {
        this(name, linkage, value, false, null);
    }
    
    public Global(String name, Linkage linkage, Constant value, boolean constant) {
        this(name, linkage, value, constant, null);        
    }
    
    public Global(String name, Constant value, boolean constant, String section) {
        this(name, null, value, constant, section);        
    }
    
    public Global(String name, Linkage linkage, Constant value, boolean constant, String section) {
        this.name = name;
        this.linkage = linkage;
        this.value = value;
        this.type = value.getType();
        this.constant = constant;
        this.section = section;
    }
    
    public GlobalRef ref() {
        return new GlobalRef(this);
    }
    
    public String getName() {
        return name;
    }
    
    public PointerType getType() {
        return new PointerType(type);
    }

    public void writeDefinition(Writer writer) throws IOException {
        writer.write("@\"");
        writer.write(name);
        writer.write("\" = ");
        if (linkage != null) {
            writer.write(linkage.toString());
            writer.write(' ');
        }
        if (constant) {
            writer.write("constant ");
        } else {
            writer.write("global ");
        }
        type.write(writer);
        if (value != null) {
            writer.write(' ');
            value.write(writer);
        }
        if (section != null) {
            writer.write(", section \"");
            writer.write(section);
            writer.write('"');
        }
    }

    public String getDefinition() {
        return toString(this::writeDefinition);
    }

    @Override
    public void write(Writer writer) throws IOException {
        throw new IllegalStateException("writeDefinition to be called!");
    }

    @Override
    public String toString() {
        return "@\"" + name + "\"";
    }
}
