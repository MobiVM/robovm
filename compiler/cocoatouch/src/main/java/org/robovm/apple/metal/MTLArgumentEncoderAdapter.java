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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLArgumentEncoderAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLArgumentEncoder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("device")
    public MTLDevice getDevice() { return null; }
    @NotImplemented("label")
    public String getLabel() { return null; }
    @NotImplemented("setLabel:")
    public void setLabel(String v) {}
    @NotImplemented("encodedLength")
    public @MachineSizedUInt long getEncodedLength() { return 0; }
    @NotImplemented("alignment")
    public @MachineSizedUInt long getAlignment() { return 0; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setArgumentBuffer:offset:")
    public void setArgumentBuffer(MTLBuffer argumentBuffer, @MachineSizedUInt long offset) {}
    @NotImplemented("setArgumentBuffer:startOffset:arrayElement:")
    public void setArgumentBuffer(MTLBuffer argumentBuffer, @MachineSizedUInt long startOffset, @MachineSizedUInt long arrayElement) {}
    @NotImplemented("setBuffer:offset:atIndex:")
    public void setBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index) {}
    @NotImplemented("setBuffers:offsets:withRange:")
    public void setBuffers(MTLBuffer buffers, MachineSizedUIntPtr offsets, @ByVal NSRange range) {}
    @NotImplemented("setTexture:atIndex:")
    public void setTexture(MTLTexture texture, @MachineSizedUInt long index) {}
    @NotImplemented("setTextures:withRange:")
    public void setTextures(MTLTexture textures, @ByVal NSRange range) {}
    @NotImplemented("setSamplerState:atIndex:")
    public void setSamplerState(MTLSamplerState sampler, @MachineSizedUInt long index) {}
    @NotImplemented("setSamplerStates:withRange:")
    public void setSamplerStates(MTLSamplerState samplers, @ByVal NSRange range) {}
    @NotImplemented("constantDataAtIndex:")
    public VoidPtr constantDataAtIndex(@MachineSizedUInt long index) { return null; }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("setIndirectCommandBuffer:atIndex:")
    public void setIndirectCommandBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, @MachineSizedUInt long index) {}
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("setIndirectCommandBuffers:withRange:")
    public void setIndirectCommandBuffers(MTLIndirectCommandBuffer buffers, @ByVal NSRange range) {}
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("newArgumentEncoderForBufferAtIndex:")
    public MTLArgumentEncoder newArgumentEncoderForBufferAtIndex(@MachineSizedUInt long index) { return null; }
    /*</methods>*/
}
