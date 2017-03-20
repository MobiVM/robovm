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
public class JdwpVmCapabilitiesHandler implements IJdwpRequestHandler {
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

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 12;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).capabilities(12)";
    }
}
