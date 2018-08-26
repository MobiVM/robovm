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
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Retrieve this VM's capabilities. The capabilities are returned as booleans, each indicating the presence or absence
 * of a capability. The commands associated with each capability will return the NOT_IMPLEMENTED error if the cabability
 * is not available.
 */
public class JdwpVmCapabilitiesNewHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        //canWatchFieldModification: Can the VM watch field modification, and therefore can it send the Modification
        // Watchpoint Event?
        output.writeBoolean(false);

        //canWatchFieldAccess: Can the VM watch field access, and therefore can it send the Access Watchpoint Event?
        output.writeBoolean(false);

        //canGetBytecodes: Can the VM get the bytecodes of a given method?
        output.writeBoolean(false);

        //canGetSyntheticAttribute: Can the VM determine whether a field or method is synthetic? (that is, can the
        // VM determine if the method or the field was invented by the compiler?)
        output.writeBoolean(false);

        //canGetOwnedMonitorInfo: Can the VM get the owned monitors infornation for a thread?
        output.writeBoolean(false);

        //canGetCurrentContendedMonitor: Can the VM get the current contended monitor of a thread?
        output.writeBoolean(false);

        //canGetMonitorInfo: Can the VM get the monitor information for a given object?
        output.writeBoolean(false);

        //canRedefineClasses: Can the VM redefine classes?
        output.writeBoolean(false);

        //canAddMethod: Can the VM add methods when redefining classes?
        output.writeBoolean(false);

        //canUnrestrictedlyRedefineClasses: Can the VM redefine classesin arbitrary ways?
        output.writeBoolean(false);

        //canPopFrames: Can the VM pop stack frames?
        output.writeBoolean(false);

        //canUseInstanceFilters: Can the VM filter events by specific object?
        output.writeBoolean(true);

        //canGetSourceDebugExtension: Can the VM get the source debug extension?
        output.writeBoolean(false);

        //canRequestVMDeathEvent: Can the VM request VM death events?
        output.writeBoolean(false);

        //canSetDefaultStratum: Can the VM set a default stratum?
        output.writeBoolean(false);

        //reserved16: Reserved for future capability
        output.writeBoolean(false);

        //reserved17: Reserved for future capability
        output.writeBoolean(false);

        //reserved18: Reserved for future capability
        output.writeBoolean(false);

        //reserved19: Reserved for future capability
        output.writeBoolean(false);

        //reserved20: Reserved for future capability
        output.writeBoolean(false);

        //reserved21: Reserved for future capability
        output.writeBoolean(false);

        //reserved22: Reserved for future capability
        output.writeBoolean(false);

        //reserved23: Reserved for future capability
        output.writeBoolean(false);

        //reserved24: Reserved for future capability
        output.writeBoolean(false);

        //reserved25: Reserved for future capability
        output.writeBoolean(false);

        //reserved26: Reserved for future capability
        output.writeBoolean(false);

        //reserved27: Reserved for future capability
        output.writeBoolean(false);

        //reserved28: Reserved for future capability
        output.writeBoolean(false);

        //reserved29: Reserved for future capability
        output.writeBoolean(false);

        //reserved30: Reserved for future capability
        output.writeBoolean(false);

        //reserved31: Reserved for future capability
        output.writeBoolean(false);

        //reserved32: Reserved for future capability
        output.writeBoolean(false);

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 17;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).capabilitiesNew(17)";
    }
}
