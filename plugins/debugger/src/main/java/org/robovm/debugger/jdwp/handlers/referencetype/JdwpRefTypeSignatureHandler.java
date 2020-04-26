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
 * Returns the JNI signature of a reference type.
 */
public class JdwpRefTypeSignatureHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpRefTypeSignatureHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classInfoByRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_CLASS;

            output.writeStringWithLen(classInfo.signature());
            String signatureWithGeneric = getGenericSignature();
            if (signatureWithGeneric != null)
                output.writeStringWithLen(signatureWithGeneric);
        }

        return JdwpConsts.Error.NONE;
    }

    protected String getGenericSignature() {
        // to subclass to override
        return null;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Signature(1)";
    }

}
