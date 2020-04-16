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
 * Invokes a static method. The method must be member of the class type or one of its superclasses, superinterfaces, or implemented interfaces
 */
public class JdwpClassTypeInvokeMethodHandler implements IJdwpRequestHandler {
    private final IJdwpInstanceDelegate delegate;

    public JdwpClassTypeInvokeMethodHandler(IJdwpInstanceDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long classId = payload.readLong();
        long threadId = payload.readLong();
        long methodId = payload.readLong();

        int argCount = payload.readInt32();

        // read all arguments into buffer
        byte[] tags = new byte[argCount];
        Object[] args = new Object[argCount];
        try {
            readTaggedArguments(tags, args, payload);
            // options are ignored for now
            int invokeOptions = payload.readInt32();
            boolean singleThread = (invokeOptions & JdwpConsts.InvokeOptions.INVOKE_SINGLE_THREADED) != 0;
            delegate.jdwpInvokeMethod(classId, threadId, methodId, true,  singleThread, args, output);
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
        return 3;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "ClassType(3).InvokeMethod(3)";
    }

    public static void readTaggedArguments(byte[] tags, Object[] args, DataBufferReader payload) {
        for (int idx = 0; idx < args.length; idx ++) {
            byte tag = payload.readByte();
            Object v;
            switch (tag) {
                case JdwpConsts.Tag.BOOLEAN: v = payload.readBoolean(); break;
                case JdwpConsts.Tag.BYTE: v = payload.readByte(); break;
                case JdwpConsts.Tag.CHAR: v = payload.readChar16(); break;
                case JdwpConsts.Tag.SHORT: v = payload.readInt16(); break;
                case JdwpConsts.Tag.INT: v = payload.readInt32(); break;
                case JdwpConsts.Tag.LONG: v = payload.readLong(); break;
                case JdwpConsts.Tag.FLOAT: v = payload.readFloat(); break;
                case JdwpConsts.Tag.DOUBLE: v = payload.readDouble(); break;

                case JdwpConsts.Tag.ARRAY:
                case JdwpConsts.Tag.OBJECT:
                case JdwpConsts.Tag.STRING:
                case JdwpConsts.Tag.THREAD:
                case JdwpConsts.Tag.THREAD_GROUP:
                case JdwpConsts.Tag.CLASS_LOADER:
                case JdwpConsts.Tag.CLASS_OBJECT:
                    v = payload.readLong();
                    break;
                default:
                    throw new DebuggerException(JdwpConsts.Error.INVALID_TAG);
            }

            tags[idx] = tag;
            args[idx] = v;
        }
    }
}
