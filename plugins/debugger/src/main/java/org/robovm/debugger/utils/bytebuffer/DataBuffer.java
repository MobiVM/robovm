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

import java.nio.ByteOrder;

/**
 * base interface for data buffer reader and writer
 */
public interface DataBuffer {

    /**
     * @return true if this data buffer is used for 64 bit arch
     */
    boolean is64bit();

    /**
     * @return pointer size for buffer architecture: 64bit - 8 bytes, 32bit - 4 bytes
     */
    default int pointerSize() {
        return is64bit() ? 8 : 4;
    }

    /**
     * @return current position of buffer (in range [bottomLimit..limit() - 1)
     */
    long position();

    /**
     * @return lower possible position of this buffer(inclusive)
     */
    default long bottomLimit() {
        return 0;
    }

    /**
     * @return upper limit of buffer's position (exclusive)
     */
    long limit();

    /**
     * reset buffer:
     * - position to bottom limit
     */
    default DataBuffer reset() {
        setPosition(bottomLimit());
        return this;
    }

    /**
     * sets new position of buffer
     */
    DataBuffer setPosition(long position);

    /**
     * @return true if position not reached the limit
     */
    default boolean hasRemaining() {
        return position() < limit();
    }

    default int remaining() {
        return (int) (limit() - position());
    }

    /**
     * return number of bytes in this buffer
     */
    default int size() {
        return (int) (limit() - bottomLimit());
    }

    /**
     * @return true if buffer is array backed and array methods can be used
     */
    default boolean hasArray() {
        return false;
    }

    /**
     * @return array this buffer is backed on
     */
    default byte[] array() {
        throw new UnsupportedOperationException();
    }

    /**
     * @return offset from start of array that corresponds bottomLimit of buffer
     */
    default int arrayOffset() {
        throw new UnsupportedOperationException();
    }

    /**
     * @return offset from start of array that corresponds current position
     */
    default int arrayPositionOffset() {
        return arrayOffset() + (int)(position() - bottomLimit());
    }

    /**
     * sets byte order of buffer
     */
    DataBuffer setByteOrder(ByteOrder order);
}
