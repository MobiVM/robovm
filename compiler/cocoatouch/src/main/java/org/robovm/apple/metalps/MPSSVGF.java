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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSSVGF/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MPSSVGFPtr extends Ptr<MPSSVGF, MPSSVGFPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSSVGF.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSSVGF() {}
    protected MPSSVGF(Handle h, long handle) { super(h, handle); }
    protected MPSSVGF(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSSVGF(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSSVGF(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSSVGF(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "depthWeight")
    public native float getDepthWeight();
    @Property(selector = "setDepthWeight:")
    public native void setDepthWeight(float v);
    @Property(selector = "normalWeight")
    public native float getNormalWeight();
    @Property(selector = "setNormalWeight:")
    public native void setNormalWeight(float v);
    @Property(selector = "luminanceWeight")
    public native float getLuminanceWeight();
    @Property(selector = "setLuminanceWeight:")
    public native void setLuminanceWeight(float v);
    @Property(selector = "temporalWeighting")
    public native MPSTemporalWeighting getTemporalWeighting();
    @Property(selector = "setTemporalWeighting:")
    public native void setTemporalWeighting(MPSTemporalWeighting v);
    @Property(selector = "temporalReprojectionBlendFactor")
    public native float getTemporalReprojectionBlendFactor();
    @Property(selector = "setTemporalReprojectionBlendFactor:")
    public native void setTemporalReprojectionBlendFactor(float v);
    @Property(selector = "reprojectionThreshold")
    public native float getReprojectionThreshold();
    @Property(selector = "setReprojectionThreshold:")
    public native void setReprojectionThreshold(float v);
    @Property(selector = "minimumFramesForVarianceEstimation")
    public native @MachineSizedUInt long getMinimumFramesForVarianceEstimation();
    @Property(selector = "setMinimumFramesForVarianceEstimation:")
    public native void setMinimumFramesForVarianceEstimation(@MachineSizedUInt long v);
    @Property(selector = "varianceEstimationRadius")
    public native @MachineSizedUInt long getVarianceEstimationRadius();
    @Property(selector = "setVarianceEstimationRadius:")
    public native void setVarianceEstimationRadius(@MachineSizedUInt long v);
    @Property(selector = "varianceEstimationSigma")
    public native float getVarianceEstimationSigma();
    @Property(selector = "setVarianceEstimationSigma:")
    public native void setVarianceEstimationSigma(float v);
    @Property(selector = "variancePrefilterSigma")
    public native float getVariancePrefilterSigma();
    @Property(selector = "setVariancePrefilterSigma:")
    public native void setVariancePrefilterSigma(float v);
    @Property(selector = "variancePrefilterRadius")
    public native @MachineSizedUInt long getVariancePrefilterRadius();
    @Property(selector = "setVariancePrefilterRadius:")
    public native void setVariancePrefilterRadius(@MachineSizedUInt long v);
    @Property(selector = "bilateralFilterSigma")
    public native float getBilateralFilterSigma();
    @Property(selector = "setBilateralFilterSigma:")
    public native void setBilateralFilterSigma(float v);
    @Property(selector = "bilateralFilterRadius")
    public native @MachineSizedUInt long getBilateralFilterRadius();
    @Property(selector = "setBilateralFilterRadius:")
    public native void setBilateralFilterRadius(@MachineSizedUInt long v);
    @Property(selector = "channelCount")
    public native @MachineSizedUInt long getChannelCount();
    @Property(selector = "setChannelCount:")
    public native void setChannelCount(@MachineSizedUInt long v);
    @Property(selector = "channelCount2")
    public native @MachineSizedUInt long getChannelCount2();
    @Property(selector = "setChannelCount2:")
    public native void setChannelCount2(@MachineSizedUInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSSVGF copy(NSZone zone, MTLDevice device);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "encodeReprojectionToCommandBuffer:sourceTexture:previousTexture:destinationTexture:previousLuminanceMomentsTexture:destinationLuminanceMomentsTexture:previousFrameCountTexture:destinationFrameCountTexture:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native void encodeReprojection(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture previousTexture, MTLTexture destinationTexture, MTLTexture previousLuminanceMomentsTexture, MTLTexture destinationLuminanceMomentsTexture, MTLTexture previousFrameCountTexture, MTLTexture destinationFrameCountTexture, MTLTexture motionVectorTexture, MTLTexture depthNormalTexture, MTLTexture previousDepthNormalTexture);
    @Method(selector = "encodeReprojectionToCommandBuffer:sourceTexture:previousTexture:destinationTexture:previousLuminanceMomentsTexture:destinationLuminanceMomentsTexture:sourceTexture2:previousTexture2:destinationTexture2:previousLuminanceMomentsTexture2:destinationLuminanceMomentsTexture2:previousFrameCountTexture:destinationFrameCountTexture:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native void encodeReprojectionToCommandBuffer$sourceTexture$previousTexture$destinationTexture$previousLuminanceMomentsTexture$destinationLuminanceMomentsTexture$sourceTexture2$previousTexture2$destinationTexture2$previousLuminanceMomentsTexture2$destinationLuminanceMomentsTexture2$previousFrameCountTexture$destinationFrameCountTexture$motionVectorTexture$depthNormalTexture$previousDepthNormalTexture$(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture previousTexture, MTLTexture destinationTexture, MTLTexture previousLuminanceMomentsTexture, MTLTexture destinationLuminanceMomentsTexture, MTLTexture sourceTexture2, MTLTexture previousTexture2, MTLTexture destinationTexture2, MTLTexture previousLuminanceMomentsTexture2, MTLTexture destinationLuminanceMomentsTexture2, MTLTexture previousFrameCountTexture, MTLTexture destinationFrameCountTexture, MTLTexture motionVectorTexture, MTLTexture depthNormalTexture, MTLTexture previousDepthNormalTexture);
    @Method(selector = "encodeVarianceEstimationToCommandBuffer:sourceTexture:luminanceMomentsTexture:destinationTexture:frameCountTexture:depthNormalTexture:")
    public native void encodeVarianceEstimation(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture luminanceMomentsTexture, MTLTexture destinationTexture, MTLTexture frameCountTexture, MTLTexture depthNormalTexture);
    @Method(selector = "encodeVarianceEstimationToCommandBuffer:sourceTexture:luminanceMomentsTexture:destinationTexture:sourceTexture2:luminanceMomentsTexture2:destinationTexture2:frameCountTexture:depthNormalTexture:")
    public native void encodeVarianceEstimation(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture luminanceMomentsTexture, MTLTexture destinationTexture, MTLTexture sourceTexture2, MTLTexture luminanceMomentsTexture2, MTLTexture destinationTexture2, MTLTexture frameCountTexture, MTLTexture depthNormalTexture);
    @Method(selector = "encodeBilateralFilterToCommandBuffer:stepDistance:sourceTexture:destinationTexture:depthNormalTexture:")
    public native void encodeBilateralFilter(MTLCommandBuffer commandBuffer, @MachineSizedUInt long stepDistance, MTLTexture sourceTexture, MTLTexture destinationTexture, MTLTexture depthNormalTexture);
    @Method(selector = "encodeBilateralFilterToCommandBuffer:stepDistance:sourceTexture:destinationTexture:sourceTexture2:destinationTexture2:depthNormalTexture:")
    public native void encodeBilateralFilter(MTLCommandBuffer commandBuffer, @MachineSizedUInt long stepDistance, MTLTexture sourceTexture, MTLTexture destinationTexture, MTLTexture sourceTexture2, MTLTexture destinationTexture2, MTLTexture depthNormalTexture);
    /*</methods>*/
}
