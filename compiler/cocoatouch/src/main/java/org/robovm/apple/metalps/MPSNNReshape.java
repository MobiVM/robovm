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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNReshape/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNReshapePtr extends Ptr<MPSNNReshape, MPSNNReshapePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNReshape.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNReshape() {}
    protected MPSNNReshape(Handle h, long handle) { super(h, handle); }
    protected MPSNNReshape(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSNNReshape(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNNReshape(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNNReshape(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "encodeToCommandBuffer:sourceImage:reshapedWidth:reshapedHeight:reshapedFeatureChannels:")
    public native MPSImage encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSImage sourceImage, @MachineSizedUInt long reshapedWidth, @MachineSizedUInt long reshapedHeight, @MachineSizedUInt long reshapedFeatureChannels);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "encodeToCommandBuffer:sourceImage:destinationState:destinationStateIsTemporary:reshapedWidth:reshapedHeight:reshapedFeatureChannels:")
    public native MPSImage encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSState.MPSStatePtr outState, boolean isTemporary, @MachineSizedUInt long reshapedWidth, @MachineSizedUInt long reshapedHeight, @MachineSizedUInt long reshapedFeatureChannels);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:reshapedWidth:reshapedHeight:reshapedFeatureChannels:")
    public native NSArray<MPSImage> encodeBatchToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, @MachineSizedUInt long reshapedWidth, @MachineSizedUInt long reshapedHeight, @MachineSizedUInt long reshapedFeatureChannels);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:destinationStates:destinationStateIsTemporary:reshapedWidth:reshapedHeight:reshapedFeatureChannels:")
    public native NSArray<MPSImage> encodeBatchToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, NSArray.NSArrayPtr<? extends MPSState> outStates, boolean isTemporary, @MachineSizedUInt long reshapedWidth, @MachineSizedUInt long reshapedHeight, @MachineSizedUInt long reshapedFeatureChannels);
    /*</methods>*/
}
