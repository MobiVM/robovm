package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

import java.util.List;

/**
 * @author Demyan Kimitsa
 * Returns reference types for all classes currently loaded by the target VM.
 */
public class JdwpVmAllClassesHandler implements IJdwpRequestHandler {

    private final VmDebuggerState vmDebuggerState;

    public JdwpVmAllClassesHandler(VmDebuggerState vmDebuggerState) {
        this.vmDebuggerState = vmDebuggerState;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {

        List<ClassInfo> classes = this.vmDebuggerState.classes();

        output.writeInt32(classes.size());
        for (ClassInfo classInfo : classes) {
            // refTypeTag
            output.writeByte(Converter.jdwpTypeTag(classInfo));
            // typeID
            output.writeLong(classInfo.getRefId());
            // signature
            output.writeStringWithLen(classInfo.getSignature());
            // status
            output.writeInt32(Converter.jdwpClassStatus(classInfo));
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).AllClasses(3)";
    }
}
