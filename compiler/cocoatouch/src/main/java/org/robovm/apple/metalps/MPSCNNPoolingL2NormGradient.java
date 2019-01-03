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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNPoolingL2NormGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNPoolingGradient/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNPoolingL2NormGradientPtr extends Ptr<MPSCNNPoolingL2NormGradient, MPSCNNPoolingL2NormGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNPoolingL2NormGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNPoolingL2NormGradient() {}
    protected MPSCNNPoolingL2NormGradient(Handle h, long handle) { super(h, handle); }
    protected MPSCNNPoolingL2NormGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public MPSCNNPoolingL2NormGradient(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInPixelsX, @MachineSizedUInt long strideInPixelsY) { super((SkipInit) null); initObject(init(device, kernelWidth, kernelHeight, strideInPixelsX, strideInPixelsY)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNPoolingL2NormGradient(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:")
    public MPSCNNPoolingL2NormGradient(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight) { super(device, kernelWidth, kernelHeight); }
    @Method(selector = "initWithCoder:")
    public MPSCNNPoolingL2NormGradient(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInPixelsX, @MachineSizedUInt long strideInPixelsY);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /*</methods>*/
}
