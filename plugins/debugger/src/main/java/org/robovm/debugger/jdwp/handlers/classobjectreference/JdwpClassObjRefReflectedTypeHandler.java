package org.robovm.debugger.jdwp.handlers.classobjectreference;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.instances.VmClassInstance;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

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
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        long classObjectId = payload.readLong();

        synchronized (state.centralLock()) {
            try {
                // get class instance
                VmClassInstance classInstance = state.referenceRefIdHolder().instanceById(classObjectId);
                // now by it address get class info
                ClassInfo classInfo = state.classInfoLoader().classByClazzAddr(classInstance.objectPtr());
                if (classInfo == null)
                    return JdwpConsts.Error.INVALID_OBJECT;

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
