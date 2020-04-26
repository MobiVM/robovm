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

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassDataConsts;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the immediate superclass of a class.
 */
public class JdwpClassTypeSuperclassHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpClassTypeSuperclassHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long clazzId = payload.readLong();

        synchronized (state.centralLock()) {

            ClassInfo ci = state.classRefIdHolder().objectById(clazzId);
            if (ci == null)
                return JdwpConsts.Error.INVALID_OBJECT;
            if (!ci.isClass())
                return JdwpConsts.Error.INVALID_CLASS;

            ClassInfoImpl cii = (ClassInfoImpl) ci;
            if (ClassDataConsts.signatures.JAVA_LANG_OBJECT.equals(ci.signature())) {
                output.writeLong(0);
            } else if (cii.superclassSignature() != null){
                ci = state.classInfoLoader().classInfoBySignature(cii.superclassSignature());
                output.writeLong(ci.refId());
            } else {
                // should not happen
                return JdwpConsts.Error.INVALID_CLASS;
            }
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 3;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "ClassType(3).Superclass(1)";
    }

}
