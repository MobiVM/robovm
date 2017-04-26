package org.robovm.debugger.jdwp.handlers.eventrequest.events;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.ClassInfo;
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
    private final String className;

    public JdwpThreadStoppedEventData(byte eventKind, VmThread thread, VmStackTrace location) {
        super(eventKind, thread);
        this.location = location;
        this.exception = null;
        this.caught = false;
        this.className = makeClassName(location.classInfo());
    }

    public JdwpThreadStoppedEventData(byte eventKind, VmThread thread, VmStackTrace location, VmInstance exception, boolean caught) {
        super(eventKind, thread);
        this.location = location;
        this.exception = exception;
        this.caught = caught;
        this.className = makeClassName(location.classInfo());
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
        return className;
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

    private String makeClassName(ClassInfo classInfo) {
        if (classInfo instanceof ClassInfoImpl)
            return ((ClassInfoImpl)classInfo).className().replace('/','.');
        return null;
    }
}
