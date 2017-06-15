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

import java.nio.ByteBuffer;

/**
 * @author Demyan Kimitsa
 */
class RangeByteBufferReader extends ByteBufferReader{
    /** virtual data start -- first byte accessible */
    private int virtualStart;

    /** virtual data end -- last byte accessible */
    private int virtualLimit;

    public RangeByteBufferReader(ByteBuffer bb) {
        super(bb.duplicate().asReadOnlyBuffer());
        byteBuffer.order(bb.order());
        virtualStart = 0;
        virtualLimit = bb.limit();
    }

    public RangeByteBufferReader(ByteBuffer bb, boolean is64bit) {
        super(bb.duplicate().asReadOnlyBuffer(), is64bit);
        byteBuffer.order(bb.order());
        virtualStart = 0;
        virtualLimit = bb.limit();
    }

    public RangeByteBufferReader(ByteBufferReader other, int offs, int size, boolean is64bit) {
        super(other.byteBuffer.duplicate().asReadOnlyBuffer(), is64bit);
        byteBuffer.order(other.byteBuffer.order());
        if (other instanceof RangeByteBufferReader) {
            RangeByteBufferReader o = (RangeByteBufferReader) other;
            virtualStart = o.virtualStart + offs;
            virtualLimit = virtualStart + size - 1;
            byteBuffer.position(virtualStart);
            if (virtualStart > o.virtualLimit || virtualLimit > o.virtualLimit)
                throw new IllegalArgumentException();
        } else {
            virtualStart = 0;
            virtualLimit = byteBuffer.limit();
        }
    }


    @Override
    public int size() {
        return virtualLimit - virtualStart + 1;
    }

    @Override
    public int position() {
        return byteBuffer.position() - virtualStart;
    }

    @Override
    public void setPosition(int position) {
        // virtual to real
        position += virtualStart;
        if (position > virtualLimit)
            throw new IllegalArgumentException();
        byteBuffer.position(position);
    }

    @Override
    protected int byteBufferDataStart() {
        return virtualStart;
    }

    @Override
    public void reset() {
        setPosition(virtualStart);
    }

    @Override
    public ByteBuffer getByteBuffer() {
        return ByteBuffer.wrap(byteBuffer.array(), virtualStart, size());
    }
}
