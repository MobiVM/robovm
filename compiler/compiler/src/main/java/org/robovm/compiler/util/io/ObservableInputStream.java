/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.compiler.util.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author dkimitsa
 * input stream that can be observed (monitored)
 */
public class ObservableInputStream extends FilterInputStream {
    public interface Observer {
        void observeRead(byte[] b, int off, int len);
    }

    private final byte[] oneByteBuffer = new byte[1];
    private final Observer observer;

    public ObservableInputStream(InputStream in, Observer observer) {
        super(in);
        this.observer = observer;
    }

    @Override
    public int read() throws IOException {
        int res = super.read();
        if (res >= 0) {
            oneByteBuffer[0] = (byte) (res & 0xFF);
            observer.observeRead(oneByteBuffer, 0, 1);
        }
        return res;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res = super.read(b, off, len);
        if (res > 0) {
            observer.observeRead(b, off, res);
        }
        return res;
    }
}
