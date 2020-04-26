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
package org.robovm.debugger.jdwp.handlers.classtype;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Sets the value of one or more static fields. Each field must be member of the class type or one of its superclasses,
 * superinterfaces, or implemented interfaces.
 */
public class JdwpClassTypeSetValuesHandler implements IJdwpRequestHandler {
    private final IJdwpInstanceDelegate delegate;

    public JdwpClassTypeSetValuesHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long objectId = payload.readLong();
        int count = payload.readInt32();


        // set values to target
        try {
            // all field ids and values are multiplexed in data flow, so it will be handled in delegate
            delegate.jdwpFieldSetValues(objectId, count, true, payload);
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 3;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ClassType(3).SetValues(2)";
    }

}
