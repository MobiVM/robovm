package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.state.instances.VmClassInstance;
import org.robovm.debugger.state.instances.VmStringInstance;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Interface that describes operations around instance
 */
public interface IJdwpInstanceDelegate {
    VmStringInstance jdwpCreateStringInstance(String value);
    String jdwpGetStringValue(long stringRefId);

    void jdwpFieldGetValues(long objectId, long[] fields, boolean staticFields, ByteBufferPacket output);
    void jdwpFieldSetValues(long objectId, int fieldsCount, ByteBufferPacket payload);

    /**
     * for given object finds it clazz object (creates if required)
     * @param objectId to get clazz object from
     * @return clazz object
     */
    VmClassInstance jdwpGetClazzObject(long objectId) throws DebuggerException;

}
