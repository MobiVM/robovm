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
 * Wrapper around several mapped reader (regions) that simulates memory block access
 *
 * @author Demyan Kimitsa
 */
public class CompositeDataBufferReader extends CompositeDataBuffer<DataBufferReader> implements DataBufferReader {

    public CompositeDataBufferReader(DataBufferReader[] regions) {
        super(regions);
    }

    @Override
    public CompositeDataBufferReader setPosition(long addr) {
        super.setPosition(addr);
        return this;
    }

    @Override
    public CompositeDataBufferReader reset() {
        super.reset();
        return this;
    }

    @Override
    public DataBufferReader sliceAt(long pos, int size, long newBottomLimit, boolean as64bit) {
        return activeRegion.sliceAt(pos, size, newBottomLimit, as64bit);
    }
}
