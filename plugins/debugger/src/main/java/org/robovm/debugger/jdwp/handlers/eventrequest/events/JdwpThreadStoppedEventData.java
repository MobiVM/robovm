package org.robovm.debugger.jdwp.handlers.eventrequest.events;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.state.instances.VmInstance;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Event data of stopped thread (step/breakpoint)
 */
public class JdwpThreadStoppedEventData extends JdwpEventData {

    private final VmStackTrace location;
    private final VmInstance exception;
    private final boolean caught;

    public JdwpThreadStoppedEventData(byte eventKind, VmThread thread, VmStackTrace location) {
        super(eventKind, thread);
        this.location = location;
        this.exception = null;
        this.caught = false;
    }

    public JdwpThreadStoppedEventData(byte eventKind, VmThread thread, VmStackTrace location, VmInstance exception, boolean caught) {
        super(eventKind, thread);
        this.location = location;
        this.exception = exception;
        this.caught = caught;
    }

    @Override
    public long getExceptionTypeId() {
        return exception.classInfo().refId();
    }

    @Override
    public boolean isExceptionCaught() {
        return caught;
    }

    @Override
    public VmStackTrace getStoppeedLocation() {
        return location;
    }

    @Override
    public String getClassName() {
        return (location.classInfo() instanceof ClassInfoImpl) ? ((ClassInfoImpl)location.classInfo()).className() : null;
    }

    @Override
    protected void dumpCustomData(ByteBufferPacket packet) {
        // write location
        // TODO: is other types possible like array ?
        packet.writeByte(JdwpConsts.Tag.OBJECT);
        packet.writeLong(location.classInfo().refId());
        packet.writeLong(location.methodInfo().refId());
        packet.writeLong(location.lineNumber());

        // exception
        if (exception != null) {
            packet.writeByte(JdwpConsts.Tag.OBJECT);
            packet.writeLong(exception.refId());

            // exception location
            // TODO: check if it is valid
            packet.writeLong(location.classInfo().refId());
            packet.writeLong(location.methodInfo().refId());
            packet.writeLong(location.lineNumber());
        }
    }

    @Override
    public boolean cancelIfNotHandled() {
        // don't stop application if there is no interested instance in it
        return true;
    }
}
