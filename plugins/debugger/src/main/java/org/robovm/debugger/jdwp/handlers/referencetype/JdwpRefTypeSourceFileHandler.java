package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Returns the name of source file in which a reference type was declared
 */
public class JdwpRefTypeSourceFileHandler implements IJdwpRequestHandler{
    private final VmDebuggerState state;

    public JdwpRefTypeSourceFileHandler(VmDebuggerState state) {
        this.state = state;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long referenceTypeID = payload.readLong();

        synchronized (state.centralLock()) {
            ClassInfo classInfo = state.classInfoLoader().classInfoByRefId(referenceTypeID);
            if (classInfo == null)
                return JdwpConsts.Error.INVALID_CLASS;

            if (!classInfo.isClass())
                return JdwpConsts.Error.INVALID_CLASS;

            // TODO: pick information from debug information
            // as there is no way to find out the proper file location for inner classes
            // TODO: currently making it from class name
            String sourceFile = ((ClassInfoImpl)classInfo).className();
            int sepIdx = sourceFile.indexOf('$');
            if (sepIdx > 0)
                sourceFile = sourceFile.substring(0, sepIdx);
            sourceFile += ".java";
            output.writeStringWithLen(sourceFile);
        }

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 7;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).SourceFile(7)";
    }

}
