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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLResourceStateCommandEncoderAdapter/*</name>*/ 
    extends /*<extends>*/MTLCommandEncoderAdapter/*</extends>*/ 
    /*<implements>*/implements MTLResourceStateCommandEncoder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("updateTextureMappings:mode:regions:mipLevels:slices:numRegions:")
    public void updateTextureMappings(MTLTexture texture, MTLSparseTextureMappingMode mode, MTLRegion regions, MachineSizedUIntPtr mipLevels, MachineSizedUIntPtr slices, @MachineSizedUInt long numRegions) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("updateTextureMapping:mode:region:mipLevel:slice:")
    public void updateTextureMapping(MTLTexture texture, MTLSparseTextureMappingMode mode, @ByVal MTLRegion region, @MachineSizedUInt long mipLevel, @MachineSizedUInt long slice) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("updateTextureMapping:mode:indirectBuffer:indirectBufferOffset:")
    public void updateTextureMapping(MTLTexture texture, MTLSparseTextureMappingMode mode, MTLBuffer indirectBuffer, @MachineSizedUInt long indirectBufferOffset) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("updateFence:")
    public void updateFence(MTLFence fence) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("waitForFence:")
    public void waitForFence(MTLFence fence) {}
    /*</methods>*/
}
