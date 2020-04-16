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
package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns reference types for all the classes loaded by the target VM which match the given signature.
 * In RoboVM one instance is possible
 */
public class JdwpVmClassesBySignatureHandler implements IJdwpRequestHandler{

    private final VmDebuggerState state;

    public JdwpVmClassesBySignatureHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        String signature = payload.readStringWithLen();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classInfoBySignature(signature);
            if (classInfo != null) {
                // Number of reference types that follow.
                output.writeInt32(1);
                // refTypeTag
                output.writeByte(Converter.jdwpTypeTag(classInfo));
                // typeID
                output.writeLong(classInfo.refId());
                // status
                output.writeInt32(Converter.jdwpClassStatus(classInfo));
            } else {
                // no class found
                // TODO: logging here
                output.writeInt32(0); // Number of reference types that follow.
            }
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).ClassesBySignature(2)";
    }
}
