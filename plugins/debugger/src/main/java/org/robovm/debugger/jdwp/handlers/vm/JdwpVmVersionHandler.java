package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmSpecConsts;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * Returns the JDWP version implemented by the target VM. The version string format is implementation dependent.
 */
public class JdwpVmVersionHandler implements IJdwpRequestHandler {
    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
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
}
