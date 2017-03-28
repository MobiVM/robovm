package org.robovm.debugger.jdwp;

import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Api that application can use to work with server
 */
public interface IJdwpServerApi {
    void sendEvent(byte suspendPolicy, int eventsCount, ByteBufferPacket payload);
}
