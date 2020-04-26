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
import org.robovm.debugger.state.VmSpecConsts;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * Returns the JDWP version implemented by the target VM. The version string format is implementation dependent.
 */
public class JdwpVmVersionHandler implements IJdwpRequestHandler {
    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        // description - Text information on the VM version
        output.writeStringWithLen(VmSpecConsts.JDWP_NAME);
        // jdwpMajor - Major JDWP Version number
        output.writeInt32(VmSpecConsts.JDWP_VERSION_MAJOR);
        // jdwpMinor - Minor JDWP Version number
        output.writeInt32(VmSpecConsts.JDWP_VERSION_MINOR);
        // vmVersion - Target VM JRE version, as in the java.version property
        output.writeStringWithLen(VmSpecConsts.JAVA_VM_VERSION);
        // vmName - Target VM name, as in the java.vm.name property
        output.writeStringWithLen(VmSpecConsts.JAVA_VM_NAME);

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).Version(1)";
    }

}
