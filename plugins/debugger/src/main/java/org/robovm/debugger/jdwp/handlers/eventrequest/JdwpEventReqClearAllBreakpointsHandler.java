package org.robovm.debugger.jdwp.handlers.eventrequest;

import org.robovm.debugger.execution.ExecutionControlCenter;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Removes all set breakpoints, a no-op if there are no breakpoints set.
 */
public class JdwpEventReqClearAllBreakpointsHandler implements IJdwpRequestHandler {

    private final ExecutionControlCenter center;

    public JdwpEventReqClearAllBreakpointsHandler(ExecutionControlCenter center) {
        this.center = center;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        center.jdwpClearAllBreakpoints();
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 15;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "EventRequest(15).ClearAllBreakpoints(3)";
    }
}
