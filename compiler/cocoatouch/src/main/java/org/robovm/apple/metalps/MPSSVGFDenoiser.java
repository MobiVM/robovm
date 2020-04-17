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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSSVGFDenoiser/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSSVGFDenoiserPtr extends Ptr<MPSSVGFDenoiser, MPSSVGFDenoiserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSSVGFDenoiser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSSVGFDenoiser() {}
    protected MPSSVGFDenoiser(Handle h, long handle) { super(h, handle); }
    protected MPSSVGFDenoiser(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSSVGFDenoiser(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithSVGF:textureAllocator:")
    public MPSSVGFDenoiser(MPSSVGF svgf, MPSSVGFTextureAllocator textureAllocator) { super((SkipInit) null); initObject(init(svgf, textureAllocator)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "svgf")
    public native MPSSVGF getSvgf();
    @Property(selector = "textureAllocator")
    public native MPSSVGFTextureAllocator getTextureAllocator();
    @Property(selector = "bilateralFilterIterations")
    public native @MachineSizedUInt long getBilateralFilterIterations();
    @Property(selector = "setBilateralFilterIterations:")
    public native void setBilateralFilterIterations(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithSVGF:textureAllocator:")
    protected native @Pointer long init(MPSSVGF svgf, MPSSVGFTextureAllocator textureAllocator);
    @Method(selector = "clearTemporalHistory")
    public native void clearTemporalHistory();
    @Method(selector = "releaseTemporaryTextures")
    public native void releaseTemporaryTextures();
    @Method(selector = "encodeToCommandBuffer:sourceTexture:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native MTLTexture encode(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture motionVectorTexture, MTLTexture depthNormalTexture, MTLTexture previousDepthNormalTexture);
    @Method(selector = "encodeToCommandBuffer:sourceTexture:destinationTexture:sourceTexture2:destinationTexture2:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native void encode(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture destinationTexture, MTLTexture sourceTexture2, MTLTexture destinationTexture2, MTLTexture motionVectorTexture, MTLTexture depthNormalTexture, MTLTexture previousDepthNormalTexture);
    /*</methods>*/
}
