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
package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the modifiers (also known as access flags) for a reference type. The returned bit mask contains information on
 * the declaration of the reference type. If the reference type is an array or a primitive class (for example,
 * java.lang.Integer.TYPE), the value of the returned bit mask is undefined.
 */
public class JdwpRefTypeModifiersHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpRefTypeModifiersHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classInfoByRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_OBJECT;

            output.writeInt32(classInfo.modifiers());
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Modifiers(3)";
    }

}
