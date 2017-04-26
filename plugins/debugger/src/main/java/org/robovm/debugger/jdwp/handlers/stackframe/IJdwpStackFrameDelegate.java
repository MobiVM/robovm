package org.robovm.debugger.jdwp.handlers.stackframe;

import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * describes operations around stack frame and variables
 */
public interface IJdwpStackFrameDelegate {
    /**
     * reads frame local variables
     * @param threadId of thread
     * @param frameId stack frame to check variables in
     * @param varIndexes array of indexes
     * @param varTags array of variable tags
     * @param output to write variables to
     */
    void getFrameValues(long threadId, long frameId, int[] varIndexes, byte[] varTags, ByteBufferPacket output);

    /**
     * sets frame local variables to values
     * @param threadId of thread
     * @param frameId stack frame to check variables in
     * @param payload JDWP byte packet with data to pick
     * @param count number of frame values to set
     */
    void setFrameValues(long threadId, long frameId, ByteBufferPacket payload, int count);

    /**
     * gets frame local variable by its name (actually to get this value only)
     * @param threadId of thread
     * @param frameId stack frame to check variables in
     * @param variableName of variable to fetch
     * @param output to write variable to
     */
    void getFrameVariable(long threadId, long frameId, String variableName, ByteBufferPacket output);
}
