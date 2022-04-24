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
public abstract class UserType extends Type implements Writable{
    protected final String alias;
    
    UserType() {
        alias = null;
    }
    
    UserType(String alias) {
        this.alias = "%" + alias;
    }
    
    public String getAlias() {
        return alias;
    }
    
    public boolean hasAlias() {
        return alias != null;
    }
    
    public abstract String getDefinition();

    public abstract void writeDefinition(Writer writer) throws IOException;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alias == null) ? 0 : alias.hashCode());
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
        UserType other = (UserType) obj;
        if (alias == null) {
            if (other.alias != null) {
                return false;
            }
        } else if (!alias.equals(other.alias)) {
            return false;
        }
        return true;
    }

    @Override
    public void write(Writer writer) throws IOException {
        if (alias != null) writer.write(alias); else writeDefinition(writer);
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
