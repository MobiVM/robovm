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
package org.robovm.debugger.jdwp.handlers.thread;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 */
public class JdwpThreadSuspendHandler implements IJdwpRequestHandler {

    private final IJdwpThreadDelegate delegate;

    public JdwpThreadSuspendHandler(IJdwpThreadDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long threadId = payload.readLong();
        try {
            delegate.jdwpSuspendThread(threadId);
        } catch (ClassCastException e) {
            return JdwpConsts.Error.INVALID_OBJECT;
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return 0;
    }

    @Override
    public byte getCommandSet() {
        return 11;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ThreadReference(11).Suspend(2)";
    }

}
