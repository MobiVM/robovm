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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNFullyConnected/*</name>*/ 
    extends /*<extends>*/MPSCNNConvolution/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNFullyConnectedPtr extends Ptr<MPSCNNFullyConnected, MPSCNNFullyConnectedPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNFullyConnected.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNFullyConnected() {}
    protected MPSCNNFullyConnected(Handle h, long handle) { super(h, handle); }
    protected MPSCNNFullyConnected(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:weights:")
    public MPSCNNFullyConnected(MTLDevice device, MPSCNNConvolutionDataSource weights) { super((SkipInit) null); initObject(init(device, weights)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "initWithDevice:convolutionDescriptor:kernelWeights:biasTerms:flags:")
    public MPSCNNFullyConnected(MTLDevice device, MPSCNNConvolutionDescriptor convolutionDescriptor, FloatPtr kernelWeights, FloatPtr biasTerms, MPSCNNConvolutionFlags flags) { super((SkipInit) null); initObject(init(device, convolutionDescriptor, kernelWeights, biasTerms, flags)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSCNNFullyConnected(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNFullyConnected(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:weights:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDataSource weights);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "initWithDevice:convolutionDescriptor:kernelWeights:biasTerms:flags:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDescriptor convolutionDescriptor, FloatPtr kernelWeights, FloatPtr biasTerms, MPSCNNConvolutionFlags flags);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    /*</methods>*/
}
