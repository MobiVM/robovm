/*
 * Copyright (C) 2025 The MobiVM Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.compiler.util.io;

import java.io.*;
import java.util.function.Function;

/**
 * Helper class to build chain of output streams that will be connected to process output.
 * Main purpose is to provide possibility to observe and process data from process output by
 * chaining OutputStreams.
 * It is better approach than monitoring process output in separate thread by reading connected InputStream
 * as it doesn't require additional thread and allows to process data in streaming way without buffering it in memory.
 */
public class OutputStreamChain {
    // last output stream in the chain, it can be connected with PipedInputStream and returned by ProxyProcess,
    // so process output will be piped to it
    private final PipedOutputStream outbound = new PipedOutputStream();


    // root output stream that is connected to process output (process will write to it)
    private OutputStream inbound = outbound;

    /**
     * @return output stream connected to the beginning of the chain, so process will write to it
     */
    public OutputStream getInbound() {
        return inbound;
    }

    /**
     * @return input stream connected to the end of the chain, so it will receive all data written to the chain
     */
    public InputStream getOutboundAsInput() {
        try {
            return new PipedInputStream(outbound, 1024 * 1024);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Registers another outputStream as receiver of data from the process output, so it can be used to observe
     * and process data
     * Usage:
     * chain.registerLink(parent -> new FilterOutputStream(out) {
     * public void write(byte[] b, int off, int len) throws IOException {
     * ... process data here
     * /// call parent stream
     * parent.write(b, off, len);
     * }
     * });
     *
     * @param builder creates OutputStram that will receive data and responsible to pass it to the next stream
     *                in the chain
     */
    public void registerLink(Function<OutputStream, OutputStream> builder) {
        OutputStream r = builder.apply(inbound);
        if (r == null) throw new IllegalStateException("builder must return non null stream");
        inbound = r;
    }

    /**
     * @return true if chain is empty, so process output will be piped directly to the end of the chain without any processing
     */
    public boolean isEmpty() {
        return inbound == outbound;
    }
}
