package org.robovm.debugger.jdwp.protocol;

import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Demyan Kimitsa
 * Header of JDWP request packet
 */
public class JdwpRequestHeader {
    public int length;
    public int id;
    public byte flags;
    public byte commandset;
    public byte command;

    public void readFromStream(InputStream is, ByteBufferPacket packet) throws IOException {
        packet.reset();
        packet.fillFromInputStream(is, 11);
        packet.setPosition(0);
        length = packet.readInt32();
        id = packet.readInt32();
        flags = packet.readByte();
        commandset = packet.readByte();
        command = packet.readByte();
    }

    public int payloadSize() {
        return length - 11;
    }
}
