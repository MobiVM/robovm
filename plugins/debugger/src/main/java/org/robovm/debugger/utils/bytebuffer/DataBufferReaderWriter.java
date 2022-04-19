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

/**
 * Interface that combines both reader and writer
 * @author Demyan Kimitsa
 */
public interface DataBufferReaderWriter extends DataBufferReader, DataBufferWriter {
    //
    // Overloaded api
    //

    DataBufferReaderWriter setPosition(long position);

    /**
     * makes a slice at specific position and specific size,
     * new slices receives new bottom limit
     */
    DataBufferReaderWriter sliceAt(long pos, int size, long newBottomLimit, boolean as64bit);

    default DataBufferReaderWriter sliceAt(long pos, int size, boolean as64bit) {
        return sliceAt(pos, size, 0L, as64bit);
    }

    default DataBufferReaderWriter sliceAt(long pos, int size) {
        return sliceAt(pos, size, is64bit());
    }

    /**
     * makes a slice from current position and specific size
     */
    default DataBufferReaderWriter slice(int size) {
        return sliceAt(position(), size);
    }

    /**
     * slices all remain bytes
     */
    default DataBufferReaderWriter slice() {
        return sliceAt(position(), remaining());
    }
}