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
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the class file major and minor version numbers, as defined in the class file format of the Java Virtual Machine specification.
 */
public class JdwpRefTypeClassFileVersionHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpRefTypeClassFileVersionHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long refTypeId = payload.readLong();

        synchronized (state.centralLock()) {
            if (state.referenceRefIdHolder().objectById(refTypeId) == null)
                return JdwpConsts.Error.INVALID_CLASS;

            // return Java 1.8
            output.writeInt32(1);
            output.writeInt32(8);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 17;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).ClassFileVersion(17)";
    }

}
