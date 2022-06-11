/*
 * Copyright (C) 2014 RoboVM AB
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
import java.util.List;

/**
 *
 * @version $Id$
 */
public class MetadataNode extends Metadata {
    private final Value[] values;

    public MetadataNode(Value ... values) {
        this.values = values;
    }

    public MetadataNode(List<? extends Value> values) {
        this.values = values.toArray(new Value[values.size()]);
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write("!{");
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                writer.write(", ");
            }
            if (values[i] == null) {
                writer.write("null");
            } else {
                if (values[i].getType() != Type.METADATA) {
                    values[i].getType().write(writer);
                    writer.write(' ');
                }
                values[i].write(writer);
            }
        }
        writer.write('}');
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
