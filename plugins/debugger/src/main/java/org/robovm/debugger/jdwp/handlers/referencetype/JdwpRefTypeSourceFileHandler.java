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
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the name of source file in which a reference type was declared
 */
public class JdwpRefTypeSourceFileHandler implements IJdwpRequestHandler{
    private final VmDebuggerState state;

    public JdwpRefTypeSourceFileHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classInfoByRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_CLASS;

            if (!classInfo.isClass())
                return JdwpConsts.Error.INVALID_CLASS;

            String sourceFile = ((ClassInfoImpl)classInfo).sourceFile();
            output.writeStringWithLen(sourceFile);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 7;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).SourceFile(7)";
    }

}
