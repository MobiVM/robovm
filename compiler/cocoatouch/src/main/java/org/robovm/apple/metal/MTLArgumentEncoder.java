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
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLArgumentEncoder/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "device")
    MTLDevice getDevice();
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "setLabel:")
    void setLabel(String v);
    @Property(selector = "encodedLength")
    @MachineSizedUInt long getEncodedLength();
    @Property(selector = "alignment")
    @MachineSizedUInt long getAlignment();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setArgumentBuffer:offset:")
    void setArgumentBuffer(MTLBuffer argumentBuffer, @MachineSizedUInt long offset);
    @Method(selector = "setArgumentBuffer:startOffset:arrayElement:")
    void setArgumentBuffer(MTLBuffer argumentBuffer, @MachineSizedUInt long startOffset, @MachineSizedUInt long arrayElement);
    @Method(selector = "setBuffer:offset:atIndex:")
    void setBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "setBuffers:offsets:withRange:")
    void setBuffers(MTLBuffer buffers, MachineSizedUIntPtr offsets, @ByVal NSRange range);
    @Method(selector = "setTexture:atIndex:")
    void setTexture(MTLTexture texture, @MachineSizedUInt long index);
    @Method(selector = "setTextures:withRange:")
    void setTextures(MTLTexture textures, @ByVal NSRange range);
    @Method(selector = "setSamplerState:atIndex:")
    void setSamplerState(MTLSamplerState sampler, @MachineSizedUInt long index);
    @Method(selector = "setSamplerStates:withRange:")
    void setSamplerStates(MTLSamplerState samplers, @ByVal NSRange range);
    @Method(selector = "constantDataAtIndex:")
    VoidPtr constantDataAtIndex(@MachineSizedUInt long index);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "setIndirectCommandBuffer:atIndex:")
    void setIndirectCommandBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, @MachineSizedUInt long index);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "setIndirectCommandBuffers:withRange:")
    void setIndirectCommandBuffers(MTLIndirectCommandBuffer buffers, @ByVal NSRange range);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newArgumentEncoderForBufferAtIndex:")
    MTLArgumentEncoder newArgumentEncoderForBufferAtIndex(@MachineSizedUInt long index);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
