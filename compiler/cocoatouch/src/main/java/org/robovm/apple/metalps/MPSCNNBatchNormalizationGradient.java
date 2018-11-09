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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNBatchNormalizationGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNGradientKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNBatchNormalizationGradientPtr extends Ptr<MPSCNNBatchNormalizationGradient, MPSCNNBatchNormalizationGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNBatchNormalizationGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNBatchNormalizationGradient() {}
    protected MPSCNNBatchNormalizationGradient(Handle h, long handle) { super(h, handle); }
    protected MPSCNNBatchNormalizationGradient(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithDevice:fusedNeuronDescriptor:")
    public MPSCNNBatchNormalizationGradient(MTLDevice device, MPSNNNeuronDescriptor fusedNeuronDescriptor) { super((SkipInit) null); initObject(init(device, fusedNeuronDescriptor)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNBatchNormalizationGradient(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithDevice:")
    public MPSCNNBatchNormalizationGradient(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:")
    public MPSCNNBatchNormalizationGradient(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithDevice:fusedNeuronDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSNNNeuronDescriptor fusedNeuronDescriptor);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceGradient:sourceImage:batchNormalizationState:destinationGradient:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceGradient, MPSImage sourceImage, MPSCNNBatchNormalizationState batchNormalizationState, MPSImage destinationGradient);
    @Method(selector = "encodeBatchToCommandBuffer:sourceGradients:sourceImages:batchNormalizationState:destinationGradients:")
    public native void encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceGradients, NSArray<MPSImage> sourceImages, MPSCNNBatchNormalizationState batchNormalizationState, NSArray<MPSImage> destinationGradients);
    @Method(selector = "encodeToCommandBuffer:sourceGradient:sourceImage:batchNormalizationState:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage sourceGradient, MPSImage sourceImage, MPSCNNBatchNormalizationState batchNormalizationState);
    @Method(selector = "encodeBatchToCommandBuffer:sourceGradients:sourceImages:batchNormalizationState:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceGradients, NSArray<MPSImage> sourceImages, MPSCNNBatchNormalizationState batchNormalizationState);
    /*</methods>*/
}
