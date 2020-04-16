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
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns information for each method in a reference type. Inherited methods are not included.
 * The list of methods will include constructors (identified with the name "<init>"), the initialization method
 * (identified with the name "<clinit>") if present, and any synthetic methods created by the compiler.
 * Methods are returned in the order they occur in the class file.
 */
public class JdwpRefTypeMethodsHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpRefTypeMethodsHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classInfoByRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_OBJECT;
            MethodInfo[] fields = state.classInfoLoader().classMethods(classInfo);

            output.writeInt32(fields.length);
            for (MethodInfo methodInfo : fields) {
                output.writeLong(methodInfo.refId());
                output.writeStringWithLen(methodInfo.name());
                output.writeStringWithLen(methodInfo.signature());
                String signatureWithGeneric = getGenericSignature();
                if (signatureWithGeneric != null)
                    output.writeStringWithLen(signatureWithGeneric);
                output.writeInt32(methodInfo.modifiers());
            }
        }

        return JdwpConsts.Error.NONE;
    }

    protected String getGenericSignature() {
        // return null as there is no generic signature is expected in this handler
        return null;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 5;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).Methods(5)";
    }

}
