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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNDropout/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNDropoutPtr extends Ptr<MPSCNNDropout, MPSCNNDropoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNDropout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNDropout() {}
    protected MPSCNNDropout(Handle h, long handle) { super(h, handle); }
    protected MPSCNNDropout(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNDropout(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithDevice:keepProbability:seed:maskStrideInPixels:")
    public MPSCNNDropout(MTLDevice device, float keepProbability, @MachineSizedUInt long seed, @ByVal MTLSize maskStrideInPixels) { super((SkipInit) null); initObject(init(device, keepProbability, seed, maskStrideInPixels)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNDropout(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keepProbability")
    public native float getKeepProbability();
    @Property(selector = "seed")
    public native @MachineSizedUInt long getSeed();
    @Property(selector = "maskStrideInPixels")
    public native @ByVal MTLSize getMaskStrideInPixels();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "initWithDevice:keepProbability:seed:maskStrideInPixels:")
    protected native @Pointer long init(MTLDevice device, float keepProbability, @MachineSizedUInt long seed, @ByVal MTLSize maskStrideInPixels);
    @Method(selector = "resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNDropoutGradientState getResultState(MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    @Method(selector = "resultStateBatchForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNDropoutGradientState getResultStateBatchEx(NSArray<MPSImage> sourceImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    @Method(selector = "temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNDropoutGradientState getTemporaryResult(MTLCommandBuffer commandBuffer, MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    @Method(selector = "temporaryResultStateBatchForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native NSArray<MPSCNNDropoutGradientState> getTemporaryResultStateBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    /*</methods>*/
}
