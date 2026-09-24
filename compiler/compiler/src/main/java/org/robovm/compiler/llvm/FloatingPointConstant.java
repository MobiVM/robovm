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
public class FloatingPointConstant extends Constant {
    private final FloatingPointType type;
    private final Object value;

    public FloatingPointConstant(float value) {
        this(value, Type.FLOAT);
    }
    
    public FloatingPointConstant(double value) {
        this(value, Type.DOUBLE);
    }
    
    public FloatingPointConstant(double value, FloatingPointType type) {
        this.value = value;
        this.type = type;
    }
    
    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
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
        FloatingPointConstant other = (FloatingPointConstant) obj;
        if (type == null) {
            if (other.type != null) {
                return false;
            }
        } else if (!type.equals(other.type)) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (type == Type.FLOAT) {
            float f = ((Number) value).floatValue();
            return "bitcast (i32 " + Float.floatToIntBits(f) + " to float)";
        } else {
            double d = ((Number) value).doubleValue();
            return "bitcast (i64 " + Double.doubleToLongBits(d) + " to double)";
        }
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write(toString());
    }
}
