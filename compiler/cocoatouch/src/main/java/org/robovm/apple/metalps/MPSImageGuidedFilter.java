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
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageGuidedFilter/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageGuidedFilterPtr extends Ptr<MPSImageGuidedFilter, MPSImageGuidedFilterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageGuidedFilter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageGuidedFilter() {}
    protected MPSImageGuidedFilter(Handle h, long handle) { super(h, handle); }
    protected MPSImageGuidedFilter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:kernelDiameter:")
    public MPSImageGuidedFilter(MTLDevice device, @MachineSizedUInt long kernelDiameter) { super((SkipInit) null); initObject(init(device, kernelDiameter)); }
    @Method(selector = "initWithCoder:device:")
    public MPSImageGuidedFilter(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSImageGuidedFilter(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kernelDiameter")
    public native @MachineSizedUInt long getKernelDiameter();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "setEpsilon:")
    public native void setEpsilon(float v);
    @Property(selector = "reconstructScale")
    public native float getReconstructScale();
    @Property(selector = "setReconstructScale:")
    public native void setReconstructScale(float v);
    @Property(selector = "reconstructOffset")
    public native float getReconstructOffset();
    @Property(selector = "setReconstructOffset:")
    public native void setReconstructOffset(float v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:kernelDiameter:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long kernelDiameter);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "encodeRegressionToCommandBuffer:sourceTexture:guidanceTexture:weightsTexture:destinationCoefficientsTexture:")
    public native void encodeRegression(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture guidanceTexture, MTLTexture weightsTexture, MTLTexture destinationCoefficientsTexture);
    @Method(selector = "encodeReconstructionToCommandBuffer:guidanceTexture:coefficientsTexture:destinationTexture:")
    public native void encodeReconstruction(MTLCommandBuffer commandBuffer, MTLTexture guidanceTexture, MTLTexture coefficientsTexture, MTLTexture destinationTexture);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "encodeRegressionToCommandBuffer:sourceTexture:guidanceTexture:weightsTexture:destinationCoefficientsTextureA:destinationCoefficientsTextureB:")
    public native void encodeRegression(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture guidanceTexture, MTLTexture weightsTexture, MTLTexture destinationCoefficientsTextureA, MTLTexture destinationCoefficientsTextureB);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "encodeReconstructionToCommandBuffer:guidanceTexture:coefficientsTextureA:coefficientsTextureB:destinationTexture:")
    public native void encodeReconstruction(MTLCommandBuffer commandBuffer, MTLTexture guidanceTexture, MTLTexture coefficientsTextureA, MTLTexture coefficientsTextureB, MTLTexture destinationTexture);
    /*</methods>*/
}
