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
package org.robovm.llvm;

/**
 * 
 */
public class LineInfo {
    private final long address;
    private final int lineNumber;
    private final int columnNumber;

    LineInfo(long address, int lineNumber, int columnNumber) {
        this.address = address;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    public long getAddress() {
        return address;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    @Override
    public String toString() {
        return String.format("LineInfo [address=%s, lineNumber=%s, columnNumber=%s]", address, lineNumber, columnNumber);
    }
}
