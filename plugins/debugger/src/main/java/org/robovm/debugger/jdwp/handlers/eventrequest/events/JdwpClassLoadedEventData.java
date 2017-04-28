package org.robovm.debugger.jdwp.handlers.eventrequest.events;

import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * JDWP data for class loaded
 */
public class JdwpClassLoadedEventData extends JdwpEventData {
    private final ClassInfoImpl classInfo;
    private final String className;

    public JdwpClassLoadedEventData(byte eventKind, VmThread thread, ClassInfoImpl classInfo) {
        super(eventKind, thread);
        this.classInfo = classInfo;
        this.className = makeClassName(classInfo);
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    protected void dumpCustomData(ByteBufferPacket packet) {
        packet.writeByte(Converter.jdwpTypeTag(classInfo));
        packet.writeLong(classInfo.refId());
        packet.writeStringWithLen(classInfo.signature());
        packet.writeInt32(Converter.jdwpClassStatus(classInfo));
    }

    @Override
    public boolean cancelIfNotHandled() {
        // don't stop application if there is no interested instance in it
        return thread() != null;
    }

}
