package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.IJdwpEventDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Tells the target VM to continue sending events. This command is used to restore normal activity after a HoldEvents command.
 */
public class JdwpVmReleaseEventsHandler implements IJdwpRequestHandler {

    private final IJdwpEventDelegate eventsDelegate;

    public JdwpVmReleaseEventsHandler(IJdwpEventDelegate eventsDelegate) {
        this.eventsDelegate = eventsDelegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        eventsDelegate.jdwpReleaseEvents();
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 16;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).ReleaseEvents(16)";
    }
}
