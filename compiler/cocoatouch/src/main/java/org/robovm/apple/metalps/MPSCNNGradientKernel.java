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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNGradientKernel/*</name>*/ 
    extends /*<extends>*/MPSCNNBinaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNGradientKernelPtr extends Ptr<MPSCNNGradientKernel, MPSCNNGradientKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNGradientKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNGradientKernel() {}
    protected MPSCNNGradientKernel(Handle h, long handle) { super(h, handle); }
    protected MPSCNNGradientKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSCNNGradientKernel(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNGradientKernel(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNGradientKernel(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kernelOffsetX")
    public native @MachineSizedSInt long getKernelOffsetX();
    @Property(selector = "setKernelOffsetX:")
    public native void setKernelOffsetX(@MachineSizedSInt long v);
    @Property(selector = "kernelOffsetY")
    public native @MachineSizedSInt long getKernelOffsetY();
    @Property(selector = "setKernelOffsetY:")
    public native void setKernelOffsetY(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceGradient:sourceImage:gradientState:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage sourceGradient, MPSImage sourceImage, MPSState gradientState);
    @Method(selector = "encodeToCommandBuffer:sourceGradient:sourceImage:gradientState:destinationGradient:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceGradient, MPSImage sourceImage, MPSState gradientState, MPSImage destinationGradient);
    @Method(selector = "encodeBatchToCommandBuffer:sourceGradients:sourceImages:gradientStates:")
    public native NSArray<MPSImage> encodeBatchGradients(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceGradients, NSArray<MPSImage> sourceImages, NSArray<? extends MPSState> gradientStates);
    @Method(selector = "encodeBatchToCommandBuffer:sourceGradients:sourceImages:gradientStates:destinationGradients:")
    public native void encodeBatchGradients(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceGradients, NSArray<MPSImage> sourceImages, NSArray<? extends MPSState> gradientStates, NSArray<MPSImage> destinationGradients);
    /*</methods>*/
}
