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

    private final VmDebuggerState state;

    public JdwpVmAllClassesHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {

        synchronized (state.centralLock()) {
            List<ClassInfo> classes = this.state.classInfoLoader().classes();

            // write dummy count field as there could be primitives
            output.writeInt32(0);
            int cnt = 0;
            for (ClassInfo classInfo : classes) {
                if (classInfo.isPrimitive())
                    continue;

                // refTypeTag
                output.writeByte(Converter.jdwpTypeTag(classInfo));
                // typeID
                output.writeLong(classInfo.refId());
                // signature
                output.writeStringWithLen(classInfo.signature());
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
        return 3;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).AllClasses(3)";
    }
}
