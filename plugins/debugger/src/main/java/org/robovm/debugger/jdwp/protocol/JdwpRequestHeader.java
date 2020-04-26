/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.jdwp.protocol;

import org.robovm.debugger.utils.bytebuffer.DataBufferReaderWriter;

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

    public void readFromStream(InputStream is, DataBufferReaderWriter packet) throws IOException {
        packet.reset();
        packet.writeFromStream(is, 11);
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
