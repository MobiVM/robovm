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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixBatchNormalization/*</name>*/ 
    extends /*<extends>*/MPSMatrixUnaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixBatchNormalizationPtr extends Ptr<MPSMatrixBatchNormalization, MPSMatrixBatchNormalizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixBatchNormalization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixBatchNormalization() {}
    protected MPSMatrixBatchNormalization(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixBatchNormalization(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSMatrixBatchNormalization(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixBatchNormalization(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixBatchNormalization(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceNumberOfFeatureVectors")
    public native @MachineSizedUInt long getSourceNumberOfFeatureVectors();
    @Property(selector = "setSourceNumberOfFeatureVectors:")
    public native void setSourceNumberOfFeatureVectors(@MachineSizedUInt long v);
    @Property(selector = "sourceInputFeatureChannels")
    public native @MachineSizedUInt long getSourceInputFeatureChannels();
    @Property(selector = "setSourceInputFeatureChannels:")
    public native void setSourceInputFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "setEpsilon:")
    public native void setEpsilon(float v);
    @Property(selector = "computeStatistics")
    public native boolean isComputeStatistics();
    @Property(selector = "setComputeStatistics:")
    public native void setComputeStatistics(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setNeuronType:parameterA:parameterB:parameterC:")
    public native void setNeuronType(MPSCNNNeuronType neuronType, float parameterA, float parameterB, float parameterC);
    @Method(selector = "neuronType")
    public native MPSCNNNeuronType neuronType();
    @Method(selector = "neuronParameterA")
    public native float neuronParameterA();
    @Method(selector = "neuronParameterB")
    public native float neuronParameterB();
    @Method(selector = "neuronParameterC")
    public native float neuronParameterC();
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:inputMatrix:meanVector:varianceVector:gammaVector:betaVector:resultMatrix:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix, MPSVector meanVector, MPSVector varianceVector, MPSVector gammaVector, MPSVector betaVector, MPSMatrix resultMatrix);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSMatrixBatchNormalization copy(NSZone zone, MTLDevice device);
    /*</methods>*/
}
