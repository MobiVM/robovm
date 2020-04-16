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
import org.robovm.debugger.jdwp.handlers.classtype.JdwpClassTypeInvokeMethodHandler;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Invokes a instance method. The method must be member of the object's type or one of its superclasses, superinterfaces, or implemented interfaces.
 */
public class JdwpObjRefInvokeMethodHandler implements IJdwpRequestHandler {
    private final IJdwpInstanceDelegate delegate;

    public JdwpObjRefInvokeMethodHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long objectId = payload.readLong();
        long threadId = payload.readLong();
        long classId = payload.readLong();
        long methodId = payload.readLong();

        int argCount = payload.readInt32();

        // read all arguments into buffer
        byte[] tags = new byte[argCount];
        Object[] args = new Object[argCount];
        try {
            JdwpClassTypeInvokeMethodHandler.readTaggedArguments(tags, args, payload);
            // options are ignored for now
            int invokeOptions = payload.readInt32();
            boolean singleThread = (invokeOptions & JdwpConsts.InvokeOptions.INVOKE_SINGLE_THREADED) != 0;
            delegate.jdwpInvokeMethod(objectId, threadId, methodId, false,  singleThread, args, output);
        } catch (ClassCastException e) {
            return JdwpConsts.Error.INVALID_OBJECT;
        } catch (DebuggerException e) {
            if (e.getCode() < 0)
                throw e;
            return (short) e.getCode();
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 9;
    }

    @Override
    public byte getCommand() {
        return 6;
    }

    @Override
    public String toString() {
        return "ObjectReference(9).InvokeMethod(6)";
    }

}
