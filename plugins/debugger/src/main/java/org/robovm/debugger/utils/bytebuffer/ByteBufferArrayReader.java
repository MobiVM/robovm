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

import java.util.Iterator;

/**
 * @author Demyan Kimitsa
 * Reads array elements from byte-buffer
 */
public class ByteBufferArrayReader<T> implements Iterable<T> {
    private final ByteBufferReader bufferReader;
    private final int elementSize;
    private final ObjectReader<T> objectReader;
    private final int size;
    private final boolean reuseElement;
    private T lastAccessedObject;

    public interface ObjectReader<T> {
        T readObject(ByteBufferReader reader, T object);
    }

    public ByteBufferArrayReader(ByteBufferReader bufferReader, int elementSize, ObjectReader<T> objectReader, boolean reuseElement) {
        this.bufferReader = bufferReader;
        this.elementSize = elementSize;
        this.objectReader = objectReader;
        this.size = bufferReader.size() / elementSize;
        this.reuseElement = reuseElement;
    }

    public ByteBufferArrayReader(ByteBufferReader bufferReader, int elementSize, ObjectReader<T> objectReader) {
        this(bufferReader, elementSize, objectReader, true);
    }

    public T get(int index) {
        if (index >= size)
            throw new IllegalArgumentException();

        bufferReader.setPosition(elementSize * index);
        lastAccessedObject = objectReader.readObject(bufferReader, reuseElement ? lastAccessedObject : null);
        if (bufferReader.position() - elementSize * index != elementSize)
            throw new IllegalStateException("Object size specified doesn't match actual read from reader");
        return lastAccessedObject;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int idx = 0;

            @Override
            public boolean hasNext() {
                return idx < size;
            }

            @Override
            public T next() {
                return get(idx++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
