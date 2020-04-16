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

import java.util.List;

/**
 * @author Demyan Kimitsa
 * Returns reference types for all classes currently loaded by the target VM. Both the JNI signature and the generic
 * signature are returned for each class
 */
public class JdwpVmAllClassesWithGenericsHandler implements IJdwpRequestHandler {

    private final VmDebuggerState state;

    public JdwpVmAllClassesWithGenericsHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {

        synchronized (state.centralLock()) {
            List<ClassInfo> classes = this.state.classInfoLoader().classes();

            // write dummy count field as there could be primitives
            output.writeInt32(0);
            int cnt = 0;
            for (ClassInfo classInfo : classes) {
                // refTypeTag
                output.writeByte(Converter.jdwpTypeTag(classInfo));
                // typeID
                output.writeLong(classInfo.refId());
                // signature
                output.writeStringWithLen(classInfo.signature());
                // genericSignature - The generic signature, an empty string if there is none.
                output.writeStringWithLen("");
                // status
                output.writeInt32(Converter.jdwpClassStatus(classInfo));

                cnt += 1;
            }

            // now write proper count value
            output.setPosition(0);
            output.writeInt32(cnt);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 20;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).AllClassesWithGeneric(20)";
    }
}
