/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coreaudio;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioBufferList/*</name>*/ 
    extends /*<extends>*/Struct<AudioBufferList>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioBufferListPtr extends Ptr<AudioBufferList, AudioBufferListPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/

    public AudioBufferList(int bufferCount) {
        // pre-allocate space for this struct + required number of audio buffers
        super(VM.allocateMemory(sizeOf() + (bufferCount - 1) * AudioBuffer.sizeOf()));
        setNumberBuffers(bufferCount);
    }

    public AudioBufferList(AudioBuffer... buffers) {
        this(buffers.length);
        this.getBuffers0().update(buffers);
    }

    /*<properties>*//*</properties>*/
    public int getBufferCount() {
        return getNumberBuffers();
    }
    
    public AudioBuffer getBuffer(int index) {
        if (index >= getBufferCount()) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return getBuffers0().next(index);
    }

    public AudioBufferList setBuffer(int index, AudioBuffer buffer) {
        if (index >= getBufferCount()) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        getBuffers0().next(index).update(buffer);
        return this;
    }

    public AudioBuffer[] getBuffers() {
        return getBuffers0().toArray(this.getBufferCount());
    }

    public AudioBufferList setBuffers(AudioBuffer[] buffers) {
        if (buffers.length > getBufferCount()) {
            throw new ArrayIndexOutOfBoundsException(buffers.length);
        }
        this.setNumberBuffers(buffers.length);
        getBuffers0().update(buffers);
        return this;
    }

    /*<members>*/
    @StructMember(0) protected native int getNumberBuffers();
    @StructMember(0) protected native AudioBufferList setNumberBuffers(int numberBuffers);
    @StructMember(1) protected native @Array({1}) AudioBuffer getBuffers0();
    /*</members>*/
    /*<methods>*//*</methods>*/
}
