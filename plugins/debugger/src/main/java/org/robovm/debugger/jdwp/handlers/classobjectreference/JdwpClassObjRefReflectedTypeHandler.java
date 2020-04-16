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
package org.robovm.debugger.jdwp.handlers.classobjectreference;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.instances.VmClassInstance;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the reference type reflected by this class object.
 */
public class JdwpClassObjRefReflectedTypeHandler implements IJdwpRequestHandler {
    private final VmDebuggerState state;

    public JdwpClassObjRefReflectedTypeHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        long classObjectId = payload.readLong();

        synchronized (state.centralLock()) {
            try {
                // get class instance
                VmClassInstance classInstance = state.referenceRefIdHolder().instanceById(classObjectId);
                if (classInstance == null)
                    return JdwpConsts.Error.INVALID_OBJECT;
                // now by it address get class info
                ClassInfo classInfo = classInstance.representedClassInfo();
                output.writeByte(Converter.jdwpTypeTag(classInfo));
                output.writeLong(classInfo.refId());
            } catch (ClassCastException e) {
                return JdwpConsts.Error.INVALID_OBJECT;
            } catch (DebuggerException e) {
                if (e.getCode() < 0)
                    throw e;
                return (short) e.getCode();
            }
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 17;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "Method(17).ReflectedType(1)";
    }

}
