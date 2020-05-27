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
package org.robovm.compiler.util.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * {@link InputStream} which wraps another {@link InputStream} and forwards
 * all calls to it except {@link InputStream#close()}.
 */
public class NeverCloseInputStream extends InputStream {
    private final InputStream in;

    public NeverCloseInputStream(InputStream out) {
        this.in = out;
    }

    @Override
    public int read() throws IOException {
        return in.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return in.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return in.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return in.skip(n);
    }
    
    @Override
    public int available() throws IOException {
        return in.available();
    }

    @Override
    public synchronized void mark(int readLimit) {
        in.mark(readLimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        in.reset();
    }

    @Override
    public boolean markSupported() {
        return in.markSupported();
    }

    @Override
    public void close() {
    }

    @Override
    public int hashCode() {
        return in.hashCode();
    }

    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    @Override
    public boolean equals(Object obj) {
        return in.equals(obj);
    }

    @Override
    public String toString() {
        return in.toString();
    }

}
