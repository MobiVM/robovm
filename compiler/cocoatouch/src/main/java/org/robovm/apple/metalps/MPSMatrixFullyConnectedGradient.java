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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixFullyConnectedGradient/*</name>*/ 
    extends /*<extends>*/MPSMatrixBinaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixFullyConnectedGradientPtr extends Ptr<MPSMatrixFullyConnectedGradient, MPSMatrixFullyConnectedGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixFullyConnectedGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixFullyConnectedGradient() {}
    protected MPSMatrixFullyConnectedGradient(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixFullyConnectedGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSMatrixFullyConnectedGradient(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixFullyConnectedGradient(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixFullyConnectedGradient(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceNumberOfFeatureVectors")
    public native @MachineSizedUInt long getSourceNumberOfFeatureVectors();
    @Property(selector = "setSourceNumberOfFeatureVectors:")
    public native void setSourceNumberOfFeatureVectors(@MachineSizedUInt long v);
    @Property(selector = "sourceOutputFeatureChannels")
    public native @MachineSizedUInt long getSourceOutputFeatureChannels();
    @Property(selector = "setSourceOutputFeatureChannels:")
    public native void setSourceOutputFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "sourceInputFeatureChannels")
    public native @MachineSizedUInt long getSourceInputFeatureChannels();
    @Property(selector = "setSourceInputFeatureChannels:")
    public native void setSourceInputFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "alpha")
    public native double getAlpha();
    @Property(selector = "setAlpha:")
    public native void setAlpha(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "encodeGradientForDataToCommandBuffer:gradientMatrix:weightMatrix:resultGradientForDataMatrix:")
    public native void encodeGradient(MTLCommandBuffer commandBuffer, MPSMatrix gradientMatrix, MPSMatrix weightMatrix, MPSMatrix resultGradientForDataMatrix);
    @Method(selector = "encodeGradientForWeightsAndBiasToCommandBuffer:gradientMatrix:inputMatrix:resultGradientForWeightMatrix:resultGradientForBiasVector:")
    public native void encodeGradient(MTLCommandBuffer commandBuffer, MPSMatrix gradientMatrix, MPSMatrix inputMatrix, MPSMatrix resultGradientForWeightMatrix, MPSVector resultGradientForBiasVector);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSMatrixFullyConnectedGradient copy(NSZone zone, MTLDevice device);
    /*</methods>*/
}
