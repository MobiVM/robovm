package org.robovm.debugger.jdwp.protocol;

import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Common interface for all JDWP request handlers
 */
public interface IJdwpRequestHandler {
    /**
     * method is called to process command in specific command set and return error code
     * that will go to reply message
     * @param payload from incoming request
     * @param output to put output data if any
     * @return error code of operation
     */
    short handle(ByteBufferPacket payload, ByteBufferPacket output);

    /**
     * @return command set this handler is working in
     */
    byte getCommandSet();

    /**
     * @return command this handler handles
     */
    byte getCommand();
}
