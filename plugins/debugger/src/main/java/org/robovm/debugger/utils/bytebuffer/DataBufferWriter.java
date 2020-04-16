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
package org.robovm.debugger.utils.bytebuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;

/**
 * Interface defines buffer writer API
 */
public interface DataBufferWriter extends DataBuffer {
    void wants(int size);

    DataBufferWriter writeByte(byte b);

    default DataBufferWriter writeBoolean(boolean b) {
        return writeByte((byte) (b ? 1 : 0));
    }

    DataBufferWriter writeInt32(int i);

    default DataBufferWriter writeUnsignedInt32(long l) {
        int i = (int) (l & 0xFFFFFFFF);
        return writeInt32(i);
    }

    DataBufferWriter writeInt16(short i);

    default DataBufferWriter writeUnsignedInt16(int i) {
        short s = (short) (i & 0xFFFF);
        return writeInt16(s);
    }

    default DataBufferWriter writeChar16(char c) {
        return writeUnsignedInt16(c);
    }

    DataBufferWriter writeLong(long l);

    DataBufferWriter writeFloat(float f);

    DataBufferWriter writeDouble(double d);

    default DataBufferWriter writeStringWithLen(String s) {
        byte[] bytes = s.getBytes();
        wants(bytes.length + 4);
        writeInt32(bytes.length);
        return writeBytes(bytes);
    }

    DataBufferWriter writeBytes(byte[] bytes, int offset, int count);

    default DataBufferWriter writeBytes(byte[] bytes) {
        return writeBytes(bytes, 0, bytes.length);
    }

    default DataBufferWriter writePointer(long addr) {
        if (is64bit())
            return writeLong(addr);
        else
            return writeUnsignedInt32(addr);
    }

    default DataBufferWriter writeFromStream(InputStream is) throws IOException {
        return writeFromStream(is, is.available());
    }

    default DataBufferWriter writeFromStream(InputStream is, int count) throws IOException {
        // will put to byte buffer
        wants(count);
        if (hasArray()) {
            int offset = arrayPositionOffset();
            int remaining = count;
            while (remaining > 0) {
                int bytesRead = is.read(array(), offset, remaining);
                if (bytesRead < 0)
                    throw new BufferUnderflowException();
                offset += bytesRead;
                remaining -= bytesRead;
            }
            setPosition(position() + count);
        } else {
            byte[] buffer = new byte[Math.min(1024, count)];
            while (count > 0) {
                int bytesRead = Math.min(count, buffer.length);
                bytesRead = is.read(buffer, 0, bytesRead);
                if (bytesRead < 0)
                    throw new BufferUnderflowException();
                writeBytes(buffer, 0, bytesRead);
                count -= bytesRead;
            }
        }

        return this;
    }

    default DataBufferWriter writeFromReader(DataBufferReader reader) {
        wants(reader.remaining());
        int remaining = reader.remaining();
        if (reader.hasArray()) {
            writeBytes(reader.array(), reader.arrayPositionOffset(), reader.remaining());
            reader.skip(remaining);
        } else {
            byte[] buffer = new byte[Math.min(1024, remaining)];
            while (remaining > 0) {
                int bytesRead = Math.min(remaining, buffer.length);
                reader.readBytes(buffer, 0, bytesRead);
                writeBytes(buffer, 0, bytesRead);
                remaining -= bytesRead;
            }
        }

        return this;
    }

    /**
     * resets writer part, in case both reader and writer are implemented
     */
    default DataBufferWriter resetWriter() {
        reset();
        return this;
    }
}