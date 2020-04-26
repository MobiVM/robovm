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
package org.robovm.debugger.jdwp.handlers.string;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the characters contained in the string.
 */
public class JdwpStringGetValueHandler implements IJdwpRequestHandler {

    private final IJdwpInstanceDelegate delegate;

    public JdwpStringGetValueHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long refId = payload.readLong();

        try {
            String stringValue = delegate.jdwpGetStringValue(refId);
            output.writeStringWithLen(stringValue);
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw  e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 10;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "StringReference(10).Value(1)";
    }
}
