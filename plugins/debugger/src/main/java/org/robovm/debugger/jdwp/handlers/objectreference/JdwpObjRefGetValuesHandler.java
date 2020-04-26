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
package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the value of one or more instance fields. Each field must be member of the object's type or one of its superclasses,
 * superinterfaces, or implemented interfaces.
 */
public class JdwpObjRefGetValuesHandler implements IJdwpRequestHandler {
    private final IJdwpInstanceDelegate delegate;

    public JdwpObjRefGetValuesHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long objectId = payload.readLong();
        int count = payload.readInt32();
        long[] fields = new long[count];
        for (int idx = 0; idx < count; idx++) {
            fields[idx] = payload.readLong();
        }

        // get values from target
        try {
            output.writeInt32(fields.length);
            delegate.jdwpFieldGetValues(objectId, fields, isStatic(), output);
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    /**
     * implementation wise it will be very similar to get static field ReferenceType(2).getValues
     * so it will reuse same class but will override is static (and identifiers)
     * @return true if handle for static fields
     */
    protected boolean isStatic() {
        return false;
    }

    @Override
    public byte getCommandSet() {
        return 9;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "ObjectReference(9).GetValues(2)";
    }

}
