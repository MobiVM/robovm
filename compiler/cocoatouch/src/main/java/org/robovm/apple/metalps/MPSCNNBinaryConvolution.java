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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNBinaryConvolution/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNBinaryConvolutionPtr extends Ptr<MPSCNNBinaryConvolution, MPSCNNBinaryConvolutionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNBinaryConvolution.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNBinaryConvolution() {}
    protected MPSCNNBinaryConvolution(Handle h, long handle) { super(h, handle); }
    protected MPSCNNBinaryConvolution(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:convolutionData:scaleValue:type:flags:")
    public MPSCNNBinaryConvolution(MTLDevice device, MPSCNNConvolutionDataSource convolutionData, float scaleValue, MPSCNNBinaryConvolutionType type, MPSCNNBinaryConvolutionFlags flags) { super((SkipInit) null); initObject(init(device, convolutionData, scaleValue, type, flags)); }
    @Method(selector = "initWithDevice:convolutionData:outputBiasTerms:outputScaleTerms:inputBiasTerms:inputScaleTerms:type:flags:")
    public MPSCNNBinaryConvolution(MTLDevice device, MPSCNNConvolutionDataSource convolutionData, FloatPtr outputBiasTerms, FloatPtr outputScaleTerms, FloatPtr inputBiasTerms, FloatPtr inputScaleTerms, MPSCNNBinaryConvolutionType type, MPSCNNBinaryConvolutionFlags flags) { super((SkipInit) null); initObject(init(device, convolutionData, outputBiasTerms, outputScaleTerms, inputBiasTerms, inputScaleTerms, type, flags)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNBinaryConvolution(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNBinaryConvolution(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputFeatureChannels")
    public native @MachineSizedUInt long getInputFeatureChannels();
    @Property(selector = "outputFeatureChannels")
    public native @MachineSizedUInt long getOutputFeatureChannels();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:convolutionData:scaleValue:type:flags:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDataSource convolutionData, float scaleValue, MPSCNNBinaryConvolutionType type, MPSCNNBinaryConvolutionFlags flags);
    @Method(selector = "initWithDevice:convolutionData:outputBiasTerms:outputScaleTerms:inputBiasTerms:inputScaleTerms:type:flags:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDataSource convolutionData, FloatPtr outputBiasTerms, FloatPtr outputScaleTerms, FloatPtr inputBiasTerms, FloatPtr inputScaleTerms, MPSCNNBinaryConvolutionType type, MPSCNNBinaryConvolutionFlags flags);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    /*</methods>*/
}
