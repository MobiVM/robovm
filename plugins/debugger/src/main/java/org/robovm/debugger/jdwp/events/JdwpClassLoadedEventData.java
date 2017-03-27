package org.robovm.debugger.jdwp.events;

import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * JDWP data for class loaded
 */
public class JdwpClassLoadedEventData extends JdwpEventData {
    private final ClassInfo classInfo;

    public JdwpClassLoadedEventData(byte eventKind, VmThread thread, ClassInfo classInfo) {
        super(eventKind, thread);
        this.classInfo = classInfo;
    }

    @Override
    protected void dumpCustomData(ByteBufferPacket packet) {
        packet.writeByte(Converter.jdwpTypeTag(classInfo));
        packet.writeLong(classInfo.getRefId());
        packet.writeStringWithLen(classInfo.getSignature());
        packet.writeInt32(Converter.jdwpClassStatus(classInfo));
    }
}
