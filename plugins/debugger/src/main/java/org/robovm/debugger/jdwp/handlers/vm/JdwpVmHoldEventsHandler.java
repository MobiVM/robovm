package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.IJdwpEventDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Tells the target VM to stop sending events. Events are not discarded; they are held until a subsequent ReleaseEvents command is sent.
 */
public class JdwpVmHoldEventsHandler implements IJdwpRequestHandler {
    private final IJdwpEventDelegate eventsDelegate;

    public JdwpVmHoldEventsHandler(IJdwpEventDelegate eventsDelegate) {
        this.eventsDelegate = eventsDelegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        eventsDelegate.jdwpHoldEvents();
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 15;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).HoldEvents(15)";
    }
}
